package vn.edu.techkids.homeworks_praticebasicwidget_assigment3;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class AddActivity extends AppCompatActivity {
    TextView sinhNhat;
    EditText name;
    EditText age;
    EditText ngaySinh;
    Button add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        initWidget();
    }
    public void initWidget(){
        name = (EditText)findViewById(R.id.editName);
        age = (EditText)findViewById(R.id.editAge);
        sinhNhat = (TextView)findViewById(R.id.txtNgaySinh);

        ngaySinh = (EditText)findViewById(R.id.editNgaySinh);
        add = (Button)findViewById(R.id.btnAddToMain);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sinhNhat = ngaySinh.getText().toString();
                int tuoi = Integer.parseInt(age.getText().toString());
                String ten = name.getText().toString();
                Intent intent = new Intent(AddActivity.this, MainActivity.class);
                startActivity(intent);
                Singleton.getListEmployee().add(new Employee(sinhNhat, tuoi, ten));

            }
        });
    }

}
