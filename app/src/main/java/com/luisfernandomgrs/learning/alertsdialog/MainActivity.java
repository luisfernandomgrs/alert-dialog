package com.luisfernandomgrs.learning.alertsdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirDialog(View view) {
        //Instanciar AlertDialog
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);

        //configurar titulo e mensagem
        dialog.setTitle("Título da dialog");
        dialog.setMessage("Mensagem da Dialog");

        //Configurar cancelamento, com clique fora do canvas do AlertDialog... Default é "true"
        dialog.setCancelable(false);

        //Configurar Ícone...
        dialog.setIcon(android.R.drawable.ic_btn_speak_now);

        //Configurar ações...
        //Positive action
        dialog.setPositiveButton("Confirmar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Ação confirmada... Imprimindo relatório", Toast.LENGTH_LONG).show();
            }
        }); // É possível exibir apenas encadeando aqui o método ".show()"
        //Negative action
        dialog.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Ação cancelada...", Toast.LENGTH_LONG).show();
            }
        });

        //Criar e exibir AlertDialog
        dialog.create();
        dialog.show();
    }
}