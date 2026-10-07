package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class y48 implements cmi, v68, gqh {
    public static final bh0 b = new bh0("camerax.core.imageAnalysis.backpressureStrategy", q48.class, null);
    public static final bh0 c = new bh0("camerax.core.imageAnalysis.imageQueueDepth", Integer.TYPE, null);
    public static final bh0 d = new bh0("camerax.core.imageAnalysis.imageReaderProxyProvider", p78.class, null);
    public static final bh0 e = new bh0("camerax.core.imageAnalysis.outputImageFormat", t48.class, null);
    public static final bh0 f = new bh0("camerax.core.imageAnalysis.onePixelShiftEnabled", Boolean.class, null);
    public static final bh0 g = new bh0("camerax.core.imageAnalysis.outputImageRotationEnabled", Boolean.class, null);
    public final dhc a;

    public y48(dhc dhcVar) {
        this.a = dhcVar;
    }

    @Override // defpackage.n8e
    public final t94 getConfig() {
        return this.a;
    }

    @Override // defpackage.n68
    public final int getInputFormat() {
        return 35;
    }
}
