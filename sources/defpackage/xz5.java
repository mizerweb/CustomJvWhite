package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class xz5 {
    public static final xz5 a;
    public static final xz5 b;
    public static final /* synthetic */ xz5[] c;

    static {
        xz5 xz5Var = new xz5("CHAT", 0);
        a = xz5Var;
        xz5 xz5Var2 = new xz5("STORIES", 1);
        b = xz5Var2;
        c = new xz5[]{xz5Var, xz5Var2};
    }

    public static xz5 valueOf(String str) {
        return (xz5) Enum.valueOf(xz5.class, str);
    }

    public static xz5[] values() {
        return (xz5[]) c.clone();
    }
}
