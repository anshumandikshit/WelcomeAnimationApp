package com.vssut_robotics.application;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.media.Image;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseListAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.squareup.picasso.Picasso;

import java.util.List;

public class activity_gallery extends AppCompatActivity {


    private WebView mWebview;

    private ImageView imageView1;
    private ImageView imageView2;
    private ImageView imageView3;
    private ImageView imageView4;
    private ImageView imageView5;
    private ImageView imageView6;
    private ImageView imageView7;
    private ImageView imageView8;
    private ImageView imageView9;
    private ImageView imageView10;
    private ImageView imageView11;
    private ImageView imageView12;
    private ImageView imageView13;
    private ImageView imageView14;
    private ImageView imageView15;
    private ImageView imageView16;
    private ImageView imageView17;
    private ImageView imageView18;
    private ImageView imageView19;
    private ImageView imageView20;
    private ImageView imageView21;
    private ImageView imageView22;
    private ImageView imageView23;
    private ImageView imageView24;
    private ImageView imageView25;
    private ImageView imageView26;
    private ImageView imageView27;
    private ImageView imageView28;
    private ImageView imageView29;
    private ImageView imageView30;







    //private  String url="http://www.vssutrobotics.in/gallery";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_gallery_layout);


        imageView1=(ImageView)findViewById(R.id.imageview_gallery1) ;
        imageView2=(ImageView)findViewById(R.id.imageview_gallery2);
        imageView3=(ImageView)findViewById(R.id.imageview_gallery3);
        imageView4=(ImageView)findViewById(R.id.imageview_gallery4);
        imageView5=(ImageView)findViewById(R.id.imageview_gallery5);
        imageView6=(ImageView)findViewById(R.id.imageview_gallery6);
        imageView7=(ImageView)findViewById(R.id.imageview_gallery7);
        imageView8=(ImageView)findViewById(R.id.imageview_gallery8);
        imageView9=(ImageView)findViewById(R.id.imageview_gallery9);
        imageView10=(ImageView)findViewById(R.id.imageview_gallery10);
        imageView11=(ImageView)findViewById(R.id.imageview_gallery11);
        imageView12=(ImageView)findViewById(R.id.imageview_gallery12);
        imageView13=(ImageView)findViewById(R.id.imageview_gallery13);
        imageView14=(ImageView)findViewById(R.id.imageview_gallery14);
        imageView15=(ImageView)findViewById(R.id.imageview_gallery15);
        imageView16=(ImageView)findViewById(R.id.imageview_gallery16);
        imageView17=(ImageView)findViewById(R.id.imageview_gallery17);
        imageView18=(ImageView)findViewById(R.id.imageview_gallery18);
        imageView19=(ImageView)findViewById(R.id.imageview_gallery19);
        imageView20=(ImageView)findViewById(R.id.imageview_gallery20);
        imageView21=(ImageView)findViewById(R.id.imageview_gallery21);
        imageView22=(ImageView)findViewById(R.id.imageview_gallery22);
        imageView23=(ImageView)findViewById(R.id.imageview_gallery23);
        imageView24=(ImageView)findViewById(R.id.imageview_gallery24);
        imageView25=(ImageView)findViewById(R.id.imageview_gallery25);
        imageView26=(ImageView)findViewById(R.id.imageview_gallery26);
        imageView27=(ImageView)findViewById(R.id.imageview_gallery27);
        imageView28=(ImageView)findViewById(R.id.imageview_gallery28);
        imageView29=(ImageView)findViewById(R.id.imageview_gallery29);
        imageView30=(ImageView)findViewById(R.id.imageview_gallery30);


