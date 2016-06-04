package id.ac.unsyiah.elektro.mobile.meshopp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;



public class ListActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Daftar Pilihan");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ListView listView = (ListView) findViewById(R.id.listView);



    }


    @Override
           public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);


        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if(id==android.R.id.home){
            Intent c = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(c);
        }

        else if(id==R.id.action_about){
            Intent c = new Intent(getApplicationContext(), AboutActivity.class);
            startActivity(c);
        }
        return true;
    }


}
