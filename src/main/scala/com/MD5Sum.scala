package com

import java.math.BigInteger
import java.security.MessageDigest

import org.apache.commons.codec.binary.Base64.encodeBase64

object MD5Sum {


    def calculateMD5SumWithHexEncodingOutput(string: String): String =
        new BigInteger( 1, calculateMD5Sum( string ) ).toString( 16 )

    def calculateMD5SumWithBase64EncodingOutput(string: String): String = new String( encodeBase64( calculateMD5Sum( string ) ) )

    def calculateMD5Sum(string: String): Array[ Byte ] = {
        val messageDigest = MessageDigest.getInstance( "MD5" )

        messageDigest.update( string.getBytes )

        messageDigest.digest( )
    }

}
