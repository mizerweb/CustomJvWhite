package defpackage;

import org.apache.http.util.VersionInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class gi6 {
    public static final gi6 a;
    public static final gi6 b;
    public static final gi6 c;
    public static final gi6 d;
    public static final gi6 e;
    public static final gi6 f;
    public static final gi6 g;
    public static final gi6 h;
    public static final gi6 i;
    public static final gi6 j;
    public static final gi6 k;
    public static final gi6 l;
    public static final gi6 m;
    public static final gi6 n;
    public static final gi6 o;
    public static final gi6 p;
    public static final gi6 q;
    public static final /* synthetic */ gi6[] r;

    static {
        gi6 gi6Var = new gi6(VersionInfo.UNAVAILABLE, 0);
        a = gi6Var;
        gi6 gi6Var2 = new gi6("BUSY", 1);
        b = gi6Var2;
        gi6 gi6Var3 = new gi6("PRIVACY", 2);
        c = gi6Var3;
        gi6 gi6Var4 = new gi6("FAILED", 3);
        d = gi6Var4;
        gi6 gi6Var5 = new gi6("CONNECTION_ERROR", 4);
        e = gi6Var5;
        gi6 gi6Var6 = new gi6("OPPONENT_NO_NETWORK", 5);
        f = gi6Var6;
        gi6 gi6Var7 = new gi6("REMOVE_FROM_CALL", 6);
        g = gi6Var7;
        gi6 gi6Var8 = new gi6("REMOVE_FROM_WAITING_ROOM", 7);
        h = gi6Var8;
        gi6 gi6Var9 = new gi6("TARGET_USER_NOT_IN_CHAT", 8);
        i = gi6Var9;
        gi6 gi6Var10 = new gi6("CALL_WAIT_ADMIN", 9);
        j = gi6Var10;
        gi6 gi6Var11 = new gi6("USER_RESTRICTED_CALL", 10);
        k = gi6Var11;
        gi6 gi6Var12 = new gi6("PARTICIPANTS_LIMIT", 11);
        l = gi6Var12;
        gi6 gi6Var13 = new gi6("REJECT_CALL", 12);
        m = gi6Var13;
        gi6 gi6Var14 = new gi6("FAILED_JOIN", 13);
        n = gi6Var14;
        gi6 gi6Var15 = new gi6("SERVICE_UNAVAILABLE", 14);
        o = gi6Var15;
        gi6 gi6Var16 = new gi6("PHONE_RECALL", 15);
        p = gi6Var16;
        gi6 gi6Var17 = new gi6("IOS_RESTRICTION", 16);
        q = gi6Var17;
        r = new gi6[]{gi6Var, gi6Var2, gi6Var3, gi6Var4, gi6Var5, gi6Var6, gi6Var7, gi6Var8, gi6Var9, gi6Var10, gi6Var11, gi6Var12, gi6Var13, gi6Var14, gi6Var15, gi6Var16, gi6Var17};
    }

    public static gi6 valueOf(String str) {
        return (gi6) Enum.valueOf(gi6.class, str);
    }

    public static gi6[] values() {
        return (gi6[]) r.clone();
    }
}
