package example.com.prince.usamp3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private ToggleButton toggleButton1,toggleButton2;
    private Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButtonClick();
    }

    public void addListenerOnButtonClick(){
        // Getting the ToggleButton and Button instances from xml file
        toggleButton1 = findViewById(R.id.toggleButton);
        toggleButton2 = findViewById(R.id.toggleButton2);
        buttonSubmit = findViewById(R.id.button);

        // Performing action on button Click
        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Performing action on button click
                StringBuilder result = new StringBuilder();
                result.append("ToggleButton1: ").append(toggleButton1.getText());
                result.append("\nToggleButton2: ").append(toggleButton2.getText());

                // Displaying the message in toast
                Toast.makeText(getApplicationContext(),result.toString(),Toast.LENGTH_LONG).show();
            }
        });

    }
}
