class Bonus {
    public static long[] bonus(int[] arr, long s) {
        long [] result = new long[arr.length];
        long sum=0;
        for(int a : arr){
            sum+=a;
        }
        double [] koef= new double[arr.length];
        double sumKoef=0;
        for (int i=0;i< arr.length;i++){
            koef[i]=(double)sum/arr[i];
            sumKoef+=koef[i];
        }
        for (int i=0;i< arr.length;i++){
            result[i]= Math.round((koef[i]/sumKoef)*s);
        }
        return result;
    }
}