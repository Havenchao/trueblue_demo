package hackathon.americanexpress.com.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import hackathon.americanexpress.com.model.Count;
import hackathon.americanexpress.com.true_blue.R;

public class Question2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);

        this.spiderman();
        this.supermanButton();
        this.hulkButton();
        this.deadpoolButton();
    }

    private void openQuestion3() {
        Intent intent = new Intent(this, Question3.class);
        startActivity(intent);
    }

    private void spiderman() {
        Button spiderman = findViewById(R.id.spiderman);
        spiderman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuestion3();
            }
        });
    }

    private void supermanButton() {
        Button superman = findViewById(R.id.superman);
        superman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuestion3();
            }
        });
    }

    private void hulkButton() {
        Button hulk = findViewById(R.id.correct_2);
        Count.addCount(1);
        hulk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuestion3();
            }
        });
    }

    private void deadpoolButton() {
        Button deadpool = findViewById(R.id.deadpool);
        deadpool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuestion3();
            }
        });
    }
}
