private void createScriptSettingsPanel(BotScript botScript) {
    JPanel scriptSettingsPanel = new JPanel();
    scriptSettingsPanel.setLayout(new BoxLayout(scriptSettingsPanel, BoxLayout.Y_AXIS));

    JLabel titleLabel = new JLabel(botScript.getName() + " Settings");
    titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
    scriptSettingsPanel.add(titleLabel);

    // Add script-specific settings components and functionality here...

    scriptSettingsPanels.add(scriptSettingsPanel);
}

private void updateMainWindow() {
    mainWindow.getContentPane().removeAll();
    mainWindow.setLayout(new GridLayout(2, 2));

    mainWindow.add(accountManagementPanel);
    mainWindow.add(schedulePanel);
    mainWindow.add(scriptCustomizationPanel);
    mainWindow.add(proxyManagementPanel);

    for (JPanel scriptSettingsPanel : scriptSettingsPanels) {
        mainWindow.add(scriptSettingsPanel);
    }

    mainWindow.revalidate();
    mainWindow.repaint();
}

public static void main(String[] args) {
    System.loadLibrary(Core.NATIVE_LIBRARY_NAME); // Initialize OpenCV

    BotManagerClient botManagerClient = new BotManagerClient();
    // Create and configure bot scripts...
    BotScript botScript1 = new BotScript("Bot Script 1");
    // Configure botScript1

    BotScript botScript2 = new BotScript("Bot Script 2");
    // Configure botScript2

    botManagerClient.addBotScript(botScript1);
    botManagerClient.addBotScript(botScript2);
}
}