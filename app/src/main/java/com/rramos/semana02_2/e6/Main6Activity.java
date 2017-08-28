package com.rramos.semana02_2.e6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import com.rramos.semana02_2.R;

public class Main6Activity extends AppCompatActivity {

    private CheckBox checkBox,checkBox2,checkBox3,checkBox4,checkBox5,checkBox6,checkBox7,checkBox8,checkBox9;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);


        checkBox =(CheckBox)findViewById(R.id.checkBox);
        checkBox2 =(CheckBox)findViewById(R.id.checkBox2);
        checkBox3 =(CheckBox)findViewById(R.id.checkBox3);
        checkBox4 =(CheckBox)findViewById(R.id.checkBox4);
        checkBox5 =(CheckBox)findViewById(R.id.checkBox5);
        checkBox6 =(CheckBox)findViewById(R.id.checkBox6);
        checkBox7 =(CheckBox)findViewById(R.id.checkBox7);
        checkBox8 =(CheckBox)findViewById(R.id.checkBox8);
        checkBox9 =(CheckBox)findViewById(R.id.checkBox9);


        // En estas 3 lineas de codigo se define la accion por defecto al comenzar la aplicacion respecto a los checkboz
        //el checkbox con id checkBox se encuentra precionado
        checkBox.setChecked(true);
        //este manda el mensaje "Primer checkbox seleccionado!"
        if(checkBox.isChecked())
            Toast.makeText(this, "Primer checkbox seleccionado!", Toast.LENGTH_LONG).show();
        }


    public void androidCheckBoxClicked(View view) {
        switch (view.getId()){
            case R.id.checkBox:
                if(checkBox.isChecked())
                    Toast.makeText(this, checkBox.getText() + " seleccionado!",  Toast.LENGTH_SHORT).show();
                    break;
            case R.id.checkBox2:
                //En esta linea se hace algo cuando el usuario preciona el checkbox con id: checkBox2, esta logica funcioan con todos ñps cases
                    Toast.makeText(this, checkBox2.getText() + " selected!",  Toast.LENGTH_SHORT).show();
                    break;
            case R.id.checkBox3:

                    Toast.makeText(this, checkBox3.getText() + " Sélectionné!",  Toast.LENGTH_SHORT).show();
                break;
            case R.id.checkBox4:

                    Toast.makeText(this, checkBox4.getText() + " 선택됨!",  Toast.LENGTH_SHORT).show();
                break;
            case R.id.checkBox5:

                    Toast.makeText(this, checkBox5.getText() + " 選択された!",  Toast.LENGTH_SHORT).show();
                break;
            case R.id.checkBox6:

                    Toast.makeText(this, checkBox6.getText() + " Roghnaithe!",  Toast.LENGTH_SHORT).show();
                break;
            case R.id.checkBox7:

                    Toast.makeText(this, checkBox7.getText() + " selezionato!",  Toast.LENGTH_SHORT).show();
                break;
            case R.id.checkBox8:

                    Toast.makeText(this, checkBox8.getText() + " vald!",  Toast.LENGTH_SHORT).show();
                break;
            case R.id.checkBox9:

                    Toast.makeText(this, checkBox9.getText() + " seleccionat!",  Toast.LENGTH_LONG).show();
                break;

        }
    }
}
