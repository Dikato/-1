/**游戏运行的主类，包含了打开游戏的play方法
 * 
 */
package cn.edu.whut.sept.zuul;

public class Main {

	Command [] s=new Command[5];  //随机房间效果

	for(int i=0;i<5;i++){
    	k[i]=null;
		k[i]=new Command(null, null);
	}
    public static void main(String[] args) {
        Game game = new Game();
        game.play();
    }
}
