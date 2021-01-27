import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.net.* ;
import  org.json.* ;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {
  public String returnjsonObject( String query){
     StringBuffer response = new StringBuffer() ;
    try{
     
     URL ur = new URL(query) ;
     HttpURLConnection   con = (HttpURLConnection) ur.openConnection() ;
     BufferedReader in = new BufferedReader( new InputStreamReader(con.getInputStream()));
     String res ; 
     while((res = in.readLine()) != null){
        response.append(res) ;
      } 
    }catch(Exception err){
       System.out.println(err) ;
    }
      return response.toString() ;
  }


  public  int getTotalGoals(String team , int year){
    int total =0 ;
    try {
      for(int k = 1 ; k <= 2 ; k++ ){
        String t = "team" + k  ;
        String query ;
        query = "https://jsonmock.hackerrank.com/api/football_matches?year="+year+"&" + t + "="+team+"&page="+ 1 ; 
        JSONObject json = new JSONObject(returnjsonObject(query)) ;
        int cnt = json.getInt("total_pages") ;
        for(int i = 1 ; i <= cnt ; ){
        JSONArray jsonarray = new JSONArray(json.getJSONArray("data").toString()) ;
        for(int j =0 ; j < jsonarray.length() ; j++){
          total   += Integer.parseInt(jsonarray.getJSONObject(j).getString("team" +k+ "goals"));
        }
         query = "https://jsonmock.hackerrank.com/api/football_matches?year="+year+"&" + t + "="+team+"&page="+ (++i) ;
        json = new JSONObject(returnjsonObject(query)) ;
   }
      }
   }catch(Exception err){
     System.out.println(err.getMessage());
   }


   return total ;
  }
}


class Main {
  public static void main(String[] args) {
    Result rs = new Result() ;
    int a = rs.getTotalGoals("Barcelona" , 2011) ;
    System.out.println(a) ;
    
  }
}
