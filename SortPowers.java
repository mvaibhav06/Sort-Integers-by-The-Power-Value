class SortPowers {
    public static int power(int a){
        int out = 0;

        while(a != 1){
            if(a%2 == 0){
                a /= 2;
            }else{
                a = (a*3)+1;
            }
            out++;
        }
        return out;
    }
    public int getKth(int lo, int hi, int k) {
        int len = hi-lo+1;
        List<Integer> out = new ArrayList<>();
        for(int i=0; i<len; i++){
            out.add(lo++);
        }
        Collections.sort(out, (a,b) -> Integer.compare(power(a),power(b)));

        return out.get(k-1);
    }
}
