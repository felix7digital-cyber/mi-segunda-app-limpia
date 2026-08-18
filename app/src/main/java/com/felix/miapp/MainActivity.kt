package com.felix.miapp

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        val textView = TextView(this).apply {
            text = "¡Hola Félix! Tu APK fue compilado sin errores."
            textSize = 22f
            setPadding(40, 40, 40, 40)
        }
        
        setContentView(textView)
    }
}

