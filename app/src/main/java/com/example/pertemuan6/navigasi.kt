package com.example.pertemuan6

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pertemuan6.view.FormIsian
import com.example.pertemuan6.view.TampilanData
import com.example.pertemuan6.view.composable

enum class Nvigasi {
    Formulirku,

    Detail

}

@Composable
fun DataApp(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier = Modifier
) {
    Scaffold { isiRuang ->
        NavHost(
            navController = navController,
            startDestination = Nvigasi.Formulirku.name,
            modifier = modifier.padding(isiRuang)
        ) {
            composable(route = Nvigasi.Formulirku.name) {
                FormIsian(
                    onSubmitBtnClick = {
                        navController.navigate(Nvigasi.Detail.name)
                    }
                )
            }

            composable(route = Nvigasi.Detail.name) {
                TampilanData (
                    onBackBtnClick = {
                        cancelAndBackToFormulirku(navController)
                    }
                )
            }
        }
    }
}

private fun cancelAndBackToFormulirku(
    navController: NavHostController
){
    navController.popBackStack(route = Nvigasi.Formulirku.name, inclusive = false)
}

