package apachecamel.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "idendificadoresType", propOrder = {
        "identificador",
        "codigoCarrinho"
})
class IdendificadoresType {

    protected List<IdendificadoresType> identificador;
    protected String codigoCarrinho;

    public List<IdendificadoresType> getIdentificador() {
        return identificador;
    }

    public void setIdentificador(List<IdendificadoresType> identificador) {
        this.identificador = identificador;
    }

    public String getCodigoCarrinho() {
        return codigoCarrinho;
    }

    public void setCodigoCarrinho(String codigoCarrinho) {
        this.codigoCarrinho = codigoCarrinho;
    }

    @Override
    public String toString() {
        return "apachecamel.dto.IdendificadoresType{" +
                "identificador=" + identificador +
                ", codigoCarrinho='" + codigoCarrinho + '\'' +
                '}';
    }
}