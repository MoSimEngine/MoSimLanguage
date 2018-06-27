/**
 */
package aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl;

import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnhancedData;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AdditionEnhancedOperation;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.AssemblyAdditionEnhancementPackage;
import aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.UnstructuredEnhancedInformation;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unstructured Enhanced Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.UnstructuredEnhancedInformationImpl#getAdditionenhancedoperation <em>Additionenhancedoperation</em>}</li>
 *   <li>{@link aDL_Moddeling_Project.ModularSimulationAssembly.AssemblyAdditionEnhancement.impl.UnstructuredEnhancedInformationImpl#getAdditionenhanceddata <em>Additionenhanceddata</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnstructuredEnhancedInformationImpl extends AdditionEnhancedInformationImpl implements UnstructuredEnhancedInformation {
	/**
	 * The cached value of the '{@link #getAdditionenhancedoperation() <em>Additionenhancedoperation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionenhancedoperation()
	 * @generated
	 * @ordered
	 */
	protected EList<AdditionEnhancedOperation> additionenhancedoperation;

	/**
	 * The cached value of the '{@link #getAdditionenhanceddata() <em>Additionenhanceddata</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionenhanceddata()
	 * @generated
	 * @ordered
	 */
	protected EList<AdditionEnhancedData> additionenhanceddata;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnstructuredEnhancedInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssemblyAdditionEnhancementPackage.Literals.UNSTRUCTURED_ENHANCED_INFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdditionEnhancedOperation> getAdditionenhancedoperation() {
		if (additionenhancedoperation == null) {
			additionenhancedoperation = new EObjectContainmentEList<AdditionEnhancedOperation>(AdditionEnhancedOperation.class, this, AssemblyAdditionEnhancementPackage.UNSTRUCTURED_ENHANCED_INFORMATION__ADDITIONENHANCEDOPERATION);
		}
		return additionenhancedoperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdditionEnhancedData> getAdditionenhanceddata() {
		if (additionenhanceddata == null) {
			additionenhanceddata = new EObjectContainmentEList<AdditionEnhancedData>(AdditionEnhancedData.class, this, AssemblyAdditionEnhancementPackage.UNSTRUCTURED_ENHANCED_INFORMATION__ADDITIONENHANCEDDATA);
		}
		return additionenhanceddata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssemblyAdditionEnhancementPackage.UNSTRUCTURED_ENHANCED_INFORMATION__ADDITIONENHANCEDOPERATION:
				return ((InternalEList<?>)getAdditionenhancedoperation()).basicRemove(otherEnd, msgs);
			case AssemblyAdditionEnhancementPackage.UNSTRUCTURED_ENHANCED_INFORMATION__ADDITIONENHANCEDDATA:
				return ((InternalEList<?>)getAdditionenhanceddata()).basicRemove(otherEnd, msgs);
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
			case AssemblyAdditionEnhancementPackage.UNSTRUCTURED_ENHANCED_INFORMATION__ADDITIONENHANCEDOPERATION:
				return getAdditionenhancedoperation();
			case AssemblyAdditionEnhancementPackage.UNSTRUCTURED_ENHANCED_INFORMATION__ADDITIONENHANCEDDATA:
				return getAdditionenhanceddata();
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
			case AssemblyAdditionEnhancementPackage.UNSTRUCTURED_ENHANCED_INFORMATION__ADDITIONENHANCEDOPERATION:
				getAdditionenhancedoperation().clear();
				getAdditionenhancedoperation().addAll((Collection<? extends AdditionEnhancedOperation>)newValue);
				return;
			case AssemblyAdditionEnhancementPackage.UNSTRUCTURED_ENHANCED_INFORMATION__ADDITIONENHANCEDDATA:
				getAdditionenhanceddata().clear();
				getAdditionenhanceddata().addAll((Collection<? extends AdditionEnhancedData>)newValue);
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
			case AssemblyAdditionEnhancementPackage.UNSTRUCTURED_ENHANCED_INFORMATION__ADDITIONENHANCEDOPERATION:
				getAdditionenhancedoperation().clear();
				return;
			case AssemblyAdditionEnhancementPackage.UNSTRUCTURED_ENHANCED_INFORMATION__ADDITIONENHANCEDDATA:
				getAdditionenhanceddata().clear();
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
			case AssemblyAdditionEnhancementPackage.UNSTRUCTURED_ENHANCED_INFORMATION__ADDITIONENHANCEDOPERATION:
				return additionenhancedoperation != null && !additionenhancedoperation.isEmpty();
			case AssemblyAdditionEnhancementPackage.UNSTRUCTURED_ENHANCED_INFORMATION__ADDITIONENHANCEDDATA:
				return additionenhanceddata != null && !additionenhanceddata.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UnstructuredEnhancedInformationImpl
