package com.mattstine.dddworkshop.pizzashop.payments;

import com.mattstine.dddworkshop.pizzashop.infrastructure.domain.services.RefStringGenerator;
import com.mattstine.dddworkshop.pizzashop.infrastructure.repository.ports.Ref;
import lombok.Value;

/**
 * @author Matt Stine
 */
@Value
public final class PaymentRef implements Ref {
    public static final PaymentRef IDENTITY = new PaymentRef("");
    String reference;

    public PaymentRef() {
        reference = RefStringGenerator.generateRefString();
    }

    @SuppressWarnings("SameParameterValue")
    PaymentRef(String reference) {
        this.reference = reference;
    }
}
