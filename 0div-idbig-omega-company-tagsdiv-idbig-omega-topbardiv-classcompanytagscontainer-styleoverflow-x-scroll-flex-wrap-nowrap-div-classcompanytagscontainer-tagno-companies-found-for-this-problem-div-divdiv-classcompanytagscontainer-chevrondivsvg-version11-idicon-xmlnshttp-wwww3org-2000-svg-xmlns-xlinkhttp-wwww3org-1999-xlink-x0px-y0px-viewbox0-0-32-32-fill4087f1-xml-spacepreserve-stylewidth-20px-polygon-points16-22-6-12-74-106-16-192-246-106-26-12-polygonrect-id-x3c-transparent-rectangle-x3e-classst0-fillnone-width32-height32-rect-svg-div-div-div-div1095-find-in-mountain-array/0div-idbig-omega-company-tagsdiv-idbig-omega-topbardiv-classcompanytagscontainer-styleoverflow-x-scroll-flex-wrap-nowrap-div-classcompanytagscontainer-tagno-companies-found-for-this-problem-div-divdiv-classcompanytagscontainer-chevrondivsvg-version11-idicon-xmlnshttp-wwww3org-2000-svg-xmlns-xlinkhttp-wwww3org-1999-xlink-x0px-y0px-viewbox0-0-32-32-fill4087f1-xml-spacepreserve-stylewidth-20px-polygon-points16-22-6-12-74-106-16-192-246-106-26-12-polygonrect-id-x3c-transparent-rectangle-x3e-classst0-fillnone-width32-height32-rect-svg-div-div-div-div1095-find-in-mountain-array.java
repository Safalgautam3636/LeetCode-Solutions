class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peakIndex = findPeakIndex(mountainArr);
        int targetIndex = binarySearchLeft(mountainArr, target, 0, peakIndex);
        if (targetIndex == -1) {
            targetIndex = binarySearchRight(mountainArr, target, peakIndex, mountainArr.length() - 1);
        }
        return targetIndex;
    }

    private int findPeakIndex(MountainArray mountainArr) {
        int left = 0;
        int right = mountainArr.length() - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    private int binarySearchLeft(MountainArray mountainArr, int target, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midValue = mountainArr.get(mid);
            if (midValue == target) {
                return mid;
            } else if (midValue < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    private int binarySearchRight(MountainArray mountainArr, int target, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midValue = mountainArr.get(mid);
            if (midValue == target) {
                return mid;
            } else if (midValue > target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
