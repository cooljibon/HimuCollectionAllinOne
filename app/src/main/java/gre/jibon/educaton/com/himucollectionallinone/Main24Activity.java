package gre.jibon.educaton.com.himucollectionallinone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Main24Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main24);


        PDFView pdfView=(PDFView) findViewById(R.id.pdfView);
        pdfView.fromAsset("23 Himu Ebong Ekti Russian Pori By Humayun Ahmed [2011].pdf").load();
    }
}