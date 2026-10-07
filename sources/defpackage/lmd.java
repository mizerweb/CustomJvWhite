package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lmd extends f83 {
    public static final lmd c;
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

    static {
        lmd lmdVar = new lmd(2);
        c = lmdVar;
        d = f83.d(lmdVar, ":profile/avatars", new String[]{"id", "type"}, null, 14);
        e = f83.d(lmdVar, ":profile", new String[]{"id", "type"}, null, 14);
        f = f83.d(lmdVar, ":profile/attaches", new String[]{"id"}, null, 14);
        g = f83.d(lmdVar, ":profile/members", new String[]{"id", "type"}, null, 14);
        h = f83.d(lmdVar, ":profile/join-requests", new String[]{"id"}, null, 14);
        i = f83.d(lmdVar, ":profile/comments-black-list", new String[]{"id"}, null, 14);
        j = f83.d(lmdVar, ":profile/invite", new String[]{"id"}, null, 14);
        k = f83.d(lmdVar, ":profile/add-admins", new String[]{"chat_id"}, null, 14);
        l = f83.d(lmdVar, ":profile/add-members", new String[]{"chat_id", "is_chat"}, null, 14);
        m = f83.d(lmdVar, ":profile/change-owner", new String[]{"chat_id"}, null, 14);
    }
}
