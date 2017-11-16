package gre.jibon.educaton.com.himucollectionallinone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Main18Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main18);
        PDFView pdfView=(PDFView) findViewById(R.id.pdfView);
        pdfView.fromAsset("17 Himu Remand-E  By Humayun Ahmed [2008].pdf").load();
    }
}
