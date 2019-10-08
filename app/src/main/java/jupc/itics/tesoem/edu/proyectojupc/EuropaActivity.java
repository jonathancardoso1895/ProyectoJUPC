package jupc.itics.tesoem.edu.proyectojupc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EuropaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_europa);

    }
    public void regresa1(View v){
        Intent regresa1 =new Intent(this,MenuActivity.class);
        startActivity(regresa1);
        finish();
    }
}
