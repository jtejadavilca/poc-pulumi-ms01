package pe.com.pd.controller;


import pe.com.pd.dto.ResponseServiceOneDTO;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/service-one")
public class ServiceOneController {

    @GetMapping("/operation101")
    public ResponseEntity<ResponseServiceOneDTO> getResponseServiceOneOperationOne() {
        return getResponse(101, "S1-Op01", "Service one - Operation one");
    }

    @GetMapping("/operation102")
    public ResponseEntity<ResponseServiceOneDTO> getResponseServiceOneOperationTwo() {
        return getResponse(102,"S1-Op02", "Service one - Operation two");
    }

    @GetMapping("/operation103")
    public ResponseEntity<ResponseServiceOneDTO> getResponseServiceOneOperationThree() {
        return getResponse(103, "S1-Op03", "Service one - Operation three");
    }

    @GetMapping("/operation104")
    public ResponseEntity<ResponseServiceOneDTO> getResponseServiceOneOperationFour() {
        return getResponse(104, "S1-Op04", "Service one - Operation four");
    }

    @GetMapping("/operation105")
    public ResponseEntity<ResponseServiceOneDTO> getResponseServiceOneOperationFive() {
        return getResponse(105, "S1-Op05", "Service one - Operation five");
    }

    @GetMapping("/operation106")
    public ResponseEntity<ResponseServiceOneDTO> getResponseServiceOneOperationSix() {
        return getResponse(106, "S1-Op06", "Service one - Operation six");
    }

    @GetMapping("/operation107")
    public ResponseEntity<ResponseServiceOneDTO> getResponseServiceOneOperationSeven() {
        return getResponse(107, "S1-Op07", "Service one - Operation seven");
    }

    @GetMapping("/operation108")
    public ResponseEntity<ResponseServiceOneDTO> getResponseServiceOneOperationEight() {
        return getResponse(108, "S1-Op08", "Service one - Operation eight");
    }

    @GetMapping("/operation109")
    public ResponseEntity<ResponseServiceOneDTO> getResponseServiceOneOperationNine() {
        return getResponse(109, "S1-Op09", "Service one - Operation nine");
    }

    private ResponseEntity<ResponseServiceOneDTO> getResponse(int id, String name, String description) {
        var response = ResponseServiceOneDTO
                .builder()
                .id(id)
                .name(name)
                .description(description)
                .build();

        return ResponseEntity.ok(response);
    }
}
