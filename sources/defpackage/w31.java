package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class w31 {
    public static final w31 a;
    public static final w31 b;
    public static final /* synthetic */ w31[] c;

    static {
        w31 w31Var = new w31("ACTIVE", 0);
        a = w31Var;
        w31 w31Var2 = new w31("INACTIVE", 1);
        b = w31Var2;
        c = new w31[]{w31Var, w31Var2};
    }

    public static w31 valueOf(String str) {
        return (w31) Enum.valueOf(w31.class, str);
    }

    public static w31[] values() {
        return (w31[]) c.clone();
    }
}
