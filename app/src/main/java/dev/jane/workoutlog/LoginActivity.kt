package dev.jane.workoutlog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class LoginActivity : AppCompatActivity() {
    lateinit var tvSignUp:TextView
    lateinit var tilEmail:TextInputLayout
    lateinit var tilPassword: TextInputLayout
    lateinit var btnLogin:Button
    lateinit var etTextView:TextView


  override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
      tvSignUp=findViewById(R.id.tvSignUp)
      tilEmail=findViewById(R.id.tilEmail)
      etTextView=findViewById(R.id.etTextView)
      tilPassword=findViewById(R.id.tilPassword)
      btnLogin=findViewById(R.id.btnLogin)





      tvSignUp.setOnClickListener {
          val intent = Intent(this, SignUpActivity::class.java)
          startActivity(intent)

      }
      btnLogin.setOnClickListener{
          validateLogin()
      }
  }

    fun validateLogin() {
        var email=tilEmail.editText.toString()
        var password=tilPassword.editText.toString()
        if(email.isBlank()){
            tilEmail.error="Email is invalid"
        }
        if (password.isBlank()){
            tilPassword.error="Password is required"
        }
    }
}









