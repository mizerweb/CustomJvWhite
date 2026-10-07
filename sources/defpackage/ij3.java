package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ij3 {
    public static final ij3 a;
    public static final ij3 b;
    public static final ij3 c;
    public static final ij3 d;
    public static final ij3 e;
    public static final /* synthetic */ ij3[] f;

    static {
        ij3 ij3Var = new ij3("LOADING", 0);
        a = ij3Var;
        ij3 ij3Var2 = new ij3("LOADING_NEXT_PAGE", 1);
        b = ij3Var2;
        ij3 ij3Var3 = new ij3("IDLE_SEARCH", 2);
        c = ij3Var3;
        ij3 ij3Var4 = new ij3("SEARCH_RESULT", 3);
        d = ij3Var4;
        ij3 ij3Var5 = new ij3("EMPTY_SEARCH_RESULT", 4);
        e = ij3Var5;
        f = new ij3[]{ij3Var, ij3Var2, ij3Var3, ij3Var4, ij3Var5};
    }

    public static ij3 valueOf(String str) {
        return (ij3) Enum.valueOf(ij3.class, str);
    }

    public static ij3[] values() {
        return (ij3[]) f.clone();
    }
}
