package com.example.pertemuan6.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource

@Composable
@composable
fun TampilanData(
    onBackBtnClick:()-> Unit
){
    val items = listOf(
        Pair(stringResource(id = R.string.nama_lengkap), second = "Contoh Nama"),
        Pair(stringResource(id = R.string.jenis_kelamin), second = ""),
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
        )

    }
}
