package duongvuong.dv.loginsignin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class list_activity extends AppCompatActivity{
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_activity);
        listView=findViewById(R.id.listView);
        final ArrayList<String> ds=new ArrayList<>();
        ds.add("Trường Đại Học SPKT Đà Nẵng");
        ds.add("Trường Đại Học Bách Khoa Đà Nẵng");
        ds.add("Trường Đại Học Kinh Tế Đà Nẵng");
        ds.add("Trường Đại Học Ngoại Ngữ Đà Nẵng");
        ds.add("Trường Đại Học Sư Phạm Đà Nẵng");
        ds.add("Trường Đại Học Việt Hàn");
        ds.add("Trường Đại Học Duy Tân");
        ds.add("Trường Đại Học Kiến Trúc");
        ds.add("Trường Đại Học Đông Á");
        ds.add("Trường Đại Học SPKT TP.HCM");
        ds.add("Trường Đại Học Bách Khoa TP.HCM");
        ds.add("Trường Đại Học Kinh Tế TP.HCM");
        ds.add("Trường Đại Học Ngoại Ngữ TP.HCM");
        ds.add("Trường Đại Học Sư Phạm TP.HCM");
        ds.add("Trường Đại Học Nguyễn Tất Thành");
        ds.add("Trường Đại Học Tôn Đức Thắng");
        ds.add("Trường Đại Học Hoa Sen");
        ds.add("Trường Đại Học Lạc Hồng");
        ds.add("Trường Đại Học SPKT Hà Nội");
        ds.add("Trường Đại Học Bách Khoa Hà Nội");
        ds.add("Trường Đại Học Kinh Tế Quốc Dân");
        ds.add("Trường Đại Học Mở Hà Nội");
        ds.add("Trường Đại Học Sư Phạm Hà Nội");

        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,ds);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(list_activity.this,"Bạn Chọn Trường Thứ "+(position+1)+" "+ds.get(position).toString(),Toast.LENGTH_SHORT).show();

            }
        });
    }
}