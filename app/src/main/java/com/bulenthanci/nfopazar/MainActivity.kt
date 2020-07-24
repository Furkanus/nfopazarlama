package com.bulenthanci.nfopazar

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import com.firebase.ui.auth.AuthUI
import com.firebase.ui.auth.IdpResponse
import com.google.android.gms.auth.api.Auth
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.SignInButton
import com.google.android.gms.common.api.ApiException
import com.google.android.gms.tasks.Task
import com.google.firebase.FirebaseException
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.PhoneAuthCredential
import com.google.firebase.auth.PhoneAuthProvider
import es.dmoral.toasty.Toasty
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.System.exit
import java.util.*
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {


    private lateinit var auth: FirebaseAuth

    lateinit var providers : List<AuthUI.IdpConfig>

     val MY_REQUEST_CODE: Int = 7117
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        auth = FirebaseAuth.getInstance()




        providers = Arrays.asList<AuthUI.IdpConfig>(

            AuthUI.IdpConfig.EmailBuilder().build() , // Email
            AuthUI.IdpConfig.PhoneBuilder().build()  // Phone


        )

        showSignInOptions()

    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == MY_REQUEST_CODE) {
            val response = IdpResponse.fromResultIntent(data)
            val intent = Intent(applicationContext , Main5Activity::class.java)
            startActivity(intent)
            finish()
        }else {
            Toasty.error(this.applicationContext , "HATA", Toast.LENGTH_SHORT).show()
        }

        if (requestCode == Activity.RESULT_OK) {


            val intent = Intent(applicationContext , Main5Activity::class.java)
            startActivity(intent)
            finish()

        } else {

            val user = FirebaseAuth.getInstance().currentUser

           // Toast.makeText(this.applicationContext , ""+user!!.email , Toast.LENGTH_SHORT).show()
           // Toasty.warning(this.applicationContext , "LÜTFEN BİRAZ BEKLE" , Toast.LENGTH_SHORT).show()



        }

    }

    private fun showSignInOptions() {

         /* val intent = Intent(applicationContext , Main5Activity::class.java)
            startActivity(intent)
        finish()

          */
        (startActivityForResult(AuthUI.getInstance().createSignInIntentBuilder().setIsSmartLockEnabled(true).setAvailableProviders(providers).setTheme(R.style.MyTheme).build() , MY_REQUEST_CODE))


    }

}
