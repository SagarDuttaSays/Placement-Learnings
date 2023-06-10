class Length_of_Last_Word {
    public int lengthOfLastWord(String s) {
       String str[] = s.trim().split("\\s+");
       return str[str.length-1].length(); 
    }
}