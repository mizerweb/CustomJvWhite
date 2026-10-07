package defpackage;

import java.io.Serializable;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class du6 implements o5j, iw7 {
    public final long a;
    public final long b;
    public final long c;
    public final Object d;
    public final Object e;
    public final Serializable f;

    public du6(ny8 ny8Var, ny8 ny8Var2, long j, mg5 mg5Var, long j2, long j3, Set set) {
        this.a = j;
        this.d = mg5Var;
        this.b = j2;
        this.c = j3;
        this.e = set;
        this.f = new ifh(new wre(this, ny8Var, ny8Var2, 9));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.o5j
    public Object a(lq4 lq4Var) {
        cu6 cu6Var;
        if (lq4Var instanceof cu6) {
            cu6Var = (cu6) lq4Var;
            int i = cu6Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                cu6Var.f = i - Integer.MIN_VALUE;
            } else {
                cu6Var = new cu6(this, (nq4) lq4Var);
            }
        } else {
            cu6Var = new cu6(this, (nq4) lq4Var);
        }
        Object objD = cu6Var.d;
        hu4 hu4Var = hu4.a;
        int i2 = cu6Var.f;
        if (i2 == 0) {
            ch3.d0(objD);
            String str = (String) this.f;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    long j = this.a;
                    long j2 = this.b;
                    long j3 = this.c;
                    StringBuilder sbS = qt4.s(j, "Fetch video. File fetcher, fileId ", " chatId ");
                    sbS.append(j2);
                    a4cVar.c(je9Var, str, qt4.k(j3, " messageId ", sbS), null);
                }
            }
            pvb pvbVar = (pvb) this.e;
            wy2 wy2Var = new wy2(this.a, this.b, this.c);
            cu6Var.f = 1;
            objD = pvbVar.D(wy2Var, cu6Var);
            if (objD == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objD);
        }
        sq6 sq6Var = (sq6) objD;
        cp6 cp6Var = new cp6(3, sq6Var.c);
        return new dp6(Collections.singletonList(cp6Var), ixl.b(sq6Var.c, (Map) ((e5d) this.d).g().i()));
    }

    @Override // defpackage.iw7
    public hw7 g() {
        return (hw7) ((ifh) this.f).getValue();
    }

    public du6(e5d e5dVar, pvb pvbVar, long j, long j2, long j3) {
        this.d = e5dVar;
        this.e = pvbVar;
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.f = du6.class.getName();
    }
}
