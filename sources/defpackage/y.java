package defpackage;

import android.net.Uri;
import java.nio.file.Path;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class y extends a8j {
    public final e5d c;
    public final xn3 d;
    public final wzj e;
    public final ny8 f;
    public final ic6 g = new ic6(null);
    public final mjg h;
    public final r8e i;
    public sgg j;

    public y(ny8 ny8Var, e5d e5dVar, xn3 xn3Var, wzj wzjVar) {
        this.c = e5dVar;
        this.d = xn3Var;
        this.e = wzjVar;
        this.f = ny8Var;
        mjg mjgVarA = p90.a(r66.a);
        this.h = mjgVarA;
        this.i = new r8e(mjgVarA);
        yab.i0(this.b, null, 0, new s(this, null, 0), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object B(y yVar, rt2 rt2Var, nq4 nq4Var) {
        x xVar;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof x) {
            xVar = (x) nq4Var;
            int i = xVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                xVar.g = i - Integer.MIN_VALUE;
            } else {
                xVar = new x(yVar, nq4Var);
            }
        } else {
            xVar = new x(yVar, nq4Var);
        }
        Object objA = xVar.e;
        Object obj = hu4.a;
        int i2 = xVar.g;
        if (i2 == 0) {
            ch3.d0(objA);
            a4c a4cVar = gm0.f;
            a4c a4cVar2 = a4cVar != null ? a4cVar : null;
            if (a4cVar2 == null) {
                gm0.Y(y.class.getName(), "Early return in sendLogFileIntoSupportChat cuz of Log.log as? OneMeLoggerV2 is null");
                return sbiVar;
            }
            xVar.d = rt2Var;
            xVar.g = 1;
            objA = a4cVar2.a(xVar);
            if (objA == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            rt2Var = xVar.d;
            ch3.d0(objA);
        }
        w6g w6gVar = new w6g(7, Uri.fromFile(((Path) objA).toFile()).toString());
        long j = rt2Var.a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(w6gVar);
        yVar.e.c(new glf(new flf(j, arrayList)));
        return sbiVar;
    }

    public final void C() {
        sgg sggVar = this.j;
        int i = 1;
        if (sggVar == null || !sggVar.isActive()) {
            this.j = yab.i0(this.b, null, 0, new s(this, null, i), 3);
        }
    }
}
