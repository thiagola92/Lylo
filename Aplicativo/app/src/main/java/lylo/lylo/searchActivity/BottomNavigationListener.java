package lylo.lylo.searchActivity;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;

import lylo.lylo.R;
import lylo.lylo.SearchActivity;

public class BottomNavigationListener implements BottomNavigationView.OnNavigationItemSelectedListener {

    private AppCompatActivity activity;

    public BottomNavigationListener(AppCompatActivity activity) {
        this.activity = activity;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Log.e("LYLO", "onNavigationItemSelected()");

        if(item.getItemId() == R.id.navigation_home) {

        } else if(item.getItemId() == R.id.navigation_home) {

        } else if(item.getItemId() == R.id.navigation_home) {

        } else if(item.getItemId() == R.id.navigation_home) {

        } else if(item.getItemId() == R.id.navigation_home) {

        }

        return true;
    }
}
