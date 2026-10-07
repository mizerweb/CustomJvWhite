package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.ParserException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes2.dex */
public final class to9 implements jj6 {
    public static final byte[] J1 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] K1;
    public static final byte[] L1;
    public static final byte[] M1;
    public static final UUID N1;
    public static final Map O1;
    public int A;
    public int A1;
    public long B;
    public int B1;
    public final SparseArray C;
    public boolean C1;
    public boolean D;
    public boolean D1;
    public long E;
    public boolean E1;
    public int F;
    public int F1;
    public long G;
    public byte G1;
    public long H;
    public boolean H1;
    public int I;
    public lj6 I1;
    public boolean J;
    public long K;
    public long X;
    public long Y;
    public boolean Z;
    public final ga5 a;
    public final jrc b;
    public final SparseArray c;
    public final boolean d;
    public final boolean e;
    public final b8h f;
    public final nmc g;
    public final nmc h;
    public final nmc i;
    public final nmc j;
    public final nmc k;
    public final nmc l;
    public final nmc m;
    public final nmc n;
    public int n1;
    public final nmc o;
    public long o1;
    public final nmc p;
    public long p1;
    public ByteBuffer q;
    public int q1;
    public long r;
    public int r1;
    public long s;
    public int[] s1;
    public long t;
    public int t1;
    public long u;
    public int u1;
    public long v;
    public int v1;
    public boolean w;
    public int w1;
    public boolean x;
    public boolean x1;
    public so9 y;
    public long y1;
    public boolean z;
    public int z1;

    static {
        String str = vqi.a;
        K1 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        L1 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        M1 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        N1 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        tt2.e(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        tt2.e(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        O1 = Collections.unmodifiableMap(map);
    }

    public to9(b8h b8hVar, int i) {
        ga5 ga5Var = new ga5();
        this.s = -1L;
        this.t = -9223372036854775807L;
        this.u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.E = -9223372036854775807L;
        this.F = -1;
        this.G = -1L;
        this.H = -1L;
        this.I = -1;
        this.K = -1L;
        this.X = -1L;
        this.Y = -9223372036854775807L;
        this.a = ga5Var;
        ga5Var.d = new xva(18, this);
        this.f = b8hVar;
        this.C = new SparseArray();
        this.d = (i & 1) == 0;
        this.e = (i & 2) == 0;
        this.b = new jrc(1, (byte) 0);
        this.c = new SparseArray();
        this.i = new nmc(4);
        this.j = new nmc(ByteBuffer.allocate(4).putInt(-1).array());
        this.k = new nmc(4);
        this.g = new nmc(xsg.a);
        this.h = new nmc(4);
        this.l = new nmc();
        this.m = new nmc();
        this.n = new nmc(8);
        this.o = new nmc();
        this.p = new nmc();
        this.s1 = new int[1];
        this.x = true;
    }

    public static byte[] e(long j, long j2, String str) {
        lvb.R(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (((long) i) * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (((long) i2) * 60000000);
        int i3 = (int) (j4 / 1000000);
        String str2 = String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2)));
        String str3 = vqi.a;
        return str2.getBytes(StandardCharsets.UTF_8);
    }

    @Override // defpackage.jj6
    public final void A(lj6 lj6Var) {
        if (this.e) {
            lj6Var = new ae7(lj6Var, this.f);
        }
        this.I1 = lj6Var;
    }

    public final void a(int i) {
        if (this.D) {
            return;
        }
        throw ParserException.a(null, "Element " + i + " must be in a Cues");
    }

    @Override // defpackage.jj6
    public final boolean b(kj6 kj6Var) {
        mf mfVar = new mf(10);
        nmc nmcVar = (nmc) mfVar.c;
        long length = kj6Var.getLength();
        long j = PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        if (length != -1 && length <= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            j = length;
        }
        int i = (int) j;
        kj6Var.u(0, nmcVar.a, 4);
        mfVar.b = 4;
        for (long jC = nmcVar.C(); jC != 440786851; jC = ((jC << 8) & (-256)) | ((long) (nmcVar.a[0] & 255))) {
            int i2 = mfVar.b + 1;
            mfVar.b = i2;
            if (i2 == i) {
                return false;
            }
            kj6Var.u(0, nmcVar.a, 1);
        }
        long jT = mfVar.t(kj6Var);
        long j2 = mfVar.b;
        if (jT != Long.MIN_VALUE && (length == -1 || j2 + jT < length)) {
            while (true) {
                long j3 = mfVar.b;
                long j4 = j2 + jT;
                if (j3 < j4) {
                    if (mfVar.t(kj6Var) == Long.MIN_VALUE) {
                        break;
                    }
                    long jT2 = mfVar.t(kj6Var);
                    if (jT2 < 0 || jT2 > 2147483647L) {
                        break;
                    }
                    if (jT2 != 0) {
                        int i3 = (int) jT2;
                        kj6Var.z(i3);
                        mfVar.b += i3;
                    }
                } else if (j3 == j4) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void c(int i) {
        if (this.y != null) {
            return;
        }
        throw ParserException.a(null, "Element " + i + " must be in a TrackEntry");
    }

    public final void d(so9 so9Var, long j, int i, int i2, int i3) {
        byte[] bArrE;
        int i4;
        int i5;
        g5i g5iVar = so9Var.V;
        if (g5iVar != null) {
            g5iVar.b(so9Var.a0, j, i, i2, i3, so9Var.k);
        } else {
            if ("S_TEXT/UTF8".equals(so9Var.c) || "S_TEXT/ASS".equals(so9Var.c) || "S_TEXT/SSA".equals(so9Var.c) || "S_TEXT/WEBVTT".equals(so9Var.c)) {
                if (this.r1 > 1) {
                    lvb.G0("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j2 = this.p1;
                    if (j2 == -9223372036854775807L) {
                        lvb.G0("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        String str = so9Var.c;
                        nmc nmcVar = this.m;
                        byte[] bArr = nmcVar.a;
                        str.getClass();
                        switch (str) {
                            case "S_TEXT/ASS":
                            case "S_TEXT/SSA":
                                bArrE = e(j2, 10000L, "%01d:%02d:%02d:%02d");
                                i4 = 21;
                                break;
                            case "S_TEXT/WEBVTT":
                                bArrE = e(j2, 1000L, "%02d:%02d:%02d.%03d");
                                i4 = 25;
                                break;
                            case "S_TEXT/UTF8":
                                bArrE = e(j2, 1000L, "%02d:%02d:%02d,%03d");
                                i4 = 19;
                                break;
                            default:
                                ore.a();
                                return;
                        }
                        System.arraycopy(bArrE, 0, bArr, i4, bArrE.length);
                        for (int i6 = nmcVar.b; i6 < nmcVar.c; i6++) {
                            if (nmcVar.a[i6] == 0) {
                                nmcVar.M(i6);
                                so9Var.a0.f(nmcVar.c, nmcVar);
                                i5 = i2 + nmcVar.c;
                            }
                        }
                        so9Var.a0.f(nmcVar.c, nmcVar);
                        i5 = i2 + nmcVar.c;
                    }
                }
                i5 = i2;
            } else {
                i5 = i2;
            }
            if ((i & 268435456) != 0) {
                int i7 = this.r1;
                nmc nmcVar2 = this.p;
                if (i7 > 1) {
                    nmcVar2.K(0);
                } else {
                    int i8 = nmcVar2.c;
                    so9Var.a0.b(nmcVar2, i8, 2);
                    i5 += i8;
                }
            }
            so9Var.a0.a(j, i, i5, i3, so9Var.k);
        }
        this.Z = true;
    }

    public final void f() {
        if (!this.x) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i >= sparseArray.size()) {
                lj6 lj6Var = this.I1;
                lj6Var.getClass();
                lj6Var.D();
                this.x = false;
                return;
            }
            if (((so9) sparseArray.valueAt(i)).W) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.jj6
    public final void g(long j, long j2) {
        this.Y = -9223372036854775807L;
        this.n1 = 0;
        ga5 ga5Var = this.a;
        ga5Var.e = 0;
        ga5Var.b.clear();
        jrc jrcVar = ga5Var.c;
        jrcVar.b = 0;
        jrcVar.c = 0;
        jrc jrcVar2 = this.b;
        jrcVar2.b = 0;
        jrcVar2.c = 0;
        i();
        this.D = false;
        this.E = -9223372036854775807L;
        this.F = -1;
        this.G = -1L;
        this.H = -1L;
        if (!this.z) {
            this.C.clear();
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i >= sparseArray.size()) {
                return;
            }
            g5i g5iVar = ((so9) sparseArray.valueAt(i)).V;
            if (g5iVar != null) {
                g5iVar.b = false;
                g5iVar.c = 0;
            }
            i++;
        }
    }

    public final void h(kj6 kj6Var, int i) {
        nmc nmcVar = this.i;
        if (nmcVar.c >= i) {
            return;
        }
        byte[] bArr = nmcVar.a;
        if (bArr.length < i) {
            nmcVar.c(Math.max(bArr.length * 2, i));
        }
        byte[] bArr2 = nmcVar.a;
        int i2 = nmcVar.c;
        kj6Var.readFully(bArr2, i2, i - i2);
        nmcVar.M(i);
    }

    public final void i() {
        this.z1 = 0;
        this.A1 = 0;
        this.B1 = 0;
        this.C1 = false;
        this.D1 = false;
        this.E1 = false;
        this.F1 = 0;
        this.G1 = (byte) 0;
        this.H1 = false;
        this.l.K(0);
    }

    public final long j(long j) throws ParserException {
        long j2 = this.t;
        if (j2 == -9223372036854775807L) {
            throw ParserException.a(null, "Can't scale timecode prior to timecodeScale being set.");
        }
        String str = vqi.a;
        return vqi.i0(j, j2, 1000L, RoundingMode.DOWN);
    }

    /* JADX WARN: Code duplicated, block: B:80:0x01df  */
    public final int k(kj6 kj6Var, so9 so9Var, int i, boolean z) {
        int iC;
        int iC2;
        int i2;
        boolean z2;
        int i3;
        if ("S_TEXT/UTF8".equals(so9Var.c)) {
            m(kj6Var, J1, i);
            int i4 = this.A1;
            i();
            return i4;
        }
        if ("S_TEXT/ASS".equals(so9Var.c) || "S_TEXT/SSA".equals(so9Var.c)) {
            m(kj6Var, L1, i);
            int i5 = this.A1;
            i();
            return i5;
        }
        if ("S_TEXT/WEBVTT".equals(so9Var.c)) {
            m(kj6Var, M1, i);
            int i6 = this.A1;
            i();
            return i6;
        }
        int i7 = 2;
        if (so9Var.W) {
            so9Var.b0.getClass();
            nmc nmcVar = new nmc(i);
            if (kj6Var.m(nmcVar.a, 0, i, true)) {
                kj6Var.q();
                if (a05.c(nmcVar.i()) == 1 && nmcVar.a() >= 10) {
                    byte[] bArr = new byte[10];
                    nmcVar.k(0, bArr, 10);
                    nmcVar.N(0);
                    int iB = a05.b(bArr);
                    if (iB > 0 && nmcVar.a() >= iB + 4) {
                        nmcVar.O(iB);
                        if (a05.c(nmcVar.m()) == 2) {
                            a87 a87VarA = so9Var.b0.a();
                            a87VarA.m = uya.n("audio/vnd.dts.hd");
                            so9Var.b0 = new b87(a87VarA);
                        }
                    }
                }
            }
            so9Var.a0.g(so9Var.b0);
            so9Var.W = false;
            f();
        }
        kyh kyhVar = so9Var.a0;
        boolean z3 = this.C1;
        nmc nmcVar2 = this.l;
        if (!z3) {
            boolean z4 = so9Var.i;
            nmc nmcVar3 = this.i;
            if (z4) {
                this.v1 &= -1073741825;
                boolean z5 = this.D1;
                int i8 = np0.m;
                if (!z5) {
                    kj6Var.readFully(nmcVar3.a, 0, 1);
                    this.z1++;
                    byte b = nmcVar3.a[0];
                    if ((b & 128) == 128) {
                        throw ParserException.a(null, "Extension bit is set in signal byte");
                    }
                    this.G1 = b;
                    this.D1 = true;
                }
                byte b2 = this.G1;
                if ((b2 & 1) != 1) {
                    i2 = 2;
                } else {
                    boolean z6 = (b2 & 2) == 2;
                    this.v1 |= 1073741824;
                    if (!this.H1) {
                        nmc nmcVar4 = this.n;
                        kj6Var.readFully(nmcVar4.a, 0, 8);
                        this.z1 += 8;
                        this.H1 = true;
                        byte[] bArr2 = nmcVar3.a;
                        if (!z6) {
                            i8 = 0;
                        }
                        bArr2[0] = (byte) (i8 | 8);
                        nmcVar3.N(0);
                        kyhVar.b(nmcVar3, 1, 1);
                        this.A1++;
                        nmcVar4.N(0);
                        kyhVar.b(nmcVar4, 8, 1);
                        this.A1 += 8;
                    }
                    if (z6) {
                        if (!this.E1) {
                            kj6Var.readFully(nmcVar3.a, 0, 1);
                            this.z1++;
                            nmcVar3.N(0);
                            this.F1 = nmcVar3.A();
                            this.E1 = true;
                        }
                        int i9 = this.F1 * 4;
                        nmcVar3.K(i9);
                        kj6Var.readFully(nmcVar3.a, 0, i9);
                        this.z1 += i9;
                        short s = (short) ((this.F1 / 2) + 1);
                        int i10 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.q;
                        if (byteBuffer == null || byteBuffer.capacity() < i10) {
                            this.q = ByteBuffer.allocate(i10);
                        }
                        this.q.position(0);
                        this.q.putShort(s);
                        int i11 = 0;
                        int i12 = 0;
                        while (true) {
                            i3 = this.F1;
                            if (i11 >= i3) {
                                break;
                            }
                            int iE = nmcVar3.E();
                            int i13 = i11 % 2;
                            int i14 = i7;
                            ByteBuffer byteBuffer2 = this.q;
                            if (i13 == 0) {
                                byteBuffer2.putShort((short) (iE - i12));
                            } else {
                                byteBuffer2.putInt(iE - i12);
                            }
                            i11++;
                            i12 = iE;
                            i7 = i14;
                        }
                        i2 = i7;
                        int i15 = (i - this.z1) - i12;
                        int i16 = i3 % 2;
                        ByteBuffer byteBuffer3 = this.q;
                        if (i16 == 1) {
                            byteBuffer3.putInt(i15);
                        } else {
                            byteBuffer3.putShort((short) i15);
                            this.q.putInt(0);
                        }
                        byte[] bArrArray = this.q.array();
                        nmc nmcVar5 = this.o;
                        nmcVar5.L(i10, bArrArray);
                        kyhVar.b(nmcVar5, i10, 1);
                        this.A1 += i10;
                    } else {
                        i2 = 2;
                    }
                }
            } else {
                i2 = 2;
                byte[] bArr3 = so9Var.j;
                if (bArr3 != null) {
                    nmcVar2.L(bArr3.length, bArr3);
                }
            }
            if ("A_OPUS".equals(so9Var.c)) {
                z2 = z;
            } else {
                z2 = so9Var.g > 0;
            }
            if (z2) {
                this.v1 |= 268435456;
                this.p.K(0);
                int i17 = (nmcVar2.c + i) - this.z1;
                nmcVar3.K(4);
                byte[] bArr4 = nmcVar3.a;
                bArr4[0] = (byte) ((i17 >> 24) & 255);
                bArr4[1] = (byte) ((i17 >> 16) & 255);
                bArr4[i2] = (byte) ((i17 >> 8) & 255);
                bArr4[3] = (byte) (i17 & 255);
                kyhVar.b(nmcVar3, 4, i2);
                this.A1 += 4;
            }
            this.C1 = true;
        }
        int i18 = i + nmcVar2.c;
        if (!"V_MPEG4/ISO/AVC".equals(so9Var.c) && !"V_MPEGH/ISO/HEVC".equals(so9Var.c)) {
            if (so9Var.V != null) {
                lvb.b0(nmcVar2.c == 0);
                so9Var.V.c(kj6Var);
            }
            while (true) {
                int i19 = this.z1;
                if (i19 >= i18) {
                    break;
                }
                int i20 = i18 - i19;
                int iA = nmcVar2.a();
                if (iA > 0) {
                    iC2 = Math.min(i20, iA);
                    kyhVar.f(iC2, nmcVar2);
                } else {
                    iC2 = kyhVar.c(kj6Var, i20, false);
                }
                this.z1 += iC2;
                this.A1 += iC2;
            }
        } else {
            nmc nmcVar6 = this.h;
            byte[] bArr5 = nmcVar6.a;
            bArr5[0] = 0;
            bArr5[1] = 0;
            bArr5[2] = 0;
            int i21 = so9Var.c0;
            int i22 = 4 - i21;
            while (this.z1 < i18) {
                int i23 = this.B1;
                if (i23 == 0) {
                    int iMin = Math.min(i21, nmcVar2.a());
                    kj6Var.readFully(bArr5, i22 + iMin, i21 - iMin);
                    if (iMin > 0) {
                        nmcVar2.k(i22, bArr5, iMin);
                    }
                    this.z1 += i21;
                    nmcVar6.N(0);
                    this.B1 = nmcVar6.E();
                    nmc nmcVar7 = this.g;
                    nmcVar7.N(0);
                    kyhVar.f(4, nmcVar7);
                    this.A1 += 4;
                } else {
                    int iA2 = nmcVar2.a();
                    if (iA2 > 0) {
                        iC = Math.min(i23, iA2);
                        kyhVar.f(iC, nmcVar2);
                    } else {
                        iC = kyhVar.c(kj6Var, i23, false);
                    }
                    this.z1 += iC;
                    this.A1 += iC;
                    this.B1 -= iC;
                }
            }
        }
        if ("A_VORBIS".equals(so9Var.c)) {
            nmc nmcVar8 = this.j;
            nmcVar8.N(0);
            kyhVar.f(4, nmcVar8);
            this.A1 += 4;
        }
        int i24 = this.A1;
        i();
        return i24;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:184:0x035e  */
    /* JADX WARN: Code duplicated, block: B:325:0x0523  */
    /* JADX WARN: Code duplicated, block: B:487:0x07af A[PHI: r0
  0x07af: PHI (r0v123 int) = (r0v67 int), (r0v119 int), (r0v120 int), (r0v121 int), (r0v125 int) binds: [B:610:0x0a1c, B:499:0x07ce, B:496:0x07c7, B:493:0x07c0, B:484:0x0794] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:622:0x0a57  */
    /* JADX WARN: Code duplicated, block: B:627:0x0a70  */
    /* JADX WARN: Code duplicated, block: B:628:0x0a73  */
    /* JADX WARN: Code duplicated, block: B:631:0x0a86  */
    /* JADX WARN: Code duplicated, block: B:632:0x0a92  */
    /* JADX WARN: Code duplicated, block: B:634:0x0a98  */
    /* JADX WARN: Code duplicated, block: B:636:0x0a9c  */
    /* JADX WARN: Code duplicated, block: B:638:0x0aa1  */
    /* JADX WARN: Code duplicated, block: B:641:0x0aa9  */
    /* JADX WARN: Code duplicated, block: B:643:0x0aae  */
    /* JADX WARN: Code duplicated, block: B:646:0x0ab5  */
    /* JADX WARN: Code duplicated, block: B:649:0x0ac3  */
    /* JADX WARN: Code duplicated, block: B:652:0x0ac8  */
    /* JADX WARN: Code duplicated, block: B:654:0x0ace  */
    /* JADX WARN: Code duplicated, block: B:674:0x0b84  */
    /* JADX WARN: Code duplicated, block: B:676:0x0ba0  */
    /* JADX WARN: Code duplicated, block: B:679:0x0ba5  */
    /* JADX WARN: Code duplicated, block: B:682:0x0bb8  */
    /* JADX WARN: Code duplicated, block: B:685:0x0bbd  */
    /* JADX WARN: Code duplicated, block: B:691:0x0bd6  */
    /* JADX WARN: Code duplicated, block: B:692:0x0bd8  */
    /* JADX WARN: Code duplicated, block: B:694:0x0be2  */
    /* JADX WARN: Code duplicated, block: B:695:0x0be5  */
    /* JADX WARN: Code duplicated, block: B:697:0x0bef  */
    /* JADX WARN: Code duplicated, block: B:703:0x0c07  */
    /* JADX WARN: Code duplicated, block: B:705:0x0c20  */
    /* JADX WARN: Code duplicated, block: B:707:0x0c26  */
    /* JADX WARN: Code duplicated, block: B:722:0x0c51  */
    /* JADX WARN: Code duplicated, block: B:727:0x0c65  */
    /* JADX WARN: Code duplicated, block: B:728:0x0c68  */
    /* JADX WARN: Code duplicated, block: B:76:0x0191  */
    /* JADX WARN: Code duplicated, block: B:79:0x019d  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [xva] */
    /* JADX WARN: Type inference failed for: r1v107 */
    /* JADX WARN: Type inference failed for: r1v108 */
    /* JADX WARN: Type inference failed for: r1v109 */
    /* JADX WARN: Type inference failed for: r1v110 */
    /* JADX WARN: Type inference failed for: r1v111 */
    /* JADX WARN: Type inference failed for: r1v112 */
    /* JADX WARN: Type inference failed for: r1v113 */
    /* JADX WARN: Type inference failed for: r1v16, types: [kj6] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v4, types: [kj6] */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r35v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v112 */
    /* JADX WARN: Type inference failed for: r4v118 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26, types: [int] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v1, types: [ga5] */
    /* JADX WARN: Type inference failed for: r8v0, types: [jrc] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.jj6
    public final int l(kj6 kj6Var, s8 s8Var) throws ParserException {
        boolean z;
        int i;
        int i2;
        int i3;
        String str;
        ?? r4;
        int i4;
        int iM;
        ?? r1;
        boolean z2;
        ?? r2;
        int i5;
        byte b;
        List listSingletonList;
        int iH;
        ?? r3;
        int i6;
        ArrayList arrayList;
        RuntimeException runtimeException;
        Pair pair;
        String str2;
        String str3;
        List list;
        List listR;
        String str4;
        List list2;
        List list3;
        int i7;
        a87 a87Var;
        boolean zI;
        int i8;
        int i9;
        float f;
        ex3 ex3Var;
        String str5;
        int iIntValue;
        byte[] bArr;
        int i10;
        int i11;
        int i12;
        String str6;
        String str7;
        zo7 zo7VarL;
        List list4;
        int i13;
        List list5;
        int i14;
        long j;
        long j2;
        long j3;
        lwa lwaVar;
        qrh qrhVar;
        lwa lwaVarA;
        to9 to9Var = this;
        boolean z3 = false;
        to9Var.Z = false;
        boolean z4 = true;
        boolean z5 = true;
        while (z5 && !to9Var.Z) {
            ?? r7 = to9Var.a;
            ?? r8 = r7.c;
            ArrayDeque arrayDeque = r7.b;
            r7.d.getClass();
            while (true) {
                fa5 fa5Var = (fa5) arrayDeque.peek();
                if (fa5Var == null || kj6Var.getPosition() < fa5Var.b) {
                    boolean z6 = z3 ? 1 : 0;
                    ?? r5 = kj6Var;
                    if (r7.e == 0) {
                        int i15 = 4;
                        long jW = r8.w(r5, true, z6, 4);
                        if (jW == -2) {
                            byte[] bArr2 = r7.a;
                            r5.q();
                            ?? r6 = z6;
                            while (true) {
                                r5.u(r6, bArr2, i15);
                                byte b2 = bArr2[r6];
                                int i16 = 0;
                                while (true) {
                                    long[] jArr = jrc.e;
                                    if (i16 >= 8) {
                                        i4 = -1;
                                    } else if ((jArr[i16] & ((long) b2)) != 0) {
                                        i4 = i16 + 1;
                                    } else {
                                        i16++;
                                    }
                                }
                                if (i4 != -1 && i4 <= 4) {
                                    iM = (int) jrc.m(i4, false, bArr2);
                                    Object obj = r7.d.b;
                                    if (iM == 357149030 || iM == 524531317 || iM == 475249515 || iM == 374648427) {
                                    }
                                }
                                r5.E(1);
                                i15 = 4;
                                r6 = 0;
                            }
                            r5.E(i4);
                            jW = iM;
                        }
                        z = true;
                        if (jW == -1) {
                            r4 = 0;
                            z5 = false;
                            r1 = r5;
                        } else {
                            r7.f = (int) jW;
                            r7.e = 1;
                        }
                    } else {
                        z = true;
                    }
                    if (r7.e == z) {
                        r7.g = r8.w(r5, false, z, 8);
                        r7.e = 2;
                    }
                    ?? r0 = r7.d;
                    int i17 = r7.f;
                    Object obj2 = r0.b;
                    switch (i17) {
                        case 131:
                        case 136:
                        case 155:
                        case 159:
                        case 176:
                        case 179:
                        case 186:
                        case 215:
                        case 231:
                        case 238:
                        case 240:
                        case 241:
                        case 247:
                        case 251:
                        case 16871:
                        case 16980:
                        case 17029:
                        case 17143:
                        case 18401:
                        case 18408:
                        case 20529:
                        case 20530:
                        case 21420:
                        case 21432:
                        case 21680:
                        case 21682:
                        case 21690:
                        case 21930:
                        case 21938:
                        case 21945:
                        case 21946:
                        case 21947:
                        case 21948:
                        case 21949:
                        case 21998:
                        case 22186:
                        case 22203:
                        case 25188:
                        case 30114:
                        case 30321:
                        case 2352003:
                        case 2807729:
                            i = 2;
                            break;
                        case 134:
                        case 17026:
                        case 21358:
                        case 2274716:
                            i = 3;
                            break;
                        case 160:
                        case 166:
                        case 174:
                        case 183:
                        case 187:
                        case 224:
                        case 225:
                        case 16868:
                        case 18407:
                        case 19899:
                        case 20532:
                        case 20533:
                        case 21936:
                        case 21968:
                        case 25152:
                        case 28032:
                        case 30113:
                        case 30320:
                        case 290298740:
                        case 357149030:
                        case 374648427:
                        case 408125543:
                        case 440786851:
                        case 475249515:
                        case 524531317:
                            i = 1;
                            break;
                        case 161:
                        case 163:
                        case 165:
                        case 16877:
                        case 16981:
                        case 18402:
                        case 21419:
                        case 25506:
                        case 30322:
                            i = 4;
                            break;
                        case 181:
                        case 17545:
                        case 21969:
                        case 21970:
                        case 21971:
                        case 21972:
                        case 21973:
                        case 21974:
                        case 21975:
                        case 21976:
                        case 21977:
                        case 21978:
                        case 30323:
                        case 30324:
                        case 30325:
                            i = 5;
                            break;
                        default:
                            i = 0;
                            break;
                    }
                    if (i == 0) {
                        r5.E((int) r7.g);
                        r7.e = 0;
                        z3 = false;
                        z4 = true;
                    } else if (i == 1) {
                        long position = r5.getPosition();
                        arrayDeque.push(new fa5(r7.f, r7.g + position));
                        r7.d.I(r7.f, position, r7.g);
                        i2 = 0;
                        r7.e = 0;
                        r2 = r5;
                    } else if (i == 2) {
                        long j4 = r7.g;
                        if (j4 > 8) {
                            throw ParserException.a(null, "Invalid integer size: " + r7.g);
                        }
                        r0.C(i17, r7.a(r5, (int) j4));
                        i2 = 0;
                        r7.e = 0;
                        r2 = r5;
                    } else if (i == 3) {
                        long j5 = r7.g;
                        if (j5 > 2147483647L) {
                            throw ParserException.a(null, "String element size: " + r7.g);
                        }
                        int i18 = (int) j5;
                        if (i18 == 0) {
                            str = "";
                            i3 = 0;
                        } else {
                            byte[] bArr3 = new byte[i18];
                            r5.readFully(bArr3, 0, i18);
                            while (i18 > 0 && bArr3[i18 - 1] == 0) {
                                i18--;
                            }
                            i3 = 0;
                            str = new String(bArr3, 0, i18);
                        }
                        r0.J(i17, str);
                        r7.e = i3;
                        i2 = i3;
                        r2 = r5;
                    } else if (i == 4) {
                        r0.y(i17, (int) r7.g, r5);
                        i2 = 0;
                        r7.e = 0;
                        r2 = r5;
                    } else {
                        if (i != 5) {
                            throw ParserException.a(null, "Invalid element type " + i);
                        }
                        long j6 = r7.g;
                        if (j6 != 4 && j6 != 8) {
                            throw ParserException.a(null, "Invalid float size: " + r7.g);
                        }
                        int i19 = (int) j6;
                        long jA = r7.a(r5, i19);
                        double dIntBitsToFloat = i19 == 4 ? Float.intBitsToFloat((int) jA) : Double.longBitsToDouble(jA);
                        to9 to9Var2 = (to9) r0.b;
                        if (i17 == 181) {
                            to9Var2.c(i17);
                            to9Var2.y.S = (int) dIntBitsToFloat;
                        } else if (i17 != 17545) {
                            switch (i17) {
                                case 21969:
                                    to9Var2.c(i17);
                                    to9Var2.y.F = (float) dIntBitsToFloat;
                                    break;
                                case 21970:
                                    to9Var2.c(i17);
                                    to9Var2.y.G = (float) dIntBitsToFloat;
                                    break;
                                case 21971:
                                    to9Var2.c(i17);
                                    to9Var2.y.H = (float) dIntBitsToFloat;
                                    break;
                                case 21972:
                                    to9Var2.c(i17);
                                    to9Var2.y.I = (float) dIntBitsToFloat;
                                    break;
                                case 21973:
                                    to9Var2.c(i17);
                                    to9Var2.y.J = (float) dIntBitsToFloat;
                                    break;
                                case 21974:
                                    to9Var2.c(i17);
                                    to9Var2.y.K = (float) dIntBitsToFloat;
                                    break;
                                case 21975:
                                    to9Var2.c(i17);
                                    to9Var2.y.L = (float) dIntBitsToFloat;
                                    break;
                                case 21976:
                                    to9Var2.c(i17);
                                    to9Var2.y.M = (float) dIntBitsToFloat;
                                    break;
                                case 21977:
                                    to9Var2.c(i17);
                                    to9Var2.y.N = (float) dIntBitsToFloat;
                                    break;
                                case 21978:
                                    to9Var2.c(i17);
                                    to9Var2.y.O = (float) dIntBitsToFloat;
                                    break;
                                default:
                                    switch (i17) {
                                        case 30323:
                                            to9Var2.c(i17);
                                            to9Var2.y.u = (float) dIntBitsToFloat;
                                            break;
                                        case 30324:
                                            to9Var2.c(i17);
                                            to9Var2.y.v = (float) dIntBitsToFloat;
                                            break;
                                        case 30325:
                                            to9Var2.c(i17);
                                            to9Var2.y.w = (float) dIntBitsToFloat;
                                            break;
                                    }
                                    break;
                            }
                        } else {
                            to9Var2.u = (long) dIntBitsToFloat;
                        }
                        i2 = 0;
                        r7.e = 0;
                        r2 = r5;
                    }
                } else {
                    xva xvaVar = r7.d;
                    int i20 = ((fa5) arrayDeque.pop()).a;
                    to9 to9Var3 = (to9) xvaVar.b;
                    SparseArray sparseArray = to9Var3.C;
                    SparseArray sparseArray2 = to9Var3.c;
                    to9Var3.I1.getClass();
                    if (i20 != 160) {
                        if (i20 == 174) {
                            so9 so9Var = to9Var3.y;
                            so9Var.getClass();
                            String str8 = so9Var.c;
                            if (str8 == null) {
                                throw ParserException.a(null, "CodecId is missing in TrackEntry element");
                            }
                            switch (str8) {
                                case "V_MPEG4/ISO/AP":
                                case "V_MPEG4/ISO/SP":
                                case "A_MS/ACM":
                                case "A_TRUEHD":
                                case "A_VORBIS":
                                case "A_MPEG/L2":
                                case "A_MPEG/L3":
                                case "V_MS/VFW/FOURCC":
                                case "S_DVBSUB":
                                case "V_MPEG4/ISO/ASP":
                                case "V_MPEG4/ISO/AVC":
                                case "S_VOBSUB":
                                case "A_DTS/LOSSLESS":
                                case "A_AAC":
                                case "A_AC3":
                                case "A_DTS":
                                case "V_AV1":
                                case "V_VP8":
                                case "V_VP9":
                                case "S_HDMV/PGS":
                                case "V_THEORA":
                                case "A_DTS/EXPRESS":
                                case "A_PCM/FLOAT/IEEE":
                                case "A_PCM/INT/BIG":
                                case "A_PCM/INT/LIT":
                                case "S_TEXT/ASS":
                                case "S_TEXT/SSA":
                                case "V_MPEGH/ISO/HEVC":
                                case "S_TEXT/WEBVTT":
                                case "S_TEXT/UTF8":
                                case "V_MPEG2":
                                case "A_EAC3":
                                case "A_FLAC":
                                case "A_OPUS":
                                    int i21 = so9Var.d;
                                    switch (str8) {
                                        case "V_MPEG4/ISO/AP":
                                            b = 0;
                                            break;
                                        case "V_MPEG4/ISO/SP":
                                            b = 1;
                                            break;
                                        case "A_MS/ACM":
                                            b = 2;
                                            break;
                                        case "A_TRUEHD":
                                            b = 3;
                                            break;
                                        case "A_VORBIS":
                                            b = 4;
                                            break;
                                        case "A_MPEG/L2":
                                            b = 5;
                                            break;
                                        case "A_MPEG/L3":
                                            b = 6;
                                            break;
                                        case "V_MS/VFW/FOURCC":
                                            b = 7;
                                            break;
                                        case "S_DVBSUB":
                                            b = 8;
                                            break;
                                        case "V_MPEG4/ISO/ASP":
                                            b = 9;
                                            break;
                                        case "V_MPEG4/ISO/AVC":
                                            b = 10;
                                            break;
                                        case "S_VOBSUB":
                                            b = 11;
                                            break;
                                        case "A_DTS/LOSSLESS":
                                            b = 12;
                                            break;
                                        case "A_AAC":
                                            b = 13;
                                            break;
                                        case "A_AC3":
                                            b = 14;
                                            break;
                                        case "A_DTS":
                                            b = 15;
                                            break;
                                        case "V_AV1":
                                            b = 16;
                                            break;
                                        case "V_VP8":
                                            b = 17;
                                            break;
                                        case "V_VP9":
                                            b = 18;
                                            break;
                                        case "S_HDMV/PGS":
                                            b = 19;
                                            break;
                                        case "V_THEORA":
                                            b = 20;
                                            break;
                                        case "A_DTS/EXPRESS":
                                            b = 21;
                                            break;
                                        case "A_PCM/FLOAT/IEEE":
                                            b = 22;
                                            break;
                                        case "A_PCM/INT/BIG":
                                            b = 23;
                                            break;
                                        case "A_PCM/INT/LIT":
                                            b = 24;
                                            break;
                                        case "S_TEXT/ASS":
                                            b = 25;
                                            break;
                                        case "S_TEXT/SSA":
                                            b = 26;
                                            break;
                                        case "V_MPEGH/ISO/HEVC":
                                            b = 27;
                                            break;
                                        case "S_TEXT/WEBVTT":
                                            b = 28;
                                            break;
                                        case "S_TEXT/UTF8":
                                            b = 29;
                                            break;
                                        case "V_MPEG2":
                                            b = 30;
                                            break;
                                        case "A_EAC3":
                                            b = 31;
                                            break;
                                        case "A_FLAC":
                                            b = 32;
                                            break;
                                        case "A_OPUS":
                                            b = 33;
                                            break;
                                        default:
                                            b = -1;
                                            break;
                                    }
                                    String str9 = "video/x-unknown";
                                    switch (b) {
                                        case 0:
                                        case 1:
                                        case 9:
                                            byte[] bArr4 = so9Var.l;
                                            listSingletonList = bArr4 == null ? null : Collections.singletonList(bArr4);
                                            str9 = "video/mp4v-es";
                                            listR = listSingletonList;
                                            iH = -1;
                                            i6 = -1;
                                            list4 = listR;
                                            str3 = null;
                                            list3 = list4;
                                            if (so9Var.P != null && (zo7VarL = zo7.l(new nmc(so9Var.P))) != null) {
                                                str3 = (String) zo7VarL.b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z7 = so9Var.Y;
                                            if (so9Var.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i22 = (z7 ? 1 : 0) | i7;
                                            a87Var = new a87();
                                            zI = uya.i(str9);
                                            Map map = O1;
                                            if (zI) {
                                                a87Var.E = so9Var.Q;
                                                a87Var.F = so9Var.S;
                                                a87Var.G = iH;
                                            } else if (uya.m(str9)) {
                                                if (so9Var.s == 0) {
                                                    i11 = so9Var.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = so9Var.n;
                                                    }
                                                    so9Var.q = i11;
                                                    i12 = so9Var.r;
                                                    if (i12 == -1) {
                                                        i12 = so9Var.o;
                                                    }
                                                    so9Var.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = so9Var.q;
                                                if (i9 != i8 || (i10 = so9Var.r) == i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = (so9Var.o * i9) / (so9Var.n * i10);
                                                }
                                                if (so9Var.z) {
                                                    if (so9Var.F != -1.0f || so9Var.G == -1.0f || so9Var.H == -1.0f || so9Var.I == -1.0f || so9Var.J == -1.0f || so9Var.K == -1.0f || so9Var.L == -1.0f || so9Var.M == -1.0f || so9Var.N == -1.0f || so9Var.O == -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        byte[] bArr5 = new byte[25];
                                                        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr5).order(ByteOrder.LITTLE_ENDIAN);
                                                        byteBufferOrder.put((byte) 0);
                                                        byteBufferOrder.putShort((short) ((so9Var.F * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((so9Var.G * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((so9Var.H * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((so9Var.I * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((so9Var.J * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((so9Var.K * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((so9Var.L * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((so9Var.M * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) (so9Var.N + 0.5f));
                                                        byteBufferOrder.putShort((short) (so9Var.O + 0.5f));
                                                        byteBufferOrder.putShort((short) so9Var.D);
                                                        byteBufferOrder.putShort((short) so9Var.E);
                                                        bArr = bArr5;
                                                    }
                                                    int i23 = so9Var.A;
                                                    int i24 = so9Var.C;
                                                    int i25 = so9Var.B;
                                                    int i26 = so9Var.p;
                                                    ex3Var = new ex3(i23, i24, i25, bArr, i26, i26);
                                                } else {
                                                    ex3Var = null;
                                                }
                                                str5 = so9Var.b;
                                                if (str5 == null && map.containsKey(str5)) {
                                                    iIntValue = ((Integer) map.get(so9Var.b)).intValue();
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (so9Var.t == 0 && Float.compare(so9Var.u, 0.0f) == 0 && Float.compare(so9Var.v, 0.0f) == 0) {
                                                    if (Float.compare(so9Var.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(so9Var.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(so9Var.w, -180.0f) != 0 || Float.compare(so9Var.w, 180.0f) == 0) {
                                                        iIntValue = 180;
                                                    } else if (Float.compare(so9Var.w, -90.0f) == 0) {
                                                        iIntValue = 270;
                                                    }
                                                }
                                                a87Var.t = so9Var.n;
                                                a87Var.u = so9Var.o;
                                                a87Var.z = f;
                                                a87Var.y = iIntValue;
                                                a87Var.A = so9Var.x;
                                                a87Var.B = so9Var.y;
                                                a87Var.C = ex3Var;
                                            } else if (!"application/x-subrip".equals(str9) && !"text/x-ssa".equals(str9) && !"text/vtt".equals(str9) && !"application/vobsub".equals(str9) && !"application/pgs".equals(str9) && !"application/dvbsubs".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = so9Var.b;
                                            if (str6 != null && !map.containsKey(str6)) {
                                                a87Var.b = so9Var.b;
                                            }
                                            a87Var.a = Integer.toString(i21);
                                            if (so9Var.a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            a87Var.l = uya.n(str7);
                                            a87Var.m = uya.n(str9);
                                            a87Var.n = i6;
                                            a87Var.d = so9Var.Z;
                                            a87Var.e = i22;
                                            a87Var.p = list3;
                                            a87Var.j = str3;
                                            a87Var.q = so9Var.m;
                                            so9Var.b0 = a87Var.a();
                                            so9Var.a0 = to9Var3.I1.G(so9Var.d, so9Var.e);
                                            sparseArray2.put(so9Var.d, so9Var);
                                            break;
                                        case 2:
                                            nmc nmcVar = new nmc(so9Var.a(so9Var.c));
                                            try {
                                                int iT = nmcVar.t();
                                                if (iT != 1) {
                                                    if (iT == 65534) {
                                                        nmcVar.N(24);
                                                        long jU = nmcVar.u();
                                                        UUID uuid = N1;
                                                        if (jU != uuid.getMostSignificantBits() || nmcVar.u() != uuid.getLeastSignificantBits()) {
                                                        }
                                                        str9 = "audio/x-unknown";
                                                        iH = -1;
                                                        i6 = -1;
                                                        str3 = null;
                                                        list3 = null;
                                                        if (so9Var.P != null) {
                                                            str3 = (String) zo7VarL.b;
                                                            str9 = "video/dolby-vision";
                                                        }
                                                        boolean z8 = so9Var.Y;
                                                        if (so9Var.X) {
                                                            i7 = 2;
                                                        } else {
                                                            i7 = 0;
                                                        }
                                                        int i27 = (z8 ? 1 : 0) | i7;
                                                        a87Var = new a87();
                                                        zI = uya.i(str9);
                                                        Map map2 = O1;
                                                        if (zI) {
                                                            a87Var.E = so9Var.Q;
                                                            a87Var.F = so9Var.S;
                                                            a87Var.G = iH;
                                                        } else if (uya.m(str9)) {
                                                            if (so9Var.s == 0) {
                                                                i11 = so9Var.q;
                                                                i8 = -1;
                                                                if (i11 == -1) {
                                                                    i11 = so9Var.n;
                                                                }
                                                                so9Var.q = i11;
                                                                i12 = so9Var.r;
                                                                if (i12 == -1) {
                                                                    i12 = so9Var.o;
                                                                }
                                                                so9Var.r = i12;
                                                            } else {
                                                                i8 = -1;
                                                            }
                                                            i9 = so9Var.q;
                                                            if (i9 != i8) {
                                                                f = -1.0f;
                                                            } else {
                                                                f = -1.0f;
                                                            }
                                                            if (so9Var.z) {
                                                                if (so9Var.F != -1.0f) {
                                                                    bArr = null;
                                                                } else {
                                                                    bArr = null;
                                                                }
                                                                int i28 = so9Var.A;
                                                                int i29 = so9Var.C;
                                                                int i210 = so9Var.B;
                                                                int i211 = so9Var.p;
                                                                ex3Var = new ex3(i28, i29, i210, bArr, i211, i211);
                                                            } else {
                                                                ex3Var = null;
                                                            }
                                                            str5 = so9Var.b;
                                                            if (str5 == null) {
                                                                iIntValue = -1;
                                                            } else {
                                                                iIntValue = -1;
                                                            }
                                                            if (so9Var.t == 0) {
                                                                if (Float.compare(so9Var.w, 0.0f) == 0) {
                                                                    iIntValue = 0;
                                                                } else if (Float.compare(so9Var.w, 90.0f) == 0) {
                                                                    iIntValue = 90;
                                                                } else if (Float.compare(so9Var.w, -180.0f) != 0) {
                                                                    iIntValue = 180;
                                                                } else {
                                                                    iIntValue = 180;
                                                                }
                                                            }
                                                            a87Var.t = so9Var.n;
                                                            a87Var.u = so9Var.o;
                                                            a87Var.z = f;
                                                            a87Var.y = iIntValue;
                                                            a87Var.A = so9Var.x;
                                                            a87Var.B = so9Var.y;
                                                            a87Var.C = ex3Var;
                                                        } else if (!"application/x-subrip".equals(str9)) {
                                                            throw ParserException.a(null, "Unexpected MIME type.");
                                                        }
                                                        str6 = so9Var.b;
                                                        if (str6 != null) {
                                                            a87Var.b = so9Var.b;
                                                        }
                                                        a87Var.a = Integer.toString(i21);
                                                        if (so9Var.a) {
                                                            str7 = "video/webm";
                                                        } else {
                                                            str7 = "video/x-matroska";
                                                        }
                                                        a87Var.l = uya.n(str7);
                                                        a87Var.m = uya.n(str9);
                                                        a87Var.n = i6;
                                                        a87Var.d = so9Var.Z;
                                                        a87Var.e = i27;
                                                        a87Var.p = list3;
                                                        a87Var.j = str3;
                                                        a87Var.q = so9Var.m;
                                                        so9Var.b0 = a87Var.a();
                                                        so9Var.a0 = to9Var3.I1.G(so9Var.d, so9Var.e);
                                                        sparseArray2.put(so9Var.d, so9Var);
                                                    }
                                                    lvb.G0("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                                    str9 = "audio/x-unknown";
                                                    iH = -1;
                                                    i6 = -1;
                                                    str3 = null;
                                                    list3 = null;
                                                    if (so9Var.P != null) {
                                                        str3 = (String) zo7VarL.b;
                                                        str9 = "video/dolby-vision";
                                                    }
                                                    boolean z9 = so9Var.Y;
                                                    if (so9Var.X) {
                                                        i7 = 2;
                                                    } else {
                                                        i7 = 0;
                                                    }
                                                    int i212 = (z9 ? 1 : 0) | i7;
                                                    a87Var = new a87();
                                                    zI = uya.i(str9);
                                                    Map map3 = O1;
                                                    if (zI) {
                                                        a87Var.E = so9Var.Q;
                                                        a87Var.F = so9Var.S;
                                                        a87Var.G = iH;
                                                    } else if (uya.m(str9)) {
                                                        if (so9Var.s == 0) {
                                                            i11 = so9Var.q;
                                                            i8 = -1;
                                                            if (i11 == -1) {
                                                                i11 = so9Var.n;
                                                            }
                                                            so9Var.q = i11;
                                                            i12 = so9Var.r;
                                                            if (i12 == -1) {
                                                                i12 = so9Var.o;
                                                            }
                                                            so9Var.r = i12;
                                                        } else {
                                                            i8 = -1;
                                                        }
                                                        i9 = so9Var.q;
                                                        if (i9 != i8) {
                                                            f = -1.0f;
                                                        } else {
                                                            f = -1.0f;
                                                        }
                                                        if (so9Var.z) {
                                                            if (so9Var.F != -1.0f) {
                                                                bArr = null;
                                                            } else {
                                                                bArr = null;
                                                            }
                                                            int i213 = so9Var.A;
                                                            int i214 = so9Var.C;
                                                            int i215 = so9Var.B;
                                                            int i216 = so9Var.p;
                                                            ex3Var = new ex3(i213, i214, i215, bArr, i216, i216);
                                                        } else {
                                                            ex3Var = null;
                                                        }
                                                        str5 = so9Var.b;
                                                        if (str5 == null) {
                                                            iIntValue = -1;
                                                        } else {
                                                            iIntValue = -1;
                                                        }
                                                        if (so9Var.t == 0) {
                                                            if (Float.compare(so9Var.w, 0.0f) == 0) {
                                                                iIntValue = 0;
                                                            } else if (Float.compare(so9Var.w, 90.0f) == 0) {
                                                                iIntValue = 90;
                                                            } else if (Float.compare(so9Var.w, -180.0f) != 0) {
                                                                iIntValue = 180;
                                                            } else {
                                                                iIntValue = 180;
                                                            }
                                                        }
                                                        a87Var.t = so9Var.n;
                                                        a87Var.u = so9Var.o;
                                                        a87Var.z = f;
                                                        a87Var.y = iIntValue;
                                                        a87Var.A = so9Var.x;
                                                        a87Var.B = so9Var.y;
                                                        a87Var.C = ex3Var;
                                                    } else if (!"application/x-subrip".equals(str9)) {
                                                        throw ParserException.a(null, "Unexpected MIME type.");
                                                    }
                                                    str6 = so9Var.b;
                                                    if (str6 != null) {
                                                        a87Var.b = so9Var.b;
                                                    }
                                                    a87Var.a = Integer.toString(i21);
                                                    if (so9Var.a) {
                                                        str7 = "video/webm";
                                                    } else {
                                                        str7 = "video/x-matroska";
                                                    }
                                                    a87Var.l = uya.n(str7);
                                                    a87Var.m = uya.n(str9);
                                                    a87Var.n = i6;
                                                    a87Var.d = so9Var.Z;
                                                    a87Var.e = i212;
                                                    a87Var.p = list3;
                                                    a87Var.j = str3;
                                                    a87Var.q = so9Var.m;
                                                    so9Var.b0 = a87Var.a();
                                                    so9Var.a0 = to9Var3.I1.G(so9Var.d, so9Var.e);
                                                    sparseArray2.put(so9Var.d, so9Var);
                                                    break;
                                                }
                                                int i30 = so9Var.R;
                                                String str10 = vqi.a;
                                                iH = vqi.H(i30, ByteOrder.LITTLE_ENDIAN);
                                                if (iH == 0) {
                                                    lvb.G0("MatroskaExtractor", "Unsupported PCM bit depth: " + so9Var.R + ". Setting mimeType to audio/x-unknown");
                                                    str9 = "audio/x-unknown";
                                                    iH = -1;
                                                } else {
                                                    str9 = "audio/raw";
                                                }
                                                i6 = -1;
                                                str3 = null;
                                                list3 = null;
                                                if (so9Var.P != null) {
                                                    str3 = (String) zo7VarL.b;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z10 = so9Var.Y;
                                                if (so9Var.X) {
                                                    i7 = 2;
                                                } else {
                                                    i7 = 0;
                                                }
                                                int i217 = (z10 ? 1 : 0) | i7;
                                                a87Var = new a87();
                                                zI = uya.i(str9);
                                                Map map4 = O1;
                                                if (zI) {
                                                    a87Var.E = so9Var.Q;
                                                    a87Var.F = so9Var.S;
                                                    a87Var.G = iH;
                                                } else if (uya.m(str9)) {
                                                    if (so9Var.s == 0) {
                                                        i11 = so9Var.q;
                                                        i8 = -1;
                                                        if (i11 == -1) {
                                                            i11 = so9Var.n;
                                                        }
                                                        so9Var.q = i11;
                                                        i12 = so9Var.r;
                                                        if (i12 == -1) {
                                                            i12 = so9Var.o;
                                                        }
                                                        so9Var.r = i12;
                                                    } else {
                                                        i8 = -1;
                                                    }
                                                    i9 = so9Var.q;
                                                    if (i9 != i8) {
                                                        f = -1.0f;
                                                    } else {
                                                        f = -1.0f;
                                                    }
                                                    if (so9Var.z) {
                                                        if (so9Var.F != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        int i218 = so9Var.A;
                                                        int i219 = so9Var.C;
                                                        int i2110 = so9Var.B;
                                                        int i2111 = so9Var.p;
                                                        ex3Var = new ex3(i218, i219, i2110, bArr, i2111, i2111);
                                                    } else {
                                                        ex3Var = null;
                                                    }
                                                    str5 = so9Var.b;
                                                    if (str5 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (so9Var.t == 0) {
                                                        if (Float.compare(so9Var.w, 0.0f) == 0) {
                                                            iIntValue = 0;
                                                        } else if (Float.compare(so9Var.w, 90.0f) == 0) {
                                                            iIntValue = 90;
                                                        } else if (Float.compare(so9Var.w, -180.0f) != 0) {
                                                            iIntValue = 180;
                                                        } else {
                                                            iIntValue = 180;
                                                        }
                                                    }
                                                    a87Var.t = so9Var.n;
                                                    a87Var.u = so9Var.o;
                                                    a87Var.z = f;
                                                    a87Var.y = iIntValue;
                                                    a87Var.A = so9Var.x;
                                                    a87Var.B = so9Var.y;
                                                    a87Var.C = ex3Var;
                                                } else if (!"application/x-subrip".equals(str9)) {
                                                    throw ParserException.a(null, "Unexpected MIME type.");
                                                }
                                                str6 = so9Var.b;
                                                if (str6 != null) {
                                                    a87Var.b = so9Var.b;
                                                }
                                                a87Var.a = Integer.toString(i21);
                                                if (so9Var.a) {
                                                    str7 = "video/webm";
                                                } else {
                                                    str7 = "video/x-matroska";
                                                }
                                                a87Var.l = uya.n(str7);
                                                a87Var.m = uya.n(str9);
                                                a87Var.n = i6;
                                                a87Var.d = so9Var.Z;
                                                a87Var.e = i217;
                                                a87Var.p = list3;
                                                a87Var.j = str3;
                                                a87Var.q = so9Var.m;
                                                so9Var.b0 = a87Var.a();
                                                so9Var.a0 = to9Var3.I1.G(so9Var.d, so9Var.e);
                                                sparseArray2.put(so9Var.d, so9Var);
                                            } catch (ArrayIndexOutOfBoundsException unused) {
                                                throw ParserException.a(null, "Error parsing MS/ACM codec private");
                                            }
                                            break;
                                        case 3:
                                            so9Var.V = new g5i();
                                            str9 = "audio/true-hd";
                                            iH = -1;
                                            i6 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (so9Var.P != null) {
                                                str3 = (String) zo7VarL.b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z11 = so9Var.Y;
                                            if (so9Var.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i2112 = (z11 ? 1 : 0) | i7;
                                            a87Var = new a87();
                                            zI = uya.i(str9);
                                            Map map5 = O1;
                                            if (zI) {
                                                a87Var.E = so9Var.Q;
                                                a87Var.F = so9Var.S;
                                                a87Var.G = iH;
                                            } else if (uya.m(str9)) {
                                                if (so9Var.s == 0) {
                                                    i11 = so9Var.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = so9Var.n;
                                                    }
                                                    so9Var.q = i11;
                                                    i12 = so9Var.r;
                                                    if (i12 == -1) {
                                                        i12 = so9Var.o;
                                                    }
                                                    so9Var.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = so9Var.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (so9Var.z) {
                                                    if (so9Var.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i2113 = so9Var.A;
                                                    int i2114 = so9Var.C;
                                                    int i2115 = so9Var.B;
                                                    int i2116 = so9Var.p;
                                                    ex3Var = new ex3(i2113, i2114, i2115, bArr, i2116, i2116);
                                                } else {
                                                    ex3Var = null;
                                                }
                                                str5 = so9Var.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (so9Var.t == 0) {
                                                    if (Float.compare(so9Var.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(so9Var.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(so9Var.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                a87Var.t = so9Var.n;
                                                a87Var.u = so9Var.o;
                                                a87Var.z = f;
                                                a87Var.y = iIntValue;
                                                a87Var.A = so9Var.x;
                                                a87Var.B = so9Var.y;
                                                a87Var.C = ex3Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = so9Var.b;
                                            if (str6 != null) {
                                                a87Var.b = so9Var.b;
                                            }
                                            a87Var.a = Integer.toString(i21);
                                            if (so9Var.a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            a87Var.l = uya.n(str7);
                                            a87Var.m = uya.n(str9);
                                            a87Var.n = i6;
                                            a87Var.d = so9Var.Z;
                                            a87Var.e = i2112;
                                            a87Var.p = list3;
                                            a87Var.j = str3;
                                            a87Var.q = so9Var.m;
                                            so9Var.b0 = a87Var.a();
                                            so9Var.a0 = to9Var3.I1.G(so9Var.d, so9Var.e);
                                            sparseArray2.put(so9Var.d, so9Var);
                                            break;
                                        case 4:
                                            byte[] bArrA = so9Var.a(str8);
                                            try {
                                                r3 = bArrA[0];
                                                try {
                                                    if (r3 != 2) {
                                                        throw ParserException.a(null, "Error parsing vorbis codec private");
                                                    }
                                                    int i31 = 0;
                                                    int i32 = 1;
                                                    while (true) {
                                                        int i33 = bArrA[i32] & 255;
                                                        if (i33 != 255) {
                                                            int i34 = i32 + 1;
                                                            int i35 = i31 + i33;
                                                            int i36 = 0;
                                                            while (true) {
                                                                int i37 = bArrA[i34] & 255;
                                                                if (i37 != 255) {
                                                                    int i38 = i34 + 1;
                                                                    int i39 = i36 + i37;
                                                                    if (bArrA[i38] != 1) {
                                                                        throw ParserException.a(null, "Error parsing vorbis codec private");
                                                                    }
                                                                    byte[] bArr6 = new byte[i35];
                                                                    System.arraycopy(bArrA, i38, bArr6, 0, i35);
                                                                    int i40 = i38 + i35;
                                                                    if (bArrA[i40] != 3) {
                                                                        throw ParserException.a(null, "Error parsing vorbis codec private");
                                                                    }
                                                                    int i41 = i40 + i39;
                                                                    if (bArrA[i41] != 5) {
                                                                        throw ParserException.a(null, "Error parsing vorbis codec private");
                                                                    }
                                                                    byte[] bArr7 = new byte[bArrA.length - i41];
                                                                    System.arraycopy(bArrA, i41, bArr7, 0, bArrA.length - i41);
                                                                    ArrayList arrayList2 = new ArrayList(2);
                                                                    arrayList2.add(bArr6);
                                                                    arrayList2.add(bArr7);
                                                                    str9 = "audio/vorbis";
                                                                    i6 = 8192;
                                                                    arrayList = arrayList2;
                                                                    iH = -1;
                                                                    list4 = arrayList;
                                                                    str3 = null;
                                                                    list3 = list4;
                                                                    if (so9Var.P != null) {
                                                                        str3 = (String) zo7VarL.b;
                                                                        str9 = "video/dolby-vision";
                                                                    }
                                                                    boolean z12 = so9Var.Y;
                                                                    if (so9Var.X) {
                                                                        i7 = 2;
                                                                    } else {
                                                                        i7 = 0;
                                                                    }
                                                                    int i2117 = (z12 ? 1 : 0) | i7;
                                                                    a87Var = new a87();
                                                                    zI = uya.i(str9);
                                                                    Map map6 = O1;
                                                                    if (zI) {
                                                                        a87Var.E = so9Var.Q;
                                                                        a87Var.F = so9Var.S;
                                                                        a87Var.G = iH;
                                                                    } else if (uya.m(str9)) {
                                                                        if (so9Var.s == 0) {
                                                                            i11 = so9Var.q;
                                                                            i8 = -1;
                                                                            if (i11 == -1) {
                                                                                i11 = so9Var.n;
                                                                            }
                                                                            so9Var.q = i11;
                                                                            i12 = so9Var.r;
                                                                            if (i12 == -1) {
                                                                                i12 = so9Var.o;
                                                                            }
                                                                            so9Var.r = i12;
                                                                        } else {
                                                                            i8 = -1;
                                                                        }
                                                                        i9 = so9Var.q;
                                                                        if (i9 != i8) {
                                                                            f = -1.0f;
                                                                        } else {
                                                                            f = -1.0f;
                                                                        }
                                                                        if (so9Var.z) {
                                                                            if (so9Var.F != -1.0f) {
                                                                                bArr = null;
                                                                            } else {
                                                                                bArr = null;
                                                                            }
                                                                            int i2118 = so9Var.A;
                                                                            int i2119 = so9Var.C;
                                                                            int i21110 = so9Var.B;
                                                                            int i21111 = so9Var.p;
                                                                            ex3Var = new ex3(i2118, i2119, i21110, bArr, i21111, i21111);
                                                                        } else {
                                                                            ex3Var = null;
                                                                        }
                                                                        str5 = so9Var.b;
                                                                        if (str5 == null) {
                                                                            iIntValue = -1;
                                                                        } else {
                                                                            iIntValue = -1;
                                                                        }
                                                                        if (so9Var.t == 0) {
                                                                            if (Float.compare(so9Var.w, 0.0f) == 0) {
                                                                                iIntValue = 0;
                                                                            } else if (Float.compare(so9Var.w, 90.0f) == 0) {
                                                                                iIntValue = 90;
                                                                            } else if (Float.compare(so9Var.w, -180.0f) != 0) {
                                                                                iIntValue = 180;
                                                                            } else {
                                                                                iIntValue = 180;
                                                                            }
                                                                        }
                                                                        a87Var.t = so9Var.n;
                                                                        a87Var.u = so9Var.o;
                                                                        a87Var.z = f;
                                                                        a87Var.y = iIntValue;
                                                                        a87Var.A = so9Var.x;
                                                                        a87Var.B = so9Var.y;
                                                                        a87Var.C = ex3Var;
                                                                    } else if (!"application/x-subrip".equals(str9)) {
                                                                        throw ParserException.a(null, "Unexpected MIME type.");
                                                                    }
                                                                    str6 = so9Var.b;
                                                                    if (str6 != null) {
                                                                        a87Var.b = so9Var.b;
                                                                    }
                                                                    a87Var.a = Integer.toString(i21);
                                                                    if (so9Var.a) {
                                                                        str7 = "video/webm";
                                                                    } else {
                                                                        str7 = "video/x-matroska";
                                                                    }
                                                                    a87Var.l = uya.n(str7);
                                                                    a87Var.m = uya.n(str9);
                                                                    a87Var.n = i6;
                                                                    a87Var.d = so9Var.Z;
                                                                    a87Var.e = i2117;
                                                                    a87Var.p = list3;
                                                                    a87Var.j = str3;
                                                                    a87Var.q = so9Var.m;
                                                                    so9Var.b0 = a87Var.a();
                                                                    so9Var.a0 = to9Var3.I1.G(so9Var.d, so9Var.e);
                                                                    sparseArray2.put(so9Var.d, so9Var);
                                                                } else {
                                                                    i36 += 255;
                                                                    i34++;
                                                                }
                                                            }
                                                        } else {
                                                            i31 += 255;
                                                            i32++;
                                                        }
                                                    }
                                                } catch (ArrayIndexOutOfBoundsException unused2) {
                                                    throw ParserException.a(r3, "Error parsing vorbis codec private");
                                                }
                                            } catch (ArrayIndexOutOfBoundsException unused3) {
                                                r3 = 0;
                                            }
                                            break;
                                        case 5:
                                            str9 = "audio/mpeg-L2";
                                            iH = -1;
                                            i6 = np0.r;
                                            str3 = null;
                                            list3 = null;
                                            if (so9Var.P != null) {
                                                str3 = (String) zo7VarL.b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z13 = so9Var.Y;
                                            if (so9Var.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i21112 = (z13 ? 1 : 0) | i7;
                                            a87Var = new a87();
                                            zI = uya.i(str9);
                                            Map map7 = O1;
                                            if (zI) {
                                                a87Var.E = so9Var.Q;
                                                a87Var.F = so9Var.S;
                                                a87Var.G = iH;
                                            } else if (uya.m(str9)) {
                                                if (so9Var.s == 0) {
                                                    i11 = so9Var.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = so9Var.n;
                                                    }
                                                    so9Var.q = i11;
                                                    i12 = so9Var.r;
                                                    if (i12 == -1) {
                                                        i12 = so9Var.o;
                                                    }
                                                    so9Var.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = so9Var.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (so9Var.z) {
                                                    if (so9Var.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i21113 = so9Var.A;
                                                    int i21114 = so9Var.C;
                                                    int i21115 = so9Var.B;
                                                    int i21116 = so9Var.p;
                                                    ex3Var = new ex3(i21113, i21114, i21115, bArr, i21116, i21116);
                                                } else {
                                                    ex3Var = null;
                                                }
                                                str5 = so9Var.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (so9Var.t == 0) {
                                                    if (Float.compare(so9Var.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(so9Var.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(so9Var.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                a87Var.t = so9Var.n;
                                                a87Var.u = so9Var.o;
                                                a87Var.z = f;
                                                a87Var.y = iIntValue;
                                                a87Var.A = so9Var.x;
                                                a87Var.B = so9Var.y;
                                                a87Var.C = ex3Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = so9Var.b;
                                            if (str6 != null) {
                                                a87Var.b = so9Var.b;
                                            }
                                            a87Var.a = Integer.toString(i21);
                                            if (so9Var.a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            a87Var.l = uya.n(str7);
                                            a87Var.m = uya.n(str9);
                                            a87Var.n = i6;
                                            a87Var.d = so9Var.Z;
                                            a87Var.e = i21112;
                                            a87Var.p = list3;
                                            a87Var.j = str3;
                                            a87Var.q = so9Var.m;
                                            so9Var.b0 = a87Var.a();
                                            so9Var.a0 = to9Var3.I1.G(so9Var.d, so9Var.e);
                                            sparseArray2.put(so9Var.d, so9Var);
                                            break;
                                        case 6:
                                            str9 = "audio/mpeg";
                                            iH = -1;
                                            i6 = np0.r;
                                            str3 = null;
                                            list3 = null;
                                            if (so9Var.P != null) {
                                                str3 = (String) zo7VarL.b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z14 = so9Var.Y;
                                            if (so9Var.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i21117 = (z14 ? 1 : 0) | i7;
                                            a87Var = new a87();
                                            zI = uya.i(str9);
                                            Map map8 = O1;
                                            if (zI) {
                                                a87Var.E = so9Var.Q;
                                                a87Var.F = so9Var.S;
                                                a87Var.G = iH;
                                            } else if (uya.m(str9)) {
                                                if (so9Var.s == 0) {
                                                    i11 = so9Var.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = so9Var.n;
                                                    }
                                                    so9Var.q = i11;
                                                    i12 = so9Var.r;
                                                    if (i12 == -1) {
                                                        i12 = so9Var.o;
                                                    }
                                                    so9Var.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = so9Var.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (so9Var.z) {
                                                    if (so9Var.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i21118 = so9Var.A;
                                                    int i21119 = so9Var.C;
                                                    int i211110 = so9Var.B;
                                                    int i211111 = so9Var.p;
                                                    ex3Var = new ex3(i21118, i21119, i211110, bArr, i211111, i211111);
                                                } else {
                                                    ex3Var = null;
                                                }
                                                str5 = so9Var.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (so9Var.t == 0) {
                                                    if (Float.compare(so9Var.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(so9Var.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(so9Var.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                a87Var.t = so9Var.n;
                                                a87Var.u = so9Var.o;
                                                a87Var.z = f;
                                                a87Var.y = iIntValue;
                                                a87Var.A = so9Var.x;
                                                a87Var.B = so9Var.y;
                                                a87Var.C = ex3Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = so9Var.b;
                                            if (str6 != null) {
                                                a87Var.b = so9Var.b;
                                            }
                                            a87Var.a = Integer.toString(i21);
                                            if (so9Var.a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            a87Var.l = uya.n(str7);
                                            a87Var.m = uya.n(str9);
                                            a87Var.n = i6;
                                            a87Var.d = so9Var.Z;
                                            a87Var.e = i21117;
                                            a87Var.p = list3;
                                            a87Var.j = str3;
                                            a87Var.q = so9Var.m;
                                            so9Var.b0 = a87Var.a();
                                            so9Var.a0 = to9Var3.I1.G(so9Var.d, so9Var.e);
                                            sparseArray2.put(so9Var.d, so9Var);
                                            break;
                                        case 7:
                                            nmc nmcVar2 = new nmc(so9Var.a(so9Var.c));
                                            try {
                                                nmcVar2.O(16);
                                                long jR = nmcVar2.r();
                                                if (jR == 1482049860) {
                                                    try {
                                                        pair = new Pair("video/divx", null);
                                                        str2 = null;
                                                    } catch (ArrayIndexOutOfBoundsException unused4) {
                                                        runtimeException = null;
                                                    }
                                                } else {
                                                    if (jR == 859189832) {
                                                        pair = new Pair("video/3gpp", null);
                                                    } else {
                                                        if (jR == 826496599) {
                                                            int i42 = nmcVar2.b + 20;
                                                            byte[] bArr8 = nmcVar2.a;
                                                            while (true) {
                                                                if (i42 < bArr8.length - 4) {
                                                                    if (bArr8[i42] == 0 && bArr8[i42 + 1] == 0 && bArr8[i42 + 2] == 1) {
                                                                        if (bArr8[i42 + 3] == 15) {
                                                                            pair = new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr8, i42, bArr8.length)));
                                                                        }
                                                                    }
                                                                    i42++;
                                                                } else {
                                                                    runtimeException = null;
                                                                    try {
                                                                        throw ParserException.a(null, "Failed to find FourCC VC1 initialization data");
                                                                    } catch (ArrayIndexOutOfBoundsException unused5) {
                                                                    }
                                                                }
                                                                throw ParserException.a(runtimeException, "Error parsing FourCC private data");
                                                            }
                                                        }
                                                        lvb.G0("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                                                        str2 = null;
                                                        pair = new Pair("video/x-unknown", null);
                                                    }
                                                    str2 = null;
                                                }
                                                str9 = (String) pair.first;
                                                str3 = str2;
                                                list = (List) pair.second;
                                                iH = -1;
                                                i6 = -1;
                                                list3 = list;
                                                if (so9Var.P != null) {
                                                    str3 = (String) zo7VarL.b;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z15 = so9Var.Y;
                                                if (so9Var.X) {
                                                    i7 = 2;
                                                } else {
                                                    i7 = 0;
                                                }
                                                int i211112 = (z15 ? 1 : 0) | i7;
                                                a87Var = new a87();
                                                zI = uya.i(str9);
                                                Map map9 = O1;
                                                if (zI) {
                                                    a87Var.E = so9Var.Q;
                                                    a87Var.F = so9Var.S;
                                                    a87Var.G = iH;
                                                } else if (uya.m(str9)) {
                                                    if (so9Var.s == 0) {
                                                        i11 = so9Var.q;
                                                        i8 = -1;
                                                        if (i11 == -1) {
                                                            i11 = so9Var.n;
                                                        }
                                                        so9Var.q = i11;
                                                        i12 = so9Var.r;
                                                        if (i12 == -1) {
                                                            i12 = so9Var.o;
                                                        }
                                                        so9Var.r = i12;
                                                    } else {
                                                        i8 = -1;
                                                    }
                                                    i9 = so9Var.q;
                                                    if (i9 != i8) {
                                                        f = -1.0f;
                                                    } else {
                                                        f = -1.0f;
                                                    }
                                                    if (so9Var.z) {
                                                        if (so9Var.F != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        int i211113 = so9Var.A;
                                                        int i211114 = so9Var.C;
                                                        int i211115 = so9Var.B;
                                                        int i211116 = so9Var.p;
                                                        ex3Var = new ex3(i211113, i211114, i211115, bArr, i211116, i211116);
                                                    } else {
                                                        ex3Var = null;
                                                    }
                                                    str5 = so9Var.b;
                                                    if (str5 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (so9Var.t == 0) {
                                                        if (Float.compare(so9Var.w, 0.0f) == 0) {
                                                            iIntValue = 0;
                                                        } else if (Float.compare(so9Var.w, 90.0f) == 0) {
                                                            iIntValue = 90;
                                                        } else if (Float.compare(so9Var.w, -180.0f) != 0) {
                                                            iIntValue = 180;
                                                        } else {
                                                            iIntValue = 180;
                                                        }
                                                    }
                                                    a87Var.t = so9Var.n;
                                                    a87Var.u = so9Var.o;
                                                    a87Var.z = f;
                                                    a87Var.y = iIntValue;
                                                    a87Var.A = so9Var.x;
                                                    a87Var.B = so9Var.y;
                                                    a87Var.C = ex3Var;
                                                } else if (!"application/x-subrip".equals(str9)) {
                                                    throw ParserException.a(null, "Unexpected MIME type.");
                                                }
                                                str6 = so9Var.b;
                                                if (str6 != null) {
                                                    a87Var.b = so9Var.b;
                                                }
                                                a87Var.a = Integer.toString(i21);
                                                if (so9Var.a) {
                                                    str7 = "video/webm";
                                                } else {
                                                    str7 = "video/x-matroska";
                                                }
                                                a87Var.l = uya.n(str7);
                                                a87Var.m = uya.n(str9);
                                                a87Var.n = i6;
                                                a87Var.d = so9Var.Z;
                                                a87Var.e = i211112;
                                                a87Var.p = list3;
                                                a87Var.j = str3;
                                                a87Var.q = so9Var.m;
                                                so9Var.b0 = a87Var.a();
                                                so9Var.a0 = to9Var3.I1.G(so9Var.d, so9Var.e);
                                                sparseArray2.put(so9Var.d, so9Var);
                                            } catch (ArrayIndexOutOfBoundsException unused6) {
                                                runtimeException = null;
                                            }
                                            break;
                                        case 8:
                                            byte[] bArr9 = new byte[4];
                                            System.arraycopy(so9Var.a(str8), 0, bArr9, 0, 4);
                                            listR = c98.r(bArr9);
                                            str9 = "application/dvbsubs";
                                            iH = -1;
                                            i6 = -1;
                                            list4 = listR;
                                            str3 = null;
                                            list3 = list4;
                                            if (so9Var.P != null) {
                                                str3 = (String) zo7VarL.b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z16 = so9Var.Y;
                                            if (so9Var.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i211117 = (z16 ? 1 : 0) | i7;
                                            a87Var = new a87();
                                            zI = uya.i(str9);
                                            Map map10 = O1;
                                            if (zI) {
                                                a87Var.E = so9Var.Q;
                                                a87Var.F = so9Var.S;
                                                a87Var.G = iH;
                                            } else if (uya.m(str9)) {
                                                if (so9Var.s == 0) {
                                                    i11 = so9Var.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = so9Var.n;
                                                    }
                                                    so9Var.q = i11;
                                                    i12 = so9Var.r;
                                                    if (i12 == -1) {
                                                        i12 = so9Var.o;
                                                    }
                                                    so9Var.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = so9Var.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (so9Var.z) {
                                                    if (so9Var.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i211118 = so9Var.A;
                                                    int i211119 = so9Var.C;
                                                    int i2111110 = so9Var.B;
                                                    int i2111111 = so9Var.p;
                                                    ex3Var = new ex3(i211118, i211119, i2111110, bArr, i2111111, i2111111);
                                                } else {
                                                    ex3Var = null;
                                                }
                                                str5 = so9Var.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (so9Var.t == 0) {
                                                    if (Float.compare(so9Var.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(so9Var.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(so9Var.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                a87Var.t = so9Var.n;
                                                a87Var.u = so9Var.o;
                                                a87Var.z = f;
                                                a87Var.y = iIntValue;
                                                a87Var.A = so9Var.x;
                                                a87Var.B = so9Var.y;
                                                a87Var.C = ex3Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = so9Var.b;
                                            if (str6 != null) {
                                                a87Var.b = so9Var.b;
                                            }
                                            a87Var.a = Integer.toString(i21);
                                            if (so9Var.a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            a87Var.l = uya.n(str7);
                                            a87Var.m = uya.n(str9);
                                            a87Var.n = i6;
                                            a87Var.d = so9Var.Z;
                                            a87Var.e = i211117;
                                            a87Var.p = list3;
                                            a87Var.j = str3;
                                            a87Var.q = so9Var.m;
                                            so9Var.b0 = a87Var.a();
                                            so9Var.a0 = to9Var3.I1.G(so9Var.d, so9Var.e);
                                            sparseArray2.put(so9Var.d, so9Var);
                                            break;
                                        case 10:
                                            tk0 tk0VarA = tk0.a(new nmc(so9Var.a(so9Var.c)));
                                            ArrayList arrayList3 = tk0VarA.a;
                                            so9Var.c0 = tk0VarA.b;
                                            str4 = tk0VarA.l;
                                            str9 = "video/avc";
                                            list2 = arrayList3;
                                            str3 = str4;
                                            list = list2;
                                            iH = -1;
                                            i6 = -1;
                                            list3 = list;
                                            if (so9Var.P != null) {
                                                str3 = (String) zo7VarL.b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z17 = so9Var.Y;
                                            if (so9Var.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i2111112 = (z17 ? 1 : 0) | i7;
                                            a87Var = new a87();
                                            zI = uya.i(str9);
                                            Map map11 = O1;
                                            if (zI) {
                                                a87Var.E = so9Var.Q;
                                                a87Var.F = so9Var.S;
                                                a87Var.G = iH;
                                            } else if (uya.m(str9)) {
                                                if (so9Var.s == 0) {
                                                    i11 = so9Var.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = so9Var.n;
                                                    }
                                                    so9Var.q = i11;
                                                    i12 = so9Var.r;
                                                    if (i12 == -1) {
                                                        i12 = so9Var.o;
                                                    }
                                                    so9Var.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = so9Var.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (so9Var.z) {
                                                    if (so9Var.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i2111113 = so9Var.A;
                                                    int i2111114 = so9Var.C;
                                                    int i2111115 = so9Var.B;
                                                    int i2111116 = so9Var.p;
                                                    ex3Var = new ex3(i2111113, i2111114, i2111115, bArr, i2111116, i2111116);
                                                } else {
                                                    ex3Var = null;
                                                }
                                                str5 = so9Var.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (so9Var.t == 0) {
                                                    if (Float.compare(so9Var.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(so9Var.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(so9Var.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                a87Var.t = so9Var.n;
                                                a87Var.u = so9Var.o;
                                                a87Var.z = f;
                                                a87Var.y = iIntValue;
                                                a87Var.A = so9Var.x;
                                                a87Var.B = so9Var.y;
                                                a87Var.C = ex3Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = so9Var.b;
                                            if (str6 != null) {
                                                a87Var.b = so9Var.b;
                                            }
                                            a87Var.a = Integer.toString(i21);
                                            if (so9Var.a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            a87Var.l = uya.n(str7);
                                            a87Var.m = uya.n(str9);
                                            a87Var.n = i6;
                                            a87Var.d = so9Var.Z;
                                            a87Var.e = i2111112;
                                            a87Var.p = list3;
                                            a87Var.j = str3;
                                            a87Var.q = so9Var.m;
                                            so9Var.b0 = a87Var.a();
                                            so9Var.a0 = to9Var3.I1.G(so9Var.d, so9Var.e);
                                            sparseArray2.put(so9Var.d, so9Var);
                                            break;
                                        case 11:
                                            listR = c98.r(so9Var.a(str8));
                                            str9 = "application/vobsub";
                                            iH = -1;
                                            i6 = -1;
                                            list4 = listR;
                                            str3 = null;
                                            list3 = list4;
                                            if (so9Var.P != null) {
                                                str3 = (String) zo7VarL.b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z18 = so9Var.Y;
                                            if (so9Var.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i2111117 = (z18 ? 1 : 0) | i7;
                                            a87Var = new a87();
                                            zI = uya.i(str9);
                                            Map map12 = O1;
                                            if (zI) {
                                                a87Var.E = so9Var.Q;
                                                a87Var.F = so9Var.S;
                                                a87Var.G = iH;
                                            } else if (uya.m(str9)) {
                                                if (so9Var.s == 0) {
                                                    i11 = so9Var.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = so9Var.n;
                                                    }
                                                    so9Var.q = i11;
                                                    i12 = so9Var.r;
                                                    if (i12 == -1) {
                                                        i12 = so9Var.o;
                                                    }
                                                    so9Var.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = so9Var.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (so9Var.z) {
                                                    if (so9Var.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i2111118 = so9Var.A;
                                                    int i2111119 = so9Var.C;
                                                    int i21111110 = so9Var.B;
                                                    int i21111111 = so9Var.p;
                                                    ex3Var = new ex3(i2111118, i2111119, i21111110, bArr, i21111111, i21111111);
                                                } else {
                                                    ex3Var = null;
                                                }
                                                str5 = so9Var.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (so9Var.t == 0) {
                                                    if (Float.compare(so9Var.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(so9Var.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(so9Var.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                a87Var.t = so9Var.n;
                                                a87Var.u = so9Var.o;
                                                a87Var.z = f;
                                                a87Var.y = iIntValue;
                                                a87Var.A = so9Var.x;
                                                a87Var.B = so9Var.y;
                                                a87Var.C = ex3Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = so9Var.b;
                                            if (str6 != null) {
                                                a87Var.b = so9Var.b;
                                            }
                                            a87Var.a = Integer.toString(i21);
                                            if (so9Var.a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            a87Var.l = uya.n(str7);
                                            a87Var.m = uya.n(str9);
                                            a87Var.n = i6;
                                            a87Var.d = so9Var.Z;
                                            a87Var.e = i2111117;
                                            a87Var.p = list3;
                                            a87Var.j = str3;
                                            a87Var.q = so9Var.m;
                                            so9Var.b0 = a87Var.a();
                                            so9Var.a0 = to9Var3.I1.G(so9Var.d, so9Var.e);
                                            sparseArray2.put(so9Var.d, so9Var);
                                            break;
                                        case 12:
                                            str9 = "audio/vnd.dts.hd";
                                            iH = -1;
                                            i6 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (so9Var.P != null) {
                                                str3 = (String) zo7VarL.b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z19 = so9Var.Y;
                                            if (so9Var.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i21111112 = (z19 ? 1 : 0) | i7;
                                            a87Var = new a87();
                                            zI = uya.i(str9);
                                            Map map13 = O1;
                                            if (zI) {
                                                a87Var.E = so9Var.Q;
                                                a87Var.F = so9Var.S;
                                                a87Var.G = iH;
                                            } else if (uya.m(str9)) {
                                                if (so9Var.s == 0) {
                                                    i11 = so9Var.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = so9Var.n;
                                                    }
                                                    so9Var.q = i11;
                                                    i12 = so9Var.r;
                                                    if (i12 == -1) {
                                                        i12 = so9Var.o;
                                                    }
                                                    so9Var.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = so9Var.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (so9Var.z) {
                                                    if (so9Var.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i21111113 = so9Var.A;
                                                    int i21111114 = so9Var.C;
                                                    int i21111115 = so9Var.B;
                                                    int i21111116 = so9Var.p;
                                                    ex3Var = new ex3(i21111113, i21111114, i21111115, bArr, i21111116, i21111116);
                                                } else {
                                                    ex3Var = null;
                                                }
                                                str5 = so9Var.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (so9Var.t == 0) {
                                                    if (Float.compare(so9Var.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(so9Var.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(so9Var.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                a87Var.t = so9Var.n;
                                                a87Var.u = so9Var.o;
                                                a87Var.z = f;
                                                a87Var.y = iIntValue;
                                                a87Var.A = so9Var.x;
                                                a87Var.B = so9Var.y;
                                                a87Var.C = ex3Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = so9Var.b;
                                            if (str6 != null) {
                                                a87Var.b = so9Var.b;
                                            }
                                            a87Var.a = Integer.toString(i21);
                                            if (so9Var.a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            a87Var.l = uya.n(str7);
                                            a87Var.m = uya.n(str9);
                                            a87Var.n = i6;
                                            a87Var.d = so9Var.Z;
                                            a87Var.e = i21111112;
                                            a87Var.p = list3;
                                            a87Var.j = str3;
                                            a87Var.q = so9Var.m;
                                            so9Var.b0 = a87Var.a();
                                            so9Var.a0 = to9Var3.I1.G(so9Var.d, so9Var.e);
                                            sparseArray2.put(so9Var.d, so9Var);
                                            break;
                                        case 13:
                                            List listSingletonList2 = Collections.singletonList(so9Var.a(str8));
                                            byte[] bArr10 = so9Var.l;
                                            d dVarD = ax.d(new mo2(bArr10.length, bArr10), false);
                                            so9Var.S = dVarD.b;
                                            so9Var.Q = dVarD.c;
                                            str9 = "audio/mp4a-latm";
                                            list = listSingletonList2;
                                            str3 = dVarD.a;
                                            iH = -1;
                                            i6 = -1;
                                            list3 = list;
                                            if (so9Var.P != null) {
                                                str3 = (String) zo7VarL.b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z110 = so9Var.Y;
                                            if (so9Var.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i21111117 = (z110 ? 1 : 0) | i7;
                                            a87Var = new a87();
                                            zI = uya.i(str9);
                                            Map map14 = O1;
                                            if (zI) {
                                                a87Var.E = so9Var.Q;
                                                a87Var.F = so9Var.S;
                                                a87Var.G = iH;
                                            } else if (uya.m(str9)) {
                                                if (so9Var.s == 0) {
                                                    i11 = so9Var.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = so9Var.n;
                                                    }
                                                    so9Var.q = i11;
                                                    i12 = so9Var.r;
                                                    if (i12 == -1) {
                                                        i12 = so9Var.o;
                                                    }
                                                    so9Var.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = so9Var.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (so9Var.z) {
                                                    if (so9Var.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i21111118 = so9Var.A;
                                                    int i21111119 = so9Var.C;
                                                    int i211111110 = so9Var.B;
                                                    int i211111111 = so9Var.p;
                                                    ex3Var = new ex3(i21111118, i21111119, i211111110, bArr, i211111111, i211111111);
                                                } else {
                                                    ex3Var = null;
                                                }
                                                str5 = so9Var.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (so9Var.t == 0) {
                                                    if (Float.compare(so9Var.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(so9Var.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(so9Var.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                a87Var.t = so9Var.n;
                                                a87Var.u = so9Var.o;
                                                a87Var.z = f;
                                                a87Var.y = iIntValue;
                                                a87Var.A = so9Var.x;
                                                a87Var.B = so9Var.y;
                                                a87Var.C = ex3Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = so9Var.b;
                                            if (str6 != null) {
                                                a87Var.b = so9Var.b;
                                            }
                                            a87Var.a = Integer.toString(i21);
                                            if (so9Var.a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            a87Var.l = uya.n(str7);
                                            a87Var.m = uya.n(str9);
                                            a87Var.n = i6;
                                            a87Var.d = so9Var.Z;
                                            a87Var.e = i21111117;
                                            a87Var.p = list3;
                                            a87Var.j = str3;
                                            a87Var.q = so9Var.m;
                                            so9Var.b0 = a87Var.a();
                                            so9Var.a0 = to9Var3.I1.G(so9Var.d, so9Var.e);
                                            sparseArray2.put(so9Var.d, so9Var);
                                            break;
                                        case 14:
                                            str9 = "audio/ac3";
                                            iH = -1;
                                            i6 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (so9Var.P != null) {
                                                str3 = (String) zo7VarL.b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z111 = so9Var.Y;
                                            if (so9Var.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i211111112 = (z111 ? 1 : 0) | i7;
                                            a87Var = new a87();
                                            zI = uya.i(str9);
                                            Map map15 = O1;
                                            if (zI) {
                                                a87Var.E = so9Var.Q;
                                                a87Var.F = so9Var.S;
                                                a87Var.G = iH;
                                            } else if (uya.m(str9)) {
                                                if (so9Var.s == 0) {
                                                    i11 = so9Var.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = so9Var.n;
                                                    }
                                                    so9Var.q = i11;
                                                    i12 = so9Var.r;
                                                    if (i12 == -1) {
                                                        i12 = so9Var.o;
                                                    }
                                                    so9Var.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = so9Var.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (so9Var.z) {
                                                    if (so9Var.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i211111113 = so9Var.A;
                                                    int i211111114 = so9Var.C;
                                                    int i211111115 = so9Var.B;
                                                    int i211111116 = so9Var.p;
                                                    ex3Var = new ex3(i211111113, i211111114, i211111115, bArr, i211111116, i211111116);
                                                } else {
                                                    ex3Var = null;
                                                }
                                                str5 = so9Var.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (so9Var.t == 0) {
                                                    if (Float.compare(so9Var.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(so9Var.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(so9Var.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                a87Var.t = so9Var.n;
                                                a87Var.u = so9Var.o;
                                                a87Var.z = f;
                                                a87Var.y = iIntValue;
                                                a87Var.A = so9Var.x;
                                                a87Var.B = so9Var.y;
                                                a87Var.C = ex3Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = so9Var.b;
                                            if (str6 != null) {
                                                a87Var.b = so9Var.b;
                                            }
                                            a87Var.a = Integer.toString(i21);
                                            if (so9Var.a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            a87Var.l = uya.n(str7);
                                            a87Var.m = uya.n(str9);
                                            a87Var.n = i6;
                                            a87Var.d = so9Var.Z;
                                            a87Var.e = i211111112;
                                            a87Var.p = list3;
                                            a87Var.j = str3;
                                            a87Var.q = so9Var.m;
                                            so9Var.b0 = a87Var.a();
                                            so9Var.a0 = to9Var3.I1.G(so9Var.d, so9Var.e);
                                            sparseArray2.put(so9Var.d, so9Var);
                                            break;
                                        case 15:
                                        case 21:
                                            so9Var.W = true;
                                            str9 = "audio/vnd.dts";
                                            iH = -1;
                                            i6 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (so9Var.P != null) {
                                                str3 = (String) zo7VarL.b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z112 = so9Var.Y;
                                            if (so9Var.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i211111117 = (z112 ? 1 : 0) | i7;
                                            a87Var = new a87();
                                            zI = uya.i(str9);
                                            Map map16 = O1;
                                            if (zI) {
                                                a87Var.E = so9Var.Q;
                                                a87Var.F = so9Var.S;
                                                a87Var.G = iH;
                                            } else if (uya.m(str9)) {
                                                if (so9Var.s == 0) {
                                                    i11 = so9Var.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = so9Var.n;
                                                    }
                                                    so9Var.q = i11;
                                                    i12 = so9Var.r;
                                                    if (i12 == -1) {
                                                        i12 = so9Var.o;
                                                    }
                                                    so9Var.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = so9Var.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (so9Var.z) {
                                                    if (so9Var.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i211111118 = so9Var.A;
                                                    int i211111119 = so9Var.C;
                                                    int i2111111110 = so9Var.B;
                                                    int i2111111111 = so9Var.p;
                                                    ex3Var = new ex3(i211111118, i211111119, i2111111110, bArr, i2111111111, i2111111111);
                                                } else {
                                                    ex3Var = null;
                                                }
                                                str5 = so9Var.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (so9Var.t == 0) {
                                                    if (Float.compare(so9Var.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(so9Var.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(so9Var.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                a87Var.t = so9Var.n;
                                                a87Var.u = so9Var.o;
                                                a87Var.z = f;
                                                a87Var.y = iIntValue;
                                                a87Var.A = so9Var.x;
                                                a87Var.B = so9Var.y;
                                                a87Var.C = ex3Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = so9Var.b;
                                            if (str6 != null) {
                                                a87Var.b = so9Var.b;
                                            }
                                            a87Var.a = Integer.toString(i21);
                                            if (so9Var.a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            a87Var.l = uya.n(str7);
                                            a87Var.m = uya.n(str9);
                                            a87Var.n = i6;
                                            a87Var.d = so9Var.Z;
                                            a87Var.e = i211111117;
                                            a87Var.p = list3;
                                            a87Var.j = str3;
                                            a87Var.q = so9Var.m;
                                            so9Var.b0 = a87Var.a();
                                            so9Var.a0 = to9Var3.I1.G(so9Var.d, so9Var.e);
                                            sparseArray2.put(so9Var.d, so9Var);
                                            break;
                                        case 16:
                                            byte[] bArr11 = so9Var.l;
                                            listSingletonList = bArr11 == null ? null : c98.r(bArr11);
                                            str9 = "video/av01";
                                            listR = listSingletonList;
                                            iH = -1;
                                            i6 = -1;
                                            list4 = listR;
                                            str3 = null;
                                            list3 = list4;
                                            if (so9Var.P != null) {
                                                str3 = (String) zo7VarL.b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z113 = so9Var.Y;
                                            if (so9Var.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i2111111112 = (z113 ? 1 : 0) | i7;
                                            a87Var = new a87();
                                            zI = uya.i(str9);
                                            Map map17 = O1;
                                            if (zI) {
                                                a87Var.E = so9Var.Q;
                                                a87Var.F = so9Var.S;
                                                a87Var.G = iH;
                                            } else if (uya.m(str9)) {
                                                if (so9Var.s == 0) {
                                                    i11 = so9Var.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = so9Var.n;
                                                    }
                                                    so9Var.q = i11;
                                                    i12 = so9Var.r;
                                                    if (i12 == -1) {
                                                        i12 = so9Var.o;
                                                    }
                                                    so9Var.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = so9Var.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (so9Var.z) {
                                                    if (so9Var.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i2111111113 = so9Var.A;
                                                    int i2111111114 = so9Var.C;
                                                    int i2111111115 = so9Var.B;
                                                    int i2111111116 = so9Var.p;
                                                    ex3Var = new ex3(i2111111113, i2111111114, i2111111115, bArr, i2111111116, i2111111116);
                                                } else {
                                                    ex3Var = null;
                                                }
                                                str5 = so9Var.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (so9Var.t == 0) {
                                                    if (Float.compare(so9Var.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(so9Var.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(so9Var.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                a87Var.t = so9Var.n;
                                                a87Var.u = so9Var.o;
                                                a87Var.z = f;
                                                a87Var.y = iIntValue;
                                                a87Var.A = so9Var.x;
                                                a87Var.B = so9Var.y;
                                                a87Var.C = ex3Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = so9Var.b;
                                            if (str6 != null) {
                                                a87Var.b = so9Var.b;
                                            }
                                            a87Var.a = Integer.toString(i21);
                                            if (so9Var.a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            a87Var.l = uya.n(str7);
                                            a87Var.m = uya.n(str9);
                                            a87Var.n = i6;
                                            a87Var.d = so9Var.Z;
                                            a87Var.e = i2111111112;
                                            a87Var.p = list3;
                                            a87Var.j = str3;
                                            a87Var.q = so9Var.m;
                                            so9Var.b0 = a87Var.a();
                                            so9Var.a0 = to9Var3.I1.G(so9Var.d, so9Var.e);
                                            sparseArray2.put(so9Var.d, so9Var);
                                            break;
                                        case 17:
                                            str9 = "video/x-vnd.on2.vp8";
                                            iH = -1;
                                            i6 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (so9Var.P != null) {
                                                str3 = (String) zo7VarL.b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z114 = so9Var.Y;
                                            if (so9Var.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i2111111117 = (z114 ? 1 : 0) | i7;
                                            a87Var = new a87();
                                            zI = uya.i(str9);
                                            Map map18 = O1;
                                            if (zI) {
                                                a87Var.E = so9Var.Q;
                                                a87Var.F = so9Var.S;
                                                a87Var.G = iH;
                                            } else if (uya.m(str9)) {
                                                if (so9Var.s == 0) {
                                                    i11 = so9Var.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = so9Var.n;
                                                    }
                                                    so9Var.q = i11;
                                                    i12 = so9Var.r;
                                                    if (i12 == -1) {
                                                        i12 = so9Var.o;
                                                    }
                                                    so9Var.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = so9Var.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (so9Var.z) {
                                                    if (so9Var.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i2111111118 = so9Var.A;
                                                    int i2111111119 = so9Var.C;
                                                    int i21111111110 = so9Var.B;
                                                    int i21111111111 = so9Var.p;
                                                    ex3Var = new ex3(i2111111118, i2111111119, i21111111110, bArr, i21111111111, i21111111111);
                                                } else {
                                                    ex3Var = null;
                                                }
                                                str5 = so9Var.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (so9Var.t == 0) {
                                                    if (Float.compare(so9Var.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(so9Var.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(so9Var.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                a87Var.t = so9Var.n;
                                                a87Var.u = so9Var.o;
                                                a87Var.z = f;
                                                a87Var.y = iIntValue;
                                                a87Var.A = so9Var.x;
                                                a87Var.B = so9Var.y;
                                                a87Var.C = ex3Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = so9Var.b;
                                            if (str6 != null) {
                                                a87Var.b = so9Var.b;
                                            }
                                            a87Var.a = Integer.toString(i21);
                                            if (so9Var.a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            a87Var.l = uya.n(str7);
                                            a87Var.m = uya.n(str9);
                                            a87Var.n = i6;
                                            a87Var.d = so9Var.Z;
                                            a87Var.e = i2111111117;
                                            a87Var.p = list3;
                                            a87Var.j = str3;
                                            a87Var.q = so9Var.m;
                                            so9Var.b0 = a87Var.a();
                                            so9Var.a0 = to9Var3.I1.G(so9Var.d, so9Var.e);
                                            sparseArray2.put(so9Var.d, so9Var);
                                            break;
                                        case 18:
                                            byte[] bArr12 = so9Var.l;
                                            listSingletonList = bArr12 == null ? null : c98.r(bArr12);
                                            str9 = "video/x-vnd.on2.vp9";
                                            listR = listSingletonList;
                                            iH = -1;
                                            i6 = -1;
                                            list4 = listR;
                                            str3 = null;
                                            list3 = list4;
                                            if (so9Var.P != null) {
                                                str3 = (String) zo7VarL.b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z115 = so9Var.Y;
                                            if (so9Var.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i21111111112 = (z115 ? 1 : 0) | i7;
                                            a87Var = new a87();
                                            zI = uya.i(str9);
                                            Map map19 = O1;
                                            if (zI) {
                                                a87Var.E = so9Var.Q;
                                                a87Var.F = so9Var.S;
                                                a87Var.G = iH;
                                            } else if (uya.m(str9)) {
                                                if (so9Var.s == 0) {
                                                    i11 = so9Var.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = so9Var.n;
                                                    }
                                                    so9Var.q = i11;
                                                    i12 = so9Var.r;
                                                    if (i12 == -1) {
                                                        i12 = so9Var.o;
                                                    }
                                                    so9Var.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = so9Var.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (so9Var.z) {
                                                    if (so9Var.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i21111111113 = so9Var.A;
                                                    int i21111111114 = so9Var.C;
                                                    int i21111111115 = so9Var.B;
                                                    int i21111111116 = so9Var.p;
                                                    ex3Var = new ex3(i21111111113, i21111111114, i21111111115, bArr, i21111111116, i21111111116);
                                                } else {
                                                    ex3Var = null;
                                                }
                                                str5 = so9Var.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (so9Var.t == 0) {
                                                    if (Float.compare(so9Var.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(so9Var.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(so9Var.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                a87Var.t = so9Var.n;
                                                a87Var.u = so9Var.o;
                                                a87Var.z = f;
                                                a87Var.y = iIntValue;
                                                a87Var.A = so9Var.x;
                                                a87Var.B = so9Var.y;
                                                a87Var.C = ex3Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = so9Var.b;
                                            if (str6 != null) {
                                                a87Var.b = so9Var.b;
                                            }
                                            a87Var.a = Integer.toString(i21);
                                            if (so9Var.a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            a87Var.l = uya.n(str7);
                                            a87Var.m = uya.n(str9);
                                            a87Var.n = i6;
                                            a87Var.d = so9Var.Z;
                                            a87Var.e = i21111111112;
                                            a87Var.p = list3;
                                            a87Var.j = str3;
                                            a87Var.q = so9Var.m;
                                            so9Var.b0 = a87Var.a();
                                            so9Var.a0 = to9Var3.I1.G(so9Var.d, so9Var.e);
                                            sparseArray2.put(so9Var.d, so9Var);
                                            break;
                                        case 19:
                                            str9 = "application/pgs";
                                            iH = -1;
                                            i6 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (so9Var.P != null) {
                                                str3 = (String) zo7VarL.b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z116 = so9Var.Y;
                                            if (so9Var.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i21111111117 = (z116 ? 1 : 0) | i7;
                                            a87Var = new a87();
                                            zI = uya.i(str9);
                                            Map map110 = O1;
                                            if (zI) {
                                                a87Var.E = so9Var.Q;
                                                a87Var.F = so9Var.S;
                                                a87Var.G = iH;
                                            } else if (uya.m(str9)) {
                                                if (so9Var.s == 0) {
                                                    i11 = so9Var.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = so9Var.n;
                                                    }
                                                    so9Var.q = i11;
                                                    i12 = so9Var.r;
                                                    if (i12 == -1) {
                                                        i12 = so9Var.o;
                                                    }
                                                    so9Var.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = so9Var.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (so9Var.z) {
                                                    if (so9Var.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i21111111118 = so9Var.A;
                                                    int i21111111119 = so9Var.C;
                                                    int i211111111110 = so9Var.B;
                                                    int i211111111111 = so9Var.p;
                                                    ex3Var = new ex3(i21111111118, i21111111119, i211111111110, bArr, i211111111111, i211111111111);
                                                } else {
                                                    ex3Var = null;
                                                }
                                                str5 = so9Var.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (so9Var.t == 0) {
                                                    if (Float.compare(so9Var.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(so9Var.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(so9Var.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                a87Var.t = so9Var.n;
                                                a87Var.u = so9Var.o;
                                                a87Var.z = f;
                                                a87Var.y = iIntValue;
                                                a87Var.A = so9Var.x;
                                                a87Var.B = so9Var.y;
                                                a87Var.C = ex3Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = so9Var.b;
                                            if (str6 != null) {
                                                a87Var.b = so9Var.b;
                                            }
                                            a87Var.a = Integer.toString(i21);
                                            if (so9Var.a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            a87Var.l = uya.n(str7);
                                            a87Var.m = uya.n(str9);
                                            a87Var.n = i6;
                                            a87Var.d = so9Var.Z;
                                            a87Var.e = i21111111117;
                                            a87Var.p = list3;
                                            a87Var.j = str3;
                                            a87Var.q = so9Var.m;
                                            so9Var.b0 = a87Var.a();
                                            so9Var.a0 = to9Var3.I1.G(so9Var.d, so9Var.e);
                                            sparseArray2.put(so9Var.d, so9Var);
                                            break;
                                        case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                                            iH = -1;
                                            i6 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (so9Var.P != null) {
                                                str3 = (String) zo7VarL.b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z117 = so9Var.Y;
                                            if (so9Var.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i211111111112 = (z117 ? 1 : 0) | i7;
                                            a87Var = new a87();
                                            zI = uya.i(str9);
                                            Map map111 = O1;
                                            if (zI) {
                                                a87Var.E = so9Var.Q;
                                                a87Var.F = so9Var.S;
                                                a87Var.G = iH;
                                            } else if (uya.m(str9)) {
                                                if (so9Var.s == 0) {
                                                    i11 = so9Var.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = so9Var.n;
                                                    }
                                                    so9Var.q = i11;
                                                    i12 = so9Var.r;
                                                    if (i12 == -1) {
                                                        i12 = so9Var.o;
                                                    }
                                                    so9Var.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = so9Var.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (so9Var.z) {
                                                    if (so9Var.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i211111111113 = so9Var.A;
                                                    int i211111111114 = so9Var.C;
                                                    int i211111111115 = so9Var.B;
                                                    int i211111111116 = so9Var.p;
                                                    ex3Var = new ex3(i211111111113, i211111111114, i211111111115, bArr, i211111111116, i211111111116);
                                                } else {
                                                    ex3Var = null;
                                                }
                                                str5 = so9Var.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (so9Var.t == 0) {
                                                    if (Float.compare(so9Var.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(so9Var.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(so9Var.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                a87Var.t = so9Var.n;
                                                a87Var.u = so9Var.o;
                                                a87Var.z = f;
                                                a87Var.y = iIntValue;
                                                a87Var.A = so9Var.x;
                                                a87Var.B = so9Var.y;
                                                a87Var.C = ex3Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = so9Var.b;
                                            if (str6 != null) {
                                                a87Var.b = so9Var.b;
                                            }
                                            a87Var.a = Integer.toString(i21);
                                            if (so9Var.a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            a87Var.l = uya.n(str7);
                                            a87Var.m = uya.n(str9);
                                            a87Var.n = i6;
                                            a87Var.d = so9Var.Z;
                                            a87Var.e = i211111111112;
                                            a87Var.p = list3;
                                            a87Var.j = str3;
                                            a87Var.q = so9Var.m;
                                            so9Var.b0 = a87Var.a();
                                            so9Var.a0 = to9Var3.I1.G(so9Var.d, so9Var.e);
                                            sparseArray2.put(so9Var.d, so9Var);
                                            break;
                                        case 22:
                                            if (so9Var.R == 32) {
                                                str9 = "audio/raw";
                                                iH = 4;
                                            } else {
                                                lvb.G0("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + so9Var.R + ". Setting mimeType to audio/x-unknown");
                                                str9 = "audio/x-unknown";
                                                iH = -1;
                                            }
                                            i6 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (so9Var.P != null) {
                                                str3 = (String) zo7VarL.b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z118 = so9Var.Y;
                                            if (so9Var.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i211111111117 = (z118 ? 1 : 0) | i7;
                                            a87Var = new a87();
                                            zI = uya.i(str9);
                                            Map map112 = O1;
                                            if (zI) {
                                                a87Var.E = so9Var.Q;
                                                a87Var.F = so9Var.S;
                                                a87Var.G = iH;
                                            } else if (uya.m(str9)) {
                                                if (so9Var.s == 0) {
                                                    i11 = so9Var.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = so9Var.n;
                                                    }
                                                    so9Var.q = i11;
                                                    i12 = so9Var.r;
                                                    if (i12 == -1) {
                                                        i12 = so9Var.o;
                                                    }
                                                    so9Var.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = so9Var.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (so9Var.z) {
                                                    if (so9Var.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i211111111118 = so9Var.A;
                                                    int i211111111119 = so9Var.C;
                                                    int i2111111111110 = so9Var.B;
                                                    int i2111111111111 = so9Var.p;
                                                    ex3Var = new ex3(i211111111118, i211111111119, i2111111111110, bArr, i2111111111111, i2111111111111);
                                                } else {
                                                    ex3Var = null;
                                                }
                                                str5 = so9Var.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (so9Var.t == 0) {
                                                    if (Float.compare(so9Var.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(so9Var.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(so9Var.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                a87Var.t = so9Var.n;
                                                a87Var.u = so9Var.o;
                                                a87Var.z = f;
                                                a87Var.y = iIntValue;
                                                a87Var.A = so9Var.x;
                                                a87Var.B = so9Var.y;
                                                a87Var.C = ex3Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = so9Var.b;
                                            if (str6 != null) {
                                                a87Var.b = so9Var.b;
                                            }
                                            a87Var.a = Integer.toString(i21);
                                            if (so9Var.a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            a87Var.l = uya.n(str7);
                                            a87Var.m = uya.n(str9);
                                            a87Var.n = i6;
                                            a87Var.d = so9Var.Z;
                                            a87Var.e = i211111111117;
                                            a87Var.p = list3;
                                            a87Var.j = str3;
                                            a87Var.q = so9Var.m;
                                            so9Var.b0 = a87Var.a();
                                            so9Var.a0 = to9Var3.I1.G(so9Var.d, so9Var.e);
                                            sparseArray2.put(so9Var.d, so9Var);
                                            break;
                                        case 23:
                                            int i43 = so9Var.R;
                                            if (i43 == 8) {
                                                str9 = "audio/raw";
                                                iH = 3;
                                            } else {
                                                if (i43 == 16) {
                                                    iH = 268435456;
                                                } else if (i43 == 24) {
                                                    iH = 1342177280;
                                                } else if (i43 == 32) {
                                                    iH = 1610612736;
                                                } else {
                                                    lvb.G0("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + so9Var.R + ". Setting mimeType to audio/x-unknown");
                                                    str9 = "audio/x-unknown";
                                                    iH = -1;
                                                }
                                                str9 = "audio/raw";
                                            }
                                            i6 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (so9Var.P != null) {
                                                str3 = (String) zo7VarL.b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z119 = so9Var.Y;
                                            if (so9Var.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i2111111111112 = (z119 ? 1 : 0) | i7;
                                            a87Var = new a87();
                                            zI = uya.i(str9);
                                            Map map113 = O1;
                                            if (zI) {
                                                a87Var.E = so9Var.Q;
                                                a87Var.F = so9Var.S;
                                                a87Var.G = iH;
                                            } else if (uya.m(str9)) {
                                                if (so9Var.s == 0) {
                                                    i11 = so9Var.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = so9Var.n;
                                                    }
                                                    so9Var.q = i11;
                                                    i12 = so9Var.r;
                                                    if (i12 == -1) {
                                                        i12 = so9Var.o;
                                                    }
                                                    so9Var.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = so9Var.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (so9Var.z) {
                                                    if (so9Var.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i2111111111113 = so9Var.A;
                                                    int i2111111111114 = so9Var.C;
                                                    int i2111111111115 = so9Var.B;
                                                    int i2111111111116 = so9Var.p;
                                                    ex3Var = new ex3(i2111111111113, i2111111111114, i2111111111115, bArr, i2111111111116, i2111111111116);
                                                } else {
                                                    ex3Var = null;
                                                }
                                                str5 = so9Var.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (so9Var.t == 0) {
                                                    if (Float.compare(so9Var.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(so9Var.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(so9Var.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                a87Var.t = so9Var.n;
                                                a87Var.u = so9Var.o;
                                                a87Var.z = f;
                                                a87Var.y = iIntValue;
                                                a87Var.A = so9Var.x;
                                                a87Var.B = so9Var.y;
                                                a87Var.C = ex3Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = so9Var.b;
                                            if (str6 != null) {
                                                a87Var.b = so9Var.b;
                                            }
                                            a87Var.a = Integer.toString(i21);
                                            if (so9Var.a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            a87Var.l = uya.n(str7);
                                            a87Var.m = uya.n(str9);
                                            a87Var.n = i6;
                                            a87Var.d = so9Var.Z;
                                            a87Var.e = i2111111111112;
                                            a87Var.p = list3;
                                            a87Var.j = str3;
                                            a87Var.q = so9Var.m;
                                            so9Var.b0 = a87Var.a();
                                            so9Var.a0 = to9Var3.I1.G(so9Var.d, so9Var.e);
                                            sparseArray2.put(so9Var.d, so9Var);
                                            break;
                                        case 24:
                                            int i44 = so9Var.R;
                                            String str11 = vqi.a;
                                            iH = vqi.H(i44, ByteOrder.LITTLE_ENDIAN);
                                            if (iH == 0) {
                                                lvb.G0("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + so9Var.R + ". Setting mimeType to audio/x-unknown");
                                                str9 = "audio/x-unknown";
                                                iH = -1;
                                            } else {
                                                str9 = "audio/raw";
                                            }
                                            i6 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (so9Var.P != null) {
                                                str3 = (String) zo7VarL.b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z1110 = so9Var.Y;
                                            if (so9Var.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i2111111111117 = (z1110 ? 1 : 0) | i7;
                                            a87Var = new a87();
                                            zI = uya.i(str9);
                                            Map map114 = O1;
                                            if (zI) {
                                                a87Var.E = so9Var.Q;
                                                a87Var.F = so9Var.S;
                                                a87Var.G = iH;
                                            } else if (uya.m(str9)) {
                                                if (so9Var.s == 0) {
                                                    i11 = so9Var.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = so9Var.n;
                                                    }
                                                    so9Var.q = i11;
                                                    i12 = so9Var.r;
                                                    if (i12 == -1) {
                                                        i12 = so9Var.o;
                                                    }
                                                    so9Var.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = so9Var.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (so9Var.z) {
                                                    if (so9Var.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i2111111111118 = so9Var.A;
                                                    int i2111111111119 = so9Var.C;
                                                    int i21111111111110 = so9Var.B;
                                                    int i21111111111111 = so9Var.p;
                                                    ex3Var = new ex3(i2111111111118, i2111111111119, i21111111111110, bArr, i21111111111111, i21111111111111);
                                                } else {
                                                    ex3Var = null;
                                                }
                                                str5 = so9Var.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (so9Var.t == 0) {
                                                    if (Float.compare(so9Var.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(so9Var.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(so9Var.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                a87Var.t = so9Var.n;
                                                a87Var.u = so9Var.o;
                                                a87Var.z = f;
                                                a87Var.y = iIntValue;
                                                a87Var.A = so9Var.x;
                                                a87Var.B = so9Var.y;
                                                a87Var.C = ex3Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = so9Var.b;
                                            if (str6 != null) {
                                                a87Var.b = so9Var.b;
                                            }
                                            a87Var.a = Integer.toString(i21);
                                            if (so9Var.a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            a87Var.l = uya.n(str7);
                                            a87Var.m = uya.n(str9);
                                            a87Var.n = i6;
                                            a87Var.d = so9Var.Z;
                                            a87Var.e = i2111111111117;
                                            a87Var.p = list3;
                                            a87Var.j = str3;
                                            a87Var.q = so9Var.m;
                                            so9Var.b0 = a87Var.a();
                                            so9Var.a0 = to9Var3.I1.G(so9Var.d, so9Var.e);
                                            sparseArray2.put(so9Var.d, so9Var);
                                            break;
                                        case 25:
                                        case 26:
                                            listR = c98.s(K1, so9Var.a(str8));
                                            str9 = "text/x-ssa";
                                            iH = -1;
                                            i6 = -1;
                                            list4 = listR;
                                            str3 = null;
                                            list3 = list4;
                                            if (so9Var.P != null) {
                                                str3 = (String) zo7VarL.b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z1111 = so9Var.Y;
                                            if (so9Var.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i21111111111112 = (z1111 ? 1 : 0) | i7;
                                            a87Var = new a87();
                                            zI = uya.i(str9);
                                            Map map115 = O1;
                                            if (zI) {
                                                a87Var.E = so9Var.Q;
                                                a87Var.F = so9Var.S;
                                                a87Var.G = iH;
                                            } else if (uya.m(str9)) {
                                                if (so9Var.s == 0) {
                                                    i11 = so9Var.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = so9Var.n;
                                                    }
                                                    so9Var.q = i11;
                                                    i12 = so9Var.r;
                                                    if (i12 == -1) {
                                                        i12 = so9Var.o;
                                                    }
                                                    so9Var.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = so9Var.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (so9Var.z) {
                                                    if (so9Var.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i21111111111113 = so9Var.A;
                                                    int i21111111111114 = so9Var.C;
                                                    int i21111111111115 = so9Var.B;
                                                    int i21111111111116 = so9Var.p;
                                                    ex3Var = new ex3(i21111111111113, i21111111111114, i21111111111115, bArr, i21111111111116, i21111111111116);
                                                } else {
                                                    ex3Var = null;
                                                }
                                                str5 = so9Var.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (so9Var.t == 0) {
                                                    if (Float.compare(so9Var.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(so9Var.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(so9Var.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                a87Var.t = so9Var.n;
                                                a87Var.u = so9Var.o;
                                                a87Var.z = f;
                                                a87Var.y = iIntValue;
                                                a87Var.A = so9Var.x;
                                                a87Var.B = so9Var.y;
                                                a87Var.C = ex3Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = so9Var.b;
                                            if (str6 != null) {
                                                a87Var.b = so9Var.b;
                                            }
                                            a87Var.a = Integer.toString(i21);
                                            if (so9Var.a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            a87Var.l = uya.n(str7);
                                            a87Var.m = uya.n(str9);
                                            a87Var.n = i6;
                                            a87Var.d = so9Var.Z;
                                            a87Var.e = i21111111111112;
                                            a87Var.p = list3;
                                            a87Var.j = str3;
                                            a87Var.q = so9Var.m;
                                            so9Var.b0 = a87Var.a();
                                            so9Var.a0 = to9Var3.I1.G(so9Var.d, so9Var.e);
                                            sparseArray2.put(so9Var.d, so9Var);
                                            break;
                                        case 27:
                                            yu7 yu7VarA = yu7.a(new nmc(so9Var.a(so9Var.c)), false, null);
                                            List list6 = yu7VarA.a;
                                            so9Var.c0 = yu7VarA.b;
                                            str4 = yu7VarA.n;
                                            str9 = "video/hevc";
                                            list2 = list6;
                                            str3 = str4;
                                            list = list2;
                                            iH = -1;
                                            i6 = -1;
                                            list3 = list;
                                            if (so9Var.P != null) {
                                                str3 = (String) zo7VarL.b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z1112 = so9Var.Y;
                                            if (so9Var.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i21111111111117 = (z1112 ? 1 : 0) | i7;
                                            a87Var = new a87();
                                            zI = uya.i(str9);
                                            Map map116 = O1;
                                            if (zI) {
                                                a87Var.E = so9Var.Q;
                                                a87Var.F = so9Var.S;
                                                a87Var.G = iH;
                                            } else if (uya.m(str9)) {
                                                if (so9Var.s == 0) {
                                                    i11 = so9Var.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = so9Var.n;
                                                    }
                                                    so9Var.q = i11;
                                                    i12 = so9Var.r;
                                                    if (i12 == -1) {
                                                        i12 = so9Var.o;
                                                    }
                                                    so9Var.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = so9Var.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (so9Var.z) {
                                                    if (so9Var.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i21111111111118 = so9Var.A;
                                                    int i21111111111119 = so9Var.C;
                                                    int i211111111111110 = so9Var.B;
                                                    int i211111111111111 = so9Var.p;
                                                    ex3Var = new ex3(i21111111111118, i21111111111119, i211111111111110, bArr, i211111111111111, i211111111111111);
                                                } else {
                                                    ex3Var = null;
                                                }
                                                str5 = so9Var.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (so9Var.t == 0) {
                                                    if (Float.compare(so9Var.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(so9Var.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(so9Var.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                a87Var.t = so9Var.n;
                                                a87Var.u = so9Var.o;
                                                a87Var.z = f;
                                                a87Var.y = iIntValue;
                                                a87Var.A = so9Var.x;
                                                a87Var.B = so9Var.y;
                                                a87Var.C = ex3Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = so9Var.b;
                                            if (str6 != null) {
                                                a87Var.b = so9Var.b;
                                            }
                                            a87Var.a = Integer.toString(i21);
                                            if (so9Var.a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            a87Var.l = uya.n(str7);
                                            a87Var.m = uya.n(str9);
                                            a87Var.n = i6;
                                            a87Var.d = so9Var.Z;
                                            a87Var.e = i21111111111117;
                                            a87Var.p = list3;
                                            a87Var.j = str3;
                                            a87Var.q = so9Var.m;
                                            so9Var.b0 = a87Var.a();
                                            so9Var.a0 = to9Var3.I1.G(so9Var.d, so9Var.e);
                                            sparseArray2.put(so9Var.d, so9Var);
                                            break;
                                        case 28:
                                            str9 = "text/vtt";
                                            iH = -1;
                                            i6 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (so9Var.P != null) {
                                                str3 = (String) zo7VarL.b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z1113 = so9Var.Y;
                                            if (so9Var.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i211111111111112 = (z1113 ? 1 : 0) | i7;
                                            a87Var = new a87();
                                            zI = uya.i(str9);
                                            Map map117 = O1;
                                            if (zI) {
                                                a87Var.E = so9Var.Q;
                                                a87Var.F = so9Var.S;
                                                a87Var.G = iH;
                                            } else if (uya.m(str9)) {
                                                if (so9Var.s == 0) {
                                                    i11 = so9Var.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = so9Var.n;
                                                    }
                                                    so9Var.q = i11;
                                                    i12 = so9Var.r;
                                                    if (i12 == -1) {
                                                        i12 = so9Var.o;
                                                    }
                                                    so9Var.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = so9Var.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (so9Var.z) {
                                                    if (so9Var.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i211111111111113 = so9Var.A;
                                                    int i211111111111114 = so9Var.C;
                                                    int i211111111111115 = so9Var.B;
                                                    int i211111111111116 = so9Var.p;
                                                    ex3Var = new ex3(i211111111111113, i211111111111114, i211111111111115, bArr, i211111111111116, i211111111111116);
                                                } else {
                                                    ex3Var = null;
                                                }
                                                str5 = so9Var.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (so9Var.t == 0) {
                                                    if (Float.compare(so9Var.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(so9Var.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(so9Var.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                a87Var.t = so9Var.n;
                                                a87Var.u = so9Var.o;
                                                a87Var.z = f;
                                                a87Var.y = iIntValue;
                                                a87Var.A = so9Var.x;
                                                a87Var.B = so9Var.y;
                                                a87Var.C = ex3Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = so9Var.b;
                                            if (str6 != null) {
                                                a87Var.b = so9Var.b;
                                            }
                                            a87Var.a = Integer.toString(i21);
                                            if (so9Var.a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            a87Var.l = uya.n(str7);
                                            a87Var.m = uya.n(str9);
                                            a87Var.n = i6;
                                            a87Var.d = so9Var.Z;
                                            a87Var.e = i211111111111112;
                                            a87Var.p = list3;
                                            a87Var.j = str3;
                                            a87Var.q = so9Var.m;
                                            so9Var.b0 = a87Var.a();
                                            so9Var.a0 = to9Var3.I1.G(so9Var.d, so9Var.e);
                                            sparseArray2.put(so9Var.d, so9Var);
                                            break;
                                        case 29:
                                            str9 = "application/x-subrip";
                                            iH = -1;
                                            i6 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (so9Var.P != null) {
                                                str3 = (String) zo7VarL.b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z1114 = so9Var.Y;
                                            if (so9Var.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i211111111111117 = (z1114 ? 1 : 0) | i7;
                                            a87Var = new a87();
                                            zI = uya.i(str9);
                                            Map map118 = O1;
                                            if (zI) {
                                                a87Var.E = so9Var.Q;
                                                a87Var.F = so9Var.S;
                                                a87Var.G = iH;
                                            } else if (uya.m(str9)) {
                                                if (so9Var.s == 0) {
                                                    i11 = so9Var.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = so9Var.n;
                                                    }
                                                    so9Var.q = i11;
                                                    i12 = so9Var.r;
                                                    if (i12 == -1) {
                                                        i12 = so9Var.o;
                                                    }
                                                    so9Var.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = so9Var.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (so9Var.z) {
                                                    if (so9Var.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i211111111111118 = so9Var.A;
                                                    int i211111111111119 = so9Var.C;
                                                    int i2111111111111110 = so9Var.B;
                                                    int i2111111111111111 = so9Var.p;
                                                    ex3Var = new ex3(i211111111111118, i211111111111119, i2111111111111110, bArr, i2111111111111111, i2111111111111111);
                                                } else {
                                                    ex3Var = null;
                                                }
                                                str5 = so9Var.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (so9Var.t == 0) {
                                                    if (Float.compare(so9Var.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(so9Var.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(so9Var.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                a87Var.t = so9Var.n;
                                                a87Var.u = so9Var.o;
                                                a87Var.z = f;
                                                a87Var.y = iIntValue;
                                                a87Var.A = so9Var.x;
                                                a87Var.B = so9Var.y;
                                                a87Var.C = ex3Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = so9Var.b;
                                            if (str6 != null) {
                                                a87Var.b = so9Var.b;
                                            }
                                            a87Var.a = Integer.toString(i21);
                                            if (so9Var.a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            a87Var.l = uya.n(str7);
                                            a87Var.m = uya.n(str9);
                                            a87Var.n = i6;
                                            a87Var.d = so9Var.Z;
                                            a87Var.e = i211111111111117;
                                            a87Var.p = list3;
                                            a87Var.j = str3;
                                            a87Var.q = so9Var.m;
                                            so9Var.b0 = a87Var.a();
                                            so9Var.a0 = to9Var3.I1.G(so9Var.d, so9Var.e);
                                            sparseArray2.put(so9Var.d, so9Var);
                                            break;
                                        case 30:
                                            str9 = "video/mpeg2";
                                            iH = -1;
                                            i6 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (so9Var.P != null) {
                                                str3 = (String) zo7VarL.b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z1115 = so9Var.Y;
                                            if (so9Var.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i2111111111111112 = (z1115 ? 1 : 0) | i7;
                                            a87Var = new a87();
                                            zI = uya.i(str9);
                                            Map map119 = O1;
                                            if (zI) {
                                                a87Var.E = so9Var.Q;
                                                a87Var.F = so9Var.S;
                                                a87Var.G = iH;
                                            } else if (uya.m(str9)) {
                                                if (so9Var.s == 0) {
                                                    i11 = so9Var.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = so9Var.n;
                                                    }
                                                    so9Var.q = i11;
                                                    i12 = so9Var.r;
                                                    if (i12 == -1) {
                                                        i12 = so9Var.o;
                                                    }
                                                    so9Var.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = so9Var.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (so9Var.z) {
                                                    if (so9Var.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i2111111111111113 = so9Var.A;
                                                    int i2111111111111114 = so9Var.C;
                                                    int i2111111111111115 = so9Var.B;
                                                    int i2111111111111116 = so9Var.p;
                                                    ex3Var = new ex3(i2111111111111113, i2111111111111114, i2111111111111115, bArr, i2111111111111116, i2111111111111116);
                                                } else {
                                                    ex3Var = null;
                                                }
                                                str5 = so9Var.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (so9Var.t == 0) {
                                                    if (Float.compare(so9Var.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(so9Var.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(so9Var.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                a87Var.t = so9Var.n;
                                                a87Var.u = so9Var.o;
                                                a87Var.z = f;
                                                a87Var.y = iIntValue;
                                                a87Var.A = so9Var.x;
                                                a87Var.B = so9Var.y;
                                                a87Var.C = ex3Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = so9Var.b;
                                            if (str6 != null) {
                                                a87Var.b = so9Var.b;
                                            }
                                            a87Var.a = Integer.toString(i21);
                                            if (so9Var.a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            a87Var.l = uya.n(str7);
                                            a87Var.m = uya.n(str9);
                                            a87Var.n = i6;
                                            a87Var.d = so9Var.Z;
                                            a87Var.e = i2111111111111112;
                                            a87Var.p = list3;
                                            a87Var.j = str3;
                                            a87Var.q = so9Var.m;
                                            so9Var.b0 = a87Var.a();
                                            so9Var.a0 = to9Var3.I1.G(so9Var.d, so9Var.e);
                                            sparseArray2.put(so9Var.d, so9Var);
                                            break;
                                        case 31:
                                            str9 = "audio/eac3";
                                            iH = -1;
                                            i6 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (so9Var.P != null) {
                                                str3 = (String) zo7VarL.b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z1116 = so9Var.Y;
                                            if (so9Var.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i2111111111111117 = (z1116 ? 1 : 0) | i7;
                                            a87Var = new a87();
                                            zI = uya.i(str9);
                                            Map map1110 = O1;
                                            if (zI) {
                                                a87Var.E = so9Var.Q;
                                                a87Var.F = so9Var.S;
                                                a87Var.G = iH;
                                            } else if (uya.m(str9)) {
                                                if (so9Var.s == 0) {
                                                    i11 = so9Var.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = so9Var.n;
                                                    }
                                                    so9Var.q = i11;
                                                    i12 = so9Var.r;
                                                    if (i12 == -1) {
                                                        i12 = so9Var.o;
                                                    }
                                                    so9Var.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = so9Var.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (so9Var.z) {
                                                    if (so9Var.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i2111111111111118 = so9Var.A;
                                                    int i2111111111111119 = so9Var.C;
                                                    int i21111111111111110 = so9Var.B;
                                                    int i21111111111111111 = so9Var.p;
                                                    ex3Var = new ex3(i2111111111111118, i2111111111111119, i21111111111111110, bArr, i21111111111111111, i21111111111111111);
                                                } else {
                                                    ex3Var = null;
                                                }
                                                str5 = so9Var.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (so9Var.t == 0) {
                                                    if (Float.compare(so9Var.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(so9Var.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(so9Var.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                a87Var.t = so9Var.n;
                                                a87Var.u = so9Var.o;
                                                a87Var.z = f;
                                                a87Var.y = iIntValue;
                                                a87Var.A = so9Var.x;
                                                a87Var.B = so9Var.y;
                                                a87Var.C = ex3Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = so9Var.b;
                                            if (str6 != null) {
                                                a87Var.b = so9Var.b;
                                            }
                                            a87Var.a = Integer.toString(i21);
                                            if (so9Var.a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            a87Var.l = uya.n(str7);
                                            a87Var.m = uya.n(str9);
                                            a87Var.n = i6;
                                            a87Var.d = so9Var.Z;
                                            a87Var.e = i2111111111111117;
                                            a87Var.p = list3;
                                            a87Var.j = str3;
                                            a87Var.q = so9Var.m;
                                            so9Var.b0 = a87Var.a();
                                            so9Var.a0 = to9Var3.I1.G(so9Var.d, so9Var.e);
                                            sparseArray2.put(so9Var.d, so9Var);
                                            break;
                                        case 32:
                                            listSingletonList = Collections.singletonList(so9Var.a(str8));
                                            str9 = "audio/flac";
                                            listR = listSingletonList;
                                            iH = -1;
                                            i6 = -1;
                                            list4 = listR;
                                            str3 = null;
                                            list3 = list4;
                                            if (so9Var.P != null) {
                                                str3 = (String) zo7VarL.b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z1117 = so9Var.Y;
                                            if (so9Var.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i21111111111111112 = (z1117 ? 1 : 0) | i7;
                                            a87Var = new a87();
                                            zI = uya.i(str9);
                                            Map map1111 = O1;
                                            if (zI) {
                                                a87Var.E = so9Var.Q;
                                                a87Var.F = so9Var.S;
                                                a87Var.G = iH;
                                            } else if (uya.m(str9)) {
                                                if (so9Var.s == 0) {
                                                    i11 = so9Var.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = so9Var.n;
                                                    }
                                                    so9Var.q = i11;
                                                    i12 = so9Var.r;
                                                    if (i12 == -1) {
                                                        i12 = so9Var.o;
                                                    }
                                                    so9Var.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = so9Var.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (so9Var.z) {
                                                    if (so9Var.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i21111111111111113 = so9Var.A;
                                                    int i21111111111111114 = so9Var.C;
                                                    int i21111111111111115 = so9Var.B;
                                                    int i21111111111111116 = so9Var.p;
                                                    ex3Var = new ex3(i21111111111111113, i21111111111111114, i21111111111111115, bArr, i21111111111111116, i21111111111111116);
                                                } else {
                                                    ex3Var = null;
                                                }
                                                str5 = so9Var.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (so9Var.t == 0) {
                                                    if (Float.compare(so9Var.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(so9Var.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(so9Var.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                a87Var.t = so9Var.n;
                                                a87Var.u = so9Var.o;
                                                a87Var.z = f;
                                                a87Var.y = iIntValue;
                                                a87Var.A = so9Var.x;
                                                a87Var.B = so9Var.y;
                                                a87Var.C = ex3Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = so9Var.b;
                                            if (str6 != null) {
                                                a87Var.b = so9Var.b;
                                            }
                                            a87Var.a = Integer.toString(i21);
                                            if (so9Var.a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            a87Var.l = uya.n(str7);
                                            a87Var.m = uya.n(str9);
                                            a87Var.n = i6;
                                            a87Var.d = so9Var.Z;
                                            a87Var.e = i21111111111111112;
                                            a87Var.p = list3;
                                            a87Var.j = str3;
                                            a87Var.q = so9Var.m;
                                            so9Var.b0 = a87Var.a();
                                            so9Var.a0 = to9Var3.I1.G(so9Var.d, so9Var.e);
                                            sparseArray2.put(so9Var.d, so9Var);
                                            break;
                                        case 33:
                                            ArrayList arrayList4 = new ArrayList(3);
                                            arrayList4.add(so9Var.a(so9Var.c));
                                            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                                            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                                            arrayList4.add(byteBufferAllocate.order(byteOrder).putLong(so9Var.T).array());
                                            arrayList4.add(ByteBuffer.allocate(8).order(byteOrder).putLong(so9Var.U).array());
                                            str9 = "audio/opus";
                                            i6 = 5760;
                                            arrayList = arrayList4;
                                            iH = -1;
                                            list4 = arrayList;
                                            str3 = null;
                                            list3 = list4;
                                            if (so9Var.P != null) {
                                                str3 = (String) zo7VarL.b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z1118 = so9Var.Y;
                                            if (so9Var.X) {
                                                i7 = 2;
                                            } else {
                                                i7 = 0;
                                            }
                                            int i21111111111111117 = (z1118 ? 1 : 0) | i7;
                                            a87Var = new a87();
                                            zI = uya.i(str9);
                                            Map map1112 = O1;
                                            if (zI) {
                                                a87Var.E = so9Var.Q;
                                                a87Var.F = so9Var.S;
                                                a87Var.G = iH;
                                            } else if (uya.m(str9)) {
                                                if (so9Var.s == 0) {
                                                    i11 = so9Var.q;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = so9Var.n;
                                                    }
                                                    so9Var.q = i11;
                                                    i12 = so9Var.r;
                                                    if (i12 == -1) {
                                                        i12 = so9Var.o;
                                                    }
                                                    so9Var.r = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = so9Var.q;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (so9Var.z) {
                                                    if (so9Var.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i21111111111111118 = so9Var.A;
                                                    int i21111111111111119 = so9Var.C;
                                                    int i211111111111111110 = so9Var.B;
                                                    int i211111111111111111 = so9Var.p;
                                                    ex3Var = new ex3(i21111111111111118, i21111111111111119, i211111111111111110, bArr, i211111111111111111, i211111111111111111);
                                                } else {
                                                    ex3Var = null;
                                                }
                                                str5 = so9Var.b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (so9Var.t == 0) {
                                                    if (Float.compare(so9Var.w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(so9Var.w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(so9Var.w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                a87Var.t = so9Var.n;
                                                a87Var.u = so9Var.o;
                                                a87Var.z = f;
                                                a87Var.y = iIntValue;
                                                a87Var.A = so9Var.x;
                                                a87Var.B = so9Var.y;
                                                a87Var.C = ex3Var;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = so9Var.b;
                                            if (str6 != null) {
                                                a87Var.b = so9Var.b;
                                            }
                                            a87Var.a = Integer.toString(i21);
                                            if (so9Var.a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            a87Var.l = uya.n(str7);
                                            a87Var.m = uya.n(str9);
                                            a87Var.n = i6;
                                            a87Var.d = so9Var.Z;
                                            a87Var.e = i21111111111111117;
                                            a87Var.p = list3;
                                            a87Var.j = str3;
                                            a87Var.q = so9Var.m;
                                            so9Var.b0 = a87Var.a();
                                            so9Var.a0 = to9Var3.I1.G(so9Var.d, so9Var.e);
                                            sparseArray2.put(so9Var.d, so9Var);
                                            break;
                                        default:
                                            throw ParserException.a(null, "Unrecognized codec identifier.");
                                    }
                                default:
                                    to9Var3.y = null;
                                    break;
                            }
                        } else if (i20 != 183) {
                            if (i20 == 19899) {
                                int i45 = to9Var3.A;
                                if (i45 != -1) {
                                    long j7 = to9Var3.B;
                                    if (j7 != -1) {
                                        if (i45 == 475249515) {
                                            to9Var3.K = j7;
                                        }
                                    }
                                }
                                throw ParserException.a(null, "Mandatory element SeekID or SeekPosition not found");
                            }
                            if (i20 == 25152) {
                                to9Var3.c(i20);
                                so9 so9Var2 = to9Var3.y;
                                if (so9Var2.i) {
                                    jyh jyhVar = so9Var2.k;
                                    if (jyhVar == null) {
                                        throw ParserException.a(null, "Encrypted Track found but ContentEncKeyID was not found");
                                    }
                                    so9Var2.m = new wu5(null, true, new vu5(f71.a, null, "video/webm", jyhVar.b));
                                }
                            } else if (i20 == 28032) {
                                to9Var3.c(i20);
                                so9 so9Var3 = to9Var3.y;
                                if (so9Var3.i && so9Var3.j != null) {
                                    throw ParserException.a(null, "Combining encryption and compression is not supported");
                                }
                            } else if (i20 == 357149030) {
                                if (to9Var3.t == -9223372036854775807L) {
                                    to9Var3.t = 1000000L;
                                }
                                long j8 = to9Var3.u;
                                if (j8 != -9223372036854775807L) {
                                    to9Var3.v = to9Var3.j(j8);
                                }
                            } else if (i20 == 374648427) {
                                boolean z20 = z3 ? 1 : 0;
                                if (sparseArray2.size() == 0) {
                                    throw ParserException.a(null, "No valid tracks were found");
                                }
                                boolean z21 = (!to9Var3.d || to9Var3.K == -1) ? true : z20 ? 1 : 0;
                                int i46 = -1;
                                int i47 = -1;
                                int i48 = -1;
                                int i49 = -1;
                                for (int i50 = z20 ? 1 : 0; i50 < sparseArray2.size(); i50++) {
                                    so9 so9Var4 = (so9) sparseArray2.valueAt(i50);
                                    int i51 = so9Var4.e;
                                    if (i51 == 2) {
                                        if (so9Var4.Y) {
                                            i46 = so9Var4.d;
                                        }
                                        if (i47 == -1) {
                                            i47 = so9Var4.d;
                                        }
                                    } else if (i51 == 1) {
                                        if (so9Var4.Y) {
                                            i48 = so9Var4.d;
                                        }
                                        if (i49 == -1) {
                                            i49 = so9Var4.d;
                                        }
                                    }
                                    if (z21) {
                                        so9Var4.a0.getClass();
                                        if (!so9Var4.W) {
                                            kyh kyhVar = so9Var4.a0;
                                            b87 b87Var = so9Var4.b0;
                                            b87Var.getClass();
                                            kyhVar.g(b87Var);
                                        }
                                    }
                                }
                                if (i46 != -1) {
                                    to9Var3.I = i46;
                                } else if (i47 != -1) {
                                    to9Var3.I = i47;
                                } else if (i48 != -1) {
                                    to9Var3.I = i48;
                                } else if (i49 != -1) {
                                    to9Var3.I = i49;
                                } else {
                                    to9Var3.I = sparseArray2.size() > 0 ? ((so9) sparseArray2.valueAt(z20 ? 1 : 0)).d : -1;
                                }
                                if (z21) {
                                    to9Var3.f();
                                }
                            } else if (i20 == 475249515 && !to9Var3.z) {
                                int i52 = z3 ? 1 : 0;
                                while (true) {
                                    if (i52 < sparseArray.size()) {
                                        if (((List) sparseArray.valueAt(i52)).isEmpty()) {
                                            i52++;
                                        } else if (to9Var3.v != -9223372036854775807L) {
                                            for (int i53 = z3 ? 1 : 0; i53 < sparseArray.size(); i53++) {
                                                Collections.sort((List) sparseArray.valueAt(i53));
                                            }
                                            to9Var3.I1.r(new ro9(sparseArray, to9Var3.v, to9Var3.I, to9Var3.s, to9Var3.r));
                                        }
                                    }
                                    to9Var3.I1.r(new vk0(to9Var3.v));
                                }
                                to9Var3.z = z4;
                                to9Var3.D = z3;
                                int i54 = z3 ? 1 : 0;
                                while (i54 < sparseArray2.size()) {
                                    so9 so9Var5 = (so9) sparseArray2.valueAt(i54);
                                    long j9 = to9Var3.v;
                                    long j10 = to9Var3.s;
                                    long j11 = to9Var3.r;
                                    boolean z22 = z3;
                                    int i55 = z4;
                                    if (so9Var5.e != 2 || (list5 = (List) sparseArray.get(so9Var5.d)) == null || list5.isEmpty()) {
                                        i14 = i54;
                                    } else {
                                        if (list5.isEmpty()) {
                                            i14 = i54;
                                        } else {
                                            i14 = i54;
                                            int iMin = Math.min(list5.size(), 20);
                                            double d = 0.0d;
                                            int i56 = z22 ? 1 : 0;
                                            int i57 = -1;
                                            while (i56 < iMin) {
                                                qo9 qo9Var = (qo9) list5.get(i56);
                                                long j12 = j10;
                                                long j13 = qo9Var.a;
                                                long j14 = qo9Var.c;
                                                long j15 = qo9Var.b;
                                                if (j13 > 10000000) {
                                                    if (i57 == -1) {
                                                        j = ((qo9) list5.get(i57 == true ? 1 : 0)).a;
                                                    }
                                                    if (j != -9223372036854775807L) {
                                                        b87 b87Var2 = so9Var5.b0;
                                                        b87Var2.getClass();
                                                        lwaVar = b87Var2.l;
                                                        qrhVar = new qrh(j);
                                                        if (lwaVar == null) {
                                                            jwa[] jwaVarArr = new jwa[i55];
                                                            jwaVarArr[z22 ? 1 : 0] = qrhVar;
                                                            lwaVarA = new lwa(jwaVarArr);
                                                        } else {
                                                            jwa[] jwaVarArr2 = new jwa[i55];
                                                            jwaVarArr2[z22 ? 1 : 0] = qrhVar;
                                                            lwaVarA = lwaVar.a(jwaVarArr2);
                                                        }
                                                        a87 a87VarA = so9Var5.b0.a();
                                                        a87VarA.k = lwaVarA;
                                                        so9Var5.b0 = new b87(a87VarA);
                                                    }
                                                } else {
                                                    if (i56 < list5.size() - 1) {
                                                        qo9 qo9Var2 = (qo9) list5.get(i56 + 1);
                                                        j2 = (qo9Var2.b + qo9Var2.c) - (j15 + j14);
                                                        j3 = qo9Var2.a - j13;
                                                    } else {
                                                        j2 = (j12 + j11) - (j15 + j14);
                                                        j3 = j9 - j13;
                                                    }
                                                    if (j3 > 0) {
                                                        double d2 = j2 / j3;
                                                        if (d2 > d) {
                                                            d = d2;
                                                            i57 = i56;
                                                        }
                                                    }
                                                    i56++;
                                                    j10 = j12;
                                                }
                                            }
                                            if (i57 == -1) {
                                                j = ((qo9) list5.get(i57 == true ? 1 : 0)).a;
                                            }
                                            if (j != -9223372036854775807L) {
                                                b87 b87Var3 = so9Var5.b0;
                                                b87Var3.getClass();
                                                lwaVar = b87Var3.l;
                                                qrhVar = new qrh(j);
                                                if (lwaVar == null) {
                                                    jwa[] jwaVarArr3 = new jwa[i55];
                                                    jwaVarArr3[z22 ? 1 : 0] = qrhVar;
                                                    lwaVarA = new lwa(jwaVarArr3);
                                                } else {
                                                    jwa[] jwaVarArr4 = new jwa[i55];
                                                    jwaVarArr4[z22 ? 1 : 0] = qrhVar;
                                                    lwaVarA = lwaVar.a(jwaVarArr4);
                                                }
                                                a87 a87VarA2 = so9Var5.b0.a();
                                                a87VarA2.k = lwaVarA;
                                                so9Var5.b0 = new b87(a87VarA2);
                                            }
                                        }
                                        j = -9223372036854775807L;
                                        if (j != -9223372036854775807L) {
                                            b87 b87Var4 = so9Var5.b0;
                                            b87Var4.getClass();
                                            lwaVar = b87Var4.l;
                                            qrhVar = new qrh(j);
                                            if (lwaVar == null) {
                                                jwa[] jwaVarArr5 = new jwa[i55];
                                                jwaVarArr5[z22 ? 1 : 0] = qrhVar;
                                                lwaVarA = new lwa(jwaVarArr5);
                                            } else {
                                                jwa[] jwaVarArr6 = new jwa[i55];
                                                jwaVarArr6[z22 ? 1 : 0] = qrhVar;
                                                lwaVarA = lwaVar.a(jwaVarArr6);
                                            }
                                            a87 a87VarA3 = so9Var5.b0.a();
                                            a87VarA3.k = lwaVarA;
                                            so9Var5.b0 = new b87(a87VarA3);
                                        }
                                    }
                                    if (!so9Var5.W) {
                                        so9Var5.a0.getClass();
                                        kyh kyhVar2 = so9Var5.a0;
                                        b87 b87Var5 = so9Var5.b0;
                                        b87Var5.getClass();
                                        kyhVar2.g(b87Var5);
                                    }
                                    i54 = i14 + 1;
                                    z3 = z22 ? 1 : 0;
                                    z4 = true;
                                }
                                to9Var3.f();
                                i5 = z3 ? 1 : 0;
                            }
                        } else if (!to9Var3.z) {
                            to9Var3.a(i20);
                            if (to9Var3.E != -9223372036854775807L && (i13 = to9Var3.F) != -1 && to9Var3.G != -1) {
                                List arrayList5 = (List) sparseArray.get(i13);
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                    sparseArray.put(to9Var3.F, arrayList5);
                                }
                                arrayList5.add(new qo9(to9Var3.E, to9Var3.s + to9Var3.G, to9Var3.H));
                            }
                        }
                        i5 = 0;
                    } else if (to9Var3.n1 != 2) {
                        i5 = 0;
                    } else {
                        so9 so9Var6 = (so9) sparseArray2.get(to9Var3.t1);
                        so9Var6.a0.getClass();
                        if (to9Var3.y1 > 0 && "A_OPUS".equals(so9Var6.c)) {
                            nmc nmcVar3 = to9Var3.p;
                            byte[] bArrArray = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(to9Var3.y1).array();
                            nmcVar3.getClass();
                            nmcVar3.L(bArrArray.length, bArrArray);
                        }
                        int i58 = 0;
                        for (int i59 = 0; i59 < to9Var3.r1; i59++) {
                            i58 += to9Var3.s1[i59];
                        }
                        int i60 = 0;
                        while (i60 < to9Var3.r1) {
                            long j16 = to9Var3.o1 + ((long) ((so9Var6.f * i60) / 1000));
                            int i61 = to9Var3.v1;
                            if (i60 == 0 && !to9Var3.x1) {
                                i61 |= 1;
                            }
                            int i62 = to9Var3.s1[i60];
                            int i63 = i58 - i62;
                            to9Var3.d(so9Var6, j16, i61, i62, i63);
                            i60++;
                            i58 = i63;
                        }
                        i5 = 0;
                        to9Var3.n1 = 0;
                    }
                    r2 = kj6Var;
                    i2 = i5;
                }
                z5 = true;
                r1 = r2;
                r4 = i2;
            }
            if (z5) {
                long position2 = r1.getPosition();
                to9Var = this;
                if (to9Var.J) {
                    to9Var.X = position2;
                    s8Var.a = to9Var.K;
                    to9Var.J = r4;
                    return 1;
                }
                z2 = true;
                if (to9Var.z) {
                    long j17 = to9Var.X;
                    if (j17 != -1) {
                        s8Var.a = j17;
                        to9Var.X = -1L;
                        return 1;
                    }
                } else {
                    continue;
                }
            } else {
                z2 = true;
                to9Var = this;
            }
            z4 = z2;
            z3 = false;
        }
        if (z5) {
            return 0;
        }
        int i64 = 0;
        while (true) {
            SparseArray sparseArray3 = to9Var.c;
            if (i64 >= sparseArray3.size()) {
                return -1;
            }
            so9 so9Var7 = (so9) sparseArray3.valueAt(i64);
            so9Var7.a0.getClass();
            g5i g5iVar = so9Var7.V;
            if (g5iVar != null) {
                g5iVar.a(so9Var7.a0, so9Var7.k);
            }
            i64++;
        }
    }

    public final void m(kj6 kj6Var, byte[] bArr, int i) {
        int length = bArr.length + i;
        nmc nmcVar = this.m;
        byte[] bArr2 = nmcVar.a;
        if (bArr2.length < length) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, length + i);
            nmcVar.getClass();
            nmcVar.L(bArrCopyOf.length, bArrCopyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        kj6Var.readFully(nmcVar.a, bArr.length, i);
        nmcVar.N(0);
        nmcVar.M(length);
    }

    @Override // defpackage.jj6
    public final void release() {
    }
}
