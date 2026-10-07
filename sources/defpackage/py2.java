package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class py2 {
    public static final py2 a;
    public static final py2 b;
    public static final py2 c;
    public static final py2 d;
    public static final /* synthetic */ py2[] e;

    static {
        py2 py2Var = new py2("ACCEPT_ALL", 0);
        a = py2Var;
        py2 py2Var2 = new py2("FORWARDABLE", 1);
        b = py2Var2;
        py2 py2Var3 = new py2("ADDABLE", 2);
        c = py2Var3;
        py2 py2Var4 = new py2("INVITABLE", 3);
        d = py2Var4;
        e = new py2[]{py2Var, py2Var2, py2Var3, py2Var4};
    }

    public static py2 valueOf(String str) {
        return (py2) Enum.valueOf(py2.class, str);
    }

    public static py2[] values() {
        return (py2[]) e.clone();
    }
}
