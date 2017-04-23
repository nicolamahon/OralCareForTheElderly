package com.projects.nicola.oralcarefortheelderly;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class PageFragment extends Fragment {
    TextView textView;


    public PageFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.page_fragment_layout, container, false);
        textView = (TextView)view.findViewById(R.id.dryMouthInfo);
        Bundle bundle = getArguments();
        //String message = Integer.toString(bundle.getInt("count"));

        String message = bundle.getString("dryMouth");
        //textView.setText("This is the "+message+" Swipe View Page...");
        textView.setText(message);
        return view;
    }

}
