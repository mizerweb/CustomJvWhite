package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class tk3 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ rl3 g;
    public final /* synthetic */ long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tk3(rl3 rl3Var, long j, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = rl3Var;
        this.h = j;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                return new tk3(this.g, this.h, lq4Var, 0);
            case 1:
                return new tk3(this.g, this.h, lq4Var, 1);
            case 2:
                return new tk3(this.g, this.h, lq4Var, 2);
            case 3:
                return new tk3(this.g, this.h, lq4Var, 3);
            default:
                return new tk3(this.g, this.h, lq4Var, 4);
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
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return ((tk3) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0110  */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object objI;
        Object objR;
        Object objK0;
        int i = this.e;
        sbi sbiVar = sbi.a;
        long j = this.h;
        rl3 rl3Var = this.g;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    yt2 yt2Var = (yt2) rl3Var.s.getValue();
                    String str = rl3Var.d;
                    this.f = 1;
                    objA = yt2Var.a(j, this, str);
                    if (objA == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i2 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                    objA = obj;
                }
                List list = (List) objA;
                ((wxb) rl3Var.Y.getValue()).getClass();
                if (((Boolean) ((f5d) ((wo6) rl3Var.l.getValue())).a.i4.a(e5d.S6[270]).i()).booleanValue()) {
                    ArrayList arrayList = new ArrayList(list);
                    arrayList.add(ut2.x);
                    list = arrayList;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    if (((ut2) obj2) != ut2.r) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(yw3.W0(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(jll.a((ut2) it.next()));
                }
                return arrayList3;
            case 1:
                int i3 = this.f;
                if (i3 == 0) {
                    ch3.d0(obj);
                    bcj bcjVar = (bcj) rl3Var.s1.getValue();
                    this.f = 1;
                    ny8 ny8Var = bcjVar.a;
                    ny8 ny8Var2 = bcjVar.b;
                    if (((st2) ((sa8) ny8Var.getValue()).b.get(Long.valueOf(j))) != null) {
                    } else {
                        gm0.Y(bcj.class.getName(), "not found suggest in cache");
                        objI = ((xn3) ny8Var2.getValue()).i(j, this);
                        if (objI != hu4Var) {
                        }
                        if (objI == hu4Var) {
                            return hu4Var;
                        }
                    }
                    objI = sbiVar;
                    if (objI == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i3 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                a8j.x(rl3Var.K1, new dk8(zm3.j(zm3.b, this.h, "server", null, null, null, null, null, null, 4092)));
                return sbiVar;
            case 2:
                int i4 = this.f;
                if (i4 == 0) {
                    ch3.d0(obj);
                    zv8[] zv8VarArr = rl3.Z1;
                    xn3 xn3VarI = rl3Var.I();
                    this.f = 1;
                    objR = xn3VarI.r(j, this);
                    if (objR == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i4 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                    objR = obj;
                }
                rt2 rt2Var = (rt2) objR;
                if (rt2Var == null) {
                    return sbiVar;
                }
                a8j.x(rl3Var.K1, zm3.k(zm3.b, rt2Var.a, null, null, 14));
                return sbiVar;
            case 3:
                int i5 = this.f;
                long j2 = this.h;
                rl3 rl3Var2 = this.g;
                if (i5 == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    objK0 = yab.K0(((n0c) rl3Var2.h).a(), new tk3(rl3Var2, j2, null, 0), this);
                    if (objK0 == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i5 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                    objK0 = obj;
                }
                List list2 = (List) objK0;
                if (list2.isEmpty()) {
                    return sbiVar;
                }
                a8j.x(rl3Var2.L1, new t1g(j2, list2));
                return sbiVar;
            default:
                int i6 = this.f;
                if (i6 == 0) {
                    ch3.d0(obj);
                    sch schVar = (sch) rl3Var.x.getValue();
                    this.f = 1;
                    return schVar.a(j, this) == hu4Var ? hu4Var : sbiVar;
                }
                if (i6 == 1) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
