package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ax9 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public final /* synthetic */ lx9 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ax9(lx9 lx9Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.f = lx9Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        lx9 lx9Var = this.f;
        switch (i) {
            case 0:
                return new ax9(lx9Var, lq4Var, 0);
            case 1:
                return new ax9(lx9Var, lq4Var, 1);
            case 2:
                return new ax9(lx9Var, lq4Var, 2);
            default:
                return new ax9(lx9Var, lq4Var, 3);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((ax9) create((nh7) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((ax9) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((ax9) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((ax9) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws IllegalAccessException, InvocationTargetException {
        List list;
        y0e y0eVar;
        List list2;
        y0e y0eVar2 = null;
        Object next = null;
        y0eVar = null;
        y0e y0eVar3 = null;
        Object next2 = null;
        y0eVar2 = null;
        switch (this.e) {
            case 0:
                ch3.d0(obj);
                lx9 lx9Var = this.f;
                zv8[] zv8VarArr = lx9.F1;
                lx9Var.W();
                return sbi.a;
            case 1:
                sbi sbiVar = sbi.a;
                ch3.d0(obj);
                String str = this.f.d;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, "on mute button clicked", null);
                    }
                }
                hb9 hb9VarG = this.f.G();
                if (hb9VarG == null || !hb9VarG.c()) {
                    String str2 = this.f.d;
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 != null) {
                        je9 je9Var2 = je9.f;
                        if (a4cVar2.b(je9Var2)) {
                            a4cVar2.c(je9Var2, str2, iic.m(hb9VarG != null ? new Long(hb9VarG.b) : null, "currentMedia: ", " is not video"), null);
                        }
                    }
                } else {
                    fvi fviVarC = lx9.C(this.f, hb9VarG.b);
                    boolean z = !(fviVarC != null ? fviVarC.e : false);
                    if (fviVarC == null || (y0eVar = fviVarC.a) == null) {
                        sw9 sw9Var = (sw9) this.f.B.a.getValue();
                        if (sw9Var != null && (list = sw9Var.d) != null) {
                            y0e y0eVar4 = ((nni) this.f.k.getValue()).l().a;
                            Iterator it = list.iterator();
                            if (it.hasNext()) {
                                next2 = it.next();
                                if (it.hasNext()) {
                                    y0e y0eVar5 = ((d1e) next2).a;
                                    do {
                                        Object next3 = it.next();
                                        y0e y0eVar6 = ((d1e) next3).a;
                                        if (y0eVar5.compareTo(y0eVar6) > 0) {
                                            next2 = next3;
                                            y0eVar5 = y0eVar6;
                                        }
                                    } while (it.hasNext());
                                }
                            }
                            d1e d1eVar = (d1e) next2;
                            y0eVar2 = d1eVar == null ? y0eVar4 : (y0e) oc9.s(d1eVar.a, y0eVar4);
                        }
                    } else {
                        y0eVar2 = y0eVar;
                    }
                    a70 a70VarA = fviVarC != null ? fviVarC.a() : new a70(1);
                    if (y0eVar2 != null) {
                        a70VarA.a = y0eVar2;
                    }
                    a70VarA.e = z;
                    this.f.K().a.u(hb9VarG, new fvi(a70VarA));
                    a8j.x(this.f.w, sbiVar);
                    a8j.x(this.f.A, sbiVar);
                }
                return sbiVar;
            case 2:
                sbi sbiVar2 = sbi.a;
                ch3.d0(obj);
                hb9 hb9VarG2 = this.f.G();
                if (hb9VarG2 == null || !hb9VarG2.c()) {
                    String str3 = this.f.d;
                    a4c a4cVar3 = gm0.f;
                    if (a4cVar3 != null) {
                        je9 je9Var3 = je9.f;
                        if (a4cVar3.b(je9Var3)) {
                            a4cVar3.c(je9Var3, str3, iic.m(hb9VarG2 != null ? new Long(hb9VarG2.b) : null, "currentMedia: ", " is not video"), null);
                        }
                    }
                } else {
                    fvi fviVarC2 = lx9.C(this.f, hb9VarG2.b);
                    if (fviVarC2 == null || (y0eVar = fviVarC2.a) == null) {
                        sw9 sw9Var2 = (sw9) this.f.B.a.getValue();
                        if (sw9Var2 != null && (list2 = sw9Var2.d) != null) {
                            y0e y0eVar7 = ((nni) this.f.k.getValue()).l().a;
                            Iterator it2 = list2.iterator();
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (it2.hasNext()) {
                                    y0e y0eVar8 = ((d1e) next).a;
                                    do {
                                        Object next4 = it2.next();
                                        y0e y0eVar9 = ((d1e) next4).a;
                                        if (y0eVar8.compareTo(y0eVar9) > 0) {
                                            next = next4;
                                            y0eVar8 = y0eVar9;
                                        }
                                    } while (it2.hasNext());
                                }
                            }
                            d1e d1eVar2 = (d1e) next;
                            if (d1eVar2 == null) {
                                y0eVar3 = y0eVar7;
                            } else {
                                y0e y0eVar10 = (y0e) oc9.s(d1eVar2.a, y0eVar7);
                                y0eVar3 = y0eVar10;
                            }
                        }
                    } else {
                        y0eVar3 = y0eVar10;
                    }
                    a70 a70VarA2 = fviVarC2 != null ? fviVarC2.a() : new a70(1);
                    if (y0eVar3 != null) {
                        a70VarA2.a = y0eVar3;
                    }
                    a70VarA2.b = ((Number) this.f.J.getValue()).floatValue();
                    a70VarA2.c = ((Number) this.f.X.getValue()).floatValue();
                    this.f.K().a.u(hb9VarG2, new fvi(a70VarA2));
                    a8j.x(this.f.w, sbiVar2);
                    a8j.x(this.f.A, sbiVar2);
                }
                return sbiVar2;
            default:
                ch3.d0(obj);
                lx9 lx9Var2 = this.f;
                List<j1e> listB = lx9.B(lx9Var2);
                ArrayList arrayList = new ArrayList(yw3.W0(listB, 10));
                for (j1e j1eVar : listB) {
                    arrayList.add(new kc4(j1eVar.a.a.b, j1eVar.b, 2, 56));
                }
                a8j.x(lx9Var2.n1, new vb6(arrayList));
                return sbi.a;
        }
    }
}
