package com.junaedi.pertemuan6

import android.provider.BaseColumns

object MahasiswaContract {
    class MahasiswaEntry : BaseColumns {
        companion object {
            const val TABLE_NAME = "mahasiswa"
            const val EMAIL = "email"
            const val NAMA = "nama"
            const val NIM = "nim"
            const val PASSWORD = "password"
        }

    }
}