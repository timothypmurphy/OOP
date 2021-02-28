import java.awt.Color;


public class Voronoi {

    public static double pointDist(Point2D point1, Point2D point2) {
        double x;
        x =  Math.sqrt(Math.pow((point2.getX()-point1.getX()),2) + Math.pow((point2.getY() - point1.getY()),2));
        return x;
    }

    public static int findClosestPoint(Point2D point, Point2D[] sites) {
        int closest = 0;
        for(int i = 1; i< sites.length; i++){
            if(pointDist(point, sites[i]) < pointDist(point, sites[closest])){
                closest = i;
            }
        }
        return closest;
    }

    public static int[][] buildVoronoiMap(Point2D[] sites, int width, int height) {
        int[][] map = new int[width][height];
        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                map[i][j] = findClosestPoint(new Point2D (i,j), sites);
            }
        }
        return  map;
    }

    public static void plotVoronoiMap(Point2D[] sites, Color[] colors, int[][] indexMap) {
        int width = indexMap.length;
        int height = indexMap[0].length;

        StdDraw.setCanvasSize(width, height);
        StdDraw.setXscale(0, width);
        StdDraw.setYscale(0, height);

        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                StdDraw.setPenColor(colors[indexMap[i][j]]);
                StdDraw.point(i,j);
            }
        }
        StdDraw.setPenColor(Color.BLACK);
        for(int k = 0; k<sites.length; k++){StdDraw.filledCircle(sites[k].getX(), sites[k].getY(), 3);}
    }

    public static void main(String[] args) {
        int width = 200;
        int height = 200;

        int nSites = 5;
        Point2D[] sites = new Point2D[nSites];
        sites[0] = new Point2D(50, 50);
        sites[1] = new Point2D(100, 50);
        sites[2] = new Point2D(50, 100);
        sites[3] = new Point2D(125, 50);
        sites[4] = new Point2D(100, 175);

        Color[] colors = new Color[nSites];
        colors[0] = Color.BLUE;
        colors[1] = Color.GREEN;
        colors[2] = Color.YELLOW;
        colors[3] = Color.ORANGE;
        colors[4] = Color.MAGENTA;

        int[][] indexmap = buildVoronoiMap(sites, width, height);
        plotVoronoiMap(sites, colors, indexmap);

    }

}