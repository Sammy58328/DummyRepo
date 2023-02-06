
public class ContinueExample { 
	
public static void main(String[] args) {  
    //for loop  
    for(int i=1;i<=6;i++){  
        if(i==2){  
            //not printing i==2; but printing others 
            continue;//it will skip the rest statement  
        }  
        System.out.println(i);  
    }  
}  
} 