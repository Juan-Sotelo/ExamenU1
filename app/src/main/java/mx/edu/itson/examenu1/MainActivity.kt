package mx.edu.itson.examenu1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etC:EditText = findViewById(R.id.etC)
        val etF:EditText = findViewById(R.id.etF)
        val etK:EditText = findViewById(R.id.etK)
        val btnGC:Button = findViewById(R.id.btnGC)
        val btnGF:Button = findViewById(R.id.btnGF)
        val btnGK:Button = findViewById(R.id.btnGK)

        btnGC.setOnClickListener {
            var textoF:Boolean= etF.text.toString().equals("")
            var textoK:Boolean= etK.text.toString().equals("")

            if(!(textoF==true && textoK==true) && !(textoF==false && textoK==false)){
                var gC:Double
                if(textoF==false){
                    gC= ((etF.text.toString().toDouble())-32) / 1.8
                    etF.setText("")
                }else{
                    gC= ((etK.text.toString().toDouble())-273.15)
                    etK.setText("")
                }
                etC.setText(gC.toString())
            }
        }

        btnGF.setOnClickListener {
            var textoC:Boolean= etC.text.toString().equals("")
            var textoK:Boolean= etK.text.toString().equals("")

            if(!(textoC==true && textoK==true) && !(textoC==false && textoK==false)){
                var gF:Double
                if(textoC==false){
                    gF= ((etC.text.toString().toDouble()) * 1.8) + 32
                    etC.setText("")
                }else{
                    gF= ((9*((etK.text.toString().toDouble())-273.15))/5) + 32
                    etK.setText("")
                }
                etF.setText(gF.toString())
            }
        }

        btnGK.setOnClickListener {
            var textoC:Boolean= etC.text.toString().equals("")
            var textoF:Boolean= etF.text.toString().equals("")

            if(!(textoC==true && textoF==true) && !(textoC==false && textoF==false)){
                var gK:Double
                if(textoC==false){
                    gK= (etC.text.toString().toDouble()) + 273.15
                    etC.setText("")
                }else{
                    gK= ((5*((etF.text.toString().toDouble())-32))/9) + 273.15
                    etF.setText("")
                }
                etK.setText(gK.toString())
            }
        }
    }
}