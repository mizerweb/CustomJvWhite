package defpackage;

import java.util.concurrent.TimeoutException;
import ru.ok.tamtam.errors.TamErrorException;

/* JADX INFO: loaded from: classes3.dex */
public final class w8f implements aaf {
    public static final /* synthetic */ int c = 0;
    public final ny8 a;
    public final ny8 b;

    public w8f(ny8 ny8Var, ny8 ny8Var2) {
        this.a = ny8Var;
        this.b = ny8Var2;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public static final Object b(w8f w8fVar, Throwable th, nq4 nq4Var) {
        v8f v8fVar;
        je9 je9Var = je9.g;
        if (nq4Var instanceof v8f) {
            v8fVar = (v8f) nq4Var;
            int i = v8fVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                v8fVar.f = i - Integer.MIN_VALUE;
            } else {
                v8fVar = new v8f(w8fVar, nq4Var);
            }
        } else {
            v8fVar = new v8f(w8fVar, nq4Var);
        }
        v8f v8fVar2 = v8fVar;
        Object obj = v8fVar2.d;
        hu4 hu4Var = hu4.a;
        int i2 = v8fVar2.f;
        boolean z = true;
        if (i2 == 0) {
            ch3.d0(obj);
            if ((th instanceof TimeoutException) || ((th instanceof TamErrorException) && p90.C(((TamErrorException) th).a.b))) {
                String strH = x05.h("request failed with ", ". Retrying", th);
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    a4c.f(a4cVar, je9Var, "w8f", strH, null, null, 8);
                }
                ghb ghbVar = ew5.b;
                long jO = qe7.O(1, lw5.SECONDS);
                v8fVar2.f = 1;
                if (rx8.u(jO, v8fVar2) == hu4Var) {
                    return hu4Var;
                }
            } else {
                String strH2 = x05.h("request failed with ", ". Couldn't recover", th);
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null) {
                    a4c.f(a4cVar2, je9Var, "w8f", strH2, null, null, 8);
                }
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
    public final j3 a(int i, Object obj, String str) {
        bye byeVar = new bye(new tt6(str, this, i, (String) obj, (lq4) null));
        lq4 lq4Var = null;
        int i2 = 3;
        return new j3(e9i.x0(byeVar, 2L, new gce(this, lq4Var, 11)), 14, new jy6(i2, lq4Var, i2));
    }
}
