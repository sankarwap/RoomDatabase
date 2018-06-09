package bala.roomdatabase.fragmnet;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.List;
import bala.roomdatabase.R;
import bala.roomdatabase.User;
import bala.roomdatabase.activity.MainActivity;


/**
 * A simple {@link Fragment} subclass.
 */
public class DeleteFragment extends Fragment {
    EditText idss;
    Button delete;


    public DeleteFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_delete, container, false);

        idss = (EditText) view.findViewById(R.id.id);
        delete = (Button) view.findViewById(R.id.delete);





        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int ids = Integer.parseInt(idss.getText().toString());
                List<User> users= MainActivity.myAppDatabase.myDao().getUsers();
                for(User usr:users) {
                    int id = usr.getId();
                    if(id==ids){
                        User delusers= new User();
                        delusers.setId(ids);
                        MainActivity.myAppDatabase.myDao().deleteuser(delusers);
                        Toast.makeText(getActivity(), "Data delete Successfully", Toast.LENGTH_SHORT).show();
                        idss.setText("");
                    }
                }

            }
        });


        return view;
    }

}
