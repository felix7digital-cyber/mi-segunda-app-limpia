package com.felix.miapp2

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        val textView = TextView(this).apply {
            text = "¡Hola Félix! Ahora sí funciono."
            textSize = 22f
            setPadding(40, 40, 40, 40)
        }
        
        setContentView(textView)
    }
}
