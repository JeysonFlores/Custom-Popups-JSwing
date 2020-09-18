package Popups;
import java.sql.Connection;
import Clases.Conexion;
import Clases.SimpleTimer;
import Clases.Usuario;

public class Popup {
    
    PopupMensajeAutoCloseD PM = new PopupMensajeAutoCloseD();
    boolean flag;
    
    public void Error(javax.swing.JFrame main, String msg){
        PopupErrorD PE = new PopupErrorD(main,true, msg);
        PE.setVisible(true);
    }
    
    
    public void Exito(javax.swing.JFrame main, String msg){
        PopupExitoD PE = new PopupExitoD(main, true,msg);
        PE.setVisible(true);
    }
    
    
    public void Msg(javax.swing.JFrame main, String msg){
        PopupMensajeAutoCloseD PM = new PopupMensajeAutoCloseD(main,false, msg);
        PM.setVisible(true);
        PM.setAlwaysOnTop(true);
        PM.aber();
        this.PM = PM;
    }
    
    public void MsgCerrar(){
        PM.dispose();
    }
    
    public int PopPreg(javax.swing.JFrame main,String msg){
        PopupPreguntaD PU = new PopupPreguntaD(main,true,msg);
        PU.setVisible(true);
        return PU.getReturnStatus();
    }
    
    public void Usuario(javax.swing.JFrame main,Usuario usu,SimpleTimer st){
        PopupUsuarioD PUD = new PopupUsuarioD(main,true,usu,st);
        PUD.setVisible(true);
    }
    
    public void PedidoDetalle(javax.swing.JFrame main,Conexion conex,Connection cone,String id,String fec,String clien,String emp,String tot){
        PopupPedidoDetallesD PPDD = new PopupPedidoDetallesD(main,true,conex,cone,id,fec,clien,emp,tot);
        PPDD.setVisible(true);
    }
    
    public void VentaDetalle(javax.swing.JFrame main,Conexion conex,Connection cone,String id,String fec,String clien,String emp,String tot){
        PopupVentaDetalleD PPDD = new PopupVentaDetalleD(main,true,conex,cone,id,fec,clien,emp,tot);
        PPDD.setVisible(true);
    }
    
    public void VentaReporte(javax.swing.JFrame main,String fecha,String ventas,String prods,String tot){
        PopupReporteCaja PRC = new PopupReporteCaja(main,true,fecha,prods,ventas,tot);
        PRC.setVisible(true);
    }
    
    public void Cambio(javax.swing.JFrame main, String tot){
        PopupCambioD DC = new PopupCambioD(main,true,tot);
        DC.setVisible(true);
    }
    
}
