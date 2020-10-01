package duongvuong.dv.loginsignin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Register extends AppCompatActivity implements View.OnClickListener {
    private Button bt_dangky;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        bt_dangky=findViewById(R.id.bt_dangky);
        bt_dangky.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view==bt_dangky){
            Intent intent=new Intent(Register.this,MainActivity.class);
            startActivity(intent);
        }
    }
}