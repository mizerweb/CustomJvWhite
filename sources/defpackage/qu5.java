package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class qu5 {
    public static final qu5 a;
    public static final qu5 b;
    public static final /* synthetic */ qu5[] c;

    static {
        qu5 qu5Var = new qu5("LINE", 0);
        a = qu5Var;
        qu5 qu5Var2 = new qu5("ARROW", 1);
        b = qu5Var2;
        c = new qu5[]{qu5Var, qu5Var2};
    }

    public static qu5 valueOf(String str) {
        return (qu5) Enum.valueOf(qu5.class, str);
    }

    public static qu5[] values() {
        return (qu5[]) c.clone();
    }
}
