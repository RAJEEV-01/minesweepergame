
package com.example.minesweepergame;

        import androidx.appcompat.app.AppCompatActivity;

        import android.app.Activity;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.TextView;

        import com.example.minesweepergame.views.cell;
        import com.example.minesweepergame.views.cell3;

public class MainActivity3 extends Activity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        gameprocessor3.getInstance().creategrid(this);
    }
}