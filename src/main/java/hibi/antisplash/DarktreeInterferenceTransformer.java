package hibi.antisplash;

import nilloader.api.lib.mini.MiniTransformer;
import nilloader.api.lib.mini.PatchContext;
import nilloader.api.lib.mini.annotation.Patch;

@Patch.Class("net.darktree.interference.MessageInjector")
public class DarktreeInterferenceTransformer extends MiniTransformer {
	
	@Patch.Method.Optional
	@Patch.Method.AffectsControlFlow
	@Patch.Methods({
		@Patch.Method("inject(Ljava/lang/String;)V"),
		@Patch.Method("injectPlain(Ljava/lang/String;)V"),
		@Patch.Method("consume(Ljava/util/function/Consumer;)V")
	})
	public void patchInjections(PatchContext ctx) {
		ctx.jumpToStart();
		ctx.add(RETURN());
	}
}
