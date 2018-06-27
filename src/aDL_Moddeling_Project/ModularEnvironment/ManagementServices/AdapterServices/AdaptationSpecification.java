/**
 */
package aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices;

import aDL_Moddeling_Project.basic.Entity;
import aDL_Moddeling_Project.basic.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adaptation Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationSpecification#getFstEntityID <em>Fst Entity ID</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationSpecification#getScndEntityID <em>Scnd Entity ID</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterServicesPackage#getAdaptationSpecification()
 * @model abstract="true"
 * @generated
 */
public interface AdaptationSpecification extends Entity {
	/**
	 * Returns the value of the '<em><b>Fst Entity ID</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fst Entity ID</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fst Entity ID</em>' reference.
	 * @see #setFstEntityID(Identifier)
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterServicesPackage#getAdaptationSpecification_FstEntityID()
	 * @model required="true"
	 * @generated
	 */
	Identifier getFstEntityID();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationSpecification#getFstEntityID <em>Fst Entity ID</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fst Entity ID</em>' reference.
	 * @see #getFstEntityID()
	 * @generated
	 */
	void setFstEntityID(Identifier value);

	/**
	 * Returns the value of the '<em><b>Scnd Entity ID</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scnd Entity ID</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scnd Entity ID</em>' reference.
	 * @see #setScndEntityID(Identifier)
	 * @see aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterServicesPackage#getAdaptationSpecification_ScndEntityID()
	 * @model required="true"
	 * @generated
	 */
	Identifier getScndEntityID();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationSpecification#getScndEntityID <em>Scnd Entity ID</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scnd Entity ID</em>' reference.
	 * @see #getScndEntityID()
	 * @generated
	 */
	void setScndEntityID(Identifier value);

} // AdaptationSpecification
