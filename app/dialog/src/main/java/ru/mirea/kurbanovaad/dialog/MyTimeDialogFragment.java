package ru.mirea.kurbanovaad.dialog;

import android.app.Dialog;
import android.app.TimePickerDialog;
import androidx.annotation.NonNull;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import android.content.DialogInterface;
import java.util.Calendar;

public class MyTimeDialogFragment extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Calendar hour = Calendar.getInstance();
        TimePickerDialog.OnTimeSetListener timeListener = (view, hourOfDay, minute) ->{};

        TimePickerDialog timeDialog = new TimePickerDialog(
                getActivity(), timeListener, hour.get(Calendar.HOUR_OF_DAY),
                hour.get(Calendar.MINUTE), true);

        timeDialog.setTitle("How much time:");
        timeDialog.setButton(Dialog.BUTTON_NEUTRAL, "Click", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        ((MainActivity)getActivity()).onTimeClicked();
                        dialog.cancel();
                    }
                }
        );

        timeDialog.show();
        return timeDialog;
    }
}