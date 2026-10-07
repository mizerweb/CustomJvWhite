package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class do4 implements dzc {
    public static final /* synthetic */ zv8[] l;
    public final xde a;
    public final long b;
    public final t73 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public gu4 h;
    public final p3c i = qyj.S();
    public final pzf j;
    public final q8e k;

    static {
        z8b z8bVar = new z8b(do4.class, "collectJob", "getCollectJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        l = new zv8[]{z8bVar};
    }

    public do4(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, xde xdeVar, long j, t73 t73Var) {
        this.a = xdeVar;
        this.b = j;
        this.c = t73Var;
        this.d = ny8Var;
        this.e = ny8Var2;
        this.f = ny8Var3;
        this.g = ny8Var4;
        pzf pzfVarB = e9i.b(0, Integer.MAX_VALUE, 5);
        this.j = pzfVarB;
        this.k = new q8e(pzfVarB);
    }

    public static final Object f(do4 do4Var, mdh mdhVar) {
        ek4 ek4Var;
        Object next;
        List listT1 = ww3.T1(do4Var.a.r());
        vj4 vj4Var = (vj4) ((hk4) do4Var.d.getValue()).b().getValue();
        if (!vj4Var.b()) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = listT1.size();
            for (int i = 0; i < size; i++) {
                xyc xycVar = (xyc) listT1.get(i);
                int i2 = xycVar.c;
                long j = xycVar.a;
                int i3 = bo4.$EnumSwitchMapping$0[qt4.D(i2)];
                Object obj = null;
                ek4 ek4Var2 = null;
                if (i3 == 1) {
                    List list = vj4Var.c;
                    if (list != null) {
                        Iterator it = list.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (((ek4) next).a != j);
                        ek4Var = (ek4) next;
                    } else {
                        ek4Var = null;
                    }
                    if (ek4Var != null) {
                        long j2 = ek4Var.a;
                        String string = ek4Var.b.toString();
                        Uri uri = ek4Var.g;
                        arrayList2.add(new ptc(j2, string, uri != null ? uri.toString() : null));
                    }
                } else if (i3 == 2 || i3 == 3) {
                    List list2 = vj4Var.a;
                    if (list2 != null) {
                        for (Object obj2 : list2) {
                            if (((ek4) obj2).a == j) {
                                obj = obj2;
                                break;
                            }
                        }
                        ek4Var2 = (ek4) obj;
                    }
                    if (ek4Var2 != null) {
                        arrayList.add(Long.valueOf(ek4Var2.a));
                    }
                }
            }
            Object objEmit = do4Var.j.emit(new xn4(new nl4(arrayList, arrayList2)), mdhVar);
            if (objEmit == hu4.a) {
                return objEmit;
            }
        }
        return sbi.a;
    }

    @Override // defpackage.dzc
    public final void a(dq4 dq4Var) {
        this.h = dq4Var;
    }

    @Override // defpackage.dzc
    public final void b() {
        this.h = null;
    }

    @Override // defpackage.dzc
    public final void c(xyc xycVar) {
        this.a.L(xycVar);
    }

    @Override // defpackage.dzc
    public final void e(long j) {
        this.a.H(j);
    }
}
