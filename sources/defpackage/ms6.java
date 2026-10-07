package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ms6 {
    public static final ms6 a;
    public static final ms6 b;
    public static final ms6 c;
    public static final ms6 d;
    public static final /* synthetic */ ms6[] e;

    static {
        ms6 ms6Var = new ms6("PresentArrow", 0);
        a = ms6Var;
        ms6 ms6Var2 = new ms6("ArrowToProgress", 1);
        b = ms6Var2;
        ms6 ms6Var3 = new ms6("ProgressToArrow", 2);
        c = ms6Var3;
        ms6 ms6Var4 = new ms6("ProgressSpinning", 3);
        d = ms6Var4;
        e = new ms6[]{ms6Var, ms6Var2, ms6Var3, ms6Var4};
    }

    public static ms6 valueOf(String str) {
        return (ms6) Enum.valueOf(ms6.class, str);
    }

    public static ms6[] values() {
        return (ms6[]) e.clone();
    }
}
