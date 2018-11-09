/**
 */
package at.ac.tuwien.big.roverml.provider;


import at.ac.tuwien.big.roverml.RoverMLFactory;
import at.ac.tuwien.big.roverml.RoverMLPackage;
import at.ac.tuwien.big.roverml.Sensor;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link at.ac.tuwien.big.roverml.Sensor} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SensorItemProvider extends ComponentItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(RoverMLPackage.Literals.SENSOR__LAST_SENSED_VALUE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Sensor<?>)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Sensor_type") :
			getString("_UI_Sensor_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Sensor.class)) {
			case RoverMLPackage.SENSOR__LAST_SENSED_VALUE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(RoverMLPackage.Literals.SENSOR__LAST_SENSED_VALUE,
				 RoverMLFactory.eINSTANCE.createRoverProgram()));

		newChildDescriptors.add
			(createChildParameter
				(RoverMLPackage.Literals.SENSOR__LAST_SENSED_VALUE,
				 RoverMLFactory.eINSTANCE.createMove()));

		newChildDescriptors.add
			(createChildParameter
				(RoverMLPackage.Literals.SENSOR__LAST_SENSED_VALUE,
				 RoverMLFactory.eINSTANCE.createSetLightColor()));

		newChildDescriptors.add
			(createChildParameter
				(RoverMLPackage.Literals.SENSOR__LAST_SENSED_VALUE,
				 RoverMLFactory.eINSTANCE.createRotate()));

		newChildDescriptors.add
			(createChildParameter
				(RoverMLPackage.Literals.SENSOR__LAST_SENSED_VALUE,
				 RoverMLFactory.eINSTANCE.createWait()));

		newChildDescriptors.add
			(createChildParameter
				(RoverMLPackage.Literals.SENSOR__LAST_SENSED_VALUE,
				 RoverMLFactory.eINSTANCE.createRepeat()));

		newChildDescriptors.add
			(createChildParameter
				(RoverMLPackage.Literals.SENSOR__LAST_SENSED_VALUE,
				 RoverMLFactory.eINSTANCE.createRover()));

		newChildDescriptors.add
			(createChildParameter
				(RoverMLPackage.Literals.SENSOR__LAST_SENSED_VALUE,
				 RoverMLFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add
			(createChildParameter
				(RoverMLPackage.Literals.SENSOR__LAST_SENSED_VALUE,
				 RoverMLFactory.eINSTANCE.createTransition()));

		newChildDescriptors.add
			(createChildParameter
				(RoverMLPackage.Literals.SENSOR__LAST_SENSED_VALUE,
				 RoverMLFactory.eINSTANCE.createGPS()));

		newChildDescriptors.add
			(createChildParameter
				(RoverMLPackage.Literals.SENSOR__LAST_SENSED_VALUE,
				 RoverMLFactory.eINSTANCE.createDistanceSensor()));

		newChildDescriptors.add
			(createChildParameter
				(RoverMLPackage.Literals.SENSOR__LAST_SENSED_VALUE,
				 RoverMLFactory.eINSTANCE.createCompass()));

		newChildDescriptors.add
			(createChildParameter
				(RoverMLPackage.Literals.SENSOR__LAST_SENSED_VALUE,
				 RoverMLFactory.eINSTANCE.createTime()));

		newChildDescriptors.add
			(createChildParameter
				(RoverMLPackage.Literals.SENSOR__LAST_SENSED_VALUE,
				 RoverMLFactory.eINSTANCE.createAngle()));

		newChildDescriptors.add
			(createChildParameter
				(RoverMLPackage.Literals.SENSOR__LAST_SENSED_VALUE,
				 RoverMLFactory.eINSTANCE.createVelocity()));

		newChildDescriptors.add
			(createChildParameter
				(RoverMLPackage.Literals.SENSOR__LAST_SENSED_VALUE,
				 RoverMLFactory.eINSTANCE.createLight()));

		newChildDescriptors.add
			(createChildParameter
				(RoverMLPackage.Literals.SENSOR__LAST_SENSED_VALUE,
				 RoverMLFactory.eINSTANCE.createLength()));

		newChildDescriptors.add
			(createChildParameter
				(RoverMLPackage.Literals.SENSOR__LAST_SENSED_VALUE,
				 RoverMLFactory.eINSTANCE.createMotor()));

		newChildDescriptors.add
			(createChildParameter
				(RoverMLPackage.Literals.SENSOR__LAST_SENSED_VALUE,
				 RoverMLFactory.eINSTANCE.createTerminate()));

		newChildDescriptors.add
			(createChildParameter
				(RoverMLPackage.Literals.SENSOR__LAST_SENSED_VALUE,
				 RoverMLFactory.eINSTANCE.createRoverSystem()));

		newChildDescriptors.add
			(createChildParameter
				(RoverMLPackage.Literals.SENSOR__LAST_SENSED_VALUE,
				 RoverMLFactory.eINSTANCE.createDistanceSensorTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(RoverMLPackage.Literals.SENSOR__LAST_SENSED_VALUE,
				 RoverMLFactory.eINSTANCE.createGpsTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(RoverMLPackage.Literals.SENSOR__LAST_SENSED_VALUE,
				 RoverMLFactory.eINSTANCE.createCompassTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(RoverMLPackage.Literals.SENSOR__LAST_SENSED_VALUE,
				 RoverMLFactory.eINSTANCE.createPosition()));
	}

}
