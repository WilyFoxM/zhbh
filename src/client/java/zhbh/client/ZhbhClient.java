package zhbh.client;

import net.fabricmc.api.ClientModInitializer;
import zhbh.ZhbhMod;

public class ZhbhClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		ZhbhMod.LOGGER.info("ZHBH client initializing");
	}
}
