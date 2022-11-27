package com.mattstine.dddworkshop.pizzashop.payments;


/**
 * @author Matt Stine
 */
interface PaymentProcessor {
    PaymentProcessor IDENTITY = payment -> {

    };

    @SuppressWarnings({"EmptyMethod", "unused"})
    void request(Payment payment);
}
