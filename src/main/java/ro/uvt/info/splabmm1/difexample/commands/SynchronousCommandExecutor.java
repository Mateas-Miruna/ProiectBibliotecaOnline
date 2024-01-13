package ro.uvt.info.splabmm1.difexample.commands;

public class SynchronousCommandExecutor implements CommandExecutor {
    @Override
    public void executeCommand(Command command) {
        command.execute();
    }
}
