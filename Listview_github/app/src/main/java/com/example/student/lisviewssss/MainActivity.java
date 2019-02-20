package com.example.student.lisviewssss;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText edtten;
    ListView lvwds;
    ArrayList<String> arrds;
    ArrayAdapter addds;
    int vitri=1;

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
        lvwds.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                edtten.setText(arrds.get(i));
                vitri=i;
            }
        });
    }

    public void xlthem(View view) {
        String ten=edtten.getText().toString();
        arrds.add(ten);
        addds.notifyDataSetChanged();
    }

    public void xlsua(View view) {
        arrds.set(vitri,edtten.getText().toString());
        Toast.makeText(MainActivity.this,"sua thanh cong",Toast.LENGTH_LONG).show();
        addds.notifyDataSetChanged();
    }
}
