package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sg {
    public static final sg b = new sg();
    public static final int c;
    public static final int d;
    public final rg a = new rg(0);

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        c = iAvailableProcessors + 1;
        d = (iAvailableProcessors * 2) + 1;
    }
}
