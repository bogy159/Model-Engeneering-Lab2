/**
 */
package at.ac.tuwien.big.roverml.provider;

import at.ac.tuwien.big.roverml.util.RoverMLAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RoverMLItemProviderAdapterFactory extends RoverMLAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoverMLItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.tuwien.big.roverml.RoverProgram} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoverProgramItemProvider roverProgramItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.tuwien.big.roverml.RoverProgram}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRoverProgramAdapter() {
		if (roverProgramItemProvider == null) {
			roverProgramItemProvider = new RoverProgramItemProvider(this);
		}

		return roverProgramItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.tuwien.big.roverml.Move} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MoveItemProvider moveItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.tuwien.big.roverml.Move}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMoveAdapter() {
		if (moveItemProvider == null) {
			moveItemProvider = new MoveItemProvider(this);
		}

		return moveItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.tuwien.big.roverml.SetLightColor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetLightColorItemProvider setLightColorItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.tuwien.big.roverml.SetLightColor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSetLightColorAdapter() {
		if (setLightColorItemProvider == null) {
			setLightColorItemProvider = new SetLightColorItemProvider(this);
		}

		return setLightColorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.tuwien.big.roverml.Rotate} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RotateItemProvider rotateItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.tuwien.big.roverml.Rotate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRotateAdapter() {
		if (rotateItemProvider == null) {
			rotateItemProvider = new RotateItemProvider(this);
		}

		return rotateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.tuwien.big.roverml.Wait} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WaitItemProvider waitItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.tuwien.big.roverml.Wait}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWaitAdapter() {
		if (waitItemProvider == null) {
			waitItemProvider = new WaitItemProvider(this);
		}

		return waitItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.tuwien.big.roverml.Repeat} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepeatItemProvider repeatItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.tuwien.big.roverml.Repeat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRepeatAdapter() {
		if (repeatItemProvider == null) {
			repeatItemProvider = new RepeatItemProvider(this);
		}

		return repeatItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.tuwien.big.roverml.Rover} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoverItemProvider roverItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.tuwien.big.roverml.Rover}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRoverAdapter() {
		if (roverItemProvider == null) {
			roverItemProvider = new RoverItemProvider(this);
		}

		return roverItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.tuwien.big.roverml.Block} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockItemProvider blockItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.tuwien.big.roverml.Block}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBlockAdapter() {
		if (blockItemProvider == null) {
			blockItemProvider = new BlockItemProvider(this);
		}

		return blockItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.tuwien.big.roverml.Transition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionItemProvider transitionItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.tuwien.big.roverml.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTransitionAdapter() {
		if (transitionItemProvider == null) {
			transitionItemProvider = new TransitionItemProvider(this);
		}

		return transitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.tuwien.big.roverml.GPS} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GPSItemProvider gpsItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.tuwien.big.roverml.GPS}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGPSAdapter() {
		if (gpsItemProvider == null) {
			gpsItemProvider = new GPSItemProvider(this);
		}

		return gpsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.tuwien.big.roverml.DistanceSensor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DistanceSensorItemProvider distanceSensorItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.tuwien.big.roverml.DistanceSensor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDistanceSensorAdapter() {
		if (distanceSensorItemProvider == null) {
			distanceSensorItemProvider = new DistanceSensorItemProvider(this);
		}

		return distanceSensorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.tuwien.big.roverml.Compass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompassItemProvider compassItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.tuwien.big.roverml.Compass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompassAdapter() {
		if (compassItemProvider == null) {
			compassItemProvider = new CompassItemProvider(this);
		}

		return compassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.tuwien.big.roverml.Time} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeItemProvider timeItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.tuwien.big.roverml.Time}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTimeAdapter() {
		if (timeItemProvider == null) {
			timeItemProvider = new TimeItemProvider(this);
		}

		return timeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.tuwien.big.roverml.Angle} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AngleItemProvider angleItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.tuwien.big.roverml.Angle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAngleAdapter() {
		if (angleItemProvider == null) {
			angleItemProvider = new AngleItemProvider(this);
		}

		return angleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.tuwien.big.roverml.Velocity} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VelocityItemProvider velocityItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.tuwien.big.roverml.Velocity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVelocityAdapter() {
		if (velocityItemProvider == null) {
			velocityItemProvider = new VelocityItemProvider(this);
		}

		return velocityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.tuwien.big.roverml.Position} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PositionItemProvider positionItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.tuwien.big.roverml.Position}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPositionAdapter() {
		if (positionItemProvider == null) {
			positionItemProvider = new PositionItemProvider(this);
		}

		return positionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.tuwien.big.roverml.Light} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LightItemProvider lightItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.tuwien.big.roverml.Light}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLightAdapter() {
		if (lightItemProvider == null) {
			lightItemProvider = new LightItemProvider(this);
		}

		return lightItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.tuwien.big.roverml.Length} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LengthItemProvider lengthItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.tuwien.big.roverml.Length}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLengthAdapter() {
		if (lengthItemProvider == null) {
			lengthItemProvider = new LengthItemProvider(this);
		}

		return lengthItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.tuwien.big.roverml.Motor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MotorItemProvider motorItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.tuwien.big.roverml.Motor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMotorAdapter() {
		if (motorItemProvider == null) {
			motorItemProvider = new MotorItemProvider(this);
		}

		return motorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.tuwien.big.roverml.Terminate} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminateItemProvider terminateItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.tuwien.big.roverml.Terminate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTerminateAdapter() {
		if (terminateItemProvider == null) {
			terminateItemProvider = new TerminateItemProvider(this);
		}

		return terminateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.tuwien.big.roverml.RoverSystem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoverSystemItemProvider roverSystemItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.tuwien.big.roverml.RoverSystem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRoverSystemAdapter() {
		if (roverSystemItemProvider == null) {
			roverSystemItemProvider = new RoverSystemItemProvider(this);
		}

		return roverSystemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.tuwien.big.roverml.DistanceSensorTrigger} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DistanceSensorTriggerItemProvider distanceSensorTriggerItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.tuwien.big.roverml.DistanceSensorTrigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDistanceSensorTriggerAdapter() {
		if (distanceSensorTriggerItemProvider == null) {
			distanceSensorTriggerItemProvider = new DistanceSensorTriggerItemProvider(this);
		}

		return distanceSensorTriggerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.tuwien.big.roverml.GpsTrigger} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GpsTriggerItemProvider gpsTriggerItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.tuwien.big.roverml.GpsTrigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGpsTriggerAdapter() {
		if (gpsTriggerItemProvider == null) {
			gpsTriggerItemProvider = new GpsTriggerItemProvider(this);
		}

		return gpsTriggerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link at.ac.tuwien.big.roverml.CompassTrigger} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompassTriggerItemProvider compassTriggerItemProvider;

	/**
	 * This creates an adapter for a {@link at.ac.tuwien.big.roverml.CompassTrigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompassTriggerAdapter() {
		if (compassTriggerItemProvider == null) {
			compassTriggerItemProvider = new CompassTriggerItemProvider(this);
		}

		return compassTriggerItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (roverProgramItemProvider != null) roverProgramItemProvider.dispose();
		if (moveItemProvider != null) moveItemProvider.dispose();
		if (setLightColorItemProvider != null) setLightColorItemProvider.dispose();
		if (rotateItemProvider != null) rotateItemProvider.dispose();
		if (waitItemProvider != null) waitItemProvider.dispose();
		if (repeatItemProvider != null) repeatItemProvider.dispose();
		if (roverItemProvider != null) roverItemProvider.dispose();
		if (blockItemProvider != null) blockItemProvider.dispose();
		if (transitionItemProvider != null) transitionItemProvider.dispose();
		if (gpsItemProvider != null) gpsItemProvider.dispose();
		if (distanceSensorItemProvider != null) distanceSensorItemProvider.dispose();
		if (compassItemProvider != null) compassItemProvider.dispose();
		if (timeItemProvider != null) timeItemProvider.dispose();
		if (angleItemProvider != null) angleItemProvider.dispose();
		if (velocityItemProvider != null) velocityItemProvider.dispose();
		if (lightItemProvider != null) lightItemProvider.dispose();
		if (lengthItemProvider != null) lengthItemProvider.dispose();
		if (motorItemProvider != null) motorItemProvider.dispose();
		if (terminateItemProvider != null) terminateItemProvider.dispose();
		if (roverSystemItemProvider != null) roverSystemItemProvider.dispose();
		if (distanceSensorTriggerItemProvider != null) distanceSensorTriggerItemProvider.dispose();
		if (gpsTriggerItemProvider != null) gpsTriggerItemProvider.dispose();
		if (compassTriggerItemProvider != null) compassTriggerItemProvider.dispose();
		if (positionItemProvider != null) positionItemProvider.dispose();
	}

}
