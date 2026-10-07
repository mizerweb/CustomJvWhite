package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public interface pd2 extends n8e {
    public static final bh0 P = new bh0("camerax.core.camera.useCaseConfigFactory", fmi.class, null);
    public static final bh0 Q = new bh0("camerax.core.camera.useCaseCombinationRequiredRule", Integer.class, null);
    public static final bh0 R = new bh0("camerax.core.camera.SessionProcessor", vmf.class, null);
    public static final bh0 S = new bh0("camerax.core.camera.isPostviewSupported", Boolean.class, null);
    public static final bh0 T = new bh0("camerax.core.camera.isCaptureProcessProgressSupported", Boolean.class, null);

    default void s() {
        if (b(R, null) == null) {
            return;
        }
        ore.m();
    }
}
