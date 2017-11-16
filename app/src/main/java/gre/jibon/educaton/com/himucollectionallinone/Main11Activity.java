package gre.jibon.educaton.com.himucollectionallinone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Main11Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);


        PDFView pdfView=(PDFView) findViewById(R.id.pdfView);
        pdfView.fromAsset("10 Tomader Ei Nogore By Humayun Ahmed [2000].pdf").load();
    }
}
