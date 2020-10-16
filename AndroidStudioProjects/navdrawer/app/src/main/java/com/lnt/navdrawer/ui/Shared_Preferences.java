package com.lnt.navdrawer.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.lnt.navdrawer.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Shared_Preferences#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Shared_Preferences extends Fragment {

    SharedPreferences sharedPreferences;

    EditText Name;

    EditText Email;

    public static final String mypreference="mypref";

    public static final String name="namekey";

    public static final String email="emailkey";

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Shared_Preferences() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SharedPreferences.
     */
    // TODO: Rename and change types and number of parameters
    public static Shared_Preferences newInstance(String param1, String param2) {
        Shared_Preferences fragment = new Shared_Preferences();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

        sharedPreferences=getActivity().getSharedPreferences(mypreference, Context.MODE_PRIVATE);


    }

    @Override

    public void onViewCreated(@NonNull final View view, @Nullable Bundle savedInstanceState){

        super.onViewCreated(view,savedInstanceState);

        Name=(EditText)view.findViewById(R.id.Name);

        Email=(EditText)view.findViewById(R.id.EMAIL);
         

        Button clear=(Button)view.findViewById(R.id.button4);

        Button retrieve=(Button)view.findViewById(R.id.button3);

        Button save=(Button)view.findViewById(R.id.button2);

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Name.setText("");

                Email.setText("");
            }

            });

        save.setOnClickListener(new View.OnClickListener(){
                        @Override
                        public void onClick(View v) {
                            String n = Name.getText().toString();

                            String E = Email.getText().toString();

                            SharedPreferences.Editor editor = sharedPreferences.edit();

                            editor.putString(name, n);

                            editor.putString(email, E);

                            editor.commit();

                        }
        });

        retrieve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(sharedPreferences.contains(name)){

                         Name.setText(sharedPreferences.getString(name, ""));
                }

                if(sharedPreferences.contains(email)){

                    Email.setText(sharedPreferences.getString(email,""));
                }

            }
        });

    }



    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_shared_preferences, container, false);
    }


}