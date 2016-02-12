package phan.studentshares;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Arrays;


public class MainActivity extends AppCompatActivity {

    EditText cname;
    String [] clg = {"BIT","KGP","XISS"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cname=(EditText)findViewById(R.id.et1);
    }

    public void verifyCollege(View v){

        if(Arrays.asList(clg).contains(cname.getText().toString())) {
            Toast.makeText(this,"College name is "+cname.getText().toString(),Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this,"College not in Database",Toast.LENGTH_SHORT).show();
        }

    }
}
