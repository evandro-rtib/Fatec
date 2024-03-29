public class GuiExemplo extends javax.swing.JFrame {
    public GuiExemplo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgSexo = new javax.swing.ButtonGroup();
        pnlDados = new javax.swing.JPanel();
        lbnNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lbnValor = new javax.swing.JLabel();
        txtValorCarro = new javax.swing.JTextField();
        pnlSexo = new javax.swing.JPanel();
        rbSexoMasculino = new javax.swing.JRadioButton();
        rbSexoFeminino = new javax.swing.JRadioButton();
        pnlFaixaIdade = new javax.swing.JPanel();
        cbxFaixaIdade = new javax.swing.JComboBox<>();
        pnlPerfil = new javax.swing.JPanel();
        ckbUnicoMotorista = new javax.swing.JCheckBox();
        ckbDirigiSomenteCidade = new javax.swing.JCheckBox();
        pnlProposta = new javax.swing.JPanel();
        pnlValorBaseSeguro = new javax.swing.JPanel();
        lblValorBaseSeguro = new javax.swing.JLabel();
        lblResValorBaseSeguro = new javax.swing.JLabel();
        pnlDescIdade = new javax.swing.JPanel();
        lblDescIdade = new javax.swing.JLabel();
        lblResDescIdade = new javax.swing.JLabel();
        pnlDescSexo = new javax.swing.JPanel();
        lblDescSexo = new javax.swing.JLabel();
        lblResDescSexo = new javax.swing.JLabel();
        pnlValorSeguro = new javax.swing.JPanel();
        lblValorSeguro = new javax.swing.JLabel();
        lblResValorSeguro = new javax.swing.JLabel();
        pnlDescPeril = new javax.swing.JPanel();
        lbDescPerfil = new javax.swing.JLabel();
        lbResDescPerfil = new javax.swing.JLabel();
        pnlBotoes = new javax.swing.JPanel();
        btnSair = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnCalcularProposta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlDados.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Dados"));
        pnlDados.setName("pnlDados"); // NOI18N

        lbnNome.setText("Nome");
        lbnNome.setName("lbnNome"); // NOI18N

        txtNome.setName("tbNome"); // NOI18N

        lbnValor.setText("Valor Carro");
        lbnValor.setName("lbnValor"); // NOI18N

        txtValorCarro.setName("tbValor"); // NOI18N

        pnlSexo.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Sexo"));
        pnlSexo.setName("pnlSexo"); // NOI18N
        pnlSexo.setPreferredSize(new java.awt.Dimension(160, 90));

        btgSexo.add(rbSexoMasculino);
        rbSexoMasculino.setSelected(true);
        rbSexoMasculino.setText("Masculino");
        rbSexoMasculino.setName("rbSexoMasc"); // NOI18N

        btgSexo.add(rbSexoFeminino);
        rbSexoFeminino.setText("Feminino");
        rbSexoFeminino.setName("rbSexoFem"); // NOI18N

        javax.swing.GroupLayout pnlSexoLayout = new javax.swing.GroupLayout(pnlSexo);
        pnlSexo.setLayout(pnlSexoLayout);
        pnlSexoLayout.setHorizontalGroup(
            pnlSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSexoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbSexoMasculino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbSexoFeminino)
                .addGap(39, 39, 39))
        );
        pnlSexoLayout.setVerticalGroup(
            pnlSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSexoLayout.createSequentialGroup()
                .addGroup(pnlSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbSexoFeminino)
                    .addComponent(rbSexoMasculino))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        rbSexoMasculino.getAccessibleContext().setAccessibleName("");
        rbSexoFeminino.getAccessibleContext().setAccessibleName("");

        pnlFaixaIdade.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Faixa de Idade"));
        pnlFaixaIdade.setPreferredSize(new java.awt.Dimension(160, 50));

        cbxFaixaIdade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "De 18 a 25 anos", "De 26 a 35 anos", "Acima de 35 anos" }));

        javax.swing.GroupLayout pnlFaixaIdadeLayout = new javax.swing.GroupLayout(pnlFaixaIdade);
        pnlFaixaIdade.setLayout(pnlFaixaIdadeLayout);
        pnlFaixaIdadeLayout.setHorizontalGroup(
            pnlFaixaIdadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFaixaIdadeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbxFaixaIdade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlFaixaIdadeLayout.setVerticalGroup(
            pnlFaixaIdadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFaixaIdadeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbxFaixaIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        cbxFaixaIdade.getAccessibleContext().setAccessibleParent(pnlFaixaIdade);

        javax.swing.GroupLayout pnlDadosLayout = new javax.swing.GroupLayout(pnlDados);
        pnlDados.setLayout(pnlDadosLayout);
        pnlDadosLayout.setHorizontalGroup(
            pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosLayout.createSequentialGroup()
                        .addComponent(lbnNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlDadosLayout.createSequentialGroup()
                        .addComponent(lbnValor)
                        .addGap(13, 13, 13)
                        .addComponent(txtValorCarro))
                    .addComponent(pnlFaixaIdade, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                    .addComponent(pnlSexo, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlDadosLayout.setVerticalGroup(
            pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosLayout.createSequentialGroup()
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbnNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbnValor)
                    .addComponent(txtValorCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlFaixaIdade, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
        );

        lbnNome.getAccessibleContext().setAccessibleParent(pnlDados);
        txtNome.getAccessibleContext().setAccessibleParent(pnlDados);
        lbnValor.getAccessibleContext().setAccessibleParent(pnlDados);
        txtValorCarro.getAccessibleContext().setAccessibleParent(pnlDados);
        pnlSexo.getAccessibleContext().setAccessibleName("");
        pnlSexo.getAccessibleContext().setAccessibleParent(pnlDados);
        pnlFaixaIdade.getAccessibleContext().setAccessibleParent(pnlDados);

        pnlPerfil.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Perfil"));
        pnlPerfil.setPreferredSize(new java.awt.Dimension(160, 90));

        ckbUnicoMotorista.setText("Único Motorista");

        ckbDirigiSomenteCidade.setText("Dirigi somente na cidade");

        javax.swing.GroupLayout pnlPerfilLayout = new javax.swing.GroupLayout(pnlPerfil);
        pnlPerfil.setLayout(pnlPerfilLayout);
        pnlPerfilLayout.setHorizontalGroup(
            pnlPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPerfilLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ckbDirigiSomenteCidade)
                    .addComponent(ckbUnicoMotorista))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlPerfilLayout.setVerticalGroup(
            pnlPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPerfilLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(ckbUnicoMotorista)
                .addGap(18, 18, 18)
                .addComponent(ckbDirigiSomenteCidade)
                .addContainerGap())
        );

        pnlProposta.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Proposta"));

        lblValorBaseSeguro.setText("Valor base do Seguro");

        lblResValorBaseSeguro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        javax.swing.GroupLayout pnlValorBaseSeguroLayout = new javax.swing.GroupLayout(pnlValorBaseSeguro);
        pnlValorBaseSeguro.setLayout(pnlValorBaseSeguroLayout);
        pnlValorBaseSeguroLayout.setHorizontalGroup(
            pnlValorBaseSeguroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlValorBaseSeguroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblValorBaseSeguro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblResValorBaseSeguro, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlValorBaseSeguroLayout.setVerticalGroup(
            pnlValorBaseSeguroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlValorBaseSeguroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlValorBaseSeguroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValorBaseSeguro)
                    .addComponent(lblResValorBaseSeguro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(127, 127, 127))
        );

        lblDescIdade.setText("Desc. Idade");

        lblResDescIdade.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        javax.swing.GroupLayout pnlDescIdadeLayout = new javax.swing.GroupLayout(pnlDescIdade);
        pnlDescIdade.setLayout(pnlDescIdadeLayout);
        pnlDescIdadeLayout.setHorizontalGroup(
            pnlDescIdadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDescIdadeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDescIdade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblResDescIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlDescIdadeLayout.setVerticalGroup(
            pnlDescIdadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDescIdadeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlDescIdadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblResDescIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescIdade))
                .addGap(53, 53, 53))
        );

        lblDescSexo.setText("Desc. Sexo");

        lblResDescSexo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        javax.swing.GroupLayout pnlDescSexoLayout = new javax.swing.GroupLayout(pnlDescSexo);
        pnlDescSexo.setLayout(pnlDescSexoLayout);
        pnlDescSexoLayout.setHorizontalGroup(
            pnlDescSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDescSexoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDescSexo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblResDescSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlDescSexoLayout.setVerticalGroup(
            pnlDescSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDescSexoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlDescSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblResDescSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescSexo))
                .addGap(90, 90, 90))
        );

        lblValorSeguro.setText("Valor do Seguro");

        lblResValorSeguro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        lbDescPerfil.setText("Desc. Perfil");

        lbResDescPerfil.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        javax.swing.GroupLayout pnlDescPerilLayout = new javax.swing.GroupLayout(pnlDescPeril);
        pnlDescPeril.setLayout(pnlDescPerilLayout);
        pnlDescPerilLayout.setHorizontalGroup(
            pnlDescPerilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDescPerilLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbDescPerfil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbResDescPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlDescPerilLayout.setVerticalGroup(
            pnlDescPerilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDescPerilLayout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addGroup(pnlDescPerilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDescPerfil)
                    .addComponent(lbResDescPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlValorSeguroLayout = new javax.swing.GroupLayout(pnlValorSeguro);
        pnlValorSeguro.setLayout(pnlValorSeguroLayout);
        pnlValorSeguroLayout.setHorizontalGroup(
            pnlValorSeguroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDescPeril, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlValorSeguroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblValorSeguro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblResValorSeguro, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlValorSeguroLayout.setVerticalGroup(
            pnlValorSeguroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlValorSeguroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlValorSeguroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblValorSeguro)
                    .addComponent(lblResValorSeguro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94)
                .addComponent(pnlDescPeril, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlDescPeril.getAccessibleContext().setAccessibleParent(pnlProposta);

        javax.swing.GroupLayout pnlPropostaLayout = new javax.swing.GroupLayout(pnlProposta);
        pnlProposta.setLayout(pnlPropostaLayout);
        pnlPropostaLayout.setHorizontalGroup(
            pnlPropostaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPropostaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPropostaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlValorBaseSeguro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDescIdade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlValorSeguro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDescSexo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlPropostaLayout.setVerticalGroup(
            pnlPropostaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPropostaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlValorBaseSeguro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlDescIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlDescSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pnlValorSeguro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pnlBotoes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.setEnabled(false);

        btnCalcularProposta.setText("Calcular");

        javax.swing.GroupLayout pnlBotoesLayout = new javax.swing.GroupLayout(pnlBotoes);
        pnlBotoes.setLayout(pnlBotoesLayout);
        pnlBotoesLayout.setHorizontalGroup(
            pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBotoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCalcularProposta, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );
        pnlBotoesLayout.setVerticalGroup(
            pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBotoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcularProposta)
                    .addComponent(btnLimpar)
                    .addComponent(btnSair))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlProposta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(pnlDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlProposta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlDados.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GuiExemplo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiExemplo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiExemplo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiExemplo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiExemplo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgSexo;
    private javax.swing.JButton btnCalcularProposta;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> cbxFaixaIdade;
    private javax.swing.JCheckBox ckbDirigiSomenteCidade;
    private javax.swing.JCheckBox ckbUnicoMotorista;
    private javax.swing.JLabel lbDescPerfil;
    private javax.swing.JLabel lbResDescPerfil;
    private javax.swing.JLabel lblDescIdade;
    private javax.swing.JLabel lblDescSexo;
    private javax.swing.JLabel lblResDescIdade;
    private javax.swing.JLabel lblResDescSexo;
    private javax.swing.JLabel lblResValorBaseSeguro;
    private javax.swing.JLabel lblResValorSeguro;
    private javax.swing.JLabel lblValorBaseSeguro;
    private javax.swing.JLabel lblValorSeguro;
    private javax.swing.JLabel lbnNome;
    private javax.swing.JLabel lbnValor;
    private javax.swing.JPanel pnlBotoes;
    private javax.swing.JPanel pnlDados;
    private javax.swing.JPanel pnlDescIdade;
    private javax.swing.JPanel pnlDescPeril;
    private javax.swing.JPanel pnlDescSexo;
    private javax.swing.JPanel pnlFaixaIdade;
    private javax.swing.JPanel pnlPerfil;
    private javax.swing.JPanel pnlProposta;
    private javax.swing.JPanel pnlSexo;
    private javax.swing.JPanel pnlValorBaseSeguro;
    private javax.swing.JPanel pnlValorSeguro;
    private javax.swing.JRadioButton rbSexoFeminino;
    private javax.swing.JRadioButton rbSexoMasculino;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtValorCarro;
    // End of variables declaration//GEN-END:variables
}
