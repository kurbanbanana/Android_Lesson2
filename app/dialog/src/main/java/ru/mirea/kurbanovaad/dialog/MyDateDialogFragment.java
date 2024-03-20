package ru.mirea.kurbanovaad.dialog;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import androidx.annotation.NonNull;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import android.content.DialogInterface;
import java.util.Calendar;

public class MyDateDialogFragment extends DialogFragment {
    Calendar data = Calendar.getInstance();

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        DatePickerDialog.OnDateSetListener dateListener = (view, year, month, dayOfMonth) ->{};
        DatePickerDialog dataDialog = new DatePickerDialog(getActivity(), dateListener,
                data.get(Calendar.YEAR), data.get(Calendar.MONTH), data.get(Calendar.DAY_OF_MONTH));

        dataDialog.setTitle("What number:");
        dataDialog.setButton(Dialog.BUTTON_POSITIVE, "Okey", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        ((MainActivity)getActivity()).onDateClicked();
                        dialog.cancel();
                    }
                }
        );

        dataDialog.show();
        return dataDialog;
    }
}
