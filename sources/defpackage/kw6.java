package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class kw6 {
    public static final kw6 a;
    public static final kw6 b;
    public static final kw6 c;
    public static final /* synthetic */ kw6[] d;
    public static final /* synthetic */ ma6 e;

    /* JADX INFO: Fake field, exist only in values array */
    kw6 EF0;

    static {
        kw6 kw6Var = new kw6("FIT_XY", 0);
        kw6 kw6Var2 = new kw6("FILL", 1);
        a = kw6Var2;
        kw6 kw6Var3 = new kw6("CENTER_INSIDE", 2);
        b = kw6Var3;
        kw6 kw6Var4 = new kw6("CENTER", 3);
        c = kw6Var4;
        kw6[] kw6VarArr = {kw6Var, kw6Var2, kw6Var3, kw6Var4};
        d = kw6VarArr;
        e = new ma6(kw6VarArr);
    }

    public static kw6 valueOf(String str) {
        return (kw6) Enum.valueOf(kw6.class, str);
    }

    public static kw6[] values() {
        return (kw6[]) d.clone();
    }
}
