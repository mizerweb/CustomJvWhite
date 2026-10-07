package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class qc3 {
    public static final qc3 a;
    public static final qc3 b;
    public static final qc3 c;
    public static final qc3 d;
    public static final /* synthetic */ qc3[] e;
    public static final /* synthetic */ ma6 f;

    static {
        qc3 qc3Var = new qc3("HIDDEN", 0);
        a = qc3Var;
        qc3 qc3Var2 = new qc3("HIDE_IN_PROCESS", 1);
        b = qc3Var2;
        qc3 qc3Var3 = new qc3("SHOW_HALF", 2);
        c = qc3Var3;
        qc3 qc3Var4 = new qc3("SHOW_FULL", 3);
        d = qc3Var4;
        qc3[] qc3VarArr = {qc3Var, qc3Var2, qc3Var3, qc3Var4};
        e = qc3VarArr;
        f = new ma6(qc3VarArr);
    }

    public static qc3 valueOf(String str) {
        return (qc3) Enum.valueOf(qc3.class, str);
    }

    public static qc3[] values() {
        return (qc3[]) e.clone();
    }
}
