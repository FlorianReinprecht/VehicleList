package at.fh.swengb.vehiclelist;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import at.fh.swengb.vehiclelist.model.vehicles.Vehicle;

public class ShowVehicleActivity extends AppCompatActivity {
    private Vehicle vehicle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_vehicle);

        Intent intent = getIntent();
        vehicle = (Vehicle) intent.getExtras().get("vehicle");

        TextView viewBrandName = (TextView) findViewById(R.id.textViewBrandName);
        TextView viewManuDate = (TextView) findViewById(R.id.textViewManuDate);
        TextView viewColor = (TextView) findViewById(R.id.textViewColor);
        TextView viewOwner = (TextView) findViewById(R.id.textViewOwner);

        viewBrandName.setText(vehicle.getBrandName());
        int manuDate = vehicle.getManuDate();
        String manuString = String.valueOf(manuDate);
        viewManuDate.setText(manuString);
        viewColor.setText(vehicle.getColor());
        viewOwner.setText(vehicle.getOwner());

    }

    public void searchBrand(View view) {
        String searchBrand = vehicle.getBrandName();
        Intent brandIntent = new Intent(Intent.ACTION_WEB_SEARCH);
        brandIntent.putExtra(SearchManager.QUERY,searchBrand);
        startActivity(brandIntent);
    }

    public void searchOwner(View view) {
        String searchOwner = vehicle.getOwner();
        Intent ownerIntent = new Intent(Intent.ACTION_WEB_SEARCH);
        ownerIntent.putExtra(SearchManager.QUERY,searchOwner);
        startActivity(ownerIntent);
    }

}
