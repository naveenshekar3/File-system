package com.example.root.filesystem;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void createFile(View view){
        File f=new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS),"hi.txt");
        try {
            f.createNewFile();
            FileOutputStream fos=new FileOutputStream(f);
            String s="Welcome to java";
            byte[] b=s.getBytes();
            fos.write(b);
            fos.flush();
            fos.close();
        }
         catch (Exception e) {
            e.printStackTrace();
        }


    }
}
