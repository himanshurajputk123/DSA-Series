class Solution {
    public boolean calDistance(int radius, int x1, int y1, int x2, int y2){
        int dis = (int)Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        if(dis > radius) return false;
        return true;
        
    }
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        

        int closestX, closestY;

        if (yCenter < y1)
            closestY = y1;
        else if (yCenter > y2)
            closestY = y2;
        else
            closestY = yCenter;

        if (xCenter < x1)
            closestX = x1;
        else if (xCenter > x2)
            closestX = x2;
        else
            closestX = xCenter;

        
        if(calDistance(radius, xCenter, yCenter, closestX, closestY)) return true;
        
        else return false;
        
    }
}