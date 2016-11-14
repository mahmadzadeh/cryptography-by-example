package com

import java.security.Security;

object InstalledProvider {

    def allInstalledProviders: Seq[ String ] = {
        Security.getProviders( ).map( provider => s"${provider.getInfo}" )
    }
}
