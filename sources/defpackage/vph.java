package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class vph extends a8j {
    public final ny8 c;
    public final gjg d;

    public vph(String str, String str2, ny8 ny8Var, ny8 ny8Var2) {
        gjg gjgVarG0;
        Object next;
        this.c = ny8Var;
        if (str != null) {
            Iterator it = znh.d.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!cqk.d(((znh) next).name(), str));
            znh znhVar = (znh) next;
            tri triVar = znhVar != null ? znhVar.a : null;
            gjgVarG0 = p90.a(triVar != null ? new qph(triVar) : null);
        } else {
            gjgVarG0 = str2 != null ? e9i.G0(e9i.T(new cu2(new jz(new l7(new fz6(((nm0) ny8Var.getValue()).g, new dk3(2, null, 8)), this, new hm0(str2), 8), 13), 10), ((n0c) ((xhh) ny8Var2.getValue())).a()), this.b, j0g.a, null) : p90.a(null);
        }
        this.d = gjgVarG0;
    }
}
