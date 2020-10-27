package kr.hs.emirim.mirimframetest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout linearPark, linearSon, linearAn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearPark = findViewById(R.id.Linear_park);
        linearSon = findViewById(R.id.Linear_son);
        linearAn = findViewById(R.id.Linear_an);

        Button btnpark = findViewById(R.id.btn_pack);
        Button btnson = findViewById(R.id.btn_son);
        Button btnan = findViewById(R.id.btn_an);

        btnpark.setOnClickListener(btnListener);
        btnson.setOnClickListener(btnListener);
        btnan.setOnClickListener(btnListener);
    }

    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            linearPark.setVisibility(View.INVISIBLE);
            linearSon.setVisibility(View.INVISIBLE);
            linearAn.setVisibility(View.INVISIBLE);
            switch (v.getId()){
                case R.id.btn_pack:
                    linearPark.setVisibility(View.VISIBLE);
                    break;
                case R.id.btn_son:
                    linearSon.setVisibility(View.VISIBLE);
                    break;
                case R.id.btn_an:
                    linearAn.setVisibility(View.VISIBLE);
                    break;
            }
        }
    };
}