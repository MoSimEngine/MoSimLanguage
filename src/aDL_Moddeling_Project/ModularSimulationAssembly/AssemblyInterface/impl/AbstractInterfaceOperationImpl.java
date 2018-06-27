/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractInterfaceOperation;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractParameter;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AssemblyInterfacePackage;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.InterfaceTypedData;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Interface Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AbstractInterfaceOperationImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.impl.AbstractInterfaceOperationImpl#getAbstractparameter <em>Abstractparameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractInterfaceOperationImpl extends AbstractAssemblyEntityImpl implements AbstractInterfaceOperation {
	/**
	 * The default value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected static final InterfaceTypedData RETURN_TYPE_EDEFAULT = InterfaceTypedData.NUMERICAL;

	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected InterfaceTypedData returnType = RETURN_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAbstractparameter() <em>Abstractparameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractparameter()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractParameter> abstractparameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractInterfaceOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblyInterfacePackage.Literals.ABSTRACT_INTERFACE_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceTypedData getReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(InterfaceTypedData newReturnType) {
		InterfaceTypedData oldReturnType = returnType;
		returnType = newReturnType == null ? RETURN_TYPE_EDEFAULT : newReturnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssemblyInterfacePackage.ABSTRACT_INTERFACE_OPERATION__RETURN_TYPE, oldReturnType, returnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractParameter> getAbstractparameter() {
		if (abstractparameter == null) {
			abstractparameter = new EObjectContainmentEList<AbstractParameter>(AbstractParameter.class, this, AssemblyInterfacePackage.ABSTRACT_INTERFACE_OPERATION__ABSTRACTPARAMETER);
		}
		return abstractparameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssemblyInterfacePackage.ABSTRACT_INTERFACE_OPERATION__ABSTRACTPARAMETER:
				return ((InternalEList<?>)getAbstractparameter()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AssemblyInterfacePackage.ABSTRACT_INTERFACE_OPERATION__RETURN_TYPE:
				return getReturnType();
			case AssemblyInterfacePackage.ABSTRACT_INTERFACE_OPERATION__ABSTRACTPARAMETER:
				return getAbstractparameter();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AssemblyInterfacePackage.ABSTRACT_INTERFACE_OPERATION__RETURN_TYPE:
				setReturnType((InterfaceTypedData)newValue);
				return;
			case AssemblyInterfacePackage.ABSTRACT_INTERFACE_OPERATION__ABSTRACTPARAMETER:
				getAbstractparameter().clear();
				getAbstractparameter().addAll((Collection<? extends AbstractParameter>)newValue);
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
			case AssemblyInterfacePackage.ABSTRACT_INTERFACE_OPERATION__RETURN_TYPE:
				setReturnType(RETURN_TYPE_EDEFAULT);
				return;
			case AssemblyInterfacePackage.ABSTRACT_INTERFACE_OPERATION__ABSTRACTPARAMETER:
				getAbstractparameter().clear();
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
			case AssemblyInterfacePackage.ABSTRACT_INTERFACE_OPERATION__RETURN_TYPE:
				return returnType != RETURN_TYPE_EDEFAULT;
			case AssemblyInterfacePackage.ABSTRACT_INTERFACE_OPERATION__ABSTRACTPARAMETER:
				return abstractparameter != null && !abstractparameter.isEmpty();
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
		result.append(" (ReturnType: ");
		result.append(returnType);
		result.append(')');
		return result.toString();
	}

} //AbstractInterfaceOperationImpl
