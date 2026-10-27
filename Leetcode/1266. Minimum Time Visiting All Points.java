// 1266. Minimum Time Visiting All Points

class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int result = 0;
        for(int i =0;i<(points.length - 1);i++){
            int x1 = points[i][0];
            int y1 = points[i][1];

            int x2 = points[i+1][0];
            int y2 = points[i+1][1];

            result += Math.max(Math.abs(x2-x1),Math.abs(y2-y1));
        }
        return result;
    }
}

//python
// class Solution(object):
//     def minTimeToVisitAllPoints(self, points):
//         """
//         :type points: List[List[int]]
//         :rtype: int
//         """
//         x1,y1 = points.pop()
//         result = 0
//         while points:
//             x2,y2 = points.pop()
//             result = result + max(abs(x2-x1),abs(y2-y1))
//             x1,y1 = x2,y2
        

//         return result
        