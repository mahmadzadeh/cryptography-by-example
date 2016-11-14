package com

import java.security.{KeyPairGenerator, SecureRandom}

object KeyPairGeneration {

    def DSAKeyPair: KeyPairGenerator = {

        val keyGen = KeyPairGenerator.getInstance( "DSA", "SUN" )

        // use a stronger random value (SecureRandom.getInstanceStrong()) for cases like RSA public/private keys
        keyGen.initialize( 1024, SecureRandom.getInstance( "SHA1PRNG", "SUN" ) )

        keyGen
    }

}
