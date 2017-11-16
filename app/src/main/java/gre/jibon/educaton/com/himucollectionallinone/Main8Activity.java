package gre.jibon.educaton.com.himucollectionallinone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Main8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        PDFView pdfView=(PDFView) findViewById(R.id.pdfView);
        pdfView.fromAsset("7 Himur Ditiyo Prohor By Humayun Ahmed [1997].pdf").load();
    }
}
