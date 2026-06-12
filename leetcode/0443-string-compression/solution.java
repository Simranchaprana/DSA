class Solution {
    public int compress(char[] chars) {
        StringBuilder sb=new StringBuilder();
        int i=1;
        int count =1;
        sb.append(chars[0]);
        while(i<chars.length){
            if(chars[i]==chars[i-1]){
                count++;
            }
            else{
                if(count>1){
                    sb.append(count);
                }
                sb.append(chars[i]);
                count=1;            
            }
            i++;
        }
        if(count>1)
        sb.append(count);

        for(i=0;i<sb.length();i++){
            chars[i]=sb.charAt(i);
        }

        return sb.length();

    }
}
