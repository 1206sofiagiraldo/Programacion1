package co.edu.umanizales.myapi1.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Location {
    private String code;
    private String description;
    private String code_state;
    private String state_name;
}
