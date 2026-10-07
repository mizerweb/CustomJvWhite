package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class mk3 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ rl3 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mk3(int i, rl3 rl3Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = i;
        this.g = rl3Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        rl3 rl3Var = this.g;
        switch (i) {
            case 0:
                mk3 mk3Var = new mk3(0, rl3Var, lq4Var);
                mk3Var.f = obj;
                return mk3Var;
            case 1:
                mk3 mk3Var2 = new mk3(1, rl3Var, lq4Var);
                mk3Var2.f = obj;
                return mk3Var2;
            case 2:
                mk3 mk3Var3 = new mk3(2, rl3Var, lq4Var);
                mk3Var3.f = obj;
                return mk3Var3;
            default:
                mk3 mk3Var4 = new mk3(3, rl3Var, lq4Var);
                mk3Var4.f = obj;
                return mk3Var4;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((mk3) create((nm3) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((mk3) create((ui3) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((mk3) create((wh3) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((mk3) create((m8b) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00ee A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00f0 A[LOOP:1: B:28:0x00b7->B:40:0x00f0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:60:0x0147  */
    /* JADX WARN: Code duplicated, block: B:63:0x0151  */
    /* JADX WARN: Code duplicated, block: B:93:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x015f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:? A[LOOP:3: B:61:0x014b->B:99:?, LOOP_END, SYNTHETIC] */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Iterable iterable;
        Iterator it;
        boolean z = true;
        switch (this.e) {
            case 0:
                nm3 nm3Var = (nm3) this.f;
                ch3.d0(obj);
                lm3 lm3Var = new lm3(nm3Var.a.size(), nm3Var.b);
                mjg mjgVar = ((vi3) this.g.n1.getValue()).c;
                mjgVar.getClass();
                mjgVar.j(null, lm3Var);
                return sbi.a;
            case 1:
                tm3 tm3Var = this.g.B1;
                ui3 ui3Var = (ui3) this.f;
                ch3.d0(obj);
                if (ui3Var instanceof si3) {
                    if (tm3Var != null) {
                        tm3Var.a();
                    }
                } else {
                    if (!(ui3Var instanceof ti3)) {
                        ore.o();
                        return null;
                    }
                    if (tm3Var != null && tm3Var.b()) {
                        int iA = ((ti3) ui3Var).a();
                        nm3 nm3Var2 = (nm3) tm3Var.g.getValue();
                        Set set = (Set) nm3Var2.c.get(Integer.valueOf(iA));
                        if (set == null) {
                            set = nm3Var2.a;
                        }
                        if (((Boolean) tm3Var.f.invoke(set, Integer.valueOf(iA))).booleanValue()) {
                            tm3Var.a();
                        }
                    }
                }
                return sbi.a;
            case 2:
                wh3 wh3Var = (wh3) this.f;
                ch3.d0(obj);
                if (rl3.C(this.g, wh3Var)) {
                    m8b m8bVar = ui9.a;
                    m8b m8bVar2 = new m8b();
                    pu6 pu6Var = new pu6(yhf.o0(new m2i(new sw(1, wh3Var.a), new c6(21))));
                    while (pu6Var.hasNext()) {
                        m8bVar2.a(((Number) pu6Var.next()).longValue());
                    }
                    m8b m8bVar3 = this.g.M1;
                    long[] jArr = m8bVar3.b;
                    long[] jArr2 = m8bVar3.a;
                    int length = jArr2.length - 2;
                    if (length >= 0) {
                        int i = 0;
                        while (true) {
                            long j = jArr2[i];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i2 = 8 - ((~(i - length)) >>> 31);
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= i2) {
                                        if (i2 == 8) {
                                            if (i != length) {
                                                i++;
                                            }
                                        }
                                        z = false;
                                    } else if ((255 & j) >= 128 || m8bVar2.d(jArr[(i << 3) + i3])) {
                                        j >>= 8;
                                        i3++;
                                    }
                                }
                            } else if (i != length) {
                                i++;
                            } else {
                                z = false;
                            }
                        }
                    } else {
                        z = false;
                    }
                    this.g.M1 = m8bVar2;
                    if (z) {
                        this.g.M();
                    } else {
                        Iterable iterable2 = (Iterable) this.g.E1.a.getValue();
                        if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                            iterable = (Iterable) this.g.F1.a.getValue();
                            if (iterable instanceof Collection) {
                                it = iterable.iterator();
                                while (it.hasNext()) {
                                    if (m8bVar2.d(((lk6) it.next()).a)) {
                                        this.g.M();
                                    }
                                }
                            } else {
                                it = iterable.iterator();
                                while (it.hasNext()) {
                                    if (m8bVar2.d(((lk6) it.next()).a)) {
                                        this.g.M();
                                    }
                                }
                            }
                        } else {
                            Iterator it2 = iterable2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    iterable = (Iterable) this.g.F1.a.getValue();
                                    if ((iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                                        it = iterable.iterator();
                                        while (it.hasNext()) {
                                            if (m8bVar2.d(((lk6) it.next()).a)) {
                                            }
                                        }
                                    }
                                } else if (m8bVar2.d(((lk6) it2.next()).a)) {
                                }
                                this.g.M();
                            }
                        }
                    }
                    rl3 rl3Var = this.g;
                    rl3Var.D1.setValue(rl3Var.C1.getValue());
                } else {
                    this.g.M1 = ui9.a;
                    mjg mjgVar2 = this.g.D1;
                    r66 r66Var = r66.a;
                    mjgVar2.getClass();
                    mjgVar2.j(null, r66Var);
                }
                return sbi.a;
            default:
                m8b m8bVar4 = (m8b) this.f;
                ch3.d0(obj);
                a0b a0bVar = (a0b) this.g.v.getValue();
                if (m8bVar4.i()) {
                    a0bVar.getClass();
                } else {
                    List listA = a0bVar.a(m8bVar4);
                    if (!listA.isEmpty()) {
                        a4c a4cVar = gm0.f;
                        if (a4cVar != null) {
                            je9 je9Var = je9.d;
                            if (a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, "MissedContactsController", c0a.o("requestForChatListScreen: ids=[", ww3.z1(listA, null, null, null, null, 63), "]"), null);
                            }
                        }
                        a0bVar.j.c(listA);
                    }
                }
                return sbi.a;
        }
    }
}
