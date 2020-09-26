package com.example.mvvmsample

import android.view.View
import androidx.lifecycle.ViewModel
import com.example.mvvmsample.ui.auth.AuthListener

class AuthViewModel: ViewModel() {
    var email: String? = null
    var password: String? = null
    var authListener: AuthListener? = null

    fun onLoginButtonClick(view: View){
        if(email.isNullOrEmpty() || password.isNullOrEmpty()){
            authListener?.onFailure("Failure")

            return
        }
        authListener?.onSuccess()
    }
}