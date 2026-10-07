package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class xo6 extends Enum {
    public static final xo6 a;
    public static final /* synthetic */ xo6[] b;
    public static final /* synthetic */ ma6 c;
    xo6 EF0;

    static {
        xo6 xo6Var = new xo6("DYNAMIC_RANGE", 0);
        xo6 xo6Var2 = new xo6("FPS_RANGE", 1);
        a = xo6Var2;
        xo6[] xo6VarArr = {xo6Var, xo6Var2, new xo6("VIDEO_STABILIZATION", 2), new xo6("IMAGE_FORMAT", 3), new xo6("RECORDING_QUALITY", 4)};
        b = xo6VarArr;
        c = new ma6(xo6VarArr);
    }

    public static xo6 valueOf(String str) {
        return (xo6) Enum.valueOf(xo6.class, str);
    }

    public static xo6[] values() {
        return (xo6[]) b.clone();
    }
}
