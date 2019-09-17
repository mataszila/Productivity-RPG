package example.matasolutions.productivityrpg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AddSkillActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_skill);

        Button add_skill_button = findViewById(R.id.add_skill_button);
        TextView skill_name_view = findViewById(R.id.skill_name);
        TextView skill_multiplier_view = findViewById(R.id.skill_multiplier);

        final String skill_name = skill_name_view.getText().toString();
        String skill_multiplier = skill_multiplier_view.getText().toString();

        final Double skill_multiplier_number = Double.parseDouble(skill_multiplier);

        add_skill_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                


            }
        });


    }
}
