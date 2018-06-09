package bala.roomdatabase.fragmnet;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import bala.roomdatabase.activity.MainActivity;
import bala.roomdatabase.R;
import bala.roomdatabase.User;


/**
 * A simple {@link Fragment} subclass.
 */
public class ReadFragment extends Fragment {

    TextView infos;
    public ReadFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_read, container, false);
        infos=(TextView)view.findViewById(R.id.info);
        List<User> users= MainActivity.myAppDatabase.myDao().getUsers();
        String info=" ";
        for(User usr:users){
            int id=usr.getId();
            String name=usr.getName();
            String emai=usr.getMail();
            info=info+"\n\n"+"id :"+id+"\n name:"+name+"\n Emai :"+emai;


        }
        infos.setText(info);

      return  view;
    }

}
