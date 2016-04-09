package vn.edu.techkids.homeworks_praticebasicwidget_assigment3;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.security.Signature;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button add;
    ScrollView sv;
    ListView lv;
    ArrayAdapter<Employee> array ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView)findViewById(R.id.listView);
       // sv = (ScrollView)findViewById(R.id.scroll);
       add = (Button)findViewById(R.id.btnAddToView);
        add.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent t = new Intent(MainActivity.this, AddActivity.class);
                startActivity(t);
            }
        });
        List<Employee> e = Singleton.getListEmployee();
        array = new ArrayAdapter<Employee>(getApplicationContext(),android.R.layout.simple_list_item_1,e);
        lv.setAdapter(array);



    }



}
