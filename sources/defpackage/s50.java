package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class s50 {
    public static final s50 a;
    public static final s50 b;
    public static final /* synthetic */ s50[] c;

    static {
        s50 s50Var = new s50("Media", 0);
        a = s50Var;
        s50 s50Var2 = new s50("Files", 1);
        b = s50Var2;
        c = new s50[]{s50Var, s50Var2};
    }

    public static s50 valueOf(String str) {
        return (s50) Enum.valueOf(s50.class, str);
    }

    public static s50[] values() {
        return (s50[]) c.clone();
    }
}
