package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class g7i extends f83 {
    public static final g7i c;
    public static final m65 d;
    public static final m65 e;
    public static final m65 f;
    public static final m65 g;
    public static final m65 h;

    static {
        g7i g7iVar = new g7i(2);
        c = g7iVar;
        d = f83.d(g7iVar, ":settings/privacy/onboarding-twofa", new String[]{"state"}, null, 14);
        e = f83.d(g7iVar, ":settings/privacy/creation-twofa", new String[]{"track_id", "src"}, null, 14);
        f = f83.d(g7iVar, ":settings/privacy/profile-deletion", new String[0], null, 14);
        g = f83.d(g7iVar, ":twofa/password/check", new String[0], null, 14);
        h = f83.c(g7iVar, ":twofa/auth/password/check", new String[]{"track_id", "phone"}, gp0.g, 2);
    }
}
