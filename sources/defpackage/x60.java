package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class x60 {
    public static final x60 a;
    public static final x60 b;
    public static final x60 c;
    public static final x60 d;
    public static final x60 e;
    public static final /* synthetic */ x60[] f;

    static {
        x60 x60Var = new x60("UNKNOWN", 0);
        a = x60Var;
        x60 x60Var2 = new x60("PROCESSING", 1);
        b = x60Var2;
        x60 x60Var3 = new x60("SUCCESS", 2);
        c = x60Var3;
        x60 x60Var4 = new x60("MEDIA_NOT_READY", 3);
        d = x60Var4;
        x60 x60Var5 = new x60("FAILED", 4);
        e = x60Var5;
        f = new x60[]{x60Var, x60Var2, x60Var3, x60Var4, x60Var5};
    }

    public static x60 valueOf(String str) {
        return (x60) Enum.valueOf(x60.class, str);
    }

    public static x60[] values() {
        return (x60[]) f.clone();
    }
}
