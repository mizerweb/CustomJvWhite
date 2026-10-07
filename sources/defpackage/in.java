package defpackage;

import android.util.Log;
import java.util.ArrayList;
import one.me.calllist.ui.page.CallHistoryPageScreen;
import ru.ok.tamtam.messages.b;

/* JADX INFO: loaded from: classes2.dex */
public final class in extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ boolean f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public in(lq4 lq4Var, hli hliVar, boolean z) {
        super(2, lq4Var);
        this.e = 7;
        this.g = hliVar;
        this.f = z;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                return new in((jn) obj2, this.f, lq4Var, 0);
            case 1:
                in inVar = new in((CallHistoryPageScreen) obj2, lq4Var, 1);
                inVar.f = ((Boolean) obj).booleanValue();
                return inVar;
            case 2:
                in inVar2 = new in((vl1) obj2, lq4Var, 2);
                inVar2.f = ((Boolean) obj).booleanValue();
                return inVar2;
            case 3:
                in inVar3 = new in((h02) obj2, lq4Var, 3);
                inVar3.f = ((Boolean) obj).booleanValue();
                return inVar3;
            case 4:
                return new in((ej7) obj2, this.f, lq4Var, 4);
            case 5:
                return new in((euf) obj2, this.f, lq4Var, 5);
            case 6:
                return new in((cf7) obj2, this.f, lq4Var, 6);
            case 7:
                return new in(lq4Var, (hli) obj2, this.f);
            default:
                return new in((ioj) obj2, this.f, lq4Var, 8);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((in) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((in) create(bool, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 2:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                ((in) create(bool2, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 3:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                ((in) create(bool3, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 4:
                ((in) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 5:
                ((in) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 6:
                ((in) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 7:
                ((in) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((in) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v18 */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object value;
        ?? arrayList;
        Object value2;
        boolean z;
        switch (this.e) {
            case 0:
                ch3.d0(obj);
                jn jnVar = (jn) this.g;
                e13 e13Var = (e13) jnVar.d.getValue();
                e13Var.G.i(-1);
                e13Var.I.i(-1);
                ((b) jnVar.b.getValue()).b();
                ((xn3) jnVar.c.getValue()).t();
                ((gq0) jnVar.e.getValue()).c();
                if (this.f) {
                    ((xm) jnVar.f.getValue()).m();
                }
                return sbi.a;
            case 1:
                boolean z2 = this.f;
                ch3.d0(obj);
                CallHistoryPageScreen callHistoryPageScreen = (CallHistoryPageScreen) this.g;
                er3 er3Var = CallHistoryPageScreen.l;
                mjg mjgVar = callHistoryPageScreen.r1().m;
                do {
                    value = mjgVar.getValue();
                    ((Boolean) value).getClass();
                } while (!mjgVar.h(value, Boolean.valueOf(z2)));
                return sbi.a;
            case 2:
                boolean z3 = this.f;
                ch3.d0(obj);
                if (z3) {
                    arrayList = r66.a;
                } else {
                    ma6 ma6Var = yl1.e;
                    arrayList = new ArrayList(yw3.W0(ma6Var, 10));
                    y1 y1Var = new y1(0, ma6Var);
                    while (y1Var.hasNext()) {
                        yl1 yl1Var = (yl1) y1Var.next();
                        arrayList.add(new zl1(yl1Var.ordinal(), yl1Var.a, yl1Var));
                    }
                }
                mjg mjgVar2 = ((vl1) this.g).k;
                do {
                    value2 = mjgVar2.getValue();
                    k92 k92Var = (k92) value2;
                    z = k92Var.b;
                    k92Var.getClass();
                } while (!mjgVar2.h(value2, new k92(arrayList, z)));
                return sbi.a;
            case 3:
                boolean z4 = this.f;
                ch3.d0(obj);
                w82 w82Var = ((h02) this.g).e;
                if (z4) {
                    w82Var.f.a();
                } else {
                    w82Var.f.b();
                }
                return sbi.a;
            case 4:
                ch3.d0(obj);
                mjg mjgVar3 = ((ej7) this.g).n;
                Iterable<ki7> iterable = (Iterable) mjgVar3.getValue();
                boolean z5 = this.f;
                ArrayList arrayList2 = new ArrayList(yw3.W0(iterable, 10));
                for (ki7 ki7VarB : iterable) {
                    if (ki7VarB.h != 0) {
                        ki7VarB = ki7.b(ki7VarB, null, null, null, 0, false, 0, null, 4031);
                    }
                    ki7 ki7VarB2 = ki7VarB;
                    if (z5) {
                        ki7VarB2 = ki7.b(ki7VarB2, null, null, null, 0, false, 0, ki7VarB2.c.k, 3039);
                    }
                    arrayList2.add(ki7VarB2);
                }
                mjgVar3.getClass();
                mjgVar3.j(null, arrayList2);
                return sbi.a;
            case 5:
                ch3.d0(obj);
                euf eufVar = (euf) this.g;
                zv8[] zv8VarArr = euf.z;
                eufVar.F().c("app.media.load.roaming", this.f);
                eufVar.n.setValue(eufVar.E());
                return sbi.a;
            case 6:
                ch3.d0(obj);
                ((cf7) this.g).invoke(Boolean.valueOf(this.f));
                return sbi.a;
            case 7:
                ch3.d0(obj);
                if (!((hli) this.g).h.b()) {
                    ze2 ze2VarA = ((hli) this.g).a.a();
                    boolean z6 = this.f;
                    kb2 kb2Var = ze2VarA.e;
                    synchronized (kb2Var.p) {
                        kb2Var.q = z6;
                    }
                } else if (tvj.f(3, "CXCP")) {
                    Log.d("CXCP", "UseCaseCamera is closed before setActiveResumeMode, skipping setup.");
                }
                return sbi.a;
            default:
                ch3.d0(obj);
                ioj iojVar = (ioj) this.g;
                boolean z7 = this.f;
                iojVar.q1 = z7;
                if (iojVar.p1) {
                    ((f9b) ((nni) iojVar.s.getValue()).g.getValue()).setValue(Boolean.valueOf(z7));
                }
                return sbi.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ in(Object obj, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ in(Object obj, boolean z, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
        this.f = z;
    }
}
