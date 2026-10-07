package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ls6 {
    public static final ls6 a;
    public static final ls6 b;
    public static final /* synthetic */ ls6[] c;

    static {
        ls6 ls6Var = new ls6("Arrow", 0);
        a = ls6Var;
        ls6 ls6Var2 = new ls6("Progress", 1);
        b = ls6Var2;
        c = new ls6[]{ls6Var, ls6Var2};
    }

    public static ls6 valueOf(String str) {
        return (ls6) Enum.valueOf(ls6.class, str);
    }

    public static ls6[] values() {
        return (ls6[]) c.clone();
    }
}
