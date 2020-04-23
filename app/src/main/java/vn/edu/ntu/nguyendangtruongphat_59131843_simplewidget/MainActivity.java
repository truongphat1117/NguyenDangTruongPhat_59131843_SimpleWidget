package vn.edu.ntu.nguyendangtruongphat_59131843_simplewidget;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;


public class MainActivity extends AppCompatActivity {
    Button btnXN;
    EditText edtName, edtDate, edtHB;
    RadioGroup rdgGT;
    CheckBox checkBox1, checkBox2, checkBox3, checkBox4, checkBox5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addViews();
        addEvents();
    }
    private void addViews(){
        btnXN = findViewById(R.id.btnXN);
        edtDate = findViewById(R.id.edtDate);
        edtName = findViewById(R.id.edtName);
        edtHB = findViewById(R.id.edtHB);
        rdgGT = findViewById(R.id.rdgGT);
        checkBox1 = findViewById(R.id.checkBox1);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        checkBox4 = findViewById(R.id.checkBox4);
        checkBox5 = findViewById(R.id.checkBox5);
    }
    private void addEvents(){
        btnXN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hienthi();
            }
        });
    }

    private void hienthi(){
        String text="";
        text += edtName.getText().toString();
        text += "\nNgày sinh:"+ edtDate.getText().toString();

        switch (rdgGT.getCheckedRadioButtonId()){
            case R.id.rdgNam:
                text += "\nGiới tính: nam";
                break;
            case R.id.rdgNu:
                text += "\nGiới tính: nữ";
                break;
        }
        text +="\nSở thích: ";
        if ( checkBox1.isChecked())
            text+=checkBox1.getText().toString()+"; ";
        if ( checkBox2.isChecked())
            text+=checkBox2.getText().toString()+"; ";
        if ( checkBox3.isChecked())
            text+=checkBox3.getText().toString()+"; ";
        if ( checkBox4.isChecked())
            text+=checkBox4.getText().toString()+"; ";
        if ( checkBox5.isChecked())
            text+=checkBox5.getText().toString()+"; ";
        text += edtHB.getText().toString();

        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
    }

}
