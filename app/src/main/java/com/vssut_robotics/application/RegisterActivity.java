package com.vssut_robotics.application;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class RegisterActivity extends AppCompatActivity {
    private EditText mNameField;
    private EditText mEmailField;
    private EditText mPasswordField;
    private EditText mPasswordField1;
    private Button mRegiterBtn;
    private FirebaseAuth mAuth;
    private ProgressDialog mProgress;
    private DatabaseReference mDatabase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

       mAuth=FirebaseAuth.getInstance();
        mProgress=new ProgressDialog(this);

        mEmailField=(EditText)findViewById(R.id.emailField);
        mNameField=(EditText)findViewById(R.id.nameField);
        mPasswordField=(EditText)findViewById(R.id.passwordField);
        mPasswordField1=(EditText)findViewById(R.id.passwordfield1);
        mRegiterBtn=(Button)findViewById(R.id.registerBtn);



        mDatabase= FirebaseDatabase.getInstance().getReference().child("Users");



        mRegiterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 startRegister();
            }
        });
    }

    private void startSetupAcct(String name, String user_id, String email) {

                    DatabaseReference mDatabaseUsers = FirebaseDatabase.getInstance().getReference().child("User details");

                    String DownloadUri="https://firebasestorage.googleapis.com/v0/b/welcomeanimationapp.appspot.com/o/Cartoon_Robot.png?alt=media&token=097d15d1-f607-476d-a5b7-404e0872da62";
                    DatabaseReference current_user=mDatabaseUsers.child(user_id);
                    current_user.child("name").setValue(name);
                    current_user.child("mobile").setValue("+91 ");
                    current_user.child("image").setValue(DownloadUri);

    }


    private void startRegister() {
        final String name=mNameField.getText().toString().trim();
        final String email=mEmailField.getText().toString().trim();
        String password=mPasswordField.getText().toString().trim();
        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
        String password1=mPasswordField1.getText().toString().trim();
        if(!TextUtils.isEmpty(name)&& !TextUtils.isEmpty(email)&& !TextUtils.isEmpty(password) && !TextUtils.isEmpty(password1)) {
            if (email.matches(emailPattern)) {
                if (mPasswordField.getText().toString().equals(mPasswordField1.getText().toString())) {
                    mProgress.setMessage("Signing up....");
                    mProgress.show();
                    mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {


                                gtnotify();

                                String user_id = mAuth.getCurrentUser().getUid();
                                DatabaseReference current_user_db = mDatabase.child(user_id);
                                current_user_db.child("name").setValue(name);
                                current_user_db.child("image").setValue("default");
                                mProgress.dismiss();

                                storeDataOffline();
                                startSetupAcct(name, user_id, email); //store the data into user details of firebase
                                Intent mainIntent = new Intent(RegisterActivity.this, MainActivity.class);
                                mainIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                startActivity(mainIntent);


                            }
                        }
                    });
                } else {
                    Toast.makeText(RegisterActivity.this, "passwords are not matching", Toast.LENGTH_SHORT).show();
                }
            }else {
                Toast.makeText(RegisterActivity.this, "invalid Email Address", Toast.LENGTH_SHORT).show();
            }
         }else{
            Toast.makeText(RegisterActivity.this, "Fields are missing", Toast.LENGTH_SHORT).show();
        }
        }

    private void gtnotify() {

            NotificationManager notificationmgr=(NotificationManager)getSystemService(NOTIFICATION_SERVICE);
            Notification notif=new Notification.Builder(this)
                    .setSmallIcon(R.mipmap.notif_icon)
                    .setContentTitle("VSSUT Robotics")
                    .setContentText("welcome to VSSUT robotics")
                    .build();
            notificationmgr.notify(0,notif);

    }



    private void storeDataOffline() {

        final String name=mNameField.getText().toString().trim();
        final String email=mEmailField.getText().toString().trim();

        SharedPreferences sharedPreferences_profile = getSharedPreferences(SetupActivity.MyPREFERENCES, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences_profile.edit();
        editor.putString("LOCAL-name",name);
        editor.putString("LOCAL-phone",email);
        editor.apply();

    }

}

