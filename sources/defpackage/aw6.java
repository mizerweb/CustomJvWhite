package defpackage;

import android.net.Uri;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class aw6 implements u25 {
    public final q95 a;
    public final String b = aw6.class.getName();
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final ny8 d;

    public aw6(q95 q95Var, ny8 ny8Var) {
        this.a = q95Var;
        this.d = ny8Var;
    }

    @Override // defpackage.u25
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.u25
    public final long f(a35 a35Var) {
        return this.a.f(a35Var);
    }

    @Override // defpackage.u25
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // defpackage.q25
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.a.read(bArr, i, i2);
        if (i3 > 0 && this.c.compareAndSet(false, true)) {
            String str = this.b;
            a4c a4cVar = gm0.f;
            lq4 lq4Var = null;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "DataSource. First bytes received, total bytes read: " + i3 + ", from URI: " + this.a.getUri(), null);
                }
            }
            t90 t90Var = (t90) this.d.getValue();
            yab.i0(t90Var.b, ((n0c) t90Var.a).c().S0(), 0, new jhc(t90Var, lq4Var, 7), 2);
        }
        return i3;
    }

    @Override // defpackage.u25
    public final void w(v1i v1iVar) {
        this.a.w(v1iVar);
    }
}
