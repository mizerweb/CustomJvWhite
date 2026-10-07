package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kg1 extends f83 {
    public static final kg1 c;
    public static final m65 d;
    public static final m65 e;
    public static final m65 f;
    public static final m65 g;
    public static final m65 h;
    public static final m65 i;
    public static final m65 j;
    public static final m65 k;
    public static final m65 l;
    public static final m65 m;
    public static final m65 n;
    public static final m65 o;
    public static final m65 p;

    static {
        kg1 kg1Var = new kg1(2);
        c = kg1Var;
        f65 f65Var = gp0.h;
        d = f83.c(kg1Var, ":call-user", new String[]{"opponent_id"}, f65Var, 10);
        e = f83.c(kg1Var, ":call-join-link", new String[]{"link"}, f65Var, 10);
        f = f83.c(kg1Var, ":call-chat", new String[]{"chat_id"}, f65Var, 10);
        g = f83.d(kg1Var, ":call-incoming", new String[]{"chat_id", "call_name"}, null, 14);
        h = f83.d(kg1Var, ":call-active", new String[0], null, 14);
        i = f83.d(kg1Var, ":call-join-preview", new String[]{"link"}, null, 14);
        j = f83.d(kg1Var, ":call-opponents-list", new String[0], null, 14);
        k = f83.d(kg1Var, ":call-admin-settings", new String[0], null, 14);
        l = f83.d(kg1Var, ":call-debug-menu", new String[0], null, 14);
        m = f83.d(kg1Var, ":call-pip", new String[0], null, 14);
        n = f83.d(kg1Var, ":call-admin-waiting-room", new String[0], null, 14);
        o = f83.d(kg1Var, ":call-rate", new String[]{"call_id", "is_group", "is_video"}, null, 14);
        p = f83.d(kg1Var, ":unknown-call", new String[]{"call_id", "caller_id"}, null, 14);
    }
}
