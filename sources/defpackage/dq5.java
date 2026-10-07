package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class dq5 {
    public static final dq5 a;
    public static final dq5 b;
    public static final dq5 c;
    public static final dq5 d;
    public static final dq5 e;
    public static final dq5 f;
    public static final /* synthetic */ dq5[] g;
    public static final /* synthetic */ ma6 h;

    static {
        dq5 dq5Var = new dq5("SHARE_VIDEO", 0);
        a = dq5Var;
        dq5 dq5Var2 = new dq5("DOWNLOAD_VIDEO", 1);
        b = dq5Var2;
        dq5 dq5Var3 = new dq5("SHARE_PHOTO", 2);
        c = dq5Var3;
        dq5 dq5Var4 = new dq5("DOWNLOAD_PHOTO", 3);
        dq5 dq5Var5 = new dq5("SHARE_GIF", 4);
        d = dq5Var5;
        dq5 dq5Var6 = new dq5("DOWNLOAD_GIF", 5);
        e = dq5Var6;
        dq5 dq5Var7 = new dq5("SHARE_FILE", 6);
        f = dq5Var7;
        dq5[] dq5VarArr = {dq5Var, dq5Var2, dq5Var3, dq5Var4, dq5Var5, dq5Var6, dq5Var7};
        g = dq5VarArr;
        h = new ma6(dq5VarArr);
    }

    public static dq5 valueOf(String str) {
        return (dq5) Enum.valueOf(dq5.class, str);
    }

    public static dq5[] values() {
        return (dq5[]) g.clone();
    }
}
