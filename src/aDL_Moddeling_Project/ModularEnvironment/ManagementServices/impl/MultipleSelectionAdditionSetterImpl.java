/**
 */
package aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.ManagementServicesPackage;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.MultipleSelectionAdditionSetter;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.MultipleSettableAddition;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.additionValue;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiple Selection Addition Setter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.MultipleSelectionAdditionSetterImpl#getSelectableadditionvalue <em>Selectableadditionvalue</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.impl.MultipleSelectionAdditionSetterImpl#getMultiplesettableaddition <em>Multiplesettableaddition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultipleSelectionAdditionSetterImpl extends AdditionSetterImpl implements MultipleSelectionAdditionSetter {
	/**
	 * The cached value of the '{@link #getSelectableadditionvalue() <em>Selectableadditionvalue</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectableadditionvalue()
	 * @generated
	 * @ordered
	 */
	protected EList<additionValue> selectableadditionvalue;

	/**
	 * The cached value of the '{@link #getMultiplesettableaddition() <em>Multiplesettableaddition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplesettableaddition()
	 * @generated
	 * @ordered
	 */
	protected MultipleSettableAddition multiplesettableaddition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultipleSelectionAdditionSetterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ManagementServicesPackage.Literals.MULTIPLE_SELECTION_ADDITION_SETTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<additionValue> getSelectableadditionvalue() {
		if (selectableadditionvalue == null) {
			selectableadditionvalue = new EObjectResolvingEList<additionValue>(additionValue.class, this, ManagementServicesPackage.MULTIPLE_SELECTION_ADDITION_SETTER__SELECTABLEADDITIONVALUE);
		}
		return selectableadditionvalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleSettableAddition getMultiplesettableaddition() {
		if (multiplesettableaddition != null && multiplesettableaddition.eIsProxy()) {
			InternalEObject oldMultiplesettableaddition = (InternalEObject)multiplesettableaddition;
			multiplesettableaddition = (MultipleSettableAddition)eResolveProxy(oldMultiplesettableaddition);
			if (multiplesettableaddition != oldMultiplesettableaddition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ManagementServicesPackage.MULTIPLE_SELECTION_ADDITION_SETTER__MULTIPLESETTABLEADDITION, oldMultiplesettableaddition, multiplesettableaddition));
			}
		}
		return multiplesettableaddition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleSettableAddition basicGetMultiplesettableaddition() {
		return multiplesettableaddition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplesettableaddition(MultipleSettableAddition newMultiplesettableaddition) {
		MultipleSettableAddition oldMultiplesettableaddition = multiplesettableaddition;
		multiplesettableaddition = newMultiplesettableaddition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ManagementServicesPackage.MULTIPLE_SELECTION_ADDITION_SETTER__MULTIPLESETTABLEADDITION, oldMultiplesettableaddition, multiplesettableaddition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ManagementServicesPackage.MULTIPLE_SELECTION_ADDITION_SETTER__SELECTABLEADDITIONVALUE:
				return getSelectableadditionvalue();
			case ManagementServicesPackage.MULTIPLE_SELECTION_ADDITION_SETTER__MULTIPLESETTABLEADDITION:
				if (resolve) return getMultiplesettableaddition();
				return basicGetMultiplesettableaddition();
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
			case ManagementServicesPackage.MULTIPLE_SELECTION_ADDITION_SETTER__SELECTABLEADDITIONVALUE:
				getSelectableadditionvalue().clear();
				getSelectableadditionvalue().addAll((Collection<? extends additionValue>)newValue);
				return;
			case ManagementServicesPackage.MULTIPLE_SELECTION_ADDITION_SETTER__MULTIPLESETTABLEADDITION:
				setMultiplesettableaddition((MultipleSettableAddition)newValue);
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
			case ManagementServicesPackage.MULTIPLE_SELECTION_ADDITION_SETTER__SELECTABLEADDITIONVALUE:
				getSelectableadditionvalue().clear();
				return;
			case ManagementServicesPackage.MULTIPLE_SELECTION_ADDITION_SETTER__MULTIPLESETTABLEADDITION:
				setMultiplesettableaddition((MultipleSettableAddition)null);
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
			case ManagementServicesPackage.MULTIPLE_SELECTION_ADDITION_SETTER__SELECTABLEADDITIONVALUE:
				return selectableadditionvalue != null && !selectableadditionvalue.isEmpty();
			case ManagementServicesPackage.MULTIPLE_SELECTION_ADDITION_SETTER__MULTIPLESETTABLEADDITION:
				return multiplesettableaddition != null;
		}
		return super.eIsSet(featureID);
	}

} //MultipleSelectionAdditionSetterImpl
