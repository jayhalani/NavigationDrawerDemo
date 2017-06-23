package jay.com.navigationdrawerdemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class nav_first_fragment extends Fragment {

    public final static String TAG = nav_first_fragment.class.getName().toString();

    TextView firstTextView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_nav_first, container, false);

        firstTextView = (TextView) view.findViewById(R.id.firstTextView);
        tempMethod();
        return view;

    }

    public void tempMethod() {
        firstTextView.setText("This is Text from the class 1");
    }

}
