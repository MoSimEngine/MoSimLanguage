/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnchancedObjectClass;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Providing Interface Object Class Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.ProvidingInterfaceObjectClassMapping#getInterfaceObjectClass <em>Interface Object Class</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.ProvidingInterfaceObjectClassMapping#getAdditionenchancedobjectclass <em>Additionenchancedobjectclass</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.ProvidingInterfaceObjectClassMapping#getEnhancedtointerfacemapping <em>Enhancedtointerfacemapping</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AssemblyInterfacePackage#getProvidingInterfaceObjectClassMapping()
 * @model
 * @generated
 */
public interface ProvidingInterfaceObjectClassMapping extends EObject {
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
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AssemblyInterfacePackage#getProvidingInterfaceObjectClassMapping_InterfaceObjectClass()
	 * @model required="true"
	 * @generated
	 */
	AbstractInterfaceObjectClass getInterfaceObjectClass();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.ProvidingInterfaceObjectClassMapping#getInterfaceObjectClass <em>Interface Object Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Object Class</em>' reference.
	 * @see #getInterfaceObjectClass()
	 * @generated
	 */
	void setInterfaceObjectClass(AbstractInterfaceObjectClass value);

	/**
	 * Returns the value of the '<em><b>Additionenchancedobjectclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additionenchancedobjectclass</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additionenchancedobjectclass</em>' reference.
	 * @see #setAdditionenchancedobjectclass(AdditionEnchancedObjectClass)
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AssemblyInterfacePackage#getProvidingInterfaceObjectClassMapping_Additionenchancedobjectclass()
	 * @model required="true"
	 * @generated
	 */
	AdditionEnchancedObjectClass getAdditionenchancedobjectclass();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.ProvidingInterfaceObjectClassMapping#getAdditionenchancedobjectclass <em>Additionenchancedobjectclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additionenchancedobjectclass</em>' reference.
	 * @see #getAdditionenchancedobjectclass()
	 * @generated
	 */
	void setAdditionenchancedobjectclass(AdditionEnchancedObjectClass value);

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
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AssemblyInterfacePackage#getProvidingInterfaceObjectClassMapping_Enhancedtointerfacemapping()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnhancedToInterfaceMapping> getEnhancedtointerfacemapping();

} // ProvidingInterfaceObjectClassMapping
