package timika.papua.pertemuan4_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private mahasiswaadapter adapter;
    private ArrayList<mahasiswa> mahasiswaArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();
        recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        adapter = new mahasiswaadapter(mahasiswaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new mahasiswa("lukas", "1918131", "2019",R.drawable.persipura));
        mahasiswaArrayList.add(new mahasiswa("benny", "1918131", "2019",R.drawable.peta));
        mahasiswaArrayList.add(new mahasiswa("korain", "1918131", "2019",R.drawable.maybrat));
    }
}