package defpackage;

import android.util.LruCache;

/* JADX INFO: loaded from: classes3.dex */
public final class kn7 implements rba {
    @Override // defpackage.rba
    public final void a(int i) {
        if (i == 2 || i == 4) {
            LruCache lruCache = jph.a;
            gm0.n("ThemeBackgroundCache", "clear cache of themes.");
            jph.a.evictAll();
        }
        l76.a.i(-1);
    }
}
