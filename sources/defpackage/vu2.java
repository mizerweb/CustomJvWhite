package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class vu2 {
    public static final vu2 a;
    public static final vu2 b;
    public static final vu2 c;
    public static final vu2 d;
    public static final vu2 e;
    public static final /* synthetic */ vu2[] f;

    static {
        vu2 vu2Var = new vu2("NONE", 0);
        a = vu2Var;
        vu2 vu2Var2 = new vu2("IN_PROGRESS", 1);
        b = vu2Var2;
        vu2 vu2Var3 = new vu2("SENT", 2);
        c = vu2Var3;
        vu2 vu2Var4 = new vu2("READ", 3);
        d = vu2Var4;
        vu2 vu2Var5 = new vu2("ERROR", 4);
        e = vu2Var5;
        f = new vu2[]{vu2Var, vu2Var2, vu2Var3, vu2Var4, vu2Var5};
    }

    public static vu2 valueOf(String str) {
        return (vu2) Enum.valueOf(vu2.class, str);
    }

    public static vu2[] values() {
        return (vu2[]) f.clone();
    }
}
