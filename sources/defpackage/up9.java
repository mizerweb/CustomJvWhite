package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
public final class up9 implements u25 {
    public final q95 a;
    public final long b;
    public qa5 c;
    public final String d = up9.class.getName();

    public up9(Context context, Uri uri) {
        this.a = new q95(context, new hb5(null, 8000, 8000, new qg7(3)));
        this.b = f(new a35(uri, 0L, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 0, null));
    }

    @Override // defpackage.u25
    public final void close() {
        Object poeVar;
        this.c = null;
        try {
            this.a.close();
            poeVar = sbi.a;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            String str = this.d;
            a4c a4cVar = gm0.f;
            if (a4cVar == null) {
                return;
            }
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "Got error on closing datasource", thA);
            }
        }
    }

    @Override // defpackage.u25
    public final long f(a35 a35Var) {
        long jF = this.a.f(a35Var);
        this.c = new qa5(this, a35Var.f, jF != -1 ? a35Var.f + jF : jF);
        return jF;
    }

    @Override // defpackage.u25
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // defpackage.q25
    public final int read(byte[] bArr, int i, int i2) {
        return this.a.read(bArr, i, i2);
    }

    @Override // defpackage.u25
    public final void w(v1i v1iVar) {
        this.a.w(v1iVar);
    }
}
