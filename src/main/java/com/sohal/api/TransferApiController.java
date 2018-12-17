package com.sohal.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sohal.RFC3339DateFormat;
import com.sohal.model.TransferRequest;
import com.sohal.model.TransferResponse;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Optional;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-16T12:45:47.431Z")

@RestController
public class TransferApiController implements TransferApi {

    Logger logger = LoggerFactory.getLogger(TransferApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public TransferApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    @Override
    public Optional<ObjectMapper> getObjectMapper() {
        return Optional.ofNullable(objectMapper);
    }

    @Override
    public Optional<HttpServletRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<TransferResponse> transfer(@ApiParam(value = "Accounts details to move funds between account"  ) @Valid @RequestBody TransferRequest transferRequest) {
        TransferResponse transferResponse = null;
        ResponseEntity<TransferResponse> responseEntity = null;

        try {
            transferResponse = new TransferResponse();

            transferResponse.setTransactionDateTime(OffsetDateTime.now());
            transferResponse.setTransactionID(transferRequest.getRequestHeader().getTransactionID());
            transferResponse.setClientRefNumber(transferRequest.getRequestHeader().getClientRefNumber());
            transferResponse.setResponseCode("100");
            responseEntity = new ResponseEntity<>(transferResponse, HttpStatus.OK);

            logger.info("Respose code: HTTP.OK");
        } catch (Exception e) {
            logger.error("Got exception: ", e);
            responseEntity = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        logger.info("Sending response");
        return responseEntity;
    }
}
