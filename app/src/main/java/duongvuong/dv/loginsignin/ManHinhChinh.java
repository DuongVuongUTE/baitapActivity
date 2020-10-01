package duongvuong.dv.loginsignin;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ManHinhChinh extends AppCompatActivity implements View.OnClickListener {
    private ImageButton bt;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh_chinh);
        bt=findViewById(R.id.button);
        bt.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view==bt){
            Intent intent=new Intent(ManHinhChinh.this,list_activity.class);
            startActivity(intent);
        }
    }
}