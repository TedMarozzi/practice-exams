import java.util.ArrayList;

public class GameStudio {
    public GameStudio(){};

    /* Takes a descending order sorted
    integer array s which contains the size of
    each file in megabytes sorted from largest to smallest
    where n is the maximum file size and the size of the
    space on each disk
     */
    public static int num_discs(int n, int[] s){
        ArrayList<Integer> discs = new ArrayList<>();
        discs.add(n);
        int maxCapacity = n;

        // for each element in the array, attempt to insert it
        for (int file : s) {
            boolean filePlaced = false;
            for (int i = 0; i < discs.size(); i ++) {
                if (discs.get(i) > file) {
                    discs.set(i, discs.get(i) - file);
                    filePlaced = true;
                    break;
                }
            }
            if (!filePlaced) {
                discs.add(n);
            }
        }
        return discs.size();
    }
}
