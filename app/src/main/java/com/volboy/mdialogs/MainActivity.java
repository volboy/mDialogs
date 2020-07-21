package com.volboy.mdialogs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements DialogItems.Sendable {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v){
        FragmentManager fragmentManager=getSupportFragmentManager();
        switch (v.getId()){
            case R.id.btnDialogWithButton:
                DialogThreeButton dialogThreeButton=new DialogThreeButton();
                dialogThreeButton.show(fragmentManager, "dialogWithButton");
                break;

            case R.id.btnDialogWithItem:
                DialogItems dialogItems=new DialogItems();
                dialogItems.show(fragmentManager, "dialogItems");
                break;

            case R.id.btnDialogWithSingle:
                break;
            case R.id.btnDialogWithMulti:
                break;

        }
    }

    @Override
    public void sendString(String message) {
        TextView txtMessage=findViewById(R.id.txtMessage);
        txtMessage.setText(message);
    }
}
