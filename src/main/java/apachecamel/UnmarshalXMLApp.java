package apachecamel;

import apachecamel.dto.XMLDto;

import javax.xml.bind.JAXB;
import java.io.StringReader;

public class UnmarshalXMLApp {

    public static void main(String[] args) {

        String xmlString = "<idendificadoresDocumentos><identificador><codigoProduto>26</codigoProduto><codigoSubproduto>0040</codigoSubproduto></identificador><codigoCarrinho>2201826</codigoCarrinho></idendificadoresDocumentos>";
        StringReader stringReader = new StringReader(xmlString);
        XMLDto xmlDto = JAXB.unmarshal(stringReader, XMLDto.class);

        System.out.print("apachecamel.dto.XMLDto -> " + xmlDto);

    }
}


