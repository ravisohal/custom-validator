package com.sohal.api;

import com.sohal.model.MoveMoneyRequest;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@Component
public class WireRequestValidation implements ConstraintValidator<WireRequest, MoveMoneyRequest> {

    @Override
    public void initialize(WireRequest wireRequest) {

    }

    @Override
    public boolean isValid(MoveMoneyRequest moveMoneyRequest, ConstraintValidatorContext constraintValidatorContext) {
        return !(moveMoneyRequest != null && moveMoneyRequest.getServiceType().equals("WIRE")
                                                && (moveMoneyRequest.getFromEntity() == null ||
                                                    moveMoneyRequest.getWireExternalRefNumber() == null));
    }
}
