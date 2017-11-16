package gre.jibon.educaton.com.himucollectionallinone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        PDFView pdfView=(PDFView) findViewById(R.id.pdfView);
        pdfView.fromAsset("2 Dorjar Opashe By Humayun Ahmed [1992].pdf").load();
    }
}
