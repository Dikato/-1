/**该类通过存储一个命令词汇字符串数组来定义游戏中所有有效的命令
 * 它被用来识别输入的命令。
 */
package cn.edu.whut.sept.zuul;

public class CommandWords
{
	//定义go、quit、help三个最基础的指令前缀，保存所有有效命令字的常量数组
    private static final String[] validCommands = {
            "go", "quit", "help","back","look"
    };

    //构造函数——初始化命令字。
    public CommandWords()
    {
        // nothing to do at the moment...
    }
    //检查给定的字符串是否是有效的命令字。如果给定的字符串是有效的命令，则返回true，如果不是则返回false。

    public boolean isCommand(String aString)
    {
        for(int i = 0; i < validCommands.length; i++) {
            if(validCommands[i].equals(aString))
                return true;
        }
        //如果运行到这里，在命令中没有找到字符串
        return false;
    }

    //打印出有效的指令
    public void showAll()
    {
        for(String command: validCommands) {
            System.out.print(command + "  ");
        }
        System.out.println();
    }
}
