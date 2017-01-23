package no.hib.dat102.adt;

import no.hib.dat102.EmptyCollectionException;

public interface StabelADT<T> {
 
/*
* Definerer interface til en datastruktur stabel.
//****************************************************************
*/
  /**
   * Legger til et element p� toppen av stabelen, utvider hvis behov
 * @param element generisk element som stables p�
 */
public void push (T element);
  

/**
 * Fjerner et element p� toppen av stabelen og returnerer referansen
 * Kaster unntak EmptyCollectionException hvis stabelen allerde er tom.
 * @return T element fjernes fra toppen av stabelen
 * @throws EmptyCollectionException n�r stabelen er tom
 */
public T pop() throws EmptyCollectionException;

 
/**
 * Returenerer referansen til elementet p� toppen av stabelen.
 * Elementet blir ikke fjernet.
 * Kaster unntaket EmptyCollectionException hvis stabelen allerde er tom.
 * @return T element p� toppen av stabelen.
 * @throws EmptyCollectionException n�r stabelen er tom
 */
public T peek() throws EmptyCollectionException;


   
  /** 
   *  Bestemmer om stabelen er full.
 * @return sann hvis tom stabel
 */
public boolean erTom();


  /**
   * Returnerer antall elementer p� stabelen.
 * @return antall elementer p� stabelen
 */
public int antall();
  
}

