/**
 */
package aDL_Moddeling_Project.UnstructuredDataView.Unstructured_DataRepository.impl;

import aDL_Moddeling_Project.UnstructuredDataView.Unstructured_DataRepository.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Unstructured_DataRepositoryFactoryImpl extends EFactoryImpl implements Unstructured_DataRepositoryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Unstructured_DataRepositoryFactory init() {
		try {
			Unstructured_DataRepositoryFactory theUnstructured_DataRepositoryFactory = (Unstructured_DataRepositoryFactory)EPackage.Registry.INSTANCE.getEFactory(Unstructured_DataRepositoryPackage.eNS_URI);
			if (theUnstructured_DataRepositoryFactory != null) {
				return theUnstructured_DataRepositoryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Unstructured_DataRepositoryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unstructured_DataRepositoryFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Unstructured_DataRepositoryPackage.UNSTRUCTURED_VIEW_SIMULATION_DATA: return createUnstructuredViewSimulationData();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnstructuredViewSimulationData createUnstructuredViewSimulationData() {
		UnstructuredViewSimulationDataImpl unstructuredViewSimulationData = new UnstructuredViewSimulationDataImpl();
		return unstructuredViewSimulationData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unstructured_DataRepositoryPackage getUnstructured_DataRepositoryPackage() {
		return (Unstructured_DataRepositoryPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Unstructured_DataRepositoryPackage getPackage() {
		return Unstructured_DataRepositoryPackage.eINSTANCE;
	}

} //Unstructured_DataRepositoryFactoryImpl
