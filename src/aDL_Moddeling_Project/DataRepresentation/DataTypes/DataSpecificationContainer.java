/**
 */
package aDL_Moddeling_Project.DataRepresentation.DataTypes;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.Adaptable;

import aDL_Moddeling_Project.basic.Entity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Specification Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.DataSpecificationContainer#getUnittypecontainer <em>Unittypecontainer</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.DataSpecificationContainer#getDataspecification <em>Dataspecification</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypesPackage#getDataSpecificationContainer()
 * @model
 * @generated
 */
public interface DataSpecificationContainer extends Entity, Adaptable {
	/**
	 * Returns the value of the '<em><b>Unittypecontainer</b></em>' containment reference list.
	 * The list contents are of type {@link aDL_Moddeling_Project.DataRepresentation.DataTypes.UnitTypeContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unittypecontainer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unittypecontainer</em>' containment reference list.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypesPackage#getDataSpecificationContainer_Unittypecontainer()
	 * @model containment="true"
	 * @generated
	 */
	EList<UnitTypeContainer> getUnittypecontainer();

	/**
	 * Returns the value of the '<em><b>Dataspecification</b></em>' containment reference list.
	 * The list contents are of type {@link aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypeSpecification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dataspecification</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataspecification</em>' containment reference list.
	 * @see aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypesPackage#getDataSpecificationContainer_Dataspecification()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataTypeSpecification> getDataspecification();

} // DataSpecificationContainer
