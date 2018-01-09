package com.example.ivofm.trabalhomovel;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by ivofm on 09/01/2018.
 */

    public class TopAnime extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.top_anime);

        Back();


    }

    public void onlinelist(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://myanimelist.net/topanime.php"));
        startActivity(browserIntent);
    }

    public void Back(){
        Button proximo = (Button) findViewById(R.id.button_Back3);
        proximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TopAnime.this, MainActivity.class));
            }
        });
    }
}
