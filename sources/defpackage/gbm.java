package defpackage;

import java.io.IOException;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes2.dex */
public final class gbm implements sam {
    private final r3m a;
    private h9m b = new h9m();
    private final int c;

    private gbm(r3m r3mVar, int i) {
        this.a = r3mVar;
        vbm.a();
        this.c = i;
    }

    public static sam e(r3m r3mVar) {
        return new gbm(r3mVar, 0);
    }

    public static sam f(r3m r3mVar, int i) {
        return new gbm(r3mVar, 1);
    }

    @Override // defpackage.sam
    public final byte[] a(int i, boolean z) {
        this.b.f(Boolean.valueOf(1 == (i ^ 1)));
        this.b.e(Boolean.FALSE);
        this.a.j(this.b.m());
        try {
            vbm.a();
            r3m r3mVar = this.a;
            if (i != 0) {
                v3m v3mVarK = r3mVar.k();
                p6l p6lVar = new p6l();
                nyl.a.e(p6lVar);
                return p6lVar.b().a(v3mVarK);
            }
            v3m v3mVarK2 = r3mVar.k();
            ft8 ft8Var = new ft8();
            nyl.a.e(ft8Var);
            ft8Var.d = true;
            StringWriter stringWriter = new StringWriter();
            try {
                jv8 jv8Var = new jv8(stringWriter, ft8Var.a, ft8Var.b, ft8Var.c, ft8Var.d);
                jv8Var.f(v3mVarK2);
                jv8Var.h();
                jv8Var.b.flush();
            } catch (IOException unused) {
            }
            return stringWriter.toString().getBytes("utf-8");
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }

    @Override // defpackage.sam
    public final sam b(p3m p3mVar) {
        this.a.f(p3mVar);
        return this;
    }

    @Override // defpackage.sam
    public final String c() {
        j9m j9mVarG = this.a.k().g();
        if (j9mVarG == null || pqk.c(j9mVarG.k())) {
            return "NA";
        }
        String strK = j9mVarG.k();
        yab.s(strK);
        return strK;
    }

    @Override // defpackage.sam
    public final sam d(h9m h9mVar) {
        this.b = h9mVar;
        return this;
    }

    @Override // defpackage.sam
    public final int zza() {
        return this.c;
    }
}
