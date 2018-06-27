/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface;

import aDL_Moddeling_Project.DataRepresentation.ObjectOrientedViewRequiredEntry;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requiering Interface Object Class Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.RequieringInterfaceObjectClassMapping#getObjectorientedviewrequiredentry <em>Objectorientedviewrequiredentry</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.RequieringInterfaceObjectClassMapping#getInterfaceObjectClass <em>Interface Object Class</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.RequieringInterfaceObjectClassMapping#getEnhancedtointerfacemapping <em>Enhancedtointerfacemapping</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AssemblyInterfacePackage#getRequieringInterfaceObjectClassMapping()
 * @model
 * @generated
 */
public interface RequieringInterfaceObjectClassMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Objectorientedviewrequiredentry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objectorientedviewrequiredentry</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objectorientedviewrequiredentry</em>' reference.
	 * @see #setObjectorientedviewrequiredentry(ObjectOrientedViewRequiredEntry)
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AssemblyInterfacePackage#getRequieringInterfaceObjectClassMapping_Objectorientedviewrequiredentry()
	 * @model required="true"
	 * @generated
	 */
	ObjectOrientedViewRequiredEntry getObjectorientedviewrequiredentry();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.RequieringInterfaceObjectClassMapping#getObjectorientedviewrequiredentry <em>Objectorientedviewrequiredentry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objectorientedviewrequiredentry</em>' reference.
	 * @see #getObjectorientedviewrequiredentry()
	 * @generated
	 */
	void setObjectorientedviewrequiredentry(ObjectOrientedViewRequiredEntry value);

	/**
	 * Returns the value of the '<em><b>Interface Object Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Object Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Object Class</em>' reference.
	 * @see #setInterfaceObjectClass(AbstractInterfaceObjectClass)
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AssemblyInterfacePackage#getRequieringInterfaceObjectClassMapping_InterfaceObjectClass()
	 * @model required="true"
	 * @generated
	 */
	AbstractInterfaceObjectClass getInterfaceObjectClass();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.RequieringInterfaceObjectClassMapping#getInterfaceObjectClass <em>Interface Object Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Object Class</em>' reference.
	 * @see #getInterfaceObjectClass()
	 * @generated
	 */
	void setInterfaceObjectClass(AbstractInterfaceObjectClass value);

	/**
	 * Returns the value of the '<em><b>Enhancedtointerfacemapping</b></em>' containment reference list.
	 * The list contents are of type {@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.EnhancedToInterfaceMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enhancedtointerfacemapping</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enhancedtointerfacemapping</em>' containment reference list.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AssemblyInterfacePackage#getRequieringInterfaceObjectClassMapping_Enhancedtointerfacemapping()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnhancedToInterfaceMapping> getEnhancedtointerfacemapping();

} // RequieringInterfaceObjectClassMapping
