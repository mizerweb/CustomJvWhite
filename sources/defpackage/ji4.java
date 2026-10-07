package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ji4 {
    public static final ji4 a;
    public static final ji4 b;
    public static final /* synthetic */ ji4[] c;

    static {
        ji4 ji4Var = new ji4("USER_LIST", 0);
        a = ji4Var;
        ji4 ji4Var2 = new ji4("EXTERNAL", 1);
        b = ji4Var2;
        c = new ji4[]{ji4Var, ji4Var2};
    }

    public static ji4 valueOf(String str) {
        return (ji4) Enum.valueOf(ji4.class, str);
    }

    public static ji4[] values() {
        return (ji4[]) c.clone();
    }
}
