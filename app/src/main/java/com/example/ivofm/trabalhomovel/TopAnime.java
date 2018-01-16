package com.example.ivofm.trabalhomovel;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * Created by ivofm on 09/01/2018.
 */

    public class TopAnime extends AppCompatActivity {

    ImageView img1, img2, img3, img4, img5;
    Bitmap bit, bit2, bit3, bit4, bit5;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.top_anime);

        Back();

        img1=(ImageView)findViewById(R.id.pic01);
        img2=(ImageView)findViewById(R.id.pic02);
        img3=(ImageView)findViewById(R.id.pic03);
        img4=(ImageView)findViewById(R.id.pic04);
        img5=(ImageView)findViewById(R.id.pic05);


        new doit().execute();


    }

    public class doit extends AsyncTask<Void,Void,Void>{

        @Override
        protected Void doInBackground(Void... params) {

            try {
                bit=BitmapFactory.decodeStream((InputStream) new URL("https://vignette.wikia.nocookie.net/fma/images/e/e9/Fmab-poster.png/revision/latest?cb=20131124145205").getContent());
                bit2=BitmapFactory.decodeStream((InputStream) new URL("https://myanimelist.cdn-dena.com/images/anime/3/83528l.jpg").getContent());
                bit3=BitmapFactory.decodeStream((InputStream) new URL("https://myanimelist.cdn-dena.com/images/anime/5/87048.jpg").getContent());
                bit4=BitmapFactory.decodeStream((InputStream) new URL("http://img1.ak.crunchyroll.com/i/spire3/cbb55a6382682bf71e91f685c6473c5a1487736090_full.jpg").getContent());
                bit5=BitmapFactory.decodeStream((InputStream) new URL("https://myanimelist.cdn-dena.com/images/anime/13/87834.jpg").getContent());
            } catch (Exception e) {
                e.printStackTrace();
            }

            return null;


        }

        @Override
        protected void onPostExecute(Void aVoid){
            super.onPostExecute(aVoid);

            img1.setImageBitmap(bit);
            img2.setImageBitmap(bit2);
            img3.setImageBitmap(bit3);
            img4.setImageBitmap(bit4);
            img5.setImageBitmap(bit5);

        }
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
