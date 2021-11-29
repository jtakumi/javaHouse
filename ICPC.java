class ICPC {
  public static void main(String args[]) {
   int n[] = {3,5,5,8};
  int s[] ={1000,342,0,2,2,9,11,932,300,1000,0,200,400,353,242,402,274,283,132,402,523};
  int a[] = new int[4];
  int max = 0;
  int c = 0;
  int min = 0;
  int d = 0;
  int nof = n.length;
  for(int i = 0;i < nof;i++) {
  c += n[i];
  d = c - n[i];
  max = 0;
  min = 1000;
   for(int j = d;j < c;j++) {
    if(s[j] > max) {
     max = s[j];
      }else if(s[j] < min) {
      min = s[j];
      }else{
     }
     a[i] += s[j];
    }
      a[i] = (a[i] - max - min) / (n[i] - 2);
    }
  for(int h = 0;h < nof;h++) {
    System.out.println(a[h]);
    }
    System.out.println("I—¹\n0");
  }
}