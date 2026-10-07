package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ih2 {
    public static final ih2 a;
    public static final ih2 b;
    public static final ih2 c;
    public static final ih2 d;
    public static final ih2 e;
    public static final /* synthetic */ ih2[] f;

    static {
        ih2 ih2Var = new ih2("PENDING_OPEN", 0);
        a = ih2Var;
        ih2 ih2Var2 = new ih2("OPENING", 1);
        b = ih2Var2;
        ih2 ih2Var3 = new ih2("OPEN", 2);
        c = ih2Var3;
        ih2 ih2Var4 = new ih2("CLOSING", 3);
        d = ih2Var4;
        ih2 ih2Var5 = new ih2("CLOSED", 4);
        e = ih2Var5;
        f = new ih2[]{ih2Var, ih2Var2, ih2Var3, ih2Var4, ih2Var5};
    }

    public static ih2 valueOf(String str) {
        return (ih2) Enum.valueOf(ih2.class, str);
    }

    public static ih2[] values() {
        return (ih2[]) f.clone();
    }
}
