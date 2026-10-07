package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class v73 {
    public static final v73 a;
    public static final v73 b;
    public static final v73 c;
    public static final v73 d;
    public static final v73 e;
    public static final /* synthetic */ v73[] f;
    public static final /* synthetic */ ma6 g;

    static {
        v73 v73Var = new v73("NONE", 0);
        a = v73Var;
        v73 v73Var2 = new v73("IN_PROGRESS", 1);
        b = v73Var2;
        v73 v73Var3 = new v73("SENT", 2);
        c = v73Var3;
        v73 v73Var4 = new v73("READ", 3);
        d = v73Var4;
        v73 v73Var5 = new v73("ERROR", 4);
        e = v73Var5;
        v73[] v73VarArr = {v73Var, v73Var2, v73Var3, v73Var4, v73Var5};
        f = v73VarArr;
        g = new ma6(v73VarArr);
    }

    public static v73 valueOf(String str) {
        return (v73) Enum.valueOf(v73.class, str);
    }

    public static v73[] values() {
        return (v73[]) f.clone();
    }
}
