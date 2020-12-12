package com.milerarch;

import com.milerarch.dao.ClienteDao;
import com.milerarch.dao.CocheDao;
import com.milerarch.dao.RevisionDao;
import com.milerarch.model.Cliente;
import com.milerarch.model.Coche;
import com.milerarch.model.Revision;
import com.milerarch.util.ConectorBD;

import java.sql.Connection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //CLIENTES

        //Cliente cliente = new Cliente("3244","Fabrizio Rodriguez","Cochabamba","Av.Circunvalacion",76754343);
        //Cliente alberto = new Cliente("3334","Ponce Arnez","Cochabamba","Av.Santivanez",7654763);
        //Cliente miguel = new Cliente("3544","Grandi Soliz","Cochabamba","Av.Loreto",7676543);
        //Cliente jose = new Cliente("3265","Vargas Mamani","Cochabamba","Av.Perez",7346343);
        //Cliente luis = new Cliente("3275","Perez Soto","Cochabamba","Av.Punata",7746443);
        //Cliente bruno = new Cliente("3114","Mollinedo Quispe","Cochabamba","Av.Circunvalacion",78767443);

        //CRUD tabla clientes
        ClienteDao clienteDao = new ClienteDao();

        //CREATE

        //clienteDao.addCliente(alberto);
        //clienteDao.addCliente(miguel);
        //clienteDao.addCliente(jose);
        //clienteDao.addCliente(luis);
        //clienteDao.addCliente(bruno);

        //READ
        /*List<Cliente> clientes = clienteDao.getALLClientes();
        for (int i = 0; i < clientes.size(); i++) {
            Cliente cliente = clientes.get(i);
            System.out.println(cliente);


        }
        */
        //UPDATE
        //Cliente cliente = new Cliente("3244","Fernando Lopez","Cochabamba","Av.Villazon",76454353);
        //clienteDao.updateCliente(cliente);

        //DELETE
        //clienteDao.deleteCliente("3244");
        //clienteDao.deleteCliente("3334");

        //COCHES********************************************************************************************************

        //Coche coche = new Coche("HH344","BMW","Toyota Corolla","Plomo",7000);
        //Coche ford = new Coche("33JGJ","Dacia","Ford","Rojo",4500);
        //Coche volkswagen = new Coche("HH344","Infiniti","Volkswagen","Amarillo",9000);
        //Coche fiat = new Coche("HH344","Land Rover","Fiat","Verde",8500);
        //Coche honda = new Coche("HH344","Kia","Honda Civic","Negro",6300);
        //Coche chevrolet = new Coche("HH344","Susuki","Chevrolet","Blanco",14000);

        //CRUD tabla coches
        CocheDao cocheDao = new CocheDao();

        //CREATE

        //cocheDao.addCoche(coche);
        //cocheDao.addCoche(ford);
        //cocheDao.addCoche(volkswagen);
        //cocheDao.addCoche(fiat);
        //cocheDao.addCoche(chevrolet);

        //READ
        /*List<Coche> coches = cocheDao.getALLCoches();
        for (int i = 0; i < coches.size(); i++) {
            coche = coches.get(i);
            System.out.println(coche);


        }*/

        //UPDATE
        //Coche coche1 = new Coche("HH344","Nissan","Chevrolet Impala","Azul",8900);
        //cocheDao.updateCoche(coche1);

        //DELETE
        //cocheDao.deleteCoche("3244");
        //cocheDao.deleteCoche("3334");

        //REVISIONES**************************************************************************************************

        //Revision bateria = new Revision("5454","Buen estado","Buen estado","Buen estado");
        //Revision llantas = new Revision("3334","Mal estado","Buen estado","Buen estado");
        //Revision amortiguadores = new Revision("3434","Buen estado","Mal estado","Mal estado");
        //Revision embrague = new Revision("3875","Buen estado","Mal estado","Buen estado");
        //Revision combustible = new Revision("8775","Mal estado","Mal estado","Buen estado");
        //Revision alineacion = new Revision("3114","Buen estado","Buen estado","Mal estado");

        //CRUD tabla clientes
        Revision revisionDao = new Revision();

        //CREATE

        //revisionDao.addRevision(bateria);
        //revisionDao.addRevision(llantas);
        //revisionDao.addRevision(amortiguadores);
        //revisionDao.addRevision(embrague);
        //revisionDao.addRevision(combustible);
        //revisionDao.addRevision(alineacion);

        //READ

        /*List<Revision> revisiones = revisionDao.getALLRevisiones();
        for (int i = 0; i < revisiones.size(); i++) {
            Revision revision = revisiones.get(i);
           System.out.println(revision);


       }*/

        //UPDATE
        //Revision revision = new Revision("5454","Buen estado","Buen estado","Buen estado");
        //revision.updateRevision(revision);

        //DELETE
        //revisionDao.deleteRevision("5454");
        //revisionDao.deleteRevision("3334");


    }
}
