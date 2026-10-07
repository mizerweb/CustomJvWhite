package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class iw6 {
    public static final iw6 a;
    public static final iw6 b;
    public static final iw6 c;
    public static final iw6 d;
    public static final /* synthetic */ iw6[] e;

    /* JADX INFO: Fake field, exist only in values array */
    iw6 EF0;

    static {
        iw6 iw6Var = new iw6("FIRST_FRAME_DECODED", 0);
        iw6 iw6Var2 = new iw6("FIRST_FRAME_RENDERED", 1);
        a = iw6Var2;
        iw6 iw6Var3 = new iw6("PLAYING", 2);
        b = iw6Var3;
        iw6 iw6Var4 = new iw6("READY", 3);
        c = iw6Var4;
        iw6 iw6Var5 = new iw6("PLAY", 4);
        d = iw6Var5;
        e = new iw6[]{iw6Var, iw6Var2, iw6Var3, iw6Var4, iw6Var5};
    }

    public static iw6 valueOf(String str) {
        return (iw6) Enum.valueOf(iw6.class, str);
    }

    public static iw6[] values() {
        return (iw6[]) e.clone();
    }
}
