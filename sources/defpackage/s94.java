package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class s94 {
    public static final s94 a;
    public static final s94 b;
    public static final s94 c;
    public static final s94 d;
    public static final /* synthetic */ s94[] e;

    static {
        s94 s94Var = new s94("ALWAYS_OVERRIDE", 0);
        a = s94Var;
        s94 s94Var2 = new s94("HIGH_PRIORITY_REQUIRED", 1);
        b = s94Var2;
        s94 s94Var3 = new s94("REQUIRED", 2);
        c = s94Var3;
        s94 s94Var4 = new s94("OPTIONAL", 3);
        d = s94Var4;
        e = new s94[]{s94Var, s94Var2, s94Var3, s94Var4};
    }

    public static s94 valueOf(String str) {
        return (s94) Enum.valueOf(s94.class, str);
    }

    public static s94[] values() {
        return (s94[]) e.clone();
    }
}
