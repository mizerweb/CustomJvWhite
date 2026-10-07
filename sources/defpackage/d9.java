package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class d9 {
    public final lg a;
    public final Set b;
    public iaj c;
    public final v30 d;

    public d9(lg lgVar, Set set, gu4 gu4Var, p7d p7dVar) {
        this.a = lgVar;
        this.b = set;
        this.d = new v30(gu4Var, new z2(p7dVar, 1, this));
        yab.i0(gu4Var, null, 0, new m5(this, null, 2), 3);
    }

    public final m9b a() {
        v30 v30Var = this.d;
        synchronized (v30Var.f) {
            try {
                if (v30Var.c) {
                    return null;
                }
                int i = v30Var.b + 1;
                v30Var.b = i;
                if (i == 1) {
                    sgg sggVar = (sgg) v30Var.g;
                    if (sggVar != null) {
                        sggVar.b(null);
                    }
                    v30Var.g = null;
                }
                return new m9b(v30Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object b(nq4 nq4Var) {
        Object objO = e9i.O(this.a.u, new c9(2, null, 1), nq4Var);
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (objO != hu4Var) {
            objO = sbiVar;
        }
        return objO == hu4Var ? objO : sbiVar;
    }

    public final void c() {
        this.d.release();
        this.a.a();
    }

    public final sbi d(iaj iajVar, m9b m9bVar) {
        sbi sbiVar = sbi.a;
        iaj iajVar2 = this.c;
        this.c = iajVar;
        lq4 lq4Var = null;
        if (iajVar2 != null) {
            iajVar2.a(null);
        }
        mjg mjgVar = this.a.u;
        synchronized (iajVar.e) {
            if (iajVar.f) {
                m9bVar.b();
            } else {
                iajVar.k = yab.i0(iajVar.c, null, 0, new oli(mjgVar, iajVar, lq4Var, 9), 3);
                iajVar.l = m9bVar;
            }
        }
        return sbiVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActiveCamera(cameraId=");
        sb.append((Object) ef2.b(this.a.a));
        sb.append(")@");
        int iHashCode = hashCode();
        tre.M(16);
        sb.append(Integer.toString(iHashCode, 16));
        return sb.toString();
    }
}
