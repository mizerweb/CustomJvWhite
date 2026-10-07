package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes.dex */
public final class b0a {
    public static final b0a K = new b0a(new zz9());
    public static final String L;
    public static final String M;
    public static final String N;
    public static final String O;
    public static final String P;
    public static final String Q;
    public static final String R;
    public static final String S;
    public static final String T;
    public static final String U;
    public static final String V;
    public static final String W;
    public static final String X;
    public static final String Y;
    public static final String Z;
    public static final String a0;
    public static final String b0;
    public static final String c0;
    public static final String d0;
    public static final String e0;
    public static final String f0;
    public static final String g0;
    public static final String h0;
    public static final String i0;
    public static final String j0;
    public static final String k0;
    public static final String l0;
    public static final String m0;
    public static final String n0;
    public static final String o0;
    public static final String p0;
    public static final String q0;
    public static final String r0;
    public static final String s0;
    public static final String t0;
    public final CharSequence A;
    public final CharSequence B;
    public final Integer C;
    public final Integer D;
    public final CharSequence E;
    public final CharSequence F;
    public final CharSequence G;
    public final Integer H;
    public final Bundle I;
    public final c98 J;
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f;
    public final CharSequence g;
    public final Long h;
    public final z4e i;
    public final z4e j;
    public final byte[] k;
    public final Integer l;
    public final Uri m;
    public final Integer n;
    public final Integer o;
    public final Integer p;
    public final Boolean q;
    public final Boolean r;
    public final Integer s;
    public final Integer t;
    public final Integer u;
    public final Integer v;
    public final Integer w;
    public final Integer x;
    public final Integer y;
    public final CharSequence z;

    static {
        String str = vqi.a;
        L = Integer.toString(0, 36);
        M = Integer.toString(1, 36);
        N = Integer.toString(2, 36);
        O = Integer.toString(3, 36);
        P = Integer.toString(4, 36);
        Q = Integer.toString(5, 36);
        R = Integer.toString(6, 36);
        S = Integer.toString(8, 36);
        T = Integer.toString(9, 36);
        U = Integer.toString(10, 36);
        V = Integer.toString(11, 36);
        W = Integer.toString(12, 36);
        X = Integer.toString(13, 36);
        Y = Integer.toString(14, 36);
        Z = Integer.toString(15, 36);
        a0 = Integer.toString(16, 36);
        b0 = Integer.toString(17, 36);
        c0 = Integer.toString(18, 36);
        d0 = Integer.toString(19, 36);
        e0 = Integer.toString(20, 36);
        f0 = Integer.toString(21, 36);
        g0 = Integer.toString(22, 36);
        h0 = Integer.toString(23, 36);
        i0 = Integer.toString(24, 36);
        j0 = Integer.toString(25, 36);
        k0 = Integer.toString(26, 36);
        l0 = Integer.toString(27, 36);
        m0 = Integer.toString(28, 36);
        n0 = Integer.toString(29, 36);
        o0 = Integer.toString(30, 36);
        p0 = Integer.toString(31, 36);
        q0 = Integer.toString(32, 36);
        r0 = Integer.toString(33, 36);
        s0 = Integer.toString(34, 36);
        t0 = Integer.toString(1000, 36);
    }

