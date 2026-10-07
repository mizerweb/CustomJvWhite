package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class tq8 {
    public static final tq8 a;
    public static final tq8 b;
    public static final /* synthetic */ tq8[] c;

    static {
        tq8 tq8Var = new tq8("APPROVE", 0);
        a = tq8Var;
        tq8 tq8Var2 = new tq8("REJECT", 1);
        b = tq8Var2;
        c = new tq8[]{tq8Var, tq8Var2};
    }

    public static tq8 valueOf(String str) {
        return (tq8) Enum.valueOf(tq8.class, str);
    }

    public static tq8[] values() {
        return (tq8[]) c.clone();
    }
}
