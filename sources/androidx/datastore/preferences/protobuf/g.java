package androidx.datastore.preferences.protobuf;

import defpackage.b1k;
import defpackage.c71;
import defpackage.l3f;
import defpackage.mci;
import defpackage.mj7;
import defpackage.o8e;
import defpackage.qt4;
import defpackage.vu3;
import defpackage.xh6;
import defpackage.zh6;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements l3f {
    public final a a;
    public final i b;
    public final zh6 c;

    public g(i iVar, zh6 zh6Var, a aVar) {
        this.b = iVar;
        zh6Var.getClass();
        this.c = zh6Var;
        this.a = aVar;
    }

    @Override // defpackage.l3f
    public final void a(Object obj) {
        ((mci) this.b).getClass();
        ((d) obj).unknownFields.e = false;
        this.c.getClass();
        qt4.A(obj);
        throw null;
    }

    @Override // defpackage.l3f
    public final int b(a aVar) {
        ((mci) this.b).getClass();
        j jVar = ((d) aVar).unknownFields;
        int i = jVar.d;
        if (i != -1) {
            return i;
        }
        int iF = 0;
        for (int i2 = 0; i2 < jVar.a; i2++) {
            int i3 = jVar.b[i2] >>> 3;
            iF += vu3.f(3, (c71) jVar.c[i2]) + vu3.n(i3) + vu3.m(2) + (vu3.m(1) * 2);
        }
        jVar.d = iF;
        return iF;
    }

    @Override // defpackage.l3f
    public final boolean c(Object obj) {
        this.c.getClass();
        qt4.A(obj);
        throw null;
    }

    @Override // defpackage.l3f
    public final void d(Object obj, o8e o8eVar, xh6 xh6Var) {
        ((mci) this.b).getClass();
        d dVar = (d) obj;
        if (dVar.unknownFields == j.f) {
            dVar.unknownFields = j.b();
        }
        this.c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.l3f
    public final Object e() {
        return ((mj7) ((d) this.a).d(5)).b();
    }

    @Override // defpackage.l3f
    public final void f(d dVar, d dVar2) {
        h.w(this.b, dVar, dVar2);
    }

    @Override // defpackage.l3f
    public final void g(Object obj, b1k b1kVar) {
        this.c.getClass();
        qt4.A(obj);
        throw null;
    }

    @Override // defpackage.l3f
    public final int h(d dVar) {
        ((mci) this.b).getClass();
        return dVar.unknownFields.hashCode();
    }

    @Override // defpackage.l3f
    public final boolean i(d dVar, d dVar2) {
        mci mciVar = (mci) this.b;
        mciVar.getClass();
        j jVar = dVar.unknownFields;
        mciVar.getClass();
        return jVar.equals(dVar2.unknownFields);
    }
}
