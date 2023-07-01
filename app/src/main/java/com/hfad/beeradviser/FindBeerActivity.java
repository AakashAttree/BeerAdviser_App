package com.hfad.beeradviser;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.media.MediaPlayer;
import android.view.View;
import java.util.List;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class FindBeerActivity extends Activity {
    protected Button brands;
protected BeerExpert expert=new BeerExpert();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }
    //calls when the botton is clicked in layout by user
    public void onClickFindBeer(View view) {


        TextView brands = (TextView) findViewById(R.id.brands);
        Spinner color = (Spinner) findViewById(R.id.color);
        String beerType = String.valueOf(color.getSelectedItem());
        List<String> brandsList = expert.getBrands(beerType);
        StringBuilder brandsFormat = new StringBuilder();
        for(String brand : brandsList){
            brandsFormat.append(brand).append('\n');
        }
        brands.setText(brandsFormat);
    }
}