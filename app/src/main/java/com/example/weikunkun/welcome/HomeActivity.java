package com.example.weikunkun.welcome;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import org.jetbrains.annotations.NotNull;
import ru.github.igla.ferriswheel.FerrisWheelView;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * author: kongwiki
 * date: on 18-12-29
 * email: kongwiki@163.com
 */
public class HomeActivity extends AppCompatActivity {

    private  FerrisWheelView ferrisWheelView;
    private TextView button;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_java);

        button = findViewById(R.id.change);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, TextViewFirst.class);
                startActivity(intent);
            }
        });

        ferrisWheelView = findViewById(R.id.ferrisWheelView);

        findViewById(R.id.startCircle).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ferrisWheelView.startAnimation();
            }
        });

        findViewById(R.id.stopCircle).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ferrisWheelView.stopAnimation();
//                Intent intent = new Intent(HomeActivity.this, MusicActivity.class);
//                startActivity(intent);
            }
        });

//        ferrisWheelView.setCenterListener(clickCenterListener);
        ferrisWheelView.setCabinListener(clickCabinListener);
        ferrisWheelView.startAnimation();
    }

//    private final FerrisWheelView.OnClickCenterListener clickCenterListener = new FerrisWheelView.OnClickCenterListener() {
//        @Override
//        public void onClickCenter(@NotNull MotionEvent e) {
//            Toast.makeText(HomeActivity.this, "Click center " + e.toString(), Toast.LENGTH_LONG).show();
//        }
//    };

    private final FerrisWheelView.OnClickCabinListener clickCabinListener = new FerrisWheelView.OnClickCabinListener() {

        @Override
        public void onClickCabin(int cabinNumber, @NotNull MotionEvent e) {
            Toast.makeText(HomeActivity.this, String.valueOf(cabinNumber) + "号 祝您新年快乐", Toast.LENGTH_LONG).show();
        }
    };

}
