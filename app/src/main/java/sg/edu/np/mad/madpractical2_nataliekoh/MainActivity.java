package sg.edu.np.mad.madpractical2_nataliekoh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Main Activity";
    User user = new User();


    private Boolean follow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        user.setFollowed(true);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        follow = user.getFollowed();
        Button mybutton = findViewById(R.id.button);
        if(follow){
            mybutton.setText("Unfollow");
        }
        else{
            mybutton.setText("Follow");
        }
        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(follow == true){
                    mybutton.setText("Unfollow");
                    follow = false;
                }
                else{

                    mybutton.setText("Follow");
                    follow = true;
                }
            }
        });
    }
}