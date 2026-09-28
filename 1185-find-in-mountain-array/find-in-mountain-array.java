/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = peak(mountainArr);
        int first = checkIncreasing(mountainArr, target, 0, peak);
        if(first != -1) {
            return first;
        }
        return checkDecreasing(mountainArr, target, peak+1, mountainArr.length() - 1);  
    }
    // Find the element in decreasing order if it's not find in increasing
    public int checkDecreasing(MountainArray mountainArr, int target, int start, int end) {
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target > mountainArr.get(mid)) {
                end = mid - 1;
            }else if(target < mountainArr.get(mid)) {
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
    // Find the element in increasing slope
    public int checkIncreasing(MountainArray mountainArr, int target, int start, int end) {
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target > mountainArr.get(mid)) {
                start = mid + 1;
            }else if(target < mountainArr.get(mid)) {
                end = mid - 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
    // First we have to find peak element
    public int peak(MountainArray mountainArr) {
        int start = 0;
        int end = mountainArr.length() -1;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(mountainArr.get(mid) > mountainArr.get(mid+1)) {
                end = mid;
            }else {
                start = mid+1;
            }
        }
        return start;
    }

}