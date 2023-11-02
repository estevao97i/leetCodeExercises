public class ContainerWMostWater {

    public static int maxArea(int[] height) {
        int first = 0;
        int last = height.length - 1;
        int maxVolume = 0;

        while (first < last) {
            int currentArea = Math.min(height[first], height[last]);
            int volume = currentArea * (last - first);
            maxVolume = Math.max(maxVolume, volume);

            if (height[first] > height[last]) {
                last--;
            } else {
                first ++;
            }
        }
        return maxVolume;
    }

    public static void main(String[] args) {
        int[] height = {1,8,100,2,100,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
