package com

import javax.crypto.{Cipher, KeyGenerator}

class AES() {

    val aesKey = KeyGenerator.getInstance( "AES" ).generateKey( )


    def encrypt(data: Array[ Byte ]): Array[ Byte ] = {
        val aesCipher = Cipher.getInstance( "AES/ECB/PKCS5Padding" )

        aesCipher.init( Cipher.ENCRYPT_MODE, aesKey )

        aesCipher.doFinal( data )
    }

    def decrypt(data: Array[ Byte ]): Array[ Byte ] = {
        val aesCipher = Cipher.getInstance( "AES/ECB/PKCS5Padding" )

        aesCipher.init( Cipher.DECRYPT_MODE, aesKey )

        aesCipher.doFinal( data )
    }
}
