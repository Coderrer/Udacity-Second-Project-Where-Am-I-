package com.codestar.gmk.whereami;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method gets called every time the submit button gets pressed.
     *
     * @param view takes a view as a parameter.
     */
    public void submitButton(View view) {
        String questionOne = returnIndianAnswer();
        String questionTwo = returnBrazilAnswer();
        String questionThree = returnLondonAnswer();
        String questionFour = returnAustralianAnswer();
        String questionFive = returnTanzaniaAnswer();
        String questionSix = returnUsaAnswer();
        String questionSeven = returnEgyptianAnswer();
        String questionEight = returnFranceAnswer();
        String questionNine = returnZimbabweAnswer();
        String questionTen = returnItalyAnswer();
        String questionEleven = returnRussiaAnswer();
        String questionTwelve = returnEnglandAnswer();
        Toast.makeText(this,
                "\nAnswers and Score." +
                        "\n 1) " + questionOne +
                        "\n 2) " + questionTwo +
                        "\n 3) " + questionThree +
                        "\n 4) " + questionFour +
                        "\n 5) " + questionFive +
                        "\n 6) " + questionSix +
                        "\n 7) " + questionSeven +
                        "\n 8) " + questionEight +
                        "\n 9) " + questionNine +
                        "\n10) " + questionTen +
                        "\n11) " + questionEleven +
                        "\n12) " + questionTwelve +
                        "\nYou have scored: " + score + " out of 12.",
                Toast.LENGTH_LONG).show();
        score = 0;
    }

    /**
     * This method calculates the answer for the  **[ India ]**  question
     * and then returns it.
     *
     * @return Answer
     */
    private String returnIndianAnswer() {
        RadioButton indiaRadioButtonOne = (RadioButton) findViewById(R.id.india_radio_1);
        RadioButton indiaRadioButtonTwo = (RadioButton) findViewById(R.id.india_radio_2);
        RadioButton indiaRadioButtonThree = (RadioButton) findViewById(R.id.india_radio_3);
        String indianAnswer;
        if (indiaRadioButtonOne.isChecked()) {
            indianAnswer = "Incorrect";
        } else if (indiaRadioButtonTwo.isChecked()) {
            indianAnswer = "Correct";
            score++;
        } else if (indiaRadioButtonThree.isChecked()) {
            indianAnswer = "Incorrect";
        } else {
            indianAnswer = "No Answer";
        }
        return indianAnswer;
    }

    /**
     * This method calculates the answer for the  **[ Brazil ]**  question
     * and then returns it.
     *
     * @return Answer
     */
    private String returnBrazilAnswer() {
        CheckBox brazilCheckBoxOne = (CheckBox) findViewById(R.id.brazil_checkbox_1);
        CheckBox brazilCheckBoxTwo = (CheckBox) findViewById(R.id.brazil_checkbox_2);
        CheckBox brazilCheckBoxThree = (CheckBox) findViewById(R.id.brazil_checkbox_3);
        CheckBox brazilCheckBoxFour = (CheckBox) findViewById(R.id.brazil_checkbox_4);
        String brazilAnswer;
        if (brazilCheckBoxOne.isChecked() && brazilCheckBoxThree.isChecked() &&
                !brazilCheckBoxTwo.isChecked() && !brazilCheckBoxFour.isChecked()) {
            brazilAnswer = "Correct";
            score++;
        } else if (!brazilCheckBoxOne.isChecked() && !brazilCheckBoxTwo.isChecked()
                && !brazilCheckBoxThree.isChecked() && !brazilCheckBoxFour.isChecked()) {
            brazilAnswer = "No Answer";
        } else {
            brazilAnswer = "Incorrect";
        }
        return brazilAnswer;
    }

    /**
     * This method calculates the answer for the  **[ London ]**  question
     * and then returns it.
     *
     * @return Answer
     */
    private String returnLondonAnswer() {
        EditText londonText = (EditText) findViewById(R.id.london_text);
        String londonTextResult = londonText.getText().toString();
        boolean correctAnswer = londonTextResult.matches("Elizabeth Tower");
        String londonAnswer = "No Answer";
        if (correctAnswer) {
            londonAnswer = "Correct";
            score++;
        } else if (!londonTextResult.equals("Elizabeth Tower") && !londonTextResult.equals("")){
            londonAnswer = "Incorrect";
        }
        return londonAnswer;
    }

    /**
     * This method calculates the answer for the  **[ Australian ]**  question
     * and then returns it.
     *
     * @return Answer
     */
    private String returnAustralianAnswer() {
        RadioButton australianRadioButtonOne = (RadioButton) findViewById(R.id.australian_radio_1);
        RadioButton australianRadioButtonTwo = (RadioButton) findViewById(R.id.australian_radio_2);
        RadioButton australianRadioButtonThree = (RadioButton) findViewById(R.id.australian_radio_3);
        String australianAnswer;
        if (australianRadioButtonOne.isChecked()) {
            australianAnswer = "Incorrect";
        } else if (australianRadioButtonTwo.isChecked()) {
            australianAnswer = "Incorrect";
        } else if (australianRadioButtonThree.isChecked()) {
            australianAnswer = "Correct";
            score++;
        } else {
            australianAnswer = "No Answer";
        }
        return australianAnswer;
    }

    /**
     * This method calculates the answer for the  **[ Tanzania ]**  question
     * and then returns it.
     *
     * @return Answer
     */
    private String returnTanzaniaAnswer() {
        CheckBox tanzaniaCheckBoxOne = (CheckBox) findViewById(R.id.tanzania_checkbox_1);
        CheckBox tanzaniaCheckBoxTwo = (CheckBox) findViewById(R.id.tanzania_checkbox_2);
        CheckBox tanzaniaCheckBoxThree = (CheckBox) findViewById(R.id.tanzania_checkbox_3);
        CheckBox tanzaniaCheckBoxFour = (CheckBox) findViewById(R.id.tanzania_checkbox_4);
        String tanzaniaAnswer;
        if (!tanzaniaCheckBoxOne.isChecked() && tanzaniaCheckBoxTwo.isChecked() &&
                tanzaniaCheckBoxThree.isChecked() && tanzaniaCheckBoxFour.isChecked()) {
            tanzaniaAnswer = "Correct";
            score++;
        } else if (!tanzaniaCheckBoxOne.isChecked() && !tanzaniaCheckBoxTwo.isChecked() &&
                !tanzaniaCheckBoxThree.isChecked() && !tanzaniaCheckBoxFour.isChecked()) {
            tanzaniaAnswer = "No Answer";
        } else {
            tanzaniaAnswer = "Incorrect";
        }
        return tanzaniaAnswer;
    }

    /**
     * This method calculates the answer for the  **[ USA ]**  question
     * and then returns it.
     *
     * @return Answer
     */
    private String returnUsaAnswer() {
        EditText usaText = (EditText) findViewById(R.id.usa_text);
        String usaTextResult = usaText.getText().toString();
        boolean correctAnswer = usaTextResult.matches("South Dakota");
        String usaAnswer = "No Answer";
        if (correctAnswer) {
            usaAnswer = "Correct";
            score++;
        } else if (!usaTextResult.equals("South Dakota") && !usaTextResult.equals("")){
            usaAnswer = "Incorrect";
        }
        return usaAnswer;
    }

    /**
     * This method calculates the answer for the  **[ Egyptian ]**  question
     * and then returns it.
     *
     * @return Answer
     */
    private String returnEgyptianAnswer() {
        RadioButton egyptianRadioButtonOne = (RadioButton) findViewById(R.id.egyptian_radio_1);
        RadioButton egyptianRadioButtonTwo = (RadioButton) findViewById(R.id.egyptian_radio_2);
        RadioButton egyptianRadioButtonThree = (RadioButton) findViewById(R.id.egyptian_radio_3);
        String egyptianAnswer;
        if (egyptianRadioButtonOne.isChecked()) {
            egyptianAnswer = "Correct";
            score++;
        } else if (egyptianRadioButtonTwo.isChecked()) {
            egyptianAnswer = "Incorrect";
        } else if (egyptianRadioButtonThree.isChecked()) {
            egyptianAnswer = "Incorrect";
        } else {
            egyptianAnswer = "No Answer";
        }
        return egyptianAnswer;
    }

    /**
     * This method calculates the answer for the  **[ France ]**  question
     * and then returns it.
     *
     * @return Answer
     */
    private String returnFranceAnswer() {
        CheckBox franceCheckBoxOne = (CheckBox) findViewById(R.id.france_checkbox_1);
        CheckBox franceCheckBoxTwo = (CheckBox) findViewById(R.id.france_checkbox_2);
        CheckBox franceCheckBoxThree = (CheckBox) findViewById(R.id.france_checkbox_3);
        CheckBox franceCheckBoxFour = (CheckBox) findViewById(R.id.france_checkbox_4);
        String franceAnswer;
        if (franceCheckBoxOne.isChecked() && !franceCheckBoxTwo.isChecked() &&
                franceCheckBoxThree.isChecked() && !franceCheckBoxFour.isChecked()) {
            franceAnswer = "Correct";
            score++;
        } else if (!franceCheckBoxOne.isChecked() && !franceCheckBoxTwo.isChecked() &&
                !franceCheckBoxThree.isChecked() && !franceCheckBoxFour.isChecked()) {
            franceAnswer = "No Answer";
        } else {
            franceAnswer = "Incorrect";
        }
        return franceAnswer;
    }

    /**
     * This method calculates the answer for the  **[ Zimbabwe ]**  question
     * and then returns it.
     *
     * @return Answer
     */
    private String returnZimbabweAnswer() {
        EditText zimbabweText = (EditText) findViewById(R.id.zimbabwe_text);
        String zimbabweTextResult = zimbabweText.getText().toString();
        boolean correctAnswer = zimbabweTextResult.matches("Zambezi River");
        String zimbabweAnswer = "No Answer";
        if (correctAnswer) {
            zimbabweAnswer = "Correct";
            score++;
        } else if (!zimbabweTextResult.equals("Zambezi River") && !zimbabweTextResult.equals("")){
            zimbabweAnswer = "Incorrect";
        }
        return zimbabweAnswer;
    }

    /**
     * This method calculates the answer for the  **[ Italy ]**  question
     * and then returns it.
     *
     * @return Answer
     */
    private String returnItalyAnswer() {
        RadioButton italyRadioButtonOne = (RadioButton) findViewById(R.id.italy_radio_1);
        RadioButton italyRadioButtonTwo = (RadioButton) findViewById(R.id.italy_radio_2);
        RadioButton italyRadioButtonThree = (RadioButton) findViewById(R.id.italy_radio_3);
        String italyAnswer;
        if (italyRadioButtonOne.isChecked()) {
            italyAnswer = "Incorrect";
        } else if (italyRadioButtonTwo.isChecked()) {
            italyAnswer = "Correct";
            score++;
        } else if (italyRadioButtonThree.isChecked()) {
            italyAnswer = "Incorrect";
        } else {
            italyAnswer = "No Answer";
        }
        return italyAnswer;
    }

    /**
     * This method calculates the answer for the  **[ Russia ]** question
     * and then returns it.
     *
     * @return Answer
     */
    private String returnRussiaAnswer() {
        CheckBox russiaCheckBoxOne = (CheckBox) findViewById(R.id.russia_checkbox_1);
        CheckBox russiaCheckBoxTwo = (CheckBox) findViewById(R.id.russia_checkbox_2);
        CheckBox russiaCheckBoxThree = (CheckBox) findViewById(R.id.russia_checkbox_3);
        CheckBox russiaCheckBoxFour = (CheckBox) findViewById(R.id.russia_checkbox_4);
        String russiaAnswer;
        if(!russiaCheckBoxOne.isChecked() && russiaCheckBoxTwo.isChecked() &&
                russiaCheckBoxThree.isChecked() && !russiaCheckBoxFour.isChecked()) {
            russiaAnswer = "Correct";
            score++;
        }else if (!russiaCheckBoxOne.isChecked() && !russiaCheckBoxTwo.isChecked() &&
                !russiaCheckBoxThree.isChecked() && !russiaCheckBoxFour.isChecked()) {
            russiaAnswer = "No Answer";
        }else {
            russiaAnswer = "Incorrect";
        }
        return russiaAnswer;
    }

    /**
     * This method calculates the answer for the  **[ England ]**  question
     * and then returns it.
     *
     * @return Answer
     */
    private String returnEnglandAnswer() {
        EditText englandText = (EditText) findViewById(R.id.england_text);
        String englandTextResult = englandText.getText().toString();
        boolean correctAnswer = englandTextResult.matches("Wiltshire");
        String englandAnswer = "No Answer";
        if (correctAnswer) {
            englandAnswer = "Correct";
            score++;
        } else if (!englandTextResult.equals("Wiltshire") && !englandTextResult.equals("")){
            englandAnswer = "Incorrect";
        }
        return englandAnswer;
    }
}
