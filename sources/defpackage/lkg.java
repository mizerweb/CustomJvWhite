package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class lkg implements u25 {
    public final u25 a;
    public long b;
    public Uri c;
    public Map d;

    public lkg(u25 u25Var) {
        u25Var.getClass();
        this.a = u25Var;
        this.c = Uri.EMPTY;
        this.d = Collections.EMPTY_MAP;
    }

    @Override // defpackage.u25
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.u25
    public final long f(a35 a35Var) {
        u25 u25Var = this.a;
        this.c = a35Var.a;
        this.d = Collections.EMPTY_MAP;
        try {
            return u25Var.f(a35Var);
        } finally {
            Uri uri = u25Var.getUri();
            if (uri != null) {
                this.c = uri;
            }
            this.d = u25Var.p();
        }
    }

    @Override // defpackage.u25
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // defpackage.u25
    public final Map p() {
        return this.a.p();
    }

    @Override // defpackage.q25
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.a.read(bArr, i, i2);
        if (i3 != -1) {
            this.b += (long) i3;
        }
        return i3;
    }

    @Override // defpackage.u25
    public final void w(v1i v1iVar) {
        v1iVar.getClass();
        this.a.w(v1iVar);
    }
}
