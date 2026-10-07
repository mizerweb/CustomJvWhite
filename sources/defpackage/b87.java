package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import org.webrtc.PeerConnection;

/* JADX INFO: loaded from: classes2.dex */
public final class b87 {
    public static final String A0;
    public static final b87 Q = new b87(new a87());
    public static final String R = Integer.toString(0, 36);
    public static final String S = Integer.toString(1, 36);
    public static final String T = Integer.toString(2, 36);
    public static final String U = Integer.toString(3, 36);
    public static final String V = Integer.toString(4, 36);
    public static final String W = Integer.toString(5, 36);
    public static final String X = Integer.toString(6, 36);
    public static final String Y = Integer.toString(7, 36);
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
    public static final String u0;
    public static final String v0;
    public static final String w0;
    public static final String x0;
    public static final String y0;
    public static final String z0;
    public final float A;
    public final byte[] B;
    public final int C;
    public final ex3 D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public int P;
    public final String a;
    public final String b;
    public final c98 c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final String k;
    public final lwa l;
    public final String m;
    public final String n;
    public final int o;
    public final int p;
    public final List q;
    public final wu5 r;
    public final long s;
    public final boolean t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public final float y;
    public final int z;

    static {
        Integer.toString(8, 36);
        Z = Integer.toString(9, 36);
        a0 = Integer.toString(10, 36);
        b0 = Integer.toString(11, 36);
        c0 = Integer.toString(12, 36);
        d0 = Integer.toString(13, 36);
        e0 = Integer.toString(14, 36);
        f0 = Integer.toString(15, 36);
        g0 = Integer.toString(16, 36);
        h0 = Integer.toString(17, 36);
        i0 = Integer.toString(18, 36);
        j0 = Integer.toString(19, 36);
        k0 = Integer.toString(20, 36);
        l0 = Integer.toString(21, 36);
        m0 = Integer.toString(22, 36);
        n0 = Integer.toString(23, 36);
        o0 = Integer.toString(24, 36);
        p0 = Integer.toString(25, 36);
        q0 = Integer.toString(26, 36);
        r0 = Integer.toString(27, 36);
        s0 = Integer.toString(28, 36);
        t0 = Integer.toString(29, 36);
        u0 = Integer.toString(30, 36);
        v0 = Integer.toString(31, 36);
        w0 = Integer.toString(32, 36);
        x0 = Integer.toString(33, 36);
        y0 = Integer.toString(34, 36);
        z0 = Integer.toString(35, 36);
        A0 = Integer.toString(36, 36);
    }

