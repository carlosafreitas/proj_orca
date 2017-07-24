/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.tsi.domain;

/**
 *
 * @author carlos
 */
public class Composicoes {
    private int id;
    private String classe;
    private int agrupador;
    private String descricao_agrupador;
    private String codigo_composicao;
    private String descricao_composicao;
    private float unidade;
    private float custo_mao_obra;
    private float mao_obra;
    private float custo_material;
    private float material;
    private float custo_equipamento;
    private float equipamento;
    private float custo_servicos_terceiros;
    private float servicos_terceiros;
    private float custo_outros;
    private float outros;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getAgrupador() {
        return agrupador;
    }

    public void setAgrupador(int agrupador) {
        this.agrupador = agrupador;
    }

    public String getDescricao_agrupador() {
        return descricao_agrupador;
    }

    public void setDescricao_agrupador(String descricao_agrupador) {
        this.descricao_agrupador = descricao_agrupador;
    }

    public String getCodigo_composicao() {
        return codigo_composicao;
    }

    public void setCodigo_composicao(String codigo_composicao) {
        this.codigo_composicao = codigo_composicao;
    }

    public String getDescricao_composicao() {
        return descricao_composicao;
    }

    public void setDescricao_composicao(String descricao_composicao) {
        this.descricao_composicao = descricao_composicao;
    }

    public float getUnidade() {
        return unidade;
    }

    public void setUnidade(float unidade) {
        this.unidade = unidade;
    }

    public float getCusto_mao_obra() {
        return custo_mao_obra;
    }

    public void setCusto_mao_obra(float custo_mao_obra) {
        this.custo_mao_obra = custo_mao_obra;
    }

    public float getMao_obra() {
        return mao_obra;
    }

    public void setMao_obra(float mao_obra) {
        this.mao_obra = mao_obra;
    }

    public float getCusto_material() {
        return custo_material;
    }

    public void setCusto_material(float custo_material) {
        this.custo_material = custo_material;
    }

    public float getMaterial() {
        return material;
    }

    public void setMaterial(float material) {
        this.material = material;
    }

    public float getCusto_equipamento() {
        return custo_equipamento;
    }

    public void setCusto_equipamento(float custo_equipamento) {
        this.custo_equipamento = custo_equipamento;
    }

    public float getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(float equipamento) {
        this.equipamento = equipamento;
    }

    public float getCusto_servicos_terceiros() {
        return custo_servicos_terceiros;
    }

    public void setCusto_servicos_terceiros(float custo_servicos_terceiros) {
        this.custo_servicos_terceiros = custo_servicos_terceiros;
    }

    public float getServicos_terceiros() {
        return servicos_terceiros;
    }

    public void setServicos_terceiros(float servicos_terceiros) {
        this.servicos_terceiros = servicos_terceiros;
    }

    public float getCusto_outros() {
        return custo_outros;
    }

    public void setCusto_outros(float custo_outros) {
        this.custo_outros = custo_outros;
    }

    public float getOutros() {
        return outros;
    }

    public void setOutros(float outros) {
        this.outros = outros;
    }
    
}
