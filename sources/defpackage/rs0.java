package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class rs0 {
    public static final rs0 a;
    public static final rs0 b;
    public static final /* synthetic */ rs0[] c;

    static {
        rs0 rs0Var = new rs0("SQUARE", 0);
        a = rs0Var;
        rs0 rs0Var2 = new rs0("ORIGINAL", 1);
        b = rs0Var2;
        c = new rs0[]{rs0Var, rs0Var2};
    }

    public static rs0 valueOf(String str) {
        return (rs0) Enum.valueOf(rs0.class, str);
    }

    public static rs0[] values() {
        return (rs0[]) c.clone();
    }
}
