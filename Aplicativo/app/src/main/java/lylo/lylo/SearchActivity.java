package lylo.lylo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import lylo.lylo.searchActivity.BottomNavigationListener;

public class SearchActivity extends AppCompatActivity {

    private BottomNavigationListener bottom_navigation_listener = new BottomNavigationListener(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        Log.e("LYLO", "onCreate()");

        //BottomNavigationView bottom_navigation = (BottomNavigationView) findViewById(R.id.activity_search_toolbar);
        //bottom_navigation.setOnNavigationItemSelectedListener(bottom_navigation_listener);
    }

}
