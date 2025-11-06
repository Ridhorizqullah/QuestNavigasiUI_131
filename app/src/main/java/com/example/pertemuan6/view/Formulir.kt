package com.example.pertemuan6.view

import android.R
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp


@composable
fun FormIsian(
    jenisK:List<string> = listOf("Laki-laki","Perempuan"),
    OnSubmitBtnClick : () -> Unit
){
    Scaffold (modifier=modifier,
        topBar={
            topAppBar(
                tittle = {Text(text= stringResource(id= R.string.home),
                    color = Color.White)},
                colors = TopAppBarDefaults.topAppBarColors
                    (containerColor = colorResource(id = R.color.purple_500))
            )
        }
    ){  isiRuang ->
        Column (modifier = modifier.padding(paddingvalues = isiRuang),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Arrangement.CenterHorizontally
        )   {
            OutlinedTextField(
                value = ""
                singleLine = true,
                modifier = Modifier
                    .padding(top = 10.dp)
                    .width(width= 250.dp),
                label = {Text(text = "Nama Lengkap")}
                onvalueChange = {},
            )
            HorizontalDivider(modifier = modifier
                .padding(all=20.dp)
                .width(width = 250.dp), thickness = Thickness, color = coloer.Red)
            Row {
                jenisK.forEach {
                    item->
                    Row(vertikalAlignment = Alignment.CenterVertically){
                        RadioButton(
                            selected = false
                            onClick = {item}
                        )
                        Text(text = item)
                    }
                }
            }
            HorizontalDivider(modifier = modifier
                .padding(all=20.dp)
                .width(width = 250.dp)
                thickness = 1.dp
                color = color.Red
            )





        }





        }

















}


