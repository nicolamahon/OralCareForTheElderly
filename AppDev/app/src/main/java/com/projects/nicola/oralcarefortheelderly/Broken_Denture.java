package com.projects.nicola.oralcarefortheelderly;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class Broken_Denture extends AppCompatActivity {
    private boolean partial, full, yes1, yes2, no1, no2 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broken__denture);

    }

    public void onRadioButtonClicked(View view) {
        TextView textView = (TextView) findViewById(R.id.TVResident);
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.full_denture:
                if (checked)
                    full = true;
                partial = false;
                break;
            case R.id.partial_denture:
                if (checked)
                    partial = true;
                full = false;
                break;
            case R.id.damage_yes:
                if (checked)
                    yes1 = true;
                no1 = false;
                break;
            case R.id.damage_no:
                if (checked)
                    no1 = true;
                yes1 = false;
                break;
            case R.id.damage_yes1:
                if (checked)
                    yes2 = true;
                no2 = false;
                break;
            case R.id.damage_no1:
                if (checked)
                    no2 = true;
                yes2 = false;
                break;
        }

        if (full && (yes1 || yes2)) {
            textView.setText(R.string.resident_damaged);
        } else if (partial && yes1) {
            textView.setText(R.string.resident_damaged2);
        } else if (full && no1 && no2) {
            textView.setText(R.string.resident_damaged3);
        } else if (partial && no1 && yes2) {
            textView.setText(R.string.resident_damaged);
        } else if (partial && no1 && no2) {
            textView.setText(R.string.resident_damaged3);
        }

    }
}
