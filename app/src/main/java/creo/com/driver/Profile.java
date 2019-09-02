package creo.com.driver;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

import java.util.ArrayList;

public class Profile extends AppCompatActivity {
    private RecyclerView recyclerView;
    Context mContext=this;

    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);//will hide the title
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        final ArrayList<NotificationPojo> pojo = new ArrayList<>();
        NotificationPojo notificationPojo = new NotificationPojo("You have recieved 5 new compliments",R.drawable.notification);
        NotificationPojo notificationPojo1=new NotificationPojo("You have recieved a new policy update",R.drawable.notification);
        pojo.add(notificationPojo);
        pojo.add(notificationPojo1);

        recyclerView = findViewById(R.id.rer);
        recyclerView.setNestedScrollingEnabled(false);
        NotificationAdapter notificationAdapter = new NotificationAdapter(pojo,mContext);

        recyclerView.setAdapter(notificationAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));



    }
}
