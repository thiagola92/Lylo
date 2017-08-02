package lylo.lylo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void sendMessage(View view) {
        // Do something in response to button
    }

    public void tryLogin(View view) {
        try {
            login(view);
        } catch(Exception e) {

        }
    }

    public void login(View view) {
        Log.v("LoginActivity", "Logando");
    }
}
