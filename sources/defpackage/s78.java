package defpackage;

import android.graphics.Bitmap;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.image.ImageDecoderException;
import androidx.work.WorkRequest;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class s78 extends ks0 {
    public int A;
    public int B;
    public b87 C;
    public tx0 D;
    public u55 E;
    public u68 F;
    public Bitmap G;
    public boolean H;
    public zg2 I;
    public zg2 J;
    public int K;
    public boolean X;
    public final c1k s;
    public final u55 t;
    public final ArrayDeque u;
    public boolean v;
    public boolean w;
    public r78 x;
    public long y;
    public long z;

    public s78(c1k c1kVar) {
        super(4);
        this.s = c1kVar;
        this.F = u68.a;
        this.t = new u55(0);
        this.x = r78.c;
        this.u = new ArrayDeque();
        this.z = -9223372036854775807L;
        this.y = -9223372036854775807L;
        this.A = 0;
        this.B = 1;
    }

    @Override // defpackage.ks0
    public final int D(b87 b87Var) {
        this.s.getClass();
        return c1k.a(b87Var);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0087  */
    /* JADX WARN: Code duplicated, block: B:46:0x008b  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:52:0x00de  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00e5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:72:0x012a  */
    /* JADX WARN: Code duplicated, block: B:74:0x0145  */
    public final boolean G(long j) throws ExoPlaybackException {
        boolean z;
        boolean z2;
        int i;
        int iC;
        int i2;
        b87 b87Var;
        zg2 zg2Var;
        Bitmap bitmapCreateBitmap;
        Bitmap bitmap = this.G;
        if ((bitmap == null || this.I != null) && (this.B != 0 || this.h == 2)) {
            ArrayDeque arrayDeque = this.u;
            if (bitmap == null) {
                this.D.getClass();
                sx0 sx0VarK = this.D.k();
                if (sx0VarK != null) {
                    if (!sx0VarK.d(4)) {
                        lvb.W(sx0VarK.d, "Non-EOS buffer came back from the decoder without bitmap.");
                        this.G = sx0VarK.d;
                        sx0VarK.r();
                        if (this.H && this.G != null && this.I != null) {
                            this.C.getClass();
                            b87 b87Var2 = this.C;
                            int i3 = b87Var2.M;
                            int i4 = b87Var2.N;
                            z = ((i3 != 1 && i4 == 1) || i3 == -1 || i4 == -1) ? false : true;
                            if (!this.I.d()) {
                                zg2Var = this.I;
                                if (z) {
                                    int iC2 = zg2Var.c();
                                    this.G.getClass();
                                    int width = this.G.getWidth();
                                    b87 b87Var3 = this.C;
                                    b87Var3.getClass();
                                    int i5 = width / b87Var3.M;
                                    int height = this.G.getHeight();
                                    b87 b87Var4 = this.C;
                                    b87Var4.getClass();
                                    int i6 = height / b87Var4.N;
                                    int i7 = this.C.M;
                                    bitmapCreateBitmap = Bitmap.createBitmap(this.G, (iC2 % i7) * i5, (iC2 / i7) * i6, i5, i6);
                                } else {
                                    bitmapCreateBitmap = this.G;
                                    bitmapCreateBitmap.getClass();
                                }
                                zg2Var.g(bitmapCreateBitmap);
                            }
                            this.I.b().getClass();
                            long jA = this.I.a() - j;
                            if (this.h == 2) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            i = this.B;
                            if (i != 0) {
                                if (i != 1) {
                                    z2 = true;
                                } else {
                                    if (i == 3) {
                                        c.t();
                                        return false;
                                    }
                                    z2 = false;
                                }
                            }
                            if (!z2 || jA < WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                                u68 u68Var = this.F;
                                long j2 = this.x.b;
                                u68Var.getClass();
                                zg2 zg2Var2 = this.I;
                                zg2Var2.getClass();
                                long jA2 = zg2Var2.a();
                                this.y = jA2;
                                while (!arrayDeque.isEmpty() && jA2 >= ((r78) arrayDeque.peek()).a) {
                                    this.x = (r78) arrayDeque.removeFirst();
                                }
                                this.B = 3;
                                if (z) {
                                    zg2 zg2Var3 = this.I;
                                    zg2Var3.getClass();
                                    iC = zg2Var3.c();
                                    b87 b87Var5 = this.C;
                                    b87Var5.getClass();
                                    i2 = b87Var5.N;
                                    b87Var = this.C;
                                    b87Var.getClass();
                                    if (iC == (i2 * b87Var.M) - 1) {
                                        this.G = null;
                                    }
                                } else {
                                    this.G = null;
                                }
                                this.I = this.J;
                                this.J = null;
                                return true;
                            }
                        }
                    } else {
                        if (this.A == 3) {
                            J();
                            this.C.getClass();
                            I();
                            return false;
                        }
                        sx0VarK.r();
                        if (arrayDeque.isEmpty()) {
                            this.w = true;
                            return false;
                        }
                    }
                }
            } else if (this.H) {
                this.C.getClass();
                b87 b87Var6 = this.C;
                int i8 = b87Var6.M;
                int i9 = b87Var6.N;
                if (i8 != 1) {
                }
                if (!this.I.d()) {
                    zg2Var = this.I;
                    if (z) {
                        int iC3 = zg2Var.c();
                        this.G.getClass();
                        int width2 = this.G.getWidth();
                        b87 b87Var7 = this.C;
                        b87Var7.getClass();
                        int i10 = width2 / b87Var7.M;
                        int height2 = this.G.getHeight();
                        b87 b87Var8 = this.C;
                        b87Var8.getClass();
                        int i11 = height2 / b87Var8.N;
                        int i12 = this.C.M;
                        bitmapCreateBitmap = Bitmap.createBitmap(this.G, (iC3 % i12) * i10, (iC3 / i12) * i11, i10, i11);
                    } else {
                        bitmapCreateBitmap = this.G;
                        bitmapCreateBitmap.getClass();
                    }
                    zg2Var.g(bitmapCreateBitmap);
                }
                this.I.b().getClass();
                long jA3 = this.I.a() - j;
                if (this.h == 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                i = this.B;
                if (i != 0) {
                    if (i != 1) {
                        z2 = true;
                    } else {
                        if (i == 3) {
                            c.t();
                            return false;
                        }
                        z2 = false;
                    }
                }
                if (!z2) {
                }
                u68 u68Var2 = this.F;
                long j3 = this.x.b;
                u68Var2.getClass();
                zg2 zg2Var4 = this.I;
                zg2Var4.getClass();
                long jA4 = zg2Var4.a();
                this.y = jA4;
                while (!arrayDeque.isEmpty()) {
                    this.x = (r78) arrayDeque.removeFirst();
                }
                this.B = 3;
                if (z) {
                    zg2 zg2Var5 = this.I;
                    zg2Var5.getClass();
                    iC = zg2Var5.c();
                    b87 b87Var9 = this.C;
                    b87Var9.getClass();
                    i2 = b87Var9.N;
                    b87Var = this.C;
                    b87Var.getClass();
                    if (iC == (i2 * b87Var.M) - 1) {
                        this.G = null;
                    }
                } else {
                    this.G = null;
                }
                this.I = this.J;
                this.J = null;
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0038  */
    /* JADX WARN: Code duplicated, block: B:23:0x004e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0056  */
    /* JADX WARN: Code duplicated, block: B:27:0x0059  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x0073  */
    /* JADX WARN: Code duplicated, block: B:38:0x007e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0080  */
    /* JADX WARN: Code duplicated, block: B:41:0x0083  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:69:0x010e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0118  */
    /* JADX WARN: Code duplicated, block: B:80:0x0120  */
    /* JADX WARN: Code duplicated, block: B:83:0x0131  */
    /* JADX WARN: Code duplicated, block: B:85:0x0136  */
    /* JADX WARN: Code duplicated, block: B:87:0x0147  */
    /* JADX WARN: Code duplicated, block: B:88:0x014a  */
    /* JADX WARN: Code duplicated, block: B:91:0x0156  */
    public final boolean H(long j) {
        int i;
        u55 u55Var;
        int iW;
        ByteBuffer byteBuffer;
        u55 u55Var2;
        boolean z;
        u55 u55Var3;
        zg2 zg2Var;
        long jA;
        boolean z2;
        zg2 zg2Var2;
        boolean z3;
        b87 b87Var;
        boolean z4;
        boolean z5;
        u55 u55Var4;
        if (!this.H || this.I == null) {
            v2a v2aVar = this.c;
            v2aVar.k();
            tx0 tx0Var = this.D;
            if (tx0Var != null && this.A != 3 && !this.v) {
                if (this.E == null) {
                    u55 u55Var5 = (u55) tx0Var.e();
                    this.E = u55Var5;
                    if (u55Var5 != null) {
                        i = this.A;
                        u55Var = this.E;
                        if (i == 2) {
                            u55Var.getClass();
                            this.E.a = 4;
                            tx0 tx0Var2 = this.D;
                            tx0Var2.getClass();
                            tx0Var2.c(this.E);
                            this.E = null;
                            this.A = 3;
                            return false;
                        }
                        iW = w(v2aVar, u55Var, 0);
                        if (iW != -5) {
                            b87 b87Var2 = (b87) v2aVar.c;
                            b87Var2.getClass();
                            this.C = b87Var2;
                            this.X = true;
                            this.A = 2;
                            return true;
                        }
                        if (iW != -4) {
                            this.E.t();
                            byteBuffer = this.E.d;
                            if (byteBuffer != null || byteBuffer.remaining() <= 0) {
                                u55Var2 = this.E;
                                u55Var2.getClass();
                                if (u55Var2.d(4)) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            } else {
                                z = true;
                            }
                            if (z) {
                                u55 u55Var6 = this.E;
                                u55Var6.getClass();
                                u55Var6.b = this.C;
                                tx0 tx0Var3 = this.D;
                                tx0Var3.getClass();
                                u55 u55Var7 = this.E;
                                u55Var7.getClass();
                                tx0Var3.c(u55Var7);
                                this.K = 0;
                            }
                            u55Var3 = this.E;
                            u55Var3.getClass();
                            if (u55Var3.d(4)) {
                                this.H = true;
                            } else {
                                int i2 = this.K;
                                zg2Var = new zg2(i2, u55Var3.f);
                                this.J = zg2Var;
                                this.K = i2 + 1;
                                if (this.H) {
                                    this.I = this.J;
                                    this.J = null;
                                } else {
                                    jA = zg2Var.a();
                                    if (jA - WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS <= j || j > WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS + jA) {
                                        z2 = false;
                                    } else {
                                        z2 = true;
                                    }
                                    zg2Var2 = this.I;
                                    if (zg2Var2 != null || zg2Var2.a() > j || j >= jA) {
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                    zg2 zg2Var3 = this.J;
                                    zg2Var3.getClass();
                                    b87Var = this.C;
                                    b87Var.getClass();
                                    if (b87Var.M != -1 || this.C.N == -1) {
                                        z4 = true;
                                    } else {
                                        int iC = zg2Var3.c();
                                        b87 b87Var3 = this.C;
                                        b87Var3.getClass();
                                        if (iC == (b87Var3.N * this.C.M) - 1) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                    }
                                    if (!z2 || z3 || z4) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    this.H = z5;
                                    if (z3 || z2) {
                                        this.I = this.J;
                                        this.J = null;
                                    }
                                }
                            }
                            u55Var4 = this.E;
                            u55Var4.getClass();
                            if (u55Var4.d(4)) {
                                this.v = true;
                                this.E = null;
                                return false;
                            }
                            long j2 = this.z;
                            u55 u55Var8 = this.E;
                            u55Var8.getClass();
                            this.z = Math.max(j2, u55Var8.f);
                            if (z) {
                                this.E = null;
                            } else {
                                u55 u55Var9 = this.E;
                                u55Var9.getClass();
                                u55Var9.q();
                            }
                            return !this.H;
                        }
                        if (iW != -3) {
                            c.t();
                            return false;
                        }
                    }
                } else {
                    i = this.A;
                    u55Var = this.E;
                    if (i == 2) {
                        u55Var.getClass();
                        this.E.a = 4;
                        tx0 tx0Var4 = this.D;
                        tx0Var4.getClass();
                        tx0Var4.c(this.E);
                        this.E = null;
                        this.A = 3;
                        return false;
                    }
                    iW = w(v2aVar, u55Var, 0);
                    if (iW != -5) {
                        b87 b87Var4 = (b87) v2aVar.c;
                        b87Var4.getClass();
                        this.C = b87Var4;
                        this.X = true;
                        this.A = 2;
                        return true;
                    }
                    if (iW != -4) {
                        this.E.t();
                        byteBuffer = this.E.d;
                        if (byteBuffer != null) {
                            u55Var2 = this.E;
                            u55Var2.getClass();
                            if (u55Var2.d(4)) {
                                z = true;
                            } else {
                                z = false;
                            }
                        } else {
                            u55Var2 = this.E;
                            u55Var2.getClass();
                            if (u55Var2.d(4)) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        if (z) {
                            u55 u55Var10 = this.E;
                            u55Var10.getClass();
                            u55Var10.b = this.C;
                            tx0 tx0Var5 = this.D;
                            tx0Var5.getClass();
                            u55 u55Var11 = this.E;
                            u55Var11.getClass();
                            tx0Var5.c(u55Var11);
                            this.K = 0;
                        }
                        u55Var3 = this.E;
                        u55Var3.getClass();
                        if (u55Var3.d(4)) {
                            this.H = true;
                        } else {
                            int i3 = this.K;
                            zg2Var = new zg2(i3, u55Var3.f);
                            this.J = zg2Var;
                            this.K = i3 + 1;
                            if (this.H) {
                                jA = zg2Var.a();
                                if (jA - WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS <= j) {
                                    z2 = false;
                                } else {
                                    z2 = false;
                                }
                                zg2Var2 = this.I;
                                if (zg2Var2 != null) {
                                    z3 = false;
                                } else {
                                    z3 = false;
                                }
                                zg2 zg2Var4 = this.J;
                                zg2Var4.getClass();
                                b87Var = this.C;
                                b87Var.getClass();
                                if (b87Var.M != -1) {
                                    z4 = true;
                                } else {
                                    z4 = true;
                                }
                                if (z2) {
                                    z5 = true;
                                } else {
                                    z5 = true;
                                }
                                this.H = z5;
                                if (z3) {
                                    this.I = this.J;
                                    this.J = null;
                                } else {
                                    this.I = this.J;
                                    this.J = null;
                                }
                            } else {
                                this.I = this.J;
                                this.J = null;
                            }
                        }
                        u55Var4 = this.E;
                        u55Var4.getClass();
                        if (u55Var4.d(4)) {
                            this.v = true;
                            this.E = null;
                            return false;
                        }
                        long j3 = this.z;
                        u55 u55Var12 = this.E;
                        u55Var12.getClass();
                        this.z = Math.max(j3, u55Var12.f);
                        if (z) {
                            this.E = null;
                        } else {
                            u55 u55Var13 = this.E;
                            u55Var13.getClass();
                            u55Var13.q();
                        }
                        return !this.H;
                    }
                    if (iW != -3) {
                        c.t();
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public final void I() throws ExoPlaybackException {
        if (this.X) {
            b87 b87Var = this.C;
            b87Var.getClass();
            c1k c1kVar = this.s;
            c1kVar.getClass();
            int iA = c1k.a(b87Var);
            if (iA != ks0.b(4, 0, 0, 0) && iA != ks0.b(3, 0, 0, 0)) {
                throw d(new ImageDecoderException("Provided decoder factory can't create decoder for format."), this.C, false, 4005);
            }
            tx0 tx0Var = this.D;
            if (tx0Var != null) {
                tx0Var.release();
            }
            this.D = new tx0(c1kVar.a);
            this.X = false;
        }
    }

    public final void J() {
        this.E = null;
        this.A = 0;
        this.z = -9223372036854775807L;
        tx0 tx0Var = this.D;
        if (tx0Var != null) {
            tx0Var.release();
            this.D = null;
        }
    }

    @Override // defpackage.ks0, defpackage.e4d
    public final void a(int i, Object obj) {
        if (i != 15) {
            return;
        }
        u68 u68Var = obj instanceof u68 ? (u68) obj : null;
        if (u68Var == null) {
            u68Var = u68.a;
        }
        this.F = u68Var;
    }

    @Override // defpackage.ks0
    public final String h() {
        return "ImageRenderer";
    }

    @Override // defpackage.ks0
    public final boolean j() {
        return this.w;
    }

    @Override // defpackage.ks0
    public final boolean l() {
        int i = this.B;
        if (i != 3) {
            return i == 0 && this.H;
        }
        return true;
    }

    @Override // defpackage.ks0
    public final void m() {
        this.C = null;
        this.x = r78.c;
        this.u.clear();
        J();
        this.F.getClass();
    }

    @Override // defpackage.ks0
    public final void n(boolean z, boolean z2) {
        this.B = z2 ? 1 : 0;
    }

    @Override // defpackage.ks0
    public final void p(long j, boolean z, boolean z2) {
        this.B = Math.min(this.B, 1);
        this.w = false;
        this.v = false;
        this.G = null;
        this.I = null;
        this.J = null;
        this.H = false;
        this.E = null;
        tx0 tx0Var = this.D;
        if (tx0Var != null) {
            tx0Var.flush();
        }
        this.u.clear();
    }

    @Override // defpackage.ks0
    public final void q() {
        J();
    }

    @Override // defpackage.ks0
    public final void r() {
        J();
        this.B = Math.min(this.B, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // defpackage.ks0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(defpackage.b87[] r5, long r6, long r8, defpackage.x4a r10) {
        /*
            r4 = this;
            r78 r5 = r4.x
            long r5 = r5.b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 == 0) goto L31
            java.util.ArrayDeque r5 = r4.u
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L26
            long r6 = r4.z
            int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r10 == 0) goto L31
            long r2 = r4.y
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 == 0) goto L26
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 < 0) goto L26
            goto L31
        L26:
            r78 r6 = new r78
            long r0 = r4.z
            r6.<init>(r0, r8)
            r5.add(r6)
            return
        L31:
            r78 r5 = new r78
            r5.<init>(r0, r8)
            r4.x = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s78.u(b87[], long, long, x4a):void");
    }

    @Override // defpackage.ks0
    public final void y(long j, long j2) throws ExoPlaybackException {
        if (this.w) {
            return;
        }
        if (this.C == null) {
            v2a v2aVar = this.c;
            v2aVar.k();
            u55 u55Var = this.t;
            u55Var.q();
            int iW = w(v2aVar, u55Var, 2);
            if (iW != -5) {
                if (iW == -4) {
                    lvb.b0(u55Var.d(4));
                    this.v = true;
                    this.w = true;
                    return;
                }
                return;
            }
            b87 b87Var = (b87) v2aVar.c;
            b87Var.getClass();
            this.C = b87Var;
            this.X = true;
        }
        if (this.D == null) {
            I();
        }
        try {
            iyl.b("drainAndFeedDecoder");
            while (G(j)) {
            }
            while (H(j)) {
            }
            iyl.c();
        } catch (ImageDecoderException e) {
            throw d(e, null, false, 4003);
        }
    }
}
