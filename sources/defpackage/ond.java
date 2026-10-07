package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ond extends f83 {
    public static final ond c;
    public static final m65 d;
    public static final m65 e;
    public static final m65 f;
    public static final m65 g;
    public static final m65 h;

    static {
        ond ondVar = new ond(2);
        c = ondVar;
        d = f83.d(ondVar, ":profile/edit", new String[]{"id", "type"}, null, 14);
        e = f83.d(ondVar, ":profile/member_permissions", new String[]{"id"}, null, 14);
        f = f83.d(ondVar, ":profile/edit/link", new String[]{"id", "type", "flow"}, null, 14);
        g = f83.d(ondVar, ":profile/edit/admin_permission", new String[]{"chat_id", "contact_id", "permissions_type"}, null, 14);
        h = f83.d(ondVar, ":profile/edit/reactions", new String[]{"id"}, null, 14);
    }
}
