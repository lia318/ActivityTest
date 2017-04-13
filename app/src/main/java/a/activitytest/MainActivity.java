package a.activitytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button butMain=(Button)findViewById(R.id.but_main);
        butMain.setOnClickListener();
    }
    View.OnClickListener butMainHandler=new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    }
}
