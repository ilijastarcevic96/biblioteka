package biblioteka;

import java.util.LinkedList;

import biblioteka.intefejs.BibliotekaInterfejs;

public class Biblioteka implements BibliotekaInterfejs {
	
	private LinkedList<Knjiga> knjige = new LinkedList<Knjiga>();

	@Override
	public void dodajKnjigu(Knjiga knjiga) {
		
		if(knjiga == null){
			throw new RuntimeException();
		}
		
		knjige.add(knjiga);

	}

	@Override
	public void obrisiKnjigu(Knjiga knjiga) {
		
		if(knjiga == null){
			throw new RuntimeException();
		}
		
		knjige.remove(knjiga);

	}

	@Override
	public LinkedList<Knjiga> vratiSveKnjige() {
		
		return knjige;
	}

	@Override
	public LinkedList<Knjiga> pronadjiKnjigu(Autor autor, long isbn, String naslov, String izdavac) {
		
		if(autor == null || isbn == 0 || naslov == null || izdavac == null){
			throw new RuntimeException("Morate uneti neki kriterijum");
		}
		
		LinkedList<Knjiga> rezultati = new LinkedList<Knjiga>();
		
		for (int i = 0; i < knjige.size(); i++) {
			if(knjige.get(i).getNaslov().contains(naslov)){
				rezultati.add(knjige.get(i));
			}
		}
		
		return rezultati;
	}

}
