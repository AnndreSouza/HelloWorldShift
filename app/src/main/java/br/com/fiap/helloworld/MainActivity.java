package br.com.fiap.helloworld;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void mensagemClick(View view){
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle(getString(R.string.dialog_title));
        alert.setMessage(getString(R.string.dialog_message));
        alert.setPositiveButton(getString(R.string.btn_OK), null);
        alert.show();
    }



}
