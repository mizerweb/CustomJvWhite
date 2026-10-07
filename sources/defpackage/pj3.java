package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class pj3 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ fk3 g;
    public final /* synthetic */ long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pj3(int i, long j, fk3 fk3Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = i;
        this.g = fk3Var;
        this.h = j;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                return new pj3(0, this.h, this.g, lq4Var);
            case 1:
                return new pj3(1, this.h, this.g, lq4Var);
            default:
                return new pj3(2, this.h, this.g, lq4Var);
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
        }
        return ((pj3) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object objA;
        int i = this.e;
        long j = this.h;
        sbi sbiVar = sbi.a;
        fk3 fk3Var = this.g;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    yt2 yt2Var = (yt2) fk3Var.n.getValue();
                    this.f = 1;
                    objA = yt2Var.a(j, this, "all.chat.folder");
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
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (Iterable) objA) {
                    if (((ut2) obj2) != ut2.r) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(yw3.W0(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(jll.a((ut2) it.next()));
                }
                return arrayList2;
            case 1:
                int i3 = this.f;
                if (i3 == 0) {
                    ch3.d0(obj);
                    sch schVar = (sch) fk3Var.u.getValue();
                    this.f = 1;
                    return schVar.a(j, this) == hu4Var ? hu4Var : sbiVar;
                }
                if (i3 == 1) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                int i4 = this.f;
                if (i4 != 0) {
                    if (i4 == 1) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                zv8[] zv8VarArr = fk3.y1;
                xn3 xn3VarE = fk3Var.E();
                this.f = 1;
                qw2 qw2VarJ = xn3VarE.j();
                Object objL = qw2VarJ.l(this.h, qw2VarJ.p.a.f(), this);
                if (objL != hu4Var) {
                    objL = sbiVar;
                }
                return objL == hu4Var ? hu4Var : sbiVar;
        }
    }
}
