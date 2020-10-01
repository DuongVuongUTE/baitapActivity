package duongvuong.dv.loginsignin;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageButton bt_dangky;
    private TextView textView;
    private Button login;
    private EditText user;
    private EditText pass;
    private TextView info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt_dangky = findViewById(R.id.bt_dangky);
        bt_dangky.setOnClickListener(this);
        login=findViewById(R.id.bt_dangnhap);
        login.setOnClickListener(this);
        user=findViewById(R.id.user_edit);
        pass=findViewById(R.id.pass_edit);
    }
    public void Dangnhap(String username,String password){
        if ((username.equals(""))||(password.equals(""))){
            Toast.makeText(getApplicationContext(), "Vui Lòng Điền Đầy Đủ Thông Tin", Toast.LENGTH_LONG).show();
        }
        else {
            if ((username.equals("admin"))&&(password.equals("admin"))){
                Intent intent=new Intent(MainActivity.this,ManHinhChinh.class);
                startActivity(intent);
            }
            else {
            Toast.makeText(getApplicationContext(), "Sai Tên Đăng Nhập Hoặc Mật Khẩu", Toast.LENGTH_LONG).show();
            }
        }
    }
    @Override
    public void onClick(View view) {
        if (view==bt_dangky){
            Intent intent=new Intent(MainActivity.this,Register.class);
            startActivity(intent);
        }
        if (view==login){
            Dangnhap(user.getText().toString(),pass.getText().toString());
        }
    }
}