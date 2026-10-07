package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.media3.common.ParserException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class wk0 implements jj6 {
    public final nmc a;
    public final td0 b;
    public final boolean c;
    public final lhb d;
    public int e;
    public lj6 f;
    public xk0 g;
    public long h;
    public wq3[] i;
    public long j;
    public wq3 k;
    public int l;
    public long m;
    public long n;
    public int o;
    public boolean p;

    public wk0(int i, lhb lhbVar) {
        this.d = lhbVar;
        this.c = (i & 1) == 0;
        this.a = new nmc(12);
        this.b = new td0(2);
        this.f = new lu8();
        this.i = new wq3[0];
        this.m = -1L;
        this.n = -1L;
        this.l = -1;
        this.h = -9223372036854775807L;
    }

    @Override // defpackage.jj6
    public final void A(lj6 lj6Var) {
        this.e = 0;
        if (this.c) {
            lj6Var = new ae7(lj6Var, this.d);
        }
        this.f = lj6Var;
        this.j = -1L;
    }

    @Override // defpackage.jj6
    public final boolean b(kj6 kj6Var) {
        nmc nmcVar = this.a;
        kj6Var.u(0, nmcVar.a, 12);
        nmcVar.N(0);
        if (nmcVar.o() != 1179011410) {
            return false;
        }
        nmcVar.O(4);
        return nmcVar.o() == 541677121;
    }

    @Override // defpackage.jj6
    public final void g(long j, long j2) {
        this.j = -1L;
        this.k = null;
        for (wq3 wq3Var : this.i) {
            if (wq3Var.k == 0) {
                wq3Var.i = 0;
            } else {
                wq3Var.i = wq3Var.n[vqi.f(wq3Var.m, j, true)];
            }
        }
        if (j != 0) {
            this.e = 6;
        } else if (this.i.length == 0) {
            this.e = 0;
        } else {
            this.e = 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:178:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:65:0x0107  */
    /* JADX WARN: Code duplicated, block: B:67:0x0110  */
    @Override // defpackage.jj6
    public final int l(kj6 kj6Var, s8 s8Var) throws ParserException {
        boolean z;
        int i;
        wq3 wq3Var;
        long j;
        int i2;
        wq3 wq3Var2;
        int i3 = 0;
        if (this.j != -1) {
            long position = kj6Var.getPosition();
            long j2 = this.j;
            if (j2 < position || j2 > PlaybackStateCompat.ACTION_SET_REPEAT_MODE + position) {
                s8Var.a = j2;
                z = true;
            } else {
                kj6Var.E((int) (j2 - position));
                z = false;
            }
        } else {
            z = false;
        }
        this.j = -1L;
        if (z) {
            return 1;
        }
        int i4 = this.e;
        int i5 = 4;
        wq3 wq3Var3 = null;
        td0 td0Var = this.b;
        int i6 = 2;
        nmc nmcVar = this.a;
        switch (i4) {
            case 0:
                if (!b(kj6Var)) {
                    throw ParserException.a(null, "AVI Header List not found");
                }
                kj6Var.E(12);
                this.e = 1;
                return 0;
            case 1:
                kj6Var.readFully(nmcVar.a, 0, 12);
                nmcVar.N(0);
                td0Var.getClass();
                td0Var.b = nmcVar.o();
                td0Var.c = nmcVar.o();
                td0Var.d = 0;
                if (td0Var.b != 1414744396) {
                    throw ParserException.a(null, "LIST expected, found: " + td0Var.b);
                }
                int iO = nmcVar.o();
                td0Var.d = iO;
                if (iO == 1819436136) {
                    this.l = td0Var.c;
                    this.e = 2;
                    return 0;
                }
                throw ParserException.a(null, "hdrl expected, found: " + td0Var.d);
            case 2:
                int i7 = this.l - 4;
                nmc nmcVar2 = new nmc(i7);
                kj6Var.readFully(nmcVar2.a, 0, i7);
                d79 d79VarB = d79.b(1819436136, nmcVar2);
                int i8 = d79VarB.b;
                if (i8 != 1819436136) {
                    throw ParserException.a(null, "Unexpected header list type " + i8);
                }
                xk0 xk0Var = (xk0) d79VarB.a(xk0.class);
                if (xk0Var == null) {
                    throw ParserException.a(null, "AviHeader not found");
                }
                this.g = xk0Var;
                this.h = ((long) xk0Var.c) * ((long) xk0Var.a);
                ArrayList arrayList = new ArrayList();
                a98 a98VarListIterator = d79VarB.a.listIterator(0);
                int i9 = 0;
                while (a98VarListIterator.hasNext()) {
                    uk0 uk0Var = (uk0) a98VarListIterator.next();
                    if (uk0Var.getType() == 1819440243) {
                        d79 d79Var = (d79) uk0Var;
                        int i10 = i9 + 1;
                        yk0 yk0Var = (yk0) d79Var.a(yk0.class);
                        e4h e4hVar = (e4h) d79Var.a(e4h.class);
                        if (yk0Var == null) {
                            lvb.G0("AviExtractor", "Missing Stream Header");
                        } else {
                            if (e4hVar == null) {
                                lvb.G0("AviExtractor", "Missing Stream Format");
                            } else {
                                long j3 = yk0Var.d;
                                long j4 = ((long) yk0Var.b) * 1000000;
                                i = i10;
                                long j5 = yk0Var.c;
                                String str = vqi.a;
                                long jI0 = vqi.i0(j3, j4, j5, RoundingMode.DOWN);
                                b87 b87Var = e4hVar.a;
                                a87 a87VarA = b87Var.a();
                                a87VarA.a = Integer.toString(i9);
                                int i11 = yk0Var.e;
                                if (i11 != 0) {
                                    a87VarA.n = i11;
                                }
                                l4h l4hVar = (l4h) d79Var.a(l4h.class);
                                if (l4hVar != null) {
                                    a87VarA.b = l4hVar.a;
                                }
                                int iH = uya.h(b87Var.n);
                                if (iH == 1 || iH == i6) {
                                    kyh kyhVarG = this.f.G(i9, iH);
                                    kyhVarG.g(new b87(a87VarA));
                                    kyhVarG.e(jI0);
                                    this.h = Math.max(this.h, jI0);
                                    wq3Var = new wq3(i9, yk0Var, kyhVarG);
                                } else {
                                    wq3Var = null;
                                }
                            }
                            if (wq3Var != null) {
                                arrayList.add(wq3Var);
                            }
                            i9 = i;
                        }
                        i = i10;
                        wq3Var = null;
                        if (wq3Var != null) {
                            arrayList.add(wq3Var);
                        }
                        i9 = i;
                    }
                    i3 = 0;
                    i6 = 2;
                }
                int i12 = i3;
                this.i = (wq3[]) arrayList.toArray(new wq3[i12]);
                this.f.D();
                this.e = 3;
                return i12;
            case 3:
                if (this.m != -1) {
                    long position2 = kj6Var.getPosition();
                    long j6 = this.m;
                    if (position2 != j6) {
                        this.j = j6;
                        return 0;
                    }
                }
                kj6Var.u(0, nmcVar.a, 12);
                kj6Var.q();
                nmcVar.N(0);
                td0Var.getClass();
                td0Var.b = nmcVar.o();
                td0Var.c = nmcVar.o();
                td0Var.d = 0;
                int iO2 = nmcVar.o();
                int i13 = td0Var.b;
                if (i13 == 1179011410) {
                    kj6Var.E(12);
                    return 0;
                }
                if (i13 != 1414744396 || iO2 != 1769369453) {
                    this.j = kj6Var.getPosition() + ((long) td0Var.c) + 8;
                    return 0;
                }
                long position3 = kj6Var.getPosition();
                this.m = position3;
                this.n = position3 + ((long) td0Var.c) + 8;
                if (!this.p) {
                    xk0 xk0Var2 = this.g;
                    xk0Var2.getClass();
                    if ((xk0Var2.b & 16) == 16) {
                        this.e = 4;
                        this.j = this.n;
                        return 0;
                    }
                    this.f.r(new vk0(this.h));
                    this.p = true;
                }
                this.j = kj6Var.getPosition() + 12;
                this.e = 6;
                return 0;
            case 4:
                kj6Var.readFully(nmcVar.a, 0, 8);
                nmcVar.N(0);
                int iO3 = nmcVar.o();
                int iO4 = nmcVar.o();
                if (iO3 != 829973609) {
                    this.j = kj6Var.getPosition() + ((long) iO4);
                    return 0;
                }
                this.e = 5;
                this.o = iO4;
                return 0;
            case 5:
                nmc nmcVar3 = new nmc(this.o);
                kj6Var.readFully(nmcVar3.a, 0, this.o);
                if (nmcVar3.a() < 16) {
                    j = 0;
                } else {
                    int i14 = nmcVar3.b;
                    nmcVar3.O(8);
                    long jO = nmcVar3.o();
                    long j7 = this.m;
                    j = jO > j7 ? 0L : j7 + 8;
                    nmcVar3.N(i14);
                }
                while (nmcVar3.a() >= 16) {
                    int iO5 = nmcVar3.o();
                    int iO6 = nmcVar3.o();
                    long jO2 = ((long) nmcVar3.o()) + j;
                    nmcVar3.O(i5);
                    wq3[] wq3VarArr = this.i;
                    int length = wq3VarArr.length;
                    int i15 = 0;
                    while (true) {
                        if (i15 < length) {
                            wq3Var2 = wq3VarArr[i15];
                            if (wq3Var2.c != iO5 && wq3Var2.d != iO5) {
                                i15++;
                            }
                        } else {
                            wq3Var2 = null;
                        }
                    }
                    if (wq3Var2 != null) {
                        boolean z2 = (iO6 & 16) == 16;
                        if (wq3Var2.l == -1) {
                            wq3Var2.l = jO2;
                        }
                        if (z2) {
                            if (wq3Var2.k == wq3Var2.n.length) {
                                long[] jArr = wq3Var2.m;
                                wq3Var2.m = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                                int[] iArr = wq3Var2.n;
                                wq3Var2.n = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
                            }
                            long[] jArr2 = wq3Var2.m;
                            int i16 = wq3Var2.k;
                            jArr2[i16] = jO2;
                            wq3Var2.n[i16] = wq3Var2.j;
                            wq3Var2.k = i16 + 1;
                        }
                        wq3Var2.j++;
                    }
                    i5 = 4;
                }
                for (wq3 wq3Var4 : this.i) {
                    wq3Var4.m = Arrays.copyOf(wq3Var4.m, wq3Var4.k);
                    wq3Var4.n = Arrays.copyOf(wq3Var4.n, wq3Var4.k);
                    if ((wq3Var4.c & 1651965952) == 1651965952 && wq3Var4.a.f != 0 && (i2 = wq3Var4.k) > 0) {
                        wq3Var4.f = i2;
                    }
                }
                this.p = true;
                int length2 = this.i.length;
                lj6 lj6Var = this.f;
                long j8 = this.h;
                if (length2 == 0) {
                    lj6Var.r(new vk0(j8));
                } else {
                    lj6Var.r(new vk0(this, j8, 0));
                }
                this.e = 6;
                this.j = this.m;
                return 0;
            case 6:
                if (kj6Var.getPosition() >= this.n) {
                    return -1;
                }
                wq3 wq3Var5 = this.k;
                if (wq3Var5 != null) {
                    int i17 = wq3Var5.h;
                    int iC = i17 - wq3Var5.b.c(kj6Var, i17, false);
                    wq3Var5.h = iC;
                    boolean z3 = iC == 0;
                    if (z3) {
                        if (wq3Var5.g > 0) {
                            kyh kyhVar = wq3Var5.b;
                            int i18 = wq3Var5.i;
                            kyhVar.a((wq3Var5.e * ((long) i18)) / ((long) wq3Var5.f), Arrays.binarySearch(wq3Var5.n, i18) >= 0 ? 1 : 0, wq3Var5.g, 0, null);
                        }
                        wq3Var5.i++;
                    }
                    if (z3) {
                        this.k = null;
                    }
                    return 0;
                }
                if ((kj6Var.getPosition() & 1) == 1) {
                    kj6Var.E(1);
                }
                kj6Var.u(0, nmcVar.a, 12);
                nmcVar.N(0);
                int iO7 = nmcVar.o();
                if (iO7 == 1414744396) {
                    nmcVar.N(8);
                    kj6Var.E(nmcVar.o() == 1769369453 ? 12 : 8);
                    kj6Var.q();
                    return 0;
                }
                int iO8 = nmcVar.o();
                if (iO7 == 1263424842) {
                    this.j = kj6Var.getPosition() + ((long) iO8) + 8;
                    return 0;
                }
                kj6Var.E(8);
                kj6Var.q();
                for (wq3 wq3Var6 : this.i) {
                    if (wq3Var6.c == iO7 || wq3Var6.d == iO7) {
                        wq3Var3 = wq3Var6;
                        if (wq3Var3 == null) {
                            this.j = kj6Var.getPosition() + ((long) iO8);
                            return 0;
                        }
                        wq3Var3.g = iO8;
                        wq3Var3.h = iO8;
                        this.k = wq3Var3;
                        return 0;
                    }
                }
                if (wq3Var3 == null) {
                    this.j = kj6Var.getPosition() + ((long) iO8);
                    return 0;
                }
                wq3Var3.g = iO8;
                wq3Var3.h = iO8;
                this.k = wq3Var3;
                return 0;
            default:
                throw new AssertionError();
        }
    }

    @Override // defpackage.jj6
    public final void release() {
    }
}
