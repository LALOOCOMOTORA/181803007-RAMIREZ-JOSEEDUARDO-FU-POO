/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acteck
 */
public class avisos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        formulario aviso=new formulario();
        aviso.matricula="Aviso 1 ";
        aviso.titulo="Insumos y bienes muebles de laboratorio disponibles";
        aviso.texto1=":La Coordinación de Control Técnico de Insumos (COCTI) de la Dirección de Prestaciones Médicas, pone a disposición del personal que realiza investigación el inventario adjunto.";
        aviso.texto2="Insumos y bienes muebles de laboratorio disponibles por la Coordinación de Control Técnico de Insumos (COCTI)";
        aviso.autor="Eduardo Flores Díaz";
        aviso.fechaP="02/02/2020";
        aviso.fechaA="02/02/2020";
        aviso.fechaB="02/02/2021";
        aviso.status="vigente";
        aviso.tipo="Gerenal";
        
        formulario aviso2=new formulario();
        aviso2.matricula="Aviso 2";
        aviso2.titulo="CONFERENCIA DR. COSSARIZZA";
        aviso2.texto1="El Dr. Andrea Cossarizza, ofreció a la comunidad IMSS su conferencia “Clinical Applications of Advanced Cytometry” y aprovechó la presencia de investigadores y estudiantes del IMSS para compartir sus últimos resultados de investigación, aún no publicados, sobre VIH y el uso de citometría de flujo."
                + "Además, invitó a nuestra comunidad a agregarse a la sociedad internacional sobre citometría: ISAC(International Society for the Advancement of Cytometry) y aprovechar los recursos que tienen como:\n" +
"\n" +
"Programa de Liderazgo MARYLOU INGRAM SCHOLARS PROGRAM, de 5 años para formación de citomteristas\n" +
"Iniciativa de innovación CYTO-Innovation apoya a las propuestas innovadoras que contemplan la conversión de ideas en productos comerciales de alto impacto para ayudar a nuevos empresarios a aprovechar la tecnología de citometría\n" +
"\n" +
"Además en la ISAC tienen disponibles una serie de manuales e información de punta sobre la citometría para uso libre. El Dr. Cossarizza reiteró la invitación al personal IMSS a vincularse con la Universidad de Módena y su laboratorio aprovechando el prestigio que tiene el Laboratorio de Citometría de Flujo del Centro de Instrumentos del Centro Médico Nacional Siglo XXI.";
        aviso2.texto2="Conferencia de Dr. Andrea Cossarizza del tema “Clinical Applications of Advanced Cytometry\"";
        aviso2.autor="Kevin Meza Gonzalez";
        aviso2.fechaP="02/03/2020";
        aviso2.fechaA="15/02/2020";
        aviso2.fechaB="31/03/2020";
        aviso2.status="No Vigente";
        aviso2.tipo="conferencia";
        System.out.println(aviso.toString());
        System.out.println(aviso2.toString());
        
    }
    
}