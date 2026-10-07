package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class el3 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ rl3 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ el3(int i, rl3 rl3Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = i;
        this.h = rl3Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        rl3 rl3Var = this.h;
        switch (i) {
            case 0:
                el3 el3Var = new el3(0, rl3Var, lq4Var);
                el3Var.g = obj;
                return el3Var;
            case 1:
                el3 el3Var2 = new el3(1, rl3Var, lq4Var);
                el3Var2.g = obj;
                return el3Var2;
            default:
                el3 el3Var3 = new el3(2, rl3Var, lq4Var);
                el3Var3.g = obj;
                return el3Var3;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((el3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((el3) create((ArrayList) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((el3) create((wh3) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.e;
        rl3 rl3Var = this.h;
        hu4 hu4Var = hu4.a;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                gu4 gu4Var = (gu4) this.g;
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    ve3 ve3Var = (ve3) rl3Var.I.getValue();
                    String str = rl3Var.d;
                    this.g = gu4Var;
                    this.f = 1;
                    obj = ve3Var.a(str, this);
                    if (obj == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i2 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                Collection collection = (Collection) obj;
                if (collection.isEmpty()) {
                    gm0.n(rl3Var.U1, "Chat suggest list is empty");
                } else {
                    zv8[] zv8VarArr = rl3.Z1;
                    e9i.j0(new r07(new tz(7, collection), rl3Var.f.N, new vm1(((Number) ((e5d) rl3Var.n.getValue()).B6.a(e5d.S6[393]).i()).intValue(), rl3Var, (lq4) null), 0), gu4Var);
                }
                return sbiVar;
            case 1:
                ArrayList arrayList = (ArrayList) this.g;
                int i3 = this.f;
                if (i3 == 0) {
                    ch3.d0(obj);
                    rl3Var.C1.setValue(arrayList);
                    if (rl3.C(rl3Var, (wh3) rl3Var.z1.a.getValue())) {
                        rl3Var.D1.setValue(arrayList);
                    }
                    ghb ghbVar = ew5.b;
                    long jO = qe7.O(1, lw5.MINUTES);
                    this.g = null;
                    this.f = 1;
                    if (rx8.u(jO, this) == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i3 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                rl3Var.M();
                return sbiVar;
            default:
                wh3 wh3Var = (wh3) this.g;
                int i4 = this.f;
                if (i4 == 0) {
                    ch3.d0(obj);
                    List<w73> list = wh3Var.a;
                    m8b m8bVar = ui9.a;
                    m8b m8bVar2 = new m8b();
                    for (w73 w73Var : list) {
                        Long l = (w73Var.u & 1) != 0 ? new Long(w73Var.a) : null;
                        if (l != null) {
                            m8bVar2.a(l.longValue());
                        }
                    }
                    if (!m8bVar2.i()) {
                        vdi vdiVar = (vdi) rl3Var.A.getValue();
                        this.g = null;
                        this.f = 1;
                        if (vdiVar.e(m8bVar2, this) == hu4Var) {
                            return hu4Var;
                        }
                    }
                } else {
                    if (i4 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                return sbiVar;
        }
    }
}
