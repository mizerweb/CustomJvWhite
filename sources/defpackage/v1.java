package defpackage;

import java.util.ArrayList;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.internal.JsonDecodingException;

/* JADX INFO: loaded from: classes.dex */
public abstract class v1 implements gt8, r55, v74 {
    public final ArrayList a = new ArrayList();
    public boolean b;
    public final qs8 c;
    public final String d;
    public final at8 e;

    public v1(qs8 qs8Var, String str) {
        this.c = qs8Var;
        this.d = str;
        this.e = qs8Var.a;
    }

    @Override // defpackage.r55
    public boolean A() {
        return !(G() instanceof zt8);
    }

    @Override // defpackage.gt8
    public final qs8 B() {
        return this.c;
    }

    @Override // defpackage.v74
    public final boolean C(fif fifVar, int i) {
        return H(S(fifVar, i));
    }

    @Override // defpackage.r55
    public final byte D() {
        return I(U());
    }

    @Override // defpackage.v74
    public final double E(fif fifVar, int i) {
        return K(S(fifVar, i));
    }

    public abstract jt8 F(String str);

    public final jt8 G() {
        jt8 jt8VarF;
        String str = (String) ww3.D1(this.a);
        return (str == null || (jt8VarF = F(str)) == null) ? T() : jt8VarF;
    }

