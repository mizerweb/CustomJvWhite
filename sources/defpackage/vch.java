package defpackage;

import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class vch extends mdh implements qf7 {
    public ldh e;
    public ldh f;
    public long g;
    public long h;
    public int i;
    public final /* synthetic */ ldh j;
    public final /* synthetic */ long k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vch(ldh ldhVar, long j, lq4 lq4Var) {
        super(2, lq4Var);
        this.j = ldhVar;
        this.k = j;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new vch(this.j, this.k, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((vch) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0068  */
    /* JADX WARN: Code duplicated, block: B:28:0x0070  */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        ldh ldhVar;
        long j;
        ldh ldhVar2;
        long j2;
        String str;
        a4c a4cVar;
        je9 je9Var;
        hu4 hu4Var = hu4.a;
        int i = this.i;
        try {
            if (i == 0) {
                ch3.d0(obj);
                ldhVar = this.j;
                long j3 = this.k;
                try {
                    okh okhVar = (okh) ldhVar.f.getValue();
                    List list = zp0.g;
                    this.e = ldhVar;
                    this.f = ldhVar;
                    this.g = j3;
                    this.h = j3;
                    this.i = 1;
                    if (okhVar.a(list, this) == hu4Var) {
                        return hu4Var;
                    }
                    ldhVar2 = ldhVar;
                    j = j3;
                    j2 = j;
                } catch (Throwable th) {
                    th = th;
                    j = j3;
                    str = ldhVar.j;
                    a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9Var = je9.f;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str, zo5.j(j, "assetsUpdate: failed request, sync="), th);
                        }
                    }
                }
            } else {
                if (i != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j = this.h;
                j2 = this.g;
                ldhVar = this.f;
                ldhVar2 = this.e;
                try {
                    ch3.d0(obj);
                } catch (Throwable th2) {
                    th = th2;
                    str = ldhVar.j;
                    a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9Var = je9.f;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str, zo5.j(j, "assetsUpdate: failed request, sync="), th);
                        }
                    }
                }
            }
            ldhVar2.l().d(5, j2);
            gm0.m(ldhVar2.j, "assetsUpdate: queued on api, sync=%d", new Long(j2));
            return sbi.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
