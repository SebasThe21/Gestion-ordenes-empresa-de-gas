
package com.arcos.gestion_ordenes.Control;

import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.util.JRLoader;


public class GenerarReporte extends Conexion {
  
   private void reporte(){
            try {
            String patch="src\\main\\java\\com\\arcos\\gestion_ordenes\\Reportes\\report1.jasper";
            JasperPrint jasperPrint = JasperFillManager.fillReport(patch, null, new JREmptyDataSource());
        } catch (JRException ex) {
            Logger.getLogger(GenerarReporte.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
   


    
}
