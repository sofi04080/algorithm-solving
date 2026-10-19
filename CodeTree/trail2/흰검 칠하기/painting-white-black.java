import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        char[] dir = new char[n];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            dir[i] = sc.next().charAt(0);
        }

        // Please write your code here.
        Tile[] tiles = new Tile[200500];
        for (int i = 0; i < tiles.length; i++) {
            tiles[i] = new Tile(); 
        }
        int pos = 100250;

        for(int i = 0; i < n; i++){
            if(dir[i] == 'L'){
                for(int j = 0; j < x[i]; j++){
                    tiles[pos].wNum++;
                    tiles[pos].color = 'W';
                    if( j < x[i] - 1)
                        pos--;
                }
            } else {
                for(int j = 0; j < x[i]; j++){
                    tiles[pos].bNum++;
                    tiles[pos].color = 'B';
                    if( j < x[i] - 1)
                        pos++;
                }
            }
        }
        
        for(Tile tile : tiles){
            if(tile.wNum + tile.bNum >= 4 && tile.wNum >= 2 &&
            tile.bNum >= 2)
                tile.color = 'G';
        }

        int[] ans = new int[3];
        for(Tile tile : tiles) {
            if(tile.color == 'W')
                ans[0]++;
            if(tile.color == 'B')
                ans[1]++;
            if(tile.color == 'G')
                ans[2]++;
        }

        for(int i : ans) {
            System.out.print(i + " ");
        }
    }

    static class Tile {
        int wNum;
        int bNum;
        char color;

        public Tile() {
            wNum = 0;
            bNum = 0;
            color = '0';
        }
    }
}

