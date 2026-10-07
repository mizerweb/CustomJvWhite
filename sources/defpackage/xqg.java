package defpackage;

import org.apache.http.cookie.ClientCookie;

/* JADX INFO: loaded from: classes.dex */
public final class xqg extends f83 {
    public static final xqg c;
    public static final m65 d;
    public static final m65 e;
    public static final m65 f;

    static {
        xqg xqgVar = new xqg(2);
        c = xqgVar;
        d = f83.d(xqgVar, ":stories/publish", new String[]{ClientCookie.PATH_ATTR}, null, 14);
        e = f83.d(xqgVar, ":stories/edit-privacy", new String[]{"story_id", "settings"}, null, 14);
        f = f83.d(xqgVar, ":story/editor", new String[0], null, 14);
    }
}
