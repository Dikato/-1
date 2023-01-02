/**一个command对象代表了用户输入的命令，他有一些方法可以很容易地判断是否是有效的命令，还可以将命令中的第一个和第二个单词分离出来。
 * 该类保存关于用户发出的命令的信息。一个命令目前由两个字符串组成:一个命令字和第二个字(例如，如果命令是“take map”，那么这两个字符串*显然是“take”和“map”)。它的使用方式是:命令已经被检查为有效的命令字。如果用户输入了一个无效的命令(一个不知道的字)，那么命令字是<null>。如果命令只有一个单词，那么第二个单词是空>。
 */
package cn.edu.whut.sept.zuul;

public class Command
{
    private String commandWord;
    private String secondWord;
    //存储命令的数组（即存放最基础的指令前缀）创建一个命令对象。
	//必须提供第一个和第二个单词，但其中一个(或两个)可以为空。如果不识别命令，则为Null
    public Command(String firstWord, String secondWord)
    {
        commandWord = firstWord;
        this.secondWord = secondWord;
    }

    //返回该命令的命令字(第一个字)。如果不理解命令，则结果为null。
    public String getCommandWord()
    {
        return commandWord;
    }

    //返回命令的第二个单词。如果没有，则返回null。
    public String getSecondWord()
    {
        return secondWord;
    }

    //如果不理解此命令，则返回true。
    public boolean isUnknown()
    {
        return (commandWord == null);
    }

    //判断是否有第二个单词，如果命令中有第二个单词，则返回true。
    public boolean hasSecondWord()
    {
        return (secondWord != null);
    }
}
