package defpackage;

import android.content.Context;
import java.util.List;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzl {
    public static final qn7 a(zxd zxdVar, Context context, p4c p4cVar, j7c j7cVar) {
        xcd xcdVar;
        List list = zxdVar.b;
        gm4 gm4Var = zxdVar.c;
        if (gm4Var == null) {
            return null;
        }
        pj4 pj4Var = gm4Var.a;
        nb nbVar = new nb(p4cVar, j7cVar, zxdVar, context, 2);
        String strA = pj4Var.a();
        ix2 ix2Var = pj4Var.s;
        xcd xcdVar2 = (strA == null || strA.length() == 0) ? new xcd("", new String[0]) : (xcd) nbVar.invoke(pj4Var.a());
        String strB = xoh.b(pj4Var.l);
        if (ix2Var.h() && ix2Var.j()) {
            xcdVar = new xcd(context.getString(R.string.service_notifications), new String[0]);
        } else if (ix2Var.h()) {
            xcdVar = new xcd(context.getString(R.string.bot), new String[0]);
        } else {
            xcdVar = j7cVar.f(strB, list) ? (xcd) nbVar.invoke(strB) : new xcd("", new String[0]);
        }
        xcd xcdVar3 = xcdVar;
        long j = pj4Var.a;
        String strA2 = pj4Var.a();
        if (strA2 == null) {
            strA2 = "";
        }
        return new qn7(j, strA2, xcdVar2, xcdVar3, (ix2Var.b & 1) != 0, sb8.K(pj4Var.d(us0.c)), pj4Var, list);
    }

    public static int b(int i) {
        return i & 15;
    }
}
