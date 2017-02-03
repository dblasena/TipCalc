package dblasena.cis.tipcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText etnumparty;
    EditText etbill;
    TextView textViewTotal;
    TextView textViewTipPererson;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etnumparty = (EditText) findViewById(R.id.NumPeople);
        etbill = (EditText) findViewById(R.id.Bill);
        textViewTotal = (TextView) findViewById(R.id.TotalTip);
        textViewTipPererson = (TextView) findViewById(R.id.TipPerPerson);
    }




    public void onClickButtonCalculate(View view) {
        double total = Double.parseDouble((etbill).getText().toString());
        double people = Double.parseDouble((etnumparty).getText().toString());

        double tip = total + (total * .1);
        double perperson = tip / people;

        textViewTotal.setText("The total bill is" + tip);
        textViewTipPererson.setText("The total amount per person is" + perperson);
    }
}
