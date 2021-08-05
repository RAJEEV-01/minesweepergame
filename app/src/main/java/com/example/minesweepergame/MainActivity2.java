
package com.example.minesweepergame;

        import androidx.appcompat.app.AppCompatActivity;

        import android.app.Activity;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.TextView;

        import com.example.minesweepergame.views.cell;

public class MainActivity2 extends Activity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Log.e("MainActivity","onCreate");

        gameprocessor.getInstance().creategrid(this);
    }
}