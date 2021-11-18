package com.akshay.navdemo1;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.akshay.navdemo1.ui.main.MainFragment;
//dsnfkfnqlql
public class SecondFragment extends Fragment {

    public SecondFragment() {
        // Required empty public constructor
    }

    public static SecondFragment newInstance() {
        return new SecondFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        SecondFragmentArgs secondFragmentArgs = SecondFragmentArgs.fromBundle(getArguments());
        String username = secondFragmentArgs.getUsername();
        TextView textView = getView().findViewById(R.id.textMessage);
        textView.setText(username);
    }
}