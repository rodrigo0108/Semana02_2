package com.rramos.semana02_2.e22;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.rramos.semana02_2.R;

public class ImageViewActivity extends AppCompatActivity {


    private int[] photos = {
            R.drawable.img_guitar2,
            R.drawable.img_guitar3,
            R.drawable.img_guitar4,
    };
    private int index = 0;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);
        imageView = (ImageView)findViewById(R.id.imageview);
    }
    public void nextImage(View view) {
        if(++index > photos.length-1)
            index = 0;
        imageView.setImageResource(photos[index]);
    }
    public void previousImage(View view) {
        if(--index < 0)
            index = photos.length-1;
        imageView.setImageResource(photos[index]);
    }

}
