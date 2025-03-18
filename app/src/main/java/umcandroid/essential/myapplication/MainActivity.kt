package umcandroid.essential.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val imageView1 = findViewById<ImageView>(R.id.imageView1)
        imageView1.setOnClickListener {
            val intent = Intent(this, feeling1Activity::class.java)
            startActivity(intent)
        }

        val imageView2 = findViewById<ImageView>(R.id.imageView2)
        imageView2.setOnClickListener {
            val intent = Intent(this, feeling2Activity::class.java)
            startActivity(intent)
        }

        val imageView3 = findViewById<ImageView>(R.id.imageView3)
        imageView3.setOnClickListener {
            val intent = Intent(this, feeling3Activity::class.java)
            startActivity(intent)
        }

        val imageView4 = findViewById<ImageView>(R.id.imageView4)
        imageView4.setOnClickListener {
            val intent = Intent(this, feeling4Activity::class.java)
            startActivity(intent)
        }

        val imageView5 = findViewById<ImageView>(R.id.imageView1)
        imageView5.setOnClickListener {
            val intent = Intent(this, feeling5Activity::class.java)
            startActivity(intent)
        }
    }
}