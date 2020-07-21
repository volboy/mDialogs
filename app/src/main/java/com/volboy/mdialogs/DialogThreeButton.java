package com.volboy.mdialogs;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

public class DialogThreeButton extends DialogFragment{
    TextView txtMessage;

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        txtMessage=getActivity().findViewById(R.id.txtMessage);

        String title="Диалог с тремя кнопками";
        String message="В зависимости от нажатой кнопки текст в активити поменяется";
        String btnPositiv="Да";
        String btnNegativ="Нет";
        String btnNeutral="Не знаю";
        AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
        builder.setTitle(title)
                .setMessage(message)
                .setPositiveButton(btnPositiv, new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        txtMessage.setText("Yes");
                    }
                })
                .setNegativeButton(btnNegativ, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        txtMessage.setText("No");

                    }
                })
                .setNeutralButton(btnNeutral, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        txtMessage.setText("Don't know");

                    }
                })
                .setCancelable(true);
        return builder.create();
    }
}


