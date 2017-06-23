package jay.com.navigationdrawerdemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class nav_third_fragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_nav_third, container, false);
        TextView thirdTextView = (TextView) view.findViewById(R.id.thirdTextView);
        thirdTextView.setText("This is Text from the class 3");

        return view;
    }
}
