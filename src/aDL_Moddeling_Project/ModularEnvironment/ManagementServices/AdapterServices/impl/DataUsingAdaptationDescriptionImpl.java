/**
 */
package aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapatationConversion;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterServicesPackage;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.DataMarker;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.DataUsingAdaptationDescription;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.singleAdaptation;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyInterface.AbstractAssemblyEntity;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Using Adaptation Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.DataUsingAdaptationDescriptionImpl#getAdapatationconversion <em>Adapatationconversion</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.DataUsingAdaptationDescriptionImpl#getFrom <em>From</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.DataUsingAdaptationDescriptionImpl#getTo <em>To</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.DataUsingAdaptationDescriptionImpl#getAbstractassemblyentity <em>Abstractassemblyentity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataUsingAdaptationDescriptionImpl extends AdaptationDescriptionImpl implements DataUsingAdaptationDescription {
	/**
	 * The cached value of the '{@link #getAdapatationconversion() <em>Adapatationconversion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdapatationconversion()
	 * @generated
	 * @ordered
	 */
	protected AdapatationConversion adapatationconversion;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected DataMarker from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected DataMarker to;

	/**
	 * The cached value of the '{@link #getAbstractassemblyentity() <em>Abstractassemblyentity</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractassemblyentity()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractAssemblyEntity> abstractassemblyentity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataUsingAdaptationDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdapterServicesPackage.Literals.DATA_USING_ADAPTATION_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdapatationConversion getAdapatationconversion() {
		return adapatationconversion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdapatationconversion(AdapatationConversion newAdapatationconversion, NotificationChain msgs) {
		AdapatationConversion oldAdapatationconversion = adapatationconversion;
		adapatationconversion = newAdapatationconversion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdapterServicesPackage.DATA_USING_ADAPTATION_DESCRIPTION__ADAPATATIONCONVERSION, oldAdapatationconversion, newAdapatationconversion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdapatationconversion(AdapatationConversion newAdapatationconversion) {
		if (newAdapatationconversion != adapatationconversion) {
			NotificationChain msgs = null;
			if (adapatationconversion != null)
				msgs = ((InternalEObject)adapatationconversion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdapterServicesPackage.DATA_USING_ADAPTATION_DESCRIPTION__ADAPATATIONCONVERSION, null, msgs);
			if (newAdapatationconversion != null)
				msgs = ((InternalEObject)newAdapatationconversion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdapterServicesPackage.DATA_USING_ADAPTATION_DESCRIPTION__ADAPATATIONCONVERSION, null, msgs);
			msgs = basicSetAdapatationconversion(newAdapatationconversion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdapterServicesPackage.DATA_USING_ADAPTATION_DESCRIPTION__ADAPATATIONCONVERSION, newAdapatationconversion, newAdapatationconversion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataMarker getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (DataMarker)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdapterServicesPackage.DATA_USING_ADAPTATION_DESCRIPTION__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataMarker basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(DataMarker newFrom) {
		DataMarker oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdapterServicesPackage.DATA_USING_ADAPTATION_DESCRIPTION__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataMarker getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (DataMarker)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdapterServicesPackage.DATA_USING_ADAPTATION_DESCRIPTION__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataMarker basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(DataMarker newTo) {
		DataMarker oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdapterServicesPackage.DATA_USING_ADAPTATION_DESCRIPTION__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractAssemblyEntity> getAbstractassemblyentity() {
		if (abstractassemblyentity == null) {
			abstractassemblyentity = new EObjectResolvingEList<AbstractAssemblyEntity>(AbstractAssemblyEntity.class, this, AdapterServicesPackage.DATA_USING_ADAPTATION_DESCRIPTION__ABSTRACTASSEMBLYENTITY);
		}
		return abstractassemblyentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdapterServicesPackage.DATA_USING_ADAPTATION_DESCRIPTION__ADAPATATIONCONVERSION:
				return basicSetAdapatationconversion(null, msgs);
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
			case AdapterServicesPackage.DATA_USING_ADAPTATION_DESCRIPTION__ADAPATATIONCONVERSION:
				return getAdapatationconversion();
			case AdapterServicesPackage.DATA_USING_ADAPTATION_DESCRIPTION__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case AdapterServicesPackage.DATA_USING_ADAPTATION_DESCRIPTION__TO:
				if (resolve) return getTo();
				return basicGetTo();
			case AdapterServicesPackage.DATA_USING_ADAPTATION_DESCRIPTION__ABSTRACTASSEMBLYENTITY:
				return getAbstractassemblyentity();
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
			case AdapterServicesPackage.DATA_USING_ADAPTATION_DESCRIPTION__ADAPATATIONCONVERSION:
				setAdapatationconversion((AdapatationConversion)newValue);
				return;
			case AdapterServicesPackage.DATA_USING_ADAPTATION_DESCRIPTION__FROM:
				setFrom((DataMarker)newValue);
				return;
			case AdapterServicesPackage.DATA_USING_ADAPTATION_DESCRIPTION__TO:
				setTo((DataMarker)newValue);
				return;
			case AdapterServicesPackage.DATA_USING_ADAPTATION_DESCRIPTION__ABSTRACTASSEMBLYENTITY:
				getAbstractassemblyentity().clear();
				getAbstractassemblyentity().addAll((Collection<? extends AbstractAssemblyEntity>)newValue);
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
			case AdapterServicesPackage.DATA_USING_ADAPTATION_DESCRIPTION__ADAPATATIONCONVERSION:
				setAdapatationconversion((AdapatationConversion)null);
				return;
			case AdapterServicesPackage.DATA_USING_ADAPTATION_DESCRIPTION__FROM:
				setFrom((DataMarker)null);
				return;
			case AdapterServicesPackage.DATA_USING_ADAPTATION_DESCRIPTION__TO:
				setTo((DataMarker)null);
				return;
			case AdapterServicesPackage.DATA_USING_ADAPTATION_DESCRIPTION__ABSTRACTASSEMBLYENTITY:
				getAbstractassemblyentity().clear();
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
			case AdapterServicesPackage.DATA_USING_ADAPTATION_DESCRIPTION__ADAPATATIONCONVERSION:
				return adapatationconversion != null;
			case AdapterServicesPackage.DATA_USING_ADAPTATION_DESCRIPTION__FROM:
				return from != null;
			case AdapterServicesPackage.DATA_USING_ADAPTATION_DESCRIPTION__TO:
				return to != null;
			case AdapterServicesPackage.DATA_USING_ADAPTATION_DESCRIPTION__ABSTRACTASSEMBLYENTITY:
				return abstractassemblyentity != null && !abstractassemblyentity.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == singleAdaptation.class) {
			switch (derivedFeatureID) {
				case AdapterServicesPackage.DATA_USING_ADAPTATION_DESCRIPTION__ADAPATATIONCONVERSION: return AdapterServicesPackage.SINGLE_ADAPTATION__ADAPATATIONCONVERSION;
				case AdapterServicesPackage.DATA_USING_ADAPTATION_DESCRIPTION__FROM: return AdapterServicesPackage.SINGLE_ADAPTATION__FROM;
				case AdapterServicesPackage.DATA_USING_ADAPTATION_DESCRIPTION__TO: return AdapterServicesPackage.SINGLE_ADAPTATION__TO;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == singleAdaptation.class) {
			switch (baseFeatureID) {
				case AdapterServicesPackage.SINGLE_ADAPTATION__ADAPATATIONCONVERSION: return AdapterServicesPackage.DATA_USING_ADAPTATION_DESCRIPTION__ADAPATATIONCONVERSION;
				case AdapterServicesPackage.SINGLE_ADAPTATION__FROM: return AdapterServicesPackage.DATA_USING_ADAPTATION_DESCRIPTION__FROM;
				case AdapterServicesPackage.SINGLE_ADAPTATION__TO: return AdapterServicesPackage.DATA_USING_ADAPTATION_DESCRIPTION__TO;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //DataUsingAdaptationDescriptionImpl
