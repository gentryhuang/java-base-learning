package com.design.pattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Staff 命令执行者
 *
 * @author shunhua
 * @date 2019-10-04
 */
public class Staff {
    /**
     * 命令集合，可以接收多个命令
     */
    private List<Command> commands = new ArrayList<>();

    /**
     * 接收命令
     * @param command
     */
    public void addCommand(Command command){
        commands.add(command);
    }

    /**
     * 移除命令
     * @param command
     */
    public void removeCommand(Command command){
        commands.remove(command);
    }

    /**
     * 执行指定的名
     * @param command
     */
    public void execureCommand(Command command){
        command.execute();
    }

    /**
     * 执行命令集
     */
   public void executeCommandList(){
        this.commands.stream().forEach(Command::execute);
        commands.clear();
   }

}