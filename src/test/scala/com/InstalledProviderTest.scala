package com

import org.scalatest.FunSuite

class InstalledProviderTest extends FunSuite {

    test("can get list of providers installed on this machine") {

        val listProviderList  = InstalledProvider.allInstalledProviders

        assertResult( true) { listProviderList.size > 1 }
    }
}
