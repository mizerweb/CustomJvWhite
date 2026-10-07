package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ie3 {
    public static final ie3 a;
    public static final ie3 b;
    public static final ie3 c;
    public static final ie3 d;
    public static final ie3 e;
    public static final ie3 f;
    public static final ie3 g;
    public static final ie3 h;
    public static final ie3 i;
    public static final ie3 j;
    public static final /* synthetic */ ie3[] k;

    static {
        ie3 ie3Var = new ie3("UNBLOCK", 0);
        a = ie3Var;
        ie3 ie3Var2 = new ie3("PORTAL_BLOCKED", 1);
        b = ie3Var2;
        ie3 ie3Var3 = new ie3("REMOVE_CHAT", 2);
        c = ie3Var3;
        ie3 ie3Var4 = new ie3("LEAVE_CHAT", 3);
        d = ie3Var4;
        ie3 ie3Var5 = new ie3("JOIN_CHAT", 4);
        e = ie3Var5;
        ie3 ie3Var6 = new ie3("START_BOT", 5);
        f = ie3Var6;
        ie3 ie3Var7 = new ie3("POST_RESTRICTED", 6);
        g = ie3Var7;
        ie3 ie3Var8 = new ie3("UNMUTE_CHAT", 7);
        h = ie3Var8;
        ie3 ie3Var9 = new ie3("MUTE_CHAT", 8);
        i = ie3Var9;
        ie3 ie3Var10 = new ie3("SUBSCRIBE", 9);
        j = ie3Var10;
        k = new ie3[]{ie3Var, ie3Var2, ie3Var3, ie3Var4, ie3Var5, ie3Var6, ie3Var7, ie3Var8, ie3Var9, ie3Var10};
    }

    public static ie3 valueOf(String str) {
        return (ie3) Enum.valueOf(ie3.class, str);
    }

    public static ie3[] values() {
        return (ie3[]) k.clone();
    }
}
