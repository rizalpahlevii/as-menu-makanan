package me.mydev.menumakanan;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailMakanan extends AppCompatActivity {

    ImageView img_gambarM;
    TextView txt_namaM, txt_hargaM, txt_descM, valQty,txtTotal;

    Button btnIncrease,btnDecrease;

    String namaMakanan, deskripsi, harga;
    int foto,integerNumber = 1,total;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_makanan);

        txt_namaM = findViewById(R.id.txtName);
        txt_descM = findViewById(R.id.txtDescription);
        txt_hargaM = findViewById(R.id.txtPrice);
        valQty = findViewById(R.id.valQty);
        txtTotal = findViewById(R.id.valTotal);
        img_gambarM = findViewById(R.id.imgProduct);

        btnIncrease = findViewById(R.id.increase);
        btnDecrease = findViewById(R.id.decrease);

        btnIncrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                integerNumber++;
                total = Integer.parseInt(txt_hargaM.getText().toString()) * integerNumber;
                txtTotal.setText(String.valueOf(total));
                valQty.setText(String.valueOf(integerNumber));
            }
        });

        btnDecrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                integerNumber--;
                total = Integer.parseInt(txt_hargaM.getText().toString()) * integerNumber;
                txtTotal.setText(String.valueOf(total));
                valQty.setText(String.valueOf(integerNumber));
            }
        });


        // foto makanan
        Bundle bundle =  getIntent().getExtras();
        foto = bundle.getInt(String.valueOf("foto"));
        img_gambarM.setImageResource(foto);



        getInputExtra();
    }

    private String rupiahFormat(int param){
        return "Rp. " + param;
    }


    private void getInputExtra() {
        namaMakanan = getIntent().getStringExtra("nama");
        deskripsi = getIntent().getStringExtra("deskripsi");
        harga = getIntent().getStringExtra("harga");
        Log.i("myLog",getIntent().getStringExtra("harga"));
        setDataActivity(namaMakanan, deskripsi, harga);
    }

    private void setDataActivity(String namaMakanan, String deskripsi, String harga){
        txt_namaM.setText(namaMakanan);
        txt_descM.setText(deskripsi);
        txtTotal.setText(harga);
        txt_hargaM.setText(harga);

    }

}