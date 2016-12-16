/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.OMNamespace;

/**
 *
 * @author Ricardo
 */
public class AxisController {
    public static OMElement serviceEnviarInicializacao(String nome) 
    {
        OMFactory fac = OMAbstractFactory.getOMFactory();
        OMNamespace omNs = fac.createOMNamespace("http://quickstart.samples/xsd","NegociacaoAutomatica");
        OMElement method = fac.createOMElement("enviarInicializacao", omNs);        
        
        OMElement value1 = fac.createOMElement("nome", omNs);
        value1.addChild(fac.createOMText(value1, nome));        
        method.addChild(value1);

        return method;
    }
    
    public static OMElement serviceReceberClientes() 
    {
        OMFactory fac = OMAbstractFactory.getOMFactory();
        OMNamespace omNs = fac.createOMNamespace("http://quickstart.samples/xsd","NegociacaoAutomatica");
        OMElement method = fac.createOMElement("receberClientes", omNs);        
        return method;
    }
    
    public static OMElement serviceEnviarMarcacoes(String marcacoes) 
    {
        OMFactory fac = OMAbstractFactory.getOMFactory();
        OMNamespace omNs = fac.createOMNamespace("http://quickstart.samples/xsd","NegociacaoAutomatica");
        OMElement method = fac.createOMElement("enviarMarcacoes", omNs); 
        
        OMElement value1 = fac.createOMElement("marcacoes", omNs);
        value1.addChild(fac.createOMText(value1, marcacoes));        
        method.addChild(value1);

        return method;
    }
    
    public static OMElement serviceEnviarDesligamento(String nome) 
    {
        OMFactory fac = OMAbstractFactory.getOMFactory();
        OMNamespace omNs = fac.createOMNamespace("http://quickstart.samples/xsd","NegociacaoAutomatica");
        OMElement method = fac.createOMElement("enviarDesligamento", omNs);        
        
        OMElement value1 = fac.createOMElement("nome", omNs);
        value1.addChild(fac.createOMText(value1, nome));        
        method.addChild(value1);

        return method;
    }
    
    public static OMElement serviceEnviarAcao(String acao) 
    {
        OMFactory fac = OMAbstractFactory.getOMFactory();
        OMNamespace omNs = fac.createOMNamespace("http://quickstart.samples/xsd","NegociacaoAutomatica");
        OMElement method = fac.createOMElement("enviarAcao", omNs);        
        
        OMElement value1 = fac.createOMElement("acao", omNs);
        value1.addChild(fac.createOMText(value1, acao));        
        method.addChild(value1);

        return method;
    }
    
    public static OMElement serviceReceberAcao() 
    {
        OMFactory fac = OMAbstractFactory.getOMFactory();
        OMNamespace omNs = fac.createOMNamespace("http://quickstart.samples/xsd","NegociacaoAutomatica");
        OMElement method = fac.createOMElement("receberAcao", omNs);        
        return method;
    }
    
    public static OMElement serviceIteracoes() 
    {
        OMFactory fac = OMAbstractFactory.getOMFactory();
        OMNamespace omNs = fac.createOMNamespace("http://quickstart.samples/xsd","NegociacaoAutomatica");
        OMElement method = fac.createOMElement("iteracoes", omNs);        
        return method;
    }
}
