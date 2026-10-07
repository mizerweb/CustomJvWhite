package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class jb9 {
    public static final jb9 a;
    public static final jb9 b;
    public static final jb9 c;
    public static final jb9 d;
    public static final /* synthetic */ jb9[] e;

    static {
        jb9 jb9Var = new jb9("NOT_SUPPORTED", 0);
        a = jb9Var;
        jb9 jb9Var2 = new jb9("PHOTO", 1);
        b = jb9Var2;
        jb9 jb9Var3 = new jb9("GIF", 2);
        c = jb9Var3;
        jb9 jb9Var4 = new jb9("VIDEO", 3);
        d = jb9Var4;
        e = new jb9[]{jb9Var, jb9Var2, jb9Var3, jb9Var4};
    }

    public static jb9 valueOf(String str) {
        return (jb9) Enum.valueOf(jb9.class, str);
    }

    public static jb9[] values() {
        return (jb9[]) e.clone();
    }
}
