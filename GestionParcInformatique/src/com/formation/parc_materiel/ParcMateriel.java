package com.formation.parc_materiel;

/**
 * 
 * @author Hassan Essabir
 * @version V18.04
 *
 */
public class ParcMateriel extends Parc {
	
	public void ajoutEquipement(Equipement eq) throws EquipementIncompatibleException {
		if (eq instanceof Telephone) {
			throw new EquipementIncompatibleException();
		}
		equipements.add(eq);
		System.out.println("--Equipement added");
	}
	
//	public void ajoutEquipement(Ordinateur o) {
//		super.ajoutEquipement(o);
//	}
//
//	public void ajoutEquipement(Imprimante i) {
//		super.ajoutEquipement(i);
//	}
}
