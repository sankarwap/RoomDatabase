package bala.roomdatabase.fragmnet;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import bala.roomdatabase.activity.MainActivity;
import bala.roomdatabase.R;
import bala.roomdatabase.User;


/**
 * A simple {@link Fragment} subclass.
 */
public class AddFragment extends Fragment {

    EditText  name, mail;
    Button save;

    public AddFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_add, container, false);

//        id = (EditText) view.findViewById(R.id.id);
        name = (EditText) view.findViewById(R.id.name);
        mail = (EditText) view.findViewById(R.id.mail);
        save = (Button) view.findViewById(R.id.save);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                int ids=Integer.parseInt(id.getText().toString());
                String names=name.getText().toString();
                String mails=mail.getText().toString();

                User user=new User();
//                user.setId(ids);
                user.setMail(mails);
                user.setName(names);
                MainActivity.myAppDatabase.myDao().addUser(user);

                Toast.makeText(getActivity(), "add successfully", Toast.LENGTH_SHORT).show();
                name.setText("");
                mail.setText("");
            }
        });


        return view;
    }

}
