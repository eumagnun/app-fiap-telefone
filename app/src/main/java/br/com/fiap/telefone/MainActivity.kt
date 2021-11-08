package br.com.fiap.telefone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import telefone.R
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("ciclo-de-vida","onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.i("ciclo-de-vida","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("ciclo-de-vida","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("ciclo-de-vida","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("ciclo-de-vida","onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("ciclo-de-vida","onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("ciclo-de-vida","onDestroy")
    }
}