package a.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editName, editTel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button butMain=(Button)findViewById(R.id.but_main);
        butMain.setOnClickListener(butMainHandler);
        editName=(EditText)findViewById(R.id.edit_name);
        editTel=(EditText)findViewById(R.id.edit_tel);
    }
    View.OnClickListener butMainHandler=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(MainActivity.this, SecondActivity.class);
            // getApplicationContext()도 가능

            String name=editName.getText().toString();
            String tel=editTel.getText().toString();

            // putExtra() ; Intent의 값을 넣어준다. / 1. 이름, 2. 값
            intent.putExtra("name", name);
            intent.putExtra("tel", tel);
            startActivity(intent);
        }
    };
}