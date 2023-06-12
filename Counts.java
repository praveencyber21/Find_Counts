package Wordcount;

class Counts {
    
    //Linux#.
    static String count(String word){
        int upper_count = 0, lower_count = 0, special_count = 0, vowels_count = 0, consonant_count = 0, number_count = 0;

        int length = word.length() -1;
        for(int i=0; i<=length; i++){

           if( word.charAt(i) >= 65 && word.charAt(i) <=90){
                upper_count++;
                if(word.charAt(i) == 'A' || word.charAt(i) == 'E' || word.charAt(i) == 'I' || word.charAt(i) == 'O' || word.charAt(i) == 'U'){
                    vowels_count++;
                    
            }else{
                consonant_count++;
            }
               
                
           }
           else if( word.charAt(i) >= 97 && word.charAt(i) <=122){
                lower_count++;
                if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u'){
                    vowels_count++;
                    }
            else{
                consonant_count++;
            }
               
              
           }
           else if(word.charAt(i) >=48 && word.charAt(i) <=57){
                number_count++;
           }
            else
            {
                special_count++;
                
           }
        
        }
         return "Upper: "+ upper_count + "\nLower: "+ lower_count + "\nVowels: "+ vowels_count + "\nConsonants: "+ consonant_count + "\nNumber: "+ number_count + "\nSpecial: "+ special_count; 
    }
}


       

