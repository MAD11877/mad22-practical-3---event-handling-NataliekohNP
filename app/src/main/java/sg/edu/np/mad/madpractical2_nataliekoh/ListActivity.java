package sg.edu.np.mad.madpractical2_nataliekoh;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.DialogTitle;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class ListActivity extends AppCompatActivity {
    private int randomOTP(){
        Random ran = new Random();
        int value = ran.nextInt(10000000);
        return value;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ImageView imgview = findViewById(R.id.imageView);
        AlertDialog.Builder buildalert = new AlertDialog.Builder(this);
        buildalert.setTitle("Profile");
        buildalert.setMessage("Madness");
        buildalert.setPositiveButton("View", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                String txtmsg = String.valueOf(randomOTP());
                Intent myintent = new Intent(ListActivity.this, MainActivity.class);
                myintent.putExtra("Username", txtmsg);
                startActivity(myintent);
            }
        });
        buildalert.setNegativeButton("Close", new DialogInterface.OnClickListener(){
            public void onClick(DialogInterface dialog, int id){
                finish();
            }
        });

        imgview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buildalert.show();

            }
        });
    }
}