	class Client
	{
	
			public static void main(String args[])
			{
			String view_host; 
			IPgenerator2 ip = new IPgenerator2();
			
			ip.ipmethd();
 			String remoteIPaddress="";
 		 	int remotePort=9000;
  
  
  
			
			  String remoteIPaddress =ip.ipmethd();
   			int remotePort=9000;
   	
			   try
	   			{
				Socket socket1 = new Socket( remoteIPaddress, remotePort );
		
		
				socket1.setSoTimeout(3000);
		
				BufferedReader inFromServer = new BufferedReader(new InputStreamReader( socket1.getInputStream()));
				System.out.println("Server contacted OK ");
		
		
				while(true)				
				{
				
				String line = inFromServer.readLine();
				System.out.println("From server " + line);
				}  
			  
		 	}
		
				catch(UnknownHostException e){
				System.err.println("Don't know about host ....");	
				}	   
		
			catch(ConnectException e){
			System.err.println("Unreachable node!, failure in connecting to server"); 
			}	
		
		catch (IOException e) {System.err.println("TCP client error " +  e); }
	
	
		 }
	}
