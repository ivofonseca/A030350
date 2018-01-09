package com.example.ivofm.trabalhomovel;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


/**
 * Created by ivofm on 08/01/2018.
 */

public class AnimeOnline extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animes_online);

        Back();

    }

    public void online(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.crunchyroll.com/"));
        startActivity(browserIntent);
    }

    public void apk(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.crunchyroll.crunchyroid"));
        startActivity(browserIntent);
    }

    public void Back(){
        Button proximo = (Button) findViewById(R.id.button_back);
        proximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AnimeOnline.this, MainActivity.class));
            }
        });
    }
}
