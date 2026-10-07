package defpackage;

import java.util.List;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c4a implements p4a, r4a, qg4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c4a(long j, Object obj, int i) {
        this.c = obj;
        this.a = i;
        this.b = j;
    }

    @Override // defpackage.qg4
    public void accept(Object obj) {
        i8h i8hVar = (i8h) this.c;
        bz4 bz4Var = (bz4) obj;
        i8hVar.h.getClass();
        byte[] bArrJ = ldf.j(bz4Var.a, bz4Var.c);
        nmc nmcVar = i8hVar.c;
        nmcVar.getClass();
        nmcVar.L(bArrJ.length, bArrJ);
        i8hVar.a.f(bArrJ.length, nmcVar);
        long j = bz4Var.b;
        b87 b87Var = i8hVar.h;
        long j2 = this.b;
        if (j == -9223372036854775807L) {
            lvb.b0(b87Var.s == BuildConfig.MAX_TIME_TO_UPLOAD);
        } else {
            long j3 = b87Var.s;
            j2 = j3 == BuildConfig.MAX_TIME_TO_UPLOAD ? j2 + j : j + j3;
        }
        i8hVar.a.a(j2, this.a | 1, bArrJ.length, 0, null);
    }

    @Override // defpackage.p4a
    public void d(j4d j4dVar, i2a i2aVar) {
        int iM0 = ((t4a) this.c).m0(i2aVar, j4dVar, this.a);
        j4dVar.q0();
        j4dVar.b.u0(iM0, this.b, false);
    }

    @Override // defpackage.r4a
    public Object k(d3a d3aVar, i2a i2aVar, int i) {
        List list = (List) this.c;
        int i2 = this.a;
        return d3aVar.r(i2aVar, list, i2 == -1 ? d3aVar.t.F() : i2, i2 == -1 ? d3aVar.t.e() : this.b);
    }

    public /* synthetic */ c4a(i8h i8hVar, long j, int i) {
        this.c = i8hVar;
        this.b = j;
        this.a = i;
    }
}
