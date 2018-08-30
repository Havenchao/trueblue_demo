package hackathon.americanexpress.com.activity;

import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;

import hackathon.americanexpress.com.true_blue.R;

public class EndScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_screen);

        TextView correctAns = findViewById(R.id.correctAns);
        int count = getIntent().getIntExtra("correctCount", 0);
        correctAns.setText(String.valueOf(count));
    }

}
