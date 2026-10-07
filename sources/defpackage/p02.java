package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class p02 {
    public static final p02 a;
    public static final p02 b;
    public static final p02 c;
    public static final p02 d;
    public static final /* synthetic */ p02[] e;
    public static final /* synthetic */ ma6 f;

    static {
        p02 p02Var = new p02("CALL", 0);
        a = p02Var;
        p02 p02Var2 = new p02("STOP", 1);
        b = p02Var2;
        p02 p02Var3 = new p02("UPDATE_ACTIVE_NOTIFICATION", 2);
        p02 p02Var4 = new p02("RESTART_FOREGROUND", 3);
        c = p02Var4;
        p02 p02Var5 = new p02("UPDATE_INCOMING_NOTIFICATION", 4);
        p02 p02Var6 = new p02("RESTART_FOREGROUND_SCREENSHARING", 5);
        d = p02Var6;
        p02[] p02VarArr = {p02Var, p02Var2, p02Var3, p02Var4, p02Var5, p02Var6};
        e = p02VarArr;
        f = new ma6(p02VarArr);
    }

    public static p02 valueOf(String str) {
        return (p02) Enum.valueOf(p02.class, str);
    }

    public static p02[] values() {
        return (p02[]) e.clone();
    }
}
