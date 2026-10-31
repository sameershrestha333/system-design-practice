package lld.designpattern.creational.factory.withfactory;

import lld.designpattern.creational.factory.withoutfactory.AdyenProcessor;
import lld.designpattern.creational.factory.withoutfactory.CastlesProcessor;
import lld.designpattern.creational.factory.withoutfactory.PaymentProcessor;

import java.util.Map;

// Simple Factory / Registry — selects a registered payment processor
public final class PaymentProcessorFactory {

    private static final Map<String, PaymentProcessor> registryMap = Map.of(
            "CASTLES", new CastlesProcessor(),
            "ADYEN", new AdyenProcessor()
    );

    private PaymentProcessorFactory() {
    }

    public static PaymentProcessor getInstance(String provider) {
        if (!registryMap.containsKey(provider)) {
            throw new IllegalArgumentException("Unknown Provider :" + provider);

        }
        return registryMap.get(provider);
    }
}
