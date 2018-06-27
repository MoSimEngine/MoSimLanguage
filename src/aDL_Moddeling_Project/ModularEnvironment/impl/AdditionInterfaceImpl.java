/**
 */
package aDL_Moddeling_Project.ModularEnvironment.impl;

import aDL_Moddeling_Project.ModularEnvironment.AdditionInterface;
import aDL_Moddeling_Project.ModularEnvironment.DataAdditionInterface;
import aDL_Moddeling_Project.ModularEnvironment.ModularEnvironmentPackage;
import aDL_Moddeling_Project.ModularEnvironment.OperationAdditionInterface;

import aDL_Moddeling_Project.basic.impl.IdentifierImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Addition Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.impl.AdditionInterfaceImpl#getOperationadditioninterface <em>Operationadditioninterface</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.impl.AdditionInterfaceImpl#getDataadditioninterface <em>Dataadditioninterface</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AdditionInterfaceImpl extends IdentifierImpl implements AdditionInterface {
	/**
	 * The cached value of the '{@link #getOperationadditioninterface() <em>Operationadditioninterface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationadditioninterface()
	 * @generated
	 * @ordered
	 */
	protected OperationAdditionInterface operationadditioninterface;

	/**
	 * The cached value of the '{@link #getDataadditioninterface() <em>Dataadditioninterface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataadditioninterface()
	 * @generated
	 * @ordered
	 */
	protected DataAdditionInterface dataadditioninterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdditionInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModularEnvironmentPackage.Literals.ADDITION_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationAdditionInterface getOperationadditioninterface() {
		return operationadditioninterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationadditioninterface(OperationAdditionInterface newOperationadditioninterface, NotificationChain msgs) {
		OperationAdditionInterface oldOperationadditioninterface = operationadditioninterface;
		operationadditioninterface = newOperationadditioninterface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModularEnvironmentPackage.ADDITION_INTERFACE__OPERATIONADDITIONINTERFACE, oldOperationadditioninterface, newOperationadditioninterface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationadditioninterface(OperationAdditionInterface newOperationadditioninterface) {
		if (newOperationadditioninterface != operationadditioninterface) {
			NotificationChain msgs = null;
			if (operationadditioninterface != null)
				msgs = ((InternalEObject)operationadditioninterface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModularEnvironmentPackage.ADDITION_INTERFACE__OPERATIONADDITIONINTERFACE, null, msgs);
			if (newOperationadditioninterface != null)
				msgs = ((InternalEObject)newOperationadditioninterface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModularEnvironmentPackage.ADDITION_INTERFACE__OPERATIONADDITIONINTERFACE, null, msgs);
			msgs = basicSetOperationadditioninterface(newOperationadditioninterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModularEnvironmentPackage.ADDITION_INTERFACE__OPERATIONADDITIONINTERFACE, newOperationadditioninterface, newOperationadditioninterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAdditionInterface getDataadditioninterface() {
		return dataadditioninterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataadditioninterface(DataAdditionInterface newDataadditioninterface, NotificationChain msgs) {
		DataAdditionInterface oldDataadditioninterface = dataadditioninterface;
		dataadditioninterface = newDataadditioninterface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModularEnvironmentPackage.ADDITION_INTERFACE__DATAADDITIONINTERFACE, oldDataadditioninterface, newDataadditioninterface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataadditioninterface(DataAdditionInterface newDataadditioninterface) {
		if (newDataadditioninterface != dataadditioninterface) {
			NotificationChain msgs = null;
			if (dataadditioninterface != null)
				msgs = ((InternalEObject)dataadditioninterface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModularEnvironmentPackage.ADDITION_INTERFACE__DATAADDITIONINTERFACE, null, msgs);
			if (newDataadditioninterface != null)
				msgs = ((InternalEObject)newDataadditioninterface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModularEnvironmentPackage.ADDITION_INTERFACE__DATAADDITIONINTERFACE, null, msgs);
			msgs = basicSetDataadditioninterface(newDataadditioninterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModularEnvironmentPackage.ADDITION_INTERFACE__DATAADDITIONINTERFACE, newDataadditioninterface, newDataadditioninterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModularEnvironmentPackage.ADDITION_INTERFACE__OPERATIONADDITIONINTERFACE:
				return basicSetOperationadditioninterface(null, msgs);
			case ModularEnvironmentPackage.ADDITION_INTERFACE__DATAADDITIONINTERFACE:
				return basicSetDataadditioninterface(null, msgs);
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
			case ModularEnvironmentPackage.ADDITION_INTERFACE__OPERATIONADDITIONINTERFACE:
				return getOperationadditioninterface();
			case ModularEnvironmentPackage.ADDITION_INTERFACE__DATAADDITIONINTERFACE:
				return getDataadditioninterface();
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
			case ModularEnvironmentPackage.ADDITION_INTERFACE__OPERATIONADDITIONINTERFACE:
				setOperationadditioninterface((OperationAdditionInterface)newValue);
				return;
			case ModularEnvironmentPackage.ADDITION_INTERFACE__DATAADDITIONINTERFACE:
				setDataadditioninterface((DataAdditionInterface)newValue);
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
			case ModularEnvironmentPackage.ADDITION_INTERFACE__OPERATIONADDITIONINTERFACE:
				setOperationadditioninterface((OperationAdditionInterface)null);
				return;
			case ModularEnvironmentPackage.ADDITION_INTERFACE__DATAADDITIONINTERFACE:
				setDataadditioninterface((DataAdditionInterface)null);
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
			case ModularEnvironmentPackage.ADDITION_INTERFACE__OPERATIONADDITIONINTERFACE:
				return operationadditioninterface != null;
			case ModularEnvironmentPackage.ADDITION_INTERFACE__DATAADDITIONINTERFACE:
				return dataadditioninterface != null;
		}
		return super.eIsSet(featureID);
	}

} //AdditionInterfaceImpl
