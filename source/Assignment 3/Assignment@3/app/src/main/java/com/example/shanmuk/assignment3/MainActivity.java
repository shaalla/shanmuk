package com.example.shanmuk.assignment3;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;

import java.util.List;


public class MainActivity extends AppCompatActivity {
    int TAKE_PHOTO_CODE = 0;
    ImageView userImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button capture = (Button) findViewById(R.id.button_image);
        userImage = (ImageView) findViewById(R.id.profilepic);
        Button btn = (Button) findViewById(R.id.button_signup);

        capture.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(cameraIntent, TAKE_PHOTO_CODE);
            }
        });
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == TAKE_PHOTO_CODE && resultCode == RESULT_OK) {
            Bitmap photo = (Bitmap) data.getExtras().get("data");
            userImage.setImageBitmap(photo);
            Log.d("CameraDemo", "Pic saved");
        }
    }


    public void signUpPage(View v) {
        userImage.setDrawingCacheEnabled(true);
        Bitmap bm = userImage.getDrawingCache();
        Intent mapsIntent = new Intent(MainActivity.this, Maps.class);
        mapsIntent.putExtra("PROFILING", bm);
        startActivity(mapsIntent);

        //public void redirectToHome(View v) {
        Intent redirect = new Intent(MainActivity.this, Maps.class);
        startActivity(redirect);

    }


}








