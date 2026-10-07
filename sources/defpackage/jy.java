package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class jy extends aq implements qih {
    public final int f;
    public final long[] g;

    public jy(int i, long j, long[] jArr) {
        super(j);
        this.f = i;
        this.g = jArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [lq4] */
    /* JADX WARN: Type inference failed for: r3v2 */
    @Override // defpackage.qih
    public final void b(kih kihVar) {
        ly lyVar = (ly) kihVar;
        int iD = qt4.D(this.f);
        bq bqVar = 0;
        if (iD == 1) {
            bq bqVar2 = this.e;
            if (bqVar2 == null) {
                bqVar2 = null;
            }
            vdh vdhVar = (vdh) bqVar2.o.getValue();
            List list = lyVar.c;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(pm9.o((dlg) it.next()));
            }
            vdhVar.f(arrayList);
            bq bqVar3 = this.e;
            ldh ldhVar = (ldh) (bqVar3 != null ? bqVar3 : 0).r.getValue();
            List list2 = lyVar.c;
            ArrayList arrayList2 = new ArrayList(yw3.W0(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Long.valueOf(((dlg) it2.next()).k));
            }
            ldhVar.q(arrayList2);
            return;
        }
        if (iD != 2) {
            return;
        }
        bq bqVar4 = this.e;
        if (bqVar4 == null) {
            bqVar4 = null;
        }
        ceh cehVar = (ceh) bqVar4.p.getValue();
        List<fmg> list3 = lyVar.d;
        cehVar.getClass();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (fmg fmgVar : list3) {
            arrayList3.addAll(((vdh) cehVar.b.getValue()).e(fmgVar.h));
            arrayList4.add(ceh.d(fmgVar));
        }
        if (!arrayList3.isEmpty()) {
            p90.K(arrayList3);
            Iterator it3 = p90.R(arrayList3).iterator();
            while (it3.hasNext()) {
                ((pvb) cehVar.d.getValue()).b(2, (List) it3.next());
            }
        }
        if (!arrayList4.isEmpty()) {
            yab.i0((gu4) cehVar.c.getValue(), null, 0, new ryf(cehVar, arrayList4, bqVar, 19), 3);
        }
        bq bqVar5 = this.e;
        ldh ldhVar2 = (ldh) (bqVar5 != null ? bqVar5 : null).r.getValue();
        List list4 = lyVar.d;
        ArrayList arrayList5 = new ArrayList(yw3.W0(list4, 10));
        Iterator it4 = list4.iterator();
        while (it4.hasNext()) {
            arrayList5.add(Long.valueOf(((fmg) it4.next()).a));
        }
        ldhVar2.q(arrayList5);
    }

    @Override // defpackage.qih
    public final void f(yhh yhhVar) {
        String string = yhhVar.toString();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            a4c.f(a4cVar, je9.g, "jy", string, null, null, 8);
        }
    }

    @Override // defpackage.aq
    public final Object m() {
        return new ky(this.f, this.g);
    }
}
