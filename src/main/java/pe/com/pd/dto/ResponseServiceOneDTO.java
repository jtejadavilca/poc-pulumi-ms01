package pe.com.pd.dto;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ResponseServiceOneDTO implements Serializable {
    private static final long serialVersionUID = -7668959359805124438L;

    private int id;
    private String name;
    private String description;

}
