package ar.com.job.crypto.jep356;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;
import java.util.stream.Stream;

public class JEP356 {

    public static Stream<String> getAllPRNGs() {

        Stream<RandomGeneratorFactory<RandomGenerator>> allPRNGs = RandomGeneratorFactory.all();
        return allPRNGs.map(prng ->
                prng.name() + " [ Group: " + prng.group() + "; "
                        + (prng.isArbitrarilyJumpable() ? " arbitrary-jump" : "")
                        + (prng.isHardware() ? " hardware" : "")
                        + (prng.isJumpable() ? " jump" : "")
                        + (prng.isLeapable() ? " leap" : "")
                        + (prng.isSplittable() ? " split" : "")
                        + (prng.isStatistical() ? " statistical" : "")
                        + (prng.isStochastic() ? " stochastic" : "")
                        + (prng.isStreamable() ? " stream" : "")
                        + "; noOfBits: " + prng.stateBits()
                        + "]"
        ).sorted();
    }
}
