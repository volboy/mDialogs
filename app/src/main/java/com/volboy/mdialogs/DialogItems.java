package com.volboy.mdialogs;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class DialogItems extends DialogFragment {
    TextView txtMessage;
    String message;
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        txtMessage=getActivity().findViewById(R.id.txtMessage);
        String title="Dialog with items";

        final String[] items={"first", "second", "third"};
        AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
        builder.setTitle(title)
                .setItems(items, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Sendable sendable=(DialogItems.Sendable)getActivity();
                        sendable.sendString(items[which]);
                    }
                })
                .setCancelable(true);


        return builder.create();
    }

    public interface Sendable{
        public void sendString(String message);
    }
}
