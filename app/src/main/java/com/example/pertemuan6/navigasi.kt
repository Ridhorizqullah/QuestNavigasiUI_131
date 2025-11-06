package com.example.pertemuan6

import androidx.compose.material3.Scaffold
import com.example.pertemuan6.view.composable

enum class Nvigasi {
    Formulirku,

    Detail

}

@composable
Fun DataApp(
    navController: NavHostController = rememberNavController(),
    modifeir: modifier
){
    Scaffold { isiRuang ->
        NavHost(
            navController = navController,
            startDestination = Nvigasi.Formulirku.name,

            modifier = modifier.padding(paddingValues = isiRuang)){
            composable(route = Nvigasi.Formulirku.name){

            }
        }
        )

    }
}