package sg.edu.rp.c346.id19045083.array;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tv;
//    String[] fruits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.textView);

        // Array
//        fruits = new String[3];
//        fruits[0] = "apple";
//        fruits[1] = "banana";
//        fruits[2] = "cherry";
//        String output = "Fruit\n=====\n";
//        String output = "Fruits\n=====\n";
//        for (int i=0; i<fruits.length; i++){
//            output += String.format("%s\n", fruits[i]);
//        }
//        tv.setText(output);


        // ArrayList
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("durian");

        String output = "Fruits\n=====\n";
        for (int i=0; i<fruits.size(); i++){
            output += String.format("%s\n", fruits.get(i));
        }
        tv.setText(output);

        // Get the second element in the ArrayList and assign it to a String variable, theFruit
        String theFruit = fruits.get(1);

        // Remove the first element from the ArrayList.
        fruits.remove(0);

        // Change the last element of the ArrayList to “dragon fruit”
        fruits.set(fruits.size()-1, "dragon fruit");
    }
}