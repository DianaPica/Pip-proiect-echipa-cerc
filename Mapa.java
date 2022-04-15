import java.awt.BorderLayout;

import javax.swing.JFrame;

import com.teamdev.jxmaps.javafx.MapView;
import com.teamdev.jxmaps.*;


public class Mapa  extends MapView{
	
	public Mapa(String nName)
	{
		JFrame frame= new JFrame(nName);
		
		setOnMapReadyHandler(new MapReadyHandler(){
			@Override
			public void onMapReady(MapStatus status){
				if(status==MapStatus.MAP_STATUS_OK)
				{
					Map map = getMap();
					
					MapOptions mapOptions = new MapOptions();
					MapTypeControlOptions controlOptions=new MapTypeControlOptions();
					mapOptions.setMapTypeControlOptions(controlOptions);
					
					map.setOptions(mapOptions);
					map.setCenter(new LatLng(41.8316578, -87.6374727));
					map.setZoom(11.0);
				}
				
			}
		});
		//frame.set(this,BorderLayout.CENTER);
		frame.setSize(700,500);
		frame.setVisible(true);
		
		
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mapa temp=new Mapa("Test window");

	}


}
