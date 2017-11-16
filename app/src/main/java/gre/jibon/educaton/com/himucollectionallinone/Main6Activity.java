package gre.jibon.educaton.com.himucollectionallinone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Main6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        PDFView pdfView=(PDFView) findViewById(R.id.pdfView);
        pdfView.fromAsset("5 Ebong Himu By Humayun Ahmed [1995].pdf").load();
    }
}
