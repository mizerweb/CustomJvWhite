package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class la2 {
    public static final la2 a;
    public static final la2 b;
    public static final la2 c;
    public static final /* synthetic */ la2[] d;

    static {
        la2 la2Var = new la2("OUTGOING", 0);
        a = la2Var;
        la2 la2Var2 = new la2("INCOMING", 1);
        b = la2Var2;
        la2 la2Var3 = new la2("GROUP", 2);
        c = la2Var3;
        d = new la2[]{la2Var, la2Var2, la2Var3};
    }

    public static la2 valueOf(String str) {
        return (la2) Enum.valueOf(la2.class, str);
    }

    public static la2[] values() {
        return (la2[]) d.clone();
    }
}
