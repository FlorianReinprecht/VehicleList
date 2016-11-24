package at.fh.swengb.vehiclelist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import at.fh.swengb.vehiclelist.model.vehicles.Vehicle;

/**
 * Created by Florian on 23.11.2016.
 */

public class CustomAdapter extends BaseAdapter {


    List<Vehicle> listVehicles;
    Context context;
    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext, List<Vehicle> listVehicles) {
        this.context = applicationContext;
        this.listVehicles= listVehicles;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return listVehicles.size();
    }

    @Override
    public Object getItem(int i) {
        return listVehicles.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view==null) {
            view = inflter.inflate(R.layout.row_item, null);//set layout for displaying items
        }
        TextView viewBrandName=(TextView)view.findViewById(R.id.textViewListName);
        TextView viewColor=(TextView)view.findViewById(R.id.textViewListColor);
        TextView viewOwner=(TextView)view.findViewById(R.id.textViewListOwner);

        Vehicle vehicle = listVehicles.get(i);
        viewBrandName.setText(vehicle.getBrandName()+" "+vehicle.getManuDate());
        viewColor.setText(vehicle.getColor());
        viewOwner.setText(vehicle.getOwner());

        return view;
    }





}
