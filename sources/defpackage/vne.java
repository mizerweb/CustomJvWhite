package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class vne {
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final String a = vne.class.getName();
    public final AtomicBoolean j = new AtomicBoolean(false);

    public vne(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8) {
        this.b = ny8Var;
        this.c = ny8Var3;
        this.d = ny8Var2;
        this.e = ny8Var4;
        this.f = ny8Var5;
        this.g = ny8Var6;
        this.h = ny8Var7;
        this.i = ny8Var8;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b4, code lost:
    
        if (defpackage.upl.a(r12, 2, r2) == r8) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(defpackage.vne r11, defpackage.nq4 r12) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vne.a(vne, nq4):java.lang.Object");
    }

    public final void b() {
        String str = this.a;
        gm0.n(str, "execute restart session");
        if (((Boolean) ((e5d) this.g.getValue()).W5.a(e5d.S6[362]).i()).booleanValue()) {
            gm0.n(str, "begin synchronous execute restart session");
            ((dme) this.f.getValue()).j().h();
            gm0.n(str, "complete synchronous execute restart session");
        } else {
            int i = 1;
            if (this.j.compareAndSet(false, true)) {
                yab.i0((ite) this.i.getValue(), null, 0, new tne(this, null, i), 3);
            } else {
                gm0.n(str, "execute already launched, skipping");
            }
        }
    }
}
