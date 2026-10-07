package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ql4 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ vl4 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ql4(vl4 vl4Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = vl4Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        vl4 vl4Var = this.g;
        switch (i) {
            case 0:
                ql4 ql4Var = new ql4(vl4Var, lq4Var, 0);
                ql4Var.f = obj;
                return ql4Var;
            case 1:
                ql4 ql4Var2 = new ql4(vl4Var, lq4Var, 1);
                ql4Var2.f = obj;
                return ql4Var2;
            default:
                ql4 ql4Var3 = new ql4(vl4Var, lq4Var, 2);
                ql4Var3.f = obj;
                return ql4Var3;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((ql4) create((g44) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 1:
                ((ql4) create((ej4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            default:
                return ((ql4) create((vg4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.ArrayList] */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? arrayList;
        rqd qqdVar;
        int i = 1;
        Throwable th = null;
        switch (this.e) {
            case 0:
                Object objJ = r66.a;
                g44 g44Var = (g44) this.f;
                ch3.d0(obj);
                if (g44Var.equals(z34.a) || g44Var.equals(a44.a)) {
                    arrayList = objJ;
                } else {
                    if (!(g44Var instanceof b44)) {
                        ore.o();
                        return null;
                    }
                    b44 b44Var = (b44) g44Var;
                    LinkedHashSet linkedHashSet = b44Var.a;
                    arrayList = new ArrayList(yw3.W0(linkedHashSet, 10));
                    int i2 = 0;
                    for (Object obj2 : linkedHashSet) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            Throwable th2 = th;
                            xw3.V0();
                            throw th2;
                        }
                        f44 f44Var = (f44) obj2;
                        int i4 = f44Var instanceof d44 ? 1024 : np0.o;
                        if (b44Var.a.size() != i) {
                            i4 |= i2 == 0 ? 536870912 : i2 == b44Var.a.size() - i ? Integer.MIN_VALUE : 1073741824;
                        }
                        if (cqk.d(f44Var, c44.a)) {
                            qqdVar = oqd.a;
                        } else {
                            if (cqk.d(f44Var, d44.a)) {
                                qqdVar = new pqd(i4);
                            } else {
                                if (!(f44Var instanceof e44)) {
                                    ore.o();
                                    return th;
                                }
                                e44 e44Var = (e44) f44Var;
                                rt2 rt2Var = e44Var.a;
                                long j = rt2Var.a;
                                CharSequence charSequence = e44Var.b;
                                xnh xnhVar = new xnh(e44Var.c);
                                String strS = rt2Var.s(us0.c, rs0.a);
                                long jA = e44Var.a.A();
                                rt2 rt2Var2 = e44Var.a;
                                rt2Var2.L0();
                                qqdVar = new qqd(new emd(j, charSequence, xnhVar, strS, jA, rt2Var2.m), i4);
                            }
                            arrayList.add(qqdVar);
                            i2 = i3;
                            th = th;
                            i = 1;
                        }
                        arrayList.add(qqdVar);
                        i2 = i3;
                        th = th;
                        i = 1;
                    }
                }
                mjg mjgVar = this.g.J;
                if (!arrayList.isEmpty()) {
                    o44 o44Var = this.g.F;
                    o44Var.getClass();
                    c79 c79VarW = yab.w();
                    c79VarW.add((gqd) o44Var.a.getValue());
                    c79VarW.addAll((Collection) arrayList);
                    objJ = yab.j(c79VarW);
                }
                mjgVar.setValue(objJ);
                return sbi.a;
            case 1:
                ej4 ej4Var = (ej4) this.f;
                ch3.d0(obj);
                if (ej4Var instanceof zi4) {
                    this.g.g.a(new lud(new tnh(R.string.common_error), null, null));
                }
                return sbi.a;
            default:
                vg4 vg4Var = (vg4) this.f;
                ch3.d0(obj);
                vl4 vl4Var = this.g;
                zv8[] zv8VarArr = vl4.N;
                Long lN = vl4Var.N(vg4Var);
                return lN != null ? new x01(vl4Var.k.b(lN.longValue()), vg4Var, 1) : new tz(7, new ylc(vg4Var, null));
        }
    }
}
