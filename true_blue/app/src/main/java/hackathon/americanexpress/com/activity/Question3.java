package hackathon.americanexpress.com.activity;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

import hackathon.americanexpress.com.model.Count;
import hackathon.americanexpress.com.true_blue.R;

public class Question3 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);

        this.braceButton();
        this.hatTrickButton();
        this.goalButton();
        this.messiButton();
    }

    private void openEndScreen() {
        Intent intent = new Intent(this, EndScreen.class);
        intent.putExtra("correctCount", Count.getCount());
        startActivity(intent);
    }

    // Question 3

    //TODO: got to create stupid congratz page -.-
    // Opens winning pages

    private void braceButton() {
        Button brace = findViewById(R.id.correct_3);
        Count.addCount(1);
        brace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEndScreen();
            }
        });
    }

    private void hatTrickButton() {
        Button hatTrick = findViewById(R.id.hatTrick);
        hatTrick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEndScreen();
            }
        });
    }

    private void goalButton() {
        Button goal = findViewById(R.id.goal);
        goal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEndScreen();
            }
        });
    }

    private void messiButton() {
        Button messi = findViewById(R.id.messi);
        messi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEndScreen();
            }
        });
    }

}
