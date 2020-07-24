package com.bulenthanci.nfopazar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_splash_screen.*

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        iv_note.alpha = 0f
        iv_note.animate().setDuration(1500).alpha(1f).withEndAction {


            val i = Intent(this , MainActivity::class.java)
            startActivity(i)
            overridePendingTransition(android.R.anim.fade_in , android.R.anim.fade_out)
            finish()
        }

        textView3.alpha = 0f
        textView3.animate().setDuration(1500).alpha(1f)

        textView4.alpha = 0f
        textView4.animate().setDuration(1500).alpha(1f)

        textView5.alpha = 0f
        textView5.animate().setDuration(1500).alpha(1f)

        textView6.alpha = 0f
        textView6.animate().setDuration(1500).alpha(1f)


        textView7.alpha = 0f
        textView7.animate().setDuration(1500).alpha(1f)


        textView8.alpha = 0f
        textView8.animate().setDuration(1500).alpha(1f)

        textView9.alpha = 0f
        textView9.animate().setDuration(1500).alpha(1f)

        textView10.alpha = 0f
        textView10.animate().setDuration(1500).alpha(1f)

        textView11.alpha = 0f
        textView11.animate().setDuration(1500).alpha(1f)

        textView12.alpha = 0f
        textView12.animate().setDuration(1500).alpha(1f)

        textView13.alpha = 0f
        textView13.animate().setDuration(1500).alpha(1f)

        textView14.alpha = 0f
        textView14.animate().setDuration(1500).alpha(1f)

        textView15.alpha = 0f
        textView15.animate().setDuration(1500).alpha(1f)

        textView16.alpha = 0f
        textView16.animate().setDuration(1500).alpha(1f)

        textView17.alpha = 0f
        textView17.animate().setDuration(1500).alpha(1f)

        textView18.alpha = 0f
        textView18.animate().setDuration(1500).alpha(1f)

        textView19.alpha = 0f
        textView19.animate().setDuration(1500).alpha(1f)

        textView20.alpha = 0f
        textView20.animate().setDuration(1500).alpha(1f)

        textView21.alpha = 0f
        textView21.animate().setDuration(1500).alpha(1f)

        textView22.alpha = 0f
        textView22.animate().setDuration(1500).alpha(1f)

    }
}
