/**一个room对象代表游戏中的一个位置。房间可以由出口通向其他房间。
 * “房间”代表游戏场景中的一个地点。它通过出口与其他房间相连。对于每个现有出口，房间存储对相邻房间的引用。
 */
package cn.edu.whut.sept.zuul;

import java.util.Set;
import java.util.HashMap;

public class Room
{
    private String description;
    private HashMap<String, Room> exits;    //存储这个房间的出口。

    //创建一个描述为“description”的房间。最初，它没有出口。
    public Room(String description)
    {
        this.description = description;
        exits = new HashMap<>();
    }

    //确定这个房间的出口。direction退出方向。neighbor出口指向的房间。
    public void setExit(String direction, Room neighbor)
    {
        exits.put(direction, neighbor);
    }

    //房间的简短描述(在构造函数中定义的)。
    public String getShortDescription()
    {
        return description;
    }

    //在表单中返回房间的描述。返回对这个房间的长描述
    public String getLongDescription()
    {
        return "You are " + description + ".\n" + getExitString();
    }

    //返回一个描述房间出口的字符串，例如“exits: north west”。房间出口的详细信息。
    private String getExitString()
    {
        String returnString = "Exits:";
        Set<String> keys = exits.keySet();
        for(String exit : keys) {
            returnString += " " + exit;
        }
        return returnString;
    }

    //如果我们从这个房间往“direction”方向走，返回所到达的房间。如果该方向没有空间，则返回null。出口的方向。指定方向的房间。
    public Room getExit(String direction)
    {
        return exits.get(direction);
    }
    //back
    public Room backExit()
    {
        return exits.get(Command.s);
    }
}


