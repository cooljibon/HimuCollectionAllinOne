package gre.jibon.educaton.com.himucollectionallinone;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;

public class SplashScreen extends AppCompatActivity {

    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        progressBar = (ProgressBar)findViewById(R.id.progressBar);
        progressBar.setVisibility(progressBar.VISIBLE);

        //Set GIFImageView resource
        try{
            InputStream inputStream = getAssets().open("splash_screen.gif");
            byte[] bytes = IOUtils.toByteArray(inputStream);

        }
        catch (IOException ex)
        {

        }

        //Wait for 3 seconds and start Activity Main
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SplashScreen.this.startActivity(new Intent(SplashScreen.this,MainActivity.class));
                SplashScreen.this.finish();
            }
        },6000); // 6000 = 3seconds
    }
}
