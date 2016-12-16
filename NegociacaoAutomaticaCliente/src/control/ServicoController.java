/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import model.TestCallback;
import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.OMNamespace;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
import org.apache.axis2.client.async.AxisCallback;
import org.apache.axis2.transport.http.HTTPConstants;

/**
 *
 * @author Ricardo
 */
public class ServicoController 
{
    private EndpointReference targetEPR = new EndpointReference("http://localhost:8080/axis2/services/NegociacaoAutomatica");
    private ServiceClient sender;
    private OMElement payload;
    private Options options;
    private TestCallback axisCallback;

    public ServicoController() throws Exception
    {        
        try 
        {
            sender = new ServiceClient();
            options = new Options();
        }
        catch(Exception ex)
        {
            throw ex;
        }        
    }

    
    
    public String enviarInicializacao(String nome) throws Exception
    {
        try
        {
            OMElement payload = AxisController.serviceEnviarInicializacao(nome);
            Options options = new Options();
            options.setTo(targetEPR);
            options.setAction("urn:enviarInicializacao");
            TestCallback axisCallback = new TestCallback("enviarInicializacao") ;

            sender.setOptions(options);
            sender.sendReceive(payload);

            
            return "";
        }
        catch(Exception ex)
        {
            throw ex;
        }        
    }
    
    public String receberClientes() throws Exception
    {
        try
        {
            OMElement payload = AxisController.serviceReceberClientes();
            Options options = new Options();
            options.setTo(targetEPR);
            options.setAction("urn:receberClientes");
            TestCallback axisCallback = new TestCallback("receberClientes") ;

            sender.setOptions(options);
            sender.sendReceiveNonBlocking(payload, axisCallback);

            while ( ! axisCallback.isComplete( ) ) 
            {
                Thread.sleep(100);
            }        
            
            return axisCallback.getResult();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        
    }

    public String enviarMarcacoes(String marcacoes) throws Exception
    {
        try
        {
            OMElement payload = AxisController.serviceEnviarMarcacoes(marcacoes);
            Options options = new Options();
            options.setTo(targetEPR);
            options.setAction("urn:enviarMarcacoes");
            TestCallback axisCallback = new TestCallback("enviarMarcacoes") ;

            sender.setOptions(options);
            sender.sendReceiveNonBlocking(payload, axisCallback);

            while ( ! axisCallback.isComplete( ) ) 
            {
                Thread.sleep(100);
            }        
            
            return axisCallback.getResult();
        }
        catch(Exception ex)
        {
            throw ex;
        }        
    }
    
    public String enviarDesligamento(String nome) throws Exception
    {
        try
        {
            OMElement payload = AxisController.serviceEnviarDesligamento(nome);
            Options options = new Options();
            options.setTo(targetEPR);
            options.setAction("urn:enviarDesligamento");
            TestCallback axisCallback = new TestCallback("enviarDesligamento") ;

            sender.setOptions(options);
            sender.sendReceiveNonBlocking(payload, axisCallback);

            while ( ! axisCallback.isComplete( ) ) 
            {
                Thread.sleep(100);
            }        
            
            return axisCallback.getResult();
        }
        catch(Exception ex)
        {
            throw ex;
        }        
    }
    
    public String enviarAcao(String acao) throws Exception
    {
        try
        {
            OMElement payload = AxisController.serviceEnviarAcao(acao);
            Options options = new Options();
            options.setTo(targetEPR);
            options.setAction("urn:enviarAcao");
            TestCallback axisCallback = new TestCallback("enviarAcao") ;

            sender.setOptions(options);
            sender.sendReceive(payload);

            
            return "";
        }
        catch(Exception ex)
        {
            throw ex;
        }        
    }
    
    public String receberAcao() throws Exception
    {
        try
        {
            OMElement payload = AxisController.serviceReceberAcao();
            Options options = new Options();
            options.setTo(targetEPR);
            options.setAction("urn:receberAcao");
            TestCallback axisCallback = new TestCallback("receberAcao") ;

            sender.setOptions(options);
            sender.sendReceiveNonBlocking(payload, axisCallback);

            while ( ! axisCallback.isComplete( ) ) 
            {
                Thread.sleep(100);
            }        
            
            return axisCallback.getResult();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        
    }
    
    public String iteracoes() throws Exception
    {
        try
        {
            OMElement payload = AxisController.serviceReceberAcao();
            Options options = new Options();
            options.setTo(targetEPR);
            options.setAction("urn:iteracoes");
            TestCallback axisCallback = new TestCallback("iteracoes") ;

            sender.setOptions(options);
            sender.sendReceiveNonBlocking(payload, axisCallback);

            while ( ! axisCallback.isComplete( ) ) 
            {
                Thread.sleep(100);
            }        
            
            return axisCallback.getResult();
        }
        catch(Exception ex)
        {
            throw ex;
        }
        
    }
}
