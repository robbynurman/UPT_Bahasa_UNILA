package com.ta.myapplication;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Level1 extends Fragment {

    public Level1(){}
    ListView listView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.level_1, container, false);
        listView =(ListView) rootView.findViewById(R.id.list);

        getActivity().setTitle("TOEFEL Level 1");

        String[] values = new String[] {
                "Unit 1",
                "Unit 2",
                "Unit 3",
                "Unit 4",
                "Unit 5",
                "Unit 6"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, android.R.id.text1, values);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                listView.getItemAtPosition(position);
                if (position == 0) {
                    PDF_Reader sampleFragment = new PDF_Reader();
                    Bundle args = new Bundle();
                    args.putInt("key", 0);
                    sampleFragment.setArguments(args);
                    assert getFragmentManager() != null;
                    getFragmentManager()
                            .beginTransaction()
                            .replace(R.id.content, sampleFragment)
                            .addToBackStack(null)
                            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                            .commit();

                }
                else if (position == 1) {
                    PDF_Reader sampleFragment = new PDF_Reader();
                    Bundle args = new Bundle();
                    args.putInt("key", 1);
                    sampleFragment.setArguments(args);
                    assert getFragmentManager() != null;
                    getFragmentManager()
                            .beginTransaction()
                            .replace(R.id.content, sampleFragment)
                            .addToBackStack(null)
                            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                            .commit();
                }
                else if (position == 2) {
                    PDF_Reader sampleFragment = new PDF_Reader();
                    Bundle args = new Bundle();
                    args.putInt("key", 2);
                    sampleFragment.setArguments(args);
                    assert getFragmentManager() != null;
                    getFragmentManager()
                            .beginTransaction()
                            .replace(R.id.content, sampleFragment)
                            .addToBackStack(null)
                            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                            .commit();
                }
                else if (position == 3) {
                    PDF_Reader sampleFragment = new PDF_Reader();
                    Bundle args = new Bundle();
                    args.putInt("key", 3);
                    sampleFragment.setArguments(args);
                    assert getFragmentManager() != null;
                    getFragmentManager()
                            .beginTransaction()
                            .replace(R.id.content, sampleFragment)
                            .addToBackStack(null)
                            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                            .commit();
                }
                else if (position == 4) {
                    PDF_Reader sampleFragment = new PDF_Reader();
                    Bundle args = new Bundle();
                    args.putInt("key", 4);
                    sampleFragment.setArguments(args);
                    assert getFragmentManager() != null;
                    getFragmentManager()
                            .beginTransaction()
                            .replace(R.id.content, sampleFragment)
                            .addToBackStack(null)
                            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                            .commit();
                }
                else if (position == 5) {
                    PDF_Reader sampleFragment = new PDF_Reader();
                    Bundle args = new Bundle();
                    args.putInt("key", 5);
                    sampleFragment.setArguments(args);
                    assert getFragmentManager() != null;
                    getFragmentManager()
                            .beginTransaction()
                            .replace(R.id.content, sampleFragment)
                            .addToBackStack(null)
                            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                            .commit();
                }
                else if (position == 6) {
                    PDF_Reader sampleFragment = new PDF_Reader();
                    Bundle args = new Bundle();
                    args.putInt("key", 6);
                    sampleFragment.setArguments(args);
                    assert getFragmentManager() != null;
                    getFragmentManager()
                            .beginTransaction()
                            .replace(R.id.content, sampleFragment)
                            .addToBackStack(null)
                            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                            .commit();
                }}});
                return  rootView;
    }}