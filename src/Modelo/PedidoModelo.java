/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marcio
 */
public class PedidoModelo {

    private int codPedido;
    private int codEntrPedido;
    private int codFuncPedido;
    private int codCliPedido;
    private String numMesa;
    private String statusPed;
    private String nomeMotoboy;    
    private String horaPed;
    private String dataPed;
    private Double totalPedido;
    private List<Integer> codProduto;
    private List<Integer> Qtde;

    public PedidoModelo() {
        codProduto = new ArrayList<>();
        Qtde = new ArrayList<>();

    }

    public int getCodProduto(int posicao) {
        return codProduto.get(posicao);
    }

    public void setCodProduto(int codproduto) {
        this.codProduto.add(codproduto);
    }

    public int getQtde(int posicao) {
        return Qtde.get(posicao);
    }

    public void setQtde(int Qtde) {
        this.Qtde.add(Qtde);
    }

    
    public int getCodPedido() {
        return codPedido;
    }

    public void setCodPedido(int codPedido) {
        this.codPedido = codPedido;
    }

    public int getCodEntrPedido() {
        return codEntrPedido;
    }

    public void setCodEntrPedido(int codEntrPedido) {
        this.codEntrPedido = codEntrPedido;
    }

    public int getCodFuncPedido() {
        return codFuncPedido;
    }

    public void setCodFuncPedido(int codFuncPedido) {
        this.codFuncPedido = codFuncPedido;
    }

    public int getCodCliPedido() {
        return codCliPedido;
    }

    public void setCodCliPedido(int codCliPedido) {
        this.codCliPedido = codCliPedido;
    }

    public String getNumMesa() {
        return numMesa;
    }

    public void setNumMesa(String numMesa) {
        this.numMesa = numMesa;
    }

    public String getStatusPed() {
        return statusPed;
    }

    public void setStatusPed(String statusPed) {
        this.statusPed = statusPed;
    }
    public String getNomeMotoboy() {
        return nomeMotoboy;
    }

    public void setNomeMotoboy(String nomeMotoboy) {
        this.nomeMotoboy = nomeMotoboy;
    }

    public String getHoraPed() {
        return horaPed;
    }

    public void setHoraPed(String horaPed) {
        this.horaPed = horaPed;
    }

    public String getDataPed() {
        return dataPed;
    }

    public void setDataPed(String dataPed) {
        this.dataPed = dataPed;
    }

    public Double getTotalPedido() {
        return totalPedido;
    }

    public void setTotalPedido(Double totalPedido) {
        this.totalPedido = totalPedido;
    }

}
