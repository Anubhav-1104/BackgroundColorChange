package com.example.assignment_02;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button btn_01;
    private final String[] colors = {
            "Red", "Blue", "Purple", "Green", "Yellow",
            "Orange", "Pink", "Brown", "Cyan", "Magenta",
            "Turquoise", "Lime", "Indigo", "Teal", "Olive",
            "Maroon", "Navy", "Aquamarine", "Silver", "Gray"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_01 = (Button) findViewById(R.id.btn_01);
        btn_01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeBackgroundColor();
            }
        });
    }
    private void changeBackgroundColor() {
        Random random = new Random();
        int randomIndex = random.nextInt(colors.length);
        String selectedColor = colors[randomIndex];

        int colorCode;
        switch (selectedColor) {
            case "Red":
                colorCode = Color.RED;
                break;
            case "Blue":
                colorCode = Color.BLUE;
                break;
            case "Purple":
                colorCode = Color.parseColor("#800080");  // Purple color
                break;
            case "Green":
                colorCode = Color.GREEN;
                break;
            case "Yellow":
                colorCode = Color.YELLOW;
                break;
            case "Orange":
                colorCode = Color.parseColor("#FFA500");  // Orange color
                break;
            case "Pink":
                colorCode = Color.parseColor("#FFC0CB");  // Pink color
                break;
            case "Brown":
                colorCode = Color.parseColor("#A52A2A");  // Brown color
                break;
            case "Cyan":
                colorCode = Color.CYAN;
                break;
            case "Magenta":
                colorCode = Color.MAGENTA;
                break;


            default:
                colorCode = Color.BLACK;
        }

        getWindow().getDecorView().setBackgroundColor(colorCode);
    }
}
