package org.openhab.binding.zwave;

import java.util.List;
import java.util.Set;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.openhab.binding.zwave.internal.ZWaveProduct;
import org.openhab.binding.zwave.internal.protocol.ZWaveNode;
import org.openhab.core.config.core.ConfigDescription;
import org.openhab.core.config.core.ConfigDescriptionProvider;
import org.openhab.core.config.core.ConfigOptionProvider;
import org.openhab.core.thing.ThingTypeUID;
import org.openhab.core.thing.type.ThingType;


@NonNullByDefault
public interface ZWaveConfigProvider extends ConfigDescriptionProvider, ConfigOptionProvider { // TODO: (Nad) Header + JavaDocs

    List<ZWaveProduct> getProductIndex();

    Set<ThingTypeUID> getSupportedThingTypes();

    @Nullable
    ThingType getThingType(ThingTypeUID thingTypeUID);

    @Nullable
    ThingType getThingType(ZWaveNode node);

    /**
     * Gets the configuration parameters for a ZWave Thing. If the thing contains no configuration, it will return null.
     *
     * @param type the {@link ThingType} required to retrieve the configuration
     * @return the {@link ConfigDescription}
     */
    @Nullable
    ConfigDescription getThingTypeConfig(ThingType type);
}