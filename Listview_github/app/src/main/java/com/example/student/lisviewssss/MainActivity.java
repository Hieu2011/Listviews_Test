package com.example.student.lisviewssss;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText edtten;
    ListView lvwds;
    ArrayList<String> arrds;
    ArrayAdapter addds;

    void anhxa(){
        lvwds=findViewById(R.id.lvw_ds);
        edtten=findViewById(R.id.edt_ten);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa();
        arrds=new ArrayList<>();
        arrds.add("My");
        arrds.add("Luyen");
        arrds.add("Phuong");
        arrds.add("Nhan");
        addds=new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,arrds);
        lvwds.setAdapter(addds);
    }

    public void xlthem(View view) {
        String ten=edtten.getText().toString();
        arrds.add(ten);
        addds.notifyDataSetChanged();
    }
}
