package com.projects.nicola.oralcarefortheelderly;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Resident extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resident);

    }

    public void onRadioButtonClicked(View view) {
        TextView textView = (TextView)findViewById(R.id.TVResident);
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.Change_In_Residents:
                if (checked)
                    textView.setText(R.string.resident_change_1);

                    break;
            case R.id.new_resident:
                if (checked)
                    textView.setText(R.string.resident_change_2);
                    break;
        }
    }

}
