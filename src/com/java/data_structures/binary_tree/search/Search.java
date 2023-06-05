package com.java.data_structures.binary_tree.search;

public class Search {
	public static void main(String[] args) {
		int[] a = { 419, 631, 492, 73, 114, 534, 44, 495, 910, 357, 198, 578, 991, 532, 909, 903, 783, 822, 752, 265,
				945, 263, 571, 486, 596, 805, 8, 309, 400, 144, 427, 993, 695, 657, 113, 943, 830, 214, 293, 654, 102,
				601, 697, 882, 932, 233, 42, 260, 909, 139, 346, 437, 440, 252, 842, 767, 126, 260, 496, 607, 287, 701,
				187, 121, 123, 462, 302, 121, 325, 4, 189, 48, 970, 756, 416, 519, 695, 841, 332, 656, 955, 390, 909,
				361, 939, 879, 228, 960, 181, 593, 330, 634, 48, 570, 266, 484, 633, 947, 990, 345, 285, 332, 672, 127,
				540, 206, 798, 881, 152, 356, 189, 551, 219, 886, 365, 775, 475, 844, 682, 305, 688, 821, 58, 893, 796,
				307, 169, 617, 767, 82, 687, 95, 114, 344, 686, 973, 589, 21, 972, 504, 527, 960, 425, 996, 43, 384,
				131, 660, 139, 387, 936, 341, 936, 109, 610, 277, 849, 225, 851, 224, 399, 89, 314, 276, 279, 771, 328,
				423, 444, 123 };
		int[] asc = { 3, 4, 7, 9, 9, 10, 15, 17, 19, 21, 28, 29, 33, 37, 39, 40, 49, 55, 66, 67, 70, 75, 88, 99, 103,
				120, 123, 124, 129, 131, 135, 139, 160, 166, 170, 178, 182, 183, 187, 193, 197, 198, 198, 206, 225, 230,
				233, 234, 250, 265, 269, 270, 272, 279, 282, 283, 290, 301, 302, 305, 310, 312, 318, 329, 329, 330, 331,
				341, 343, 347, 350, 354, 356, 365, 369, 375, 381, 382, 391, 400, 403, 415, 418, 421, 423, 427, 441, 447,
				460, 470, 472, 491, 499, 506, 530, 536, 537, 537, 550, 568, 581, 582, 583, 587, 590, 593, 597, 602, 618,
				622, 624, 637, 638, 652, 662, 685, 693, 696, 699, 701, 705, 713, 719, 721, 725, 742, 743, 745, 746, 751,
				757, 762, 781, 788, 794, 794, 798, 810, 812, 832, 837, 845, 850, 852, 863, 870, 881, 882, 883, 890, 893,
				895, 908, 910, 919, 927, 934, 950, 957, 960, 965, 966, 968, 970, 977, 986, 987, 989, 991, 995 };

		int[] desc = new int[asc.length];
		for (int i = 0; i < asc.length / 2; i++) {
			desc[i] = asc[a.length - 1 - i];
			desc[a.length - 1 - i] = asc[i];
		}
		for (int i = 0; i < desc.length; i++) {
			System.out.print(desc[i] + ", ");
			if (i % 10 == 9)
				System.out.println("");
		}
	}

	public static int binarySearch(int[] array, int searchedElement) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == searchedElement) {
				return i;
			}
		}
		return -1; // Not found? Return -1
	}
	
	public static int binarySearchWithOrdenation(int[] a, int searchedElement) {
		int[] array = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			array[i] = a[i];
		}
		quickSort(array);
		int start = 0;
		int end = array.length - 1;
		
		while (start <= end) {
			int middle = (start + end) / 2;
			
			if (array[middle] == searchedElement) {
				return middle;
			}
			
			if (searchedElement > array[middle]) {
				start = middle + 1;
			} else {
				end = middle - 1;
			}
		}
		return -1;
	}
	
	public static int binarySearchWithoutOrdenation(int[] array, int searchedElement) {
		int start = 0;
		int end = array.length - 1;
		
		while (start <= end) {
			int middle = (start + end) / 2;
			
			if (array[middle] == searchedElement) {
				return middle;
			}
			
			if (searchedElement > array[middle]) {
				start = middle + 1;
			} else {
				end = middle - 1;
			}
		}
		return -1;
	}

	public static void quickSort(int[] arr) {
		quickSort(arr, 0, arr.length - 1);
	}

	public static void quickSort(int[] arr, int left, int right) {
		int pivotIndex = left + (right - left) / 2;
		int pivotValue = arr[pivotIndex];
		
		int i = left, j = right;
		
		while (i <= j) {
			while (arr[i] < pivotValue) {
				i++;
			}
			while (arr[j] > pivotValue) {
				j--;
			}
			if (i <= j) {
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				i++;
				j--;
			}
			if (left < i) {
				quickSort(arr, left, j);
			}
			if (right > i) {
				quickSort(arr, i, right);
			}
		}
	}
}
