package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class u60 {
    public static final u60 a;
    public static final u60 b;
    public static final u60 c;
    public static final u60 d;
    public static final u60 e;
    public static final /* synthetic */ u60[] f;

    static {
        u60 u60Var = new u60("NOT_LOADED", 0);
        a = u60Var;
        u60 u60Var2 = new u60("CANCELLED", 1);
        b = u60Var2;
        u60 u60Var3 = new u60("LOADED", 2);
        c = u60Var3;
        u60 u60Var4 = new u60("ERROR", 3);
        d = u60Var4;
        u60 u60Var5 = new u60("LOADING", 4);
        e = u60Var5;
        f = new u60[]{u60Var, u60Var2, u60Var3, u60Var4, u60Var5};
    }

    public static u60 valueOf(String str) {
        return (u60) Enum.valueOf(u60.class, str);
    }

    public static u60[] values() {
        return (u60[]) f.clone();
    }

    public final boolean a() {
        return this == b;
    }

    public final boolean h() {
        return this == c;
    }

    public final boolean i() {
        return this == e;
    }
}
