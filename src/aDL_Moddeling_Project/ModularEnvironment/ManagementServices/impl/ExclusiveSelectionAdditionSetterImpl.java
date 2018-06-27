/**
 */
package aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ExclusiveSelectionAdditionSetter;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ExclusiveSettableAddition;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServicesPackage;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.additionValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exclusive Selection Addition Setter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ExclusiveSelectionAdditionSetterImpl#getSelectableadditionvalue <em>Selectableadditionvalue</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.ExclusiveSelectionAdditionSetterImpl#getExclusivesettableaddition <em>Exclusivesettableaddition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExclusiveSelectionAdditionSetterImpl extends AdditionSetterImpl implements ExclusiveSelectionAdditionSetter {
	/**
	 * The cached value of the '{@link #getSelectableadditionvalue() <em>Selectableadditionvalue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectableadditionvalue()
	 * @generated
	 * @ordered
	 */
	protected additionValue selectableadditionvalue;

	/**
	 * The cached value of the '{@link #getExclusivesettableaddition() <em>Exclusivesettableaddition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclusivesettableaddition()
	 * @generated
	 * @ordered
	 */
	protected ExclusiveSettableAddition exclusivesettableaddition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExclusiveSelectionAdditionSetterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManagementServicesPackage.Literals.EXCLUSIVE_SELECTION_ADDITION_SETTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public additionValue getSelectableadditionvalue() {
		if (selectableadditionvalue != null && selectableadditionvalue.eIsProxy()) {
			InternalEObject oldSelectableadditionvalue = (InternalEObject)selectableadditionvalue;
			selectableadditionvalue = (additionValue)eResolveProxy(oldSelectableadditionvalue);
			if (selectableadditionvalue != oldSelectableadditionvalue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ManagementServicesPackage.EXCLUSIVE_SELECTION_ADDITION_SETTER__SELECTABLEADDITIONVALUE, oldSelectableadditionvalue, selectableadditionvalue));
			}
		}
		return selectableadditionvalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public additionValue basicGetSelectableadditionvalue() {
		return selectableadditionvalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectableadditionvalue(additionValue newSelectableadditionvalue) {
		additionValue oldSelectableadditionvalue = selectableadditionvalue;
		selectableadditionvalue = newSelectableadditionvalue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManagementServicesPackage.EXCLUSIVE_SELECTION_ADDITION_SETTER__SELECTABLEADDITIONVALUE, oldSelectableadditionvalue, selectableadditionvalue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExclusiveSettableAddition getExclusivesettableaddition() {
		if (exclusivesettableaddition != null && exclusivesettableaddition.eIsProxy()) {
			InternalEObject oldExclusivesettableaddition = (InternalEObject)exclusivesettableaddition;
			exclusivesettableaddition = (ExclusiveSettableAddition)eResolveProxy(oldExclusivesettableaddition);
			if (exclusivesettableaddition != oldExclusivesettableaddition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ManagementServicesPackage.EXCLUSIVE_SELECTION_ADDITION_SETTER__EXCLUSIVESETTABLEADDITION, oldExclusivesettableaddition, exclusivesettableaddition));
			}
		}
		return exclusivesettableaddition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExclusiveSettableAddition basicGetExclusivesettableaddition() {
		return exclusivesettableaddition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExclusivesettableaddition(ExclusiveSettableAddition newExclusivesettableaddition) {
		ExclusiveSettableAddition oldExclusivesettableaddition = exclusivesettableaddition;
		exclusivesettableaddition = newExclusivesettableaddition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManagementServicesPackage.EXCLUSIVE_SELECTION_ADDITION_SETTER__EXCLUSIVESETTABLEADDITION, oldExclusivesettableaddition, exclusivesettableaddition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ManagementServicesPackage.EXCLUSIVE_SELECTION_ADDITION_SETTER__SELECTABLEADDITIONVALUE:
				if (resolve) return getSelectableadditionvalue();
				return basicGetSelectableadditionvalue();
			case ManagementServicesPackage.EXCLUSIVE_SELECTION_ADDITION_SETTER__EXCLUSIVESETTABLEADDITION:
				if (resolve) return getExclusivesettableaddition();
				return basicGetExclusivesettableaddition();
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
			case ManagementServicesPackage.EXCLUSIVE_SELECTION_ADDITION_SETTER__SELECTABLEADDITIONVALUE:
				setSelectableadditionvalue((additionValue)newValue);
				return;
			case ManagementServicesPackage.EXCLUSIVE_SELECTION_ADDITION_SETTER__EXCLUSIVESETTABLEADDITION:
				setExclusivesettableaddition((ExclusiveSettableAddition)newValue);
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
			case ManagementServicesPackage.EXCLUSIVE_SELECTION_ADDITION_SETTER__SELECTABLEADDITIONVALUE:
				setSelectableadditionvalue((additionValue)null);
				return;
			case ManagementServicesPackage.EXCLUSIVE_SELECTION_ADDITION_SETTER__EXCLUSIVESETTABLEADDITION:
				setExclusivesettableaddition((ExclusiveSettableAddition)null);
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
			case ManagementServicesPackage.EXCLUSIVE_SELECTION_ADDITION_SETTER__SELECTABLEADDITIONVALUE:
				return selectableadditionvalue != null;
			case ManagementServicesPackage.EXCLUSIVE_SELECTION_ADDITION_SETTER__EXCLUSIVESETTABLEADDITION:
				return exclusivesettableaddition != null;
		}
		return super.eIsSet(featureID);
	}

} //ExclusiveSelectionAdditionSetterImpl
