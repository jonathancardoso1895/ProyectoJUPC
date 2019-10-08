package jupc.itics.tesoem.edu.proyectojupc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public void champions(View v){
        Intent champions=new Intent(this,ChampionsActivity.class);
        startActivity(champions);
        finish();
    }
    public void europa(View v){
        Intent europa=new Intent(this,EuropaActivity.class);
        startActivity(europa);
        finish();
    }
    public void libertadores(View v){
        Intent libertadores=new Intent(this,LibertadoresActivity.class);
        startActivity(libertadores);
        finish();
    }
    public void mundial(View v){
        Intent mundial= new Intent(this,MundialActivity.class);
        startActivity(mundial);
        finish();
    }
    public void conca(View v){
        Intent conca= new Intent(this,ConcachampionsActivity.class);
        startActivity(conca);
        finish();
    }
    public void ligaespa(View v){
        Intent espa=new Intent(this,LigaEspaActivity.class);
        startActivity(espa);
        finish();
    }
    public void ligaing(View v){
        Intent ing=new Intent(this,LigaIngActivity.class);
        startActivity(ing);
        finish();
    }
    public void ligamx(View v){
        Intent mx=new Intent(this,LigaMxActivity.class);
        startActivity(mx);
        finish();
    }
    public void inter(View v){
        Intent inter=new Intent(this,InterActivity.class);
        startActivity(inter);
        finish();
    }
    public void creador(View v){
        Intent crea=new Intent(this,CreadorActivity.class);
        startActivity(crea);
        finish();
    }
}
