package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class ueb extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ xeb g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ueb(xeb xebVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = xebVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        xeb xebVar = this.g;
        switch (i) {
            case 0:
                ueb uebVar = new ueb(xebVar, lq4Var, 0);
                uebVar.f = obj;
                return uebVar;
            default:
                ueb uebVar2 = new ueb(xebVar, lq4Var, 1);
                uebVar2.f = obj;
                return uebVar2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((ueb) create((fgd) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((ueb) create((fef) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                sbi sbiVar = sbi.a;
                fgd fgdVar = (fgd) this.f;
                ch3.d0(obj);
                if (fgdVar != null) {
                    udb udbVar = fgdVar.c;
                    mjg mjgVar = this.g.p;
                    LinkedHashMap linkedHashMap = fgdVar.a;
                    mjgVar.getClass();
                    mjgVar.j(null, linkedHashMap);
                    mjg mjgVar2 = this.g.g;
                    ArrayList arrayList = fgdVar.b;
                    mjgVar2.getClass();
                    mjgVar2.j(null, arrayList);
                    if (udbVar != null) {
                        this.g.f = udbVar;
                        this.g.e.e(udbVar);
                    }
                }
                return sbiVar;
            default:
                fef fefVar = (fef) this.f;
                ch3.d0(obj);
                eef eefVar = fefVar.a;
                cef cefVar = eefVar instanceof cef ? (cef) eefVar : null;
                Long l = cefVar != null ? new Long(cefVar.c) : null;
                a2d a2dVar = fefVar.b;
                y1d y1dVar = a2dVar instanceof y1d ? (y1d) a2dVar : null;
                Long l2 = y1dVar != null ? new Long(y1dVar.b) : null;
                if (l == null) {
                    l = l2;
                }
                mjg mjgVar3 = this.g.g;
                Iterable<udb> iterable = (Iterable) mjgVar3.getValue();
                ArrayList arrayList2 = new ArrayList(yw3.W0(iterable, 10));
                for (udb udbVar2 : iterable) {
                    arrayList2.add(udb.C(udbVar2, l != null && udbVar2.a == l.longValue()));
                }
                mjgVar3.getClass();
                mjgVar3.j(null, arrayList2);
                return sbi.a;
        }
    }
}
