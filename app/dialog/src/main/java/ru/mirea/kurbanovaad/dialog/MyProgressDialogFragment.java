package ru.mirea.kurbanovaad.dialog;

import android.app.Dialog;
import android.app.TimePickerDialog;
import androidx.annotation.NonNull;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import android.content.DialogInterface;
import android.app.ProgressDialog;
import java.util.Calendar;


public class MyProgressDialogFragment extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle saveInstanceState)
    {
        ProgressDialog progdialog = new ProgressDialog(getActivity());
        progdialog.setMax(100);

        progdialog.setMessage("Processing...");
        progdialog.setTitle("Work ProgressDialog");
        progdialog.setButton(Dialog.BUTTON_POSITIVE, "Oкey", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        progdialog.show();
        return progdialog;
    }
}
