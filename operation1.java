import java.util.*;

public class operation1 {
 public static Vector<String> v=new Vector <String>(1,1);
 public static  Vector<String> red1=new Vector <String>(1,1);
 public static Vector<String> red2=new Vector <String>(1,1) ;
  public static Vector<String> fn=new Vector <String>(1,1) ;

 public static int arr[][];
public static int m,n;
public static Vector<String> reduct=new Vector <String>(1,1) ;
int b=1;
public int T=1;
public int z;
public Vector<String> far=new Vector<String>(1,1);
     void absorption(Vector<String> vec)
    {
    int cnt=0;
    System.out.println("Inside absorption");
     for(int i=0;i<(vec.size()-1);i++)
    {     
        for(int j=0;j<(vec.size());)
                 {
            if((vec.get(i)).length()<=(vec.get(j)).length()&&i!=j)
            {
                for(int k=0;k<vec.get(i).length();k++)
                { if((vec.get(j)).indexOf(vec.get(i).charAt(k))!=-1)
                {
                  cnt++;
                  
                    //k=vec.size();
                    //System.out.println("vec after removing is:"+vec.get(j)+"j is:"+j+"\t"+v.size
                }
            else
                {
                    break;
                }
            }
        if(cnt==vec.get(i).length())
            {
        	System.out.println("vec to remove is    "+vec.get(j)+"    at j"+ j);
                vec.remove(j);
                if(j<i){i--;}}
        else{j++;}
        
         cnt=0;
    }
            else{j++;}
      }
        }
    
    for(int i=0;i<vec.size();i++)
    {
       System.out.println("vector at "+i+"\t"+vec.get(i)+"\n");
        

    }
    System.out.println("\n\n");
    }
String max(int a[]){
    int max=a[0]; int k=0;
    for(int i=0;i<m;i++){
    if(max<a[i])
        {max= a[i];k =i;
        }
    }
    System.out.println("t is"+max+"k is"+k);
    return (Character.toString((char)(k+97)));
}

 public void expansion()
            {
        int count[]=new int[m];
        for(int i=0;i<v.size();i++)
        {
            for(int j=0;j<(v.get(i)).length();j++)
            {
              char c=((v.get(i)).charAt(j));
              int t=(int)(c-97);
          //    int t=Integer.parseInt(Character.toString(c-97));
              count[t]++;

            }
        }


        //String k="";
        //int r1=0, r2=0;
       String t=max(count);
       System.out.println("t is "+ t);
        for(int i=0;i<v.size();i++)
        {
            System.out.println("i is \t"+i+"\t"+v.size());
            if(v.get(i).indexOf(t)==-1)
            {
                red1.addElement(v.get(i));
                red2.addElement(v.get(i));
                    System.out.println("v.get(i) if t="+t+" not found\t"+v.get(i));

            }
 else
            { String l="";
   // System.out.println("red2 before removing d"+v.get(i));
    for(int j=0;j<v.get(i).length();j++)
    {
       System.out.println("if t= "+t+" found\t"+v.get(i));
        String k= Character.toString(v.get(i).charAt(j));
        if(!(k.equalsIgnoreCase(t))){l= l.concat(k);System.out.println("k is:  "+k+"\tl is :"+l);}
      } 
        v.set(i, l);
        //System.out.println("red2 after removing d"+v.get(i));
          red2.addElement(v.get(i));
                
      }
        }
       red1.addElement(t);

     
 }
  void  perm(int count,Vector<String> vec)
    {  
     System.out.println("b in perm =  "+b );
     int c=0;int x=0;
     while(c<T)
        {
    	 
    	 for(int i=0;i<b;i++)
    	 { String s= new String(far.get(c));
    		s=s.concat(Character.toString(vec.get(count).charAt(x)));
    		far.setElementAt(s, c);
    		  c++;
    		 
    	 }
       
        if( x<((vec.get(count).length())-1))
        {
           x++;
        }
 else
        {
            x=0;
 }
    }
    
    }
    void compute (Vector<String> vec)
    {    T=1;
        int z=vec.size();
       
        int max=vec.get(0).length(),in=0;
        for(int i=0;i<z;i++)
        {
        	
            T*=(vec.get(i)).length();
            System.out.println("T is\t"+T);
            if(max<vec.get(i).length()){
            	in=i;max=vec.get(i).length();
            	 System.out.println("Max is &@!# "+max);
            }
        
            
        }
        T=T/max;
        String s= vec.get(in);
        vec.remove(in);
        vec.insertElementAt(s,0);
      // b=T/(vec.get(1).length());
        System.out.println("T is :"+T+"z is :"+z);
     	   
        	for (int i=0;i<(vec.get(0).length()) ;i++)
                {
            	for(int j=0;j<T;j++)
                {  if(i==0)
            		far.addElement(Character.toString(vec.get(0).charAt(i)));
              else
            	far.setElementAt((Character.toString(vec.get(0).charAt(i))),j);
                  }
                int count=1;
                b=T;
                while(count<z)
                {
                //System.out.println("b is "+b);	
                    b=b/(vec.get(count).length());		
                 perm(count,vec);
             count++; 
          //System.out.println("far is ::" +far.get(i));
          }
                   
                  final_red();
        }
  
         


    }
  String int_red(String s)
  {
      char r=' ';
      for(int i=0;i<s.length();i++)
      {
          for(int j=i+1;j<s.length();)
          {
              if(s.charAt(i)==s.charAt(j))
                  s.replace(s.charAt(j), r);
              else
                  j++;
          }
      }
      return s.trim();
  }
void final_red(){
    
     for(int k=0;k<far.size();k++)
        {
            fn.addElement(int_red(far.get(k)));
        System.out.println("fn.get()\t"+fn.get(k));
           }
        absorption(fn);
       
}
}


