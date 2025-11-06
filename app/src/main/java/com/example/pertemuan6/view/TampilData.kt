package com.example.pertemuan6.view

import android.R
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@composable
fun TampilanData(
    onBackBtnClick:()-> Unit
){
    val items = listOf(
        Pair(stringResource(id = R.string.nama_lengkap), second = "Contoh Nama"),
        Pair(stringResource(id = R.string.jenis_kelamin), second = "contoh jenis kelamin"),
        Pair(stringResource(id = R.string.alamat), second = "Contoh Alamat")
}{
    Scaffold (modifier = Modifier,
        topBar = {
            topAppBar(
                title = {
                    Text(
                        text = stringResource(id = R.string.tampil)
                        color = color.white
                    )},
                colors = TopAppBarDefaulfaults
                    .mediumTopAppBarColors(containerColor = color.Resource
                              (id=R.color.teal_700)
                    )
            )
        }){
        Column (
            modifier = Modifier.padding(all = dimensionResource(id = R.dimen.padding_medium)),
            verticalArrangement = Arrangement.spacedBy(dimensionResource(id = R.dimen.padding_small))
        ){
            items.forEach{ item->
                Column {
                    Text(
                        text = item.first.uppercase(),
                        fontSize = 20.sp,
                        Text(
                            text = item.second,
                            fontwight = FontWeight.Bold,
                            fontfamily = FontFamily.Cursive fontsize = 22.sp
                        )
                    )
                }
                horizontalDivider(thickness = 1.dp, R.color= color.Cyan)
        }   spacer(modifier = modifier.height(height=10.dp))
            button(
                modifier = Modifier.fillMaxWidth(),
                onClick = onBackBtnClick
            ) {
                Text(text = stringResource(id = R.string.back))
            }



    }
}
