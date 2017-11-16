package gre.jibon.educaton.com.himucollectionallinone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {
    AdView mAdview;
    private InterstitialAd interstitialAd;
    private Button but1;
    private Button bu2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);
        MobileAds.initialize(this,"ca-app-pub-9798591530643669~7228769598");


        mAdview = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdview.loadAd(adRequest);



        interstitialAd = new InterstitialAd(this);
        //adsMob apps ID;
        interstitialAd.setAdUnitId ("ca-app-pub-9798591530643669/9545486331");
        interstitialAd.loadAd(new AdRequest.Builder().build());


        interstitialAd.setAdListener(new AdListener()
                                     {
                                         @Override
                                         public void onAdClosed() {
                                             super.onAdClosed();


                                             interstitialAd.loadAd(new  AdRequest.Builder().build());




                                         }




                                     }
        );



    }
    public void  but1(View view) {
        if (interstitialAd.isLoaded()) {

            interstitialAd.show();
        } else
            startActivity(new Intent(this, Main2Activity.class));
    }


    public void but2(View view) {
        if (interstitialAd.isLoaded()) {

            interstitialAd.show();

        }
        else
            startActivity(new Intent(this,Main3Activity.class));
    }

    public void but3(View view) {
        if (interstitialAd.isLoaded()) {

            interstitialAd.show();

        }
        else
            startActivity(new Intent(this,Main4Activity.class));

    }

    public void but4(View view) {
        if (interstitialAd.isLoaded()) {

            interstitialAd.show();

        }
        else
            startActivity(new Intent(this,Main5Activity.class));
    }
    public void but5(View view) {
        if (interstitialAd.isLoaded()) {

            interstitialAd.show();

        }
        else
            startActivity(new Intent(this,Main6Activity.class));
    }
    public void but6(View view) {
        if (interstitialAd.isLoaded()) {

            interstitialAd.show();

        }
        else
            startActivity(new Intent(this,Main7Activity.class));
    }
    public void but7(View view) {
        if (interstitialAd.isLoaded()) {

            interstitialAd.show();

        }
        else
            startActivity(new Intent(this,Main8Activity.class));
    }

    public void but8(View view) {
        if (interstitialAd.isLoaded()) {

            interstitialAd.show();

        }
        else
            startActivity(new Intent(this,Main9Activity.class));
    }


    public void but9(View view) {
        if (interstitialAd.isLoaded()) {

            interstitialAd.show();

        }
        else
            startActivity(new Intent(this,Main10Activity.class));

    }

    public void  but10(View view) {
        if (interstitialAd.isLoaded()) {

            interstitialAd.show();
        } else
            startActivity(new Intent(this, Main11Activity.class));
    }


    public void but11(View view) {
        if (interstitialAd.isLoaded()) {

            interstitialAd.show();

        }
        else
            startActivity(new Intent(this,Main12Activity.class));
    }

    public void but12(View view) {
        if (interstitialAd.isLoaded()) {

            interstitialAd.show();

        }
        else
            startActivity(new Intent(this,Main13Activity.class));

    }

    public void but13(View view) {
        if (interstitialAd.isLoaded()) {

            interstitialAd.show();

        }
        else
            startActivity(new Intent(this,Main14Activity.class));
    }
    public void but14(View view) {
        if (interstitialAd.isLoaded()) {

            interstitialAd.show();

        }
        else
            startActivity(new Intent(this,Main15Activity.class));
    }
    public void but15(View view) {
        if (interstitialAd.isLoaded()) {

            interstitialAd.show();

        }
        else
            startActivity(new Intent(this,Main16Activity.class));
    }
    public void but16(View view) {
        if (interstitialAd.isLoaded()) {

            interstitialAd.show();

        }
        else
            startActivity(new Intent(this,Main17Activity.class));
    }

    public void but17(View view) {
        if (interstitialAd.isLoaded()) {

            interstitialAd.show();

        }
        else
            startActivity(new Intent(this,Main18Activity.class));
    }


    public void but18(View view) {
        if (interstitialAd.isLoaded()) {

            interstitialAd.show();

        }
        else
            startActivity(new Intent(this,Main19Activity.class));

    }

    public void  but19(View view) {
        if (interstitialAd.isLoaded()) {

            interstitialAd.show();
        } else
            startActivity(new Intent(this, Main20Activity.class));
    }


    public void but20(View view) {
        if (interstitialAd.isLoaded()) {

            interstitialAd.show();

        }
        else
            startActivity(new Intent(this,Main21Activity.class));
    }

    public void but21(View view) {
        if (interstitialAd.isLoaded()) {

            interstitialAd.show();

        }
        else
            startActivity(new Intent(this,Main22Activity.class));

    }

    public void but22(View view) {
        if (interstitialAd.isLoaded()) {

            interstitialAd.show();

        }
        else
            startActivity(new Intent(this,Main23Activity.class));
    }
    public void but23(View view) {
        if (interstitialAd.isLoaded()) {

            interstitialAd.show();

        }
        else
            startActivity(new Intent(this,Main24Activity.class));
    }
    public void but24(View view) {
        if (interstitialAd.isLoaded()) {

            interstitialAd.show();

        }
        else
            startActivity(new Intent(this,Main25Activity.class));
    }
    public void but25(View view) {
        if (interstitialAd.isLoaded()) {

            interstitialAd.show();

        }
        else
            startActivity(new Intent(this,Main26Activity.class));
    }

    public void but26(View view) {
        if (interstitialAd.isLoaded()) {

            interstitialAd.show();

        }
        else
            startActivity(new Intent(this,Main27Activity.class));
    }

}