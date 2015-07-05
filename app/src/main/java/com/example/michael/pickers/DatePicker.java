package com.example.michael.pickers;


import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Date;

public class DatePicker extends DialogFragment implements DatePickerDialog.OnDateSetListener{
    Calendar cal = Calendar.getInstance();

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        cal.setTime(new Date());
        return new DatePickerDialog(getActivity(), this, cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH));
    }

    @Override
    public void onDateSet(android.widget.DatePicker view, int year, int monthOfYear, int dayOfMonth) {
        String msg = String.format(getActivity().getString(R.string.msgDate) + " %02d/%02d/%d", dayOfMonth, monthOfYear+1, year);

        Toast.makeText(getActivity(), msg, Toast.LENGTH_SHORT).show();
    }
}
