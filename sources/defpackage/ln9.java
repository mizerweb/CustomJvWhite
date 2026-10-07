package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class ln9 extends na7 {
    public static final Object h = new Object();
    public final Object f;
    public final Object g;

    public ln9(ush ushVar, Object obj, Object obj2) {
        super(ushVar);
        this.f = obj;
        this.g = obj2;
    }

    @Override // defpackage.na7, defpackage.ush
    public final int b(Object obj) {
        Object obj2;
        if (h == obj && (obj2 = this.g) != null) {
            obj = obj2;
        }
        return this.e.b(obj);
    }

    @Override // defpackage.na7, defpackage.ush
    public final rsh f(int i, rsh rshVar, boolean z) {
        this.e.f(i, rshVar, z);
        if (Objects.equals(rshVar.b, this.g) && z) {
            rshVar.b = h;
        }
        return rshVar;
    }

    @Override // defpackage.na7, defpackage.ush
    public final Object l(int i) {
        Object objL = this.e.l(i);
        return Objects.equals(objL, this.g) ? h : objL;
    }

    @Override // defpackage.na7, defpackage.ush
    public final tsh m(int i, tsh tshVar, long j) {
        this.e.m(i, tshVar, j);
        if (Objects.equals(tshVar.a, this.f)) {
            tshVar.a = tsh.p;
        }
        return tshVar;
    }
}
