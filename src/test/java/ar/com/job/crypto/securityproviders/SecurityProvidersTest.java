package ar.com.job.crypto.securityproviders;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SecurityProvidersTest {

    @Test
    void getAllProviders() {
        Arrays.stream(SecurityProviders.getAllProviders()).map(x -> "Provider " + x.getName() + " I: " + x.getInfo()).forEach(System.out::println);
    }
}