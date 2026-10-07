package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class es8 implements hs8 {
    public final p41 a = yab.b(Integer.MAX_VALUE, 0, null, 6);
    public final i64 b = new i64();

    public final void a(Object obj) {
        this.a.i(null);
        this.b.Q(new roe(obj));
    }

    public final void b(Throwable th) {
        this.a.i(null);
        this.b.j0(th);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object c(qf7 qf7Var, nq4 nq4Var) {
        bs8 bs8Var;
        int i;
        Object obj;
        int i2;
        qf7 qf7Var2;
        if (nq4Var instanceof bs8) {
            bs8Var = (bs8) nq4Var;
            int i3 = bs8Var.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bs8Var.j = i3 - Integer.MIN_VALUE;
            } else {
                bs8Var = new bs8(this, nq4Var);
            }
        } else {
            bs8Var = new bs8(this, nq4Var);
        }
        Object obj2 = bs8Var.h;
        int i4 = bs8Var.j;
        Object obj3 = hu4.a;
        try {
            if (i4 == 0) {
                ch3.d0(obj2);
                i64 i64Var = this.b;
                bs8Var.d = (mdh) qf7Var;
                bs8Var.e = this;
                i = 0;
                bs8Var.f = 0;
                bs8Var.g = 0;
                bs8Var.j = 1;
                Object objP = i64Var.p(bs8Var);
                if (objP != obj3) {
                    obj = objP;
                    i2 = 0;
                    qf7Var2 = qf7Var;
                }
            }
            if (i4 != 1) {
                if (i4 != 2) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                es8 es8Var = bs8Var.e;
                ch3.d0(obj2);
                return es8Var;
            }
            int i5 = bs8Var.g;
            int i6 = bs8Var.f;
            es8 es8Var2 = bs8Var.e;
            qf7 qf7Var3 = (qf7) bs8Var.d;
            try {
                ch3.d0(obj2);
                i = i5;
                this = es8Var2;
                i2 = i6;
                qf7Var2 = qf7Var3;
                obj = obj2;
            } catch (Throwable unused) {
                return es8Var2;
            }
            Object obj4 = ((roe) obj).a;
            if (obj4 instanceof poe) {
                return this;
            }
            ch3.d0(obj4);
            bs8Var.d = null;
            bs8Var.e = this;
            bs8Var.f = i2;
            bs8Var.g = i;
            bs8Var.j = 2;
            return qf7Var2.invoke(obj4, bs8Var) == obj3 ? obj3 : this;
        } catch (Throwable unused2) {
            return this;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008b A[Catch: all -> 0x00ac, TryCatch #4 {all -> 0x00ac, blocks: (B:32:0x0083, B:34:0x008b, B:36:0x0091, B:43:0x00ae, B:44:0x00b5), top: B:67:0x0083 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0091 A[Catch: all -> 0x00ac, TryCatch #4 {all -> 0x00ac, blocks: (B:32:0x0083, B:34:0x008b, B:36:0x0091, B:43:0x00ae, B:44:0x00b5), top: B:67:0x0083 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ae A[Catch: all -> 0x00ac, TryCatch #4 {all -> 0x00ac, blocks: (B:32:0x0083, B:34:0x008b, B:36:0x0091, B:43:0x00ae, B:44:0x00b5), top: B:67:0x0083 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:57:0x00de A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(qf7 qf7Var, nq4 nq4Var) {
        cs8 cs8Var;
        qf7 qf7Var2;
        int i;
        Object obj;
        int i2;
        Object obj2;
        qf7 qf7Var3;
        Throwable thA;
        es8 es8Var;
        int i3;
        Object poeVar;
        Throwable thA2;
        if (nq4Var instanceof cs8) {
            cs8Var = (cs8) nq4Var;
            int i4 = cs8Var.k;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                cs8Var.k = i4 - Integer.MIN_VALUE;
            } else {
                cs8Var = new cs8(this, nq4Var);
            }
        } else {
            cs8Var = new cs8(this, nq4Var);
        }
        Object obj3 = cs8Var.i;
        int i5 = cs8Var.k;
        hu4 hu4Var = hu4.a;
        if (i5 == 0) {
            ch3.d0(obj3);
            try {
                i64 i64Var = this.b;
                cs8Var.d = qf7Var;
                cs8Var.e = this;
                cs8Var.f = null;
                cs8Var.g = 0;
                cs8Var.h = 0;
                cs8Var.k = 1;
                Object objP = i64Var.p(cs8Var);
                if (objP != hu4Var) {
                    qf7Var2 = qf7Var;
                    obj = objP;
                    i = 0;
                    i2 = 0;
                    obj2 = ((roe) obj).a;
                    if (obj2 instanceof poe) {
                        thA = roe.a(obj2);
                        if (thA != null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cs8Var.d = qf7Var2;
                        cs8Var.e = this;
                        cs8Var.f = null;
                        cs8Var.g = i;
                        cs8Var.h = i2;
                        cs8Var.k = 2;
                        if (qf7Var2.invoke(thA, cs8Var) == hu4Var) {
                            int i6 = i;
                            es8Var = this;
                            i3 = i6;
                            qf7Var3 = qf7Var2;
                            es8 es8Var2 = es8Var;
                            i = i3;
                            this = es8Var2;
                            poeVar = sbi.a;
                            thA2 = roe.a(poeVar);
                            if (thA2 != null) {
                                return this;
                            }
                            cs8Var.d = null;
                            cs8Var.e = this;
                            cs8Var.f = poeVar;
                            cs8Var.g = i;
                            cs8Var.h = 0;
                            cs8Var.k = 3;
                            if (qf7Var3.invoke(thA2, cs8Var) != hu4Var) {
                                return this;
                            }
                        }
                    } else {
                        qf7Var3 = qf7Var2;
                        poeVar = sbi.a;
                        thA2 = roe.a(poeVar);
                        if (thA2 != null) {
                            return this;
                        }
                        cs8Var.d = null;
                        cs8Var.e = this;
                        cs8Var.f = poeVar;
                        cs8Var.g = i;
                        cs8Var.h = 0;
                        cs8Var.k = 3;
                        if (qf7Var3.invoke(thA2, cs8Var) != hu4Var) {
                            return this;
                        }
                    }
                }
            } catch (Throwable th) {
                th = th;
                qf7Var2 = qf7Var;
                i = 0;
                poeVar = new poe(th);
                qf7Var3 = qf7Var2;
                thA2 = roe.a(poeVar);
                if (thA2 != null) {
                    return this;
                }
                cs8Var.d = null;
                cs8Var.e = this;
                cs8Var.f = poeVar;
                cs8Var.g = i;
                cs8Var.h = 0;
                cs8Var.k = 3;
                if (qf7Var3.invoke(thA2, cs8Var) != hu4Var) {
                    return hu4Var;
                }
                return this;
            }
        } else if (i5 == 1) {
            int i7 = cs8Var.h;
            i = cs8Var.g;
            es8 es8Var3 = cs8Var.e;
            qf7Var2 = cs8Var.d;
            try {
                ch3.d0(obj3);
                i2 = i7;
                this = es8Var3;
                obj = obj3;
                try {
                    obj2 = ((roe) obj).a;
                    if (obj2 instanceof poe) {
                        thA = roe.a(obj2);
                        if (thA != null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        cs8Var.d = qf7Var2;
                        cs8Var.e = this;
                        cs8Var.f = null;
                        cs8Var.g = i;
                        cs8Var.h = i2;
                        cs8Var.k = 2;
                        if (qf7Var2.invoke(thA, cs8Var) == hu4Var) {
                            int i8 = i;
                            es8Var = this;
                            i3 = i8;
                            qf7Var3 = qf7Var2;
                            es8 es8Var4 = es8Var;
                            i = i3;
                            this = es8Var4;
                            poeVar = sbi.a;
                            thA2 = roe.a(poeVar);
                            if (thA2 != null) {
                                return this;
                            }
                            cs8Var.d = null;
                            cs8Var.e = this;
                            cs8Var.f = poeVar;
                            cs8Var.g = i;
                            cs8Var.h = 0;
                            cs8Var.k = 3;
                            if (qf7Var3.invoke(thA2, cs8Var) != hu4Var) {
                                return this;
                            }
                        }
                    } else {
                        qf7Var3 = qf7Var2;
                        poeVar = sbi.a;
                        thA2 = roe.a(poeVar);
                        if (thA2 != null) {
                            return this;
                        }
                        cs8Var.d = null;
                        cs8Var.e = this;
                        cs8Var.f = poeVar;
                        cs8Var.g = i;
                        cs8Var.h = 0;
                        cs8Var.k = 3;
                        if (qf7Var3.invoke(thA2, cs8Var) != hu4Var) {
                            return this;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    poeVar = new poe(th);
                    qf7Var3 = qf7Var2;
                }
            } catch (Throwable th3) {
                th = th3;
                this = es8Var3;
                poeVar = new poe(th);
                qf7Var3 = qf7Var2;
                thA2 = roe.a(poeVar);
                if (thA2 != null) {
                    return this;
                }
                cs8Var.d = null;
                cs8Var.e = this;
                cs8Var.f = poeVar;
                cs8Var.g = i;
                cs8Var.h = 0;
                cs8Var.k = 3;
                if (qf7Var3.invoke(thA2, cs8Var) != hu4Var) {
                    return hu4Var;
                }
                return this;
            }
        } else {
            if (i5 != 2) {
                if (i5 != 3) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                es8 es8Var5 = cs8Var.e;
                ch3.d0(obj3);
                return es8Var5;
            }
            i3 = cs8Var.g;
            es8Var = cs8Var.e;
            qf7Var3 = cs8Var.d;
            try {
                ch3.d0(obj3);
                es8 es8Var6 = es8Var;
                i = i3;
                this = es8Var6;
                try {
                    poeVar = sbi.a;
                } catch (Throwable th4) {
                    th = th4;
                    qf7Var2 = qf7Var3;
                    poeVar = new poe(th);
                    qf7Var3 = qf7Var2;
                }
            } catch (Throwable th5) {
                th = th5;
                i = i3;
                this = es8Var;
                qf7Var2 = qf7Var3;
                poeVar = new poe(th);
                qf7Var3 = qf7Var2;
                thA2 = roe.a(poeVar);
                if (thA2 != null) {
                    return this;
                }
                cs8Var.d = null;
                cs8Var.e = this;
                cs8Var.f = poeVar;
                cs8Var.g = i;
                cs8Var.h = 0;
                cs8Var.k = 3;
                if (qf7Var3.invoke(thA2, cs8Var) != hu4Var) {
                    return hu4Var;
                }
                return this;
            }
            thA2 = roe.a(poeVar);
            if (thA2 != null) {
                return this;
            }
            cs8Var.d = null;
            cs8Var.e = this;
            cs8Var.f = poeVar;
            cs8Var.g = i;
            cs8Var.h = 0;
            cs8Var.k = 3;
            if (qf7Var3.invoke(thA2, cs8Var) != hu4Var) {
                return this;
            }
        }
        return hu4Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(nhj nhjVar, nq4 nq4Var) {
        ds8 ds8Var;
        if (nq4Var instanceof ds8) {
            ds8Var = (ds8) nq4Var;
            int i = ds8Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                ds8Var.g = i - Integer.MIN_VALUE;
            } else {
                ds8Var = new ds8(this, nq4Var);
            }
        } else {
            ds8Var = new ds8(this, nq4Var);
        }
        Object obj = ds8Var.e;
        int i2 = ds8Var.g;
        int i3 = 1;
        lq4 lq4Var = null;
        if (i2 != 0) {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            es8 es8Var = ds8Var.d;
            ch3.d0(obj);
            return es8Var;
        }
        ch3.d0(obj);
        b67 b67Var = new b67(this, nhjVar, lq4Var, i3);
        ds8Var.d = this;
        ds8Var.g = 1;
        Object objK = cqk.k(b67Var, ds8Var);
        hu4 hu4Var = hu4.a;
        return objK == hu4Var ? hu4Var : this;
    }
}
