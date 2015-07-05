package com.example.michael.pickers;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;


public class TimerPicker extends DialogFragment implements TimePickerDialog.OnTimeSetListener{
    Calendar cal = Calendar.getInstance();

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return new TimePickerDialog(getActivity(), this, cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE), true);
    }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        String msg = String.format(getActivity().getString(R.string.chooseTime) + " %02d:%02d", hourOfDay, minute);
        Toast.makeText(getActivity(), msg, Toast.LENGTH_SHORT).show();
    }
}
