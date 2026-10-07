package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public final class ie4 implements fe4 {
    public final zad a;
    public final zad b;
    public final zpe c = new zpe(21);
    public final ThreadLocal d = new ThreadLocal();
    public volatile boolean e;
    public final long f;
    public final int g;

    public ie4(final kzi kziVar, final String str, int i) {
        ghb ghbVar = ew5.b;
        this.f = qe7.O(30, lw5.SECONDS);
        this.g = 2;
        if (i <= 0) {
            ore.p("Maximum number of readers must be greater than 0");
            throw null;
        }
        final int i2 = 0;
        this.a = new zad(i, new af7() { // from class: ge4
            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                String str2 = str;
                kzi kziVar2 = kziVar;
                switch (i3) {
                    case 0:
                        qxe qxeVarA = kziVar2.a(str2);
                        n1g.u(qxeVarA, "PRAGMA query_only = 1");
                        return qxeVarA;
                    default:
                        return kziVar2.a(str2);
                }
            }
        });
        final int i3 = 1;
        this.b = new zad(1, new af7() { // from class: ge4
            @Override // defpackage.af7
            public final Object invoke() {
                int i4 = i3;
                String str2 = str;
                kzi kziVar2 = kziVar;
                switch (i4) {
                    case 0:
                        qxe qxeVarA = kziVar2.a(str2);
                        n1g.u(qxeVarA, "PRAGMA query_only = 1");
                        return qxeVarA;
                    default:
                        return kziVar2.a(str2);
                }
            }
        });
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.a.c();
        this.b.c();
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0135  */
    /* JADX WARN: Code duplicated, block: B:71:0x0141 A[Catch: all -> 0x019b, TRY_LEAVE, TryCatch #3 {all -> 0x019b, blocks: (B:64:0x0120, B:69:0x0136, B:71:0x0141, B:86:0x019f, B:87:0x01a6), top: B:113:0x0120 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0172  */
    /* JADX WARN: Code duplicated, block: B:77:0x017a  */
    /* JADX WARN: Code duplicated, block: B:79:0x017e  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:81:0x018b  */
    /* JADX WARN: Code duplicated, block: B:86:0x019f A[Catch: all -> 0x019b, TRY_ENTER, TryCatch #3 {all -> 0x019b, blocks: (B:64:0x0120, B:69:0x0136, B:71:0x0141, B:86:0x019f, B:87:0x01a6), top: B:113:0x0120 }] */
    @Override // defpackage.fe4
    public final Object h(boolean z, qf7 qf7Var, nq4 nq4Var) throws IllegalAccessException, InvocationTargetException {
        he4 he4Var;
        wfe wfeVar;
        Throwable th;
        zad zadVar;
        qf7 qf7Var2;
        zpe zpeVar;
        vt4 vt4Var;
        zad zadVar2;
        wfe wfeVar2;
        boolean z2;
        Object obj;
        wfe wfeVar3;
        obd obdVar;
        boolean z3 = z;
        if (nq4Var instanceof he4) {
            he4Var = (he4) nq4Var;
            int i = he4Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                he4Var.m = i - Integer.MIN_VALUE;
            } else {
                he4Var = new he4(this, nq4Var);
            }
        } else {
            he4Var = new he4(this, nq4Var);
        }
        Object objK0 = he4Var.k;
        hu4 hu4Var = hu4.a;
        int i2 = he4Var.m;
        if (i2 != 0) {
            if (i2 == 1) {
                ch3.d0(objK0);
                return objK0;
            }
            if (i2 == 2) {
                ch3.d0(objK0);
                return objK0;
            }
            if (i2 == 3) {
                z3 = he4Var.d;
                zpeVar = he4Var.j;
                wfe wfeVar4 = he4Var.i;
                vt4 vt4Var2 = he4Var.h;
                wfe wfeVar5 = he4Var.g;
                zadVar2 = (zad) he4Var.f;
                qf7Var2 = (qf7) he4Var.e;
                try {
                    ch3.d0(objK0);
                    wfeVar2 = wfeVar4;
                    wfeVar = wfeVar5;
                    vt4Var = vt4Var2;
                    try {
                        af4 af4Var = (af4) objK0;
                        af4Var.c = vt4Var;
                        af4Var.d = new Throwable();
                        if (this.a == this.b && z3) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        wfeVar2.a = new obd(zpeVar, af4Var, z2);
                        obj = wfeVar.a;
                        if (obj != null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        obd obdVar2 = (obd) obj;
                        vt4 vt4VarX0 = lvb.x0(new qd4(this.c, obdVar2), new pqh(obdVar2, this.d));
                        k23 k23Var = new k23(qf7Var2, wfeVar, null, 28);
                        he4Var.e = zadVar2;
                        he4Var.f = wfeVar;
                        he4Var.g = null;
                        he4Var.h = null;
                        he4Var.i = null;
                        he4Var.j = null;
                        he4Var.m = 4;
                        objK0 = yab.K0(vt4VarX0, k23Var, he4Var);
                        if (objK0 != hu4Var) {
                            wfeVar3 = wfeVar;
                            zadVar = zadVar2;
                        }
                        return hu4Var;
                    } catch (Throwable th2) {
                        th = th2;
                        zadVar = zadVar2;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    wfeVar = wfeVar5;
                    zadVar = zadVar2;
                    throw th;
                }
            }
            if (i2 != 4) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wfeVar3 = (wfe) he4Var.f;
            zadVar = (zad) he4Var.e;
            try {
                ch3.d0(objK0);
            } catch (Throwable th4) {
                wfeVar = wfeVar3;
                th = th4;
            }
            obdVar = (obd) wfeVar3.a;
            if (obdVar != null) {
                if (!obdVar.e) {
                    obdVar.e = true;
                    if (obdVar.b.a.G0()) {
                        n1g.u(obdVar.b, "ROLLBACK TRANSACTION");
                    }
                }
                af4 af4Var2 = obdVar.b;
                af4Var2.c = null;
                af4Var2.d = null;
                zadVar.e(af4Var2);
            }
            return objK0;
        }
        ch3.d0(objK0);
        if (this.e) {
            n1g.a0(21, "Connection pool is closed");
            throw null;
        }
        obd obdVar3 = (obd) this.d.get();
        if (obdVar3 == null) {
            qd4 qd4Var = (qd4) he4Var.getContext().x0(this.c);
            obdVar3 = qd4Var != null ? qd4Var.b : null;
        }
        if (obdVar3 == null) {
            zad zadVar3 = z3 ? this.a : this.b;
            wfeVar = new wfe();
            try {
                vt4 context = he4Var.getContext();
                zpe zpeVar2 = this.c;
                long j = this.f;
                cz1 cz1Var = new cz1(this, z3, 2);
                he4Var.e = qf7Var;
                he4Var.f = zadVar3;
                he4Var.g = wfeVar;
                he4Var.h = context;
                he4Var.i = wfeVar;
                he4Var.j = zpeVar2;
                he4Var.d = z3;
                he4Var.m = 3;
                Object objB = zadVar3.b(j, cz1Var, he4Var);
                if (objB != hu4Var) {
                    qf7Var2 = qf7Var;
                    zpeVar = zpeVar2;
                    vt4Var = context;
                    zadVar2 = zadVar3;
                    objK0 = objB;
                    wfeVar2 = wfeVar;
                    af4 af4Var3 = (af4) objK0;
                    af4Var3.c = vt4Var;
                    af4Var3.d = new Throwable();
                    if (this.a == this.b) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    wfeVar2.a = new obd(zpeVar, af4Var3, z2);
                    obj = wfeVar.a;
                    if (obj != null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    obd obdVar4 = (obd) obj;
                    vt4 vt4VarX1 = lvb.x0(new qd4(this.c, obdVar4), new pqh(obdVar4, this.d));
                    k23 k23Var2 = new k23(qf7Var2, wfeVar, null, 28);
                    he4Var.e = zadVar2;
                    he4Var.f = wfeVar;
                    he4Var.g = null;
                    he4Var.h = null;
                    he4Var.i = null;
                    he4Var.j = null;
                    he4Var.m = 4;
                    objK0 = yab.K0(vt4VarX1, k23Var2, he4Var);
                    if (objK0 != hu4Var) {
                        wfeVar3 = wfeVar;
                        zadVar = zadVar2;
                        obdVar = (obd) wfeVar3.a;
                        if (obdVar != null) {
                            if (!obdVar.e) {
                                obdVar.e = true;
                                if (obdVar.b.a.G0()) {
                                    n1g.u(obdVar.b, "ROLLBACK TRANSACTION");
                                }
                            }
                            af4 af4Var4 = obdVar.b;
                            af4Var4.c = null;
                            af4Var4.d = null;
                            zadVar.e(af4Var4);
                        }
                        return objK0;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                zadVar = zadVar3;
            }
        } else {
            if (!z3 && obdVar3.c) {
                n1g.a0(1, "Cannot upgrade connection from reader to writer");
                throw null;
            }
            if (he4Var.getContext().x0(this.c) == null) {
                vt4 vt4VarX2 = lvb.x0(new qd4(this.c, obdVar3), new pqh(obdVar3, this.d));
                k23 k23Var3 = new k23(qf7Var, obdVar3, null, 27);
                he4Var.m = 1;
                Object objK1 = yab.K0(vt4VarX2, k23Var3, he4Var);
                if (objK1 != hu4Var) {
                    return objK1;
                }
            } else {
                he4Var.m = 2;
                Object objInvoke = qf7Var.invoke(obdVar3, he4Var);
                if (objInvoke != hu4Var) {
                    return objInvoke;
                }
            }
        }
        return hu4Var;
        try {
            throw th;
        } catch (Throwable th6) {
            try {
                obd obdVar5 = (obd) wfeVar.a;
                if (obdVar5 == null) {
                    throw th6;
                }
                if (!obdVar5.e) {
                    obdVar5.e = true;
                    if (obdVar5.b.a.G0()) {
                        n1g.u(obdVar5.b, "ROLLBACK TRANSACTION");
                    }
                }
                af4 af4Var5 = obdVar5.b;
                af4Var5.c = null;
                af4Var5.d = null;
                zadVar.e(af4Var5);
                throw th6;
            } catch (Throwable th7) {
                gm0.b(th, th7);
                throw th6;
            }
        }
    }

    public ie4(kzi kziVar) {
        ghb ghbVar = ew5.b;
        this.f = qe7.O(30, lw5.SECONDS);
        this.g = 2;
        zad zadVar = new zad(1, new pe3(11, kziVar));
        this.a = zadVar;
        this.b = zadVar;
    }
}
