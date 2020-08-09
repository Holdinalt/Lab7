package businessLogic.commands;

import businessLogic.dataBase.LoginManager;
import businessLogic.mainApp.Result;

public class LoginCommand implements Command {

    LoginManager loginManager;

    public LoginCommand(LoginManager loginManager, ControlUnit cu){
        cu.addCommand("login", this,CommandType.ARGS);
        this.loginManager = loginManager;
    }

    @Override
    public void execute(String options, Result result) {
        try {
            String login = options.split("\\^")[0];
            String pass = options.split("\\^")[1];
            boolean check = loginManager.loginCheck(login, pass);
            if (check){
                result.writeResult(login);
            }else{
                result.writeResult("");
            }
        }catch (Exception e){
            result.writeResult("Послупили неверные аргументы");
        }
    }

    @Override
    public String toString() {
        return "login login^pass - войти в сеть";

    }
}
