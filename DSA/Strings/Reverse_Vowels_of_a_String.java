
class Reverse_Vowels_of_a_String{
    public boolean isVowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
            return true;
        else if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
         return true;
        else return false;
    }
    public String reverseVowels(String s) {
        char arr[] = s.toCharArray();
        int low = 0, high = s.length()-1;
        while(low<high){
            if(isVowel(arr[low]) && isVowel(arr[high])){
                char temp = arr[high];
                arr[high--] = arr[low];
                arr[low++] = temp;
            }
            else if(isVowel(arr[low]))
                high--;
            else low++;
        }
        return new String(arr);
    }
}