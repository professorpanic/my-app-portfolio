package com.udacity.professorpanic.myappportfolio;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import android.widget.Toast;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = (View) inflater.inflate(R.layout.portfolio_fragment_main, container, false);

        Button spotifyAppButton = (Button) v.findViewById(R.id.spotify_streamer_button);
        spotifyAppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getApplicationContext(), "This button will launch my spotify streamer app!",
                        Toast.LENGTH_LONG).show();
            }
        });

        Button libraryAppButton = (Button) v.findViewById(R.id.library_app_button);
        libraryAppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getApplicationContext(), "This button will launch my library app!",
                        Toast.LENGTH_LONG).show();
            }
        });

        Button scoresAppButton = (Button) v.findViewById(R.id.scores_app_button);
        scoresAppButton.setOnClickListener(new View.OnClickListener() {
                                               @Override
                                               public void onClick(View v) {
                                                   Toast.makeText(getActivity().getApplicationContext(), "This button will launch my scores app!",
                                                           Toast.LENGTH_LONG).show();
                                               }
                                           });
        Button buildItBiggerAppButton = (Button) v.findViewById(R.id.build_it_bigger_button);
                buildItBiggerAppButton.setOnClickListener(new View.OnClickListener() {
                                                              @Override
                                                              public void onClick(View v) {
                                                                  Toast.makeText(getActivity().getApplicationContext(), "This button will launch my build it bigger app!",
                                                                          Toast.LENGTH_LONG).show();
                                                              }
                                                          });
        Button xYZAppButton = (Button) v.findViewById(R.id.xyz_reader_button);
                        xYZAppButton.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View v) {
                                                                Toast.makeText(getActivity().getApplicationContext(), "This button will launch my xyz reader app!",
                                                                        Toast.LENGTH_LONG).show();
                                                            }
                                                        });

        Button capStoneAppButton = (Button) v.findViewById(R.id.capstone_button);
                        capStoneAppButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(getActivity().getApplicationContext(), "This button will launch my capstone app!",
                                        Toast.LENGTH_LONG).show();
                            }
                        });

        return v;
    }
}
