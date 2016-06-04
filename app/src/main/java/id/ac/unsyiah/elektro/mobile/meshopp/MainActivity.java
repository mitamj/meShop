package id.ac.unsyiah.elektro.mobile.meshopp;

import java.util.ArrayList;
import java.util.HashMap;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;

public class MainActivity extends Activity {

    private ExpandableListView expListView;
    private ListAdapterExpandable adapter;

    // declare array List for all headers in list
    ArrayList<String> headersArrayList = new ArrayList<String>();

    // Declare Hash map for all headers and their corresponding values
    HashMap<String, ArrayList<String>> childArrayList = new HashMap<String, ArrayList<String>>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        expListView = (ExpandableListView) findViewById(R.id.expListView);

        // add headers values
        headersArrayList.add("Pakaian Wanita");
        headersArrayList.add("Pakaian Pria");

        // add add child content
        ArrayList<String> wanitaArrayList = new ArrayList<String>();
        wanitaArrayList.add("Atasan");
        wanitaArrayList.add("Bawahan");
        wanitaArrayList.add("Aksesoris");


        childArrayList.put("Pakaian Wanita", wanitaArrayList);

        ArrayList<String> priaArrayList = new ArrayList<String>();
        priaArrayList.add("Atasan");
        priaArrayList.add("Bawahan");
        priaArrayList.add("Aksesoris");

        childArrayList.put("Pakaian Pria", priaArrayList);


        // declare adapter

        adapter = new ListAdapterExpandable(this, headersArrayList,
                childArrayList);

        expListView.setAdapter(adapter);

        expListView.setOnChildClickListener(new OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {

                if (groupPosition == 0) {

                    if (childPosition == 0) {
                        Intent c = new Intent(getApplicationContext(), ListActivity.class);
                        startActivity(c);
                    }
                   if (childPosition == 1) {
                        Intent c = new Intent(getApplicationContext(), ListActivity.class);
                        startActivity(c);
                    }
                   if (childPosition == 2) {
                        Intent c = new Intent(getApplicationContext(), ListActivity.class);
                        startActivity(c);
                    }
                }
                if (groupPosition == 1) {

                    if (childPosition == 0) {
                        Intent c = new Intent(getApplicationContext(), ListActivity.class);
                        startActivity(c);
                    }
                    if (childPosition == 1) {
                        Intent c = new Intent(getApplicationContext(), ListActivity.class);
                        startActivity(c);
                    }
                    if (childPosition == 2) {
                        Intent c = new Intent(getApplicationContext(), ListActivity.class);
                        startActivity(c);
                    }

                }
                return false;
            }
        });


        expListView.setOnGroupCollapseListener(new OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {
                // TODO: Do your stuff

            }
        });

        expListView.setOnGroupExpandListener(new OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {
                // TODO: Do your stuff


            }
        });
    }
    }
