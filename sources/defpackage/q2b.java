package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.media3.common.ParserException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.webrtc.PeerConnection;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class q2b implements jj6 {
    public long A;
    public lj6 B;
    public p2b[] C;
    public long[][] D;
    public int E;
    public n1b F;
    public final b8h a;
    public final int b;
    public final boolean c;
    public final nmc d;
    public final nmc e;
    public final nmc f;
    public final nmc g;
    public final ArrayDeque h;
    public final dcf i;
    public final ArrayList j;
    public ghe k;
    public int l;
    public int m;
    public long n;
    public int o;
    public nmc p;
    public int q;
    public int r;
    public int s;
    public int t;
    public boolean u;
    public boolean v;
    public boolean w;
    public long x;
    public boolean y;
    public boolean z;

    public q2b(b8h b8hVar, int i) {
        this.a = b8hVar;
        this.b = i;
        this.c = (i & np0.n) != 0;
        a98 a98Var = c98.b;
        this.k = ghe.e;
        this.l = (i & 4) != 0 ? 3 : 0;
        this.i = new dcf();
        this.j = new ArrayList();
        this.g = new nmc(16);
        this.h = new ArrayDeque();
        this.d = new nmc(xsg.a);
        this.e = new nmc(6);
        this.f = new nmc();
        this.q = -1;
        this.B = lj6.o0;
        this.C = new p2b[0];
    }

    @Override // defpackage.jj6
    public final void A(lj6 lj6Var) {
        if ((this.b & 16) == 0) {
            lj6Var = new ae7(lj6Var, this.a);
        }
        this.B = lj6Var;
    }

    /* JADX WARN: Code duplicated, block: B:162:0x0309  */
    /* JADX WARN: Code duplicated, block: B:163:0x0319  */
    /* JADX WARN: Code duplicated, block: B:172:0x0334  */
    /* JADX WARN: Code duplicated, block: B:174:0x033a  */
    /* JADX WARN: Code duplicated, block: B:177:0x0355  */
    /* JADX WARN: Code duplicated, block: B:179:0x035e  */
    /* JADX WARN: Code duplicated, block: B:20:0x006e  */
    /* JADX WARN: Code duplicated, block: B:262:0x0134 A[EDGE_INSN: B:262:0x0134->B:74:0x0134 BREAK  A[LOOP:9: B:62:0x0102->B:72:0x012c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:72:0x012c A[LOOP:9: B:62:0x0102->B:72:0x012c, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void a(long j) throws ParserException {
        int i;
        ArrayList arrayList;
        lwa lwaVarF;
        boolean z;
        ArrayDeque arrayDeque;
        boolean z2;
        lwa lwaVarK;
        long[][] jArr;
        int i2;
        String str;
        lwa lwaVar;
        int i3;
        long j2;
        int i4;
        int i5;
        int i6;
        lwa lwaVar2;
        ArrayList arrayList2;
        lwa lwaVar3;
        lwa lwaVar4;
        lwa lwaVar5;
        int i7;
        int i8;
        int i9;
        jwa jwaVar;
        jwa jwaVar2;
        jwa jwaVar3;
        int i10;
        while (true) {
            ArrayDeque arrayDeque2 = this.h;
            int i11 = 0;
            if (arrayDeque2.isEmpty() || ((m2b) arrayDeque2.peek()).c != j) {
                break;
            }
            m2b m2bVar = (m2b) arrayDeque2.pop();
            if (m2bVar.b == 1836019574) {
                m2b m2bVarG = m2bVar.g(1835365473);
                ArrayList arrayList3 = new ArrayList();
                boolean z3 = this.c;
                long j3 = 0;
                int i12 = this.b;
                if (m2bVarG != null) {
                    lwaVarF = r21.f(m2bVarG);
                    if (this.y) {
                        lwaVarF.getClass();
                        jwa[] jwaVarArr = lwaVarF.a;
                        int length = jwaVarArr.length;
                        int i13 = 0;
                        while (true) {
                            if (i13 >= length) {
                                jwaVar2 = null;
                                break;
                            }
                            jwa jwaVar4 = jwaVarArr[i13];
                            if (qp9.class.isAssignableFrom(jwaVar4.getClass())) {
                                jwaVar2 = (jwa) qp9.class.cast(jwaVar4);
                                if (!((qp9) jwaVar2).a.equals("auxiliary.tracks.interleaved")) {
                                    jwaVar2 = null;
                                }
                            } else {
                                jwaVar2 = null;
                            }
                            if (jwaVar2 != null) {
                                break;
                            } else {
                                i13++;
                            }
                        }
                        qp9 qp9Var = (qp9) jwaVar2;
                        if (qp9Var != null && qp9Var.b[0] == 0) {
                            this.A = this.x + 16;
                        }
                        int length2 = jwaVarArr.length;
                        int i14 = 0;
                        while (true) {
                            if (i14 >= length2) {
                                jwaVar3 = null;
                                break;
                            }
                            jwa jwaVar5 = jwaVarArr[i14];
                            if (qp9.class.isAssignableFrom(jwaVar5.getClass())) {
                                jwaVar3 = (jwa) qp9.class.cast(jwaVar5);
                                if (!((qp9) jwaVar3).a.equals("auxiliary.tracks.map")) {
                                    jwaVar3 = null;
                                }
                            } else {
                                jwaVar3 = null;
                            }
                            if (jwaVar3 != null) {
                                break;
                            } else {
                                i14++;
                            }
                        }
                        qp9 qp9Var2 = (qp9) jwaVar3;
                        qp9Var2.getClass();
                        ArrayList arrayListD = qp9Var2.d();
                        ArrayList arrayList4 = new ArrayList(arrayListD.size());
                        for (int i15 = 0; i15 < arrayListD.size(); i15++) {
                            int iIntValue = ((Integer) arrayListD.get(i15)).intValue();
                            if (iIntValue == 0) {
                                i10 = 1;
                            } else if (iIntValue != 1) {
                                i10 = 3;
                                if (iIntValue != 2) {
                                    i10 = iIntValue != 3 ? 0 : 4;
                                }
                            } else {
                                i10 = 2;
                            }
                            arrayList4.add(Integer.valueOf(i10));
                        }
                        i = 0;
                        arrayList = arrayList4;
                    } else {
                        if (lwaVarF == null || (i12 & 64) == 0) {
                            i = 0;
                        } else {
                            jwa[] jwaVarArr2 = lwaVarF.a;
                            int length3 = jwaVarArr2.length;
                            int i16 = 0;
                            while (true) {
                                if (i16 >= length3) {
                                    i = i11;
                                    jwaVar = null;
                                    break;
                                }
                                jwa jwaVar6 = jwaVarArr2[i16];
                                if (qp9.class.isAssignableFrom(jwaVar6.getClass())) {
                                    jwaVar = (jwa) qp9.class.cast(jwaVar6);
                                    i = i11;
                                    if (!((qp9) jwaVar).a.equals("auxiliary.tracks.offset")) {
                                    }
                                    if (jwaVar != null) {
                                        break;
                                    }
                                    i16++;
                                    i11 = i;
                                } else {
                                    i = i11;
                                }
                                jwaVar = null;
                                if (jwaVar != null) {
                                    break;
                                    break;
                                } else {
                                    i16++;
                                    i11 = i;
                                }
                            }
                            qp9 qp9Var3 = (qp9) jwaVar;
                            if (qp9Var3 != null) {
                                long jG = new nmc(qp9Var3.b).G();
                                if (jG > 0) {
                                    this.x = jG;
                                    this.w = true;
                                    arrayDeque = arrayDeque2;
                                    z2 = true;
                                    z = z3;
                                }
                                arrayDeque.clear();
                                this.z = z2;
                                if (this.w && !z) {
                                    this.l = 2;
                                }
                            }
                        }
                        arrayList = arrayList3;
                    }
                } else {
                    i = 0;
                    arrayList = arrayList3;
                    lwaVarF = null;
                }
                ArrayList arrayList5 = new ArrayList();
                boolean z4 = this.E == 1 ? 1 : i;
                jj7 jj7Var = new jj7();
                n2b n2bVarH = m2bVar.h(1969517665);
                if (n2bVarH != null) {
                    lwaVarK = r21.k(n2bVarH);
                    jj7Var.b(lwaVarK);
                } else {
                    lwaVarK = null;
                }
                n2b n2bVarH2 = m2bVar.h(1836476516);
                n2bVarH2.getClass();
                jwa[] jwaVarArr3 = new jwa[1];
                jwaVarArr3[i] = r21.g(n2bVarH2.c);
                lwa lwaVar6 = new lwa(jwaVarArr3);
                lwa lwaVar7 = lwaVarK;
                ArrayList arrayListJ = r21.j(m2bVar, jj7Var, -9223372036854775807L, null, (i12 & 1) != 0 ? 1 : i, z4, new f4a(25), this.c);
                if (this.y) {
                    boolean z5 = arrayList.size() == arrayListJ.size() ? 1 : i;
                    Locale locale = Locale.US;
                    lvb.Z(nbh.u("The number of auxiliary track types from metadata (", arrayList.size(), ") is not same as the number of auxiliary tracks (", arrayListJ.size(), ")"), z5);
                }
                String strA = avk.a(arrayListJ);
                int i17 = i;
                int i18 = i17;
                long j4 = -9223372036854775807L;
                int size = -1;
                while (i17 < arrayListJ.size()) {
                    lyh lyhVar = (lyh) arrayListJ.get(i17);
                    int i19 = lyhVar.b;
                    ArrayDeque arrayDeque3 = arrayDeque2;
                    cyh cyhVar = lyhVar.a;
                    if (i19 == 0) {
                        arrayList = arrayList;
                        str = strA;
                        i3 = i17;
                        i2 = i18;
                        lwaVar4 = lwaVar7;
                        lwaVar5 = lwaVar6;
                        lwaVar = lwaVarF;
                    } else {
                        lj6 lj6Var = this.B;
                        i2 = i18 + 1;
                        str = strA;
                        int i20 = cyhVar.b;
                        b87 b87Var = cyhVar.g;
                        kyh kyhVarG = lj6Var.G(i18, i20);
                        p2b p2bVar = new p2b(cyhVar, lyhVar, kyhVarG);
                        lwaVar = lwaVarF;
                        long j5 = cyhVar.e;
                        if (j5 == -9223372036854775807L) {
                            j5 = lyhVar.i;
                        }
                        kyhVarG.e(j5);
                        long jMax = Math.max(j4, j5);
                        String str2 = b87Var.n;
                        String str3 = b87Var.n;
                        boolean zEquals = "audio/true-hd".equals(str2);
                        int i21 = lyhVar.e;
                        int i22 = zEquals ? i21 * 16 : i21 + 30;
                        a87 a87VarA = b87Var.a();
                        a87VarA.n = i22;
                        if (i20 == 2) {
                            int i23 = b87Var.f;
                            if ((i12 & 8) != 0) {
                                i23 |= size == -1 ? 1 : 2;
                            }
                            int i24 = i23;
                            if (this.y) {
                                i9 = i24 | PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS;
                                a87VarA.g = ((Integer) arrayList.get(i17)).intValue();
                            } else {
                                i9 = i24;
                            }
                            a87VarA.f = i9;
                        } else {
                            arrayList = arrayList;
                        }
                        long[] jArr2 = lyhVar.f;
                        int[] iArr = lyhVar.h;
                        boolean z6 = lyhVar.j;
                        if (uya.m(str3)) {
                            int iMin = Math.min(z6 ? lyhVar.b : iArr.length, 20);
                            lvb.b0(j5 != -9223372036854775807L ? 1 : i);
                            i3 = i17;
                            long jMin = Math.min(j5, 10000000L);
                            int i25 = i;
                            int i26 = i25;
                            int i27 = -1;
                            while (i25 < iMin) {
                                int i28 = z6 ? i25 : iArr[i25];
                                long j6 = jArr2[i28];
                                if (j6 > jMin) {
                                    break;
                                }
                                if (j6 >= 0 && (i5 = lyhVar.d[(i4 = i28)]) > i26) {
                                    i26 = i5;
                                    i27 = i4;
                                }
                                i25++;
                            }
                            if (i27 != -1) {
                                j2 = jArr2[i27];
                            }
                            if (j2 != -9223372036854775807L) {
                                qrh qrhVar = new qrh(j2);
                                i6 = 1;
                                jwa[] jwaVarArr4 = new jwa[1];
                                jwaVarArr4[i] = qrhVar;
                                lwaVar2 = new lwa(jwaVarArr4);
                            } else {
                                i6 = 1;
                                lwaVar2 = null;
                            }
                            if (i20 == i6 && (i7 = jj7Var.a) != -1 && (i8 = jj7Var.b) != -1) {
                                a87VarA.H = i7;
                                a87VarA.I = i8;
                            }
                            lwa lwaVar8 = b87Var.l;
                            arrayList2 = this.j;
                            if (arrayList2.isEmpty()) {
                                lwaVar3 = null;
                            } else {
                                lwaVar3 = new lwa(arrayList2);
                            }
                            lwaVar4 = lwaVar7;
                            lwaVar5 = lwaVar6;
                            xuk.g(i20, lwaVar, a87VarA, lwaVar8, lwaVar3, lwaVar4, lwaVar5, lwaVar2);
                            a87VarA.l = uya.n(str);
                            if (Objects.equals(str3, "audio/mpeg")) {
                                p2bVar.f = new b87(a87VarA);
                            } else {
                                ewi.n(a87VarA, p2bVar.c);
                            }
                            if (i20 == 2 && size == -1) {
                                size = arrayList5.size();
                            }
                            arrayList5.add(p2bVar);
                            j4 = jMax;
                        } else {
                            i3 = i17;
                        }
                        j2 = -9223372036854775807L;
                        if (j2 != -9223372036854775807L) {
                            qrh qrhVar2 = new qrh(j2);
                            i6 = 1;
                            jwa[] jwaVarArr5 = new jwa[1];
                            jwaVarArr5[i] = qrhVar2;
                            lwaVar2 = new lwa(jwaVarArr5);
                        } else {
                            i6 = 1;
                            lwaVar2 = null;
                        }
                        if (i20 == i6) {
                            a87VarA.H = i7;
                            a87VarA.I = i8;
                        }
                        lwa lwaVar9 = b87Var.l;
                        arrayList2 = this.j;
                        if (arrayList2.isEmpty()) {
                            lwaVar3 = null;
                        } else {
                            lwaVar3 = new lwa(arrayList2);
                        }
                        lwaVar4 = lwaVar7;
                        lwaVar5 = lwaVar6;
                        xuk.g(i20, lwaVar, a87VarA, lwaVar9, lwaVar3, lwaVar4, lwaVar5, lwaVar2);
                        a87VarA.l = uya.n(str);
                        if (Objects.equals(str3, "audio/mpeg")) {
                            p2bVar.f = new b87(a87VarA);
                        } else {
                            ewi.n(a87VarA, p2bVar.c);
                        }
                        if (i20 == 2) {
                            size = arrayList5.size();
                        }
                        arrayList5.add(p2bVar);
                        j4 = jMax;
                    }
                    lwaVar7 = lwaVar4;
                    lwaVar6 = lwaVar5;
                    lwaVarF = lwaVar;
                    arrayDeque2 = arrayDeque3;
                    arrayListJ = arrayListJ;
                    i18 = i2;
                    strA = str;
                    z3 = z3;
                    i17 = i3 + 1;
                    arrayList = arrayList;
                }
                arrayDeque = arrayDeque2;
                z = z3;
                boolean z7 = true;
                int i29 = -1;
                p2b[] p2bVarArr = (p2b[]) arrayList5.toArray(new p2b[i]);
                this.C = p2bVarArr;
                if (z) {
                    jArr = null;
                } else {
                    jArr = new long[p2bVarArr.length][];
                    int[] iArr2 = new int[p2bVarArr.length];
                    long[] jArr3 = new long[p2bVarArr.length];
                    boolean[] zArr = new boolean[p2bVarArr.length];
                    for (int i30 = 0; i30 < p2bVarArr.length; i30++) {
                        jArr[i30] = new long[p2bVarArr[i30].b.b];
                        jArr3[i30] = p2bVarArr[i30].b.f[0];
                    }
                    int i31 = 0;
                    while (i31 < p2bVarArr.length) {
                        long j7 = Long.MAX_VALUE;
                        int i32 = i29;
                        for (int i33 = 0; i33 < p2bVarArr.length; i33++) {
                            if (!zArr[i33]) {
                                long j8 = jArr3[i33];
                                if (j8 <= j7) {
                                    i32 = i33;
                                    j7 = j8;
                                }
                            }
                        }
                        int i34 = iArr2[i32];
                        long[] jArr4 = jArr[i32];
                        jArr4[i34] = j3;
                        lyh lyhVar2 = p2bVarArr[i32].b;
                        boolean z8 = z7;
                        j3 += (long) lyhVar2.d[i34];
                        int i35 = i34 + 1;
                        iArr2[i32] = i35;
                        if (i35 < jArr4.length) {
                            jArr3[i32] = lyhVar2.f[i35];
                        } else {
                            zArr[i32] = z8;
                            i31++;
                        }
                        z7 = z8;
                        i29 = -1;
                    }
                }
                z2 = z7;
                this.D = jArr;
                this.B.D();
                this.B.r(new o2b(j4, this.C, size));
                arrayDeque.clear();
                this.z = z2;
                if (this.w) {
                }
            } else if (!arrayDeque2.isEmpty()) {
                ((m2b) arrayDeque2.peek()).e.add(m2bVar);
            }
        }
        if (this.l != 2) {
            this.l = 0;
            this.o = 0;
        }
    }

    @Override // defpackage.jj6
    public final boolean b(kj6 kj6Var) {
        ghe gheVarR;
        mcg mcgVarC = cpk.c(kj6Var, false, (this.b & 2) != 0);
        if (mcgVarC != null) {
            gheVarR = c98.r(mcgVarC);
        } else {
            a98 a98Var = c98.b;
            gheVarR = ghe.e;
        }
        this.k = gheVarR;
        return mcgVarC == null;
    }

    @Override // defpackage.jj6
    public final void g(long j, long j2) {
        this.h.clear();
        this.o = 0;
        this.q = -1;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = false;
        this.z = false;
        if (j == 0) {
            if (this.l != 3) {
                this.l = 0;
                this.o = 0;
                return;
            } else {
                dcf dcfVar = this.i;
                dcfVar.a.clear();
                dcfVar.b = 0;
                this.j.clear();
                return;
            }
        }
        for (p2b p2bVar : this.C) {
            lyh lyhVar = p2bVar.b;
            int iA = lyhVar.a(j2);
            if (iA == -1) {
                iA = lyhVar.b(j2);
            }
            p2bVar.e = iA;
            g5i g5iVar = p2bVar.d;
            if (g5iVar != null) {
                g5iVar.b = false;
                g5iVar.c = 0;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x008d  */
    /* JADX WARN: Code duplicated, block: B:277:0x0562  */
    /* JADX WARN: Code duplicated, block: B:278:0x056e  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.jj6
    public final int l(kj6 kj6Var, s8 s8Var) throws ParserException {
        char c;
        char c2;
        int i;
        int i2;
        int i3;
        int iH;
        int i4;
        nmc nmcVar;
        int i5;
        char c3;
        boolean z;
        boolean z2;
        m2b m2bVar;
        if (!this.c || !this.z) {
            while (true) {
                int i6 = this.l;
                ArrayDeque arrayDeque = this.h;
                int i7 = this.b;
                nmc nmcVar2 = this.f;
                int i8 = 4;
                int i9 = 0;
                char c4 = 2;
                if (i6 == 0) {
                    int i10 = this.o;
                    nmc nmcVar3 = this.g;
                    if (i10 == 0) {
                        if (kj6Var.t(nmcVar3.a, 0, 8, true)) {
                            this.o = 8;
                            nmcVar3.N(0);
                            this.n = nmcVar3.C();
                            this.m = nmcVar3.m();
                        } else if (this.E == 2 && (i7 & 2) != 0) {
                            kyh kyhVarG = this.B.G(0, 4);
                            n1b n1bVar = this.F;
                            lwa lwaVar = n1bVar == null ? null : new lwa(n1bVar);
                            a87 a87Var = new a87();
                            a87Var.k = lwaVar;
                            ewi.n(a87Var, kyhVarG);
                            this.B.D();
                            this.B.r(new vk0(-9223372036854775807L));
                            return -1;
                        }
                    }
                    long j = this.n;
                    if (j == 1) {
                        kj6Var.readFully(nmcVar3.a, 8, 8);
                        this.o += 8;
                        this.n = nmcVar3.G();
                    } else if (j == 0) {
                        long length = kj6Var.getLength();
                        if (length == -1 && (m2bVar = (m2b) arrayDeque.peek()) != null) {
                            length = m2bVar.c;
                        }
                        if (length != -1) {
                            this.n = (length - kj6Var.getPosition()) + ((long) this.o);
                        }
                    }
                    long j2 = this.n;
                    int i11 = this.o;
                    long j3 = i11;
                    if (j2 < j3) {
                        if (this.m != 1718773093 || i11 != 8) {
                            throw ParserException.c("Atom size less than header length (unsupported).");
                        }
                        this.n = j3;
                    }
                    int i12 = this.m;
                    if (i12 == 1836019574 || i12 == 1953653099 || i12 == 1835297121 || i12 == 1835626086 || i12 == 1937007212 || i12 == 1701082227 || i12 == 1835365473 || i12 == 1635284069) {
                        long position = kj6Var.getPosition();
                        long j4 = this.n;
                        long j5 = this.o;
                        long j6 = (position + j4) - j5;
                        if (j4 != j5 && this.m == 1835365473) {
                            nmcVar2.K(8);
                            kj6Var.u(0, nmcVar2.a, 8);
                            r21.a(nmcVar2);
                            kj6Var.E(nmcVar2.b);
                            kj6Var.q();
                        }
                        arrayDeque.push(new m2b(this.m, j6));
                        if (this.n == this.o) {
                            a(j6);
                        } else {
                            this.l = 0;
                            this.o = 0;
                        }
                    } else if (i12 == 1835296868 || i12 == 1836476516 || i12 == 1751411826 || i12 == 1937011556 || i12 == 1937011827 || i12 == 1937011571 || i12 == 1668576371 || i12 == 1701606260 || i12 == 1937011555 || i12 == 1937011578 || i12 == 1937013298 || i12 == 1937007471 || i12 == 1668232756 || i12 == 1953196132 || i12 == 1718909296 || i12 == 1969517665 || i12 == 1801812339 || i12 == 1768715124) {
                        lvb.b0(i11 == 8);
                        lvb.b0(this.n <= 2147483647L);
                        nmc nmcVar4 = new nmc((int) this.n);
                        System.arraycopy(nmcVar3.a, 0, nmcVar4.a, 0, 8);
                        this.p = nmcVar4;
                        this.l = 1;
                    } else {
                        long position2 = kj6Var.getPosition();
                        long j7 = this.o;
                        long j8 = position2 - j7;
                        if (this.m == 1836086884) {
                            this.F = new n1b(0L, j8, -9223372036854775807L, j8 + j7, this.n - j7);
                        }
                        this.p = null;
                        this.l = 1;
                    }
                } else {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            if (i6 != 3) {
                                c.t();
                                return 0;
                            }
                            dcf dcfVar = this.i;
                            ArrayList arrayList = dcfVar.a;
                            int i13 = dcfVar.b;
                            if (i13 != 0) {
                                if (i13 != 1) {
                                    short s = 2817;
                                    short s2 = 2816;
                                    short s3 = 2192;
                                    if (i13 == 2) {
                                        long length2 = kj6Var.getLength();
                                        int i14 = dcfVar.c - 20;
                                        nmc nmcVar5 = new nmc(i14);
                                        kj6Var.readFully(nmcVar5.a, 0, i14);
                                        int i15 = 0;
                                        while (i15 < i14 / 12) {
                                            nmcVar5.O(2);
                                            short sQ = nmcVar5.q();
                                            if (sQ != s3 && sQ != s2 && sQ != s && sQ != 2819) {
                                                if (sQ != 2820) {
                                                    nmcVar5.O(8);
                                                    nmcVar = nmcVar5;
                                                }
                                                i15++;
                                                nmcVar5 = nmcVar;
                                                s = 2817;
                                                s3 = 2192;
                                                s2 = 2816;
                                            }
                                            nmcVar = nmcVar5;
                                            arrayList.add(new ccf((length2 - ((long) dcfVar.c)) - ((long) nmcVar5.o()), nmcVar.o()));
                                            i15++;
                                            nmcVar5 = nmcVar;
                                            s = 2817;
                                            s3 = 2192;
                                            s2 = 2816;
                                        }
                                        if (arrayList.isEmpty()) {
                                            s8Var.a = 0L;
                                        } else {
                                            dcfVar.b = 3;
                                            s8Var.a = ((ccf) arrayList.get(0)).a;
                                        }
                                    } else {
                                        if (i13 != 3) {
                                            c.t();
                                            return 0;
                                        }
                                        long position3 = kj6Var.getPosition();
                                        int length3 = (int) ((kj6Var.getLength() - kj6Var.getPosition()) - ((long) dcfVar.c));
                                        nmc nmcVar6 = new nmc(length3);
                                        kj6Var.readFully(nmcVar6.a, 0, length3);
                                        int i16 = 0;
                                        while (i16 < arrayList.size()) {
                                            ccf ccfVar = (ccf) arrayList.get(i16);
                                            int i17 = i9;
                                            nmcVar6.N((int) (ccfVar.a - position3));
                                            nmcVar6.O(i8);
                                            int iO = nmcVar6.o();
                                            Charset charset = StandardCharsets.UTF_8;
                                            int i18 = i17;
                                            String strY = nmcVar6.y(iO, charset);
                                            switch (strY.hashCode()) {
                                                case -1711564334:
                                                    if (!strY.equals("SlowMotion_Data")) {
                                                        i5 = -1;
                                                    } else {
                                                        i5 = i18;
                                                    }
                                                    break;
                                                case -1332107749:
                                                    if (!strY.equals("Super_SlowMotion_Edit_Data")) {
                                                        i5 = -1;
                                                    } else {
                                                        i5 = 1;
                                                    }
                                                    break;
                                                case -1251387154:
                                                    if (!strY.equals("Super_SlowMotion_Data")) {
                                                        i5 = -1;
                                                    } else {
                                                        i5 = 2;
                                                    }
                                                    break;
                                                case -830665521:
                                                    if (!strY.equals("Super_SlowMotion_Deflickering_On")) {
                                                        i5 = -1;
                                                    } else {
                                                        i5 = 3;
                                                    }
                                                    break;
                                                case 1760745220:
                                                    if (!strY.equals("Super_SlowMotion_BGM")) {
                                                        i5 = -1;
                                                    } else {
                                                        i5 = 4;
                                                    }
                                                    break;
                                                default:
                                                    i5 = -1;
                                                    break;
                                            }
                                            switch (i5) {
                                                case 0:
                                                    c3 = 2192;
                                                    break;
                                                case 1:
                                                    c3 = 2819;
                                                    break;
                                                case 2:
                                                    c3 = 2816;
                                                    break;
                                                case 3:
                                                    c3 = 2820;
                                                    break;
                                                case 4:
                                                    c3 = 2817;
                                                    break;
                                                default:
                                                    throw ParserException.a(null, "Invalid SEF name");
                                            }
                                            int i19 = ccfVar.b - (iO + 8);
                                            if (c3 == 2192) {
                                                ArrayList arrayList2 = new ArrayList();
                                                List listT = dcf.e.T(nmcVar6.y(i19, charset));
                                                int i20 = i18;
                                                while (i20 < listT.size()) {
                                                    List listT2 = dcf.d.T((CharSequence) listT.get(i20));
                                                    if (listT2.size() != 3) {
                                                        throw ParserException.a(null, null);
                                                    }
                                                    try {
                                                        arrayList2.add(new bbg(1 << (Integer.parseInt((String) listT2.get(2)) - 1), Long.parseLong((String) listT2.get(i18)), Long.parseLong((String) listT2.get(1))));
                                                        i20++;
                                                        i18 = 0;
                                                    } catch (NumberFormatException e) {
                                                        throw ParserException.a(e, null);
                                                    }
                                                }
                                                this.j.add(new cbg(arrayList2));
                                            } else if (c3 != 2816 && c3 != 2817 && c3 != 2819 && c3 != 2820) {
                                                c.t();
                                                return i18;
                                            }
                                            i16++;
                                            i9 = 0;
                                            i8 = 4;
                                        }
                                        s8Var.a = 0L;
                                    }
                                } else {
                                    nmc nmcVar7 = new nmc(8);
                                    kj6Var.readFully(nmcVar7.a, 0, 8);
                                    dcfVar.c = nmcVar7.o() + 8;
                                    if (nmcVar7.m() != 1397048916) {
                                        s8Var.a = 0L;
                                    } else {
                                        s8Var.a = kj6Var.getPosition() - ((long) (dcfVar.c - 12));
                                        dcfVar.b = 2;
                                    }
                                }
                                i4 = 1;
                            } else {
                                long length4 = kj6Var.getLength();
                                s8Var.a = (length4 == -1 || length4 < 8) ? 0L : length4 - 8;
                                i4 = 1;
                                dcfVar.b = 1;
                            }
                            if (s8Var.a != 0) {
                                return i4;
                            }
                            this.l = 0;
                            this.o = 0;
                            return i4;
                        }
                        long position4 = kj6Var.getPosition();
                        if (this.q == -1) {
                            boolean z3 = true;
                            int i21 = 0;
                            int i22 = -1;
                            int i23 = -1;
                            boolean z4 = true;
                            long j9 = BuildConfig.MAX_TIME_TO_UPLOAD;
                            long j10 = BuildConfig.MAX_TIME_TO_UPLOAD;
                            long j11 = BuildConfig.MAX_TIME_TO_UPLOAD;
                            while (true) {
                                p2b[] p2bVarArr = this.C;
                                if (i21 >= p2bVarArr.length) {
                                    break;
                                }
                                p2b p2bVar = p2bVarArr[i21];
                                int i24 = p2bVar.e;
                                lyh lyhVar = p2bVar.b;
                                char c5 = c4;
                                if (i24 != lyhVar.b) {
                                    long j12 = lyhVar.c[i24];
                                    long[][] jArr = this.D;
                                    jArr.getClass();
                                    long j13 = jArr[i21][i24];
                                    long j14 = j12 - position4;
                                    boolean z5 = j14 < 0 || j14 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                                    if ((!z5 && z3) || (z5 == z3 && j14 < j11)) {
                                        z3 = z5;
                                        i23 = i21;
                                        j11 = j14;
                                        j10 = j13;
                                    }
                                    if (j13 < j9) {
                                        z4 = z5;
                                        i22 = i21;
                                        j9 = j13;
                                    }
                                }
                                i21++;
                                c4 = c5;
                            }
                            c = c4;
                            if (j9 == BuildConfig.MAX_TIME_TO_UPLOAD || !z4 || j10 < j9 + 10485760) {
                                i22 = i23;
                            }
                            this.q = i22;
                            if (i22 == -1) {
                                return -1;
                            }
                        } else {
                            c = 2;
                        }
                        p2b p2bVar2 = this.C[this.q];
                        kyh kyhVar = p2bVar2.c;
                        lyh lyhVar2 = p2bVar2.b;
                        cyh cyhVar = p2bVar2.a;
                        int i25 = p2bVar2.e;
                        long[] jArr2 = lyhVar2.c;
                        int[] iArr = lyhVar2.d;
                        long j15 = jArr2[i25] + this.A;
                        int i26 = iArr[i25];
                        g5i g5iVar = p2bVar2.d;
                        long j16 = (j15 - position4) + ((long) this.r);
                        if (j16 < 0 || j16 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                            s8Var.a = j15;
                            return 1;
                        }
                        int i27 = cyhVar.h;
                        int i28 = cyhVar.k;
                        b87 b87Var = cyhVar.g;
                        if (i27 == 1) {
                            j16 += 8;
                            i26 -= 8;
                        }
                        int i29 = i26;
                        kj6Var.E((int) j16);
                        String str = b87Var.n;
                        String str2 = b87Var.n;
                        if (!Objects.equals(str, "video/avc") ? !Objects.equals(str2, "video/hevc") || (i7 & np0.m) == 0 : (i7 & 32) == 0) {
                            c2 = 1;
                            this.u = true;
                        } else {
                            c2 = 1;
                        }
                        if (i28 != 0) {
                            nmc nmcVar8 = this.e;
                            byte[] bArr = nmcVar8.a;
                            bArr[0] = 0;
                            bArr[c2] = 0;
                            bArr[c] = 0;
                            int i30 = 4 - i28;
                            int i31 = i29 + i30;
                            while (this.s < i31) {
                                int i32 = this.t;
                                if (i32 == 0) {
                                    if (this.u || xsg.h(b87Var) + i28 > iArr[i25] - this.r) {
                                        i3 = i28;
                                        iH = 0;
                                    } else {
                                        iH = xsg.h(b87Var);
                                        i3 = i28 + iH;
                                    }
                                    kj6Var.readFully(bArr, i30, i3);
                                    i2 = i31;
                                    this.r += i3;
                                    nmcVar8.N(0);
                                    int iM = nmcVar8.m();
                                    if (iM < 0) {
                                        throw ParserException.a(null, "Invalid NAL length");
                                    }
                                    this.t = iM - iH;
                                    nmc nmcVar9 = this.d;
                                    nmcVar9.N(0);
                                    int i33 = iH;
                                    kyhVar.f(4, nmcVar9);
                                    this.s += 4;
                                    if (i33 > 0) {
                                        kyhVar.f(i33, nmcVar8);
                                        this.s += i33;
                                        if (xsg.e(bArr, i33, b87Var)) {
                                            this.u = true;
                                        }
                                    }
                                } else {
                                    i2 = i31;
                                    int iC = kyhVar.c(kj6Var, i32, false);
                                    this.r += iC;
                                    this.s += iC;
                                    this.t -= iC;
                                }
                                i31 = i2;
                            }
                            i = i31;
                        } else {
                            if ("audio/ac4".equals(str2)) {
                                if (this.s == 0) {
                                    h21.b(i29, nmcVar2);
                                    kyhVar.f(7, nmcVar2);
                                    this.s += 7;
                                }
                                i29 += 7;
                            } else if (p2bVar2.f != null && Objects.equals(str2, "audio/mpeg")) {
                                b87 b87Var2 = p2bVar2.f;
                                nmcVar2.K(4);
                                kj6Var.u(0, nmcVar2.a, 4);
                                kj6Var.q();
                                a3b a3bVar = new a3b();
                                kyh kyhVar2 = p2bVar2.c;
                                if (a3bVar.a(nmcVar2.m()) && !Objects.equals(b87Var2.n, (String) a3bVar.g)) {
                                    a87 a87VarA = b87Var2.a();
                                    String str3 = (String) a3bVar.g;
                                    str3.getClass();
                                    a87VarA.m = uya.n(str3);
                                    b87Var2 = new b87(a87VarA);
                                }
                                kyhVar2.g(b87Var2);
                                p2bVar2.f = null;
                            } else if (g5iVar != null) {
                                g5iVar.c(kj6Var);
                            }
                            while (true) {
                                int i34 = this.s;
                                if (i34 >= i29) {
                                    break;
                                }
                                int iC2 = kyhVar.c(kj6Var, i29 - i34, false);
                                this.r += iC2;
                                this.s += iC2;
                                this.t -= iC2;
                            }
                            i = i29;
                        }
                        long j17 = lyhVar2.f[i25];
                        int i35 = lyhVar2.g[i25];
                        if (!this.u) {
                            i35 |= 67108864;
                        }
                        int i36 = i35;
                        if (g5iVar != null) {
                            g5iVar.b(kyhVar, j17, i36, i, 0, null);
                            if (i25 + 1 == lyhVar2.b) {
                                g5iVar.a(kyhVar, null);
                            }
                        } else {
                            kyhVar.a(j17, i36, i, 0, null);
                        }
                        p2bVar2.e++;
                        this.q = -1;
                        this.r = 0;
                        this.s = 0;
                        this.t = 0;
                        this.u = false;
                        return 0;
                    }
                    long j18 = this.n - ((long) this.o);
                    long position5 = kj6Var.getPosition() + j18;
                    nmc nmcVar10 = this.p;
                    if (nmcVar10 != null) {
                        kj6Var.readFully(nmcVar10.a, this.o, (int) j18);
                        if (this.m == 1718909296) {
                            this.v = true;
                            nmcVar10.N(8);
                            int iM2 = nmcVar10.m();
                            int i37 = iM2 != 1751476579 ? iM2 != 1903435808 ? 0 : 1 : 2;
                            if (i37 == 0) {
                                nmcVar10.O(4);
                                do {
                                    if (nmcVar10.a() <= 0) {
                                        i37 = 0;
                                        break;
                                    }
                                    int iM3 = nmcVar10.m();
                                    i37 = iM3 != 1751476579 ? iM3 != 1903435808 ? 0 : 1 : 2;
                                } while (i37 == 0);
                            }
                            this.E = i37;
                        } else if (!arrayDeque.isEmpty()) {
                            ((m2b) arrayDeque.peek()).d.add(new n2b(this.m, nmcVar10));
                        }
                    } else {
                        if (!this.v && this.m == 1835295092) {
                            this.E = 1;
                        }
                        if (j18 < PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                            kj6Var.E((int) j18);
                        } else {
                            s8Var.a = kj6Var.getPosition() + j18;
                            z = true;
                        }
                        a(position5);
                        if (this.w) {
                            this.y = true;
                            s8Var.a = this.x;
                            this.w = false;
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (z2 && this.l != 2) {
                            return 1;
                        }
                    }
                    z = false;
                    a(position5);
                    if (this.w) {
                        this.y = true;
                        s8Var.a = this.x;
                        this.w = false;
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                    if (z2) {
                        continue;
                    }
                }
            }
        }
        return -1;
    }

    @Override // defpackage.jj6
    public final void release() {
    }

    @Override // defpackage.jj6
    public final List y() {
        return this.k;
    }
}
