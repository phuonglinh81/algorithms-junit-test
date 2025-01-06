/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testclass;

/**
 *
 * @author phanp
 */
public class BinarySearch {
    public static int search(int[] array, int target) {
            int left = 0;
            int right = array.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                // Kiểm tra nếu phần tử ở giữa là mục tiêu
                if (array[mid] == target) {
                    return mid;
                }

                // Nếu giá trị mục tiêu nhỏ hơn phần tử giữa, tìm trong nửa trái
                if (array[mid] > target) {
                    right = mid - 1;
                } else {
                    // Nếu giá trị mục tiêu lớn hơn phần tử giữa, tìm trong nửa phải
                    left = mid + 1;
                }
            }

            // Nếu không tìm thấy phần tử, trả về -1
            return -1;
        }
}
