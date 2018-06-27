/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnhanced;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enhanced To Interface Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.EnhancedToInterfaceMapping#getAbstractassemblyentity <em>Abstractassemblyentity</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.EnhancedToInterfaceMapping#getAdditionenhanced <em>Additionenhanced</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AssemblyInterfacePackage#getEnhancedToInterfaceMapping()
 * @model
 * @generated
 */
public interface EnhancedToInterfaceMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Abstractassemblyentity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstractassemblyentity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstractassemblyentity</em>' reference.
	 * @see #setAbstractassemblyentity(AbstractAssemblyEntity)
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AssemblyInterfacePackage#getEnhancedToInterfaceMapping_Abstractassemblyentity()
	 * @model required="true"
	 * @generated
	 */
	AbstractAssemblyEntity getAbstractassemblyentity();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.EnhancedToInterfaceMapping#getAbstractassemblyentity <em>Abstractassemblyentity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstractassemblyentity</em>' reference.
	 * @see #getAbstractassemblyentity()
	 * @generated
	 */
	void setAbstractassemblyentity(AbstractAssemblyEntity value);

	/**
	 * Returns the value of the '<em><b>Additionenhanced</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additionenhanced</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additionenhanced</em>' reference.
	 * @see #setAdditionenhanced(AdditionEnhanced)
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AssemblyInterfacePackage#getEnhancedToInterfaceMapping_Additionenhanced()
	 * @model required="true"
	 * @generated
	 */
	AdditionEnhanced getAdditionenhanced();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.EnhancedToInterfaceMapping#getAdditionenhanced <em>Additionenhanced</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additionenhanced</em>' reference.
	 * @see #getAdditionenhanced()
	 * @generated
	 */
	void setAdditionenhanced(AdditionEnhanced value);

} // EnhancedToInterfaceMapping
