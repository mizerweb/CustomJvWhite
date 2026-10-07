package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class c1i extends mdh implements cf7 {
    public int e;
    public final /* synthetic */ e1i f;
    public final /* synthetic */ long g;
    public final /* synthetic */ long h;
    public final /* synthetic */ long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1i(e1i e1iVar, long j, long j2, long j3, lq4 lq4Var) {
        super(1, lq4Var);
        this.f = e1iVar;
        this.g = j;
        this.h = j2;
        this.i = j3;
    }

    @Override // defpackage.mq0
    public final lq4 create(lq4 lq4Var) {
        return new c1i(this.f, this.g, this.h, this.i, lq4Var);
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        return ((c1i) create((lq4) obj)).invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        try {
            if (i == 0) {
                ch3.d0(obj);
                e1i e1iVar = this.f;
                long j = this.g;
                long j2 = this.h;
                long j3 = this.i;
                pvb pvbVar = (pvb) e1iVar.d.getValue();
                lrg lrgVar = new lrg(j, j2, j3);
                this.e = 1;
                obj = pvbVar.D(lrgVar, this);
                hu4 hu4Var = hu4.a;
                if (obj == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            obj = new poe(th);
        }
        return new roe(obj);
    }
}
