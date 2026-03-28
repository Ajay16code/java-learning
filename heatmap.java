import java.util.Random;

public class GitHubHeatmap {

    public static void main(String[] args) {
        int weeks = 10;   // columns
        int days = 7;     // rows

        int[][] heatmap = new int[days][weeks];
        Random rand = new Random();

        // Fill with random contribution values (0–4)
        for (int i = 0; i < days; i++) {
            for (int j = 0; j < weeks; j++) {
                heatmap[i][j] = rand.nextInt(5);
            }
        }

        // Print heatmap
        System.out.println("GitHub Contribution Heatmap:\n");

        for (int i = 0; i < days; i++) {
            for (int j = 0; j < weeks; j++) {
                System.out.print(getSymbol(heatmap[i][j]) + " ");
            }
            System.out.println();
        }
    }

    // Convert value to symbol (like GitHub intensity)
    public static String getSymbol(int value) {
        switch (value) {
            case 0: return "⬜"; // no activity
            case 1: return "🟩";
            case 2: return "🟩";
            case 3: return "🟩";
            case 4: return "🟩"; // high activity
            default: return "⬜";
        }
    }
}
