package defpackage;

import java.io.Serializable;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class l01 {
    public final ny8 a;
    public final ny8 b;
    public final String c = l01.class.getName();

    public l01(ny8 ny8Var, ny8 ny8Var2) {
        this.a = ny8Var;
        this.b = ny8Var2;
    }

    public static final Object a(l01 l01Var, f01 f01Var) {
        Object objK0 = yab.K0(((n0c) ((xhh) l01Var.b.getValue())).b(), new m5(l01Var, null, 9), f01Var);
        return objK0 == hu4.a ? objK0 : sbi.a;
    }

    public static final Object b(l01 l01Var, long j, m01 m01Var, j01 j01Var) {
        Object objK0 = yab.K0(((n0c) ((xhh) l01Var.b.getValue())).b(), new vq(m01Var, l01Var, j, (lq4) null), j01Var);
        return objK0 == hu4.a ? objK0 : sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v8 */
    public final Object c(nq4 nq4Var) {
        f01 f01Var;
        if (nq4Var instanceof f01) {
            f01Var = (f01) nq4Var;
            int i = f01Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                f01Var.f = i - Integer.MIN_VALUE;
            } else {
                f01Var = new f01(this, nq4Var);
            }
        } else {
            f01Var = new f01(this, nq4Var);
        }
        Object obj = f01Var.d;
        int i2 = f01Var.f;
        try {
            if (i2 == 0) {
                ch3.d0(obj);
                f01Var.f = 1;
                Object objA = a(this, f01Var);
                hu4 hu4Var = hu4.a;
                this = objA;
                if (objA == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                this = this;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            gm0.V(this.c, "Failed to delete all botCommands", th);
        }
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0060 A[Catch: all -> 0x0063, CancellationException -> 0x006f, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x006f, blocks: (B:12:0x0024, B:28:0x005c, B:30:0x0060, B:19:0x0038, B:20:0x0040, B:21:0x0046, B:23:0x004b), top: B:50:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0066 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable d(long j, nq4 nq4Var) {
        i01 i01Var;
        Throwable th;
        Throwable th2;
        if (nq4Var instanceof i01) {
            i01Var = (i01) nq4Var;
            int i = i01Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                i01Var.g = i - Integer.MIN_VALUE;
            } else {
                i01Var = new i01(this, nq4Var);
            }
        } else {
            i01Var = new i01(this, nq4Var);
        }
        Object objK0 = i01Var.e;
        int i2 = i01Var.g;
        lq4 lq4Var = null;
        try {
            if (i2 == 0) {
                ch3.d0(objK0);
                try {
                    try {
                        xt4 xt4VarB = ((n0c) ((xhh) this.b.getValue())).b();
                        try {
                            this = this;
                            j = j;
                            try {
                                i20 i20Var = new i20(this, j, lq4Var, 2);
                                i01Var.d = j;
                                i01Var.g = 1;
                                objK0 = yab.K0(xt4VarB, i20Var, i01Var);
                                hu4 hu4Var = hu4.a;
                                if (objK0 == hu4Var) {
                                    return hu4Var;
                                }
                                j = j;
                                if (objK0 instanceof m01) {
                                    return (m01) objK0;
                                }
                                return null;
                            } catch (Throwable th3) {
                                th2 = th3;
                                j = j;
                                gm0.l(this.c, "Failed to load botCommands, chatId = %d, exception message = " + j, th2);
                                return null;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            this = this;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        th2 = th;
                        j = j;
                        gm0.l(this.c, "Failed to load botCommands, chatId = %d, exception message = " + j, th2);
                        return null;
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j = i01Var.d;
                try {
                    ch3.d0(objK0);
                    this = this;
                    try {
                        if (objK0 instanceof m01) {
                            return (m01) objK0;
                        }
                        return null;
                    } catch (Throwable th7) {
                        th = th7;
                    }
                } catch (Throwable th8) {
                    th2 = th8;
                    this = this;
                }
            }
            th2 = th;
            gm0.l(this.c, "Failed to load botCommands, chatId = %d, exception message = " + j, th2);
            return null;
        } catch (CancellationException e) {
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v8 */
    public final Object e(long j, m01 m01Var, nq4 nq4Var) {
        j01 j01Var;
        if (nq4Var instanceof j01) {
            j01Var = (j01) nq4Var;
            int i = j01Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                j01Var.f = i - Integer.MIN_VALUE;
            } else {
                j01Var = new j01(this, nq4Var);
            }
        } else {
            j01Var = new j01(this, nq4Var);
        }
        Object obj = j01Var.d;
        int i2 = j01Var.f;
        try {
            if (i2 == 0) {
                ch3.d0(obj);
                j01Var.f = 1;
                Object objB = b(this, j, m01Var, j01Var);
                hu4 hu4Var = hu4.a;
                this = objB;
                if (objB == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                this = this;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            gm0.V(this.c, "Failed to store botCommands", th);
        }
        return sbi.a;
    }
}
