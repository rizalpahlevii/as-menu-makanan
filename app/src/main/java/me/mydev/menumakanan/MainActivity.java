package me.mydev.menumakanan;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rec_Makanan;
    private ArrayList <Kuliner> listMakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rec_Makanan = findViewById(R.id.rec_Makanan);
        initData();

        // memanggil class KulinerAdapter agar menu muncul
        rec_Makanan.setAdapter(new KulinerAdapter(listMakanan));
        rec_Makanan.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initData() {
        this.listMakanan = new ArrayList<>();
        listMakanan.add(new Kuliner("Pecel Lele",
                "15000",
                "Pecel lele dengan bumbu kacang resep turun temurun",
                R.drawable.peclele));

        listMakanan.add(new Kuliner("Nasi Goreng Mercon",
                "14500",
                "Nasi goreng mercon yang tingkat kepedesannya bisa kamu pilih sesuai yang kalian mau",
                R.drawable.nasgor));

        listMakanan.add(new Kuliner("Ayam Geprek Keju",
                "20000",
                "Ayam geprek dengan keju meleleh di atasnya",
                R.drawable.geprekkeju));
        listMakanan.add(new Kuliner("Kari Ayam",
                "17500",
                "Ayam dengan bumbu kari khas resep turun temurun",
                R.drawable.kareayam));
        listMakanan.add(new Kuliner("Tahu Bulat",
                "500",
                "Tahu bulat dengan sambal yang cocok buat kalian ngemeal",
                R.drawable.tahubulat));
        listMakanan.add(new Kuliner("Salad Buah",
                "12000",
                "Salad dengan berbagai macam sayuran segar",
                R.drawable.salad));
    }


}