package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes.dex */
public final class x4h extends lvb implements gt8 {
    public final qs8 f;
    public final w0k g;
    public final vyh h;
    public final khb i;
    public int j;
    public final at8 k;
    public final lt8 l;

    public x4h(qs8 qs8Var, w0k w0kVar, vyh vyhVar, fif fifVar) {
        super(4);
        this.f = qs8Var;
        this.g = w0kVar;
        this.h = vyhVar;
        this.i = qs8Var.b;
        this.j = -1;
        at8 at8Var = qs8Var.a;
        this.k = at8Var;
        this.l = at8Var.d ? null : new lt8(fifVar);
    }

    @Override // defpackage.lvb, defpackage.r55
    public final boolean A() {
        lt8 lt8Var = this.l;
        return ((lt8Var != null ? lt8Var.a() : false) || this.h.J(true)) ? false : true;
    }

    @Override // defpackage.gt8
    public final qs8 B() {
        return this.f;
    }

    @Override // defpackage.lvb, defpackage.r55
    public final byte D() {
        vyh vyhVar = this.h;
        long jK = vyhVar.k();
        byte b = (byte) jK;
        if (jK == b) {
            return b;
        }
        vyh.q(vyhVar, "Failed to parse byte for input '" + jK + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.lvb, defpackage.r55
    public final v74 a(fif fifVar) {
        qs8 qs8Var = this.f;
        w0k w0kVarE0 = lvb.E0(qs8Var, fifVar);
        vyh vyhVar = this.h;
        hle hleVar = (hle) vyhVar.c;
        int i = hleVar.b + 1;
        hleVar.b = i;
        Object[] objArr = (Object[]) hleVar.c;
        if (i == objArr.length) {
            int i2 = i * 2;
            hleVar.c = Arrays.copyOf(objArr, i2);
            hleVar.d = Arrays.copyOf((int[]) hleVar.d, i2);
        }
        ((Object[]) hleVar.c)[i] = fifVar;
        vyhVar.j(w0kVarE0.a);
        if (vyhVar.E() == 4) {
            vyh.q(vyhVar, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        int iOrdinal = w0kVarE0.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
            return new x4h(qs8Var, w0kVarE0, vyhVar, fifVar);
        }
        return (this.g == w0kVarE0 && qs8Var.a.d) ? this : new x4h(qs8Var, w0kVarE0, vyhVar, fifVar);
    }

    @Override // defpackage.v74
    public final khb b() {
        return this.i;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:37:0x00fc  */
    /* JADX WARN: Instruction removed from duplicated block: B:37:0x00fc, please report this as an issue */
    @Override // defpackage.lvb, defpackage.r55
    public final Object d(aw8 aw8Var) {
        qs8 qs8Var = this.f;
        vyh vyhVar = this.h;
        hle hleVar = (hle) vyhVar.c;
        try {
            if (!(aw8Var instanceof f3)) {
                return aw8Var.c(this);
            }
            String strD = vyhVar.D(tjl.a(qs8Var, ((uad) ((f3) aw8Var)).d()), this.k.c);
            if (strD != null) {
                try {
                    wjl.a((f3) aw8Var, this, strD);
                    throw null;
                } catch (SerializationException e) {
                    String message = e.getMessage();
                    int iU0 = r5h.U0(message, '\n', 0, 6);
                    if (iU0 != -1) {
                        message = message.substring(0, iU0);
                    }
                    vyh.q(vyhVar, r5h.g1(message, "."), 0, r5h.p1('\n', e.getMessage(), ""), 2);
                    throw null;
                }
            }
            String strA = tjl.a(qs8Var, ((uad) ((f3) aw8Var)).d());
            jt8 jt8VarF = f();
            String strI = ((uad) ((f3) aw8Var)).d().i();
            if (jt8VarF instanceof cu8) {
                cu8 cu8Var = (cu8) jt8VarF;
                jt8 jt8Var = (jt8) cu8Var.get(strA);
                try {
                    wjl.a((f3) aw8Var, this, jt8Var != null ? kt8.e(kt8.h(jt8Var)) : null);
                    throw null;
                } catch (SerializationException e2) {
                    throw xd2.e(e2.getMessage(), cu8Var.toString(), -1);
                }
            }
            throw xd2.e("Expected " + zfe.a(cu8.class).h() + ", but had " + zfe.a(jt8VarF.getClass()).h() + " as the serialized body of " + strI + " at element: " + hleVar.g(), jt8VarF.toString(), -1);
            if (r5h.L0(e.getMessage(), "at path", false)) {
                throw e;
            }
            throw new MissingFieldException(e.a, e.getMessage() + " at path: " + hleVar.g(), e);
        } catch (MissingFieldException e3) {
            if (r5h.L0(e3.getMessage(), "at path", false)) {
                throw e3;
            }
            throw new MissingFieldException(e3.a, e3.getMessage() + " at path: " + hleVar.g(), e3);
        }
    }

    @Override // defpackage.gt8
    public final jt8 f() {
        at8 at8Var = this.f.a;
        s84 s84Var = new s84();
        s84Var.c = this.h;
        s84Var.b = at8Var.c;
        return s84Var.b();
    }

    @Override // defpackage.lvb, defpackage.r55
    public final int i() {
        vyh vyhVar = this.h;
        long jK = vyhVar.k();
        int i = (int) jK;
        if (jK == i) {
            return i;
        }
        vyh.q(vyhVar, "Failed to parse int for input '" + jK + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.lvb, defpackage.v74
    public final void j(fif fifVar) {
        if (this.f.a.b && fifVar.e() == 0) {
            while (v(fifVar) != -1) {
            }
        }
        vyh vyhVar = this.h;
        if (vyhVar.I()) {
            xd2.i(vyhVar, "");
            throw null;
        }
        vyhVar.j(this.g.b);
        hle hleVar = (hle) vyhVar.c;
        int i = hleVar.b;
        int[] iArr = (int[]) hleVar.d;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            hleVar.b = i - 1;
        }
        int i2 = hleVar.b;
        if (i2 != -1) {
            hleVar.b = i2 - 1;
        }
    }

    @Override // defpackage.lvb, defpackage.r55
    public final r55 k(fif fifVar) {
        return z4h.b(fifVar) ? new ht8(this.h, this.f) : this;
    }

    @Override // defpackage.lvb, defpackage.r55
    public final long m() {
        return this.h.k();
    }

    @Override // defpackage.lvb, defpackage.r55
    public final short o() {
        vyh vyhVar = this.h;
        long jK = vyhVar.k();
        short s = (short) jK;
        if (jK == s) {
            return s;
        }
        vyh.q(vyhVar, "Failed to parse short for input '" + jK + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.lvb, defpackage.r55
    public final float p() {
        vyh vyhVar = this.h;
        String strM = vyhVar.m();
        try {
            float f = Float.parseFloat(strM);
            if (!Float.isInfinite(f) && !Float.isNaN(f)) {
                return f;
            }
            xd2.m(vyhVar, Float.valueOf(f));
            throw null;
        } catch (IllegalArgumentException unused) {
            vyh.q(vyhVar, qv1.g('\'', "Failed to parse type 'float' for input '", strM), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.lvb, defpackage.r55
    public final double r() {
        vyh vyhVar = this.h;
        String strM = vyhVar.m();
        try {
            double d = Double.parseDouble(strM);
            if (!Double.isInfinite(d) && !Double.isNaN(d)) {
                return d;
            }
            xd2.m(vyhVar, Double.valueOf(d));
            throw null;
        } catch (IllegalArgumentException unused) {
            vyh.q(vyhVar, qv1.g('\'', "Failed to parse type 'double' for input '", strM), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.lvb, defpackage.r55
    public final boolean s() {
        boolean z;
        boolean z2;
        vyh vyhVar = this.h;
        int iH = vyhVar.H();
        String str = (String) vyhVar.f;
        if (iH == str.length()) {
            vyh.q(vyhVar, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(iH) == '\"') {
            iH++;
            z = true;
        } else {
            z = false;
        }
        int iG = vyhVar.G(iH);
        if (iG >= str.length() || iG == -1) {
            vyh.q(vyhVar, "EOF", 0, null, 6);
            throw null;
        }
        int i = iG + 1;
        int iCharAt = str.charAt(iG) | ' ';
        if (iCharAt == 102) {
            vyhVar.f(i, "alse");
            z2 = false;
        } else {
            if (iCharAt != 116) {
                vyh.q(vyhVar, "Expected valid boolean literal prefix, but had '" + vyhVar.m() + '\'', 0, null, 6);
                throw null;
            }
            vyhVar.f(i, "rue");
            z2 = true;
        }
        if (!z) {
            return z2;
        }
        if (vyhVar.b == str.length()) {
            vyh.q(vyhVar, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(vyhVar.b) == '\"') {
            vyhVar.b++;
            return z2;
        }
        vyh.q(vyhVar, "Expected closing quotation mark", 0, null, 6);
        throw null;
    }

    @Override // defpackage.lvb, defpackage.r55
    public final char t() {
        vyh vyhVar = this.h;
        String strM = vyhVar.m();
        if (strM.length() == 1) {
            return strM.charAt(0);
        }
        vyh.q(vyhVar, qv1.g('\'', "Expected single char, but got '", strM), 0, null, 6);
        throw null;
    }

    @Override // defpackage.v74
    public final int v(fif fifVar) {
        boolean zI;
        boolean z;
        boolean z2;
        String strF;
        vyh vyhVar = this.h;
        hle hleVar = (hle) vyhVar.c;
        String str = (String) vyhVar.f;
        w0k w0kVar = this.g;
        int iOrdinal = w0kVar.ordinal();
        char c = ':';
        boolean zI2 = false;
        boolean z3 = true;
        int iC = -1;
        if (iOrdinal == 0) {
            boolean zI3 = vyhVar.I();
            while (true) {
                boolean zE = vyhVar.e();
                lt8 lt8Var = this.l;
                if (zE) {
                    at8 at8Var = this.k;
                    boolean z4 = at8Var.c;
                    String strN = z4 ? vyhVar.n() : vyhVar.g();
                    vyhVar.j(c);
                    qs8 qs8Var = this.f;
                    iC = oc9.N(fifVar, qs8Var, strN);
                    if (iC != -3) {
                        if (at8Var.f) {
                            boolean zJ = fifVar.j(iC);
                            fif fifVarH = fifVar.h(iC);
                            if (!zJ || fifVarH.b() || !vyhVar.J(z3)) {
                                if (cqk.d(fifVarH.d(), lif.f) && ((!fifVarH.b() || !vyhVar.J(false)) && (strF = vyhVar.F(z4)) != null)) {
                                    int iN = oc9.N(fifVarH, qs8Var, strF);
                                    boolean z5 = !qs8Var.a.d && fifVarH.b();
                                    if (iN == -3 && (zJ || z5)) {
                                        vyhVar.l();
                                    }
                                }
                            }
                            zI = vyhVar.I();
                            z = false;
                        }
                        if (lt8Var != null) {
                            lt8Var.b(iC);
                        }
                    } else {
                        zI = false;
                        z = true;
                    }
                    if (!z) {
                        zI3 = zI;
                        c = ':';
                        z3 = true;
                    } else {
                        if (!at8Var.b) {
                            vyhVar.p(r5h.Z0(strN, str.subSequence(0, vyhVar.b).toString(), 6), qv1.g('\'', "Encountered an unknown key '", strN), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
                            throw null;
                        }
                        ArrayList arrayList = new ArrayList();
                        byte bE = vyhVar.E();
                        if (bE == 8 || bE == 6) {
                            while (true) {
                                byte bE2 = vyhVar.E();
                                z2 = true;
                                if (bE2 != 1) {
                                    if (bE2 == 8 || bE2 == 6) {
                                        arrayList.add(Byte.valueOf(bE2));
                                    } else if (bE2 == 9) {
                                        if (((Number) ww3.B1(arrayList)).byteValue() != 8) {
                                            throw xd2.e("found ] instead of } at path: " + hleVar, str, vyhVar.b);
                                        }
                                        cx3.f1(arrayList);
                                    } else if (bE2 == 7) {
                                        if (((Number) ww3.B1(arrayList)).byteValue() != 6) {
                                            throw xd2.e("found } instead of ] at path: " + hleVar, str, vyhVar.b);
                                        }
                                        cx3.f1(arrayList);
                                    } else if (bE2 == 10) {
                                        vyh.q(vyhVar, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6);
                                        throw null;
                                    }
                                    vyhVar.h();
                                    if (arrayList.size() == 0) {
                                        break;
                                    }
                                } else if (z4) {
                                    vyhVar.m();
                                } else {
                                    vyhVar.g();
                                }
                            }
                        } else {
                            vyhVar.m();
                            z2 = true;
                        }
                        zI3 = vyhVar.I();
                        z3 = z2;
                        c = ':';
                    }
                } else {
                    if (zI3) {
                        xd2.j(vyhVar);
                        throw null;
                    }
                    iC = lt8Var != null ? lt8Var.c() : -1;
                }
            }
        } else if (iOrdinal != 2) {
            boolean zI4 = vyhVar.I();
            if (vyhVar.e()) {
                int i = this.j;
                if (i != -1 && !zI4) {
                    vyh.q(vyhVar, "Expected end of the array or comma", 0, null, 6);
                    throw null;
                }
                iC = i + 1;
                this.j = iC;
            } else if (zI4) {
                xd2.i(vyhVar, "array");
                throw null;
            }
        } else {
            int i2 = this.j;
            boolean z6 = i2 % 2 != 0;
            if (!z6) {
                vyhVar.j(':');
            } else if (i2 != -1) {
                zI2 = vyhVar.I();
            }
            if (vyhVar.e()) {
                if (z6) {
                    int i3 = this.j;
                    int i4 = vyhVar.b;
                    if (i3 == -1) {
                        if (zI2) {
                            vyh.q(vyhVar, "Unexpected leading comma", i4, null, 4);
                            throw null;
                        }
                    } else if (!zI2) {
                        vyh.q(vyhVar, "Expected comma after the key-value pair", i4, null, 4);
                        throw null;
                    }
                }
                iC = this.j + 1;
                this.j = iC;
            } else if (zI2) {
                xd2.j(vyhVar);
                throw null;
            }
        }
        if (w0kVar != w0k.MAP) {
            ((int[]) hleVar.d)[hleVar.b] = iC;
        }
        return iC;
    }

    @Override // defpackage.lvb, defpackage.v74
    public final Object x(fif fifVar, int i, aw8 aw8Var, Object obj) {
        hle hleVar = (hle) this.h.c;
        boolean z = this.g == w0k.MAP && (i & 1) == 0;
        if (z) {
            int[] iArr = (int[]) hleVar.d;
            int i2 = hleVar.b;
            if (iArr[i2] == -2) {
                ((Object[]) hleVar.c)[i2] = ldf.h;
            }
        }
        Object objD = d(aw8Var);
        if (z) {
            int[] iArr2 = (int[]) hleVar.d;
            int i3 = hleVar.b;
            if (iArr2[i3] != -2) {
                int i4 = i3 + 1;
                hleVar.b = i4;
                Object[] objArr = (Object[]) hleVar.c;
                if (i4 == objArr.length) {
                    int i5 = i4 * 2;
                    hleVar.c = Arrays.copyOf(objArr, i5);
                    hleVar.d = Arrays.copyOf((int[]) hleVar.d, i5);
                }
            }
            Object[] objArr2 = (Object[]) hleVar.c;
            int i6 = hleVar.b;
            objArr2[i6] = objD;
            ((int[]) hleVar.d)[i6] = -2;
        }
        return objD;
    }

    @Override // defpackage.lvb, defpackage.r55
    public final String y() {
        boolean z = this.k.c;
        vyh vyhVar = this.h;
        return z ? vyhVar.n() : vyhVar.l();
    }

    @Override // defpackage.lvb, defpackage.r55
    public final int z(fif fifVar) {
        return oc9.O(fifVar, this.f, y(), " at path ".concat(((hle) this.h.c).g()));
    }
}
