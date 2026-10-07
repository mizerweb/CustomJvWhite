package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class pnb {
    public final rre a;
    public final ig0 b = new ig0(8);
    public final onb c = new onb(0);

    public pnb(rre rreVar) {
        this.a = rreVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object a(final pnb pnbVar, final List list, final List list2, nq4 nq4Var) {
        mnb mnbVar;
        if (nq4Var instanceof mnb) {
            mnbVar = (mnb) nq4Var;
            int i = mnbVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                mnbVar.h = i - Integer.MIN_VALUE;
            } else {
                mnbVar = new mnb(pnbVar, nq4Var);
            }
        } else {
            mnbVar = new mnb(pnbVar, nq4Var);
        }
        Object obj = mnbVar.f;
        int i2 = mnbVar.h;
        final int i3 = 0;
        sbi sbiVar = sbi.a;
        final int i4 = 1;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(obj);
            if (!list.isEmpty()) {
                mnbVar.d = pnbVar;
                mnbVar.e = list2;
                mnbVar.h = 1;
                Object objI = ch3.I(mnbVar, pnbVar.a, false, true, new cf7(pnbVar) { // from class: nnb
                    public final /* synthetic */ pnb b;

                    {
                        this.b = pnbVar;
                    }

                    @Override // defpackage.cf7
                    public final Object invoke(Object obj2) {
                        int i5 = i4;
                        sbi sbiVar2 = sbi.a;
                        List list3 = list;
                        pnb pnbVar2 = this.b;
                        qxe qxeVar = (qxe) obj2;
                        switch (i5) {
                            case 0:
                                pnbVar2.c.H(qxeVar, list3);
                                break;
                            default:
                                pnbVar2.b.c(qxeVar, list3);
                                break;
                        }
                        return sbiVar2;
                    }
                });
                if (objI != hu4Var) {
                    objI = sbiVar;
                }
                if (objI != hu4Var) {
                }
            }
            return hu4Var;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            List list3 = mnbVar.e;
            ch3.d0(obj);
            return sbiVar;
        }
        list2 = mnbVar.e;
        pnbVar = mnbVar.d;
        ch3.d0(obj);
        if (!list2.isEmpty()) {
            mnbVar.d = null;
            mnbVar.e = null;
            mnbVar.h = 2;
            Object objI2 = ch3.I(mnbVar, pnbVar.a, false, true, new cf7(pnbVar) { // from class: nnb
                public final /* synthetic */ pnb b;

                {
                    this.b = pnbVar;
                }

                @Override // defpackage.cf7
                public final Object invoke(Object obj2) {
                    int i5 = i3;
                    sbi sbiVar2 = sbi.a;
                    List list4 = list2;
                    pnb pnbVar2 = this.b;
                    qxe qxeVar = (qxe) obj2;
                    switch (i5) {
                        case 0:
                            pnbVar2.c.H(qxeVar, list4);
                            break;
                        default:
                            pnbVar2.b.c(qxeVar, list4);
                            break;
                    }
                    return sbiVar2;
                }
            });
            if (objI2 != hu4Var) {
                objI2 = sbiVar;
            }
            if (objI2 == hu4Var) {
                return hu4Var;
            }
        }
        return sbiVar;
    }
}
