package com.example.a15017573.cleanhands;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 15017573 on 20/6/2017.
 */

public class RoleAdapter extends ArrayAdapter<Role> {
    ArrayList<Role> role;
    Context context;
    //int resource;
    TextView tvSelectedRow;

    public RoleAdapter(Context context, int resource, ArrayList<Role> objects){
        super(context, resource, objects);
        this.role = objects;
        this.context = context;

        role = new ArrayList<Role>();
        role.addAll(objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row_role, parent, false);

        // Get the TextView object
        tvSelectedRow = (TextView) rowView.findViewById(R.id.tvSelectedRole);

        Role currentRole = role.get(position);

        tvSelectedRow.setText(currentRole.getRole());

        return rowView;
    }
}
