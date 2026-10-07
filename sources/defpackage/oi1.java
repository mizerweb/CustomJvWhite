package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class oi1 {
    public static final oi1 a;
    public static final oi1 b;
    public static final oi1 c;
    public static final oi1 d;
    public static final /* synthetic */ oi1[] e;

    static {
        oi1 oi1Var = new oi1("ADD_PARTICIPANT", 0);
        a = oi1Var;
        oi1 oi1Var2 = new oi1("RECORD", 1);
        b = oi1Var2;
        oi1 oi1Var3 = new oi1("MOVIE_SHARE", 2);
        c = oi1Var3;
        oi1 oi1Var4 = new oi1("ASR_RECORD", 3);
        d = oi1Var4;
        e = new oi1[]{oi1Var, oi1Var2, oi1Var3, oi1Var4};
    }

    public static oi1 valueOf(String str) {
        return (oi1) Enum.valueOf(oi1.class, str);
    }

    public static oi1[] values() {
        return (oi1[]) e.clone();
    }
}
