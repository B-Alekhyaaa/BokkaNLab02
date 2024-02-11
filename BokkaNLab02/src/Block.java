/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author s571697 Bokka Alekhya
 */
public class Block {

     private int blockId;
    private String blockName;
    private String dean;
    String display;
    
    public Block(){
        blockId = 1;
        blockName = "unknown";
        dean = "unknown";
    }
   public Block(int blockId , String blockName , String dean)
   {
       this.blockId = blockId;
       this.blockName = blockName;
       this.dean = dean;
   }
   public int getblockId(){
       return blockId;
   }
   public String getblockName() {
       return blockName;
   }
   public String getdean(){
       return dean;
   }
   public void setblockId(int blockId){
       this.blockId = blockId;
   }
   public void setblockName(String blockName){
       this.blockName = blockName;
   }
   public void setdean(String dean){
       this.dean = dean;
   }
   public String displayDean()
   {
       display = dean;
       return display;
   }
}

