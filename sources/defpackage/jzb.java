package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class jzb {
    public final ny8 a;
    public final ifh b = new ifh(new yxb(1));
    public final ifh c = new ifh(new ap9(9, this));

    public jzb(ny8 ny8Var) {
        this.a = ny8Var;
    }

    public final String a(rt2 rt2Var) {
        if (rt2Var.y0()) {
            return (String) this.b.getValue();
        }
        ny8 ny8Var = this.a;
        if (jcd.d((jcd) ny8Var.getValue(), null, rt2Var, 1)) {
            return ((jcd) ny8Var.getValue()).a().toString();
        }
        return null;
    }

    public final List b(rt2 rt2Var) {
        if (rt2Var.y0()) {
            return (List) this.c.getValue();
        }
        ny8 ny8Var = this.a;
        if (jcd.d((jcd) ny8Var.getValue(), null, rt2Var, 1)) {
            return Collections.singletonList(((jcd) ny8Var.getValue()).a().toString());
        }
        return null;
    }
}
