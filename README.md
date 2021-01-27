# RESTWEBAPI_HackerRankTest

repl.it link -  https://repl.it/@MOHAMEDSulai/RestWebApi#.project 

question : 
   link : https://www.hackerrank.com/test/md1hiktjtk
   
REST API: Total Goals by a Team

In this challenge, the REST API cOntains information about football matches. The provided API allows querying matches by teams and year. Your task is to get the total number of goals scored by a given team in a given year.

To access a collection of matches, perform GET request to 
    https://jsonmock.hackerrank.com/api/football_matches?year=<year>&team1=<team>&page=<page>
    https://jsonmock.hackerrank.com/api/football_matches?year=<year>&team2=<team>&page=<page>
    
    where <year> is the year of the competition <team> is the name of the team, and <page> is the page of the  result to request.The result might be divided into several pages.     Pages are numbered from 1.
    
    Notice that the above URLs are different.The first URL specifices the team1 parameter (denoting the Home team).while the second URL  specifices the team2 paramater  (denoting the visting team). Thus in order to get alll matches that a particular team playes in, you need to retrieve matches where the team was the home team and visiting team.
    For example, a GET request to 
      https://jsonmock.hackerrank.com/api/football_matches?year=2011&team1=Barcelona&page=1
      retrun data associated with matches in the year 2011,where team1 ( the home team  )was Barcelon, on the first page of the results.
      
     similarly, a GET request to 
       https://jsonmock.hackerrank.com/api/football_matches?year=2011&team2=Barcelona&page=1
       returns data associated with matches in the year 2011 where team2 (the visting team ) was Barcelone,on the first pages of the results.
       
       The response to such a request is a JSON wirth the following 5 fields:
           * page        : The current page of the results.
           * per_page    : The maximum number of matches returnes per_page.
           * total       : The total number of matches on all pages of the results.
           * total_pages : The total number of the pages with results.
           * data        : An array of object containing matches information on the requestes page.
         
       Each match record has several fields, but in this task only the following 4 are relevant:
          * team1      :a string denoting the name of the first team in the match
          * team2      :a string denoting the name of the second team in the match
          * team1goals :a string denoting the number of the goals scored by team1 in the match
          * team2goals :a string denoting the number of the goals scored by team2 in the match
          
         Function Description 
         Complete the function getTotalGoals in the editor below.
           
           getTotalGoals has the following parameters : 
               string team: the name of the team
               int year   : the year of the competetion
               
            The function must return an integer denoting the total number of goals scored by the given team in all matches in the given year that the team playes i.
            
             Sample Case : 
                sample input for Custom Testing 
                     Barcelone 
                     2011
                     
                sample output
                   35 
                   
              Explanation 
                   The team is Barcelona and the year 2011.When we fetch all the matches that Barcelona played in the year 2011, we find that that they scored a total of 35                 goals.Which is the required answer.
          
           
           



    
