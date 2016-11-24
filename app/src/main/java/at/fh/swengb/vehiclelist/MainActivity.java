package at.fh.swengb.vehiclelist;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import at.fh.swengb.vehiclelist.model.vehicles.Car;
import at.fh.swengb.vehiclelist.model.vehicles.Motorcycle;
import at.fh.swengb.vehiclelist.model.vehicles.Truck;
import at.fh.swengb.vehiclelist.model.vehicles.Vehicle;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private List<Vehicle> listVehicles;
    private ListView myListView;
    private CustomAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myListView = (ListView) findViewById(R.id.myVehicleList);
        listVehicles = new ArrayList<>();

        listVehicles = new ArrayList<>();
        listVehicles.add(new Motorcycle("Honda",2000,"grey",2,"Florian",12345,false));
        listVehicles.add(new Truck("MAN",2012,"red",4,"Peter",122,2));
        listVehicles.add(new Motorcycle("Kawasaki",2012,"green",2,"Walter",664,false));
        listVehicles.add(new Motorcycle("Honda",2000,"grey",2,"Florian",12345,false));
        listVehicles.add(new Car("VW",1999,"green",4,"Rudolf",45321,5));
        listVehicles.add(new Car("VW",1996,"white",4,"Stefan",67890,5));
        listVehicles.add(new Truck("Steyr",1970,"red",4,"Peter",112,2));
        listVehicles.add(new Truck("MAN",2012,"red",4,"Peter",122,2));
        myAdapter = new CustomAdapter(this,listVehicles);

        myListView.setAdapter(myAdapter);
        myListView.setOnItemClickListener(this);

    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Vehicle selectedVehicle = listVehicles.get(i);
        Intent intent = new Intent(view.getContext(),ShowVehicleActivity.class);
        intent.putExtra("vehicle",selectedVehicle);
        startActivity(intent);

    }

}