    public b0a(zz9 zz9Var) {
        Boolean boolValueOf = zz9Var.q;
        Integer numValueOf = zz9Var.p;
        Integer numValueOf2 = zz9Var.G;
        int i = 1;
        int i2 = 0;
        int i3 = 0;
        if (boolValueOf != null) {
            if (!boolValueOf.booleanValue()) {
                numValueOf = -1;
            } else if (numValueOf == null || numValueOf.intValue() == -1) {
                if (numValueOf2 != null) {
                    switch (numValueOf2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case vg8.l /* 35 */:
                            break;
                        case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        default:
                            i = 0;
                            break;
                        case 21:
                            i = 2;
                            break;
                        case 22:
                            i = 3;
                            break;
                        case 23:
                            i = 4;
                            break;
                        case 24:
                            i = 5;
                            break;
                        case 25:
                            i = 6;
                            break;
                    }
                    i3 = i;
                }
                numValueOf = Integer.valueOf(i3);
            }
        } else if (numValueOf != null) {
            boolean z = numValueOf.intValue() != -1;
            boolValueOf = Boolean.valueOf(z);
            if (z && numValueOf2 == null) {
                switch (numValueOf.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i2 = 21;
                        break;
                    case 3:
                        i2 = 22;
                        break;
                    case 4:
                        i2 = 23;
                        break;
                    case 5:
                        i2 = 24;
                        break;
                    case 6:
                        i2 = 25;
                        break;
                    default:
                        i2 = 20;
                        break;
                }
                numValueOf2 = Integer.valueOf(i2);
            }
        }
        this.a = zz9Var.a;
        this.b = zz9Var.b;
        this.c = zz9Var.c;
        this.d = zz9Var.d;
        this.e = zz9Var.e;
        this.f = zz9Var.f;
        this.g = zz9Var.g;
        this.h = zz9Var.h;
        this.i = zz9Var.i;
        this.j = zz9Var.j;
        this.k = zz9Var.k;
        this.l = zz9Var.l;
        this.m = zz9Var.m;
        this.n = zz9Var.n;
        this.o = zz9Var.o;
        this.p = numValueOf;
        this.q = boolValueOf;
        this.r = zz9Var.r;
        Integer num = zz9Var.s;
        this.s = num;
        this.t = num;
        this.u = zz9Var.t;
        this.v = zz9Var.u;
        this.w = zz9Var.v;
        this.x = zz9Var.w;
        this.y = zz9Var.x;
        this.z = zz9Var.y;
        this.A = zz9Var.z;
        this.B = zz9Var.A;
        this.C = zz9Var.B;
        this.D = zz9Var.C;
        this.E = zz9Var.D;
        this.F = zz9Var.E;
        this.G = zz9Var.F;
        this.H = numValueOf2;
        this.J = zz9Var.I;
        this.I = zz9Var.H;
    }

