JButton addButton = new JButton("Add Account");
    addButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String nickname = nicknameField.getText();
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());
            String pin = pinField.getText();
            String totpKey = totpKeyField.getText();

            Account account = new Account(nickname, username, password, pin, totpKey);
            accounts.add(account);

            // Clear fields
            nicknameField.setText("");
            usernameField.setText("");
            passwordField.setText("");
            pinField.setText("");
            totpKeyField.setText("");

            JOptionPane.showMessageDialog(mainWindow, "Account added successfully!");
        }
    });
    accountManagementPanel.add(addButton);
}

private void createSchedulePanel() {
    schedulePanel = new JPanel();
    schedulePanel.setLayout(new BoxLayout(schedulePanel, BoxLayout.Y_AXIS));

    JLabel titleLabel = new JLabel("Schedule Management");
    titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
    schedulePanel.add(titleLabel);

    // Add schedule-related components and functionality here...
}

private void createScriptCustomizationPanel() {
    scriptCustomizationPanel = new JPanel();
    scriptCustomizationPanel.setLayout(new BoxLayout(scriptCustomizationPanel, BoxLayout.Y_AXIS));

    JLabel titleLabel = new JLabel("Script Customization");
    titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
    scriptCustomizationPanel.add(titleLabel);

    // Add script customization components and functionality here...
}

private void createProxyManagementPanel() {
    proxyManagementPanel = new JPanel();
    proxyManagementPanel.setLayout(new BoxLayout(proxyManagementPanel, BoxLayout.Y_AXIS));

    JLabel titleLabel = new JLabel("Proxy Management");
    titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
    proxyManagementPanel.add(titleLabel);

    // Add proxy management components and functionality here...
}

public void addBotScript(BotScript botScript) {
    botScripts.add(botScript);
    createScriptSettingsPanel(botScript);
    updateMainWindow();
}