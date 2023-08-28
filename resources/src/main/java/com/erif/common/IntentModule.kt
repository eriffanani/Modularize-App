package com.erif.common

import android.content.Context
import android.content.Intent
import java.lang.Exception

class IntentModule constructor(private val context: Context) {

    fun forClass(name: String) {
        try {
            val intent = Intent(context, Class.forName("com.erif.payment.$name"))
            context.startActivity(intent)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun forChatRoom(name: String) {
        try {
            val intent = Intent(context, Class.forName("com.erif.chatroom.$name"))
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(intent)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

}