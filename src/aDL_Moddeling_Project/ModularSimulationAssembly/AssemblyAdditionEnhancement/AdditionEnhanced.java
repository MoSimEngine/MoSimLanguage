/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement;

import aDL_Moddeling_Project.ModularEnvironment.AdditionInterface;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdditionSetter;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Addition Enhanced</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnhanced#getAdditionsetter <em>Additionsetter</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnhanced#getReferencedAdditioninterface <em>Referenced Additioninterface</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AssemblyAdditionEnhancementPackage#getAdditionEnhanced()
 * @model abstract="true"
 * @generated
 */
public interface AdditionEnhanced extends MappableData {
	/**
	 * Returns the value of the '<em><b>Additionsetter</b></em>' containment reference list.
	 * The list contents are of type {@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdditionSetter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additionsetter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additionsetter</em>' containment reference list.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AssemblyAdditionEnhancementPackage#getAdditionEnhanced_Additionsetter()
	 * @model containment="true"
	 * @generated
	 */
	EList<AdditionSetter> getAdditionsetter();

	/**
	 * Returns the value of the '<em><b>Referenced Additioninterface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Additioninterface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Additioninterface</em>' reference.
	 * @see #setReferencedAdditioninterface(AdditionInterface)
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AssemblyAdditionEnhancementPackage#getAdditionEnhanced_ReferencedAdditioninterface()
	 * @model
	 * @generated
	 */
	AdditionInterface getReferencedAdditioninterface();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnhanced#getReferencedAdditioninterface <em>Referenced Additioninterface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Additioninterface</em>' reference.
	 * @see #getReferencedAdditioninterface()
	 * @generated
	 */
	void setReferencedAdditioninterface(AdditionInterface value);

} // AdditionEnhanced
