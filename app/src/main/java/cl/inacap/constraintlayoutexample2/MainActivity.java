package cl.inacap.constraintlayoutexample2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etUsuario;
    private EditText etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(), "Resumido!", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        /* NUESTRO CÓDIGO */
    }

    public void validarUsuario(View view) {
        Intent intento = new Intent(this, ResultActivity.class);

        etUsuario = (EditText) findViewById(R.id.etUsuario);
        etPassword = (EditText) findViewById(R.id.etPassword);

        intento.putExtra("elUsuario", etUsuario.getText().toString());
        intento.putExtra("elPassword", etPassword.getText().toString());

        startActivity(intento);

    }
}
