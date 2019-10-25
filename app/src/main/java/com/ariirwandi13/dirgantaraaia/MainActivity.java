package com.ariirwandi13.dirgantaraaia;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

import com.google.android.material.appbar.CollapsingToolbarLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CollapsingToolbarLayout collapsingToolbarLayout = findViewById(R.id.collapse);
        collapsingToolbarLayout.setTitleEnabled(false);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Dirgantara AIA");

        collapsingToolbarLayout.setCollapsedTitleTextColor(
                ContextCompat.getColor(this, R.color.white));
        collapsingToolbarLayout.setExpandedTitleColor(
                ContextCompat.getColor(this, R.color.colorPrimary));

        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.profil);


    }

    public void kilk(View view) {
        new AlertDialog.Builder(this)

                .setCancelable(true)
                .setView(R.layout.about_us)
                .show();
    }

    public void fbClick(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/dirgantaraaiatravel/")));
    }

    public void igCkick(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/dirgantara.aia/?hl=id")));
    }

    public void ytClick(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UCvQ9Pj3aIt7zREPme-TD6DA")));
    }
}
