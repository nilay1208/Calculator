//todo: Implement method to add two number

package nilay.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = "MainActivityDebug";

    private EditText e1,e2;
    private TextView t1;
    private Button b_Add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        e1 = (EditText) findViewById(R.id.editText1);
        e2 = (EditText) findViewById(R.id.editText2);
        t1 = (TextView) findViewById(R.id.textView1);
        b_Add = (Button) findViewById(R.id.button);


        b_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add();
            }
        });


    }


    private void add()
    {
        float x = Float.parseFloat(e1.getText().toString());
        float y = Float.parseFloat(e2.getText().toString());

        float z = x + y;

        t1.setText("The answer is " + z);
        Toast.makeText(this, "Hello the answer is " + z, Toast.LENGTH_SHORT).show();
    }
}
