/**该类是是一个语法分析器，从终端读入一行输入，将其解析为命令，并根据此命令创建command类的对象
 * 每次调用它时，它都会从终端读取一行，并尝试将该行解释为两个字的命令。它将命令作为command类的对象返回。解析器有一组已知的命令字。它根据已知命令检查用户输入，如果输入不是已知命令之一，则返回标记为未知命令的命令对象。
 */
package cn.edu.whut.sept.zuul;

import java.util.Scanner;

public class Parser
{
    private CommandWords commands;     //保存所有有效的命令字
    private Scanner reader;            //命令输入来源

    //创建一个从终端窗口读取的解析器。
    public Parser()
    {
        commands = new CommandWords();
        reader = new Scanner(System.in);
    }

    //返回用户的下一个命令。
    public Command getCommand()
    {
        String inputLine;      //将保存完整的输入行
        String word1 = null;
        String word2 = null;

        System.out.print("> ");   //打印提示符

        inputLine = reader.nextLine();

        //在这一行找到最多两个单词。
        Scanner tokenizer = new Scanner(inputLine);
        if(tokenizer.hasNext()) {
            word1 = tokenizer.next();   //获取第一个单词
            if(tokenizer.hasNext()) {
                word2 = tokenizer.next();   //获得第二个单词
            }
        }

        //现在检查一下这个单词是否已知。如果是，就用它创建一个命令。
        //如果不是，则创建一个“null”命令(用于未知命令)。
        if(commands.isCommand(word1)) {
            return new Command(word1, word2);
        }
        else {
            return new Command(null, word2);
        }
    }

    //打印出有效命令字的列表。
    public void showCommands()
    {
        commands.showAll();
    }
}
