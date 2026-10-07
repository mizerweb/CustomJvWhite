package defpackage;

import java.util.concurrent.CancellationException;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.errors.TamErrorException;

/* JADX INFO: loaded from: classes3.dex */
public final class ne3 {
    public final ny8 a;
    public final ny8 b;
    public final String c = ne3.class.getName();

    public ne3(ny8 ny8Var, ny8 ny8Var2) {
        this.a = ny8Var;
        this.b = ny8Var2;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    public final Object a(long j, boolean z, long j2, nq4 nq4Var) throws TamErrorException {
        me3 me3Var;
        String str;
        a4c a4cVar;
        je9 je9Var;
        long j3 = j;
        boolean z2 = z;
        long j4 = j2;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof me3) {
            me3Var = (me3) nq4Var;
            int i = me3Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                me3Var.i = i - Integer.MIN_VALUE;
            } else {
                me3Var = new me3(this, nq4Var);
            }
        } else {
            me3Var = new me3(this, nq4Var);
        }
        me3 me3Var2 = me3Var;
        Object obj = me3Var2.g;
        hu4 hu4Var = hu4.a;
        int i2 = me3Var2.i;
        lq4 lq4Var = null;
        try {
            if (i2 == 0) {
                ch3.d0(obj);
                if (j3 == 0) {
                    gm0.Y(this.c, "requestSubscribe fail, zero chatServerId");
                    return sbiVar;
                }
                try {
                    le3 le3Var = new le3(null);
                    le3Var.f(j3, ApiProtocol.PARAM_CHAT_ID);
                    if (j4 != 0) {
                        le3Var.f(j4, "postId");
                    }
                    le3Var.a("subscribe", z2);
                    onf onfVar = (onf) this.b.getValue();
                    lhb lhbVar = kfc.c;
                    k23 k23Var = new k23(this, lq4Var, 13);
                    me3Var2.d = j3;
                    me3Var2.f = z2;
                    me3Var2.e = j4;
                    me3Var2.i = 1;
                    return qe7.G(le3Var, k23Var, "CHAT_SUBSCRIBE", 0L, onfVar, me3Var2, 144) == hu4Var ? hu4Var : sbiVar;
                } catch (Throwable th) {
                    th = th;
                    str = this.c;
                    a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9Var = je9.f;
                        if (a4cVar.b(je9Var)) {
                            StringBuilder sbS = qt4.s(j3, "fail to subscribe for chat ", "|");
                            sbS.append(j4);
                            sbS.append("|");
                            sbS.append(z2);
                            a4cVar.c(je9Var, str, sbS.toString(), th);
                        }
                    }
                    if (th instanceof TamErrorException) {
                    }
                    throw th;
                }
            }
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j5 = me3Var2.e;
            z2 = me3Var2.f;
            long j6 = me3Var2.d;
            try {
                ch3.d0(obj);
                return sbiVar;
            } catch (Throwable th2) {
                th = th2;
                j4 = j5;
                j3 = j6;
            }
            str = this.c;
            a4cVar = gm0.f;
            if (a4cVar != null) {
                je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    StringBuilder sbS2 = qt4.s(j3, "fail to subscribe for chat ", "|");
                    sbS2.append(j4);
                    sbS2.append("|");
                    sbS2.append(z2);
                    a4cVar.c(je9Var, str, sbS2.toString(), th);
                }
            }
            if ((th instanceof TamErrorException) || !cqk.d(th.a.b, "client.task.ignored")) {
                throw th;
            }
        } catch (CancellationException e) {
            throw e;
        }
    }
}
