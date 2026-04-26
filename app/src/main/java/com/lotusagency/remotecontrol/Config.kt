package com.lotusagency.remotecontrol

import java.security.MessageDigest

object Config {
    const val SERVER_URL = "wss://coordinate-participation-innovation-effects.trycloudflare.com"
    const val SECRET_KEY = "LotusAgency2025!"
    const val DEVICE_ID  = "phone_01"
    const val NOTIF_CH   = "lotus_remote"

    fun makeToken(): String {
        val md   = MessageDigest.getInstance("SHA-256")
        val hash = md.digest(SECRET_KEY.toByteArray())
        return hash.take(16).joinToString("") { "%02x".format(it) }
    }
}
