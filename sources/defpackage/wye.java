package defpackage;

import android.util.SparseArray;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import java.io.EOFException;
import java.util.Objects;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes4.dex */
public class wye implements kyh {
    public b87 A;
    public b87 B;
    public long C;
    public boolean E;
    public long F;
    public boolean G;
    public final sye a;
    public final ev5 d;
    public final av5 e;
    public vye f;
    public b87 g;
    public xu5 h;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean w;
    public boolean z;
    public final zg2 b = new zg2();
    public int i = 1000;
    public long[] j = new long[1000];
    public long[] k = new long[1000];
    public long[] n = new long[1000];
    public int[] m = new int[1000];
    public int[] l = new int[1000];
    public jyh[] o = new jyh[1000];
    public final ed7 c = new ed7(new ahc(14));
    public long t = Long.MIN_VALUE;
    public long u = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;
    public boolean y = true;
    public boolean x = true;
    public boolean D = true;

    public wye(qf qfVar, ev5 ev5Var, av5 av5Var) {
        this.d = ev5Var;
        this.e = av5Var;
        this.a = new sye(qfVar);
    }

    public final void A(b87 b87Var, v2a v2aVar) {
        b87 b87Var2;
        b87 b87Var3 = this.g;
        boolean z = b87Var3 == null;
        wu5 wu5Var = b87Var3 == null ? null : b87Var3.r;
        this.g = b87Var;
        wu5 wu5Var2 = b87Var.r;
        ev5 ev5Var = this.d;
        if (ev5Var != null) {
            int iC = ev5Var.c(b87Var);
            a87 a87VarA = b87Var.a();
            a87VarA.N = iC;
            b87Var2 = new b87(a87VarA);
        } else {
            b87Var2 = b87Var;
        }
        v2aVar.c = b87Var2;
        v2aVar.b = this.h;
        if (ev5Var == null) {
            return;
        }
        if (z || !Objects.equals(wu5Var, wu5Var2)) {
            xu5 xu5Var = this.h;
            av5 av5Var = this.e;
            xu5 xu5VarA = ev5Var.a(av5Var, b87Var);
            this.h = xu5VarA;
            v2aVar.b = xu5VarA;
            if (xu5Var != null) {
                xu5Var.f(av5Var);
            }
        }
    }

