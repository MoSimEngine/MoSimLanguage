/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Interface Object Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractInterfaceObjectClass#getAbstractinterfacedata <em>Abstractinterfacedata</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractInterfaceObjectClass#getAbstractinterfaceoperation <em>Abstractinterfaceoperation</em>}</li>
 * </ul>
 *
 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AssemblyInterfacePackage#getAbstractInterfaceObjectClass()
 * @model
 * @generated
 */
public interface AbstractInterfaceObjectClass extends AbstractAssemblyEntity {
	/**
	 * Returns the value of the '<em><b>Abstractinterfacedata</b></em>' containment reference list.
	 * The list contents are of type {@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractInterfaceData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstractinterfacedata</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstractinterfacedata</em>' containment reference list.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AssemblyInterfacePackage#getAbstractInterfaceObjectClass_Abstractinterfacedata()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractInterfaceData> getAbstractinterfacedata();

	/**
	 * Returns the value of the '<em><b>Abstractinterfaceoperation</b></em>' containment reference list.
	 * The list contents are of type {@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractInterfaceOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstractinterfaceoperation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstractinterfaceoperation</em>' containment reference list.
	 * @see aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AssemblyInterfacePackage#getAbstractInterfaceObjectClass_Abstractinterfaceoperation()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractInterfaceOperation> getAbstractinterfaceoperation();

} // AbstractInterfaceObjectClass
