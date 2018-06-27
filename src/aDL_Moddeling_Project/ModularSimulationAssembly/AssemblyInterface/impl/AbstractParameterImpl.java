/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractParameter;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AssemblyInterfacePackage;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.InterfaceTypedData;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AbstractParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AbstractParameterImpl#isOptional <em>Optional</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AbstractParameterImpl#getAbstractParameterType <em>Abstract Parameter Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractParameterImpl extends MinimalEObjectImpl.Container implements AbstractParameter {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected boolean optional = OPTIONAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAbstractParameterType() <em>Abstract Parameter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractParameterType()
	 * @generated
	 * @ordered
	 */
	protected static final InterfaceTypedData ABSTRACT_PARAMETER_TYPE_EDEFAULT = InterfaceTypedData.NUMERICAL;

	/**
	 * The cached value of the '{@link #getAbstractParameterType() <em>Abstract Parameter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractParameterType()
	 * @generated
	 * @ordered
	 */
	protected InterfaceTypedData abstractParameterType = ABSTRACT_PARAMETER_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblyInterfacePackage.Literals.ABSTRACT_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyInterfacePackage.ABSTRACT_PARAMETER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOptional() {
		return optional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptional(boolean newOptional) {
		boolean oldOptional = optional;
		optional = newOptional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyInterfacePackage.ABSTRACT_PARAMETER__OPTIONAL, oldOptional, optional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceTypedData getAbstractParameterType() {
		return abstractParameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstractParameterType(InterfaceTypedData newAbstractParameterType) {
		InterfaceTypedData oldAbstractParameterType = abstractParameterType;
		abstractParameterType = newAbstractParameterType == null ? ABSTRACT_PARAMETER_TYPE_EDEFAULT : newAbstractParameterType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyInterfacePackage.ABSTRACT_PARAMETER__ABSTRACT_PARAMETER_TYPE, oldAbstractParameterType, abstractParameterType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AssemblyInterfacePackage.ABSTRACT_PARAMETER__NAME:
				return getName();
			case AssemblyInterfacePackage.ABSTRACT_PARAMETER__OPTIONAL:
				return isOptional();
			case AssemblyInterfacePackage.ABSTRACT_PARAMETER__ABSTRACT_PARAMETER_TYPE:
				return getAbstractParameterType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AssemblyInterfacePackage.ABSTRACT_PARAMETER__NAME:
				setName((String)newValue);
				return;
			case AssemblyInterfacePackage.ABSTRACT_PARAMETER__OPTIONAL:
				setOptional((Boolean)newValue);
				return;
			case AssemblyInterfacePackage.ABSTRACT_PARAMETER__ABSTRACT_PARAMETER_TYPE:
				setAbstractParameterType((InterfaceTypedData)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AssemblyInterfacePackage.ABSTRACT_PARAMETER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AssemblyInterfacePackage.ABSTRACT_PARAMETER__OPTIONAL:
				setOptional(OPTIONAL_EDEFAULT);
				return;
			case AssemblyInterfacePackage.ABSTRACT_PARAMETER__ABSTRACT_PARAMETER_TYPE:
				setAbstractParameterType(ABSTRACT_PARAMETER_TYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AssemblyInterfacePackage.ABSTRACT_PARAMETER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AssemblyInterfacePackage.ABSTRACT_PARAMETER__OPTIONAL:
				return optional != OPTIONAL_EDEFAULT;
			case AssemblyInterfacePackage.ABSTRACT_PARAMETER__ABSTRACT_PARAMETER_TYPE:
				return abstractParameterType != ABSTRACT_PARAMETER_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Name: ");
		result.append(name);
		result.append(", optional: ");
		result.append(optional);
		result.append(", abstractParameterType: ");
		result.append(abstractParameterType);
		result.append(')');
		return result.toString();
	}

} //AbstractParameterImpl
