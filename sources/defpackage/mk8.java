package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class mk8 {
    public static final mk8 a;
    public static final mk8 b;
    public static final /* synthetic */ mk8[] c;

    static {
        mk8 mk8Var = new mk8("AUTH", 0);
        a = mk8Var;
        mk8 mk8Var2 = new mk8("SETTINGS", 1);
        b = mk8Var2;
        c = new mk8[]{mk8Var, mk8Var2};
    }

    public static mk8 valueOf(String str) {
        return (mk8) Enum.valueOf(mk8.class, str);
    }

    public static mk8[] values() {
        return (mk8[]) c.clone();
    }
}
