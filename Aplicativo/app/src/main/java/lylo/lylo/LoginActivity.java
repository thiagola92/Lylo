package lylo.lylo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    protected void onResume() {
        super.onResume();

        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

        if(user != null) {
            // Já esta logado
        }
    }

    public void facebookLogin(View view) {

    }

    public void jaPossuiUmaConta(View view) {
        Intent intent = new Intent(this, JaTemContaActivity.class);
        startActivity(intent);
    }

    public void registrarConta() {
        Intent intent = new Intent(this, RegistroActivity.class);
        startActivity(intent);
    }
}
