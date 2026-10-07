package defpackage;

import androidx.media3.common.ParserException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class m17 implements jj6 {
    public final nmc a = new nmc(4);
    public final nmc b = new nmc(9);
    public final nmc c = new nmc(11);
    public final nmc d = new nmc();
    public final h5f e;
    public lj6 f;
    public int g;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public int l;
    public long m;
    public boolean n;
    public bc0 o;
    public q4j p;

    public m17() {
        h5f h5fVar = new h5f(new nm5());
        h5fVar.b = -9223372036854775807L;
        h5fVar.c = new long[0];
        h5fVar.d = new long[0];
        this.e = h5fVar;
        this.g = 1;
    }

    @Override // defpackage.jj6
    public final void A(lj6 lj6Var) {
        this.f = lj6Var;
    }

    public final nmc a(kj6 kj6Var) {
        int i = this.l;
        nmc nmcVar = this.d;
        byte[] bArr = nmcVar.a;
        if (i > bArr.length) {
            nmcVar.L(0, new byte[Math.max(bArr.length * 2, i)]);
        } else {
            nmcVar.N(0);
        }
        nmcVar.M(this.l);
        kj6Var.readFully(nmcVar.a, 0, this.l);
        return nmcVar;
    }

    @Override // defpackage.jj6
    public final boolean b(kj6 kj6Var) {
        nmc nmcVar = this.a;
        kj6Var.u(0, nmcVar.a, 3);
        nmcVar.N(0);
        if (nmcVar.D() != 4607062) {
            return false;
        }
        kj6Var.u(0, nmcVar.a, 2);
        nmcVar.N(0);
        if ((nmcVar.H() & 250) != 0) {
            return false;
        }
        kj6Var.u(0, nmcVar.a, 4);
        nmcVar.N(0);
        int iM = nmcVar.m();
        kj6Var.q();
        kj6Var.z(iM);
        kj6Var.u(0, nmcVar.a, 4);
        nmcVar.N(0);
        return nmcVar.m() == 0;
    }

    @Override // defpackage.jj6
    public final void g(long j, long j2) {
        if (j == 0) {
            this.g = 1;
            this.h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:144:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:145:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:184:0x03c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0170  */
    /* JADX WARN: Code duplicated, block: B:58:0x0178  */
    /* JADX WARN: Code duplicated, block: B:94:0x029d  */
    /* JADX WARN: Code duplicated, block: B:99:0x02b2  */
    @Override // defpackage.jj6
    public final int l(kj6 kj6Var, s8 s8Var) throws ParserException {
        long j;
        long j2;
        int i;
        boolean z;
        boolean z2;
        long j3;
        int i2;
        this.f.getClass();
        while (true) {
            int i3 = this.g;
            boolean z3 = true;
            if (i3 == 1) {
                nmc nmcVar = this.b;
                if (!kj6Var.t(nmcVar.a, 0, 9, true)) {
                    return -1;
                }
                nmcVar.N(0);
                nmcVar.O(4);
                int iA = nmcVar.A();
                boolean z4 = (iA & 4) != 0;
                boolean z5 = (iA & 1) != 0;
                if (z4 && this.o == null) {
                    this.o = new bc0(this.f.G(8, 1));
                }
                if (z5 && this.p == null) {
                    i2 = 2;
                    this.p = new q4j(this.f.G(9, 2));
                } else {
                    i2 = 2;
                }
                this.f.D();
                this.j = nmcVar.m() - 5;
                this.g = i2;
            } else if (i3 == 2) {
                kj6Var.E(this.j);
                this.j = 0;
                this.g = 3;
            } else if (i3 == 3) {
                nmc nmcVar2 = this.c;
                if (!kj6Var.t(nmcVar2.a, 0, 11, true)) {
                    return -1;
                }
                nmcVar2.N(0);
                this.k = nmcVar2.A();
                this.l = nmcVar2.D();
                this.m = nmcVar2.D();
                this.m = (((long) (nmcVar2.A() << 24)) | this.m) * 1000;
                nmcVar2.O(3);
                this.g = 4;
            } else {
                if (i3 != 4) {
                    c.t();
                    return 0;
                }
                boolean z6 = this.h;
                h5f h5fVar = this.e;
                if (z6) {
                    j = this.i + this.m;
                } else {
                    if (h5fVar.b == -9223372036854775807L) {
                        j2 = 0;
                    } else {
                        j = this.m;
                    }
                    i = this.k;
                    if (i == 8 || this.o == null) {
                        int i4 = 4;
                        if (i != 9 && this.p != null) {
                            if (!this.n) {
                                this.f.r(new vk0(-9223372036854775807L));
                                this.n = true;
                            }
                            q4j q4jVar = this.p;
                            nmc nmcVarA = a(kj6Var);
                            q4jVar.getClass();
                            int iA2 = nmcVarA.A();
                            int i5 = (iA2 >> 4) & 15;
                            int i6 = iA2 & 15;
                            if (i6 != 7) {
                                final String strH = zo5.h(i6, "Video format not supported: ");
                                throw new ParserException(strH) { // from class: androidx.media3.extractor.flv.TagPayloadReader$UnsupportedFormatException
                                };
                            }
                            q4jVar.g = i5;
                            if (i5 != 5) {
                                nmc nmcVar3 = q4jVar.b;
                                kyh kyhVar = (kyh) q4jVar.a;
                                nmc nmcVar4 = q4jVar.c;
                                int iA3 = nmcVarA.A();
                                nmcVarA.f(3);
                                byte[] bArr = nmcVarA.a;
                                int i7 = nmcVarA.b;
                                int i8 = i7 + 1;
                                nmcVarA.b = i8;
                                int i9 = ((bArr[i7] & 255) << 24) >> 8;
                                int i10 = i7 + 2;
                                nmcVarA.b = i10;
                                int i11 = ((bArr[i8] & 255) << 8) | i9;
                                nmcVarA.b = i7 + 3;
                                long j4 = (((long) (i11 | (bArr[i10] & 255))) * 1000) + j2;
                                if (iA3 != 0 || q4jVar.e) {
                                    if (iA3 == 1 && q4jVar.e) {
                                        int i12 = q4jVar.g == 1 ? 1 : 0;
                                        if (q4jVar.f || i12 != 0) {
                                            byte[] bArr2 = nmcVar4.a;
                                            bArr2[0] = 0;
                                            bArr2[1] = 0;
                                            bArr2[2] = 0;
                                            int i13 = 4 - q4jVar.d;
                                            int i14 = 0;
                                            while (nmcVarA.a() > 0) {
                                                nmcVarA.k(i13, nmcVar4.a, q4jVar.d);
                                                nmcVar4.N(0);
                                                int iE = nmcVar4.E();
                                                nmcVar3.N(0);
                                                kyhVar.f(i4, nmcVar3);
                                                kyhVar.f(iE, nmcVarA);
                                                i14 = i14 + 4 + iE;
                                                i4 = 4;
                                            }
                                            ((kyh) q4jVar.a).a(j4, i12, i14, 0, null);
                                            q4jVar.f = true;
                                            z2 = true;
                                        }
                                    }
                                    z = z2;
                                    z3 = true;
                                } else {
                                    byte[] bArr3 = new byte[nmcVarA.a()];
                                    nmc nmcVar5 = new nmc(bArr3);
                                    nmcVarA.k(0, bArr3, nmcVarA.a());
                                    tk0 tk0VarA = tk0.a(nmcVar5);
                                    q4jVar.d = tk0VarA.b;
                                    a87 a87Var = new a87();
                                    a87Var.l = uya.n("video/x-flv");
                                    a87Var.m = uya.n("video/avc");
                                    a87Var.j = tk0VarA.l;
                                    a87Var.t = tk0VarA.c;
                                    a87Var.u = tk0VarA.d;
                                    a87Var.z = tk0VarA.k;
                                    a87Var.p = tk0VarA.a;
                                    ewi.n(a87Var, kyhVar);
                                    q4jVar.e = true;
                                }
                                z2 = false;
                                if (z2) {
                                }
                                z3 = true;
                            }
                        } else if (i == 18 || this.n) {
                            kj6Var.E(this.l);
                            z = false;
                            z3 = false;
                        } else {
                            nmc nmcVarA2 = a(kj6Var);
                            h5fVar.getClass();
                            if (nmcVarA2.A() == 2 && "onMetaData".equals(h5f.o(nmcVarA2)) && nmcVarA2.a() != 0 && nmcVarA2.A() == 8) {
                                HashMap mapN = h5f.n(nmcVarA2);
                                Object obj = mapN.get("duration");
                                if (obj instanceof Double) {
                                    double dDoubleValue = ((Double) obj).doubleValue();
                                    if (dDoubleValue > 0.0d) {
                                        h5fVar.b = (long) (dDoubleValue * 1000000.0d);
                                    }
                                }
                                Object obj2 = mapN.get("keyframes");
                                if (obj2 instanceof Map) {
                                    Map map = (Map) obj2;
                                    Object obj3 = map.get("filepositions");
                                    Object obj4 = map.get("times");
                                    if ((obj3 instanceof List) && (obj4 instanceof List)) {
                                        List list = (List) obj3;
                                        List list2 = (List) obj4;
                                        int size = list2.size();
                                        h5fVar.c = new long[size];
                                        h5fVar.d = new long[size];
                                        for (int i15 = 0; i15 < size; i15++) {
                                            Object obj5 = list.get(i15);
                                            Object obj6 = list2.get(i15);
                                            if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                                                h5fVar.c = new long[0];
                                                h5fVar.d = new long[0];
                                                break;
                                            }
                                            h5fVar.c[i15] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                                            h5fVar.d[i15] = ((Double) obj5).longValue();
                                        }
                                    }
                                }
                            }
                            long j5 = h5fVar.b;
                            if (j5 != -9223372036854775807L) {
                                this.f.r(new ad8(j5, h5fVar.d, h5fVar.c));
                                this.n = true;
                            }
                        }
                        z3 = true;
                    } else {
                        if (!this.n) {
                            this.f.r(new vk0(-9223372036854775807L));
                            this.n = true;
                        }
                        bc0 bc0Var = this.o;
                        nmc nmcVarA3 = a(kj6Var);
                        kyh kyhVar2 = (kyh) bc0Var.a;
                        if (bc0Var.b) {
                            nmcVarA3.O(1);
                        } else {
                            int iA4 = nmcVarA3.A();
                            int i16 = (iA4 >> 4) & 15;
                            bc0Var.d = i16;
                            if (i16 == 2) {
                                int i17 = bc0.e[(iA4 >> 2) & 3];
                                a87 a87Var2 = new a87();
                                a87Var2.l = uya.n("video/x-flv");
                                a87Var2.m = uya.n("audio/mpeg");
                                a87Var2.E = 1;
                                a87Var2.F = i17;
                                ewi.n(a87Var2, kyhVar2);
                                bc0Var.c = true;
                            } else if (i16 == 7 || i16 == 8) {
                                String str = i16 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                                a87 a87Var3 = new a87();
                                a87Var3.l = uya.n("video/x-flv");
                                a87Var3.m = uya.n(str);
                                a87Var3.E = 1;
                                a87Var3.F = 8000;
                                ewi.n(a87Var3, kyhVar2);
                                bc0Var.c = true;
                            } else if (i16 != 10) {
                                final String str2 = "Audio format not supported: " + bc0Var.d;
                                throw new ParserException(str2) { // from class: androidx.media3.extractor.flv.TagPayloadReader$UnsupportedFormatException
                                };
                            }
                            bc0Var.b = true;
                        }
                        kyh kyhVar3 = (kyh) bc0Var.a;
                        if (bc0Var.d == 2) {
                            int iA5 = nmcVarA3.a();
                            kyhVar3.f(iA5, nmcVarA3);
                            ((kyh) bc0Var.a).a(j2, 1, iA5, 0, null);
                        } else {
                            int iA6 = nmcVarA3.A();
                            if (iA6 == 0 && !bc0Var.c) {
                                int iA7 = nmcVarA3.a();
                                byte[] bArr4 = new byte[iA7];
                                nmcVarA3.k(0, bArr4, iA7);
                                d dVarD = ax.d(new mo2(iA7, bArr4), false);
                                a87 a87Var4 = new a87();
                                a87Var4.l = uya.n("video/x-flv");
                                a87Var4.m = uya.n("audio/mp4a-latm");
                                a87Var4.j = dVarD.a;
                                a87Var4.E = dVarD.c;
                                a87Var4.F = dVarD.b;
                                a87Var4.p = Collections.singletonList(bArr4);
                                ewi.n(a87Var4, kyhVar3);
                                bc0Var.c = true;
                            } else if (bc0Var.d != 10 || iA6 == 1) {
                                int iA8 = nmcVarA3.a();
                                kyhVar3.f(iA8, nmcVarA3);
                                ((kyh) bc0Var.a).a(j2, 1, iA8, 0, null);
                            }
                            z = false;
                        }
                        z = true;
                    }
                    if (!this.h && z) {
                        this.h = true;
                        if (h5fVar.b == -9223372036854775807L) {
                            j3 = -this.m;
                        } else {
                            j3 = 0;
                        }
                        this.i = j3;
                    }
                    this.j = 4;
                    this.g = 2;
                    if (z3) {
                        return 0;
                    }
                }
                j2 = j;
                i = this.k;
                if (i == 8) {
                    int i18 = 4;
                    if (i != 9) {
                        if (i == 18) {
                        }
                        kj6Var.E(this.l);
                        z = false;
                        z3 = false;
                    } else {
                        if (i == 18) {
                        }
                        kj6Var.E(this.l);
                        z = false;
                        z3 = false;
                    }
                } else {
                    int i19 = 4;
                    if (i != 9) {
                        if (i == 18) {
                        }
                        kj6Var.E(this.l);
                        z = false;
                        z3 = false;
                    } else {
                        if (i == 18) {
                        }
                        kj6Var.E(this.l);
                        z = false;
                        z3 = false;
                    }
                }
                if (!this.h) {
                    this.h = true;
                    if (h5fVar.b == -9223372036854775807L) {
                        j3 = -this.m;
                    } else {
                        j3 = 0;
                    }
                    this.i = j3;
                }
                this.j = 4;
                this.g = 2;
                if (z3) {
                    return 0;
                }
            }
        }
    }

    @Override // defpackage.jj6
    public final void release() {
    }
}
