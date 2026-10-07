package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class qo4 {
    public static final /* synthetic */ zv8[] k;
    public final gu4 a;
    public final gjg b;
    public final gvb c;
    public final ny8 d;
    public final ny8 e;
    public final p3c f = qyj.S();
    public final ifh g;
    public final r8e h;
    public final mjg i;
    public final r8e j;

    static {
        z8b z8bVar = new z8b(qo4.class, "searchJob", "getSearchJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        k = new zv8[]{z8bVar};
    }

    public qo4(dq4 dq4Var, gjg gjgVar, gvb gvbVar, ny8 ny8Var, ny8 ny8Var2) {
        this.a = dq4Var;
        this.b = gjgVar;
        this.c = gvbVar;
        this.d = ny8Var;
        this.e = ny8Var2;
        ifh ifhVar = new ifh(new d2(14, this));
        this.g = ifhVar;
        this.h = new r8e((f9b) ifhVar.getValue());
        mjg mjgVarA = p90.a(vj4.d);
        this.i = mjgVarA;
        this.j = new r8e(mjgVarA);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0051  */
    /* JADX WARN: Code duplicated, block: B:20:0x0063  */
    /* JADX WARN: Code duplicated, block: B:22:0x0067  */
    /* JADX WARN: Code duplicated, block: B:28:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x0010 A[SYNTHETIC] */
    public static final ArrayList a(qo4 qo4Var, List list, String str) {
        CharSequence charSequence;
        qo4Var.getClass();
        ny8 ny8Var = qo4Var.e;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            ek4 ek4Var = (ek4) obj;
            List list2 = ek4Var.d;
            if (list2 != null) {
                List list3 = list2;
                if ((list3 instanceof Collection) && list3.isEmpty()) {
                    if (!((daf) ny8Var.getValue()).g(ek4Var.b.toString(), str)) {
                        charSequence = ek4Var.c;
                        if (charSequence != null ? ((daf) ny8Var.getValue()).g(charSequence.toString(), str) : false) {
                        }
                    }
                    arrayList.add(obj);
                } else {
                    Iterator it = list3.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (z5h.K0(String.valueOf(((Number) it.next()).longValue()), str, false)) {
                            }
                        } else if (!((daf) ny8Var.getValue()).g(ek4Var.b.toString(), str)) {
                            charSequence = ek4Var.c;
                            if (charSequence != null ? ((daf) ny8Var.getValue()).g(charSequence.toString(), str) : false) {
                            }
                        }
                        arrayList.add(obj);
                    }
                }
            } else {
                if (!((daf) ny8Var.getValue()).g(ek4Var.b.toString(), str)) {
                    charSequence = ek4Var.c;
                    if (charSequence != null ? ((daf) ny8Var.getValue()).g(charSequence.toString(), str) : false) {
                    }
                }
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void b() {
        ((f9b) this.g.getValue()).setValue(null);
        vo8 vo8Var = (vo8) this.f.m(this, k[0]);
        if (vo8Var != null) {
            vo8Var.b(null);
        }
        mjg mjgVar = this.i;
        mjgVar.getClass();
        mjgVar.j(null, vj4.d);
    }
}
