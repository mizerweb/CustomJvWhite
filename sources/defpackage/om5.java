package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class om5 {
    public static final om5 a;
    public static final om5 b;
    public static final om5 c;
    public static final om5 d;
    public static final om5 e;
    public static final om5 f;
    public static final om5 g;
    public static final om5 h;
    public static final om5 i;
    public static final om5 j;
    public static final om5 k;
    public static final om5 l;
    public static final /* synthetic */ om5[] m;

    static {
        om5 om5Var = new om5("CONNECT_CANCELED", 0);
        a = om5Var;
        om5 om5Var2 = new om5("DNS_ERROR", 1);
        b = om5Var2;
        om5 om5Var3 = new om5("CONNECT_ERROR", 2);
        c = om5Var3;
        om5 om5Var4 = new om5("SOCKET_ERROR", 3);
        d = om5Var4;
        om5 om5Var5 = new om5("CONNECT_UNKNOWN_ERROR", 4);
        e = om5Var5;
        om5 om5Var6 = new om5("SESSION_TIMEOUT", 5);
        f = om5Var6;
        om5 om5Var7 = new om5("SEND_IO_ERROR", 6);
        g = om5Var7;
        om5 om5Var8 = new om5("READ_IO_ERROR", 7);
        h = om5Var8;
        om5 om5Var9 = new om5("SERVER_STATE_ERROR", 8);
        i = om5Var9;
        om5 om5Var10 = new om5("LOGOUT", 9);
        j = om5Var10;
        om5 om5Var11 = new om5("USER_DISCONNECT", 10);
        om5 om5Var12 = new om5("SESSION_CLOSED", 11);
        k = om5Var12;
        om5 om5Var13 = new om5("UNKNOWN", 12);
        l = om5Var13;
        m = new om5[]{om5Var, om5Var2, om5Var3, om5Var4, om5Var5, om5Var6, om5Var7, om5Var8, om5Var9, om5Var10, om5Var11, om5Var12, om5Var13};
    }

    public static om5 valueOf(String str) {
        return (om5) Enum.valueOf(om5.class, str);
    }

    public static om5[] values() {
        return (om5[]) m.clone();
    }
}
