package zhbh;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.minecraft.resources.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ZhbhMod implements ModInitializer {
	public static final String MOD_ID = "zhbh";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("ZHBH initializing");

		ServerLifecycleEvents.SERVER_STARTED.register(server -> {
			int advancements = server.getAdvancements().getAllAdvancements().size();
			LOGGER.info("ZHBH ready: {} advancements loaded", advancements);
		});
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
