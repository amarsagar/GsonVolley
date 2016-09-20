package adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.amar.webapi.Contacts;
import com.example.amar.webapi.R;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by amar on 9/8/2016.
 */
public class InfoAdapter extends ArrayAdapter {

    ArrayList<Contacts>contact;
    Context context;
    public InfoAdapter(Context context, int resource, ArrayList<Contacts>contact) {
        super(context, resource,contact);
        this.contact=contact;
        this.context=context;

    }

    @Override
    public int getCount() {
        return contact.size();
    }

    @Override
    public Contacts getItem(int position) {
        return contact.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView= LayoutInflater.from(context).inflate(R.layout.listdata,null);
        TextView name=(TextView)convertView.findViewById(R.id.dispName);
        TextView address=(TextView)convertView.findViewById(R.id.dispAdress);
        TextView email=(TextView)convertView.findViewById(R.id.dispEmail);
        TextView gender=(TextView)convertView.findViewById(R.id.dispGender);
        TextView id=(TextView)convertView.findViewById(R.id.dispId);
        TextView mobile=(TextView)convertView.findViewById(R.id.dispHome);
        TextView office=(TextView)convertView.findViewById(R.id.dispOffice);
        TextView home=(TextView)convertView.findViewById(R.id.dispHome);


        Contacts contact=getItem(position);
        name.setText(contact.getName());
        address.setText(contact.getAddress());
        email.setText(contact.getEmail());
        id.setText(contact.getId());
        gender.setText(contact.getGender());
        home.setText(contact.getPhonenumbers().getHome());
        office.setText(contact.getPhonenumbers().getOffice());
        mobile.setText(contact.getPhonenumbers().getMobile());


        return(convertView);
    }
    public void notifyData(ArrayList<Contacts> contact) {
        this.contact = contact;
        notifyDataSetChanged();
    }
}
