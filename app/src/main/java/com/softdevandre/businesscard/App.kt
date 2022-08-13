package com.softdevandre.businesscard

import android.app.Application
import com.softdevandre.businesscard.data.AppDataBase
import com.softdevandre.businesscard.data.BusinessCardRepository

class App : Application() {
    val database by lazy { AppDataBase.getDatabase(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}