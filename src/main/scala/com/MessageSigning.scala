package com

import java.nio.ByteBuffer
import java.security.{PrivateKey, PublicKey, Signature}

import org.apache.commons.codec.binary.Base64.encodeBase64

object MessageSigning {

    def generateSignatureBase64Encoded(privateKey: PrivateKey, data: String): String =
        new String( encodeBase64( generateSignature( privateKey, data ) ) )

    def generateSignature(privateKey: PrivateKey, data: String): Array[ Byte ] = {

        val dsa = Signature.getInstance( "SHA1withDSA" )

        dsa.initSign( privateKey )
        dsa.update( ByteBuffer.wrap( data.getBytes( "UTF-8" ) ) )

        dsa.sign( )
    }

    def verifySignature(pub: PublicKey, signature: Array[ Byte ], data: String): Boolean = {

        val dsa = Signature.getInstance( "SHA1withDSA" )
        dsa.initVerify( pub )

        dsa.update( ByteBuffer.wrap( data.getBytes( "UTF-8" ) ) )

        dsa.verify( signature )
    }


}
