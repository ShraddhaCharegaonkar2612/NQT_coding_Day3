/* Problem Statement – Given a string S(input consisting) of ‘’ and ‘#’. The length of the string is variable. The task is to find the minimum number of ‘’ or ‘#’ to make it a valid string. The string is considered valid if the number of ‘’ and ‘#’ are equal. The ‘’ and ‘#’ can be at any position in the string.
Note : The output will be a positive or negative integer based on number of ‘*’ and ‘#’ in the input string.

(*>#): positive integer
(#>*): negative integer
(#=*): 0 */

class HelloWorld {
    public static void main(String[] args) {
        char[] a={'*','#','*','*','*','*','#','*','#','#','#','*'};
        int c=0,d=0;
        for(char b:a)
        {
            if(b=='*')
            {
                c++;
            }
            if(b=='#')
            {
                d++;
            }
        }
        if(c>d)
        {
            System.out.println((c-d)+" # required to make equal");
        }
       else if(c<d)
        {
            System.out.println((d-c)+" # required to make equal");
        }
        else if(c==d)
        {
            System.out.println(0+" # and * are equal in number");
        }
        else
        {
            System.out.println("error");
        }
    }
}