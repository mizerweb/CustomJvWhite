package defpackage;

import android.util.Size;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class v1j implements z76 {
    public final y0e a;

    public v1j(y0e y0eVar) {
        this.a = y0eVar;
    }

    @Override // defpackage.z76
    public final m86 a(Executor executor, y76 y76Var, int i) {
        jj0 jj0VarE = ((kj0) y76Var).e();
        jj0VarE.a = "video/avc";
        jj0VarE.c = 2130708361;
        jj0VarE.j = lj0.e;
        y0e y0eVar = this.a;
        jj0VarE.g = Integer.valueOf(y0eVar.e);
        int iMin = Math.min((int) (y0eVar.a() >> 32), (int) (y0eVar.a() & 4294967295L));
        jj0VarE.i = new Size(iMin, iMin);
        return new m86(executor, jj0VarE.a(), i);
    }
}
