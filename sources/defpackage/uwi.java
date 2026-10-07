package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.view.Surface;
import androidx.work.WorkRequest;

/* JADX INFO: loaded from: classes.dex */
public final class uwi {
    public final zt9 a;
    public final axi b;
    public final long c;
    public boolean d;
    public long g;
    public boolean j;
    public boolean m;
    public boolean n;
    public int e = 0;
    public long f = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public long i = -9223372036854775807L;
    public float k = 1.0f;
    public qt3 l = qt3.a;

    public uwi(Context context, zt9 zt9Var, long j) {
        this.a = zt9Var;
        this.c = j;
        this.b = new axi(context);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:101:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:103:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:106:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:109:0x0204  */
    /* JADX WARN: Code duplicated, block: B:110:0x0206  */
    /* JADX WARN: Code duplicated, block: B:111:0x020a  */
    /* JADX WARN: Code duplicated, block: B:114:0x021c  */
    /* JADX WARN: Code duplicated, block: B:115:0x0220  */
    /* JADX WARN: Code duplicated, block: B:147:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:150:0x02b3 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:152:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:161:0x02c9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0082  */
    /* JADX WARN: Code duplicated, block: B:86:0x017c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:87:0x017d  */
    /* JADX WARN: Code duplicated, block: B:94:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:98:0x01b5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final int a(long j, long j2, long j3, long j4, boolean z, boolean z2, gn5 gn5Var) {
        long j5;
        long j6;
        long j7;
        int i;
        int i2;
        boolean z3;
        long jNanoTime;
        axi axiVar;
        long j8;
        int i3;
        int i4;
        wwi wwiVar;
        long j9;
        long j10;
        long j11;
        long j12;
        long j13;
        boolean z4;
        long j14;
        float f;
        float f2;
        long j15;
        vw6 vw6Var;
        long j16;
        uw6 uw6Var;
        long j17;
        gn5Var.a = -9223372036854775807L;
        gn5Var.b = -9223372036854775807L;
        if (this.d && this.f == -9223372036854775807L) {
            this.f = j2;
        }
        if (this.h != j) {
            axi axiVar2 = this.b;
            j5 = -9223372036854775807L;
            long j18 = axiVar2.n;
            if (j18 != -1) {
                axiVar2.q = j18;
                axiVar2.r = axiVar2.o;
                axiVar2.s = axiVar2.p;
                axiVar2.k = axiVar2.l;
            }
            axiVar2.m++;
            vw6 vw6Var2 = axiVar2.a;
            j6 = 1000;
            long j19 = j * 1000;
            vw6Var2.a.b(j19);
            if (vw6Var2.a.a()) {
                vw6Var2.c = false;
                j7 = 0;
            } else {
                j7 = 0;
                if (vw6Var2.d != -9223372036854775807L) {
                    if (vw6Var2.c) {
                        uw6 uw6Var2 = vw6Var2.b;
                        long j20 = uw6Var2.d;
                        if (j20 == 0 ? false : uw6Var2.g[(int) ((j20 - 1) % 15)]) {
                            vw6Var2.b.c();
                            vw6Var2.b.b(vw6Var2.d);
                        }
                    } else {
                        vw6Var2.b.c();
                        vw6Var2.b.b(vw6Var2.d);
                    }
                    vw6Var2.c = true;
                    vw6Var2.b.b(j19);
                }
            }
            if (vw6Var2.c && vw6Var2.b.a()) {
                uw6 uw6Var3 = vw6Var2.a;
                vw6Var2.a = vw6Var2.b;
                vw6Var2.b = uw6Var3;
                vw6Var2.c = false;
            }
            vw6Var2.d = j19;
            vw6Var2.e = vw6Var2.a.a() ? 0 : vw6Var2.e + 1;
            axiVar2.c();
            this.h = j;
        } else {
            j5 = -9223372036854775807L;
            j6 = 1000;
            j7 = 0;
        }
        long jX = (long) ((j - j2) / ((double) this.k));
        if (this.d) {
            ((nfh) this.l).getClass();
            jX -= vqi.X(SystemClock.elapsedRealtime()) - j3;
        }
        gn5Var.a = jX;
        if (!z || z2) {
            if (this.m) {
                long j21 = -30000;
                if (this.i == j5 || this.j) {
                    int i5 = this.e;
                    if (i5 != 0) {
                        if (i5 == 1) {
                            i = 3;
                            i2 = 5;
                        } else if (i5 == 2) {
                            i = 3;
                            i2 = 5;
                            if (j2 >= j4) {
                            }
                        } else {
                            if (i5 != 3) {
                                c.t();
                                return 0;
                            }
                            ((nfh) this.l).getClass();
                            i = 3;
                            i2 = 5;
                            long jX2 = vqi.X(SystemClock.elapsedRealtime()) - this.g;
                            if (this.d) {
                                long j22 = this.f;
                                if (j22 == j5 || j22 == j2 || jX >= -30000 || jX2 <= 100000) {
                                }
                            }
                        }
                        z3 = true;
                    } else {
                        i = 3;
                        i2 = 5;
                        z3 = this.d;
                    }
                    if (z3) {
                        return 0;
                    }
                    if (this.d && j2 != this.f) {
                        ((nfh) this.l).getClass();
                        jNanoTime = System.nanoTime();
                        axiVar = this.b;
                        j8 = (gn5Var.a * j6) + jNanoTime;
                        if (axiVar.q != -1) {
                            if (axiVar.a.a.a()) {
                                vw6Var = axiVar.a;
                                if (vw6Var.a.a()) {
                                    uw6Var = vw6Var.a;
                                    i4 = 2;
                                    j17 = uw6Var.e;
                                    i3 = 1;
                                    if (j17 == j7) {
                                        j16 = j7;
                                    } else {
                                        j16 = uw6Var.f / j17;
                                    }
                                } else {
                                    i3 = 1;
                                    i4 = 2;
                                    j16 = j5;
                                }
                                f = (axiVar.m - axiVar.q) * j16;
                                f2 = axiVar.i;
                            } else {
                                i3 = 1;
                                i4 = 2;
                                f = (j - axiVar.s) * j6;
                                f2 = axiVar.i;
                            }
                            j15 = axiVar.r + ((long) (f / f2));
                            if (Math.abs(j8 - j15) <= 20000000) {
                                j8 = j15;
                            } else {
                                axiVar.b();
                            }
                        } else {
                            i3 = 1;
                            i4 = 2;
                            j21 = -30000;
                        }
                        axiVar.n = axiVar.m;
                        axiVar.o = j8;
                        axiVar.p = j;
                        wwiVar = axiVar.c;
                        if (wwiVar == null) {
                            j12 = jNanoTime;
                        } else {
                            j9 = wwiVar.c;
                            long j23 = axiVar.c.d;
                            if (j9 != j5 || j23 == j5) {
                                j12 = jNanoTime;
                            } else {
                                long j24 = (((j8 - j9) / j23) * j23) + j9;
                                if (j8 <= j24) {
                                    j10 = j24 - j23;
                                } else {
                                    j24 += j23;
                                    j10 = j24;
                                }
                                long j25 = j24 - j8;
                                long j26 = j8 - j10;
                                long jAbs = Math.abs(j25 - j26);
                                if (jAbs < j23 / 2) {
                                    j11 = j10;
                                    long j27 = j23 / 4;
                                    if (jAbs < j27) {
                                        j12 = jNanoTime;
                                        long j28 = axiVar.k;
                                        if (j28 != j7) {
                                            axiVar.l = j28;
                                        } else {
                                            if (j25 < j26) {
                                                j27 = -j27;
                                            }
                                            axiVar.l = j27;
                                        }
                                    } else {
                                        j12 = jNanoTime;
                                        axiVar.l = j7;
                                    }
                                } else {
                                    j11 = j10;
                                    j12 = jNanoTime;
                                    axiVar.l = axiVar.k;
                                }
                                if (j25 + axiVar.l >= j26) {
                                    j24 = j11;
                                }
                                j8 = j24 - ((j23 * 80) / 100);
                            }
                        }
                        gn5Var.b = j8;
                        j13 = (j8 - j12) / j6;
                        gn5Var.a = j13;
                        if (this.i != j5 || this.j) {
                            z4 = 0;
                        } else {
                            z4 = i3;
                        }
                        if (this.a.P0(j13, j2, z2, z4)) {
                            return 4;
                        }
                        j14 = gn5Var.a;
                        if (j14 >= j21 && !z2) {
                            return z4 != 0 ? i : i4;
                        }
                        if (j14 > 50000) {
                            return i3;
                        }
                    }
                    return i2;
                }
                i = 3;
                i2 = 5;
                z3 = false;
                if (z3) {
                    return 0;
                }
                if (this.d) {
                    ((nfh) this.l).getClass();
                    jNanoTime = System.nanoTime();
                    axiVar = this.b;
                    j8 = (gn5Var.a * j6) + jNanoTime;
                    if (axiVar.q != -1) {
                        if (axiVar.a.a.a()) {
                            vw6Var = axiVar.a;
                            if (vw6Var.a.a()) {
                                uw6Var = vw6Var.a;
                                i4 = 2;
                                j17 = uw6Var.e;
                                i3 = 1;
                                if (j17 == j7) {
                                    j16 = j7;
                                } else {
                                    j16 = uw6Var.f / j17;
                                }
                            } else {
                                i3 = 1;
                                i4 = 2;
                                j16 = j5;
                            }
                            f = (axiVar.m - axiVar.q) * j16;
                            f2 = axiVar.i;
                        } else {
                            i3 = 1;
                            i4 = 2;
                            f = (j - axiVar.s) * j6;
                            f2 = axiVar.i;
                        }
                        j15 = axiVar.r + ((long) (f / f2));
                        if (Math.abs(j8 - j15) <= 20000000) {
                            j8 = j15;
                        } else {
                            axiVar.b();
                        }
                    } else {
                        i3 = 1;
                        i4 = 2;
                        j21 = -30000;
                    }
                    axiVar.n = axiVar.m;
                    axiVar.o = j8;
                    axiVar.p = j;
                    wwiVar = axiVar.c;
                    if (wwiVar == null) {
                        j12 = jNanoTime;
                    } else {
                        j9 = wwiVar.c;
                        long j29 = axiVar.c.d;
                        if (j9 != j5) {
                            j12 = jNanoTime;
                        } else {
                            j12 = jNanoTime;
                        }
                    }
                    gn5Var.b = j8;
                    j13 = (j8 - j12) / j6;
                    gn5Var.a = j13;
                    if (this.i != j5) {
                        z4 = 0;
                    } else {
                        z4 = 0;
                    }
                    if (this.a.P0(j13, j2, z2, z4)) {
                        return 4;
                    }
                    j14 = gn5Var.a;
                    if (j14 >= j21) {
                    }
                    if (j14 > 50000) {
                        return i3;
                    }
                }
                return i2;
            }
            if (this.a.P0(jX, j2, z2, true)) {
                return 4;
            }
            if (!this.d || gn5Var.a >= WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                this.n = true;
                return 5;
            }
        }
        return 3;
    }

    public final boolean b(boolean z) {
        if (z && (this.e == 3 || (!this.m && this.n))) {
            this.i = -9223372036854775807L;
            return true;
        }
        if (this.i == -9223372036854775807L) {
            return false;
        }
        ((nfh) this.l).getClass();
        if (SystemClock.elapsedRealtime() < this.i) {
            return true;
        }
        this.i = -9223372036854775807L;
        return false;
    }

    public final void c(boolean z) {
        long jElapsedRealtime;
        this.j = z;
        long j = this.c;
        if (j > 0) {
            ((nfh) this.l).getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime() + j;
        } else {
            jElapsedRealtime = -9223372036854775807L;
        }
        this.i = jElapsedRealtime;
    }

    public final void d() {
        this.d = true;
        ((nfh) this.l).getClass();
        this.g = vqi.X(SystemClock.elapsedRealtime());
        axi axiVar = this.b;
        axiVar.d = true;
        axiVar.b();
        wwi wwiVarA = wwi.a(axiVar.b);
        axiVar.c = wwiVarA;
        if (wwiVarA != null) {
            wwiVarA.b();
        }
        axiVar.d(false);
    }

    public final void e(int i) {
        if (i == 0) {
            this.e = 1;
        } else if (i == 1) {
            this.e = 0;
        } else {
            if (i != 2) {
                c.t();
                return;
            }
            this.e = Math.min(this.e, 2);
        }
        this.b.b();
    }

    public final void f(float f) {
        axi axiVar = this.b;
        axiVar.f = f;
        vw6 vw6Var = axiVar.a;
        vw6Var.a.c();
        vw6Var.b.c();
        vw6Var.c = false;
        vw6Var.d = -9223372036854775807L;
        vw6Var.e = 0;
        axiVar.c();
    }

    public final void g(Surface surface) {
        this.m = surface != null;
        this.n = false;
        axi axiVar = this.b;
        if (axiVar.e != surface) {
            axiVar.a();
            axiVar.e = surface;
            axiVar.d(true);
        }
        this.e = Math.min(this.e, 1);
    }

    public final void h(float f) {
        lvb.R(f > 0.0f);
        if (f == this.k) {
            return;
        }
        this.k = f;
        axi axiVar = this.b;
        axiVar.i = f;
        axiVar.d(false);
    }
}
