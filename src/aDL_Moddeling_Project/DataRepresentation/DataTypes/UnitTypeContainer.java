/**
 */
package aDL_Moddeling_Project.DataRepresentation.DataTypes;

import aDL_Moddeling_Project.basic.Entity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Type Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.UnitTypeContainer#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypesPackage#getUnitTypeContainer()
 * @model
 * @generated
 */
public interface UnitTypeContainer extends Entity {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' containment reference list.
	 * The list contents are of type {@link aDL_Moddeling_Project.DataRepresentation.DataTypes.Unit}.
	 * It is bidirectional and its opposite is '{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.Unit#getUnittypecontainer <em>Unittypecontainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' containment reference list.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypesPackage#getUnitTypeContainer_Unit()
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.Unit#getUnittypecontainer
	 * @model opposite="unittypecontainer" containment="true"
	 * @generated
	 */
	EList<Unit> getUnit();

} // UnitTypeContainer
