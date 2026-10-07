package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.UnaryOperator;
import one.me.messages.list.loader.MessageModel;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class uqa extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ jsa h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uqa(jsa jsaVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = jsaVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        jsa jsaVar = this.h;
        switch (i) {
            case 0:
                uqa uqaVar = new uqa(jsaVar, lq4Var, 0);
                uqaVar.g = obj;
                return uqaVar;
            case 1:
                uqa uqaVar2 = new uqa(jsaVar, lq4Var, 1);
                uqaVar2.g = obj;
                return uqaVar2;
            default:
                uqa uqaVar3 = new uqa(jsaVar, lq4Var, 2);
                uqaVar3.g = obj;
                return uqaVar3;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((uqa) create((vg4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((uqa) create((tga) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((uqa) create((opa) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        rt2 rt2Var;
        lq4 lq4Var = null;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        switch (this.e) {
            case 0:
                vg4 vg4Var = (vg4) this.g;
                hu4 hu4Var = hu4.a;
                int i = this.f;
                if (i == 0) {
                    ch3.d0(obj);
                    jsa jsaVar = this.h;
                    this.g = null;
                    this.f = 1;
                    if (jsa.K(jsaVar, vg4Var, this) == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                return sbi.a;
            case 1:
                sbi sbiVar = sbi.a;
                je9 je9Var = je9.d;
                tga tgaVar = (tga) this.g;
                hu4 hu4Var2 = hu4.a;
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    String str = this.h.v;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null && a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, "Got MessageEvent=" + tgaVar, null);
                    }
                    if (tgaVar instanceof iga) {
                        jsa jsaVar2 = this.h;
                        iga igaVar = (iga) tgaVar;
                        this.g = null;
                        this.f = 1;
                        if (igaVar.b) {
                            String str2 = jsaVar2.v;
                            a4c a4cVar2 = gm0.f;
                            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                                a4cVar2.c(je9Var, str2, zo5.h(igaVar.a.size(), "handleMessageAddEvent: delayed scroll for outgoing message, addedSize:"), null);
                            }
                            final fva fvaVarG0 = jsaVar2.g0();
                            Collection collection = igaVar.a;
                            boolean z = igaVar.c;
                            fvaVarG0.getClass();
                            if (!collection.isEmpty()) {
                                if (((j6f) fvaVarG0.s.getValue()).b && z) {
                                    gm0.x(fvaVarG0.l, "Ignore scroll to self msg", null);
                                } else {
                                    final long jLongValue = ((Number) ww3.A1(collection)).longValue();
                                    fvaVarG0.q.updateAndGet(new UnaryOperator() { // from class: vua
                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj2) {
                                            boolean zE = sol.e(fvaVarG0.a.b);
                                            return new bva(zE ? 4 : 3, false, zE, zE ? i5f.a : i5f.b, jLongValue, 0L, 0, 98);
                                        }
                                    });
                                }
                            }
                        }
                        if (sbiVar == hu4Var2) {
                            return hu4Var2;
                        }
                    } else if (tgaVar instanceof oga) {
                        jsa jsaVar3 = this.h;
                        oga ogaVar = (oga) tgaVar;
                        ic6 ic6Var = jsaVar3.E2;
                        AtomicLong atomicLong = jsaVar3.K2;
                        if (jsaVar3.c0().h()) {
                            int i3 = 2;
                            if (ogaVar instanceof lga) {
                                x5b x5bVarC0 = jsaVar3.c0();
                                yab.i0(x5bVarC0.b, ((n0c) x5bVarC0.c).a(), 0, new b67(x5bVarC0, ((lga) ogaVar).a, lq4Var, i3), 2);
                            } else {
                                if (!(ogaVar instanceof mga)) {
                                    ore.o();
                                    return null;
                                }
                                x5b x5bVarC1 = jsaVar3.c0();
                                yab.i0(x5bVarC1.b, ((n0c) x5bVarC1.c).a(), 0, new wd9(x5bVarC1, b3 == true ? 1 : 0, 9), 2);
                            }
                        } else if (atomicLong.get() != 0) {
                            if (!(ogaVar instanceof lga)) {
                                if (!(ogaVar instanceof mga)) {
                                    ore.o();
                                    return null;
                                }
                                if (jsaVar3.R(atomicLong.get()) == null) {
                                    a8j.x(ic6Var, new kv7(atomicLong.getAndSet(0L)));
                                }
                            } else if (((lga) ogaVar).a.contains(Long.valueOf(atomicLong.get()))) {
                                a8j.x(ic6Var, new kv7(atomicLong.getAndSet(0L)));
                            }
                        }
                    } else if (tgaVar instanceof pga) {
                        a8j.x(this.h.E2, new n3g(new tnh(R.string.too_many_attempt), b2 == true ? 1 : 0, b == true ? 1 : 0, 6));
                    }
                } else {
                    if (i2 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                return sbiVar;
            default:
                jsa jsaVar4 = this.h;
                sbi sbiVar2 = sbi.a;
                opa opaVar = (opa) this.g;
                hu4 hu4Var3 = hu4.a;
                int i4 = this.f;
                if (i4 == 0) {
                    ch3.d0(obj);
                    List<MessageModel> list = opaVar.a;
                    pw pwVar = new pw(0);
                    for (MessageModel messageModel : list) {
                        Long l = messageModel.s ? new Long(messageModel.a) : null;
                        if (l != null) {
                            pwVar.add(l);
                        }
                    }
                    if (!pwVar.isEmpty() && (rt2Var = (rt2) jsaVar4.w2.a.getValue()) != null) {
                        long jA = rt2Var.A();
                        vdi vdiVar = (vdi) jsaVar4.A1.getValue();
                        this.g = null;
                        this.f = 1;
                        if (vdiVar.d(jA, pwVar, this) == hu4Var3) {
                            return hu4Var3;
                        }
                    }
                } else {
                    if (i4 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                return sbiVar2;
        }
    }
}
