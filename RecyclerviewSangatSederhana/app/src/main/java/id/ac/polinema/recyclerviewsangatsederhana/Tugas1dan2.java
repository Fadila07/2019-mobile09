package id.ac.polinema.recyclerviewsangatsederhana;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.recyclerviewsangatsederhana.adapters.WisataAdapter;
import id.ac.polinema.recyclerviewsangatsederhana.models.Wisata;

public class Tugas1dan2 extends AppCompatActivity {
    RecyclerView rvwisata;
    List<Wisata> wisataList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugas1dan2);
        rvwisata = findViewById(R.id.rvwisata);

        Wisata wisata = new Wisata("Pantai Balekambang", "Jalan Balekambang, Balaikambang, Srigonco, Bantur, Malang", "Harga Tiket : Rp10000",R.drawable.balekambang);
        wisataList.add(wisata);

        wisata = new Wisata("Pantai Batu Bengkung", "Jalur Lintas Selatan, RT.42/RW.05, Hutan, Gajahrejo, Gedangan, Malang", "Harga Tiket : Rp7500", R.drawable.batubengkung);
        wisataList.add(wisata);

        wisata = new Wisata("Pantai Ngliyep", "Desa Kedungsalam, Donomulyo, Hutan, Kedungsalam, Donomulyo, Malang", "Harga Tiket : Rp15000", R.drawable.ngliyep);
        wisataList.add(wisata);

        wisata = new Wisata("Pantai Sempu", "Desa Tambakrejo, Kecamatan Sumbermanjing Wetan, Kabupaten Malang", "Harga Tiket : Rp8000", R.drawable.sempu);
        wisataList.add(wisata);

        wisata = new Wisata("Pantai Sipelot", "Desa Pujiharjo, Kecamatan Titoyudo, Kabupaten Malang", "Harga Tiket : Rp5000", R.drawable.sipelot);
        wisataList.add(wisata);

        wisata = new Wisata("Sumber Pitu Pujon", "Desa Pujon Kidul, Pujon, Krajan, Pandesari, Malang", "Harga Tiket : Rp10000", R.drawable.sumberpitu);
        wisataList.add(wisata);

        WisataAdapter wisataAdapter = new WisataAdapter(wisataList);
        rvwisata.setAdapter(wisataAdapter);
        rvwisata.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));
        rvwisata.setLayoutManager(new GridLayoutManager(this, 3));
    }
}
