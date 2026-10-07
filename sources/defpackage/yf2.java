package defpackage;

import java.io.IOException;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;

/* JADX INFO: loaded from: classes.dex */
public final class yf2 {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public final Object f;

    public yf2(rd1 rd1Var, p3c p3cVar) {
        this.b = rd1Var;
        this.c = p3cVar;
        this.d = yf2.class.getName();
        this.f = new xf2(0, this);
    }

    public IOException a(boolean z, boolean z2, IOException iOException) {
        if (iOException != null) {
            d(iOException);
        }
        return ((y8e) this.b).i(this, z2, z, iOException);
    }

    public void b() {
        this.a = ((rd1) this.b).c();
        String str = (String) this.d;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, zo5.s("invalidateCameraState, isVideoEnabled=", this.a), null);
        }
    }

    public one c(boolean z) throws IOException {
        try {
            one oneVarG = ((jd6) this.e).g(z);
            if (oneVarG == null) {
                return oneVarG;
            }
            oneVarG.m = this;
            return oneVarG;
        } catch (IOException e) {
            d(e);
            throw e;
        }
    }

    public void d(IOException iOException) {
        this.a = true;
        ((kd6) this.d).b(iOException);
        c9e c9eVarD = ((jd6) this.e).d();
        y8e y8eVar = (y8e) this.b;
        synchronized (c9eVarD) {
            try {
                if (!(iOException instanceof StreamResetException)) {
                    if (!(c9eVarD.g != null) || (iOException instanceof ConnectionShutdownException)) {
                        c9eVarD.j = true;
                        if (c9eVarD.m == 0) {
                            c9e.d(y8eVar.a, c9eVarD.b, iOException);
                            c9eVarD.l++;
                        }
                    }
                } else if (((StreamResetException) iOException).a == 8) {
                    int i = c9eVarD.n + 1;
                    c9eVarD.n = i;
                    if (i > 1) {
                        c9eVarD.j = true;
                        c9eVarD.l++;
                    }
                } else if (((StreamResetException) iOException).a != 9 || !y8eVar.p) {
                    c9eVarD.j = true;
                    c9eVarD.l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public yf2(y8e y8eVar, lc6 lc6Var, kd6 kd6Var, jd6 jd6Var) {
        this.b = y8eVar;
        this.c = lc6Var;
        this.d = kd6Var;
        this.e = jd6Var;
        this.f = jd6Var.d();
    }
}
