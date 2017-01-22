package com.asm_linksys.taskschedulerboss.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

import com.asm_linksys.taskschedulerboss.R;
import com.asm_linksys.taskschedulerboss.fragment.SoftwareHelpFragment;

//import android.widget.RadioGroup;

/**
 * Created by Md. Asiful Haque on 1/19/2017.
 */

public class UserRegistration extends FragmentActivity {
    private ImageButton goBackToHome, softwareHelp;
    private Button register;
    // private RadioGroup gender;
    private EditText name, username, email, password, phone, address;
    private String nameString, usernameString;
    private Spinner selectPossition, selectGender;
    private ArrayAdapter<CharSequence> possitionSpinnerAdapter, genderSpinnerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_registration);
        /**
         * Initiating used material in activity page
         */
        goBackToHome = (ImageButton) findViewById(R.id.home__image_button_register_page);
        softwareHelp = (ImageButton) findViewById(R.id.software_help_image_button_register_page);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        SoftwareHelpFragment softwareHelpFragment = new SoftwareHelpFragment();
        fragmentTransaction.add(R.id.list_view_fragment, softwareHelpFragment);
        fragmentTransaction.commit();

        /*softwareHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager softwareHelpFragment = getSupportFragmentManager();
                FragmentTransaction softwareHelpFragmentTransaction = softwareHelpFragment.beginTransaction();
                SoftwareHelpFragment softwareHelpFragmentIns = new SoftwareHelpFragment();
                softwareHelpFragmentTransaction.add(R.id.list_view_fragment,softwareHelpFragmentIns);
                softwareHelpFragmentTransaction.commit();
                softwareHelpFragmentTransaction.replace(R.id.list_view_fragment,softwareHelpFragmentIns);


            }
        });
        */

        //Start of Register Button Action
        register = (Button) findViewById(R.id.register_button_register_page);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(UserRegistration.this, "Register", Toast.LENGTH_SHORT).show();
            }
        });
        //End of Register Button Action


        // gender=(RadioGroup)findViewById(R.id.gender_radio_group_register_page);
        name = (EditText) findViewById(R.id.name_edit_text_register_page);
        nameString = name.getText().toString();
        username = (EditText) findViewById(R.id.username_edit_text_register_page);
        email = (EditText) findViewById(R.id.email_edit_text_register_page);
        password = (EditText) findViewById(R.id.password_edit_text_register_page);
        phone = (EditText) findViewById(R.id.phone__edit_text_register_page);
        address = (EditText) findViewById(R.id.address_edit_text_register_page);


        //Start of selectGender Spinner Code
        selectGender = (Spinner) findViewById(R.id.select_gender_spinner_register_page);
        genderSpinnerAdapter = ArrayAdapter.createFromResource(this, R.array.gender_array, android.R.layout.select_dialog_singlechoice);
        genderSpinnerAdapter.setDropDownViewResource(android.R.layout.select_dialog_singlechoice);
        selectGender.setAdapter(genderSpinnerAdapter);
        //End of selectGender spinner Code


        //Start of Select Possition Spinner
        selectPossition = (Spinner) findViewById(R.id.select_possition_spinner_register_page);
        possitionSpinnerAdapter = ArrayAdapter.createFromResource(this, R.array.posstion_array, android.R.layout.select_dialog_singlechoice);
        possitionSpinnerAdapter.setDropDownViewResource(android.R.layout.select_dialog_singlechoice);
        selectPossition.setAdapter(possitionSpinnerAdapter);
        //End of Select Possition
    }

    public void onSelectedFragment(View view) {
        Fragment tempFragment;
        if (view == findViewById((R.id.software_help_image_button_register_page))) {
            tempFragment = new SoftwareHelpFragment();
        } else {
            Toast.makeText(UserRegistration.this, "No fragment foun", Toast.LENGTH_SHORT).show();
        }
    }
}
