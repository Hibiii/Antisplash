package hibi.antisplash;

import nilloader.api.ClassTransformer;
import nilloader.api.ModRemapper;

public class Antisplash implements Runnable {
	
	@Override
	public void run() {
		ModRemapper.setTargetMapping("default");
		ClassTransformer.register(new DarktreeInterferenceTransformer());
		ClassTransformer.register(new UnascribedLib39Transformer());
	}

}
