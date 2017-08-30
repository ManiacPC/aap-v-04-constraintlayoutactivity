package cl.inacap.constraintlayoutexample2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    private TextView tvResultadoLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intentoActual = getIntent();

        Bundle valores = intentoActual.getExtras();

        String usuarioCorrecto = "abc@def.com";
        String passwordCorrecto = "12345";
        String usuarioIngresado = (String) valores.get("elUsuario");
        String passwordIngresado = (String) valores.get("elPassword");

        tvResultadoLogin = (TextView) findViewById(R.id.tvResultadoLogin);

        if(usuarioIngresado.equals(usuarioCorrecto) && passwordIngresado.equals(passwordCorrecto))
        {
            tvResultadoLogin.setText("El usuario ha autenticado exitosamente");
        } else {
            tvResultadoLogin.setText("Los datos ingresados son incorrectos");
        }

    }
}
