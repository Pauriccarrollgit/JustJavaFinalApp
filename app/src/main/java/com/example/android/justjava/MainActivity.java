package com.example.android.justjava;

import android.os.Bundle;

import java.text.NumberFormat;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    int quantity = 2;

    /**
     * There are two types of variables. local and Global. Local can only
     * be called by the method they are contained in. Global variables
     * can be accessed by all variables.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the plus button is clicked.
     */

    public void increment (View view) {
        quantity = quantity + 1;
        display(quantity);

        /**
         * Pseudocode Create quantity variable,set it to 2.
         * Take current quantity and add 1
         */

    }


    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {

        display(quantity);
        displayPrice(quantity * 5);
    }

    /**
     * This method is called when the minusbutton is clicked.
     */

    public void decrement (View view) {

        quantity = quantity - 1;
        display(quantity);

        /**
         * Pseudocode Create quantity variable,set it to 2.
         * Take current quantity and subtract 1
         */

    }



    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }


}

