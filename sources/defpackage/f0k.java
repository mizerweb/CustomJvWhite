package defpackage;

import androidx.work.impl.WorkerStoppedException;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class f0k extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ h0k g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0k(h0k h0kVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = h0kVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        h0k h0kVar = this.g;
        switch (i) {
            case 0:
                return new f0k(h0kVar, lq4Var, 0);
            default:
                return new f0k(h0kVar, lq4Var, 1);
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
        return ((f0k) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws Throwable {
        final d0k a0kVar;
        int i = this.e;
        hu4 hu4Var = hu4.a;
        final h0k h0kVar = this.g;
        lq4 lq4Var = null;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    Object objA = h0k.a(h0kVar, this);
                    return objA == hu4Var ? hu4Var : objA;
                }
                if (i2 == 1) {
                    ch3.d0(obj);
                    return obj;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                int i3 = this.f;
                try {
                    if (i3 == 0) {
                        ch3.d0(obj);
                        wo8 wo8Var = h0kVar.m;
                        f0k f0kVar = new f0k(h0kVar, lq4Var, 0);
                        this.f = 1;
                        obj = yab.K0(wo8Var, f0kVar, this);
                        if (obj == hu4Var) {
                            return hu4Var;
                        }
                    } else {
                        if (i3 != 1) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ch3.d0(obj);
                    }
                    a0kVar = (d0k) obj;
                    break;
                } catch (WorkerStoppedException e) {
                    a0kVar = new c0k(e.a);
                } catch (CancellationException unused) {
                    a0kVar = new a0k();
                } catch (Throwable th) {
                    n1g.x().t(i0k.a, "Unexpected error in WorkerWrapper", th);
                    a0kVar = new a0k();
                }
                return h0kVar.h.o(new Callable() { // from class: e0k
                    /* JADX WARN: Code duplicated, block: B:14:0x005c  */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        h0k h0kVar2 = h0kVar;
                        String str = h0kVar2.l;
                        String str2 = h0kVar2.c;
                        qzj qzjVar = h0kVar2.i;
                        mzj mzjVar = h0kVar2.a;
                        d0k d0kVar = a0kVar;
                        boolean z = d0kVar instanceof b0k;
                        kyj kyjVar = kyj.a;
                        int i4 = 1;
                        boolean z2 = 0;
                        z2 = 0;
                        if (z) {
                            l89 i89Var = ((b0k) d0kVar).a;
                            kyj kyjVarC = qzjVar.c(str2);
                            rre rreVar = qzjVar.a;
                            ch3.G(h0kVar2.h.w().a, false, true, new rh5(str2, 4));
                            if (kyjVarC == null) {
                                i4 = 0;
                            } else if (kyjVarC == kyj.b) {
                                if (i89Var instanceof k89) {
                                    String str3 = i0k.a;
                                    n1g.x().J(str3, "Worker result SUCCESS for " + str);
                                    if (mzjVar.c()) {
                                        h0kVar2.c();
                                    } else {
                                        qzjVar.g(kyj.c, str2);
                                        ch3.G(rreVar, false, true, new ol(27, ((k89) i89Var).a, str2));
                                        h0kVar2.f.getClass();
                                        long jCurrentTimeMillis = System.currentTimeMillis();
                                        sh5 sh5Var = h0kVar2.j;
                                        for (String str4 : sh5Var.a(str2)) {
                                            if (qzjVar.c(str4) == kyj.e && ((Boolean) ch3.G(sh5Var.a, true, false, new qo1(str4, 7))).booleanValue()) {
                                                n1g.x().J(i0k.a, "Setting status to enqueued for ".concat(str4));
                                                qzjVar.g(kyjVar, str4);
                                                ch3.G(rreVar, false, true, new nzj(jCurrentTimeMillis, str4, i4));
                                            }
                                        }
                                    }
                                } else if (i89Var instanceof j89) {
                                    String str5 = i0k.a;
                                    n1g.x().J(str5, "Worker result RETRY for " + str);
                                    h0kVar2.b(-256);
                                } else {
                                    String str6 = i0k.a;
                                    n1g.x().J(str6, "Worker result FAILURE for " + str);
                                    if (mzjVar.c()) {
                                        h0kVar2.c();
                                    } else {
                                        if (i89Var == null) {
                                            i89Var = new i89();
                                        }
                                        h0kVar2.d(i89Var);
                                    }
                                }
                                i4 = 0;
                            } else if (kyjVarC.a()) {
                                i4 = 0;
                            } else {
                                h0kVar2.b(-512);
                            }
                            z2 = i4;
                        } else if (d0kVar instanceof a0k) {
                            l89 l89VarA = ((a0k) d0kVar).a();
                            String str7 = i0k.a;
                            n1g.x().J(str7, "Worker result FAILURE for " + str);
                            if (mzjVar.c()) {
                                h0kVar2.c();
                            } else {
                                h0kVar2.d(l89VarA);
                            }
                        } else {
                            if (!(d0kVar instanceof c0k)) {
                                ore.o();
                                return null;
                            }
                            int iA = ((c0k) d0kVar).a();
                            if (cqk.d(mzjVar.y, Boolean.TRUE)) {
                                String str8 = i0k.a;
                                n1g.x().p(str8, "Worker " + mzjVar.c + " was interrupted. Backing off.");
                                h0kVar2.b(iA);
                            } else {
                                kyj kyjVarC2 = qzjVar.c(str2);
                                if (kyjVarC2 == null || kyjVarC2.a()) {
                                    String str9 = i0k.a;
                                    n1g.x().p(str9, "Status for " + str2 + " is " + kyjVarC2 + " ; not doing any work");
                                    i4 = 0;
                                } else {
                                    String str10 = i0k.a;
                                    n1g.x().p(str10, "Status for " + str2 + " is " + kyjVarC2 + "; not doing any work and rescheduling for later execution");
                                    qzjVar.g(kyjVar, str2);
                                    qzjVar.h(iA, str2);
                                    qzjVar.f(-1L, str2);
                                }
                            }
                            z2 = i4;
                        }
                        return Boolean.valueOf(z2);
                    }
                });
        }
    }
}
