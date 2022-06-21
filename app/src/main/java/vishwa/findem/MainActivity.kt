package vishwa.findem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    private lateinit var upLost : Button
    private lateinit var upUnattended: Button
    private lateinit var signout:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        signout=findViewById(R.id.sig_btn)

        upUnattended=findViewById(R.id.UploadUnattendedButton)


        upUnattended.setOnClickListener {
            startActivity(Intent(this, DetectorActivity::class.java))
        }
    }
}