package defpackage;

import java.util.concurrent.TimeoutException;
import ru.ok.tamtam.errors.TamErrorException;

/* JADX INFO: loaded from: classes3.dex */
public final class d9f implements aaf {
    public static final /* synthetic */ int c = 0;
    public final ny8 a;
    public final ny8 b;

    public d9f(ny8 ny8Var, ny8 ny8Var2) {
        this.a = ny8Var;
        this.b = ny8Var2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(d9f d9fVar, Throwable th, nq4 nq4Var) {
        c9f c9fVar;
        if (nq4Var instanceof c9f) {
            c9fVar = (c9f) nq4Var;
            int i = c9fVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                c9fVar.f = i - Integer.MIN_VALUE;
            } else {
                c9fVar = new c9f(d9fVar, nq4Var);
            }
        } else {
            c9fVar = new c9f(d9fVar, nq4Var);
        }
        Object obj = c9fVar.d;
        int i2 = c9fVar.f;
        boolean z = true;
        if (i2 == 0) {
            ch3.d0(obj);
            if ((th instanceof TimeoutException) || ((th instanceof TamErrorException) && p90.C(((TamErrorException) th).a.b))) {
                gm0.V("d9f", "request failed. Retrying", th);
                ghb ghbVar = ew5.b;
                long jO = qe7.O(1, lw5.SECONDS);
                c9fVar.f = 1;
                Object objU = rx8.u(jO, c9fVar);
                hu4 hu4Var = hu4.a;
                if (objU == hu4Var) {
                    return hu4Var;
                }
            } else {
                gm0.V("d9f", "request failed. Couldn't recover", th);
                z = false;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.aaf
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final j3 a(String str, int i, Long l) {
        bye byeVar = new bye(new je0(str, this, i, l, (lq4) null));
        lq4 lq4Var = null;
        return new j3(e9i.x0(byeVar, 2L, new gce(this, lq4Var, 12)), 14, new jy6(3, lq4Var, 4));
    }
}
