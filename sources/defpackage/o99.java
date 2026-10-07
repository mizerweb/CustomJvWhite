package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class o99 {
    public static final o99 a;
    public static final o99 b;
    public static final o99 c;
    public static final /* synthetic */ o99[] d;

    static {
        o99 o99Var = new o99("NEED_INFO", 0);
        a = o99Var;
        o99 o99Var2 = new o99("ACTIVE", 1);
        b = o99Var2;
        o99 o99Var3 = new o99("STOPPED", 2);
        c = o99Var3;
        d = new o99[]{o99Var, o99Var2, o99Var3};
    }

    public static o99 valueOf(String str) {
        return (o99) Enum.valueOf(o99.class, str);
    }

    public static o99[] values() {
        return (o99[]) d.clone();
    }
}
