package com.example.android.justjava;

import android.os.Bundle;
import java.text.NumberFormat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;


/*
AppCompatActivity allows us to access the Android Support Library (new API)
we extend the activate as opposed to copying all code in here
 */
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
     * Override allows us to override the AppCompatActivity.
     * in this case it allows us to use our own html
     */

    /**
     * This method is called when the plus button is clicked.
     */

    public void increment(View view) {
        quantity = quantity + 1;
        displayQuantity(quantity);

        /**
         * Pseudocode Create quantity variable,set it to 2.
         * Take current quantity and add 1
         */

    }


    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        CheckBox whippedCreamCheckbox = (CheckBox) findViewById(R.id.whipped_cream_checkbox);
        boolean hasWhippedCream = whippedCreamCheckbox.isChecked();
        CheckBox chocolateCheckbox = (CheckBox) findViewById(R.id.chocolate_checkbox);
        boolean hasChocolate = chocolateCheckbox.isChecked();

        int price = calculatePrice();
        String priceMessage = createOrderSummary(price,hasWhippedCream,hasChocolate);
        displayMessage(priceMessage);

        /** this is a global variable so the quantity will be updated by our increment properties
         * we have set the price fpr the cost of the cup of coffee and created a method to calculate
         * the price
         *
         */
    }


    /**
     * Calculates the price of the order.
     *@return total price
     */
    private int calculatePrice() {
        int price = quantity * 15;
        return price;
    }

    /** as we are passing the whipped cream variable into the input summary we need to
     * specifty it as a boolean
     */

    private String createOrderSummary(int price, boolean addWhippedCream, boolean addChocolate) {
    String priceMessage = "Name: Kaprain Kunal";
        priceMessage = "Add whipped cream? " + addWhippedCream;
        priceMessage = priceMessage + "\nAdd chocolate? " + addChocolate;
        priceMessage = priceMessage + "\nQuantity:" + quantity;
        priceMessage = priceMessage + "\nTotal: $"+ price;
        priceMessage = priceMessage + "\nThank You!";
        return priceMessage;
    }


    /**
     * Updating variables (string or fixed) Data Type  Variable Name = Initial Value
     */

    /**
     * This method is called when the minusbutton is clicked.
     */

    /**
     * Escape sequence in this case a new line \n.
     */

    public void decrement(View view) {

        quantity = quantity - 1;
        displayQuantity(quantity);

        /**
         * Pseudocode Create quantity variable,set it to 2.
         * Take current quantity and subtract 1
         */

    }


    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }



    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);

        /**
         * orderSummaryTextView.setText(message) we are
         * calling a method on an object. The format of which
         * is OBJECT VARIABLE NAME. METHOD NAME(INPUT ARGUMENTS);
         */
    }

}

