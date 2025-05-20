package com.example.tour;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class DetailsFragment extends Fragment {

    private static final String ARG_CATEGORY = "category";
    private static final String ARG_SPOT = "spot";

    private String category;
    private String spot;
    private Button btnHotels;
    private Button btnTransportation;

    public static DetailsFragment newInstance(String category, String spot) {
        DetailsFragment fragment = new DetailsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_CATEGORY, category);
        args.putString(ARG_SPOT, spot);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            category = getArguments().getString(ARG_CATEGORY);
            spot = getArguments().getString(ARG_SPOT);
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_details, container, false);

        ImageView imageView = view.findViewById(R.id.fiv1);
        TextView textView1 = view.findViewById(R.id.ftv1);
        TextView textView2 = view.findViewById(R.id.ftv2);
        btnHotels = view.findViewById(R.id.fbtn1);
        btnTransportation = view.findViewById(R.id.fbtn2);

        // Initially hide the buttons
        btnHotels.setVisibility(View.GONE);
        btnTransportation.setVisibility(View.GONE);

        // Load details based on the spot
        loadDetails(imageView, textView1, textView2);

        btnHotels.setOnClickListener(v -> openHotelsActivity());
        btnTransportation.setOnClickListener(v -> openTransportationActivity());

        return view;
    }

    private void loadDetails(ImageView imageView, TextView textView1, TextView textView2) {
        switch (category) {
            case "DHAKA":
                switch (spot) {
                    case "Lalbagh Fort":
                        imageView.setImageResource(R.drawable.lalbug);
                        textView1.setText(" Lalbagh Fort is an incomplete 17th-century Mughal fort complex located in the southwestern part of Dhaka");
                        textView2.setText("When visiting Lalbagh Fort, you can explore its impressive Mughal architecture, including the grand mosque and the tomb of Pari Bibi, surrounded by beautifully landscaped gardens. The intricate designs and historical artifacts within the fort provide a fascinating insight into Mughal-era craftsmanship and history.");
                        break;
                    case "Ahsan Manzil":
                        imageView.setImageResource(R.drawable.ahsan);
                        textView1.setText(" Ahsan Manzil, also known as the Pink Palace, is a historic building situated on the banks of the Buriganga River.");
                        textView2.setText("At Ahsan Manzil, you can admire the stunning Indo-Saracenic architecture of the Pink Palace and explore its various rooms and halls, which now serve as a museum. The museum exhibits a rich collection of photographs, furniture, and personal items of the Nawab family, offering a glimpse into their opulent lifestyle and the history of Dhaka.");
                        break;
                    case "Dhakeshwari Temple":
                        imageView.setImageResource(R.drawable.dhakesshori);
                        textView1.setText("Dhakeshwari Temple is the most prominent Hindu temple in Dhaka, often regarded as the national temple of Bangladesh");
                        textView2.setText("Visiting Dhakeshwari Temple allows you to experience the spiritual ambiance of this revered Hindu temple. You can observe the intricate carvings and architectural details of the temple complex, participate in or witness traditional Hindu rituals, and enjoy the peaceful surroundings that provide a stark contrast to the hustle and bustle of the city.");
                        break;
                }
                break;
            case "SYLHET":
                switch (spot) {
                    case "Ratargul Swamp Forest":
                        imageView.setImageResource(R.drawable.ratargul);
                        textView1.setText(" Ratargul Swamp Forest is one of the few freshwater swamp forests in Bangladesh, located near Sylhet. Known for its dense vegetation and unique biodiversity");
                        textView2.setText("When visiting Ratargul Swamp Forest, you can explore the tranquil beauty of the submerged forest by boat, navigating through the maze of partially submerged trees and lush vegetation. The serene waters and diverse wildlife, including various species of birds, fish, and reptiles, make it a unique and peaceful destination for nature lovers.");
                        break;
                    case "Jaflong":
                        imageView.setImageResource(R.drawable.jjaf);
                        textView1.setText(" Jaflong is a scenic hill station situated in the Sylhet Division, near the border with India. Renowned for its picturesque landscapes, crystal-clear rivers, and rolling tea gardens");
                        textView2.setText("MIn Jaflong, you can enjoy stunning views of the Khasi hills and the pristine waters of the Dawki River, which is so clear that the boats appear to be floating in mid-air. The area's scenic beauty is enhanced by tea gardens, waterfalls, and stone collection activities along the riverbanks, offering a picturesque and relaxing escape.");
                        break;
                    case "Srimangal":
                        imageView.setImageResource(R.drawable.sri);
                        textView1.setText("Srimangal, often referred to as the \"Tea Capital of Bangladesh,\" is famous for its expansive tea gardens and lush green landscapes");
                        textView2.setText("Visiting Srimangal, you can tour the extensive tea gardens and learn about tea processing at the Tea Research Institute. The area's natural beauty is complemented by the vibrant Lawachara National Park, where you can hike through the rainforest, encounter diverse wildlife, and experience the tranquil atmosphere of this lush, green region.");
                        break;
                }
                break;
            case "KHULNA":
                switch (spot) {
                    case "Sundarbans":
                        imageView.setImageResource(R.drawable.sundarban);
                        textView1.setText("The Sundarbans is the largest mangrove forest in the world, spanning the delta region of the Padma, Meghna, and Brahmaputra river basins");
                        textView2.setText("In the Sundarbans, you can embark on guided boat tours through the winding waterways, observe the majestic Bengal tiger if you're lucky, and spot various other wildlife such as deer, crocodiles, and a multitude of bird species. The lush mangrove forests and the unique ecosystem make for an unforgettable experience in nature.");
                        break;
                    case "Khan Jahan Alis Mausoleum":
                        imageView.setImageResource(R.drawable.khanjahan);
                        textView1.setText(" Located in Bagerhat, near Khulna, the Mausoleum of Khan Jahan Ali is a significant historical site. ");
                        textView2.setText("At Khan Jahan Ali's Mausoleum, you can explore the impressive stone tomb of the saint, stroll around the peaceful complex, and visit the nearby historical mosques. The serene atmosphere, combined with the historical significance of the site, offers a reflective and educational experience.");
                        break;
                    case "Shat Gombuj Mosque":
                        imageView.setImageResource(R.drawable.shatgombuj);
                        textView1.setText("The Shat Gombuj Mosque, also located in Bagerhat, is a UNESCO World Heritage Site and one of the largest and most impressive mosques in Bangladesh.");
                        textView2.setText("Visiting the Shat Gombuj Mosque allows you to marvel at its remarkable sixty domes and intricate terracotta artwork. You can learn about the architectural and historical importance of this 15th-century mosque, and explore the beautiful surroundings of Bagerhat, which include other ancient mosques and historical structures.");
                        break;
                }
                break;
        }

        // Show the buttons after loading the details
        btnHotels.setVisibility(View.VISIBLE);
        btnTransportation.setVisibility(View.VISIBLE);
    }

    private void openHotelsActivity() {
        Intent intent = new Intent(getActivity(), HotelsActivity.class);
        intent.putExtra("CATEGORY", category);
        intent.putExtra("SPOT", spot);
        startActivity(intent);
    }

    private void openTransportationActivity() {
        Intent intent = new Intent(getActivity(), TransportationActivity.class);
        intent.putExtra("CATEGORY", category);
        intent.putExtra("SPOT", spot);
        startActivity(intent);
    }
}
