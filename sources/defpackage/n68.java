package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public interface n68 extends n8e {
    public static final bh0 s0;
    public static final bh0 t0;
    public static final bh0 u0;

    static {
        Class cls = Integer.TYPE;
        s0 = new bh0("camerax.core.imageInput.inputFormat", cls, null);
        t0 = new bh0("camerax.core.imageInput.secondaryInputFormat", cls, null);
        u0 = new bh0("camerax.core.imageInput.inputDynamicRange", fx5.class, null);
    }

    default fx5 B() {
        fx5 fx5Var = (fx5) b(u0, fx5.c);
        fx5Var.getClass();
        return fx5Var;
    }

    default int getInputFormat() {
        return ((Integer) i(s0)).intValue();
    }
}
