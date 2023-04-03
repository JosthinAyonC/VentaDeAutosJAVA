package clases;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class VentaVehiculo {

    private List<Vehiculo> vehiculos;
    private List<Cliente> clientes;

    public VentaVehiculo() {
        vehiculos = new ArrayList<>();
        clientes = new ArrayList<>();
    }

    public void registrarVenta(Vehiculo vehiculo, Cliente cliente) {
        vehiculos.add(vehiculo);
        
        boolean clienteExistente = false;
        for (Cliente c : clientes) {
            if (c.getCorreo().equalsIgnoreCase(cliente.getCorreo()) && c.getNombre().equalsIgnoreCase(cliente.getNombre())
                    && c.getApellido().equalsIgnoreCase(cliente.getApellido())) {
                c.agregarCompra(vehiculo);
                clienteExistente = true;
                break;
            }
        }

        if (!clienteExistente) {
            cliente.agregarCompra(vehiculo);
            clientes.add(cliente);
        }
    }

    public void buscarClientesMultiplesCompras() {

        boolean hayClientesConMultiplesCompras = false;

        for (Cliente cliente : clientes) {
            int numeroDeCompras = cliente.getCompras().size();

            if (numeroDeCompras > 1) {
                hayClientesConMultiplesCompras = true;
                System.out.println(cliente.getNombre() + " " + cliente.getApellido() + ", Compras: " + numeroDeCompras);
            }
        }

        if (!hayClientesConMultiplesCompras) {
            System.out.println("No hay clientes con mas de una compra.");
        }
    }

    public void buscarClientesPorMarca(String marca) {
        Set<Cliente> clientesMarca = new HashSet<>();

        for (Cliente cliente : clientes) {
            for (Vehiculo vehiculo : cliente.getCompras()) {
                if (vehiculo.getMarca().equalsIgnoreCase(marca)) {
                    clientesMarca.add(cliente);
                    break;
                }
            }
        }

        try {
            if (!clientesMarca.isEmpty()) {
                System.out.println("Clientes que han comprado vehiculos de la marca " + marca + ":");
                for (Cliente cliente : clientesMarca) {
                    System.out.println(cliente.toString());
                }
            } else {
                System.out.println("No hay clientes que hayan comprado vehiculos de la marca " + marca + ".");
            }
        } catch (Exception e) {
            System.out.println("Ocurrio un error: " + e.getMessage());
        }
    }
}
