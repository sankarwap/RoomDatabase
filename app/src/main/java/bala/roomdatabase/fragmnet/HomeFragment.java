package bala.roomdatabase.fragmnet;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import bala.roomdatabase.activity.MainActivity;
import bala.roomdatabase.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener {

    Button add,viewss,update,delete;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_home, container, false);

        add=(Button)view.findViewById(R.id.add);
        viewss=(Button)view.findViewById(R.id.view);
        update=(Button)view.findViewById(R.id.update);
        delete=(Button)view.findViewById(R.id.delete);

        add.setOnClickListener(this);
        viewss.setOnClickListener(this);
        update.setOnClickListener(this);
        delete.setOnClickListener(this);



    return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.add:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.frame_layout,new AddFragment()).addToBackStack(null).commit();
            break;
            case R.id.view:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.frame_layout,new ReadFragment()).addToBackStack(null).commit();
                break;
            case R.id.delete:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.frame_layout,new DeleteFragment()).addToBackStack(null).commit();
                break;
            case R.id.update:
                MainActivity.fragmentManager.beginTransaction().replace(R.id.frame_layout,new UpdateFragment()).addToBackStack(null).commit();
                break;

        }

    }
}