    public b87(a87 a87Var) {
        boolean z;
        String str;
        this.a = a87Var.a;
        String strY = vqi.Y(a87Var.d);
        this.d = strY;
        if (a87Var.c.isEmpty() && a87Var.b != null) {
            this.c = c98.r(new sx8(strY, a87Var.b));
            this.b = a87Var.b;
        } else if (a87Var.c.isEmpty() || a87Var.b != null) {
            if (!a87Var.c.isEmpty() || a87Var.b != null) {
                int i = 0;
                while (true) {
                    if (i >= a87Var.c.size()) {
                        z = false;
                        break;
                    } else {
                        if (((sx8) a87Var.c.get(i)).b.equals(a87Var.b)) {
                            z = true;
                            break;
                        }
                        i++;
                    }
                }
            } else {
                z = true;
                break;
            }
            lvb.b0(z);
            this.c = a87Var.c;
            this.b = a87Var.b;
        } else {
            c98 c98Var = a87Var.c;
            this.c = c98Var;
            Iterator it = c98Var.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((sx8) c98Var.get(0)).b;
                    break;
                }
                sx8 sx8Var = (sx8) it.next();
                if (TextUtils.equals(sx8Var.a, strY)) {
                    str = sx8Var.b;
                    break;
                }
            }
            this.b = str;
        }
        this.e = a87Var.e;
        lvb.Z("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", a87Var.g == 0 || (a87Var.f & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0);
        this.f = a87Var.f;
        this.g = a87Var.g;
        int i2 = a87Var.h;
        this.h = i2;
        int i3 = a87Var.i;
        this.i = i3;
        this.j = i3 != -1 ? i3 : i2;
        this.k = a87Var.j;
        this.l = a87Var.k;
        this.m = a87Var.l;
        this.n = a87Var.m;
        this.o = a87Var.n;
        this.p = a87Var.o;
        List list = a87Var.p;
        this.q = list == null ? Collections.EMPTY_LIST : list;
        wu5 wu5Var = a87Var.q;
        this.r = wu5Var;
        this.s = a87Var.r;
        this.t = a87Var.s;
        this.u = a87Var.t;
        this.v = a87Var.u;
        this.w = a87Var.v;
        this.x = a87Var.w;
        this.y = a87Var.x;
        int i4 = a87Var.y;
        this.z = i4 == -1 ? 0 : i4;
        float f = a87Var.z;
        this.A = f == -1.0f ? 1.0f : f;
        this.B = a87Var.A;
        this.C = a87Var.B;
        this.D = a87Var.C;
        this.E = a87Var.D;
        this.F = a87Var.E;
        this.G = a87Var.F;
        this.H = a87Var.G;
        int i5 = a87Var.H;
        this.I = i5 == -1 ? 0 : i5;
        int i6 = a87Var.I;
        this.J = i6 != -1 ? i6 : 0;
        this.K = a87Var.J;
        this.L = a87Var.K;
        this.M = a87Var.L;
        this.N = a87Var.M;
        int i7 = a87Var.N;
        if (i7 != 0 || wu5Var == null) {
            this.O = i7;
        } else {
            this.O = 1;
        }
    }

    public static String e(b87 b87Var) {
        int i;
        String str;
        String str2;
        if (b87Var == null) {
            return "null";
        }
        int i2 = b87Var.e;
        c98 c98Var = b87Var.c;
        String str3 = b87Var.d;
        int i3 = b87Var.G;
        int i4 = b87Var.F;
        int i5 = b87Var.E;
        float f = b87Var.y;
        ex3 ex3Var = b87Var.D;
        float f2 = b87Var.A;
        int i6 = b87Var.x;
        int i7 = b87Var.w;
        int i8 = b87Var.v;
        int i9 = b87Var.u;
        wu5 wu5Var = b87Var.r;
        String str4 = b87Var.k;
        int i10 = b87Var.j;
        String str5 = b87Var.m;
        int i11 = b87Var.f;
        ste steVar = new ste(String.valueOf(','), 1);
        StringBuilder sbC = nbh.C("id=");
        sbC.append(b87Var.a);
        sbC.append(", mimeType=");
        sbC.append(b87Var.n);
        if (str5 != null) {
            sbC.append(", container=");
            sbC.append(str5);
        }
        if (i10 != -1) {
            sbC.append(", bitrate=");
            sbC.append(i10);
        }
        if (str4 != null) {
            sbC.append(", codecs=");
            sbC.append(str4);
        }
        if (wu5Var != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i12 = 0; i12 < wu5Var.d; i12++) {
                UUID uuid = wu5Var.a[i12].b;
                if (uuid.equals(f71.b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(f71.c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(f71.e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(f71.d)) {
                    linkedHashSet.add("widevine");
                } else {
                    if (uuid.equals(f71.a)) {
                        linkedHashSet.add("universal");
                    } else {
                        linkedHashSet.add("unknown (" + uuid + ")");
                    }
                }
            }
            sbC.append(", drm=[");
            steVar.a(sbC, linkedHashSet.iterator());
            sbC.append(']');
        }
        if (i9 != -1 && i8 != -1) {
            zo5.C(i9, i8, ", res=", "x", sbC);
        }
        if (i7 != -1 && i6 != -1) {
            zo5.C(i7, i6, ", decRes=", "x", sbC);
        }
        double d = f2;
        int i13 = gp5.a;
        if (Math.copySign(d - 1.0d, 1.0d) > 0.001d && d != 1.0d && (!Double.isNaN(d) || !Double.isNaN(1.0d))) {
            sbC.append(", par=");
            Object[] objArr = {Float.valueOf(f2)};
            String str6 = vqi.a;
            sbC.append(String.format(Locale.US, "%.3f", objArr));
        }
        if (ex3Var != null) {
            int i14 = ex3Var.f;
            int i15 = ex3Var.e;
            if ((i15 != -1 && i14 != -1) || ex3Var.f()) {
                sbC.append(", color=");
                if (ex3Var.f()) {
                    String strC = ex3.c(ex3Var.a);
                    String strB = ex3.b(ex3Var.b);
                    String strE = ex3.e(ex3Var.c);
                    String str7 = vqi.a;
                    Locale locale = Locale.US;
                    str2 = strC + "/" + strB + "/" + strE;
                } else {
                    str2 = "NA/NA/NA";
                }
                sbC.append(str2 + "/" + ((i15 == -1 || i14 == -1) ? "NA/NA" : i15 + "/" + i14));
            }
        }
        if (f != -1.0f) {
            sbC.append(", fps=");
            sbC.append(f);
        }
        if (i5 != -1) {
            sbC.append(", maxSubLayers=");
            sbC.append(i5);
        }
        if (i4 != -1) {
            sbC.append(", channels=");
            sbC.append(i4);
        }
        if (i3 != -1) {
            sbC.append(", sample_rate=");
            sbC.append(i3);
        }
        if (str3 != null) {
            sbC.append(", language=");
            sbC.append(str3);
        }
        if (!c98Var.isEmpty()) {
            sbC.append(", labels=[");
            steVar.a(sbC, j8f.f(new eu6(7), c98Var).iterator());
            sbC.append("]");
        }
        if (i2 != 0) {
            sbC.append(", selectionFlags=[");
            String str8 = vqi.a;
            ArrayList arrayList = new ArrayList();
            if ((i2 & 4) != 0) {
                arrayList.add("auto");
            }
            if ((i2 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i2 & 2) != 0) {
                arrayList.add("forced");
            }
            steVar.a(sbC, arrayList.iterator());
            sbC.append("]");
        }
        if (i11 != 0) {
            sbC.append(", roleFlags=[");
            String str9 = vqi.a;
            ArrayList arrayList2 = new ArrayList();
            if ((i11 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i11 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i11 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i11 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i11 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i11 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i11 & 64) != 0) {
                arrayList2.add("caption");
            }
            i = i11;
            if ((i & np0.m) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i & np0.n) != 0) {
                arrayList2.add("sign");
            }
            if ((i & np0.o) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i & np0.q) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i & np0.r) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            if ((i & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0) {
                arrayList2.add("auxiliary");
            }
            steVar.a(sbC, arrayList2.iterator());
            sbC.append("]");
        } else {
            i = i11;
        }
        if ((i & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0) {
            sbC.append(", auxiliaryTrackType=");
            int i16 = b87Var.g;
            String str10 = vqi.a;
            if (i16 == 0) {
                str = "undefined";
            } else if (i16 == 1) {
                str = "original";
            } else if (i16 == 2) {
                str = "depth-linear";
            } else if (i16 == 3) {
                str = "depth-inverse";
            } else {
                if (i16 != 4) {
                    ore.k("Unsupported auxiliary track type");
                    return null;
                }
                str = "depth metadata";
            }
            sbC.append(str);
        }
        return sbC.toString();
    }

    public final a87 a() {
        a87 a87Var = new a87();
        a87Var.a = this.a;
        a87Var.b = this.b;
        a87Var.c = this.c;
        a87Var.d = this.d;
        a87Var.e = this.e;
        a87Var.f = this.f;
        a87Var.h = this.h;
        a87Var.i = this.i;
        a87Var.j = this.k;
        a87Var.k = this.l;
        a87Var.l = this.m;
        a87Var.m = this.n;
        a87Var.n = this.o;
        a87Var.o = this.p;
        a87Var.p = this.q;
        a87Var.q = this.r;
        a87Var.r = this.s;
        a87Var.s = this.t;
        a87Var.t = this.u;
        a87Var.u = this.v;
        a87Var.v = this.w;
        a87Var.w = this.x;
        a87Var.x = this.y;
        a87Var.y = this.z;
        a87Var.z = this.A;
        a87Var.A = this.B;
        a87Var.B = this.C;
        a87Var.C = this.D;
        a87Var.D = this.E;
        a87Var.E = this.F;
        a87Var.F = this.G;
        a87Var.G = this.H;
        a87Var.H = this.I;
        a87Var.I = this.J;
        a87Var.J = this.K;
        a87Var.K = this.L;
        a87Var.L = this.M;
        a87Var.M = this.N;
        a87Var.N = this.O;
        return a87Var;
    }

    public final int b() {
        int i;
        int i2 = this.u;
        if (i2 == -1 || (i = this.v) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public final boolean c(b87 b87Var) {
        List list = this.q;
        if (list.size() != b87Var.q.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) b87Var.q.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final Bundle d() {
        Bundle bundle = new Bundle();
        bundle.putString(R, this.a);
        bundle.putString(S, this.b);
        c98<sx8> c98Var = this.c;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(c98Var.size());
        for (sx8 sx8Var : c98Var) {
            sx8Var.getClass();
            Bundle bundle2 = new Bundle();
            String str = sx8Var.a;
            if (str != null) {
                bundle2.putString(sx8.c, str);
            }
            bundle2.putString(sx8.d, sx8Var.b);
            arrayList.add(bundle2);
        }
        bundle.putParcelableArrayList(w0, arrayList);
        bundle.putString(T, this.d);
        bundle.putInt(U, this.e);
        bundle.putInt(V, this.f);
        int i = Q.g;
        int i2 = this.g;
        if (i2 != i) {
            bundle.putInt(x0, i2);
        }
        bundle.putInt(W, this.h);
        bundle.putInt(X, this.i);
        bundle.putString(Y, this.k);
        bundle.putString(Z, this.m);
        bundle.putString(a0, this.n);
        bundle.putInt(b0, this.o);
        int i3 = 0;
        while (true) {
            List list = this.q;
            if (i3 >= list.size()) {
                break;
            }
            bundle.putByteArray(c0 + "_" + Integer.toString(i3, 36), (byte[]) list.get(i3));
            i3++;
        }
        bundle.putParcelable(d0, this.r);
        bundle.putLong(e0, this.s);
        bundle.putInt(f0, this.u);
        bundle.putInt(g0, this.v);
        bundle.putInt(z0, this.w);
        bundle.putInt(A0, this.x);
        bundle.putFloat(h0, this.y);
        bundle.putInt(i0, this.z);
        bundle.putFloat(j0, this.A);
        bundle.putByteArray(k0, this.B);
        bundle.putInt(l0, this.C);
        ex3 ex3Var = this.D;
        if (ex3Var != null) {
            Bundle bundle3 = new Bundle();
            bundle3.putInt(ex3.j, ex3Var.a);
            bundle3.putInt(ex3.k, ex3Var.b);
            bundle3.putInt(ex3.l, ex3Var.c);
            bundle3.putByteArray(ex3.m, ex3Var.d);
            bundle3.putInt(ex3.n, ex3Var.e);
            bundle3.putInt(ex3.o, ex3Var.f);
            bundle.putBundle(m0, bundle3);
        }
        bundle.putInt(y0, this.E);
        bundle.putInt(n0, this.F);
        bundle.putInt(o0, this.G);
        bundle.putInt(p0, this.H);
        bundle.putInt(q0, this.I);
        bundle.putInt(r0, this.J);
        bundle.putInt(s0, this.K);
        bundle.putInt(u0, this.M);
        bundle.putInt(v0, this.N);
        bundle.putInt(t0, this.O);
        return bundle;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || b87.class != obj.getClass()) {
            return false;
        }
        b87 b87Var = (b87) obj;
        int i2 = this.P;
        if ((i2 != 0 && (i = b87Var.P) != 0 && i2 != i) || this.e != b87Var.e || this.f != b87Var.f || this.g != b87Var.g || this.h != b87Var.h || this.i != b87Var.i || this.o != b87Var.o || this.s != b87Var.s || this.u != b87Var.u || this.v != b87Var.v || this.w != b87Var.w || this.x != b87Var.x || this.z != b87Var.z || this.C != b87Var.C || this.E != b87Var.E || this.F != b87Var.F || this.G != b87Var.G || this.H != b87Var.H || this.I != b87Var.I || this.J != b87Var.J || this.K != b87Var.K || this.M != b87Var.M || this.N != b87Var.N || this.O != b87Var.O || Float.compare(this.y, b87Var.y) != 0 || Float.compare(this.A, b87Var.A) != 0 || !Objects.equals(this.a, b87Var.a) || !Objects.equals(this.b, b87Var.b)) {
            return false;
        }
        c98 c98Var = b87Var.c;
        c98 c98Var2 = this.c;
        c98Var2.getClass();
        return j8f.a(c98Var2, c98Var) && Objects.equals(this.k, b87Var.k) && Objects.equals(this.m, b87Var.m) && Objects.equals(this.n, b87Var.n) && Objects.equals(this.d, b87Var.d) && Arrays.equals(this.B, b87Var.B) && Objects.equals(this.l, b87Var.l) && Objects.equals(this.D, b87Var.D) && Objects.equals(this.r, b87Var.r) && c(b87Var);
    }

    public final b87 f(b87 b87Var) {
        String str;
        String str2;
        int i;
        int i2;
        if (this == b87Var) {
            return this;
        }
        int iH = uya.h(this.n);
        String str3 = b87Var.a;
        c98 c98Var = b87Var.c;
        int i3 = b87Var.M;
        int i4 = b87Var.N;
        String str4 = b87Var.b;
        if (str4 == null) {
            str4 = this.b;
        }
        if (c98Var.isEmpty()) {
            c98Var = this.c;
        }
        if ((iH != 3 && iH != 1) || (str = b87Var.d) == null) {
            str = this.d;
        }
        int i5 = this.h;
        if (i5 == -1) {
            i5 = b87Var.h;
        }
        int i6 = this.i;
        if (i6 == -1) {
            i6 = b87Var.i;
        }
        String str5 = this.k;
        if (str5 == null) {
            String strX = vqi.x(iH, b87Var.k);
            if (vqi.l0(strX).length == 1) {
                str5 = strX;
            }
        }
        lwa lwaVarB = b87Var.l;
        lwa lwaVar = this.l;
        if (lwaVar != null) {
            lwaVarB = lwaVar.b(lwaVarB);
        }
        float f = this.y;
        if (f == -1.0f && iH == 2) {
            f = b87Var.y;
        }
        int i7 = this.e | b87Var.e;
        int i8 = this.f | b87Var.f;
        wu5 wu5Var = b87Var.r;
        ArrayList arrayList = new ArrayList();
        c98 c98Var2 = c98Var;
        if (wu5Var != null) {
            String str6 = wu5Var.c;
            vu5[] vu5VarArr = wu5Var.a;
            int length = vu5VarArr.length;
            int i9 = 0;
            while (i9 < length) {
                int i10 = i9;
                vu5 vu5Var = vu5VarArr[i10];
                int i11 = length;
                if (vu5Var.e != null) {
                    arrayList.add(vu5Var);
                }
                i9 = i10 + 1;
                length = i11;
            }
            str2 = str6;
        } else {
            str2 = null;
        }
        wu5 wu5Var2 = this.r;
        if (wu5Var2 != null) {
            if (str2 == null) {
                str2 = wu5Var2.c;
            }
            int size = arrayList.size();
            vu5[] vu5VarArr2 = wu5Var2.a;
            String str7 = str2;
            int length2 = vu5VarArr2.length;
            int i12 = 0;
            while (i12 < length2) {
                int i13 = i12;
                vu5 vu5Var2 = vu5VarArr2[i13];
                int i14 = length2;
                if (vu5Var2.e != null) {
                    UUID uuid = vu5Var2.b;
                    i2 = i4;
                    int i15 = 0;
                    while (true) {
                        if (i15 >= size) {
                            i = size;
                            arrayList.add(vu5Var2);
                            break;
                        }
                        i = size;
                        if (((vu5) arrayList.get(i15)).b.equals(uuid)) {
                            break;
                        }
                        i15++;
                        size = i;
                    }
                } else {
                    i = size;
                    i2 = i4;
                }
                i12 = i13 + 1;
                length2 = i14;
                i4 = i2;
                size = i;
            }
            str2 = str7;
        }
        int i16 = i4;
        wu5 wu5Var3 = arrayList.isEmpty() ? null : new wu5(str2, arrayList);
        a87 a87VarA = a();
        a87VarA.a = str3;
        a87VarA.b = str4;
        a87VarA.c = c98.n(c98Var2);
        a87VarA.d = str;
        a87VarA.e = i7;
        a87VarA.f = i8;
        a87VarA.h = i5;
        a87VarA.i = i6;
        a87VarA.j = str5;
        a87VarA.k = lwaVarB;
        a87VarA.q = wu5Var3;
        a87VarA.x = f;
        a87VarA.L = i3;
        a87VarA.M = i16;
        return new b87(a87VarA);
    }

    public final int hashCode() {
        if (this.P == 0) {
            String str = this.a;
            int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.b;
            int iHashCode2 = (this.c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            String str3 = this.d;
            int iHashCode3 = (((((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31;
            String str4 = this.k;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            lwa lwaVar = this.l;
            int iHashCode5 = (iHashCode4 + (lwaVar == null ? 0 : lwaVar.hashCode())) * 961;
            String str5 = this.m;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.n;
            this.P = ((((((((((((((((((((((Float.floatToIntBits(this.A) + ((((Float.floatToIntBits(this.y) + ((((((((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.o) * 31) + ((int) this.s)) * 31) + this.u) * 31) + this.v) * 31) + this.w) * 31) + this.x) * 31)) * 31) + this.z) * 31)) * 31) + this.C) * 31) + this.E) * 31) + this.F) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) + this.J) * 31) + this.K) * 31) + this.M) * 31) + this.N) * 31) + this.O;
        }
        return this.P;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.m);
        sb.append(", ");
        sb.append(this.n);
        sb.append(", ");
        sb.append(this.k);
        sb.append(", ");
        sb.append(this.j);
        sb.append(", ");
        sb.append(this.d);
        sb.append(", [");
        sb.append(this.u);
        sb.append(", ");
        sb.append(this.v);
        sb.append(", ");
        sb.append(this.y);
        sb.append(", ");
        sb.append(this.D);
        sb.append("], [");
        sb.append(this.F);
        sb.append(", ");
        return zo5.t(sb, this.G, "])");
    }
}
