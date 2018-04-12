package mx.ipn.cecyt9.examen_primerparcial_juarezsantillan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

        public void validacion(View v){


            EditText tw=(EditText) findViewById(R.id.editText);
            String usuarioobtenido=tw.getText().toString();

            EditText tw2=(EditText) findViewById(R.id.editText2);
            String passwordobtenido=tw2.getText().toString();

        if(usuarioobtenido.equals("1") && passwordobtenido.equals("2")){
        Toast toast1=
            Toast.makeText(getApplicationContext(),
                    "Usuario correcto", Toast.LENGTH_SHORT);

            toast1.show();

        }
        else {

            Toast toast2 =
                    Toast.makeText(getApplicationContext(),
                            "Usuario incorrecto", Toast.LENGTH_SHORT);

            toast2.show();
        }
        }

}
