package com.ar.wsdlToJava;

import org.apache.cxf.tools.wsdlto.WSDLToJava;

//CXF wsdl2java Example
public class App {

    public static void main(String[] args) {
        try {
            // you can also specify WSDL directly like
            // http://localhost:8080/CXFTutorial/ChangeStudent?wsdl
            WSDLToJava.main(new String[] { "-d", "src", "CustomerCareServiceCom.wsdl" });
            System.out.println("finished %%%%%%%%%%");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}