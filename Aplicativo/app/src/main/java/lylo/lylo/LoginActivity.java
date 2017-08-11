package lylo.lylo;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        setFonts();
    }

    private void setFonts() {
        Typeface font_montserrat_extra_light = Typeface.createFromAsset(getAssets(), "fonts/Montserrat-ExtraLight.ttf");
        Typeface font_montserrat_medium = Typeface.createFromAsset(getAssets(), "fonts/Montserrat-Medium.ttf");

        TextView subtitle = (TextView) findViewById(R.id.activity_login_subtitle);
        Button facebook = (Button) findViewById(R.id.activity_login_facebook);
        Button register = (Button) findViewById(R.id.activity_login_register);
        TextView already_have_an_account = (TextView) findViewById(R.id.activity_login_already_have_an_account);

        subtitle.setTypeface(font_montserrat_extra_light);
        facebook.setTypeface(font_montserrat_medium);
        register.setTypeface(font_montserrat_medium);
        already_have_an_account.setTypeface(font_montserrat_medium);
    }

    protected void onResume() {
        super.onResume();

        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

        if(user != null) {
            // Já esta logado
        }
    }

    public void facebookLogin(View view) {
        Log.e("LYLO", "facebookLogin()");

    }

    public void registerAccount(View view) {
        Log.e("LYLO", "registerAccount()");

        Intent intent = new Intent(this, RegistroActivity.class);
        startActivity(intent);
    }

    public void alreadyHaveAnAccount(View view) {
        Log.e("LYLO", "alreadyHaveAnAccount()");

        Intent intent = new Intent(this, JaTemContaActivity.class);
        startActivity(intent);
    }
}
