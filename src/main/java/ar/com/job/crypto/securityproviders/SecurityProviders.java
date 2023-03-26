package ar.com.job.crypto.securityproviders;

import java.security.Provider;
import java.security.Security;

public class SecurityProviders {
    public static Provider[] getAllProviders() {
        return Security.getProviders();
    }

}
