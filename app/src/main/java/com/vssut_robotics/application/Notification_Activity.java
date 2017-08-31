package com.vssut_robotics.application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseListAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Notification_Activity extends AppCompatActivity {

    private ListView mListview;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_);

        mListview=(ListView)findViewById(R.id.listview_notification);


        DatabaseReference databaseReference=FirebaseDatabase.getInstance().getReferenceFromUrl("https://vssut-robotics.firebaseio.com/notification");
        if (databaseReference !=null) {
            FirebaseListAdapter<String> firebaseListAdapter = new FirebaseListAdapter<String>(
                    this,
                    String.class,
                    android.R.layout.simple_list_item_1,
                    databaseReference
            ) {
                @Override
                protected void populateView(View v, String model, int position) {
                    TextView textView = (TextView) v.findViewById(android.R.id.text1);
                    textView.setText(model);

                }
            };
            mListview.setAdapter(firebaseListAdapter);

        }

    }
}
