package cononymous.spark.com.compliance_dsce;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class RoomActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_room);
        layoutManager = new LinearLayoutManager(RoomActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new RecyclerAdapterRoom();
        recyclerView.setAdapter(adapter);
    }
}
