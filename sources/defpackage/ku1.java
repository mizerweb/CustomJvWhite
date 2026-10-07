package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class ku1 {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ie d;

    public ku1(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = ny8Var3;
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = new ie(e9i.H(e9i.M0(((b95) ny8Var.getValue()).i, new sh1(3, null, 4)), new wf0(5)), this, 8);
    }

    public final Uri a(Long l) {
        if (l != null && l.longValue() > 0) {
            return Uri.fromParts("tel", "+" + l, null);
        }
        ny8 ny8Var = this.a;
        if (((llh) ((e5d) ny8Var.getValue()).s().i()).d) {
            return Uri.fromParts(((llh) ((e5d) ny8Var.getValue()).s().i()).f, ((llh) ((e5d) ny8Var.getValue()).s().i()).e, null);
        }
        return null;
    }
}
