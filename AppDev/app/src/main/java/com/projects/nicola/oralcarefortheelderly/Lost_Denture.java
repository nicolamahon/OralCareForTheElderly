package com.projects.nicola.oralcarefortheelderly;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class Lost_Denture extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lost__denture);

    }

    public void onRadioButtonClicked(View view) {
        TextView textView = (TextView) findViewById(R.id.TVLost);
        TextView callView = (TextView) findViewById(R.id.TVLost2);
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.medical_card_yes:
                if (checked)
                    textView.setText(R.string.empty_string);
                callView.setText(R.string.empty_string);

                    break;
            case R.id.medical_card_no:
                if (checked)
                    textView.setText(R.string.private_replacement);
                break;
            case R.id.medical_scheme_yes:
                if (checked)
                    callView.setText(R.string.call_denture);

                break;
            case R.id.medical_scheme_no:
                if (checked)
                    textView.setText(R.string.denture_cover);
                    callView.setText(R.string.call_denture);
                break;

        }
    }
}
