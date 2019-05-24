package com.example.alertdialogbox;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
  String[] arr;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.btn);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alertdialogbulider= new AlertDialog.Builder(MainActivity.this);
                arr= new String[]{"Item1", "Item2", "Item3","Item4","Item5"};

                final boolean[] checkedarr=new boolean[]{
                        true,
                        false,
                        false,
                        true,
                        false,
                };




                alertdialogbulider.setTitle("select choice");

                alertdialogbulider.setMultiChoiceItems(arr, checkedarr, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which, boolean isChecked) {

                       if(isChecked)
                       {
                           Toast.makeText(MainActivity.this, "check", Toast.LENGTH_SHORT).show();
                       }
                    }
                });

              /*  alertdialogbulider.setSingleChoiceItems(arr, -1, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });*/
                alertdialogbulider.setNeutralButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                AlertDialog mdialog=alertdialogbulider.create();
                mdialog.show();;
            }
        });



    }

  /*  public void exit(View view){

        AlertDialog.Builder alertdialogbulider = new AlertDialog.Builder(this);
        alertdialogbulider.setTitle("confirm exit.");
        alertdialogbulider.setMessage("Are u sure,u want to exit");
        alertdialogbulider.setCancelable(false);

        alertdialogbulider.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
               finish();
            }
        });

        alertdialogbulider.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"clicked No",Toast.LENGTH_SHORT).show();

            }
        });

               AlertDialog alertDialog=alertdialogbulider.create();
               alertDialog.show();
    }*/

}
