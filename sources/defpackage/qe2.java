package defpackage;

import android.content.Context;
import androidx.camera.core.InitializationException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class qe2 {
    public final uvc a = new uvc(9);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, jj0] */
    /* JADX WARN: Type inference failed for: r11v5, types: [r66] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.util.ArrayList] */
    public final jj0 a(Context context, yg0 yg0Var, fh2 fh2Var, long j, ui2 ui2Var, h6f h6fVar) throws InitializationException {
        ?? arrayList;
        ifh ifhVar = new ifh(new ja1(this, context, yg0Var, j == -1 ? null : new hw5(j), 2));
        if (ui2Var == null) {
            ui2Var = new ui2(dhc.a(new si2().a));
        }
        ?? jj0Var = new jj0();
        jj0Var.a = ifhVar;
        jj0Var.b = fh2Var;
        jj0Var.c = h6fVar;
        jj0Var.d = ui2Var;
        jj0Var.e = new je2((lg2) ifhVar.getValue(), ((lg2) ifhVar.getValue()).b());
        ifh ifhVar2 = new ifh(new ja1(context, yg0Var, jj0Var, this.a, 1));
        jj0Var.g = ifhVar2;
        jj0Var.h = c76.a;
        jj0Var.i = new Object();
        jj0Var.j = new AtomicBoolean(false);
        ArrayList arrayListA = me2.a(((r05) ifhVar2.getValue()).a());
        if (arrayListA != null) {
            arrayList = new ArrayList(yw3.W0(arrayListA, 10));
            Iterator it = arrayListA.iterator();
            while (it.hasNext()) {
                arrayList.add(((ef2) it.next()).a);
            }
        } else {
            arrayList = r66.a;
        }
        jj0Var.f = new x70(((lg2) ((ifh) jj0Var.a).getValue()).b().c().b.k, cqk.a(ch3.m(yg0Var.a)), (List) arrayList, context);
        jj0Var.g(arrayList);
        return jj0Var;
    }
}