    public final synchronized long B() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return this.s != this.p ? this.j[u(this.s)] : this.C;
    }

    public final int C(v2a v2aVar, u55 u55Var, int i, boolean z) {
        int i2;
        boolean z2 = (i & 2) != 0;
        zg2 zg2Var = this.b;
        synchronized (this) {
            try {
                u55Var.e = false;
                i2 = -3;
                if (this.s != this.p) {
                    b87 b87Var = ((uye) this.c.H(t())).a;
                    if (z2 || b87Var != this.g) {
                        A(b87Var, v2aVar);
                        i2 = -5;
                    } else {
                        int iU = u(this.s);
                        if (y(iU)) {
                            u55Var.a = this.m[iU];
                            if (this.s == this.p - 1 && (z || this.w)) {
                                u55Var.a(536870912);
                            }
                            u55Var.f = this.n[iU];
                            zg2Var.a = this.l[iU];
                            zg2Var.b = this.k[iU];
                            zg2Var.c = this.o[iU];
                            i2 = -4;
                        } else {
                            u55Var.e = true;
                        }
                    }
                } else if (z || this.w) {
                    u55Var.a = 4;
                    u55Var.f = Long.MIN_VALUE;
                    i2 = -4;
                } else {
                    b87 b87Var2 = this.B;
                    if (b87Var2 != null && (z2 || b87Var2 != this.g)) {
                        A(b87Var2, v2aVar);
                        i2 = -5;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i2 == -4 && !u55Var.d(4)) {
            boolean z3 = (i & 1) != 0;
            if ((i & 4) == 0) {
                sye syeVar = this.a;
                zg2 zg2Var2 = this.b;
                if (z3) {
                    sye.e(syeVar.e, u55Var, zg2Var2, syeVar.c);
                } else {
                    syeVar.e = sye.e(syeVar.e, u55Var, zg2Var2, syeVar.c);
                }
            }
            if (!z3) {
                this.s++;
            }
        }
        return i2;
    }

    public final void D(boolean z) {
        sye syeVar = this.a;
        n21 n21Var = syeVar.d;
        qf qfVar = syeVar.a;
        if (((pf) n21Var.c) != null) {
            qfVar.i(n21Var);
            n21Var.c = null;
            n21Var.d = null;
        }
        n21 n21Var2 = syeVar.d;
        int i = syeVar.b;
        lvb.b0(((pf) n21Var2.c) == null);
        n21Var2.a = 0L;
        n21Var2.b = i;
        n21 n21Var3 = syeVar.d;
        syeVar.e = n21Var3;
        syeVar.f = n21Var3;
        syeVar.g = 0L;
        qfVar.l();
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.x = true;
        this.t = Long.MIN_VALUE;
        this.u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.w = false;
        ed7 ed7Var = this.c;
        SparseArray sparseArray = (SparseArray) ed7Var.c;
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            ((ahc) ed7Var.d).accept(sparseArray.valueAt(i2));
        }
        ed7Var.b = -1;
        sparseArray.clear();
        if (z) {
            this.A = null;
            this.B = null;
            this.y = true;
            this.D = true;
        }
    }

    public final synchronized boolean E(int i) {
        synchronized (this) {
            this.s = 0;
            sye syeVar = this.a;
            syeVar.e = syeVar.d;
        }
        int i2 = this.q;
        if (i >= i2 && i <= this.p + i2) {
            this.t = Long.MIN_VALUE;
            this.s = i - i2;
            return true;
        }
        return false;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0083 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean F(long r12, boolean r14) throws java.lang.Throwable {
        /*
            r11 = this;
            monitor-enter(r11)
            monitor-enter(r11)     // Catch: java.lang.Throwable -> L74
            r0 = 0
            r11.s = r0     // Catch: java.lang.Throwable -> L7c
            sye r1 = r11.a     // Catch: java.lang.Throwable -> L7c
            n21 r2 = r1.d     // Catch: java.lang.Throwable -> L7c
            r1.e = r2     // Catch: java.lang.Throwable -> L7c
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L79
            int r6 = r11.u(r0)     // Catch: java.lang.Throwable -> L6f
            int r1 = r11.s     // Catch: java.lang.Throwable -> L74
            int r2 = r11.p     // Catch: java.lang.Throwable -> L74
            r9 = 1
            if (r1 == r2) goto L19
            r3 = r9
            goto L1a
        L19:
            r3 = r0
        L1a:
            if (r3 == 0) goto L2c
            long[] r3 = r11.n     // Catch: java.lang.Throwable -> L6f
            r4 = r3[r6]     // Catch: java.lang.Throwable -> L6f
            int r3 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r3 < 0) goto L2c
            long r3 = r11.v     // Catch: java.lang.Throwable -> L6f
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 <= 0) goto L2e
            if (r14 != 0) goto L2e
        L2c:
            r3 = r11
            goto L72
        L2e:
            boolean r3 = r11.D     // Catch: java.lang.Throwable -> L6f
            r10 = -1
            if (r3 == 0) goto L56
            int r2 = r2 - r1
            r1 = r0
        L35:
            if (r1 >= r2) goto L4f
            long[] r3 = r11.n     // Catch: java.lang.Throwable -> L4b
            r4 = r3[r6]     // Catch: java.lang.Throwable -> L4b
            int r3 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r3 < 0) goto L41
            r2 = r1
            goto L53
        L41:
            int r6 = r6 + 1
            int r3 = r11.i     // Catch: java.lang.Throwable -> L4b
            if (r6 != r3) goto L48
            r6 = r0
        L48:
            int r1 = r1 + 1
            goto L35
        L4b:
            r0 = move-exception
            r12 = r0
            r3 = r11
            goto L85
        L4f:
            if (r14 == 0) goto L52
            goto L53
        L52:
            r2 = r10
        L53:
            r3 = r11
            r4 = r12
            goto L5f
        L56:
            int r7 = r2 - r1
            r8 = 1
            r3 = r11
            r4 = r12
            int r2 = r3.o(r4, r6, r7, r8)     // Catch: java.lang.Throwable -> L6c
        L5f:
            if (r2 != r10) goto L63
            monitor-exit(r3)
            return r0
        L63:
            r3.t = r4     // Catch: java.lang.Throwable -> L6c
            int r11 = r3.s     // Catch: java.lang.Throwable -> L6c
            int r11 = r11 + r2
            r3.s = r11     // Catch: java.lang.Throwable -> L6c
            monitor-exit(r3)
            return r9
        L6c:
            r0 = move-exception
        L6d:
            r12 = r0
            goto L85
        L6f:
            r0 = move-exception
            r3 = r11
            goto L6d
        L72:
            monitor-exit(r3)
            return r0
        L74:
            r0 = move-exception
            r3 = r11
        L76:
            r11 = r0
            r12 = r11
            goto L85
        L79:
            r0 = move-exception
            r3 = r11
            goto L76
        L7c:
            r0 = move-exception
            r3 = r11
        L7e:
            r11 = r0
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L83
            throw r11     // Catch: java.lang.Throwable -> L81
        L81:
            r0 = move-exception
            goto L76
        L83:
            r0 = move-exception
            goto L7e
        L85:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L6c
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wye.F(long, boolean):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000e  */
    public final synchronized void G(int i) {
        boolean z;
        if (i >= 0) {
            try {
                if (this.s + i <= this.p) {
                    z = true;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        } else {
            z = false;
        }
        lvb.R(z);
        this.s += i;
    }

    /* JADX WARN: Code duplicated, block: B:75:0x010c A[Catch: all -> 0x00ab, TryCatch #1 {all -> 0x00ab, blocks: (B:55:0x008d, B:57:0x0091, B:61:0x00a7, B:64:0x00ae, B:68:0x00b6, B:73:0x00f1, B:96:0x016d, B:98:0x0176, B:75:0x010c, B:77:0x0115, B:79:0x011e, B:81:0x0133, B:85:0x013c, B:86:0x0141, B:88:0x0147, B:92:0x0155, B:94:0x015a, B:95:0x016a, B:78:0x011c), top: B:104:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0115 A[Catch: all -> 0x00ab, TryCatch #1 {all -> 0x00ab, blocks: (B:55:0x008d, B:57:0x0091, B:61:0x00a7, B:64:0x00ae, B:68:0x00b6, B:73:0x00f1, B:96:0x016d, B:98:0x0176, B:75:0x010c, B:77:0x0115, B:79:0x011e, B:81:0x0133, B:85:0x013c, B:86:0x0141, B:88:0x0147, B:92:0x0155, B:94:0x015a, B:95:0x016a, B:78:0x011c), top: B:104:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:78:0x011c A[Catch: all -> 0x00ab, TryCatch #1 {all -> 0x00ab, blocks: (B:55:0x008d, B:57:0x0091, B:61:0x00a7, B:64:0x00ae, B:68:0x00b6, B:73:0x00f1, B:96:0x016d, B:98:0x0176, B:75:0x010c, B:77:0x0115, B:79:0x011e, B:81:0x0133, B:85:0x013c, B:86:0x0141, B:88:0x0147, B:92:0x0155, B:94:0x015a, B:95:0x016a, B:78:0x011c), top: B:104:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0133 A[Catch: all -> 0x00ab, TryCatch #1 {all -> 0x00ab, blocks: (B:55:0x008d, B:57:0x0091, B:61:0x00a7, B:64:0x00ae, B:68:0x00b6, B:73:0x00f1, B:96:0x016d, B:98:0x0176, B:75:0x010c, B:77:0x0115, B:79:0x011e, B:81:0x0133, B:85:0x013c, B:86:0x0141, B:88:0x0147, B:92:0x0155, B:94:0x015a, B:95:0x016a, B:78:0x011c), top: B:104:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0139  */
    /* JADX WARN: Code duplicated, block: B:84:0x013b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0147 A[Catch: all -> 0x00ab, TryCatch #1 {all -> 0x00ab, blocks: (B:55:0x008d, B:57:0x0091, B:61:0x00a7, B:64:0x00ae, B:68:0x00b6, B:73:0x00f1, B:96:0x016d, B:98:0x0176, B:75:0x010c, B:77:0x0115, B:79:0x011e, B:81:0x0133, B:85:0x013c, B:86:0x0141, B:88:0x0147, B:92:0x0155, B:94:0x015a, B:95:0x016a, B:78:0x011c), top: B:104:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0152  */
    /* JADX WARN: Code duplicated, block: B:91:0x0154  */
    /* JADX WARN: Code duplicated, block: B:94:0x015a A[Catch: all -> 0x00ab, TryCatch #1 {all -> 0x00ab, blocks: (B:55:0x008d, B:57:0x0091, B:61:0x00a7, B:64:0x00ae, B:68:0x00b6, B:73:0x00f1, B:96:0x016d, B:98:0x0176, B:75:0x010c, B:77:0x0115, B:79:0x011e, B:81:0x0133, B:85:0x013c, B:86:0x0141, B:88:0x0147, B:92:0x0155, B:94:0x015a, B:95:0x016a, B:78:0x011c), top: B:104:0x008d }] */
    @Override // defpackage.kyh
    public void a(long j, int i, int i2, int i3, jyh jyhVar) {
        b87 b87Var;
        ev5 ev5Var;
        dv5 dv5VarD;
        ed7 ed7Var;
        int i4;
        SparseArray sparseArray;
        int iKeyAt;
        boolean z;
        boolean z2;
        boolean z3;
        if (this.z) {
            b87 b87Var2 = this.A;
            b87Var2.getClass();
            g(b87Var2);
        }
        int i5 = i & 1;
        boolean z4 = i5 != 0;
        if (this.x) {
            if (!z4) {
                return;
            } else {
                this.x = false;
            }
        }
        long j2 = j + this.F;
        if (this.D) {
            if (j2 < this.t) {
                return;
            }
            if (i5 == 0) {
                if (!this.E) {
                    lvb.G0("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.B);
                    this.E = true;
                }
                i |= 1;
            }
        }
        if (this.G) {
            if (!z4) {
                return;
            }
            synchronized (this) {
                if (this.p == 0) {
                    z3 = j2 > this.u;
                } else if (r() >= j2) {
                    z3 = false;
                } else {
                    m(this.q + h(j2));
                    z3 = true;
                }
            }
            if (!z3) {
                return;
            } else {
                this.G = false;
            }
        }
        long j3 = (this.a.g - ((long) i2)) - ((long) i3);
        synchronized (this) {
            try {
                int i6 = this.p;
                if (i6 > 0) {
                    int iU = u(i6 - 1);
                    lvb.R(this.k[iU] + ((long) this.l[iU]) <= j3);
                }
                this.w = (536870912 & i) != 0;
                this.v = Math.max(this.v, j2);
                int iU2 = u(this.p);
                this.n[iU2] = j2;
                this.k[iU2] = j3;
                this.l[iU2] = i2;
                this.m[iU2] = i;
                this.o[iU2] = jyhVar;
                this.j[iU2] = this.C;
                if (((SparseArray) this.c.c).size() == 0) {
                    b87Var = this.B;
                    b87Var.getClass();
                    ev5Var = this.d;
                    if (ev5Var != null) {
                        dv5VarD = ev5Var.d(this.e, b87Var);
                    } else {
                        dv5VarD = dv5.l0;
                    }
                    ed7Var = this.c;
                    i4 = this.q + this.p;
                    uye uyeVar = new uye(b87Var, dv5VarD);
                    sparseArray = (SparseArray) ed7Var.c;
                    if (ed7Var.b == -1) {
                        if (sparseArray.size() == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        lvb.b0(z2);
                        ed7Var.b = 0;
                    }
                    if (sparseArray.size() > 0) {
                        iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                        if (i4 >= iKeyAt) {
                            z = true;
                        } else {
                            z = false;
                        }
                        lvb.R(z);
                        if (iKeyAt == i4) {
                            ((ahc) ed7Var.d).accept(sparseArray.valueAt(sparseArray.size() - 1));
                        }
                    }
                    sparseArray.append(i4, uyeVar);
                } else {
                    SparseArray sparseArray2 = (SparseArray) this.c.c;
                    if (!((uye) sparseArray2.valueAt(sparseArray2.size() - 1)).a.equals(this.B)) {
                        b87Var = this.B;
                        b87Var.getClass();
                        ev5Var = this.d;
                        if (ev5Var != null) {
                            dv5VarD = ev5Var.d(this.e, b87Var);
                        } else {
                            dv5VarD = dv5.l0;
                        }
                        ed7Var = this.c;
                        i4 = this.q + this.p;
                        uye uyeVar2 = new uye(b87Var, dv5VarD);
                        sparseArray = (SparseArray) ed7Var.c;
                        if (ed7Var.b == -1) {
                            if (sparseArray.size() == 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            lvb.b0(z2);
                            ed7Var.b = 0;
                        }
                        if (sparseArray.size() > 0) {
                            iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
                            if (i4 >= iKeyAt) {
                                z = true;
                            } else {
                                z = false;
                            }
                            lvb.R(z);
                            if (iKeyAt == i4) {
                                ((ahc) ed7Var.d).accept(sparseArray.valueAt(sparseArray.size() - 1));
                            }
                        }
                        sparseArray.append(i4, uyeVar2);
                    }
                }
                int i7 = this.p + 1;
                this.p = i7;
                int i8 = this.i;
                if (i7 == i8) {
                    int i9 = i8 + 1000;
                    long[] jArr = new long[i9];
                    long[] jArr2 = new long[i9];
                    long[] jArr3 = new long[i9];
                    int[] iArr = new int[i9];
                    int[] iArr2 = new int[i9];
                    jyh[] jyhVarArr = new jyh[i9];
                    int i10 = this.r;
                    int i11 = i8 - i10;
                    System.arraycopy(this.k, i10, jArr2, 0, i11);
                    System.arraycopy(this.n, this.r, jArr3, 0, i11);
                    System.arraycopy(this.m, this.r, iArr, 0, i11);
                    System.arraycopy(this.l, this.r, iArr2, 0, i11);
                    System.arraycopy(this.o, this.r, jyhVarArr, 0, i11);
                    System.arraycopy(this.j, this.r, jArr, 0, i11);
                    int i12 = this.r;
                    System.arraycopy(this.k, 0, jArr2, i11, i12);
                    System.arraycopy(this.n, 0, jArr3, i11, i12);
                    System.arraycopy(this.m, 0, iArr, i11, i12);
                    System.arraycopy(this.l, 0, iArr2, i11, i12);
                    System.arraycopy(this.o, 0, jyhVarArr, i11, i12);
                    System.arraycopy(this.j, 0, jArr, i11, i12);
                    this.k = jArr2;
                    this.n = jArr3;
                    this.m = iArr;
                    this.l = iArr2;
                    this.o = jyhVarArr;
                    this.j = jArr;
                    this.r = 0;
                    this.i = i9;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.kyh
    public final void b(nmc nmcVar, int i, int i2) {
        while (true) {
            sye syeVar = this.a;
            if (i <= 0) {
                syeVar.getClass();
                return;
            }
            int iB = syeVar.b(i);
            n21 n21Var = syeVar.f;
            pf pfVar = (pf) n21Var.c;
            nmcVar.k(((int) (syeVar.g - n21Var.a)) + pfVar.b, pfVar.a, iB);
            i -= iB;
            long j = syeVar.g + ((long) iB);
            syeVar.g = j;
            n21 n21Var2 = syeVar.f;
            if (j == n21Var2.b) {
                syeVar.f = (n21) n21Var2.d;
            }
        }
    }

    @Override // defpackage.kyh
    public final int d(q25 q25Var, int i, boolean z) throws EOFException {
        sye syeVar = this.a;
        int iB = syeVar.b(i);
        n21 n21Var = syeVar.f;
        pf pfVar = (pf) n21Var.c;
        int i2 = q25Var.read(pfVar.a, ((int) (syeVar.g - n21Var.a)) + pfVar.b, iB);
        if (i2 == -1) {
            if (z) {
                return -1;
            }
            c.n();
            return 0;
        }
        long j = syeVar.g + ((long) i2);
        syeVar.g = j;
        n21 n21Var2 = syeVar.f;
        if (j == n21Var2.b) {
            syeVar.f = (n21) n21Var2.d;
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0059 A[Catch: all -> 0x0057, TryCatch #0 {all -> 0x0057, blocks: (B:4:0x000a, B:8:0x0016, B:13:0x0028, B:15:0x0041, B:19:0x005b, B:18:0x0059), top: B:29:0x000a }] */
    @Override // defpackage.kyh
    public final void g(b87 b87Var) {
        b87 b87VarP = p(b87Var);
        boolean z = false;
        this.z = false;
        this.A = b87Var;
        synchronized (this) {
            try {
                this.y = false;
                if (!Objects.equals(b87VarP, this.B)) {
                    if (((SparseArray) this.c.c).size() == 0) {
                        this.B = b87VarP;
                    } else {
                        SparseArray sparseArray = (SparseArray) this.c.c;
                        if (((uye) sparseArray.valueAt(sparseArray.size() - 1)).a.equals(b87VarP)) {
                            SparseArray sparseArray2 = (SparseArray) this.c.c;
                            this.B = ((uye) sparseArray2.valueAt(sparseArray2.size() - 1)).a;
                        } else {
                            this.B = b87VarP;
                        }
                    }
                    boolean z2 = this.D;
                    b87 b87Var2 = this.B;
                    this.D = z2 & uya.a(b87Var2.n, b87Var2.k);
                    this.E = false;
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        vye vyeVar = this.f;
        if (vyeVar == null || !z) {
            return;
        }
        vyeVar.b();
    }

    public final int h(long j) {
        int i = this.p;
        int iU = u(i - 1);
        while (i > this.s && this.n[iU] >= j) {
            i--;
            iU--;
            if (iU == -1) {
                iU = this.i - 1;
            }
        }
        return i;
    }

    public final long i(int i) {
        this.u = Math.max(this.u, s(i));
        this.p -= i;
        int i2 = this.q + i;
        this.q = i2;
        int i3 = this.r + i;
        this.r = i3;
        int i4 = this.i;
        if (i3 >= i4) {
            this.r = i3 - i4;
        }
        int i5 = this.s - i;
        this.s = i5;
        int i6 = 0;
        if (i5 < 0) {
            this.s = 0;
        }
        ed7 ed7Var = this.c;
        SparseArray sparseArray = (SparseArray) ed7Var.c;
        while (i6 < sparseArray.size() - 1) {
            int i7 = i6 + 1;
            if (i2 < sparseArray.keyAt(i7)) {
                break;
            }
            ((ahc) ed7Var.d).accept(sparseArray.valueAt(i6));
            sparseArray.removeAt(i6);
            int i8 = ed7Var.b;
            if (i8 > 0) {
                ed7Var.b = i8 - 1;
            }
            i6 = i7;
        }
        if (this.p != 0) {
            return this.k[this.r];
        }
        int i9 = this.r;
        if (i9 == 0) {
            i9 = this.i;
        }
        int i10 = i9 - 1;
        return this.k[i10] + ((long) this.l[i10]);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    public final void j(long j, boolean z, boolean z2) {
        Throwable th;
        sye syeVar = this.a;
        synchronized (this) {
            try {
                try {
                    int i = this.p;
                    long jI = -1;
                    if (i != 0) {
                        long[] jArr = this.n;
                        int i2 = this.r;
                        if (j >= jArr[i2]) {
                            if (z2) {
                                try {
                                    int i3 = this.s;
                                    if (i3 != i) {
                                        i = i3 + 1;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            }
                            int iO = o(j, i2, i, z);
                            if (iO != -1) {
                                jI = i(iO);
                            }
                        }
                    }
                    syeVar.a(jI);
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
                throw th;
            }
        }
    }

    public final void k() {
        long jI;
        sye syeVar = this.a;
        synchronized (this) {
            int i = this.p;
            jI = i == 0 ? -1L : i(i);
        }
        syeVar.a(jI);
    }

    public final void l(long j) {
        if (this.p == 0) {
            return;
        }
        lvb.R(j > r());
        n(this.q + h(j));
    }

    public final long m(int i) {
        int i2 = this.q;
        int i3 = this.p;
        int i4 = (i2 + i3) - i;
        boolean z = false;
        lvb.R(i4 >= 0 && i4 <= i3 - this.s);
        int i5 = this.p - i4;
        this.p = i5;
        this.v = Math.max(this.u, s(i5));
        if (i4 == 0 && this.w) {
            z = true;
        }
        this.w = z;
        ed7 ed7Var = this.c;
        SparseArray sparseArray = (SparseArray) ed7Var.c;
        for (int size = sparseArray.size() - 1; size >= 0 && i < sparseArray.keyAt(size); size--) {
            ((ahc) ed7Var.d).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        ed7Var.b = sparseArray.size() > 0 ? Math.min(ed7Var.b, sparseArray.size() - 1) : -1;
        int i6 = this.p;
        if (i6 == 0) {
            return 0L;
        }
        int iU = u(i6 - 1);
        return this.k[iU] + ((long) this.l[iU]);
    }

    public final void n(int i) {
        n21 n21Var;
        long jM = m(i);
        sye syeVar = this.a;
        int i2 = syeVar.b;
        qf qfVar = syeVar.a;
        lvb.R(jM <= syeVar.g);
        syeVar.g = jM;
        if (jM != 0) {
            n21 n21Var2 = syeVar.d;
            if (jM != n21Var2.a) {
                while (true) {
                    long j = syeVar.g;
                    long j2 = n21Var2.b;
                    n21Var = (n21) n21Var2.d;
                    if (j <= j2) {
                        break;
                    } else {
                        n21Var2 = n21Var;
                    }
                }
                n21Var.getClass();
                if (((pf) n21Var.c) != null) {
                    qfVar.i(n21Var);
                    n21Var.c = null;
                    n21Var.d = null;
                }
                n21 n21Var3 = new n21(n21Var2.b, i2);
                n21Var2.d = n21Var3;
                if (syeVar.g == n21Var2.b) {
                    n21Var2 = n21Var3;
                }
                syeVar.f = n21Var2;
                if (syeVar.e == n21Var) {
                    syeVar.e = n21Var3;
                    return;
                }
                return;
            }
        }
        n21 n21Var4 = syeVar.d;
        if (((pf) n21Var4.c) != null) {
            qfVar.i(n21Var4);
            n21Var4.c = null;
            n21Var4.d = null;
        }
        n21 n21Var5 = new n21(syeVar.g, i2);
        syeVar.d = n21Var5;
        syeVar.e = n21Var5;
        syeVar.f = n21Var5;
    }

    public final int o(long j, int i, int i2, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.n[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.m[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.i) {
                i = 0;
            }
        }
        return i3;
    }

    public b87 p(b87 b87Var) {
        if (this.F == 0 || b87Var.s == BuildConfig.MAX_TIME_TO_UPLOAD) {
            return b87Var;
        }
        a87 a87VarA = b87Var.a();
        a87VarA.r = b87Var.s + this.F;
        return new b87(a87VarA);
    }

    public final synchronized long q() {
        return this.v;
    }

    public final synchronized long r() {
        return Math.max(this.u, s(this.s));
    }

    public final long s(int i) {
        long jMax = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int iU = u(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            jMax = Math.max(jMax, this.n[iU]);
            if ((this.m[iU] & 1) != 0) {
                return jMax;
            }
            iU--;
            if (iU == -1) {
                iU = this.i - 1;
            }
        }
        return jMax;
    }

    public final int t() {
        return this.q + this.s;
    }

    public final int u(int i) {
        int i2 = this.r + i;
        int i3 = this.i;
        return i2 < i3 ? i2 : i2 - i3;
    }

    public final synchronized int v(long j, boolean z) throws Throwable {
        try {
            try {
                int iU = u(this.s);
                int i = this.s;
                int i2 = this.p;
                if (!(i != i2) || j < this.n[iU]) {
                    return 0;
                }
                if (j > this.v && z) {
                    return i2 - i;
                }
                int iO = o(j, iU, i2 - i, true);
                if (iO == -1) {
                    return 0;
                }
                return iO;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized b87 w() {
        return this.y ? null : this.B;
    }

    public final synchronized boolean x(boolean z) {
        b87 b87Var;
        boolean z2 = false;
        if (this.s != this.p) {
            if (((uye) this.c.H(t())).a != this.g) {
                return true;
            }
            return y(u(this.s));
        }
        if (z || this.w || ((b87Var = this.B) != null && b87Var != this.g)) {
            z2 = true;
        }
        return z2;
    }

    public final boolean y(int i) {
        xu5 xu5Var = this.h;
        if (xu5Var == null || xu5Var.getState() == 4) {
            return true;
        }
        return (this.m[i] & 1073741824) == 0 && this.h.b();
    }

    public final void z() throws DrmSession$DrmSessionException {
        xu5 xu5Var = this.h;
        if (xu5Var == null || xu5Var.getState() != 1) {
            return;
        }
        DrmSession$DrmSessionException drmSession$DrmSessionExceptionC = this.h.c();
        drmSession$DrmSessionExceptionC.getClass();
        throw drmSession$DrmSessionExceptionC;
    }
}