        Picasso.with(getApplicationContext()).load("http://res.cloudinary.com/dkitkexp8/image/upload/v1491880982/11703216_469547623206201_1296310531010507751_n_t0kbcq.jpg").into(imageView1);
        Picasso.with(getApplicationContext()).load("http://res.cloudinary.com/dkitkexp8/image/upload/v1491881096/voice_controlled_bot_kwmihr.jpg").into(imageView2);
        Picasso.with(getApplicationContext()).load("http://res.cloudinary.com/dkitkexp8/image/upload/v1491881078/tricopter_nt67pa.jpg").into(imageView3);
        Picasso.with(getApplicationContext()).load("http://res.cloudinary.com/dkitkexp8/image/upload/v1491881086/selfclimbing_2_r6jgpj.jpg").into(imageView4);
        Picasso.with(getApplicationContext()).load("http://res.cloudinary.com/dkitkexp8/image/upload/v1491881085/self_balancing_1_xg3uwm.jpg").into(imageView5);
        Picasso.with(getApplicationContext()).load("http://res.cloudinary.com/dkitkexp8/image/upload/v1491881070/robo_war_o6uzal.jpg").into(imageView6);
        Picasso.with(getApplicationContext()).load("http://res.cloudinary.com/dkitkexp8/image/upload/v1491881079/quadkopter_1_dtei7a.jpg").into(imageView7);
        Picasso.with(getApplicationContext()).load("http://res.cloudinary.com/dkitkexp8/image/upload/v1491881014/DSC2751_hwhxn4.jpg").into(imageView8);
        Picasso.with(getApplicationContext()).load("http://res.cloudinary.com/dkitkexp8/image/upload/v1491881057/ps2_controlled-bot_v7bpfh.jpg").into(imageView9);
        Picasso.with(getApplicationContext()).load("http://res.cloudinary.com/dkitkexp8/image/upload/v1491881056/line_follower_hrdj1o.jpg").into(imageView10);
        Picasso.with(getApplicationContext()).load("http://res.cloudinary.com/dkitkexp8/image/upload/v1491881049/led_cube_g4c9wf.jpg").into(imageView11);
        Picasso.with(getApplicationContext()).load("http://res.cloudinary.com/dkitkexp8/image/upload/v1491881028/humanoid_2_ryb57c.jpg").into(imageView12);
        Picasso.with(getApplicationContext()).load("http://res.cloudinary.com/dkitkexp8/image/upload/v1491881036/Humanoid_1_ntvpiz.jpg").into(imageView13);
        Picasso.with(getApplicationContext()).load("http://res.cloudinary.com/dkitkexp8/image/upload/v1491881053/DSC2972_pmxpin.jpg").into(imageView14);
        Picasso.with(getApplicationContext()).load("http://res.cloudinary.com/dkitkexp8/image/upload/v1491881013/DSC2929_d0qyx7.jpg").into(imageView15);
        Picasso.with(getApplicationContext()).load("http://res.cloudinary.com/dkitkexp8/image/upload/v1491881014/DSC2751_hwhxn4.jpg").into(imageView16);
        Picasso.with(getApplicationContext()).load("http://res.cloudinary.com/dkitkexp8/image/upload/v1491881049/DSC2242-2_w9q4h7.jpg").into(imageView17);
        Picasso.with(getApplicationContext()).load("http://res.cloudinary.com/dkitkexp8/image/upload/v1491881049/DSC2242-2_w9q4h7.jpg").into(imageView18);
        Picasso.with(getApplicationContext()).load("http://res.cloudinary.com/dkitkexp8/image/upload/v1491881009/DSC_0385-1024x768_zvoxqe.jpg").into(imageView19);
        Picasso.with(getApplicationContext()).load("http://res.cloudinary.com/dkitkexp8/image/upload/v1491880994/Collages2-1024x373_eshnyl.jpg").into(imageView20);
        Picasso.with(getApplicationContext()).load("http://res.cloudinary.com/dkitkexp8/image/upload/v1491880981/Collages1-3-1024x452_sf8k0v.jpg").into(imageView21);
        Picasso.with(getApplicationContext()).load("http://res.cloudinary.com/dkitkexp8/image/upload/v1491880982/11703216_469547623206201_1296310531010507751_n_t0kbcq.jpg").into(imageView22);
        Picasso.with(getApplicationContext()).load("http://res.cloudinary.com/dkitkexp8/image/upload/v1491880981/10696224_788628164513761_4965311007530127637_n_i8om3o.jpg").into(imageView23);
        Picasso.with(getApplicationContext()).load("http://res.cloudinary.com/dkitkexp8/image/upload/v1491881006/10690352_788628117847099_3701843958337501090_n_c2gmme.jpg").into(imageView24);
        Picasso.with(getApplicationContext()).load("http://res.cloudinary.com/dkitkexp8/image/upload/v1491880971/10678734_788628161180428_7440253603967515534_n_ht1wni.jpg").into(imageView25);
        Picasso.with(getApplicationContext()).load("http://res.cloudinary.com/dkitkexp8/image/upload/v1491880962/10613062_788628567847054_311452345399905294_n_wojgin.jpg").into(imageView26);
        Picasso.with(getApplicationContext()).load("http://res.cloudinary.com/dkitkexp8/image/upload/v1491880962/10613062_788628567847054_311452345399905294_n_wojgin.jpg").into(imageView27);
        Picasso.with(getApplicationContext()).load("http://res.cloudinary.com/dkitkexp8/image/upload/v1491880958/10600477_788628694513708_1057273672362981384_n_su7gfz.jpg").into(imageView28);
        Picasso.with(getApplicationContext()).load("http://res.cloudinary.com/dkitkexp8/image/upload/v1491880953/10599701_788628307847080_7128079527938577618_n_x10mmj.jpg").into(imageView29);
        Picasso.with(getApplicationContext()).load("http://res.cloudinary.com/dkitkexp8/image/upload/v1491880971/10458235_788628174513760_8838420418651655323_n_rkrwcj.jpg").into(imageView30);


      /* mWebview=(WebView)findViewById(R.id.webview_gallery);
        WebSettings Websettings=mWebview.getSettings();
        Websettings.setJavaScriptEnabled(true);
        mWebview.getSettings().setCacheMode(Websettings.LOAD_CACHE_ELSE_NETWORK);
        mWebview.getSettings().setAppCacheEnabled(true);
        mWebview.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        Websettings.setDomStorageEnabled(true);
        Websettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        Websettings.setUseWideViewPort(true);
        Websettings.setSavePassword(true);
       // Websettings.setSaveFormData(true);
        Websettings.setEnableSmoothTransition(true);


        mWebview.loadUrl("http://www.vssutrobotics.in/gallery");
        mWebview.setWebViewClient(new mWebviewClient());

    }

    private class mWebviewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            view.loadUrl(request.getUrl().toString());
            return true;
        }

       //Progress_dialoug
        ProgressDialog progressDialog=null;

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            progressDialog=new ProgressDialog(activity_gallery.this);
            progressDialog.setTitle("Please wait ....");
            progressDialog.setMessage("Loading Gallery");
            progressDialog.show();
            super.onPageStarted(view, url, favicon);

        }

        @Override
        public void onPageFinished(WebView view, String url) {

            super.onPageFinished(view, url);
            progressDialog.dismiss();
        }*/
    }
}

