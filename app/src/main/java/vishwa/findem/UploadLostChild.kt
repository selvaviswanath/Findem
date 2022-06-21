package vishwa.findem

import android.graphics.Bitmap
import android.media.Image
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference
import vishwa.findem.tflite.SimilarityClassifier
import java.io.ByteArrayOutputStream

class UploadLostChild : AppCompatActivity() {
    private var firebaseStore: FirebaseStorage? = null
    private var storageReference: StorageReference? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        firebaseStore=FirebaseStorage.getInstance()
        storageReference=FirebaseStorage.getInstance().reference
    }


    public fun uploadImage(name:String, bitmap: Bitmap){
        val baos = ByteArrayOutputStream()

            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, baos)

        val data = baos.toByteArray()
        val ref = storageReference?.child("UnattendedChildren/${name}")
            val uploadTask = ref?.putBytes(data)
    }
}