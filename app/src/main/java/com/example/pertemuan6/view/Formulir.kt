package com.example.pertemuan6.view

import android.R
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource


@composable
fun FormIsian(
    jenisK:List<string> = listOf("Laki-laki","Perempuan"),
    OnSubmitBtnClick : () -> Unit
){
    scaffold (modifier=modifier,
        topBar={
            topAppBar(
                tittle = {Text(text= stringResource(id= R.string.home),
                    color = Color.White)},
                colors = TopAppBarDefaults.topAppBarColors
                    (containerColor = colorResource(id = R.color.purple_500))
            )
        }
    ){
        }

















}