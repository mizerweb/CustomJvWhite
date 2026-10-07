package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vvk {
    public static int a(mo2 mo2Var, int i, int i2, int i3) {
        lvb.R(Math.max(Math.max(i, i2), i3) <= 31);
        int i4 = (1 << i) - 1;
        int i5 = (1 << i2) - 1;
        g4m.a(g4m.a(i4, i5), 1 << i3);
        if (mo2Var.b() < i) {
            return -1;
        }
        int i6 = mo2Var.i(i);
        if (i6 == i4) {
            if (mo2Var.b() < i2) {
                return -1;
            }
            int i7 = mo2Var.i(i2);
            i6 += i7;
            if (i7 == i5) {
                if (mo2Var.b() < i3) {
                    return -1;
                }
                return mo2Var.i(i3) + i6;
            }
        }
        return i6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(jg8 jg8Var, String str, int i, int i2, boolean z) {
        if (jg8Var.b.equals(str)) {
            ArrayList arrayList = jg8Var.a;
            if (((c61) ((h61) arrayList.get(i)).get(i2)).h == z) {
                return;
            }
            c61 c61Var = (c61) ((h61) arrayList.get(i)).get(i2);
            y51 y51Var = new y51(c61Var.a, c61Var.b, c61Var.c);
            y51Var.d = c61Var.d;
            y51Var.e = c61Var.e;
            y51Var.h = c61Var.g;
            y51Var.f = c61Var.f;
            y51Var.g = z;
            ((h61) arrayList.get(i)).set(i2, new c61(y51Var));
        }
    }

    public static void c(mo2 mo2Var) {
        mo2Var.t(3);
        mo2Var.t(8);
        boolean zH = mo2Var.h();
        boolean zH2 = mo2Var.h();
        if (zH) {
            mo2Var.t(5);
        }
        if (zH2) {
            mo2Var.t(6);
        }
    }

    public static void d(mo2 mo2Var) {
        int i;
        int i2 = mo2Var.i(2);
        if (i2 == 0) {
            mo2Var.t(6);
            return;
        }
        int iA = a(mo2Var, 5, 8, 16) + 1;
        if (i2 == 1) {
            mo2Var.t(iA * 7);
            return;
        }
        if (i2 == 2) {
            boolean zH = mo2Var.h();
            int i3 = zH ? 1 : 5;
            int i4 = zH ? 7 : 5;
            int i5 = zH ? 8 : 6;
            int i6 = 0;
            while (i6 < iA) {
                if (mo2Var.h()) {
                    mo2Var.t(7);
                    i = 0;
                } else {
                    if (mo2Var.i(2) == 3 && mo2Var.i(i4) * i3 != 0) {
                        mo2Var.s();
                    }
                    i = mo2Var.i(i5) * i3;
                    if (i != 0 && i != 180) {
                        mo2Var.s();
                    }
                    mo2Var.s();
                }
                if (i != 0 && i != 180 && mo2Var.h()) {
                    i6++;
                }
                i6++;
            }
        }
    }

    public static void e(f70 f70Var, String str, tg4 tg4Var) {
        for (int i = 0; i < f70Var.b(); i++) {
            e70 e70VarD = f70Var.d(i);
            String str2 = e70VarD.t;
            t60 t60Var = e70VarD.g;
            if (cqk.p(str, str2)) {
                c60 c60VarJ = e70VarD.j();
                tg4Var.accept(c60VarJ);
                f70Var.e(i, c60VarJ.a());
                return;
            }
            if (e70VarD.g()) {
                e70 e70Var = t60Var.g;
                e70 e70Var2 = t60Var.g;
                if (e70Var != null && cqk.p(str, e70Var.t)) {
                    c60 c60VarJ2 = e70Var2.j();
                    tg4Var.accept(c60VarJ2);
                    s60 s60Var = new s60();
                    s60Var.a = t60Var.a;
                    s60Var.b = t60Var.b;
                    s60Var.e = t60Var.c;
                    s60Var.f = t60Var.d;
                    s60Var.g = t60Var.e;
                    s60Var.h = t60Var.f;
                    s60Var.i = e70Var2;
                    s60Var.c = t60Var.h;
                    s60Var.d = t60Var.i;
                    s60Var.i = c60VarJ2.a();
                    c60 c60VarJ3 = e70VarD.j();
                    c60VarJ3.g = new t60(s60Var);
                    f70Var.e(i, c60VarJ3.a());
                    return;
                }
            }
        }
    }

    public static void f(c60 c60Var, u60 u60Var, long j) {
        c60Var.i = u60Var;
        u60Var.getClass();
        if (u60Var == u60.d) {
            c60Var.j = j;
        }
        if (u60Var == u60.a) {
            c60Var.k = 0.0f;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0195  */
    /* JADX WARN: Code duplicated, block: B:108:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:111:0x01da  */
    /* JADX WARN: Code duplicated, block: B:116:0x022c  */
    /* JADX WARN: Code duplicated, block: B:117:0x025e  */
    /* JADX WARN: Code duplicated, block: B:120:0x0265  */
    /* JADX WARN: Code duplicated, block: B:122:0x0269  */
    /* JADX WARN: Code duplicated, block: B:125:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:127:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:129:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:91:0x015a  */
    /* JADX WARN: Code duplicated, block: B:93:0x0182  */
    /* JADX WARN: Code duplicated, block: B:95:0x0188  */
    /* JADX WARN: Code duplicated, block: B:96:0x018a  */
    public static void g(sfa sfaVar, f70 f70Var, c46 c46Var, String str) {
        HashSet hashSet;
        f70 f70Var2;
        int i;
        y60 y60Var;
        c60 c60VarJ;
        e70 e70Var;
        a60 a60VarA;
        byte[] bArr;
        o5d o5dVar;
        int i2;
        f70 f70Var3 = f70Var;
        c46 c46Var2 = c46Var;
        f70Var3.b = (kg8) c46Var2.b;
        boolean zY = sfaVar.Y();
        y60 y60Var2 = y60.a;
        boolean z = zY && c46Var2.l(y60Var2) == null;
        if (!sfaVar.E() || z) {
            HashSet hashSet2 = new HashSet();
            f70 f70VarP = c46Var2.p();
            int i3 = 0;
            while (i3 < c46Var2.i()) {
                e70 e70VarH = c46Var2.h(i3);
                int i4 = 0;
                while (true) {
                    if (i4 < f70Var3.b()) {
                        e70 e70VarD = f70Var3.d(i4);
                        String str2 = e70VarD.t;
                        f60 f60Var = e70VarD.k;
                        j60 j60Var = e70VarD.j;
                        d70 d70Var = e70VarD.d;
                        b60 b60Var = e70VarD.e;
                        o60 o60Var = e70VarD.b;
                        if (hashSet2.contains(str2)) {
                            hashSet = hashSet2;
                            f70Var2 = f70VarP;
                            i2 = i3;
                            i4 = i4;
                        } else {
                            y60 y60Var3 = e70VarH.a;
                            l60 l60Var = e70VarH.m;
                            o5d o5dVar2 = e70VarH.o;
                            hashSet = hashSet2;
                            f60 f60Var2 = e70VarH.k;
                            f70Var2 = f70VarP;
                            j60 j60Var2 = e70VarH.j;
                            d70 d70Var2 = e70VarH.d;
                            b60 b60Var2 = e70VarH.e;
                            int i5 = i3;
                            o60 o60Var2 = e70VarH.b;
                            e70 e70Var2 = e70VarH;
                            y60 y60Var4 = e70VarD.a;
                            if (y60Var3 == y60Var4 || y60Var4 == y60Var2) {
                                if (e70VarD.e() && e70Var2.e()) {
                                    if (o60Var.i != o60Var2.i) {
                                    }
                                    i = i5;
                                    if (!e70Var2.e() || e70Var2.a() || e70Var2.h() || e70Var2.c() || e70Var2.b() || l60Var != null || o5dVar2 != null) {
                                        c60VarJ = e70Var2.j();
                                        c60VarJ.m = e70VarD.u;
                                        c60VarJ.l = e70VarD.t;
                                        c60VarJ.i = e70VarD.q;
                                        c60VarJ.o = e70VarD.w;
                                        c60VarJ.p = e70VarD.x;
                                        c60VarJ.u = e70VarD.y;
                                        c60VarJ.j = e70VarD.r;
                                        c60VarJ.y = e70VarD.z;
                                        if (e70VarD.A) {
                                            e70Var = e70Var2;
                                            boolean z2 = e70Var.B;
                                            c60VarJ.z = z2;
                                            if (!e70Var.h() && !d70Var2.h) {
                                                z60 z60VarA = d70Var2.a();
                                                z60VarA.l = d70Var.m;
                                                z60VarA.e = d70Var.f;
                                                z60VarA.f = d70Var.g;
                                                z60VarA.m = d70Var.n;
                                                z60VarA.p = d70Var.q;
                                                z60VarA.q = d70Var.r;
                                                z60VarA.r = d70Var.s;
                                                byte[] bArr2 = d70Var2.t;
                                                if (bArr2 == null || bArr2.length == 0) {
                                                    z60VarA.t = d70Var.t;
                                                }
                                                c60VarJ.d = new d70(z60VarA);
                                            }
                                            if (cqk.A(e70Var) && cqk.A(e70VarD)) {
                                                d70 d70Var3 = j60Var.d.d;
                                                z60 z60VarA2 = j60Var2.d.d.a();
                                                z60VarA2.l = d70Var3.m;
                                                z60VarA2.e = d70Var3.f;
                                                z60VarA2.f = d70Var3.g;
                                                z60VarA2.m = d70Var3.n;
                                                z60VarA2.p = d70Var3.q;
                                                z60VarA2.q = d70Var3.r;
                                                z60VarA2.r = d70Var3.s;
                                                d70 d70Var4 = new d70(z60VarA2);
                                                c60 c60VarJ2 = j60Var2.d.j();
                                                c60VarJ2.d = d70Var4;
                                                e70 e70VarA = c60VarJ2.a();
                                                i60 i60VarA = j60Var2.a();
                                                i60VarA.d = e70VarA;
                                                c60VarJ.r = new j60(i60VarA);
                                            }
                                            if (e70Var.b()) {
                                                c30 c30Var = new c30(false);
                                                c30Var.b = f60Var2.a;
                                                c30Var.c = f60Var2.b;
                                                c30Var.d = f60Var2.c;
                                                c30Var.g = f60Var2.f;
                                                c30Var.h = f60Var2.g;
                                                c30Var.i = f60Var2.h;
                                                c30Var.e = f60Var2.d;
                                                c30Var.f = f60Var2.e;
                                                c30Var.i = f60Var.h;
                                                c60VarJ.s = new f60(c30Var);
                                            }
                                            if (e70Var.e()) {
                                                c60VarJ.b = o60Var2;
                                            }
                                            if (l60Var != null) {
                                                k60 k60Var = new k60();
                                                k60Var.a = l60Var.a;
                                                k60Var.b = l60Var.b;
                                                k60Var.c = l60Var.c;
                                                k60Var.d = l60Var.d;
                                                k60Var.e = l60Var.e;
                                                k60Var.f = l60Var.f;
                                                k60Var.g = l60Var.g;
                                                k60Var.h = l60Var.h;
                                                k60Var.i = l60Var.i;
                                                k60Var.i = e70VarD.m.i;
                                                c60VarJ.v = k60Var.a();
                                            }
                                            if (e70Var.a()) {
                                                a60VarA = b60Var2.a();
                                                a60VarA.g = b60Var.g;
                                                a60VarA.h = b60Var.h;
                                                bArr = b60Var2.d;
                                                if (bArr != null || bArr.length == 0) {
                                                    a60VarA.d = b60Var.d;
                                                }
                                                c60VarJ.e = new b60(a60VarA);
                                            }
                                            e70VarH = c60VarJ.a();
                                        } else {
                                            e70Var = e70Var2;
                                        }
                                        c60VarJ.z = z2;
                                        if (!e70Var.h()) {
                                        }
                                        if (cqk.A(e70Var)) {
                                            d70 d70Var5 = j60Var.d.d;
                                            z60 z60VarA3 = j60Var2.d.d.a();
                                            z60VarA3.l = d70Var5.m;
                                            z60VarA3.e = d70Var5.f;
                                            z60VarA3.f = d70Var5.g;
                                            z60VarA3.m = d70Var5.n;
                                            z60VarA3.p = d70Var5.q;
                                            z60VarA3.q = d70Var5.r;
                                            z60VarA3.r = d70Var5.s;
                                            d70 d70Var6 = new d70(z60VarA3);
                                            c60 c60VarJ3 = j60Var2.d.j();
                                            c60VarJ3.d = d70Var6;
                                            e70 e70VarA2 = c60VarJ3.a();
                                            i60 i60VarA2 = j60Var2.a();
                                            i60VarA2.d = e70VarA2;
                                            c60VarJ.r = new j60(i60VarA2);
                                        }
                                        if (e70Var.b()) {
                                            c30 c30Var2 = new c30(false);
                                            c30Var2.b = f60Var2.a;
                                            c30Var2.c = f60Var2.b;
                                            c30Var2.d = f60Var2.c;
                                            c30Var2.g = f60Var2.f;
                                            c30Var2.h = f60Var2.g;
                                            c30Var2.i = f60Var2.h;
                                            c30Var2.e = f60Var2.d;
                                            c30Var2.f = f60Var2.e;
                                            c30Var2.i = f60Var.h;
                                            c60VarJ.s = new f60(c30Var2);
                                        }
                                        if (e70Var.e()) {
                                            c60VarJ.b = o60Var2;
                                        }
                                        if (l60Var != null) {
                                            k60 k60Var2 = new k60();
                                            k60Var2.a = l60Var.a;
                                            k60Var2.b = l60Var.b;
                                            k60Var2.c = l60Var.c;
                                            k60Var2.d = l60Var.d;
                                            k60Var2.e = l60Var.e;
                                            k60Var2.f = l60Var.f;
                                            k60Var2.g = l60Var.g;
                                            k60Var2.h = l60Var.h;
                                            k60Var2.i = l60Var.i;
                                            k60Var2.i = e70VarD.m.i;
                                            c60VarJ.v = k60Var2.a();
                                        }
                                        if (e70Var.a()) {
                                            a60VarA = b60Var2.a();
                                            a60VarA.g = b60Var.g;
                                            a60VarA.h = b60Var.h;
                                            bArr = b60Var2.d;
                                            if (bArr != null) {
                                                a60VarA.d = b60Var.d;
                                            } else {
                                                a60VarA.d = b60Var.d;
                                            }
                                            c60VarJ.e = new b60(a60VarA);
                                        }
                                        e70VarH = c60VarJ.a();
                                    } else {
                                        y60Var2 = y60Var2;
                                        e70VarH = e70Var2;
                                        i = i;
                                    }
                                }
                                if (!(e70VarD.a() && e70Var2.a() && b60Var.a == b60Var2.a) && (!(e70VarD.h() && e70Var2.h() && d70Var.a == d70Var2.a) && (!(e70VarD.c() && e70Var2.c() && j60Var.a == j60Var2.a) && (!(e70VarD.b() && e70Var2.b() && f60Var.b == f60Var2.b) && ((o5dVar = e70VarD.o) == null || o5dVar2 == null || o5dVar.a != o5dVar2.a))))) {
                                    if (e70VarD.e() && e70Var2.e() && o60Var.i == 0 && o60Var2.i != 0) {
                                        i = i5;
                                        if (i != i4) {
                                            y60Var2 = y60Var2;
                                            e70VarH = e70Var2;
                                            i2 = i;
                                        }
                                    }
                                    i4++;
                                    hashSet2 = hashSet;
                                    f70Var3 = f70Var;
                                    f70VarP = f70Var2;
                                    y60Var2 = y60Var2;
                                    i3 = i2;
                                } else {
                                    i = i5;
                                }
                                if (e70Var2.e()) {
                                    c60VarJ = e70Var2.j();
                                    c60VarJ.m = e70VarD.u;
                                    c60VarJ.l = e70VarD.t;
                                    c60VarJ.i = e70VarD.q;
                                    c60VarJ.o = e70VarD.w;
                                    c60VarJ.p = e70VarD.x;
                                    c60VarJ.u = e70VarD.y;
                                    c60VarJ.j = e70VarD.r;
                                    c60VarJ.y = e70VarD.z;
                                    if (e70VarD.A) {
                                        e70Var = e70Var2;
                                        if (e70Var.B) {
                                        }
                                        c60VarJ.z = z2;
                                        if (!e70Var.h()) {
                                        }
                                        if (cqk.A(e70Var)) {
                                            d70 d70Var7 = j60Var.d.d;
                                            z60 z60VarA4 = j60Var2.d.d.a();
                                            z60VarA4.l = d70Var7.m;
                                            z60VarA4.e = d70Var7.f;
                                            z60VarA4.f = d70Var7.g;
                                            z60VarA4.m = d70Var7.n;
                                            z60VarA4.p = d70Var7.q;
                                            z60VarA4.q = d70Var7.r;
                                            z60VarA4.r = d70Var7.s;
                                            d70 d70Var8 = new d70(z60VarA4);
                                            c60 c60VarJ4 = j60Var2.d.j();
                                            c60VarJ4.d = d70Var8;
                                            e70 e70VarA3 = c60VarJ4.a();
                                            i60 i60VarA3 = j60Var2.a();
                                            i60VarA3.d = e70VarA3;
                                            c60VarJ.r = new j60(i60VarA3);
                                        }
                                        if (e70Var.b()) {
                                            c30 c30Var3 = new c30(false);
                                            c30Var3.b = f60Var2.a;
                                            c30Var3.c = f60Var2.b;
                                            c30Var3.d = f60Var2.c;
                                            c30Var3.g = f60Var2.f;
                                            c30Var3.h = f60Var2.g;
                                            c30Var3.i = f60Var2.h;
                                            c30Var3.e = f60Var2.d;
                                            c30Var3.f = f60Var2.e;
                                            c30Var3.i = f60Var.h;
                                            c60VarJ.s = new f60(c30Var3);
                                        }
                                        if (e70Var.e()) {
                                            c60VarJ.b = o60Var2;
                                        }
                                        if (l60Var != null) {
                                            k60 k60Var3 = new k60();
                                            k60Var3.a = l60Var.a;
                                            k60Var3.b = l60Var.b;
                                            k60Var3.c = l60Var.c;
                                            k60Var3.d = l60Var.d;
                                            k60Var3.e = l60Var.e;
                                            k60Var3.f = l60Var.f;
                                            k60Var3.g = l60Var.g;
                                            k60Var3.h = l60Var.h;
                                            k60Var3.i = l60Var.i;
                                            k60Var3.i = e70VarD.m.i;
                                            c60VarJ.v = k60Var3.a();
                                        }
                                        if (e70Var.a()) {
                                            a60VarA = b60Var2.a();
                                            a60VarA.g = b60Var.g;
                                            a60VarA.h = b60Var.h;
                                            bArr = b60Var2.d;
                                            if (bArr != null) {
                                                a60VarA.d = b60Var.d;
                                            } else {
                                                a60VarA.d = b60Var.d;
                                            }
                                            c60VarJ.e = new b60(a60VarA);
                                        }
                                        e70VarH = c60VarJ.a();
                                    } else {
                                        e70Var = e70Var2;
                                    }
                                    c60VarJ.z = z2;
                                    if (!e70Var.h()) {
                                    }
                                    if (cqk.A(e70Var)) {
                                        d70 d70Var9 = j60Var.d.d;
                                        z60 z60VarA5 = j60Var2.d.d.a();
                                        z60VarA5.l = d70Var9.m;
                                        z60VarA5.e = d70Var9.f;
                                        z60VarA5.f = d70Var9.g;
                                        z60VarA5.m = d70Var9.n;
                                        z60VarA5.p = d70Var9.q;
                                        z60VarA5.q = d70Var9.r;
                                        z60VarA5.r = d70Var9.s;
                                        d70 d70Var10 = new d70(z60VarA5);
                                        c60 c60VarJ5 = j60Var2.d.j();
                                        c60VarJ5.d = d70Var10;
                                        e70 e70VarA4 = c60VarJ5.a();
                                        i60 i60VarA4 = j60Var2.a();
                                        i60VarA4.d = e70VarA4;
                                        c60VarJ.r = new j60(i60VarA4);
                                    }
                                    if (e70Var.b()) {
                                        c30 c30Var4 = new c30(false);
                                        c30Var4.b = f60Var2.a;
                                        c30Var4.c = f60Var2.b;
                                        c30Var4.d = f60Var2.c;
                                        c30Var4.g = f60Var2.f;
                                        c30Var4.h = f60Var2.g;
                                        c30Var4.i = f60Var2.h;
                                        c30Var4.e = f60Var2.d;
                                        c30Var4.f = f60Var2.e;
                                        c30Var4.i = f60Var.h;
                                        c60VarJ.s = new f60(c30Var4);
                                    }
                                    if (e70Var.e()) {
                                        c60VarJ.b = o60Var2;
                                    }
                                    if (l60Var != null) {
                                        k60 k60Var4 = new k60();
                                        k60Var4.a = l60Var.a;
                                        k60Var4.b = l60Var.b;
                                        k60Var4.c = l60Var.c;
                                        k60Var4.d = l60Var.d;
                                        k60Var4.e = l60Var.e;
                                        k60Var4.f = l60Var.f;
                                        k60Var4.g = l60Var.g;
                                        k60Var4.h = l60Var.h;
                                        k60Var4.i = l60Var.i;
                                        k60Var4.i = e70VarD.m.i;
                                        c60VarJ.v = k60Var4.a();
                                    }
                                    if (e70Var.a()) {
                                        a60VarA = b60Var2.a();
                                        a60VarA.g = b60Var.g;
                                        a60VarA.h = b60Var.h;
                                        bArr = b60Var2.d;
                                        if (bArr != null) {
                                            a60VarA.d = b60Var.d;
                                        } else {
                                            a60VarA.d = b60Var.d;
                                        }
                                        c60VarJ.e = new b60(a60VarA);
                                    }
                                    e70VarH = c60VarJ.a();
                                } else {
                                    c60VarJ = e70Var2.j();
                                    c60VarJ.m = e70VarD.u;
                                    c60VarJ.l = e70VarD.t;
                                    c60VarJ.i = e70VarD.q;
                                    c60VarJ.o = e70VarD.w;
                                    c60VarJ.p = e70VarD.x;
                                    c60VarJ.u = e70VarD.y;
                                    c60VarJ.j = e70VarD.r;
                                    c60VarJ.y = e70VarD.z;
                                    if (e70VarD.A) {
                                        e70Var = e70Var2;
                                        if (e70Var.B) {
                                        }
                                        c60VarJ.z = z2;
                                        if (!e70Var.h()) {
                                        }
                                        if (cqk.A(e70Var)) {
                                            d70 d70Var11 = j60Var.d.d;
                                            z60 z60VarA6 = j60Var2.d.d.a();
                                            z60VarA6.l = d70Var11.m;
                                            z60VarA6.e = d70Var11.f;
                                            z60VarA6.f = d70Var11.g;
                                            z60VarA6.m = d70Var11.n;
                                            z60VarA6.p = d70Var11.q;
                                            z60VarA6.q = d70Var11.r;
                                            z60VarA6.r = d70Var11.s;
                                            d70 d70Var12 = new d70(z60VarA6);
                                            c60 c60VarJ6 = j60Var2.d.j();
                                            c60VarJ6.d = d70Var12;
                                            e70 e70VarA5 = c60VarJ6.a();
                                            i60 i60VarA5 = j60Var2.a();
                                            i60VarA5.d = e70VarA5;
                                            c60VarJ.r = new j60(i60VarA5);
                                        }
                                        if (e70Var.b()) {
                                            c30 c30Var5 = new c30(false);
                                            c30Var5.b = f60Var2.a;
                                            c30Var5.c = f60Var2.b;
                                            c30Var5.d = f60Var2.c;
                                            c30Var5.g = f60Var2.f;
                                            c30Var5.h = f60Var2.g;
                                            c30Var5.i = f60Var2.h;
                                            c30Var5.e = f60Var2.d;
                                            c30Var5.f = f60Var2.e;
                                            c30Var5.i = f60Var.h;
                                            c60VarJ.s = new f60(c30Var5);
                                        }
                                        if (e70Var.e()) {
                                            c60VarJ.b = o60Var2;
                                        }
                                        if (l60Var != null) {
                                            k60 k60Var5 = new k60();
                                            k60Var5.a = l60Var.a;
                                            k60Var5.b = l60Var.b;
                                            k60Var5.c = l60Var.c;
                                            k60Var5.d = l60Var.d;
                                            k60Var5.e = l60Var.e;
                                            k60Var5.f = l60Var.f;
                                            k60Var5.g = l60Var.g;
                                            k60Var5.h = l60Var.h;
                                            k60Var5.i = l60Var.i;
                                            k60Var5.i = e70VarD.m.i;
                                            c60VarJ.v = k60Var5.a();
                                        }
                                        if (e70Var.a()) {
                                            a60VarA = b60Var2.a();
                                            a60VarA.g = b60Var.g;
                                            a60VarA.h = b60Var.h;
                                            bArr = b60Var2.d;
                                            if (bArr != null) {
                                                a60VarA.d = b60Var.d;
                                            } else {
                                                a60VarA.d = b60Var.d;
                                            }
                                            c60VarJ.e = new b60(a60VarA);
                                        }
                                        e70VarH = c60VarJ.a();
                                    } else {
                                        e70Var = e70Var2;
                                    }
                                    c60VarJ.z = z2;
                                    if (!e70Var.h()) {
                                    }
                                    if (cqk.A(e70Var)) {
                                        d70 d70Var13 = j60Var.d.d;
                                        z60 z60VarA7 = j60Var2.d.d.a();
                                        z60VarA7.l = d70Var13.m;
                                        z60VarA7.e = d70Var13.f;
                                        z60VarA7.f = d70Var13.g;
                                        z60VarA7.m = d70Var13.n;
                                        z60VarA7.p = d70Var13.q;
                                        z60VarA7.q = d70Var13.r;
                                        z60VarA7.r = d70Var13.s;
                                        d70 d70Var14 = new d70(z60VarA7);
                                        c60 c60VarJ7 = j60Var2.d.j();
                                        c60VarJ7.d = d70Var14;
                                        e70 e70VarA6 = c60VarJ7.a();
                                        i60 i60VarA6 = j60Var2.a();
                                        i60VarA6.d = e70VarA6;
                                        c60VarJ.r = new j60(i60VarA6);
                                    }
                                    if (e70Var.b()) {
                                        c30 c30Var6 = new c30(false);
                                        c30Var6.b = f60Var2.a;
                                        c30Var6.c = f60Var2.b;
                                        c30Var6.d = f60Var2.c;
                                        c30Var6.g = f60Var2.f;
                                        c30Var6.h = f60Var2.g;
                                        c30Var6.i = f60Var2.h;
                                        c30Var6.e = f60Var2.d;
                                        c30Var6.f = f60Var2.e;
                                        c30Var6.i = f60Var.h;
                                        c60VarJ.s = new f60(c30Var6);
                                    }
                                    if (e70Var.e()) {
                                        c60VarJ.b = o60Var2;
                                    }
                                    if (l60Var != null) {
                                        k60 k60Var6 = new k60();
                                        k60Var6.a = l60Var.a;
                                        k60Var6.b = l60Var.b;
                                        k60Var6.c = l60Var.c;
                                        k60Var6.d = l60Var.d;
                                        k60Var6.e = l60Var.e;
                                        k60Var6.f = l60Var.f;
                                        k60Var6.g = l60Var.g;
                                        k60Var6.h = l60Var.h;
                                        k60Var6.i = l60Var.i;
                                        k60Var6.i = e70VarD.m.i;
                                        c60VarJ.v = k60Var6.a();
                                    }
                                    if (e70Var.a()) {
                                        a60VarA = b60Var2.a();
                                        a60VarA.g = b60Var.g;
                                        a60VarA.h = b60Var.h;
                                        bArr = b60Var2.d;
                                        if (bArr != null) {
                                            a60VarA.d = b60Var.d;
                                        } else {
                                            a60VarA.d = b60Var.d;
                                        }
                                        c60VarJ.e = new b60(a60VarA);
                                    }
                                    e70VarH = c60VarJ.a();
                                }
                            } else {
                                i4 = i4;
                            }
                            e70VarH = e70Var2;
                            i2 = i5;
                        }
                        i4++;
                        hashSet2 = hashSet;
                        f70Var3 = f70Var;
                        f70VarP = f70Var2;
                        y60Var2 = y60Var2;
                        i3 = i2;
                    } else {
                        hashSet = hashSet2;
                        y60Var2 = y60Var2;
                        f70Var2 = f70VarP;
                        i = i3;
                    }
                    y60 y60Var5 = e70VarH.a;
                    if (y60Var5 != null) {
                        y60Var = y60Var2;
                        if (y60Var5 == y60Var && str != null) {
                            c60 c60VarJ8 = e70VarH.j();
                            c60VarJ8.B = str;
                            e70VarH = c60VarJ8.a();
                        }
                    } else {
                        y60Var = y60Var2;
                    }
                    f70 f70Var4 = f70Var2;
                    int i6 = i;
                    f70Var4.e(i6, e70VarH);
                    HashSet hashSet3 = hashSet;
                    hashSet3.add(e70VarH.t);
                    i3 = i6 + 1;
                    f70VarP = f70Var4;
                    y60Var2 = y60Var;
                    hashSet2 = hashSet3;
                    f70Var3 = f70Var;
                    c46Var2 = c46Var;
                }
            }
            f70Var.a = (List) f70VarP.c().a;
        }
    }
}
