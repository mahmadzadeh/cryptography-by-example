package com

import java.security.SecureRandom
import java.util.Random

import org.scalatest.FunSuite

class SecureRandomTest extends FunSuite {

    test("given same seed java.util.Random WILL generate the same random value") {
        val seed = System.currentTimeMillis()

        val instanceOne = new Random(seed)
        val instanceTwo = new Random(seed)

        assert(instanceOne.nextInt() === instanceTwo.nextInt())
    }

    test("given two instance of SecureRandom using self-seeding then they will generate different random data") {

        val instanceOne = new SecureRandom()
        val instanceTwo = new SecureRandom()

        assert( instanceOne.nextInt() != instanceTwo.nextInt())
    }

    test("ask for an exact PRNG so that you get the same implementation regardless of platform (Win, *NIX") {

        val instanceOne = SecureRandom.getInstance("SHA1PRNG", "SUN")

        assert( instanceOne.nextInt() != instanceOne.nextInt())
    }
}
