/**
 */
package aDL_Moddeling_Project.DataRepresentation.DataTypes.impl;

import aDL_Moddeling_Project.DataRepresentation.DataTypes.BaseDataType;
import aDL_Moddeling_Project.DataRepresentation.DataTypes.DataTypesPackage;
import aDL_Moddeling_Project.DataRepresentation.DataTypes.Range;
import aDL_Moddeling_Project.DataRepresentation.DataTypes.Unit;
import aDL_Moddeling_Project.DataRepresentation.DataTypes.UnitTypeContainer;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.UnitImpl#getBasedatatype <em>Basedatatype</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.UnitImpl#getUnitSymbol <em>Unit Symbol</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.UnitImpl#getUnittypecontainer <em>Unittypecontainer</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.DataRepresentation.DataTypes.impl.UnitImpl#getRange <em>Range</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnitImpl extends DataTypeSpecificationImpl implements Unit {
	/**
	 * The cached value of the '{@link #getBasedatatype() <em>Basedatatype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasedatatype()
	 * @generated
	 * @ordered
	 */
	protected BaseDataType basedatatype;

	/**
	 * The default value of the '{@link #getUnitSymbol() <em>Unit Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitSymbol()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_SYMBOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnitSymbol() <em>Unit Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitSymbol()
	 * @generated
	 * @ordered
	 */
	protected String unitSymbol = UNIT_SYMBOL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected Range range;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataTypesPackage.Literals.UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseDataType getBasedatatype() {
		if (basedatatype != null && basedatatype.eIsProxy()) {
			InternalEObject oldBasedatatype = (InternalEObject)basedatatype;
			basedatatype = (BaseDataType)eResolveProxy(oldBasedatatype);
			if (basedatatype != oldBasedatatype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataTypesPackage.UNIT__BASEDATATYPE, oldBasedatatype, basedatatype));
			}
		}
		return basedatatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseDataType basicGetBasedatatype() {
		return basedatatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasedatatype(BaseDataType newBasedatatype) {
		BaseDataType oldBasedatatype = basedatatype;
		basedatatype = newBasedatatype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.UNIT__BASEDATATYPE, oldBasedatatype, basedatatype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnitSymbol() {
		return unitSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitSymbol(String newUnitSymbol) {
		String oldUnitSymbol = unitSymbol;
		unitSymbol = newUnitSymbol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.UNIT__UNIT_SYMBOL, oldUnitSymbol, unitSymbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitTypeContainer getUnittypecontainer() {
		if (eContainerFeatureID() != DataTypesPackage.UNIT__UNITTYPECONTAINER) return null;
		return (UnitTypeContainer)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnittypecontainer(UnitTypeContainer newUnittypecontainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUnittypecontainer, DataTypesPackage.UNIT__UNITTYPECONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnittypecontainer(UnitTypeContainer newUnittypecontainer) {
		if (newUnittypecontainer != eInternalContainer() || (eContainerFeatureID() != DataTypesPackage.UNIT__UNITTYPECONTAINER && newUnittypecontainer != null)) {
			if (EcoreUtil.isAncestor(this, newUnittypecontainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newUnittypecontainer != null)
				msgs = ((InternalEObject)newUnittypecontainer).eInverseAdd(this, DataTypesPackage.UNIT_TYPE_CONTAINER__UNIT, UnitTypeContainer.class, msgs);
			msgs = basicSetUnittypecontainer(newUnittypecontainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.UNIT__UNITTYPECONTAINER, newUnittypecontainer, newUnittypecontainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range getRange() {
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRange(Range newRange, NotificationChain msgs) {
		Range oldRange = range;
		range = newRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.UNIT__RANGE, oldRange, newRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRange(Range newRange) {
		if (newRange != range) {
			NotificationChain msgs = null;
			if (range != null)
				msgs = ((InternalEObject)range).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.UNIT__RANGE, null, msgs);
			if (newRange != null)
				msgs = ((InternalEObject)newRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.UNIT__RANGE, null, msgs);
			msgs = basicSetRange(newRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.UNIT__RANGE, newRange, newRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataTypesPackage.UNIT__UNITTYPECONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetUnittypecontainer((UnitTypeContainer)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataTypesPackage.UNIT__UNITTYPECONTAINER:
				return basicSetUnittypecontainer(null, msgs);
			case DataTypesPackage.UNIT__RANGE:
				return basicSetRange(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case DataTypesPackage.UNIT__UNITTYPECONTAINER:
				return eInternalContainer().eInverseRemove(this, DataTypesPackage.UNIT_TYPE_CONTAINER__UNIT, UnitTypeContainer.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataTypesPackage.UNIT__BASEDATATYPE:
				if (resolve) return getBasedatatype();
				return basicGetBasedatatype();
			case DataTypesPackage.UNIT__UNIT_SYMBOL:
				return getUnitSymbol();
			case DataTypesPackage.UNIT__UNITTYPECONTAINER:
				return getUnittypecontainer();
			case DataTypesPackage.UNIT__RANGE:
				return getRange();
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
			case DataTypesPackage.UNIT__BASEDATATYPE:
				setBasedatatype((BaseDataType)newValue);
				return;
			case DataTypesPackage.UNIT__UNIT_SYMBOL:
				setUnitSymbol((String)newValue);
				return;
			case DataTypesPackage.UNIT__UNITTYPECONTAINER:
				setUnittypecontainer((UnitTypeContainer)newValue);
				return;
			case DataTypesPackage.UNIT__RANGE:
				setRange((Range)newValue);
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
			case DataTypesPackage.UNIT__BASEDATATYPE:
				setBasedatatype((BaseDataType)null);
				return;
			case DataTypesPackage.UNIT__UNIT_SYMBOL:
				setUnitSymbol(UNIT_SYMBOL_EDEFAULT);
				return;
			case DataTypesPackage.UNIT__UNITTYPECONTAINER:
				setUnittypecontainer((UnitTypeContainer)null);
				return;
			case DataTypesPackage.UNIT__RANGE:
				setRange((Range)null);
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
			case DataTypesPackage.UNIT__BASEDATATYPE:
				return basedatatype != null;
			case DataTypesPackage.UNIT__UNIT_SYMBOL:
				return UNIT_SYMBOL_EDEFAULT == null ? unitSymbol != null : !UNIT_SYMBOL_EDEFAULT.equals(unitSymbol);
			case DataTypesPackage.UNIT__UNITTYPECONTAINER:
				return getUnittypecontainer() != null;
			case DataTypesPackage.UNIT__RANGE:
				return range != null;
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
		result.append(" (unitSymbol: ");
		result.append(unitSymbol);
		result.append(')');
		return result.toString();
	}

} //UnitImpl
