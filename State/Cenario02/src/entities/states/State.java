package entities.states;

public interface State {

    void sucessoAoPagar() throws Exception;
    void despacharPedido() throws Exception;
    void cancelarPedido() throws Exception;

}
