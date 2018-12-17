package com.sohal.api;

import com.sohal.model.MoveMoneyRequest;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@Component
public class AccountTransferRequestValidation implements ConstraintValidator<AccountTransferRequest, MoveMoneyRequest> {

    @Override
    public void initialize(AccountTransferRequest accountTransferRequest) {

    }

    @Override
    public boolean isValid(MoveMoneyRequest moveMoneyRequest, ConstraintValidatorContext constraintValidatorContext) {
        return !(moveMoneyRequest != null && moveMoneyRequest.getServiceType().equals("XFER")
                                                && moveMoneyRequest.getToEntity() == null);
    }
}
