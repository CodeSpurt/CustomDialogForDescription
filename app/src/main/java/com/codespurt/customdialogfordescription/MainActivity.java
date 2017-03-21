package com.codespurt.customdialogfordescription;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.yarolegovich.lovelydialog.LovelyStandardDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LovelyStandardDialog lovelyStandardDialog = new LovelyStandardDialog(this);
        lovelyStandardDialog.setTopColorRes(R.color.colorPrimaryDark);
        lovelyStandardDialog.setButtonsColorRes(R.color.colorPrimary);
        lovelyStandardDialog.setIcon(R.drawable.vector_notification);
        lovelyStandardDialog.setTitle(R.string.header);
        lovelyStandardDialog.setMessage(R.string.data);
        lovelyStandardDialog.show();
    }
}
