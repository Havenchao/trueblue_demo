package hackathon.americanexpress.com.true_blue;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import hackathon.americanexpress.com.activity.EndScreen;
import hackathon.americanexpress.com.activity.Question2;
import hackathon.americanexpress.com.activity.Question3;
import hackathon.americanexpress.com.model.Count;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);

        this.kimButton();
        this.KenyeButton();
        this.justinButton();
        this.lebronButton();

        // Question 2
/*        this.spiderman();
        this.supermanButton();
        this.hulkButton();
        this.deadpoolButton();*/

/*        // Question 3
        this.braceButton();
        this.hatTrickButton();
        this.goalButton();
        this.messiButton();*/


    }

    private void openQuestion2() {
        Intent intent = new Intent(this, Question2.class);
        startActivity(intent);
    }

    private void kimButton() {
        Button kim = findViewById(R.id.kim);
        kim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuestion2();
            }
        });
    }

    private void KenyeButton() {
        Button kenye = findViewById(R.id.correct_1);

        Count.addCount(1);

        kenye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuestion2();
            }
        });
    }

    private void justinButton() {
        Button justin = findViewById(R.id.justin);
        justin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuestion2();
            }
        });
    }

    private void lebronButton() {
        Button lebron = findViewById(R.id.lebron);
        lebron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuestion2();
            }
        });
    }

    // Question 2

/*    private void spiderman() {
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
        correctCount += 1;
        hulk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuestion3();
            }
        });
    }

    private void deadpoolButton() {
        Button deadpool = findViewById(R.id.deadpool);
        correctCount += 1;
        deadpool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuestion3();
            }
        });
    }*/

    // Question 3

    //TODO: got to create stupid congratz page -.-
    // Opens winning pages
/*

    private void braceButton() {
        Button brace = findViewById(R.id.correct_3);
        correctCount += 1;
        brace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEndScreen();
            }
        });
    }

    private void hatTrickButton() {
        Button hatTrick = findViewById(R.id.hatTrick);
        correctCount += 1;
        hatTrick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEndScreen();
            }
        });
    }

    private void goalButton() {
        Button goal = findViewById(R.id.goal);
        correctCount += 1;
        goal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEndScreen();
            }
        });
    }

    private void messiButton() {
        Button messi = findViewById(R.id.messi);
        correctCount += 1;
        messi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEndScreen();
            }
        });
    }
*/

}

