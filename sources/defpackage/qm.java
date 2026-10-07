package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class qm extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ xm g;
    public final /* synthetic */ m8b h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qm(xm xmVar, m8b m8bVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = xmVar;
        this.h = m8bVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        m8b m8bVar = this.h;
        xm xmVar = this.g;
        switch (i) {
            case 0:
                return new qm(xmVar, m8bVar, lq4Var, 0);
            default:
                return new qm(xmVar, m8bVar, lq4Var, 1);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        gu4 gu4Var = (gu4) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((qm) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        m8b m8bVar = this.h;
        xm xmVar = this.g;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 0:
                int i2 = this.f;
                try {
                    if (i2 != 0) {
                        if (i2 == 1) {
                            ch3.d0(obj);
                        } else {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                        }
                        return null;
                    }
                    ch3.d0(obj);
                    pvb pvbVar = xmVar.a;
                    ky kyVar = new ky(9, rx8.g0(m8bVar));
                    this.f = 1;
                    obj = pvbVar.D(kyVar, this);
                    if (obj == hu4Var) {
                        return hu4Var;
                    }
                    break;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th) {
                    obj = new poe(th);
                }
                if (!(obj instanceof poe)) {
                    return obj;
                }
                return null;
            default:
                int i3 = this.f;
                try {
                    if (i3 != 0) {
                        if (i3 == 1) {
                            ch3.d0(obj);
                        } else {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                        }
                        return null;
                    }
                    ch3.d0(obj);
                    pvb pvbVar2 = xmVar.a;
                    ky kyVar2 = new ky(8, rx8.g0(m8bVar));
                    this.f = 1;
                    obj = pvbVar2.D(kyVar2, this);
                    if (obj == hu4Var) {
                        return hu4Var;
                    }
                    break;
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th2) {
                    obj = new poe(th2);
                }
                if (!(obj instanceof poe)) {
                    return obj;
                }
                return null;
        }
    }
}
