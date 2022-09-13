package com.example.shopping;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainMenuFavoriteFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.fragment_main_menu_favorite, container, false);

        ListView lv_favorite = rootView.findViewById(R.id.list_favorite);
        String[] values = {"알림1","알림2","알림3","알림4","알림5","알림6","알림7","알림8"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, values);
        lv_favorite.setAdapter(adapter);

        return rootView;
    }
}