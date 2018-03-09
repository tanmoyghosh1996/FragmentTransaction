package com.example.tanmoy.fragmenttransaction;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {
EditText fname, lname;
Button b1;

    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {  //Called when the fragment's activity has been created
        super.onActivityCreated(savedInstanceState);

        fname=(EditText)getActivity().findViewById(R.id.fname);
        lname=(EditText)getActivity().findViewById(R.id.lname);
        b1=(Button)getActivity().findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fstname = fname.getText().toString();
                String lstname = lname.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString("Firstname", fstname);
                bundle.putString("Lastname", lstname);

                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                ShowFragment showFragment = new ShowFragment();
                showFragment.setArguments(bundle);
                fragmentTransaction.replace(R.id.f1, showFragment);
                fragmentTransaction.commit();
            }
        });
    }
}
