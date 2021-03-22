package AndroidView;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import Model.Person;

import com.example.helloworldapplikation.R;



public class MainActivity extends AppCompatActivity {

    public Object Na;
    Person person = new Person();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bttnOnClick(View view) {

        TextView tvN = (TextView) findViewById(R.id.txtNa);
        TextView tvNedit = (TextView) findViewById(R.id.editText);
        person.setName(tvNedit.getText().toString());
        tvNedit.setText(person.getName());
        tvN.setText(tvNedit.getText());

    }


}