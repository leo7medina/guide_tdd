package ec.com.tio.leo.dev.spt.models;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Banco {
    private Long id;
    private String nombre;
    private int totalTransferencias;
}
