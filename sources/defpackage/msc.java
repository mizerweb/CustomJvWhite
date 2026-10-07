package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class msc {
    public final ny8 a;

    public msc(ny8 ny8Var) {
        this.a = ny8Var;
    }

    public final yp9 a(boolean z) {
        if (b().c(wsc.n)) {
            return z ? yp9.b : yp9.a;
        }
        return yp9.e;
    }

    public final wsc b() {
        return (wsc) this.a.getValue();
    }

    public final boolean c(svj svjVar) {
        if (b().c(wsc.i)) {
            return false;
        }
        b().k(svjVar, R.string.call_ask_permission_description);
        return true;
    }
}
