package mcm.edu.ph.solis_basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnadd, btnsub, btndiv, btnmult, btnmodulo;

        btnadd = findViewById(R.id.btnadd);
        btnsub = findViewById(R.id.btnsub);
        btndiv = findViewById(R.id.btndiv);
        btnmult = findViewById(R.id.btnmult);
        btnmodulo = findViewById(R.id.btnmodulo);


        btnadd.setOnClickListener(this);
        btnsub.setOnClickListener(this);
        btndiv.setOnClickListener(this);
        btnmult.setOnClickListener(this);
        btnmodulo.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {

        EditText txtOperand1, txtOperand2;
        TextView txtAnswer;

        txtOperand1 = findViewById(R.id.txtOperand1);
        txtOperand2 = findViewById(R.id.txtOperand2);
        txtAnswer = findViewById(R.id.textView9);

        Double op1 = 0.0;
        Double op2 = 0.0;
        Double answer = 0.0;

        op1 = Double.parseDouble(txtOperand1.getText().toString());
        op2 = Double.parseDouble(txtOperand2.getText().toString());

        switch (v.getId()) {
            case R.id.btnadd:
                answer = op1 + op2;
                txtAnswer.setText(Double.toString(answer));
                break;
            case R.id.btnsub:
                answer = op1 - op2;
                txtAnswer.setText(Double.toString(answer));
                break;
            case R.id.btndiv:
                answer = op1 / op2;
                txtAnswer.setText(Double.toString(answer));
                break;
            case R.id.btnmult:
                answer = op1 * op2;
                txtAnswer.setText(Double.toString(answer));
                break;
            case R.id.btnmodulo:
                answer = op1 % op2;
                txtAnswer.setText(Double.toString(answer));
                break;
        }

    }

}
