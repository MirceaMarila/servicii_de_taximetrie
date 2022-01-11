package unibuc.servicii_de_taximetrie.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import unibuc.servicii_de_taximetrie.model.Client;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({CarNotFoundException.class, ClientNotFoundException.class, DetailsNotFoundException.class,
            DriverNotFoundException.class, PreferencesNotFoundException.class, RideNotFoundException.class,
            NoDriversAvailableException.class, NotEnaughFoundsException.class})
    public ResponseEntity<Map<String, String>> handleException(RuntimeException exception){
        Map<String, String> responseParameters = new HashMap<>();
        responseParameters.put("Reason: ", exception.getMessage());
        responseParameters.put("DateTime: ", LocalDateTime.now().toString());

        return ResponseEntity.badRequest().body(responseParameters);
    }

}
