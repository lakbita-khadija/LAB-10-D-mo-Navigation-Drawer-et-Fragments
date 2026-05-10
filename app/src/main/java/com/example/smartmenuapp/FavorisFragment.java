package com.example.smartmenuapp;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import androidx.annotation.Nullable;
import androidx.fragment.app.ListFragment;

public class FavorisFragment extends ListFragment {

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        String[] favoris = {
                "Cours Android",
                "Projet Java",
                "Interface Mobile",
                "Menu Navigation",
                "Fragments",
                "Application Finale"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                requireActivity(),
                android.R.layout.simple_list_item_1,
                favoris
        );

        setListAdapter(adapter);
    }
}