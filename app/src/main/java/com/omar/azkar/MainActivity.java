package com.omar.azkar;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void azkar(View view) {

        Intent intent = new Intent(this,AzkarActivity.class);
        startActivity(intent);
    }

    public void about(View view) {

        Intent intent2 = new Intent(this,AboutActivity.class);
        startActivity(intent2);

    }

    public void close(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("إغلاق التطبيق");
        builder.setMessage("هل انت متأكد من إغلاق البرنامج ؟");
        builder.setCancelable(true);
        builder.setPositiveButton("موافق", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        builder.setNegativeButton("رجوع", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
         AlertDialog dialog = builder.create();
         dialog.show();
    }
}
