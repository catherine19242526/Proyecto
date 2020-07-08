import javax.sound.midi.*;
import java.util.*;
import java.io.*;

class MiReproductor{
	
	private Synthesizer synthe = null;
	private int intensity = 100;
	private MidiChannel [] channels;
	private MidiChannel channel;


	public MiReproductor(){
		try{
			synthe = MidiSystem.getSynthesizer();

		}catch(Exception e){
			System.out.println("Error: al obtener synthe.");
		}
	}

	public void inicializar(){
		try{
			synthe.open();
			channels = synthe.getChannels();

		}catch(Exception e){
			System.out.println("Error: al inizializar el synthe.");
		}
	}


	public void reproducirNota(int nota, int canal, int duracion){
		
		channel = channels[canal];
		channel.noteOn(nota, intensity);

		try{
				Thread.sleep(duracion);
			}catch(Exception e){
				System.out.println("ERROR: en sleep.");
			}

		channel.noteOff(nota);
	}

	
	public void finalizar(){
		try{
			synthe.close();

		}catch(Exception e){
			System.out.println("Error: al finalizar el synthe.");
		}
	}

	public static ArrayList<String> leerTodo(String nombreArchivo)
	{
		ArrayList<String> contenido = new ArrayList<String>();
		String cadena = new String();

		
		try(FileInputStream fis = new FileInputStream(nombreArchivo);
			DataInputStream din = new DataInputStream(fis);
			BufferedReader br = new BufferedReader(new InputStreamReader(din));)
		{
			cadena = br.readLine();
			while(cadena != null)
			{
				contenido.add(cadena);
				cadena = br.readLine();
			}	
		}
		catch(Exception e)
		{
			e.printStackTrace();

		}

		return contenido;
		
	}
}