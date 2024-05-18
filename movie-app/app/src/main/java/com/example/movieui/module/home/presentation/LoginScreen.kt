package com.example.movieui.module.home.presentation

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.movieui.R
import com.example.movieui.core.theme.LightGray


@Composable
fun LoginScreen(
    navController: NavController
) {
    var email by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
            //      verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.tixid_logo),
                contentDescription = null,
                modifier = Modifier.size(150.dp)
            )

            Text(text = "Welcome back,",
                fontSize = 24.sp,
                fontWeight = FontWeight.SemiBold
            )

            Spacer(modifier = Modifier.height(4.dp))
            Text(text = "Login to your account",
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold
            )

            Spacer(modifier = Modifier.height(16.dp))
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth().clip(RoundedCornerShape(4.dp)) ,
                value = email,
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    backgroundColor = LightGray
                ),
                onValueChange = {
                email = it
            }, label = {
                Text(text = "Email Address")
            })

            Spacer(modifier = Modifier.height(4.dp))
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth().clip(RoundedCornerShape(4.dp)) ,
                value = password, onValueChange = {
                    password = it
                }, label = {
                    Text(text = "Password")
                }, visualTransformation = PasswordVisualTransformation()
            )

            Spacer(modifier = Modifier.height(20.dp))
            Button(onClick = {
                Log.i("Credential", "Email : $email Password : $password")
                navController.navigate("home")

            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .height(56.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color(0xFF001B38),
                contentColor = Color.White
            )
            ) {
                Text(text = "Login")
            }

            Spacer(modifier = Modifier.height(15.dp))
            Text(text = "Forgot Password?",
                modifier = Modifier.clickable {
            })

            Spacer(modifier = Modifier.height(10.dp))
            Text(text = "Or sign in with")

            Row(
                modifier = Modifier
                    .fillMaxSize().padding(40.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Image(painter = painterResource(id = R.drawable.fb),
                    contentDescription = "Facebook",
                    modifier = Modifier.size(40.dp).clickable {
                        //Facebook clicked
                    }
                )

                Image(painter = painterResource(id = R.drawable.google),
                    contentDescription = "Google",
                    modifier = Modifier.size(40.dp).clickable {
                        //Google clicked
                    }
                )

                Image(painter = painterResource(id = R.drawable.x),
                    contentDescription = "X",
                    modifier = Modifier.size(40.dp).clickable {
                        //Twitter clicked
                    }
                )
            }
        }
    }
}


//@Preview
//@Composable
//fun LoginScreenPreview(){
//    LoginScreen()
//}
