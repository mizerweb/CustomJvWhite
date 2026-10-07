package defpackage;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class ih4 {
    public final ny8 a;
    public final ny8 b;

    public ih4(ny8 ny8Var, ny8 ny8Var2) {
        this.a = ny8Var;
        this.b = ny8Var2;
    }

    public final String a(vg4 vg4Var, f60 f60Var) {
        String str = f60Var.h;
        String str2 = f60Var.g;
        if (vg4Var != null) {
            return vg4Var.A(((s7f) ((et3) this.b.getValue())).k());
        }
        if (f60Var.d.length() <= 0) {
            return null;
        }
        if (str2.length() <= 0 && str.length() <= 0) {
            return null;
        }
        if (str.length() == 0) {
            str = str2;
        }
        return sb8.L(str);
    }

    public final vg4 b(f60 f60Var) {
        vg4 vg4VarA;
        long j = f60Var.b;
        if (j == 0 || (vg4VarA = ((no4) this.a.getValue()).a(j)) == null || vg4VarA.I() || !vg4VarA.B()) {
            return null;
        }
        return vg4VarA;
    }

    public final CharSequence c(f60 f60Var) {
        String str = f60Var.d;
        vg4 vg4VarB = b(f60Var);
        if (vg4VarB != null && ((String) vg4VarB.u()).length() > 0) {
            return vg4VarB.u();
        }
        if (str.length() <= 0) {
            return m3c.b("Unknown", null);
        }
        Pattern pattern = m3c.a;
        return m3c.b(str, f60Var.e);
    }

    public final String d(f60 f60Var) {
        String strK;
        String str = f60Var.d;
        vg4 vg4VarB = b(f60Var);
        if (vg4VarB != null && (strK = vg4VarB.k()) != null && strK.length() != 0) {
            String strK2 = vg4VarB.k();
            return strK2 == null ? "" : strK2;
        }
        if (str.length() <= 0) {
            return "Unknown";
        }
        String str2 = f60Var.e;
        return (str2 == null || str2.isEmpty()) ? str : zo5.p(str, " ", str2);
    }
}
