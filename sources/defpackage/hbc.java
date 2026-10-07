package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hbc implements t3d {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;

    public hbc(gu4 gu4Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, xhh xhhVar, d0j d0jVar) {
        this.a = xhhVar;
        this.b = d0jVar;
        this.c = ny8Var;
        this.d = ny8Var2;
        this.e = ny8Var3;
        this.f = ny8Var4;
        this.g = ny8Var5;
        q8e q8eVar = d0jVar.j;
        dab dabVar = new dab(q8eVar, this, 16);
        j85 j85Var = j0g.b;
        this.h = e9i.E0(dabVar, gu4Var, j85Var, 0);
        this.i = e9i.G0(new jz(q8eVar, 25), gu4Var, j85Var, Float.valueOf(0.0f));
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0119  */
    /* JADX WARN: Code duplicated, block: B:52:0x011e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0141  */
    /* JADX WARN: Code duplicated, block: B:58:0x014a  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00fc, code lost:
    
        if (r2 == r5) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(defpackage.hbc r20, defpackage.l1j r21, defpackage.nq4 r22) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hbc.d(hbc, l1j, nq4):java.lang.Object");
    }

    @Override // defpackage.t3d
    public void a() {
        e3j e3jVar = ((d0j) this.b).h;
        if (e3jVar != null) {
            e3jVar.stop();
        }
    }

    @Override // defpackage.t3d
    public void b() {
        d0j d0jVar = (d0j) this.b;
        e3j e3jVar = d0jVar.h;
        boolean z = false;
        if (e3jVar != null && e3jVar.d()) {
            z = true;
        }
        e3j e3jVar2 = d0jVar.h;
        if (z) {
            if (e3jVar2 != null) {
                e3jVar2.pause();
            }
        } else if (e3jVar2 != null) {
            e3jVar2.play();
        }
    }

    @Override // defpackage.t3d
    public i65 c() {
        l1j l1jVar = (l1j) ww3.t1(((d0j) this.b).j.a.d());
        if (l1jVar == null) {
            return null;
        }
        if (!l1jVar.a().a()) {
            return b0d.k(b0d.b, l1jVar.b(), l1jVar.c());
        }
        b0d b0dVar = b0d.b;
        long jC = l1jVar.c();
        long jB = l1jVar.b();
        b0dVar.getClass();
        return b0d.r(jB, jC);
    }

    public ix2 e() {
        return (ix2) this.i;
    }

    public ix2 f() {
        return (ix2) this.h;
    }

    public ix2 g() {
        return (ix2) this.g;
    }

    @Override // defpackage.t3d
    public void pause() {
        e3j e3jVar = ((d0j) this.b).h;
        if (e3jVar != null) {
            e3jVar.pause();
        }
    }

    public hbc(fn8 fn8Var, fn8 fn8Var2, fn8 fn8Var3, bs0 bs0Var, fn8 fn8Var4, fn8 fn8Var5, ix2 ix2Var, ix2 ix2Var2, ix2 ix2Var3) {
        this.a = fn8Var;
        this.b = fn8Var2;
        this.c = fn8Var3;
        this.d = bs0Var;
        this.e = fn8Var4;
        this.f = fn8Var5;
        this.g = ix2Var;
        this.h = ix2Var2;
        this.i = ix2Var3;
    }

    public hbc(fn8 fn8Var, fn8 fn8Var2, ix2 ix2Var, fn8 fn8Var3, fn8 fn8Var4, fn8 fn8Var5, bs0 bs0Var, bs0 bs0Var2, fn8 fn8Var6, ghb ghbVar) {
        this.a = fn8Var;
        this.b = fn8Var2;
        this.c = ix2Var;
        this.d = fn8Var3;
        this.e = fn8Var4;
        this.f = fn8Var5;
        this.g = bs0Var;
        this.h = bs0Var2;
        this.i = fn8Var6;
    }
}
