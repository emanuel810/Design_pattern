package Proxy;

public class ProxyYoutube implements Youtube{

	
	private TercerYoutube youtube;
	
	
	public ProxyYoutube(TercerYoutube youtube) {
		this.youtube = youtube;
	}
	
	@Override
	public void listaVideos() {
		// TODO Esbozo de m�todo generado autom�ticamente
		youtube.listaVideos();
	}

	@Override
	public void conseguirVideo() {
		// TODO Esbozo de m�todo generado autom�ticamente
		youtube.conseguirVideo();
	}

	@Override
	public void descargarvideo() {
		// TODO Esbozo de m�todo generado autom�ticamente
		youtube.descargarvideo();
	}

}
