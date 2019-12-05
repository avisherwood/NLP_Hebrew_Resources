package b;

import hebrewVerb.HebrewVerb;

import java.util.ArrayList;

import letters.HebrewLetter;

public class B33 extends B27{
	
	public HebrewLetter[] vocalize(HebrewLetter[] letterArr){
		letterArr[0].setVocalization_DAGESH_BEGEDKEFET();
		letterArr[1].setVocalization_HOLAM_M();
		letterArr[2].setVocalization_KAMATS();
		if (letterArr[3].isKafSofit()){
			letterArr[3].setVocalization_SHVA();
		}
		return letterArr;
	}

	/*
	 * Past - same as B27
	 */

	/*
	 * Present - same as B27
	 */

	/*
	 * Future 
	 */
	public ArrayList<HebrewVerb> makeFutureInflictions(HebrewVerb w){
		ArrayList<HebrewVerb> futureInflictions = new ArrayList<HebrewVerb>();
		futureInflictions.add(this.future1SComp(w));
		futureInflictions.add(this.future1SMiss(w));
		futureInflictions.add(this.future2MSComp(w));
		futureInflictions.add(this.future2MSMiss(w));
		futureInflictions.add(this.future2FSComp(w));
		futureInflictions.add(this.future2FSMiss(w));
		futureInflictions.add(this.future3MSComp(w));
		futureInflictions.add(this.future3FSComp(w));
		futureInflictions.add(this.future3FSMiss(w));
		futureInflictions.add(this.future1PComp(w));
		futureInflictions.add(this.future1PMiss(w));
		futureInflictions.add(this.future2MPComp(w));
		futureInflictions.add(this.future2MPMiss(w));
		futureInflictions.add(this.future2FPComp(w));
		futureInflictions.add(this.future2FPCompB(w));
		futureInflictions.add(this.future2FPMiss(w));
		futureInflictions.add(this.future2FPMissB(w));
		futureInflictions.add(this.future3MPComp(w));
		futureInflictions.add(this.future3FPComp(w));
		futureInflictions.add(this.future3FPCompB(w));
		futureInflictions.add(this.future3FPMiss(w));
		return futureInflictions;
	}
	
