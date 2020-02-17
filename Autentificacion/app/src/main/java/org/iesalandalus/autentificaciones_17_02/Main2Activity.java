package org.iesalandalus.autentificaciones_17_02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView tvCorreo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tvCorreo=findViewById(R.id.tvCorreo);
        Bundle datos=getIntent().getExtras();
        String mail=datos.getString(MainActivity.MAIL);
        tvCorreo.setText(mail);
    }
    public void logout(View v){
        setResult(RESULT_OK);
        finish();
    }
}
