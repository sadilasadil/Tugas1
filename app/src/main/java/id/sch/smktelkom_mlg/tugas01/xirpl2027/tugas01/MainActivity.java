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
    TextView tvHasil; //tvHasil2, tvHasil3, tvHasil4;
    //RadioButton rbMale, rbFemale;
    //CheckBox cbM, cbD, cbBAM;
    //Spinner sK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.editText);
        bDaftar = (Button) findViewById(R.id.button);
        tvHasil = (TextView) findViewById(R.id.textView4);
        /*rbFemale = (RadioButton) findViewById(R.id.radioButton2);
        rbMale = (RadioButton) findViewById(R.id.radioButton);
        tvHasil2 = (TextView) findViewById(R.id.textView);
        cbM = (CheckBox) findViewById(R.id.checkBox);
        cbD = (CheckBox) findViewById(R.id.checkBox2);
        cbBAM = (CheckBox) findViewById(R.id.checkBox3);
        tvHasil3 = (TextView) findViewById(R.id.textView6);
        sK = (Spinner) findViewById(R.id.spinner);
        tvHasil4 = (TextView) findViewById(R.id.textView7);*/

        bDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doProcess();
                //doClick();
            }
        });
    }

    /*private void doClick() {
        String hasil2 = null;

        if (rbMale.isChecked()) {
            hasil2 = rbMale.getText().toString();
        } else if (rbFemale.isChecked()) {
            hasil2 = rbFemale.getText().toString();
        }
        if (hasil2 == null) {
            tvHasil2.setText("Gender : Belum memilih gender");
        } else {
            tvHasil2.setText("\nGender : " + hasil2);
        }
        String hasil3 = "Keahlian : ";
        int startlen = hasil3.length();
        if (cbM.isChecked()) hasil3 += cbM.getText() + "\n";
        if (cbD.isChecked()) hasil3 += cbD.getText() + "\n";
        if (cbBAM.isChecked()) hasil3 += cbBAM.getText() + "\n";

        if (hasil3.length() == startlen) hasil3 += "Tidak ada pilihan";
        tvHasil3.setText(hasil3);

        tvHasil4.setText("Anda akan melakukan seleksi di kota : " + sK.getSelectedItem().toString());
    }*/

    private void doProcess() {
        if (isValid()) {
            String nama = etNama.getText().toString();
            tvHasil.setText("Selamat! " + nama + "\nAnda Telah Berhasil Mendaftar");
        }
    }

    private boolean isValid() {
        boolean valid = true;

        String nama = etNama.getText().toString();

        if (nama.isEmpty()) {
            etNama.setError("Nama belum diisi");
            valid = false;
        } else if (nama.length() < 5) {
            etNama.setError("Nama minimal 5 karakter");
            valid = false;
        } else {
            etNama.setError(null);
        }
        return valid;
    }
}
