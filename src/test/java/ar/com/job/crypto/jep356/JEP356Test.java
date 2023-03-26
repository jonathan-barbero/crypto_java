package ar.com.job.crypto.jep356;

import java.util.Random;
import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

class JEP356Test {

    @org.junit.jupiter.api.Test
    void getAllPRNGs() {

        var prngs = JEP356.getAllPRNGs();
        prngs.forEach(System.out::println);

        RandomGenerator prng1 = RandomGeneratorFactory.
                of("Random").create(45);
        System.out.println("prng1 - " + prng1.getClass());

        RandomGenerator prng2 = new Random(45);
        System.out.println("prng2 - " + prng2.getClass());

        RandomGenerator prng3 = RandomGeneratorFactory.
                getDefault().create(45);
        System.out.println("prng3 - " + prng3.getClass());

        RandomGenerator prng4 = RandomGenerator.getDefault();
        System.out.println("prng4 - " + prng4.getClass());
    }
}