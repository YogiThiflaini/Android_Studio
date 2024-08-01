package com.yogi.recyclerviewcardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    SiswaAdapter adapter;
    List<Siswa> siswaList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        load();
        isiData();

    }

    public void load(){
        recyclerView = findViewById(R.id.rcvSiswa);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public void isiData(){
        siswaList = new ArrayList<Siswa>();
        siswaList.add(new Siswa("joni","Surabaya"));
        siswaList.add(new Siswa("eko","Surabaya"));
        siswaList.add(new Siswa("tejo","Surabaya"));
        siswaList.add(new Siswa("siti","Surabaya"));
        siswaList.add(new Siswa("roni","Surabaya"));
        siswaList.add(new Siswa("yogi","Surabaya"));
        siswaList.add(new Siswa("reza","Surabaya"));
        siswaList.add(new Siswa("andi","Surabaya"));
        siswaList.add(new Siswa("dika","Surabaya"));
        siswaList.add(new Siswa("fian","Surabaya"));
        siswaList.add(new Siswa("bela","Surabaya"));
        siswaList.add(new Siswa("mara","Surabaya"));
        siswaList.add(new Siswa("joni","Surabaya"));
        siswaList.add(new Siswa("joni","Surabaya"));
        siswaList.add(new Siswa("joni","Surabaya"));
        siswaList.add(new Siswa("joni","Surabaya"));
        siswaList.add(new Siswa("joni","Surabaya"));
        siswaList.add(new Siswa("joni","Surabaya"));
        siswaList.add(new Siswa("joni","Surabaya"));

        adapter = new SiswaAdapter(this,siswaList);
        recyclerView.setAdapter(adapter);
    }

    public void btnTambah(View view) {
        siswaList.add(new Siswa("JONI SAMB","JAKARTA"));
        adapter.notifyDataSetChanged();
    }
}