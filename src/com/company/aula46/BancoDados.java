package com.company.aula46;

public interface BancoDados extends SqlDDL,SqlDML,SqlDCL {

    void abrirConexao();
    void fecharConexao();

}
