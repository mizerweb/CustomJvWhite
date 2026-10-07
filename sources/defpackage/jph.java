package defpackage;

import android.util.LruCache;

/* JADX INFO: loaded from: classes.dex */
public final class jph {
    public static final LruCache a = new LruCache(2);

    public static void a(hm0 hm0Var, oph ophVar) {
        if (hm0Var == null) {
            return;
        }
        gm0.n("ThemeBackgroundCache", "Save theme " + hm0Var + " to cache.");
        a.put(hm0Var, ophVar);
    }
}
