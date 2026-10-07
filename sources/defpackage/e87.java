package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class e87 {
    public static final e87 a;
    public static final e87 b;
    public static final e87 c;
    public static final e87 d;
    public static final e87 e;
    public static final e87 f;
    public static final /* synthetic */ e87[] g;

    static {
        e87 e87Var = new e87("FORMAT_HANDLED", 0);
        a = e87Var;
        e87 e87Var2 = new e87("FORMAT_EXCEEDS_CAPABILITIES", 1);
        b = e87Var2;
        e87 e87Var3 = new e87("FORMAT_UNSUPPORTED_DRM", 2);
        c = e87Var3;
        e87 e87Var4 = new e87("FORMAT_UNSUPPORTED_SUBTYPE", 3);
        d = e87Var4;
        e87 e87Var5 = new e87("FORMAT_UNSUPPORTED_TYPE", 4);
        e = e87Var5;
        e87 e87Var6 = new e87("UNKNOWN", 5);
        f = e87Var6;
        g = new e87[]{e87Var, e87Var2, e87Var3, e87Var4, e87Var5, e87Var6};
    }

    public static e87 valueOf(String str) {
        return (e87) Enum.valueOf(e87.class, str);
    }

    public static e87[] values() {
        return (e87[]) g.clone();
    }
}
