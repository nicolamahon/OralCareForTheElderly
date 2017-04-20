package com.projects.nicola.oralcarefortheelderly;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request.Method;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.projects.nicola.oralcarefortheelderly.app.AppConfig;
import com.projects.nicola.oralcarefortheelderly.app.AppController;
import com.projects.nicola.oralcarefortheelderly.utils.SQLiteHandler;
import com.projects.nicola.oralcarefortheelderly.utils.SessionManager;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class Register extends Activity {
    private static final String TAG = Register.class.getSimpleName();
    private Button btnRegister;
    private EditText inputFullName;
    private EditText inputEmail;
    private EditText inputUsername;
    private EditText inputPassword1;
    private EditText inputPassword2;
    private ProgressDialog pDialog;
    private SessionManager session;
    private SQLiteHandler db;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        inputFullName = (EditText) findViewById(R.id.Name_registered);
        inputEmail = (EditText) findViewById(R.id.Email_registered);
        inputUsername = (EditText) findViewById(R.id.Username_registered);
        inputPassword1 = (EditText) findViewById(R.id.pass1_registered);
        inputPassword2 = (EditText) findViewById(R.id.pass2_registered);
        btnRegister = (Button) findViewById(R.id.Signup_Button);


        // Progress dialog
        pDialog = new ProgressDialog(this);
        pDialog.setCancelable(false);

        // Session manager
        session = new SessionManager(getApplicationContext());

        // SQLite database handler
        db = new SQLiteHandler(getApplicationContext());

        // Check if user is already logged in or not
        if (session.isLoggedIn()) {
            // User is already logged in. Take him to main activity
            Intent intent = new Intent(Register.this, LoggedIn.class);
            startActivity(intent);
            finish();
        }

        // Register Button Click event
        btnRegister.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String name = inputFullName.getText().toString().trim();
                String email = inputEmail.getText().toString().trim();
                String username = inputUsername.getText().toString().trim();
                String password1 = inputPassword1.getText().toString().trim();
                String password2 = inputPassword2.getText().toString().trim();

                    if (!name.isEmpty() && !email.isEmpty() && !password1.isEmpty())
                    {
                        registerUser(name, email, username, password1);
                    }
                    else {
                        Toast.makeText(getApplicationContext(),"Please enter your details!", Toast.LENGTH_LONG).show();
                        }
            }
        });


    }

    /**
     * Function to store user in MySQL database will post params(tag, name,email,username, password) to register url     *
     */
    private void registerUser(final String name, final String email,final String uname, final String password)
    {
        // Tag used to cancel the request
        String tag_string_req = "req_register";

        pDialog.setMessage("Registering ...");
        showDialog();

        StringRequest strReq = new StringRequest(Method.POST, AppConfig.URL_REGISTER, new Response.Listener<String>() {

            @Override
            public void onResponse(String response) {
                Log.d(TAG, "Register Response: " + response.toString());
                hideDialog();

                try {
                    JSONObject jObj = new JSONObject(response);
                    boolean error = jObj.getBoolean("error");
                    if (!error) {
                        // User successfully stored in MySQL
                        // Now store the user in sqlite
                        String unique_id = jObj.getString("unique_id");
                        JSONObject user = jObj.getJSONObject("user");
                        String name = user.getString("name");
                        String email = user.getString("email");
                        String uname = user.getString("uname");
                        String created_at = user.getString("created_at");

                        // Inserting row in users table
                        db.addUser(name, email,uname, unique_id, created_at);

                        Toast.makeText(getApplicationContext(), "User successfully registered. Try login now!", Toast.LENGTH_LONG).show();

                        // Launch login activity
                        Intent intent = new Intent(Register.this, login_register.class);
                        startActivity(intent);
                        finish();
                    } else {

                        // Error occurred in registration. Get the error
                        // message
                        String errorMsg = jObj.getString("error_msg");
                        Toast.makeText(getApplicationContext(), errorMsg, Toast.LENGTH_LONG).show();
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e(TAG, "Registration Error: " + error.getMessage());
                Toast.makeText(getApplicationContext(), error.getMessage(), Toast.LENGTH_LONG).show();
                hideDialog();
            }
        }) {

            @Override
            protected Map<String, String> getParams() {
                // Posting params to register url
                Map<String, String> params = new HashMap<String, String>();
                params.put("name", name);
                params.put("email", email);
                params.put("uname", uname);
                params.put("password", password);

                return params;
            }

        };

        // Adding request to request queue
        AppController.getInstance().addToRequestQueue(strReq, tag_string_req);
    }

    private void showDialog() {
        if (!pDialog.isShowing())
            pDialog.show();
    }

    private void hideDialog() {
        if (pDialog.isShowing())
            pDialog.dismiss();
    }
}



