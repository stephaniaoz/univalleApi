package univalleapi.tutorial.com.univalleapi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnInicioApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnInicioApi = (Button) findViewById(R.id.btn_inicio);

        btnInicioApi.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                openContenidoUniversidad();
            }
        });

    }

    public void openContenidoUniversidad(){

        Intent i = new Intent(this, MenuOpciones.class);
        startActivity(i);

    }
}
