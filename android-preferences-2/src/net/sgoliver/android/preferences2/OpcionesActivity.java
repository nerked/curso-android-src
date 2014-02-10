package net.sgoliver.android.preferences2;

import android.app.Activity;
import android.os.Bundle;

public class OpcionesActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getFragmentManager().beginTransaction().replace(android.R.id.content, new OpcionesFragment()).commit();
    }
}
