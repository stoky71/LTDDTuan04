package Activity;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lap04.R;

import java.util.ArrayList;
import java.util.List;

import adapter.LanguageAdapter;
import model.Language;

public class Lap04ExampleActivity extends AppCompatActivity {
    private List<Language> listLanguage;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_custom_listview);

        listView = (ListView) findViewById(R.id.listView);
        listLanguage = new ArrayList<>();
        listLanguage.add(new Language(1, "Ca nấu mì", "Shop Devang", R.drawable.CaMi));
        listLanguage.add(new Language(2, "1KG KHÔ GÀ LÁ CHANH", "Shop LTD Food", R.drawable.gaKho));
        listLanguage.add(new Language(3, "Xe cẩu đa năng","Shop Thế giới đồ chơi", R.drawable.XeCauDoChoi));
        listLanguage.add(new Language(4, "Đồ chơi dạng mô hình","Shop Thế giới đồ chơi", R.drawable.xeCUuHoa));
        listLanguage.add(new Language(5, "Lãnh đạo giản đơn","Shop Minh Long Book", R.drawable.LanhDaoGianDOn));
        listLanguage.add(new Language(6, "Hiểu lòng con trẻ","Shop Minh Long Book", R.drawable.HieuLongConTrer));
        LanguageAdapter adapter = new LanguageAdapter(this, R.layout.item_custom_listview, listLanguage);
        listView.setAdapter(adapter);

    }
}
