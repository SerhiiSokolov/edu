package edu.hillel.hw1.array;

import java.util.Random;

public class HeapSort {
	public static void main(String[] args) throws Exception {
		int size=7;
		int[] array=fillArray(size);
		printArray(array);
		sort(array);
		printArray(array);
		
	}
	public static void sort(int a[]) throws Exception {
		int size = a.length;

		//������ �� ������� ����������� ������
		//������������ ������� �������� � �����.
		for (int mid = size / 2; mid > 0; mid--) 
		{
			printArray(a);
			downheap(a, mid, size);
			printArray(a);
			}

		//����������� �� ���������� 
		//� ������������� ����������� ������
		do {

			//������ �������� � ��������� ���������...
			int T = a[0];
			a[0] = a[size - 1];
			a[size - 1] = T;

			//... � �������������� ����������� ������
			//��� ����������������� ����� �������			
			size = size - 1;		
			downheap(a, 1, size);		

		} while (size > 1); //�� ���������� ��������

	}

	//������������� ����� � � � ������ ���������� ���������� ����
	public static void downheap(int a[], int mid, int N) throws Exception {		

		//� ����� ���������
		//���������� ��������
		int T = a[mid - 1];

		//������� �������� � �������� �����
		while (mid<= N / 2) {		

			int j = mid + mid;//����� �������

			//���� ���� ������ �������, 
			//�� ���������� ��� � �����
			//� �� ��� �������� ����������
			if ((j < N) && (a[j - 1] < a[j])) j++;	

			//���� �������� ������ (��� �����) ����������� �������...
			if (T >= a[j - 1]) {

				//... �� ������ �� � ������� � ���� �����		
				break;	

			} else { //���� �������� ������ ����������� �������...	

				//... �� ������� ���������� �� ����� ��������
				a[mid - 1] = a[j - 1];
				mid = j;

			}
		}

		//�������� � ����� �������� ������� � ���������� �� ��������
		//(��� ������� �� ���� �����, ���� ��� ������� ������ ���)
		a[mid - 1] = T;

	}

	public static void testArray(int[] ar){
		boolean test=true;
		for(int i=0;i<ar.length-1;i++){
			if(ar[i]>ar[i+1]) test=false;
		}
		System.out.println("test="+test);
	}

	public static void printArray(int[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+", ");
		}
		System.out.println();
	}

	public static void printArray(int[] array, int start, int stop)
	{
		for(int i=start;i<=stop;i++)
		{
			System.out.print(array[i]+", ");
		}
		System.out.println();
	}

	public static int[] fillArray(int size){
		int[] array=new int[size];
		Random rand=new Random();
		for (int i=0;i<size;i++){
			array[i]=rand.nextInt(10)+1;
		}
		return array;
	}


}
