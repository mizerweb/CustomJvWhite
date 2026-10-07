package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class a68 implements cmi, v68, vm8 {
    public static final bh0 b;
    public static final bh0 c;
    public static final bh0 d;
    public static final bh0 e;
    public static final bh0 f;
    public static final bh0 g;
    public static final bh0 h;
    public static final bh0 i;
    public static final bh0 j;
    public static final bh0 k;
    public static final bh0 l;
    public final dhc a;

    static {
        Class cls = Integer.TYPE;
        b = new bh0("camerax.core.imageCapture.captureMode", cls, null);
        c = new bh0("camerax.core.imageCapture.flashMode", cls, null);
        d = new bh0("camerax.core.imageCapture.captureBundle", gl2.class, null);
        e = new bh0("camerax.core.imageCapture.bufferFormat", Integer.class, null);
        f = new bh0("camerax.core.imageCapture.outputFormat", Integer.class, null);
        g = new bh0("camerax.core.imageCapture.imageReaderProxyProvider", p78.class, null);
        h = new bh0("camerax.core.imageCapture.useSoftwareJpegEncoder", Boolean.TYPE, null);
        i = new bh0("camerax.core.imageCapture.flashType", cls, null);
        j = new bh0("camerax.core.imageCapture.jpegCompressionQuality", cls, null);
        k = new bh0("camerax.core.imageCapture.screenFlash", x58.class, null);
        l = new bh0("camerax.core.useCase.isPostviewEnabled", Boolean.class, null);
    }

    public a68(dhc dhcVar) {
        this.a = dhcVar;
    }

    @Override // defpackage.n8e
    public final t94 getConfig() {
        return this.a;
    }

    @Override // defpackage.n68
    public final int getInputFormat() {
        return ((Integer) i(n68.s0)).intValue();
    }
}
