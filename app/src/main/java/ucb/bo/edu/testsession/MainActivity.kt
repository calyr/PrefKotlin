package ucb.bo.edu.testsession

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        session.user = "CALYR.SOFTWARE@GMAIL.COM"
    }

    fun openSecondActivity(view: View) {
//        Toast.makeText(this, "Test", Toast.LENGTH_SHORT).show()
        startActivity(Intent(this, SecondActivity::class.java))
    }
}
