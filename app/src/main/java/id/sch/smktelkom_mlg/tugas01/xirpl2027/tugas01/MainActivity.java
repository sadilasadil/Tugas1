package id.sch.smktelkom_mlg.tugas01.xirpl2027.tugas01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etNama;
    Button bDaftar;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.editText);
        bDaftar = (Button) findViewById(R.id.button);
        tvHasil = (TextView) findViewById(R.id.textView4);


        bDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = etNama.getText().toString();
                tvHasil.setText("Selamat!" + nama + "\nAnda Telah Berhasil Mendaftar");
            }
        });
    }
}
