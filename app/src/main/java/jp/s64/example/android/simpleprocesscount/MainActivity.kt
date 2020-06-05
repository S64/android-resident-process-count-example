package jp.s64.example.android.simpleprocesscount

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private val textView by lazy { findViewById<TextView>(R.id.text) }
    private val myApp by lazy { application as MyApp }

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myApp.count++

        textView.text = "MyApp#count == ${myApp.count}"
    }
}
