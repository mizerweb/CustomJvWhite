package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class kq2 {
    public static final kq2 a;
    public static final kq2 b;
    public static final /* synthetic */ kq2[] c;
    public static final /* synthetic */ ma6 d;

    static {
        kq2 kq2Var = new kq2("PUBLIC", 0);
        a = kq2Var;
        kq2 kq2Var2 = new kq2("PRIVATE", 1);
        b = kq2Var2;
        kq2[] kq2VarArr = {kq2Var, kq2Var2};
        c = kq2VarArr;
        d = new ma6(kq2VarArr);
    }

    public static kq2 valueOf(String str) {
        return (kq2) Enum.valueOf(kq2.class, str);
    }

    public static kq2[] values() {
        return (kq2[]) c.clone();
    }
}