	public HebrewVerb future1SComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_AlefHirik_Yod(wNew, 1);
		wNew.setVocalization_DAGESH();
		wNew.setVocalization_KAMATS();
		wNew.movePointer(1);
		wNew.removeLetter();
		this.replaceLetterTo_Yod(wNew, 1);
		wNew.setVocalization_SEGOL();
		wNew.movePointer(1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb future1SMiss(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_AlefHirik(wNew, 1);
		this.replaceLetterTo_Yod(wNew, 0);
		wNew.setVocalization_DAGESH();
		wNew.setVocalization_KAMATS();
		wNew.movePointer(1);
		wNew.removeLetter();
		wNew.setVocalization_SEGOL();
		wNew.movePointer(1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb future2MSComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_TavDageshHirik_Yod(wNew, 1);
		wNew.setVocalization_DAGESH();
		wNew.setVocalization_KAMATS();
		wNew.movePointer(1);
		wNew.removeLetter();
		this.replaceLetterTo_Yod(wNew, 1);
		wNew.setVocalization_SEGOL();
		wNew.movePointer(1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb future2MSMiss(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_TavDageshHirik(wNew, 1);
		this.replaceLetterTo_Yod(wNew, 0);
		wNew.setVocalization_DAGESH();
		wNew.setVocalization_KAMATS();
		wNew.movePointer(1);
		wNew.removeLetter();
		wNew.setVocalization_SEGOL();
		wNew.movePointer(1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb future2FSComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_TavDageshHirik_Yod(wNew, 1);
		wNew.setVocalization_DAGESH();
		wNew.setVocalization_KAMATS();
		wNew.movePointer(1);
		wNew.removeLetter();
		this.replaceLetterTo_Yod(wNew, 1);
		this.macro_Hirik_Yod(wNew, 1);
		this.removeNextLetter(wNew);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb future2FSMiss(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_TavDageshHirik(wNew, 1);
		this.replaceLetterTo_Yod(wNew, 0);
		wNew.setVocalization_DAGESH();
		wNew.setVocalization_KAMATS();
		wNew.movePointer(1);
		wNew.removeLetter();
		this.macro_Hirik_Yod(wNew, 1);
		this.removeNextLetter(wNew);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb future3MSComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_YodHirik_Yod(wNew, 1);
		wNew.setVocalization_KAMATS();
		wNew.setVocalization_DAGESH();
		wNew.movePointer(1);
		wNew.removeLetter();
		wNew.removeLetter();
		wNew.setVocalization_SEGOL();
		wNew.movePointer(1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb future3FSComp(HebrewVerb w){
		HebrewVerb wNew = this.future2MSComp(w);
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb future3FSMiss(HebrewVerb w){
		HebrewVerb wNew = this.future2MSMiss(w);
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb future1PComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_NunHirik_Yod(wNew, 1);
		wNew.setVocalization_KAMATS();
		wNew.setVocalization_DAGESH();
		wNew.movePointer(1);
		this.replaceLetterTo_Yod(wNew, 1);
		wNew.removeLetter();
		wNew.setVocalization_SEGOL();
		wNew.movePointer(1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb future1PMiss(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_NunHirik(wNew, 1);
		this.replaceLetterTo_Yod(wNew, 0);
		wNew.setVocalization_KAMATS();
		wNew.setVocalization_DAGESH();
		wNew.movePointer(1);
		wNew.removeLetter();
		wNew.setVocalization_SEGOL();
		wNew.movePointer(1);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.MF, HebrewVerb.Person.FIRST, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb future2MPComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_TavDageshHirik_Yod(wNew, 1);
		wNew.setVocalization_DAGESH();
		wNew.setVocalization_KAMATS();
		wNew.movePointer(1);
		wNew.removeLetter();
		this.replaceLetterTo_Yod(wNew, 1);
		wNew.removeVocalization();
		wNew.movePointer(1);
		this.replaceLetterTo_VavSuruk(wNew, 0);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb future2MPMiss(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_TavDageshHirik(wNew, 1);
		wNew.removeLetter();
		this.replaceLetterTo_Yod(wNew, 0);
		wNew.setVocalization_DAGESH();
		wNew.setVocalization_KAMATS();
		wNew.movePointer(1);
		wNew.removeVocalization();
		wNew.movePointer(1);
		this.replaceLetterTo_VavSuruk(wNew, 0);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb future2FPComp(HebrewVerb w){
		HebrewVerb wNew = this.future2MPComp(w);
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb future2FPCompB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_TavDageshHirik_Yod(wNew, 1);
		wNew.setVocalization_DAGESH();
		wNew.setVocalization_KAMATS();
		wNew.movePointer(1);
		wNew.removeLetter();
		this.replaceLetterTo_Yod(wNew, 1);
		this.macro_Segol_Yod_NunKamats_Hey(wNew, 3);
		this.removeNextLetter(wNew);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb future2FPMiss(HebrewVerb w){
		HebrewVerb wNew = this.future2MPMiss(w);
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb future2FPMissB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_TavDageshHirik(wNew, 1);
		wNew.removeLetter();
		this.replaceLetterTo_Yod(wNew, 0);
		wNew.setVocalization_KAMATS();
		wNew.setVocalization_DAGESH();
		wNew.movePointer(1);
		this.macro_Segol_Yod_NunKamats_Hey(wNew, 3);
		this.removeNextLetter(wNew);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb future3MPComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_YodHirik_Yod(wNew, 1);
		wNew.setVocalization_KAMATS();
		wNew.setVocalization_DAGESH();
		wNew.movePointer(1);
		wNew.removeLetter();
		wNew.removeLetter();
		wNew.removeVocalization();
		wNew.movePointer(1);
		this.replaceLetterTo_VavSuruk(wNew, 0);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.M, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb future3FPComp(HebrewVerb w){
		HebrewVerb wNew = this.future3MPComp(w);
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb future3FPCompB(HebrewVerb w){
		HebrewVerb wNew = this.future2FPCompB(w);
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb future3FPMiss(HebrewVerb w){
		HebrewVerb wNew = this.future2FPMissB(w);
		wNew.setMorphology(HebrewVerb.Time.FUTURE, HebrewVerb.Gender.F, HebrewVerb.Person.THIRD, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	/*
	 * Imperative
	 */
	public HebrewVerb imperative2MSComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_HeyHirik_Yod(wNew, 1);
		wNew.setVocalization_DAGESH();
		wNew.setVocalization_KAMATS();
		wNew.movePointer(1);
		wNew.removeLetter();
		this.replaceLetterTo_Yod(wNew, 1);
		wNew.setVocalization_TSERE();
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.IMPERATIVE, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb imperative2MSMiss(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_HeyHirik(wNew, 1);
		wNew.removeLetter();
		this.replaceLetterTo_Yod(wNew, 0);
		wNew.setVocalization_DAGESH();
		wNew.setVocalization_KAMATS();
		wNew.movePointer(1);
		wNew.setVocalization_TSERE();
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.IMPERATIVE, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb imperative2FSComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_HeyHirik_Yod(wNew, 1);
		wNew.setVocalization_DAGESH();
		wNew.setVocalization_KAMATS();
		wNew.movePointer(1);
		wNew.removeLetter();
		this.replaceLetterTo_Yod(wNew, 1);
		this.macro_Hirik_Yod(wNew, 1);
		this.removeNextLetter(wNew);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.IMPERATIVE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb imperative2FSMiss(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_HeyHirik(wNew, 1);
		wNew.removeLetter();
		this.replaceLetterTo_Yod(wNew, 0);
		wNew.setVocalization_DAGESH();
		wNew.setVocalization_KAMATS();
		wNew.movePointer(1);
		this.macro_Hirik_Yod(wNew, 1);
		this.removeNextLetter(wNew);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.IMPERATIVE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.SINGULAR, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb imperative2MPComp(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_HeyHirik_Yod(wNew, 1);
		wNew.setVocalization_DAGESH();
		wNew.setVocalization_KAMATS();
		wNew.movePointer(1);
		wNew.removeLetter();
		this.replaceLetterTo_Yod(wNew, 1);
		wNew.removeVocalization();
		wNew.movePointer(1);
		this.replaceLetterTo_VavSuruk(wNew, 0);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.IMPERATIVE, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb imperative2MPMiss(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_HeyHirik(wNew, 1);
		this.replaceLetterTo_Yod(wNew, 0);
		wNew.setVocalization_DAGESH();
		wNew.setVocalization_KAMATS();
		wNew.movePointer(1);
		wNew.removeLetter();
		wNew.removeVocalization();
		wNew.movePointer(1);
		this.replaceLetterTo_VavSuruk(wNew, 0);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.IMPERATIVE, HebrewVerb.Gender.M, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb imperative2FPComp(HebrewVerb w){
		HebrewVerb wNew = this.imperative2MPComp(w);
		wNew.setMorphology(HebrewVerb.Time.IMPERATIVE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}

	public HebrewVerb imperative2FPCompB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_HeyHirik_Yod(wNew, 1);
		wNew.setVocalization_KAMATS();
		wNew.setVocalization_DAGESH();
		wNew.movePointer(1);
		wNew.removeLetter();
		this.replaceLetterTo_Yod(wNew, 1);
		this.macro_Segol_Yod_NunKamats_Hey(wNew, 3);
		this.removeNextLetter(wNew);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.IMPERATIVE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.COMPLETE);
		return wNew;
	}
	
	public HebrewVerb imperative2FPMiss(HebrewVerb w){
		HebrewVerb wNew = this.imperative2MPMiss(w);
		wNew.setMorphology(HebrewVerb.Time.IMPERATIVE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	public HebrewVerb imperative2FPMissB(HebrewVerb w){
		HebrewVerb wNew = new HebrewVerb(w);
		this.macro_BEFORE_HeyHirik(wNew, 1);
		wNew.removeLetter();
		this.replaceLetterTo_Yod(wNew, 0);
		wNew.setVocalization_KAMATS();
		wNew.setVocalization_DAGESH();
		wNew.movePointer(1);
		this.macro_Segol_Yod_NunKamats_Hey(wNew, 3);
		this.removeNextLetter(wNew);
		wNew.finalizeWord();
		wNew.setMorphology(HebrewVerb.Time.IMPERATIVE, HebrewVerb.Gender.F, HebrewVerb.Person.SECOND, HebrewVerb.Number.PLURAL, HebrewVerb.Spelling.MISSING);
		return wNew;
	}

	/*
	 * Infinitive
	 */
	public HebrewVerb infinitiveComp(HebrewVerb w){
		 HebrewVerb wNew = new HebrewVerb(w);
		 this.macro_BEFORE_LamedShva_HeyHirik_Yod(wNew, 2);
		 wNew.setVocalization_KAMATS();
		 wNew.setVocalization_DAGESH();
		 wNew.movePointer(1);
		 wNew.removeLetter();
		 this.replaceLetterTo_Yod(wNew, 1);
		 wNew.removeVocalization();
		 this.macro_VavHolamM_Tav(wNew, 2);
		 this.removeNextLetter(wNew);
		 wNew.finalizeWord();
		 wNew.setMorphology(HebrewVerb.Time.INFINITIVE, HebrewVerb.Gender.E, HebrewVerb.Person.E, HebrewVerb.Number.E, HebrewVerb.Spelling.COMPLETE);
		 return wNew;
	 }

	 public HebrewVerb infinitiveMiss(HebrewVerb w){
		 HebrewVerb wNew = new HebrewVerb(w);
		 this.macro_BEFORE_LamedShva_HeyHirik(wNew, 2);
		 wNew.removeLetter();
		 this.replaceLetterTo_Yod(wNew, 0);
		 wNew.setVocalization_KAMATS();
		 wNew.setVocalization_DAGESH();
		 wNew.movePointer(1);
		 wNew.removeVocalization();
		 this.macro_VavHolamM_Tav(wNew, 2);
		 this.removeNextLetter(wNew);
		 wNew.finalizeWord();
		 wNew.setMorphology(HebrewVerb.Time.INFINITIVE, HebrewVerb.Gender.E, HebrewVerb.Person.E, HebrewVerb.Number.E, HebrewVerb.Spelling.MISSING);
		 return wNew;
	 }
	 
}
