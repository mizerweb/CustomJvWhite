package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class wr4 {
    public static final wr4 a;
    public static final wr4 b;
    public static final wr4 c;
    public static final wr4 d;
    public static final /* synthetic */ wr4[] e;

    static {
        wr4 wr4Var = new wr4("TEMPORARY_VISIBLE", 0);
        a = wr4Var;
        wr4 wr4Var2 = new wr4("HIDDEN", 1);
        b = wr4Var2;
        wr4 wr4Var3 = new wr4("PLAY_HIDDEN", 2);
        c = wr4Var3;
        wr4 wr4Var4 = new wr4("PERMANENTLY_VISIBLE", 3);
        d = wr4Var4;
        e = new wr4[]{wr4Var, wr4Var2, wr4Var3, wr4Var4};
    }

    public static wr4 valueOf(String str) {
        return (wr4) Enum.valueOf(wr4.class, str);
    }

    public static wr4[] values() {
        return (wr4[]) e.clone();
    }
}
