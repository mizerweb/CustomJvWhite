package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class cl4 {
    public static final cl4 a;
    public static final cl4 b;
    public static final cl4 c;
    public static final /* synthetic */ cl4[] d;

    static {
        cl4 cl4Var = new cl4("CALL", 0);
        a = cl4Var;
        cl4 cl4Var2 = new cl4("SETTINGS", 1);
        b = cl4Var2;
        cl4 cl4Var3 = new cl4("CONTACT", 2);
        c = cl4Var3;
        d = new cl4[]{cl4Var, cl4Var2, cl4Var3};
    }

    public static cl4 valueOf(String str) {
        return (cl4) Enum.valueOf(cl4.class, str);
    }

    public static cl4[] values() {
        return (cl4[]) d.clone();
    }
}
