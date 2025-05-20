package com.example.tour;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TransportationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transportation);

        // Retrieve the selected category and spot from intent extras
        String category = getIntent().getStringExtra("CATEGORY");
        String spot = getIntent().getStringExtra("SPOT");

        // Populate the hotels based on the selected category and spot
        populateHotels(category, spot);
    }

    private void populateHotels(String category, String spot) {
        TextView TTV1 = findViewById(R.id.ttv1);
        TextView TTV2 = findViewById(R.id.ttv2);
        TextView TTV3 = findViewById(R.id.ttv3);
        TextView TTV4 = findViewById(R.id.ttv4);

        // Update hotels based on the selected category and spot
        switch (category) {
            case "DHAKA":
                switch (spot) {
                    case "Lalbagh Fort":
                        TTV1.setText("Rout 1 A1");
                        TTV2.setText("Rout 2 A2");
                        TTV3.setText("Rout 3 A3");
                        TTV4.setText("Rout 4 A4");
                        break;
                    case "Ahsan Manzil":
                        TTV1.setText("Rout 1 B1");
                        TTV2.setText("Rout 2 B2");
                        TTV3.setText("Rout 3 B3");
                        TTV4.setText("Rout 4 B4");
                        break;
                    case "Dhakeshwari Temple":
                        TTV1.setText("Rout 1 C1");
                        TTV2.setText("Rout 2 C2");
                        TTV3.setText("Rout 3 C3");
                        TTV4.setText("Rout 4 C4");
                        break;
                }
                break;
            case "SYLHET":
                switch (spot) {
                    case "Ratargul Swamp Forest":
                        TTV1.setText("Rout 1 AA1");
                        TTV2.setText("Rout 2 AA2");
                        TTV3.setText("Rout 3 AA3");
                        TTV4.setText("Rout 4 AA4");
                        break;
                    case "Jaflong":
                        TTV1.setText("Rout 1 BB1");
                        TTV2.setText("Rout 2 BB2");
                        TTV3.setText("Rout 3 BB3");
                        TTV4.setText("Rout 4 BB4");
                        break;
                    case "Srimangal":
                        TTV1.setText("Rout 1 CC1");
                        TTV2.setText("Rout 2 CC2");
                        TTV3.setText("Rout 3 CC3");
                        TTV4.setText("Rout 4 CC4");
                        break;
                }
                break;
            case "KHULNA":
                switch (spot) {
                    case "Sundarbans":
                        TTV1.setText("Rout 1 AAA1");
                        TTV2.setText("Rout 2 AAA2");
                        TTV3.setText("Rout 3 AAA3");
                        TTV4.setText("Rout 4 AAA4");
                        break;
                    case "Khan Jahan Alis Mausoleum":
                        TTV1.setText("Rout 1 BBB1");
                        TTV2.setText("Rout 2 BBB2");
                        TTV3.setText("Rout 3 BBB3");
                        TTV4.setText("Rout 4 BBB4");
                        break;
                    case "Shat Gombuj Mosque":
                        TTV1.setText("Rout 1 CCC1");
                        TTV2.setText("Rout 2 CCC2");
                        TTV3.setText("Rout 3 CCC3");
                        TTV4.setText("Rout 4 CCC4");
                        break;
                }
                break;
            // Add cases for other categories as needed
        }
    }

}