package com

import com.MessageSigning.verifySignature
import org.scalatest.FunSuite

class MessageSigningTest extends FunSuite {

    val keyPair = KeyPairGeneration.DSAKeyPair.generateKeyPair( )
    val privateKey = keyPair.getPrivate
    val publicKey = keyPair.getPublic

    test( "given message it can be signed" ) {

        val msg = "this is my sample message"

        assert( !MessageSigning.generateSignatureBase64Encoded( privateKey, msg ).isEmpty )
    }

    test( "signature verification" ) {

        val msg = "this is my sample message"

        val signature = MessageSigning.generateSignature( privateKey, msg )

        assert( verifySignature( publicKey, signature, msg ) )
    }

}
