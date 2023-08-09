package com.romanuriel.chatconnect.data.preference

import android.content.Context
import androidx.core.content.edit


const val namePreference = "AppPreference"
enum class PreferenceKey(val code: String){

}


class Preference(context: Context) {
    private val sharedPreference = context.getSharedPreferences(namePreference, Context.MODE_PRIVATE)

    fun save(key: PreferenceKey, value: Any) {
        sharedPreference.edit {
            when (value) {
                is String -> this.putString(key.code, value)
                is Long -> this.putLong(key.code, value)
                is Boolean -> this.putBoolean(key.code, value)
                is Int -> this.putInt(key.code, value)
            }
            this.commit()
        }
    }


    fun getString(key: PreferenceKey): String{
        return sharedPreference.getString(key.code, "")?:""
    }

    fun getInt(key: PreferenceKey): Int{
        return sharedPreference.getInt(key.code, -1)
    }

    fun getBoolean(key: PreferenceKey): Boolean{
        return sharedPreference.getBoolean(key.code, false)
    }

    fun getLong(key: PreferenceKey): Long{
        return sharedPreference.getLong(key.code, -1L)
    }


}