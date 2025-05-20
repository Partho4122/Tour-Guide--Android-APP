package com.example.tour;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class SpotsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spots);

        String category = getIntent().getStringExtra("category");
        Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = null;

        if (category != null) {
            switch (category) {
                case "DHAKA":
                    adapter = ArrayAdapter.createFromResource(this, R.array.dhakaspots, android.R.layout.simple_spinner_item);
                    break;
                case "SYLHET":
                    adapter = ArrayAdapter.createFromResource(this, R.array.sylhetspots, android.R.layout.simple_spinner_item);
                    break;
                case "KHULNA":
                    adapter = ArrayAdapter.createFromResource(this, R.array.khulnaspots, android.R.layout.simple_spinner_item);
                    break;
                // Add other cases as needed
            }
        }

        if (adapter != null) {
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);

            spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    String spot = (String) parent.getItemAtPosition(position);
                    if (!spot.isEmpty()) { // Ensure an actual spot is selected
                        DetailsFragment detailsFragment = DetailsFragment.newInstance(category, spot);
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.framelayout, detailsFragment);
                        transaction.commit();
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {
                    // Do nothing...
                }
            });
        }
    }
}
