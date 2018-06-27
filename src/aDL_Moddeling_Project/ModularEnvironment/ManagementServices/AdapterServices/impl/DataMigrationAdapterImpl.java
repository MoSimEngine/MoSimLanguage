/**
 */
package aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationSpecification;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterServicesPackage;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.DataMigrationAdapter;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Migration Adapter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.DataMigrationAdapterImpl#getAdaptationspecification <em>Adaptationspecification</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DataMigrationAdapterImpl extends AdapterServiceImpl implements DataMigrationAdapter {
	/**
	 * The cached value of the '{@link #getAdaptationspecification() <em>Adaptationspecification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdaptationspecification()
	 * @generated
	 * @ordered
	 */
	protected EList<AdaptationSpecification> adaptationspecification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataMigrationAdapterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdapterServicesPackage.Literals.DATA_MIGRATION_ADAPTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdaptationSpecification> getAdaptationspecification() {
		if (adaptationspecification == null) {
			adaptationspecification = new EObjectContainmentEList<AdaptationSpecification>(AdaptationSpecification.class, this, AdapterServicesPackage.DATA_MIGRATION_ADAPTER__ADAPTATIONSPECIFICATION);
		}
		return adaptationspecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdapterServicesPackage.DATA_MIGRATION_ADAPTER__ADAPTATIONSPECIFICATION:
				return ((InternalEList<?>)getAdaptationspecification()).basicRemove(otherEnd, msgs);
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
			case AdapterServicesPackage.DATA_MIGRATION_ADAPTER__ADAPTATIONSPECIFICATION:
				return getAdaptationspecification();
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
			case AdapterServicesPackage.DATA_MIGRATION_ADAPTER__ADAPTATIONSPECIFICATION:
				getAdaptationspecification().clear();
				getAdaptationspecification().addAll((Collection<? extends AdaptationSpecification>)newValue);
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
			case AdapterServicesPackage.DATA_MIGRATION_ADAPTER__ADAPTATIONSPECIFICATION:
				getAdaptationspecification().clear();
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
			case AdapterServicesPackage.DATA_MIGRATION_ADAPTER__ADAPTATIONSPECIFICATION:
				return adaptationspecification != null && !adaptationspecification.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataMigrationAdapterImpl
