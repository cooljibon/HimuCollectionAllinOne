package gre.jibon.educaton.com.himucollectionallinone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Main9Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        PDFView pdfView=(PDFView) findViewById(R.id.pdfView);
        pdfView.fromAsset("8 Himur Rupali Ratri By Humayun Ahmed [1998].pdf").load();
    }
}