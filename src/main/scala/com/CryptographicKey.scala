package com

import java.security.KeyPairGenerator

object CryptographicKey {
    val DIFFIE_HELLMAN_ALGORITHM = "DiffieHellman"

    def generateDiffieHellmanKeyPair(): KeyPairGenerator = KeyPairGenerator.getInstance(DIFFIE_HELLMAN_ALGORITHM)


}
