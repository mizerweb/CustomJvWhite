package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class uw2 {
    public static final uw2 a;
    public static final uw2 b;
    public static final uw2 c;
    public static final uw2 d;
    public static final /* synthetic */ uw2[] e;

    static {
        uw2 uw2Var = new uw2("TITLE", 0);
        a = uw2Var;
        uw2 uw2Var2 = new uw2("ICON", 1);
        b = uw2Var2;
        uw2 uw2Var3 = new uw2("CHANGE_PARTICIPANT", 2);
        c = uw2Var3;
        uw2 uw2Var4 = new uw2("PIN_MESSAGE", 3);
        d = uw2Var4;
        e = new uw2[]{uw2Var, uw2Var2, uw2Var3, uw2Var4};
    }

    public static uw2 valueOf(String str) {
        return (uw2) Enum.valueOf(uw2.class, str);
    }

    public static uw2[] values() {
        return (uw2[]) e.clone();
    }
}
