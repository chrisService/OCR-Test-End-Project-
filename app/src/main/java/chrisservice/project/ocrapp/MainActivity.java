package chrisservice.project.ocrapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static TextView tvScan;
    FrameLayout frameLayout;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tvScan = findViewById(R.id.tvScan);
        frameLayout = findViewById(R.id.frameLayout);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ScanFragment scanFragment = new ScanFragment(MainActivity.this, MainActivity.this);
                getSupportFragmentManager().beginTransaction()
                            .replace(R.id.frameLayout, scanFragment)
                            .addToBackStack(null)
                            .commit();
            }
        });


    }
}
