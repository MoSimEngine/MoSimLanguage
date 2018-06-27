/**
 */
package aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl;

import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationDefinitionRepository;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdaptationDescription;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.AdapterServicesPackage;
import aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.DataMarker;

import aDL_Moddeling_Project.basic.impl.EntityImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adaptation Definition Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdaptationDefinitionRepositoryImpl#getAdaptationdescription <em>Adaptationdescription</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularEnvironment.ManagementServices.AdapterServices.impl.AdaptationDefinitionRepositoryImpl#getDatamarker <em>Datamarker</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdaptationDefinitionRepositoryImpl extends EntityImpl implements AdaptationDefinitionRepository {
	/**
	 * The cached value of the '{@link #getAdaptationdescription() <em>Adaptationdescription</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdaptationdescription()
	 * @generated
	 * @ordered
	 */
	protected EList<AdaptationDescription> adaptationdescription;

	/**
	 * The cached value of the '{@link #getDatamarker() <em>Datamarker</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatamarker()
	 * @generated
	 * @ordered
	 */
	protected EList<DataMarker> datamarker;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdaptationDefinitionRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdapterServicesPackage.Literals.ADAPTATION_DEFINITION_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdaptationDescription> getAdaptationdescription() {
		if (adaptationdescription == null) {
			adaptationdescription = new EObjectContainmentEList<AdaptationDescription>(AdaptationDescription.class, this, AdapterServicesPackage.ADAPTATION_DEFINITION_REPOSITORY__ADAPTATIONDESCRIPTION);
		}
		return adaptationdescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataMarker> getDatamarker() {
		if (datamarker == null) {
			datamarker = new EObjectContainmentEList<DataMarker>(DataMarker.class, this, AdapterServicesPackage.ADAPTATION_DEFINITION_REPOSITORY__DATAMARKER);
		}
		return datamarker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdapterServicesPackage.ADAPTATION_DEFINITION_REPOSITORY__ADAPTATIONDESCRIPTION:
				return ((InternalEList<?>)getAdaptationdescription()).basicRemove(otherEnd, msgs);
			case AdapterServicesPackage.ADAPTATION_DEFINITION_REPOSITORY__DATAMARKER:
				return ((InternalEList<?>)getDatamarker()).basicRemove(otherEnd, msgs);
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
			case AdapterServicesPackage.ADAPTATION_DEFINITION_REPOSITORY__ADAPTATIONDESCRIPTION:
				return getAdaptationdescription();
			case AdapterServicesPackage.ADAPTATION_DEFINITION_REPOSITORY__DATAMARKER:
				return getDatamarker();
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
			case AdapterServicesPackage.ADAPTATION_DEFINITION_REPOSITORY__ADAPTATIONDESCRIPTION:
				getAdaptationdescription().clear();
				getAdaptationdescription().addAll((Collection<? extends AdaptationDescription>)newValue);
				return;
			case AdapterServicesPackage.ADAPTATION_DEFINITION_REPOSITORY__DATAMARKER:
				getDatamarker().clear();
				getDatamarker().addAll((Collection<? extends DataMarker>)newValue);
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
			case AdapterServicesPackage.ADAPTATION_DEFINITION_REPOSITORY__ADAPTATIONDESCRIPTION:
				getAdaptationdescription().clear();
				return;
			case AdapterServicesPackage.ADAPTATION_DEFINITION_REPOSITORY__DATAMARKER:
				getDatamarker().clear();
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
			case AdapterServicesPackage.ADAPTATION_DEFINITION_REPOSITORY__ADAPTATIONDESCRIPTION:
				return adaptationdescription != null && !adaptationdescription.isEmpty();
			case AdapterServicesPackage.ADAPTATION_DEFINITION_REPOSITORY__DATAMARKER:
				return datamarker != null && !datamarker.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AdaptationDefinitionRepositoryImpl
