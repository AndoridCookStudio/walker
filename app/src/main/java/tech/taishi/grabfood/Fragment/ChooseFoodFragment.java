package tech.taishi.grabfood.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import tech.taishi.grabfood.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ChooseFoodFragment extends Fragment {


	public ChooseFoodFragment() {
		// Required empty public constructor
	}


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		return inflater.inflate(R.layout.fragment_choose_food, container, false);
	}

}
