package com.bulenthanci.nfopazar

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService

class MyFireBaseMessagingService : FirebaseMessagingService() {

    override fun onNewToken(token: String) {
        Log.d("TAG" , "The Token Refreshed: $token")
    }

}