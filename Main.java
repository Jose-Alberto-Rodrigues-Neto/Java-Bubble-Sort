public class Main {
public static void main(String[] args) {
int listaBbSrt[] = {1,3,5,4,2};
int slot;

System.out.println("Será apresentado uma lista que utiliza Bubble Sort para sua ordenação.\nAntes da ordenação: ");
for(int x = 0; x<5; x++){
System.out.print("["+listaBbSrt[x]+"]"+" ");
}
for(int x=0; x<5; x++){
for(int y=0; y<4; y++){
if(listaBbSrt[y]>listaBbSrt[y + 1]){
slot=listaBbSrt[y];
listaBbSrt[y]=listaBbSrt[y + 1];
listaBbSrt[y + 1]=slot;
}
}
}
System.out.println("\nApós a ordenação pelo método do 'Bubble Sort': ");
for(int x = 0; x<5; x++){
System.out.print("["+listaBbSrt[x]+"]"+" ");
}
System.out.println("\nDessa vez em ordem decrescente: ");
for(int x=0; x<5; x++){
  for(int y=0; y<4; y++){
if(listaBbSrt[y]<listaBbSrt[y + 1]){
slot=listaBbSrt[y + 1];
listaBbSrt[y + 1]=listaBbSrt[y];
listaBbSrt[y]=slot;
}
}
}
for(int x = 0; x<5; x++){
System.out.print("["+listaBbSrt[x]+"]"+" ");
}
}
}