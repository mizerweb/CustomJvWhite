package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class qrk {
    public static final fvi a(t2 t2Var) {
        fvi fviVar;
        if (t2Var instanceof mxi) {
            fviVar = ((mxi) t2Var).c;
        } else {
            if (!(t2Var instanceof lzi)) {
                return null;
            }
            fviVar = ((lzi) t2Var).h;
        }
        y0e y0eVar = fviVar.a;
        float f = fviVar.b;
        float f2 = fviVar.c;
        List list = fviVar.d;
        boolean z = fviVar.e;
        a70 a70Var = new a70(1);
        a70Var.a = y0eVar;
        a70Var.b = f;
        a70Var.c = f2;
        a70Var.d = list;
        a70Var.e = z;
        return new fvi(a70Var);
    }

    public static String b(int i) {
        if (i != -1) {
            return i != 0 ? String.valueOf(i) : "RESULT_CANCELED";
        }
        return "RESULT_OK";
    }
}
