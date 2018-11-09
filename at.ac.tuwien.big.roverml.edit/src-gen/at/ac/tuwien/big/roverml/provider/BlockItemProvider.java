/**
 */
package at.ac.tuwien.big.roverml.provider;


import at.ac.tuwien.big.roverml.Block;
import at.ac.tuwien.big.roverml.RoverMLFactory;
import at.ac.tuwien.big.roverml.RoverMLPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link at.ac.tuwien.big.roverml.Block} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BlockItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(RoverMLPackage.Literals.BLOCK__COMMANDS);
			childrenFeatures.add(RoverMLPackage.Literals.BLOCK__TRANSITIONS);
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
	 * This returns Block.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Block"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Block_type");
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

		switch (notification.getFeatureID(Block.class)) {
			case RoverMLPackage.BLOCK__COMMANDS:
			case RoverMLPackage.BLOCK__TRANSITIONS:
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
				(RoverMLPackage.Literals.BLOCK__COMMANDS,
				 RoverMLFactory.eINSTANCE.createMove()));

		newChildDescriptors.add
			(createChildParameter
				(RoverMLPackage.Literals.BLOCK__COMMANDS,
				 RoverMLFactory.eINSTANCE.createSetLightColor()));

		newChildDescriptors.add
			(createChildParameter
				(RoverMLPackage.Literals.BLOCK__COMMANDS,
				 RoverMLFactory.eINSTANCE.createRotate()));

		newChildDescriptors.add
			(createChildParameter
				(RoverMLPackage.Literals.BLOCK__COMMANDS,
				 RoverMLFactory.eINSTANCE.createWait()));

		newChildDescriptors.add
			(createChildParameter
				(RoverMLPackage.Literals.BLOCK__COMMANDS,
				 RoverMLFactory.eINSTANCE.createRepeat()));

		newChildDescriptors.add
			(createChildParameter
				(RoverMLPackage.Literals.BLOCK__COMMANDS,
				 RoverMLFactory.eINSTANCE.createTerminate()));

		newChildDescriptors.add
			(createChildParameter
				(RoverMLPackage.Literals.BLOCK__TRANSITIONS,
				 RoverMLFactory.eINSTANCE.createTransition()));

		newChildDescriptors.add
			(createChildParameter
				(RoverMLPackage.Literals.BLOCK__TRANSITIONS,
				 RoverMLFactory.eINSTANCE.createDistanceSensorTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(RoverMLPackage.Literals.BLOCK__TRANSITIONS,
				 RoverMLFactory.eINSTANCE.createGpsTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(RoverMLPackage.Literals.BLOCK__TRANSITIONS,
				 RoverMLFactory.eINSTANCE.createCompassTrigger()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return RovermlEditPlugin.INSTANCE;
	}

}
