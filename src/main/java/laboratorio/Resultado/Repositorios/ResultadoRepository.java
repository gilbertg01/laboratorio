package laboratorio.Resultado.Repositorios;

import laboratorio.Facturacion.Entidades.Factura;
import laboratorio.Pruebas.Entidades.Prueba;
import laboratorio.Resultado.Entidades.Resultado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface ResultadoRepository extends JpaRepository<Resultado, Long> {
    //boolean existsByPrueba(Prueba p);
    boolean existsByPruebaAndFactura(Prueba p, Factura f);
}

