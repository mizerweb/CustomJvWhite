package defpackage;

import java.util.Collection;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class qza extends pza {
    public final ha9 e;
    public final ny8 f;
    public final ifh g;

    public qza(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ha9 ha9Var) {
        super(ny8Var);
        this.e = ha9Var;
        this.f = ny8Var3;
        this.g = new ifh(new x5(ny8Var2, 24, this));
    }

    @Override // defpackage.pza
    public final Object b() {
        zf8 zf8Var = new zf8();
        zf8Var.a = (String[]) ((Collection) this.b.get()).toArray(new String[0]);
        return zf8Var;
    }

    @Override // defpackage.pza
    public final f40 c() {
        return (f40) this.g.getValue();
    }

    @Override // defpackage.pza
    public final boolean e(byte[] bArr) {
        Object poeVar;
        je9 je9Var = je9.d;
        try {
            String strD = d();
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, strD, "loadData: starting", null);
            }
            zf8 zf8Var = (zf8) sia.mergeFrom(new zf8(), bArr);
            String[] strArr = zf8Var.a;
            String strD2 = d();
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, strD2, "loadData: warming urls with size -> " + strArr.length, null);
            }
            for (String str : strArr) {
                ((b78) this.f.getValue()).d(ghb.k(str, awb.a), this);
            }
            this.b.set(a.n1(zf8Var.a));
            poeVar = Boolean.TRUE;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            gm0.V(d(), "Failed to parse stories ministorage", thA);
        }
        Boolean bool = Boolean.FALSE;
        if (poeVar instanceof poe) {
            poeVar = bool;
        }
        return ((Boolean) poeVar).booleanValue();
    }
}
