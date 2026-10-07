package defpackage;

import android.net.Uri;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class quc {
    public final vvc a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;

    public quc(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, vvc vvcVar) {
        this.a = vvcVar;
        this.b = ny8Var;
        this.c = ny8Var3;
        this.d = ny8Var4;
        this.e = ny8Var2;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00be  */
    /* JADX WARN: Code duplicated, block: B:60:0x00de  */
    public final g58 a(o60 o60Var, e70 e70Var, n11 n11Var, long j, long j2) {
        Uri uriFromFile;
        Uri uri;
        Uri uriB;
        Uri uri2;
        String strB;
        String str;
        ny8 ny8Var = this.e;
        ny8 ny8Var2 = this.d;
        vvc vvcVar = this.a;
        boolean z = o60Var.e;
        o60 o60Var2 = e70Var.b;
        String str2 = e70Var.u;
        u60 u60Var = e70Var.q;
        us0 us0Var = (us0) n11Var.c;
        if (o60Var.i > 0 && (u60Var.a() || (u60Var == u60.d && !b(o60Var, e70Var)))) {
            return g58.p;
        }
        String strB2 = o60Var.b(us0Var);
        Uri uri3 = null;
        if (z) {
            rs6 rs6Var = (rs6) this.c.getValue();
            String str3 = o60Var2 != null ? o60Var2.j : null;
            File fileM = (str3 == null || str3.length() == 0 || str2.length() != 0) ? ((ju6) rs6Var).m(e70Var.t) : ((ju6) rs6Var).m(String.valueOf(o60Var2.i));
            uriB = fileM.exists() ? Uri.fromFile(fileM) : null;
            if (str2 == null || str2.length() == 0 || !new File(str2).exists()) {
                strB = o60Var.b(us0Var);
                if (strB != null || (uri = Uri.parse(strB)) == null) {
                    str = o60Var.k;
                    if (str != null) {
                        uri = Uri.parse(str);
                    } else {
                        uri = null;
                    }
                }
            } else {
                int i = rx8.p;
                if (str2.endsWith(".mp4")) {
                    strB = o60Var.b(us0Var);
                    if (strB != null) {
                        str = o60Var.k;
                        if (str != null) {
                            uri = Uri.parse(str);
                        } else {
                            uri = null;
                        }
                    } else {
                        str = o60Var.k;
                        if (str != null) {
                            uri = Uri.parse(str);
                        } else {
                            uri = null;
                        }
                    }
                } else {
                    String strL = sb8.L(str2);
                    if (ch3.r(strL)) {
                        uri = null;
                    } else {
                        uri = Uri.parse(strL);
                    }
                }
            }
            if (uriB == null && uri != null) {
                uriB = uri;
            }
        } else {
            if (str2 == null || str2.length() == 0) {
                uriFromFile = null;
            } else {
                File file = new File(str2);
                if (file.exists()) {
                    uriFromFile = Uri.fromFile(file);
                } else {
                    uriFromFile = null;
                }
            }
            if (uriFromFile == null) {
                uriFromFile = ch3.r(strB2) ? null : Uri.parse(strB2);
            }
            uri = uriFromFile;
            uriB = ((t75) ny8Var2.getValue()).b(e70Var, true);
            if (uri == null && uriB == null) {
                return g58.p;
            }
        }
        y60 y60Var = e70Var.a;
        y60 y60Var2 = y60.c;
        boolean z2 = !(y60Var == y60Var2 && z) ? y60Var != y60Var2 || ((x13) ny8Var.getValue()).c() || u60Var.h() : ((x13) ny8Var.getValue()).a(true) || u60Var.h();
        if (uri != null) {
            uri2 = uri;
        } else {
            if (uriB == null) {
                return g58.p;
            }
            uri2 = uriB;
        }
        long j3 = o60Var.i;
        int i2 = o60Var.c;
        int i3 = o60Var.d;
        boolean z3 = o60Var.e;
        int iIntValue = ((Number) vvcVar.c.getValue()).intValue();
        if (uriB == null) {
            uriB = ((t75) ny8Var2.getValue()).b(e70Var, true);
        }
        Uri uri4 = uriB;
        bne bneVarA = vvcVar.a(o60Var.c, o60Var.d);
        String str4 = e70Var.t;
        String str5 = o60Var.j;
        if (str5 != null && !r5h.X0(str5)) {
            uri3 = Uri.parse(str5);
        }
        return new g58(j3, uri2, i2, i3, z3, iIntValue, z2, uri4, bneVarA, str4, uri3, o60Var.b(us0Var), j, j2, np0.o);
    }

    public final boolean b(o60 o60Var, e70 e70Var) {
        if (o60Var.e) {
            return false;
        }
        u60 u60Var = e70Var.q;
        u60Var.getClass();
        if (u60Var != u60.d) {
            return false;
        }
        ghb ghbVar = ew5.b;
        long jF = ((s7f) ((et3) this.b.getValue())).f();
        lw5 lw5Var = lw5.MILLISECONDS;
        return ew5.d(ew5.o(qe7.P(jF, lw5Var), qe7.P(e70Var.r, lw5Var)), ruc.a) > 0;
    }
}
