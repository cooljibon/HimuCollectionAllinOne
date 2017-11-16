package gre.jibon.educaton.com.himucollectionallinone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Main13Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);

        PDFView pdfView=(PDFView) findViewById(R.id.pdfView);
        pdfView.fromAsset("12 Se Ashe Dhire By Humayun Ahmed [2003].pdf").load();
    }
}
