package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes3.dex */
public final class xd9 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ ae9 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xd9(ae9 ae9Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = ae9Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        ae9 ae9Var = this.h;
        switch (i) {
            case 0:
                xd9 xd9Var = new xd9(ae9Var, lq4Var, 0);
                xd9Var.g = obj;
                return xd9Var;
            default:
                xd9 xd9Var2 = new xd9(ae9Var, lq4Var, 1);
                xd9Var2.g = obj;
                return xd9Var2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((xd9) create((rd9) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((xd9) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        hu4 hu4Var = hu4.a;
        ae9 ae9Var = this.h;
        switch (i) {
            case 0:
                rd9 rd9Var = (rd9) this.g;
                int i2 = this.f;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ch3.d0(obj);
                        return obj;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                dme dmeVar = (dme) ae9Var.k.getValue();
                this.g = null;
                this.f = 1;
                Object objG = dmeVar.g(rd9Var, this);
                return objG == hu4Var ? hu4Var : objG;
            default:
                ConcurrentLinkedQueue concurrentLinkedQueue = ae9Var.p;
                gu4 gu4Var = (gu4) this.g;
                int i3 = this.f;
                sbi sbiVar = sbi.a;
                if (i3 == 0) {
                    ch3.d0(obj);
                    ArrayList arrayList = new ArrayList(concurrentLinkedQueue.size());
                    concurrentLinkedQueue.removeIf(new u6(9, new mu6(1, arrayList)));
                    if (arrayList.isEmpty()) {
                        gm0.x(ae9Var.m, "sendCritLogs ignored", null);
                    } else {
                        ArrayList arrayListY1 = ww3.Y1(arrayList, 50, 50);
                        ArrayList arrayList2 = new ArrayList(yw3.W0(arrayListY1, 10));
                        int i4 = 0;
                        for (Object obj2 : arrayListY1) {
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                xw3.V0();
                                throw null;
                            }
                            arrayList2.add(yab.h(gu4Var, null, 0, new wd9(i4, obj2, (lq4) null, ae9Var), 3));
                            i4 = i5;
                        }
                        this.g = null;
                        this.f = 1;
                        obj = ch3.c(arrayList2, this);
                        if (obj == hu4Var) {
                            return hu4Var;
                        }
                    }
                    return sbiVar;
                }
                if (i3 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                List list = (List) obj;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((kih) it.next()) == null) {
                            ae9Var.l("CRIT_LOGS", true);
                        }
                    }
                }
                return sbiVar;
        }
    }
}
