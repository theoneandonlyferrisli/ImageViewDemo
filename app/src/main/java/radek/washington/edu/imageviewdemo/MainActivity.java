package radek.washington.edu.imageviewdemo;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private boolean hasFilter = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView)findViewById(R.id.logo);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!hasFilter) {
                    imageView.setColorFilter(Color.GRAY, PorterDuff.Mode.MULTIPLY);
                    hasFilter = true;
                } else {
                    imageView.clearColorFilter();
                    hasFilter = false;
                }
            }
        });
    }
}
