package apachecamel.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = "idendificadoresDocumentos")
@XmlRootElement(name = "outroNome")
public class XMLDto {

    protected IdendificadoresType idendificadoresDocumentos;

    public IdendificadoresType getIdendificadoresDocumentos() {
        return idendificadoresDocumentos;
    }

    public void setIdendificadoresDocumentos(IdendificadoresType idendificadoresDocumentos) {
        this.idendificadoresDocumentos = idendificadoresDocumentos;
    }

    @Override
    public String toString() {
        return "apachecamel.dto.XMLDto{" +
                "idendificadoresDocumentos=" + idendificadoresDocumentos +
                '}';
    }
}