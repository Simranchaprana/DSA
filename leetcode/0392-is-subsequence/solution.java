class Solution {
    public boolean isSubsequence(String s, String t) {
        boolean f=false;
        int j=0,i=0;
        while(i<s.length() && j<t.length()){
        if(s.charAt(i)==t.charAt(j)){
                j++;
                i++;
            }
        
        else{
            j++;
        }
        }
        return (i==s.length());
       }
    }

