package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ikf extends zkf {
    public final long h;
    public final String i;
    public final List j;

    public ikf(hkf hkfVar) {
        super(hkfVar);
        this.h = hkfVar.e;
        this.i = hkfVar.f;
        this.j = hkfVar.g;
    }

    @Override // defpackage.zkf, defpackage.mjf
    public final void B() {
        njf njfVar = this.a;
        if (njfVar == null) {
            njfVar = null;
        }
        yab.i0(njfVar.i(), null, 0, new fb8(this, null), 3);
    }

    @Override // defpackage.zkf
    public final jy3 C() {
        jy3 jy3Var = new jy3(this.b);
        String str = this.i;
        if (!ch3.r(str)) {
            jy3Var.g = str;
        }
        List list = this.j;
        if (!list.isEmpty()) {
            jy3Var.b(list);
        }
        return jy3Var;
    }

    @Override // defpackage.zkf
    public final String D() {
        return "ServiceTaskEditComment";
    }
}
