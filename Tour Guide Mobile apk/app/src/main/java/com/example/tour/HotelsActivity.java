// HotelsActivity.java
package com.example.tour;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class HotelsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);

        // Retrieve the selected category and spot from intent extras
        String category = getIntent().getStringExtra("CATEGORY");
        String spot = getIntent().getStringExtra("SPOT");

        // Populate the hotels based on the selected category and spot
        populateHotels(category, spot);
    }

    private void populateHotels(String category, String spot) {
        TextView hotel1 = findViewById(R.id.hotel1);
        TextView hotel2 = findViewById(R.id.hotel2);
        TextView hotel3 = findViewById(R.id.hotel3);
        TextView hotel4 = findViewById(R.id.hotel4);
        TextView hotel5 = findViewById(R.id.hotel5);
        TextView hotel6 = findViewById(R.id.hotel6);

        // Update hotels based on the selected category and spot
        switch (category) {
            case "DHAKA":
                switch (spot) {
                    case "Lalbagh Fort":
                        hotel1.setText("Hotel Lalbagh1");
                        hotel2.setText("Hotel Lalbagh2");
                        hotel3.setText("Hotel Lalbagh3");
                        hotel4.setText("Hotel Lalbagh4");
                        hotel5.setText("Hotel Lalbagh5");
                        hotel6.setText("Hotel Lalbagh6");
                        break;
                    case "Ahsan Manzil":
                        hotel1.setText("Hotel Ahsan1");
                        hotel2.setText("Hotel Ahsan2");
                        hotel3.setText("Hotel Ahsan3");
                        hotel4.setText("Hotel Ahsan4");
                        hotel5.setText("Hotel Ahsan5");
                        hotel6.setText("Hotel Ahsan6");
                        break;
                    case "Dhakeshwari Temple":
                        hotel1.setText("Hotel Temple1");
                        hotel2.setText("Hotel Temple2");
                        hotel3.setText("Hotel Temple3");
                        hotel4.setText("Hotel Temple4");
                        hotel5.setText("Hotel Temple5");
                        hotel6.setText("Hotel Temple6");
                        break;
                }
                break;
            case "SYLHET":
                switch (spot) {
                    case "Ratargul Swamp Forest":
                        hotel1.setText("Hotel Ratargul1");
                        hotel2.setText("Hotel Ratargul2");
                        hotel3.setText("Hotel Ratargul3");
                        hotel4.setText("Hotel Ratargul4");
                        hotel5.setText("Hotel Ratargul5");
                        hotel6.setText("Hotel Ratargul6");
                        break;
                    case "Jaflong":
                        hotel1.setText("Hotel Jaflong1");
                        hotel2.setText("Hotel Jaflong2");
                        hotel3.setText("Hotel Jaflong3");
                        hotel4.setText("Hotel Jaflong4");
                        hotel5.setText("Hotel Jaflong5");
                        hotel6.setText("Hotel Jaflong6");
                        break;
                    case "Srimangal":
                        hotel1.setText("Hotel Srimangal1");
                        hotel2.setText("Hotel Srimangal2");
                        hotel3.setText("Hotel Srimangal3");
                        hotel4.setText("Hotel Srimangal4");
                        hotel5.setText("Hotel Srimangal5");
                        hotel6.setText("Hotel Srimangal6");
                        break;
                }
                break;
            case "KHULNA":
                switch (spot) {
                    case "Sundarbans":
                        hotel1.setText("Hotel Sundarbans1");
                        hotel2.setText("Hotel Sundarbans2");
                        hotel3.setText("Hotel Sundarbans3");
                        hotel4.setText("Hotel Sundarbans4");
                        hotel5.setText("Hotel Sundarbans5");
                        hotel6.setText("Hotel Sundarbans6");
                        break;
                    case "Khan Jahan Alis Mausoleum":
                        hotel1.setText("Hotel Khan1");
                        hotel2.setText("Hotel Khan2");
                        hotel3.setText("Hotel Khan3");
                        hotel4.setText("Hotel Khan4");
                        hotel5.setText("Hotel Khan5");
                        hotel6.setText("Hotel Khan6");
                        break;
                    case "Shat Gombuj Mosque":
                        hotel1.setText("Hotel Shat1");
                        hotel2.setText("Hotel Shat2");
                        hotel3.setText("Hotel Shat3");
                        hotel4.setText("Hotel Shat4");
                        hotel5.setText("Hotel Shat5");
                        hotel6.setText("Hotel Shat6");
                        break;
                }
                break;
            // Add cases for other categories as needed
        }
    }
}
