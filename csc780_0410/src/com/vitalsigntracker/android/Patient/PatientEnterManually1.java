package com.vitalsigntracker.android.Patient;

import com.vitalsigntracker.android.R;
import com.vitalsigntracker.android.R.id;
import com.vitalsigntracker.android.R.layout;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class PatientEnterManually1 extends Activity {

	RadioButton leftArm, rightArm, sitting, laying, standing;
	String arm = null, position = null;
	String MY_PREFS = "MY_PREFS";
	SharedPreferences mySharedPreferences;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.patiententermanually1);
		
		leftArm = (RadioButton) findViewById(R.id.leftArm);
		rightArm = (RadioButton) findViewById(R.id.rightArm);
		sitting = (RadioButton) findViewById(R.id.sitting);
		laying = (RadioButton) findViewById(R.id.laying);
		standing = (RadioButton) findViewById(R.id.standing);
		
		leftArm.setOnClickListener(myClick);
		rightArm.setOnClickListener(myClick);
		sitting.setOnClickListener(myClick);
		laying.setOnClickListener(myClick);
		standing.setOnClickListener(myClick);
	}
	
	RadioButton.OnClickListener myClick =
            new RadioButton.OnClickListener() {

                public void onClick(View v) {
                    if (leftArm.isChecked()) {
                        arm = "left";
                    } else if (rightArm.isChecked()) {
                        arm = "right";
                    } 
                    
                    if (sitting.isChecked()) {
                        position = "sitting";
                    } else if (laying.isChecked()) {
                        position = "laying";
                    } else if (standing.isChecked()) {
                        position = "standing";
                    } 
                }
            };

	public void nextButtonOnClick (View v) {
		
		if (arm.equals(null) || position.equals(null)) {
			
			AlertDialog alertDialog = new AlertDialog.Builder(this).create();
			alertDialog.setTitle("Error");
			alertDialog.setMessage("Please enter complete information.");
			alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
				public void onClick(DialogInterface d, int i) {
															
				}
			});
			alertDialog.show();
			
		} else {
			
			mySharedPreferences = this.getSharedPreferences(MY_PREFS, MODE_PRIVATE);
			SharedPreferences.Editor editor = mySharedPreferences.edit();
			editor.putString("arm", arm);
			editor.putString("position", position);			
			editor.commit();
			
			Intent i = new Intent(this, PatientEnterManually2.class);
			startActivity(i);
		}
	}
}
