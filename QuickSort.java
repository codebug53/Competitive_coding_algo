//QuickSort algorithm
public class QuickSort{
  public static int partition(int a[], int lb, int ub){
    int pivot = a[lb];
    int st = lb, ed=ub;
    while(st<ed){
      while(st <= ed && pivot >= a[st]) st++;
      while(a[ed] > pivot) ed--;
      if(st<ed){
        int temp = a[st];
        a[st] = a[ed];
        a[ed] = temp;
      }
    }
    int temp = a[lb];
    a[lb] = a[ed];
    a[ed] = temp;
    return ed;
  }
  public static void quickSort(int a[], int lb, int ub){
    if(lb< ub){
      int idx = partition(a, lb, ub);
      quickSort(a,lb, idx-1);
      quickSort(a, idx+1, ub);
    }
  }
  public static void main(String args[]){
    int n =  5;
    int a[] = {5,4,2,3,1};
    quickSort(a, 0, n-1);
    for(int b: a){
        System.out.print(b+" ");
    }
  }
}