    public static b0a b(Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        zz9 zz9Var = new zz9();
        zz9Var.a = bundle.getCharSequence(L);
        zz9Var.b = bundle.getCharSequence(M);
        zz9Var.c = bundle.getCharSequence(N);
        zz9Var.d = bundle.getCharSequence(O);
        zz9Var.e = bundle.getCharSequence(P);
        zz9Var.f = bundle.getCharSequence(Q);
        zz9Var.g = bundle.getCharSequence(R);
        byte[] byteArray = bundle.getByteArray(U);
        String str = n0;
        zz9Var.b(byteArray, bundle.containsKey(str) ? Integer.valueOf(bundle.getInt(str)) : null);
        zz9Var.m = (Uri) bundle.getParcelable(V);
        zz9Var.y = bundle.getCharSequence(g0);
        zz9Var.z = bundle.getCharSequence(h0);
        zz9Var.A = bundle.getCharSequence(i0);
        zz9Var.D = bundle.getCharSequence(l0);
        zz9Var.E = bundle.getCharSequence(m0);
        zz9Var.F = bundle.getCharSequence(o0);
        zz9Var.H = vqi.n(bundle.getBundle(t0));
        String str2 = S;
        if (bundle.containsKey(str2) && (bundle3 = bundle.getBundle(str2)) != null) {
            zz9Var.i = z4e.a(bundle3);
        }
        String str3 = T;
        if (bundle.containsKey(str3) && (bundle2 = bundle.getBundle(str3)) != null) {
            zz9Var.j = z4e.a(bundle2);
        }
        String str4 = r0;
        if (bundle.containsKey(str4)) {
            zz9Var.c(Long.valueOf(bundle.getLong(str4)));
        }
        String str5 = W;
        if (bundle.containsKey(str5)) {
            zz9Var.n = Integer.valueOf(bundle.getInt(str5));
        }
        String str6 = X;
        if (bundle.containsKey(str6)) {
            zz9Var.o = Integer.valueOf(bundle.getInt(str6));
        }
        String str7 = Y;
        if (bundle.containsKey(str7)) {
            zz9Var.p = Integer.valueOf(bundle.getInt(str7));
        }
        String str8 = q0;
        if (bundle.containsKey(str8)) {
            zz9Var.q = Boolean.valueOf(bundle.getBoolean(str8));
        }
        String str9 = Z;
        if (bundle.containsKey(str9)) {
            zz9Var.r = Boolean.valueOf(bundle.getBoolean(str9));
        }
        String str10 = a0;
        if (bundle.containsKey(str10)) {
            zz9Var.s = Integer.valueOf(bundle.getInt(str10));
        }
        String str11 = b0;
        if (bundle.containsKey(str11)) {
            zz9Var.t = Integer.valueOf(bundle.getInt(str11));
        }
        String str12 = c0;
        if (bundle.containsKey(str12)) {
            zz9Var.u = Integer.valueOf(bundle.getInt(str12));
        }
        String str13 = d0;
        if (bundle.containsKey(str13)) {
            zz9Var.v = Integer.valueOf(bundle.getInt(str13));
        }
        String str14 = e0;
        if (bundle.containsKey(str14)) {
            zz9Var.w = Integer.valueOf(bundle.getInt(str14));
        }
        String str15 = f0;
        if (bundle.containsKey(str15)) {
            zz9Var.x = Integer.valueOf(bundle.getInt(str15));
        }
        String str16 = j0;
        if (bundle.containsKey(str16)) {
            zz9Var.B = Integer.valueOf(bundle.getInt(str16));
        }
        String str17 = k0;
        if (bundle.containsKey(str17)) {
            zz9Var.C = Integer.valueOf(bundle.getInt(str17));
        }
        String str18 = p0;
        if (bundle.containsKey(str18)) {
            zz9Var.G = Integer.valueOf(bundle.getInt(str18));
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList(s0);
        if (stringArrayList != null) {
            zz9Var.I = c98.n(stringArrayList);
        }
        return new b0a(zz9Var);
    }

    public final zz9 a() {
        zz9 zz9Var = new zz9();
        zz9Var.a = this.a;
        zz9Var.b = this.b;
        zz9Var.c = this.c;
        zz9Var.d = this.d;
        zz9Var.e = this.e;
        zz9Var.f = this.f;
        zz9Var.g = this.g;
        zz9Var.h = this.h;
        zz9Var.i = this.i;
        zz9Var.j = this.j;
        zz9Var.k = this.k;
        zz9Var.l = this.l;
        zz9Var.m = this.m;
        zz9Var.n = this.n;
        zz9Var.o = this.o;
        zz9Var.p = this.p;
        zz9Var.q = this.q;
        zz9Var.r = this.r;
        zz9Var.s = this.t;
        zz9Var.t = this.u;
        zz9Var.u = this.v;
        zz9Var.v = this.w;
        zz9Var.w = this.x;
        zz9Var.x = this.y;
        zz9Var.y = this.z;
        zz9Var.z = this.A;
        zz9Var.A = this.B;
        zz9Var.B = this.C;
        zz9Var.C = this.D;
        zz9Var.D = this.E;
        zz9Var.E = this.F;
        zz9Var.F = this.G;
        zz9Var.G = this.H;
        zz9Var.I = this.J;
        zz9Var.H = this.I;
        return zz9Var;
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.a;
        if (charSequence != null) {
            bundle.putCharSequence(L, charSequence);
        }
        CharSequence charSequence2 = this.b;
        if (charSequence2 != null) {
            bundle.putCharSequence(M, charSequence2);
        }
        CharSequence charSequence3 = this.c;
        if (charSequence3 != null) {
            bundle.putCharSequence(N, charSequence3);
        }
        CharSequence charSequence4 = this.d;
        if (charSequence4 != null) {
            bundle.putCharSequence(O, charSequence4);
        }
        CharSequence charSequence5 = this.e;
        if (charSequence5 != null) {
            bundle.putCharSequence(P, charSequence5);
        }
        CharSequence charSequence6 = this.f;
        if (charSequence6 != null) {
            bundle.putCharSequence(Q, charSequence6);
        }
        CharSequence charSequence7 = this.g;
        if (charSequence7 != null) {
            bundle.putCharSequence(R, charSequence7);
        }
        Long l = this.h;
        if (l != null) {
            bundle.putLong(r0, l.longValue());
        }
        byte[] bArr = this.k;
        if (bArr != null) {
            bundle.putByteArray(U, bArr);
        }
        Uri uri = this.m;
        if (uri != null) {
            bundle.putParcelable(V, uri);
        }
        CharSequence charSequence8 = this.z;
        if (charSequence8 != null) {
            bundle.putCharSequence(g0, charSequence8);
        }
        CharSequence charSequence9 = this.A;
        if (charSequence9 != null) {
            bundle.putCharSequence(h0, charSequence9);
        }
        CharSequence charSequence10 = this.B;
        if (charSequence10 != null) {
            bundle.putCharSequence(i0, charSequence10);
        }
        CharSequence charSequence11 = this.E;
        if (charSequence11 != null) {
            bundle.putCharSequence(l0, charSequence11);
        }
        CharSequence charSequence12 = this.F;
        if (charSequence12 != null) {
            bundle.putCharSequence(m0, charSequence12);
        }
        CharSequence charSequence13 = this.G;
        if (charSequence13 != null) {
            bundle.putCharSequence(o0, charSequence13);
        }
        z4e z4eVar = this.i;
        if (z4eVar != null) {
            bundle.putBundle(S, z4eVar.c());
        }
        z4e z4eVar2 = this.j;
        if (z4eVar2 != null) {
            bundle.putBundle(T, z4eVar2.c());
        }
        Integer num = this.n;
        if (num != null) {
            bundle.putInt(W, num.intValue());
        }
        Integer num2 = this.o;
        if (num2 != null) {
            bundle.putInt(X, num2.intValue());
        }
        Integer num3 = this.p;
        if (num3 != null) {
            bundle.putInt(Y, num3.intValue());
        }
        Boolean bool = this.q;
        if (bool != null) {
            bundle.putBoolean(q0, bool.booleanValue());
        }
        Boolean bool2 = this.r;
        if (bool2 != null) {
            bundle.putBoolean(Z, bool2.booleanValue());
        }
        Integer num4 = this.t;
        if (num4 != null) {
            bundle.putInt(a0, num4.intValue());
        }
        Integer num5 = this.u;
        if (num5 != null) {
            bundle.putInt(b0, num5.intValue());
        }
        Integer num6 = this.v;
        if (num6 != null) {
            bundle.putInt(c0, num6.intValue());
        }
        Integer num7 = this.w;
        if (num7 != null) {
            bundle.putInt(d0, num7.intValue());
        }
        Integer num8 = this.x;
        if (num8 != null) {
            bundle.putInt(e0, num8.intValue());
        }
        Integer num9 = this.y;
        if (num9 != null) {
            bundle.putInt(f0, num9.intValue());
        }
        Integer num10 = this.C;
        if (num10 != null) {
            bundle.putInt(j0, num10.intValue());
        }
        Integer num11 = this.D;
        if (num11 != null) {
            bundle.putInt(k0, num11.intValue());
        }
        Integer num12 = this.l;
        if (num12 != null) {
            bundle.putInt(n0, num12.intValue());
        }
        Integer num13 = this.H;
        if (num13 != null) {
            bundle.putInt(p0, num13.intValue());
        }
        c98 c98Var = this.J;
        if (!c98Var.isEmpty()) {
            bundle.putStringArrayList(s0, new ArrayList<>(c98Var));
        }
        Bundle bundle2 = this.I;
        if (bundle2 != null) {
            bundle.putBundle(t0, bundle2);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b0a.class == obj.getClass()) {
            b0a b0aVar = (b0a) obj;
            if (TextUtils.equals(this.a, b0aVar.a) && TextUtils.equals(this.b, b0aVar.b) && TextUtils.equals(this.c, b0aVar.c) && TextUtils.equals(this.d, b0aVar.d) && TextUtils.equals(this.e, b0aVar.e) && TextUtils.equals(this.f, b0aVar.f) && TextUtils.equals(this.g, b0aVar.g) && Objects.equals(this.h, b0aVar.h) && Objects.equals(this.i, b0aVar.i) && Objects.equals(this.j, b0aVar.j) && Arrays.equals(this.k, b0aVar.k) && Objects.equals(this.l, b0aVar.l) && Objects.equals(this.m, b0aVar.m) && Objects.equals(this.n, b0aVar.n) && Objects.equals(this.o, b0aVar.o) && Objects.equals(this.p, b0aVar.p) && Objects.equals(this.q, b0aVar.q) && Objects.equals(this.r, b0aVar.r) && Objects.equals(this.t, b0aVar.t) && Objects.equals(this.u, b0aVar.u) && Objects.equals(this.v, b0aVar.v) && Objects.equals(this.w, b0aVar.w) && Objects.equals(this.x, b0aVar.x) && Objects.equals(this.y, b0aVar.y) && TextUtils.equals(this.z, b0aVar.z) && TextUtils.equals(this.A, b0aVar.A) && TextUtils.equals(this.B, b0aVar.B) && Objects.equals(this.C, b0aVar.C) && Objects.equals(this.D, b0aVar.D) && TextUtils.equals(this.E, b0aVar.E) && TextUtils.equals(this.F, b0aVar.F) && TextUtils.equals(this.G, b0aVar.G) && Objects.equals(this.H, b0aVar.H) && Objects.equals(this.J, b0aVar.J)) {
                if ((this.I == null) == (b0aVar.I == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, Integer.valueOf(Arrays.hashCode(this.k)), this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, Boolean.valueOf(this.I == null), this.J);
    }
}
