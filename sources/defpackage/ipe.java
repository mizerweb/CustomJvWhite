package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class ipe {
    public static final px8 i = new px8();
    public final d0c a;
    public final ic2 b;
    public final ljf c;
    public final jgh d;
    public final qg e;
    public final pb0 f;
    public final gg2 g;
    public final zqh h;

    public ipe(d0c d0cVar, ic2 ic2Var, ljf ljfVar, jgh jghVar, qg qgVar, pb0 pb0Var, gg2 gg2Var, zqh zqhVar) {
        this.a = d0cVar;
        this.b = ic2Var;
        this.c = ljfVar;
        this.d = jghVar;
        this.e = qgVar;
        this.f = pb0Var;
        this.g = gg2Var;
        this.h = zqhVar;
    }

    public final ll0 a(String str, gc2 gc2Var) {
        Log.d("CXCP", this + "#openAndAwaitCameraWithRetry(" + ((Object) ef2.b(str)) + ')');
        return (ll0) yab.A0(this.h.d, new xra(12, (lq4) null, (Object) this, (Object) str, (Object) gc2Var, false));
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:37:0x0119  */
    /* JADX WARN: Code duplicated, block: B:39:0x011f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0123 A[Catch: all -> 0x0053, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0053, blocks: (B:14:0x0043, B:34:0x0108, B:41:0x0123, B:44:0x012c, B:46:0x0155, B:48:0x016b, B:52:0x0179, B:54:0x0180, B:58:0x01f8, B:70:0x0229, B:62:0x0206, B:65:0x0215, B:83:0x027e, B:84:0x0281, B:22:0x006f, B:45:0x0149), top: B:93:0x002b, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x012c A[Catch: all -> 0x0053, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0053, blocks: (B:14:0x0043, B:34:0x0108, B:41:0x0123, B:44:0x012c, B:46:0x0155, B:48:0x016b, B:52:0x0179, B:54:0x0180, B:58:0x01f8, B:70:0x0229, B:62:0x0206, B:65:0x0215, B:83:0x027e, B:84:0x0281, B:22:0x006f, B:45:0x0149), top: B:93:0x002b, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x016b A[Catch: all -> 0x0053, TryCatch #1 {all -> 0x0053, blocks: (B:14:0x0043, B:34:0x0108, B:41:0x0123, B:44:0x012c, B:46:0x0155, B:48:0x016b, B:52:0x0179, B:54:0x0180, B:58:0x01f8, B:70:0x0229, B:62:0x0206, B:65:0x0215, B:83:0x027e, B:84:0x0281, B:22:0x006f, B:45:0x0149), top: B:93:0x002b, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0174  */
    /* JADX WARN: Code duplicated, block: B:53:0x017e A[PHI: r18 r19
  0x017e: PHI (r18v2 hu4) = (r18v3 hu4), (r18v4 hu4) binds: [B:52:0x0179, B:49:0x0172] A[DONT_GENERATE, DONT_INLINE]
  0x017e: PHI (r19v1 jgh) = (r19v2 jgh), (r19v3 jgh) binds: [B:52:0x0179, B:49:0x0172] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x0180 A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #1 {all -> 0x0053, blocks: (B:14:0x0043, B:34:0x0108, B:41:0x0123, B:44:0x012c, B:46:0x0155, B:48:0x016b, B:52:0x0179, B:54:0x0180, B:58:0x01f8, B:70:0x0229, B:62:0x0206, B:65:0x0215, B:83:0x027e, B:84:0x0281, B:22:0x006f, B:45:0x0149), top: B:93:0x002b, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:60:0x0200  */
    /* JADX WARN: Code duplicated, block: B:62:0x0206 A[Catch: all -> 0x0053, TryCatch #1 {all -> 0x0053, blocks: (B:14:0x0043, B:34:0x0108, B:41:0x0123, B:44:0x012c, B:46:0x0155, B:48:0x016b, B:52:0x0179, B:54:0x0180, B:58:0x01f8, B:70:0x0229, B:62:0x0206, B:65:0x0215, B:83:0x027e, B:84:0x0281, B:22:0x006f, B:45:0x0149), top: B:93:0x002b, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0214  */
    /* JADX WARN: Code duplicated, block: B:65:0x0215 A[Catch: all -> 0x0053, TryCatch #1 {all -> 0x0053, blocks: (B:14:0x0043, B:34:0x0108, B:41:0x0123, B:44:0x012c, B:46:0x0155, B:48:0x016b, B:52:0x0179, B:54:0x0180, B:58:0x01f8, B:70:0x0229, B:62:0x0206, B:65:0x0215, B:83:0x027e, B:84:0x0281, B:22:0x006f, B:45:0x0149), top: B:93:0x002b, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0221  */
    /* JADX WARN: Code duplicated, block: B:69:0x0226  */
    /* JADX WARN: Code duplicated, block: B:74:0x0245  */
    /* JADX WARN: Code duplicated, block: B:77:0x0251 A[Catch: all -> 0x026a, TRY_LEAVE, TryCatch #3 {all -> 0x026a, blocks: (B:75:0x0249, B:77:0x0251), top: B:96:0x0249 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x0245 -> B:16:0x004e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(java.lang.String r35, defpackage.gc2 r36, defpackage.cf7 r37, defpackage.nq4 r38) {
        /*
            Method dump skipped, instruction units count: 651
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ipe.b(java.lang.String, gc2, cf7, nq4):java.lang.Object");
    }
}
