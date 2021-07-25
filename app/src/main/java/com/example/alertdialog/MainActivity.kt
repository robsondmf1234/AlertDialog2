package com.example.alertdialog

import android.content.DialogInterface
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun abrirDialog(view: View) {

        //Instanciar AlertDialog
        val alert: AlertDialog.Builder = AlertDialog.Builder(this)

        //Configurar o titulo e a mensagem
        alert.setTitle("Titulo da Dialog")
        alert.setMessage("Mensagem da Dialog")

        //Configurando icone
        alert.setIcon(android.R.drawable.ic_btn_speak_now)

        //Configurando o cancelamento
        alert.setCancelable(true)
        //Não fecha a tela enquanto não for selecionado alguma opção
//        alert.setCancelable(false)

        //CONFIGURANDO AS AÇÕES PARA SIM E NÃO
        //Configurado a opção para SIM
        alert.setPositiveButton("Sim", DialogInterface.OnClickListener { dialogInterface, i ->
            Toast.makeText(this, "Executar a ação ao clicar em SIM", Toast.LENGTH_SHORT).show()
        })

        //Configurado a opção para NÃO
        alert.setNegativeButton("Não", DialogInterface.OnClickListener { dialogInterface, i ->
            Toast.makeText(this, "Executar a ação ao clicar em NÃO", Toast.LENGTH_SHORT).show()
        })

        //Criar e exibir AlertDialog
        alert.create()
        alert.show()
    }
}