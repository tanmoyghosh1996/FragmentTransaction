package com.example.tanmoy.fragmenttransaction;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ShowFragment extends Fragment {
TextView name;

    public ShowFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_show, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {  //Called when the fragment's activity has been created
        super.onActivityCreated(savedInstanceState);

        Bundle bundle = getArguments();
        String fstname = bundle.getString("Firstname");
        String lstname = bundle.getString("Lastname");
        String name1 = fstname+lstname;

        name=(TextView) getActivity().findViewById(R.id.name);
        name.setText(name1);

    }

}
