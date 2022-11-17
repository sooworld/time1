package com.example.time1;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.DatePicker;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import java.util.Calendar;


public class DatePickerFragment extends DialogFragment
    implements DatePickerDialog.OnDateSetListener{
        @NonNull
        @Override
        public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

            final Calendar c = Calendar.getInstance();
            int year = c.get(Calendar.YEAR);
            int month = c.get(Calendar.MONTH);
            int day = c.get(Calendar.DAY_OF_MONTH);

            return new DatePickerDialog(getActivity(),this,year,month,day);
        }

        @Override
        public void onDateSet(DatePicker view, int year, int month, int day) {
            MainActivity activity = (MainActivity) getActivity();
            //Report activity2 = (Report) getActivity();
            assert activity != null;
            //assert activity2 != null;
            activity.processDatePickerResult(year,month,day);

            //activity2.processDatePickerResult2(year,month,day);
        }

        public void onDateSet2(DatePicker view, int year, int month, int day) {
            Report activity2 = (Report) getActivity();
            assert activity2 != null;
            activity2.processDatePickerResult2(year,month,day);

        }



}