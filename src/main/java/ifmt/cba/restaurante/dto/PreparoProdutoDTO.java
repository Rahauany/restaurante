package ifmt.cba.restaurante.dto;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.hateoas.RepresentationModel;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class PreparoProdutoDTO extends RepresentationModel<PreparoProdutoDTO> implements Serializable{

    private int codigo;
    private String nome;
    private ProdutoDTO produto;
    private TipoPreparoDTO tipoPreparo;
    private int tempoPreparo;
    private float valorPreparo;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
}
