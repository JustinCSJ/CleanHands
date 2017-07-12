package com.example.a15017573.cleanhands;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentRole extends Fragment {
    ListView lv;
    RoleAdapter aa;

    public FragmentRole() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_role, container, false);

        Role a = new Role("test");

        lv = (ListView) view.findViewById(R.id.lvRole);

        ArrayList<Role> role = new ArrayList<Role>();
        role.add(a);

        aa = new RoleAdapter(getActivity(), R.layout.row_role,role);

        //ArrayAdapter<String> aaRole = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, roles);

        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });

        return view;
    }

}
