package gre.jibon.educaton.com.himucollectionallinone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Main20Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main20);
        PDFView pdfView=(PDFView) findViewById(R.id.pdfView);
        pdfView.fromAsset("19 Himur Madhyadupur By Humayun Ahmed [2009].pdf").load();
    }
}
