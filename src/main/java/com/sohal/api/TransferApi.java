/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.0).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.sohal.api;

import com.sohal.model.TransferRequest;
import com.sohal.model.TransferResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.IOException;
import java.util.Optional;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-16T12:45:47.431Z")

@Api(value = "transfer", description = "the transfer API")
public interface TransferApi {

    Logger log = LoggerFactory.getLogger(TransferApi.class);

    default Optional<ObjectMapper> getObjectMapper() {
        return Optional.empty();
    }

    default Optional<HttpServletRequest> getRequest() {
        return Optional.empty();
    }

    default Optional<String> getAcceptHeader() {
        return getRequest().map(r -> r.getHeader("Accept"));
    }

    @ApiOperation(value = "transfer funds between accounts", nickname = "transfer", notes = "move funds between accounts", response = TransferResponse.class, tags={ "admins", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "success", response = TransferResponse.class),
        @ApiResponse(code = 400, message = "invalid input, object invalid"),
        @ApiResponse(code = 409, message = "unable to complete transfer") })
    @ApiImplicitParams({
    })
    @RequestMapping(value = "/transfer",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<TransferResponse> transfer(@ApiParam(value = "Accounts details to move funds between account"  )  @Valid @RequestBody TransferRequest transferRequest) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"transactionDateTime\" : \"2016-08-29T09:12:33.001Z\",  \"clientRefNumber\" : \"0123456789\",  \"transactionID\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\",  \"responseCode\" : 100.0}", TransferResponse.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default TransferApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
