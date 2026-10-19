import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Tile[] tiles = new Tile[200005];
        for (int i = 0; i < tiles.length; i++) {
            tiles[i] = new Tile(); 
        }
        int pos = 100003;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);
            if(d == 'L'){
                for(int j = 0; j < x; j++){
                    tiles[pos].color = 'W';
                    if( j < x - 1)
                        pos--;
                }
                } else {
                for(int j = 0; j < x; j++){
                    tiles[pos].color = 'B';
                    if( j < x - 1)
                        pos++;
                    }
                }
        }
        // Please write your code here.
        
        int[] ans = new int[2];
        for(Tile tile : tiles) {
            if(tile.color == 'W')
                ans[0]++;
            if(tile.color == 'B')
                ans[1]++;
        }

        System.out.println(ans[0] + " " + ans[1]);
    }

    static class Tile {
        char color;
        public Tile() {
            color = '0';
        }
    }
}