package hibi.antisplash;

import nilloader.api.lib.mini.MiniTransformer;
import nilloader.api.lib.mini.PatchContext;
import nilloader.api.lib.mini.annotation.Patch;

@Patch.Class("com.unascribed.lib39.ripple.api.SplashTextRegistry")
public class UnascribedLib39Transformer extends MiniTransformer {

	@Patch.Method.Optional
	@Patch.Method.AffectsControlFlow
	@Patch.Methods({
		@Patch.Method("registerStatic(Ljava/lang/String;)V"),
		@Patch.Method("registerStatic([Ljava/lang/String;)V"),
		@Patch.Method("registerTemporal(Ljava/lang/String;Ljava/time/MonthDay;)V"),
		@Patch.Method("registerDynamic(Ljava/util/function/Supplier;)V"),
		@Patch.Method("remove(Ljava/lang/String;)V"),
		@Patch.Method("replace(Ljava/lang/String;Ljava/lang/String;)V")
	})
	public void patchRegistering(PatchContext ctx) {
		ctx.jumpToStart();
		ctx.add(RETURN());
	}
}
