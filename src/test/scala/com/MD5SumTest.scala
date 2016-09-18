package com

import org.scalatest.FunSuite

class MD5SumTest extends FunSuite {

    val testString = "this is a test"

    test("output is always 16 bytes (128 bits) ") {
        assertResult(16){
            MD5Sum.calculateMD5Sum(testString).size
        }
    }

    test("MD5 with as hex output") {
        assertResult("54b0c58c7ce9f2a8b551351102ee0938"){
            MD5Sum.calculateMD5SumWithHexEncodingOutput(testString)
        }
    }

    test("MD5 with as base64 output") {
        assertResult("VLDFjHzp8qi1UTURAu4JOA=="){
            MD5Sum.calculateMD5SumWithBase64EncodingOutput(testString)
        }
    }

}
