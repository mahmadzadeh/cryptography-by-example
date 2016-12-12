package com

import org.scalatest.FunSuite

class AESTest extends FunSuite {

    test( "given AES then can encrypt and decrypt" ) {

        val aes = new AES( )

        val testString = "onetwothree"

        assertResult( testString ) {

            new String( aes.decrypt( aes.encrypt( testString.getBytes ) ) )
        }
    }

}
