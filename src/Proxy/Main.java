package Proxy;

public class Main {
	
	public static void main(String[] args) {
		
		TercerYoutube tercerYoutube = new TercerYoutube();
		
		
		ProxyYoutube proxy = new ProxyYoutube(tercerYoutube);
		
		
		
		
	}

}
