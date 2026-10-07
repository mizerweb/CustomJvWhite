package defpackage;

import android.util.LruCache;

/* JADX INFO: loaded from: classes3.dex */
public final class tui {
    public static final LruCache d = new LruCache(1000);
    public final String a = tui.class.getName();
    public final ny8 b;
    public final ny8 c;

    public tui(ny8 ny8Var, ny8 ny8Var2) {
        this.b = ny8Var;
        this.c = ny8Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ea, code lost:
    
        if (((java.lang.Boolean) r10).booleanValue() != false) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.rui a(java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tui.a(java.lang.String):rui");
    }

    public final void b(String str, rui ruiVar) {
        d.put(str, new sui(ruiVar, ((s7f) ((et3) this.c.getValue())).f()));
    }
}