    public final boolean H(Object obj) {
        Boolean bool;
        String str = (String) obj;
        jt8 jt8VarF = F(str);
        if (!(jt8VarF instanceof pu8)) {
            throw xd2.e("Expected " + zfe.a(pu8.class).h() + ", but had " + zfe.a(jt8VarF.getClass()).h() + " as the serialized body of boolean at element: " + W(str), jt8VarF.toString(), -1);
        }
        pu8 pu8Var = (pu8) jt8VarF;
        try {
            hg8 hg8Var = kt8.a;
            String strA = pu8Var.a();
            String[] strArr = m5h.a;
            if (strA.equalsIgnoreCase("true")) {
                bool = Boolean.TRUE;
            } else {
                bool = strA.equalsIgnoreCase("false") ? Boolean.FALSE : null;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            X(pu8Var, "boolean", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            X(pu8Var, "boolean", str);
            throw null;
        }
    }

    public final byte I(Object obj) {
        String str = (String) obj;
        jt8 jt8VarF = F(str);
        if (!(jt8VarF instanceof pu8)) {
            throw xd2.e("Expected " + zfe.a(pu8.class).h() + ", but had " + zfe.a(jt8VarF.getClass()).h() + " as the serialized body of byte at element: " + W(str), jt8VarF.toString(), -1);
        }
        pu8 pu8Var = (pu8) jt8VarF;
        try {
            int iF = kt8.f(pu8Var);
            Byte bValueOf = (-128 > iF || iF > 127) ? null : Byte.valueOf((byte) iF);
            if (bValueOf != null) {
                return bValueOf.byteValue();
            }
            X(pu8Var, "byte", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            X(pu8Var, "byte", str);
            throw null;
        }
    }

    public final char J(Object obj) {
        String str = (String) obj;
        jt8 jt8VarF = F(str);
        if (jt8VarF instanceof pu8) {
            pu8 pu8Var = (pu8) jt8VarF;
            try {
                return r5h.j1(pu8Var.a());
            } catch (IllegalArgumentException unused) {
                X(pu8Var, "char", str);
                throw null;
            }
        }
        throw xd2.e("Expected " + zfe.a(pu8.class).h() + ", but had " + zfe.a(jt8VarF.getClass()).h() + " as the serialized body of char at element: " + W(str), jt8VarF.toString(), -1);
    }

    public final double K(Object obj) {
        String str = (String) obj;
        jt8 jt8VarF = F(str);
        if (!(jt8VarF instanceof pu8)) {
            throw xd2.e("Expected " + zfe.a(pu8.class).h() + ", but had " + zfe.a(jt8VarF.getClass()).h() + " as the serialized body of double at element: " + W(str), jt8VarF.toString(), -1);
        }
        pu8 pu8Var = (pu8) jt8VarF;
        try {
            hg8 hg8Var = kt8.a;
            double d = Double.parseDouble(pu8Var.a());
            at8 at8Var = this.c.a;
            if (Double.isInfinite(d) || Double.isNaN(d)) {
                throw xd2.a(Double.valueOf(d), str, G().toString());
            }
            return d;
        } catch (IllegalArgumentException unused) {
            X(pu8Var, "double", str);
            throw null;
        }
    }

    public final float L(Object obj) {
        String str = (String) obj;
        jt8 jt8VarF = F(str);
        if (!(jt8VarF instanceof pu8)) {
            throw xd2.e("Expected " + zfe.a(pu8.class).h() + ", but had " + zfe.a(jt8VarF.getClass()).h() + " as the serialized body of float at element: " + W(str), jt8VarF.toString(), -1);
        }
        pu8 pu8Var = (pu8) jt8VarF;
        try {
            hg8 hg8Var = kt8.a;
            float f = Float.parseFloat(pu8Var.a());
            at8 at8Var = this.c.a;
            if (Float.isInfinite(f) || Float.isNaN(f)) {
                throw xd2.a(Float.valueOf(f), str, G().toString());
            }
            return f;
        } catch (IllegalArgumentException unused) {
            X(pu8Var, "float", str);
            throw null;
        }
    }

    public final r55 M(Object obj, fif fifVar) {
        String str = (String) obj;
        if (!z4h.b(fifVar)) {
            this.a.add(str);
            return this;
        }
        jt8 jt8VarF = F(str);
        String strI = fifVar.i();
        if (jt8VarF instanceof pu8) {
            return new ht8(new vyh(((pu8) jt8VarF).a()), this.c);
        }
        throw xd2.e("Expected " + zfe.a(pu8.class).h() + ", but had " + zfe.a(jt8VarF.getClass()).h() + " as the serialized body of " + strI + " at element: " + W(str), jt8VarF.toString(), -1);
    }

    public final int N(Object obj) {
        String str = (String) obj;
        jt8 jt8VarF = F(str);
        if (jt8VarF instanceof pu8) {
            pu8 pu8Var = (pu8) jt8VarF;
            try {
                return kt8.f(pu8Var);
            } catch (IllegalArgumentException unused) {
                X(pu8Var, "int", str);
                throw null;
            }
        }
        throw xd2.e("Expected " + zfe.a(pu8.class).h() + ", but had " + zfe.a(jt8VarF.getClass()).h() + " as the serialized body of int at element: " + W(str), jt8VarF.toString(), -1);
    }

    public final long O(Object obj) {
        String str = (String) obj;
        jt8 jt8VarF = F(str);
        if (jt8VarF instanceof pu8) {
            pu8 pu8Var = (pu8) jt8VarF;
            try {
                hg8 hg8Var = kt8.a;
                try {
                    return new vyh(pu8Var.a()).k();
                } catch (JsonDecodingException e) {
                    throw new NumberFormatException(e.getMessage());
                }
            } catch (IllegalArgumentException unused) {
                X(pu8Var, "long", str);
                throw null;
            }
        }
        throw xd2.e("Expected " + zfe.a(pu8.class).h() + ", but had " + zfe.a(jt8VarF.getClass()).h() + " as the serialized body of long at element: " + W(str), jt8VarF.toString(), -1);
    }

    public final short P(Object obj) {
        String str = (String) obj;
        jt8 jt8VarF = F(str);
        if (!(jt8VarF instanceof pu8)) {
            throw xd2.e("Expected " + zfe.a(pu8.class).h() + ", but had " + zfe.a(jt8VarF.getClass()).h() + " as the serialized body of short at element: " + W(str), jt8VarF.toString(), -1);
        }
        pu8 pu8Var = (pu8) jt8VarF;
        try {
            int iF = kt8.f(pu8Var);
            Short shValueOf = (-32768 > iF || iF > 32767) ? null : Short.valueOf((short) iF);
            if (shValueOf != null) {
                return shValueOf.shortValue();
            }
            X(pu8Var, "short", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            X(pu8Var, "short", str);
            throw null;
        }
    }

    public final String Q(Object obj) {
        String str = (String) obj;
        jt8 jt8VarF = F(str);
        if (!(jt8VarF instanceof pu8)) {
            throw xd2.e("Expected " + zfe.a(pu8.class).h() + ", but had " + zfe.a(jt8VarF.getClass()).h() + " as the serialized body of string at element: " + W(str), jt8VarF.toString(), -1);
        }
        pu8 pu8Var = (pu8) jt8VarF;
        if (!(pu8Var instanceof vt8)) {
            StringBuilder sbV = qt4.v("Expected string value for a non-null key '", str, "', got null literal instead at element: ");
            sbV.append(W(str));
            throw xd2.e(sbV.toString(), G().toString(), -1);
        }
        vt8 vt8Var = (vt8) pu8Var;
        if (vt8Var.a || this.c.a.c) {
            return vt8Var.c;
        }
        StringBuilder sbV2 = qt4.v("String literal for key '", str, "' should be quoted at element: ");
        sbV2.append(W(str));
        sbV2.append(".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.");
        throw xd2.e(sbV2.toString(), G().toString(), -1);
    }

    public String R(fif fifVar, int i) {
        return fifVar.f(i);
    }

    public final String S(fif fifVar, int i) {
        String strR = R(fifVar, i);
        return strR;
    }

    public abstract jt8 T();

    public final Object U() {
        ArrayList arrayList = this.a;
        Object objRemove = arrayList.remove(xw3.O0(arrayList));
        this.b = true;
        return objRemove;
    }

    public final String V() {
        ArrayList arrayList = this.a;
        return arrayList.isEmpty() ? "$" : ww3.z1(arrayList, ".", "$.", null, null, 60);
    }

    public final String W(String str) {
        return V() + '.' + str;
    }

    public final void X(pu8 pu8Var, String str, String str2) {
        throw xd2.e("Failed to parse literal '" + pu8Var + "' as " + (z5h.K0(str, "i", false) ? "an " : "a ").concat(str) + " value at element: " + W(str2), G().toString(), -1);
    }

    @Override // defpackage.r55
    public v74 a(fif fifVar) {
        jt8 jt8VarG = G();
        lvb lvbVarD = fifVar.d();
        boolean zD = cqk.d(lvbVarD, c6h.g);
        qs8 qs8Var = this.c;
        if (zD || (lvbVarD instanceof tad)) {
            String strI = fifVar.i();
            if (jt8VarG instanceof ss8) {
                return new ev8(qs8Var, (ss8) jt8VarG);
            }
            throw xd2.e("Expected " + zfe.a(ss8.class).h() + ", but had " + zfe.a(jt8VarG.getClass()).h() + " as the serialized body of " + strI + " at element: " + V(), jt8VarG.toString(), -1);
        }
        if (!cqk.d(lvbVarD, c6h.h)) {
            String strI2 = fifVar.i();
            if (jt8VarG instanceof cu8) {
                return new dv8(qs8Var, (cu8) jt8VarG, this.d, 8);
            }
            throw xd2.e("Expected " + zfe.a(cu8.class).h() + ", but had " + zfe.a(jt8VarG.getClass()).h() + " as the serialized body of " + strI2 + " at element: " + V(), jt8VarG.toString(), -1);
        }
        fif fifVarL = lvb.L(qs8Var.b, fifVar.h(0));
        lvb lvbVarD2 = fifVarL.d();
        if (!(lvbVarD2 instanceof rhd) && !cqk.d(lvbVarD2, lif.f)) {
            throw xd2.c(fifVarL);
        }
        String strI3 = fifVar.i();
        if (jt8VarG instanceof cu8) {
            return new fv8(qs8Var, (cu8) jt8VarG);
        }
        throw xd2.e("Expected " + zfe.a(cu8.class).h() + ", but had " + zfe.a(jt8VarG.getClass()).h() + " as the serialized body of " + strI3 + " at element: " + V(), jt8VarG.toString(), -1);
    }

    @Override // defpackage.v74
    public final khb b() {
        return this.c.b;
    }

    @Override // defpackage.v74
    public final r55 c(nhd nhdVar, int i) {
        return M(S(nhdVar, i), nhdVar.h(i));
    }

    @Override // defpackage.r55
    public final Object d(aw8 aw8Var) {
        if (!(aw8Var instanceof f3)) {
            return aw8Var.c(this);
        }
        qs8 qs8Var = this.c;
        at8 at8Var = qs8Var.a;
        uad uadVar = (uad) ((f3) aw8Var);
        String strA = tjl.a(qs8Var, uadVar.d());
        jt8 jt8VarG = G();
        String strI = uadVar.d().i();
        if (jt8VarG instanceof cu8) {
            cu8 cu8Var = (cu8) jt8VarG;
            jt8 jt8Var = (jt8) cu8Var.get(strA);
            try {
                wjl.a((f3) aw8Var, this, jt8Var != null ? kt8.e(kt8.h(jt8Var)) : null);
                throw null;
            } catch (SerializationException e) {
                throw xd2.e(e.getMessage(), cu8Var.toString(), -1);
            }
        }
        throw xd2.e("Expected " + zfe.a(cu8.class).h() + ", but had " + zfe.a(jt8VarG.getClass()).h() + " as the serialized body of " + strI + " at element: " + V(), jt8VarG.toString(), -1);
    }

    @Override // defpackage.v74
    public final char e(nhd nhdVar, int i) {
        return J(S(nhdVar, i));
    }

    @Override // defpackage.gt8
    public final jt8 f() {
        return G();
    }

    @Override // defpackage.v74
    public final byte g(nhd nhdVar, int i) {
        return I(S(nhdVar, i));
    }

    @Override // defpackage.v74
    public final String h(fif fifVar, int i) {
        return Q(S(fifVar, i));
    }

    @Override // defpackage.r55
    public final int i() {
        return N(U());
    }

    public void j(fif fifVar) {
    }

    @Override // defpackage.r55
    public final r55 k(fif fifVar) {
        if (ww3.D1(this.a) != null) {
            return M(U(), fifVar);
        }
        return new qu8(this.c, T(), this.d).k(fifVar);
    }

    @Override // defpackage.v74
    public final int l(fif fifVar, int i) {
        return N(S(fifVar, i));
    }

    @Override // defpackage.r55
    public final long m() {
        return O(U());
    }

    @Override // defpackage.v74
    public final Object n(fif fifVar, int i, aw8 aw8Var, Object obj) {
        String strS = S(fifVar, i);
        hhh hhhVar = new hhh(this, aw8Var, obj, 1);
        this.a.add(strS);
        Object objInvoke = hhhVar.invoke();
        if (!this.b) {
            U();
        }
        this.b = false;
        return objInvoke;
    }

    @Override // defpackage.r55
    public final short o() {
        return P(U());
    }

    @Override // defpackage.r55
    public final float p() {
        return L(U());
    }

    @Override // defpackage.v74
    public final long q(fif fifVar, int i) {
        return O(S(fifVar, i));
    }

    @Override // defpackage.r55
    public final double r() {
        return K(U());
    }

    @Override // defpackage.r55
    public final boolean s() {
        return H(U());
    }

    @Override // defpackage.r55
    public final char t() {
        return J(U());
    }

    @Override // defpackage.v74
    public final float u(fif fifVar, int i) {
        return L(S(fifVar, i));
    }

    @Override // defpackage.v74
    public final short w(nhd nhdVar, int i) {
        return P(S(nhdVar, i));
    }

    @Override // defpackage.v74
    public final Object x(fif fifVar, int i, aw8 aw8Var, Object obj) {
        String strS = S(fifVar, i);
        hhh hhhVar = new hhh(this, aw8Var, obj, 0);
        this.a.add(strS);
        Object objInvoke = hhhVar.invoke();
        if (!this.b) {
            U();
        }
        this.b = false;
        return objInvoke;
    }

    @Override // defpackage.r55
    public final String y() {
        return Q(U());
    }

    @Override // defpackage.r55
    public final int z(fif fifVar) {
        String str = (String) U();
        jt8 jt8VarF = F(str);
        String strI = fifVar.i();
        if (jt8VarF instanceof pu8) {
            return oc9.O(fifVar, this.c, ((pu8) jt8VarF).a(), "");
        }
        throw xd2.e("Expected " + zfe.a(pu8.class).h() + ", but had " + zfe.a(jt8VarF.getClass()).h() + " as the serialized body of " + strI + " at element: " + W(str), jt8VarF.toString(), -1);
    }
}
