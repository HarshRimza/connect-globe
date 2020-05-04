# connect-globe
PROJECT CONNECT GLOBE 
Objective : To create a project that connects people around the world and shares experiences and informations and they are able to discuss on any topic, but only registered users. Also they can send report and also give advice on any topic.
Users of the System :
1.	Admin
2.	User Common
Functional Requirements :
1.	Admin : Admin need to first log in, and then he/she can create another user record, post the topic to be discussed and report and also send advice respectively. He / She can view all reports and topics to be discussed with there citie. He / She can view the previously posted comments and post a comment on each report or topic
2.	Common User : Common User also need to first log in, then he/she find report according to area and also give advice on any report and can also discuss on any topic.
Tools to be used : 
1.	Server: Apache Tomcat Server.
2.	Front End : JavaScript, Html, CSS.
3.	Server Side : Java Servlet.
How project works ?
1.	Welcome Page :  login or register option.
 
2.	For Admin/Normal User To login through welcome page you must be registered, if you are registered then please login, otherwise register yourself as follows.
 
 
3.	You can view posted reports or status according to area.
 
4.	You can post reports.
 
5.	You can give advice.
 

6.	You can discuss on any topic.
 

Class Diagram : 
Admin Part	
LoginServlet          	()
Register Servlet    	()
ViewServlet             	()

PostServlet            	()
DiscussServlet      	()
AdviceServlet      	()
LogoutServlet      	()
Normal User Part	
RegisterServlet 	()
LoginServlet    	()
ViewServlet             	()
PostServlet            	()
DiscussServlet      	()
AdviceServlet      	()
LogoutServlet      	()

Activity Diagram :
Initial State
 
Final State
Sequential Diagram :
 

 



