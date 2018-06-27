/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement;

import aDL_Moddeling_Project.DataRepresentation.ObjectClass;

import aDL_Moddeling_Project.ModularEnvironment.ObjectClassAdditionInterface;

import aDL_Moddeling_Project.basic.Entity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Addition Enchanced Object Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnchancedObjectClass#getObjectclass <em>Objectclass</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnchancedObjectClass#getAdditioninterface <em>Additioninterface</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnchancedObjectClass#getAdditionenhancedoperation <em>Additionenhancedoperation</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnchancedObjectClass#getAdditionenhanceddata <em>Additionenhanceddata</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AssemblyAdditionEnhancementPackage#getAdditionEnchancedObjectClass()
 * @model
 * @generated
 */
public interface AdditionEnchancedObjectClass extends Entity, AdditionEnhanced {
	/**
	 * Returns the value of the '<em><b>Objectclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objectclass</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objectclass</em>' reference.
	 * @see #setObjectclass(ObjectClass)
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AssemblyAdditionEnhancementPackage#getAdditionEnchancedObjectClass_Objectclass()
	 * @model required="true"
	 * @generated
	 */
	ObjectClass getObjectclass();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnchancedObjectClass#getObjectclass <em>Objectclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objectclass</em>' reference.
	 * @see #getObjectclass()
	 * @generated
	 */
	void setObjectclass(ObjectClass value);

	/**
	 * Returns the value of the '<em><b>Additioninterface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additioninterface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additioninterface</em>' reference.
	 * @see #setAdditioninterface(ObjectClassAdditionInterface)
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AssemblyAdditionEnhancementPackage#getAdditionEnchancedObjectClass_Additioninterface()
	 * @model required="true"
	 * @generated
	 */
	ObjectClassAdditionInterface getAdditioninterface();

	/**
	 * Sets the value of the '{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnchancedObjectClass#getAdditioninterface <em>Additioninterface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additioninterface</em>' reference.
	 * @see #getAdditioninterface()
	 * @generated
	 */
	void setAdditioninterface(ObjectClassAdditionInterface value);

	/**
	 * Returns the value of the '<em><b>Additionenhancedoperation</b></em>' containment reference list.
	 * The list contents are of type {@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnhancedOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additionenhancedoperation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additionenhancedoperation</em>' containment reference list.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AssemblyAdditionEnhancementPackage#getAdditionEnchancedObjectClass_Additionenhancedoperation()
	 * @model containment="true"
	 * @generated
	 */
	EList<AdditionEnhancedOperation> getAdditionenhancedoperation();

	/**
	 * Returns the value of the '<em><b>Additionenhanceddata</b></em>' containment reference list.
	 * The list contents are of type {@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnhancedData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additionenhanceddata</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additionenhanceddata</em>' containment reference list.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AssemblyAdditionEnhancementPackage#getAdditionEnchancedObjectClass_Additionenhanceddata()
	 * @model containment="true"
	 * @generated
	 */
	EList<AdditionEnhancedData> getAdditionenhanceddata();

} // AdditionEnchancedObjectClass
