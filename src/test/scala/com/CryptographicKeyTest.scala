package com

import org.scalatest.{FunSuite, Matchers}

class CryptographicKeyTest extends FunSuite with Matchers {

    test("generating a DiffieHellman key pair") {

        val keyPair = CryptographicKey.generateDiffieHellmanKeyPair()

        keyPair should not be null

        keyPair.getAlgorithm should be ("DiffieHellman")
    }
}
