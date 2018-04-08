package ru.androidacademy.spb.lists;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import ru.androidacademy.spb.lists.recyclerview.AndroidDevelopersAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initRecyclerView();

        /*
        ListView listView = findViewById(R.id.listView);
        BaseAdapter adapter = new AndroidDevelopersAdapter(this, generateDevelopers());
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // ... use position to understand where click happened and handle it
            }
        });*/
    }

    private void initRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerView.Adapter adapter = new AndroidDevelopersAdapter(generateDevelopers());
        recyclerView.setAdapter(adapter);
    }

    private static List<AndroidDeveloper> generateDevelopers() {
        List<AndroidDeveloper> developers = new ArrayList<>();
        developers.add(new AndroidDeveloper("Artur Vasilov", "https://i.imgur.com/RMLtWSJ.png", true));
        developers.add(new AndroidDeveloper("Artem Kochkin", "https://i.imgur.com/uEM1uG7.png", false));
        developers.add(new AndroidDeveloper("Vitaly Markus", "https://i.imgur.com/dk8vMhy.png", false));
        developers.add(new AndroidDeveloper("Anton Shulipov", "https://i.imgur.com/coRG6xV.png", false));
        developers.add(new AndroidDeveloper("Anton Kraskovskiy", "https://i.imgur.com/hl2iPjo.png", false));
        developers.add(new AndroidDeveloper("Dmitry Kartsev", "https://i.imgur.com/n9IOoq7.png", false));
        developers.add(new AndroidDeveloper("Evgeniy Gaponov", "https://i.imgur.com/saM3c2r.png", false));
        developers.add(new AndroidDeveloper("Konstantin Tskhovrebov", "https://i.imgur.com/iifMkHB.png", true));
        developers.add(new AndroidDeveloper("Mike", "https://i.imgur.com/jEgCWW2.png", false));
        developers.add(new AndroidDeveloper("Sergey Ryabov", "https://i.imgur.com/vcGFMkp.png", true));
        developers.add(new AndroidDeveloper("Sergey Zavartsev", "https://i.imgur.com/vkkp9Pi.png", false));
        return developers;
    }
}
