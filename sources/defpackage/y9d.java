package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes4.dex */
public final class y9d {
    public final String a = y9d.class.getName();
    public final ny8 b;
    public final ny8 c;

    public y9d(ny8 ny8Var, ny8 ny8Var2) {
        this.b = ny8Var;
        this.c = ny8Var2;
    }

    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0184  */
    /* JADX WARN: Code duplicated, block: B:74:0x01bd A[Catch: all -> 0x01b5, CancellationException -> 0x01b7, TryCatch #6 {CancellationException -> 0x01b7, all -> 0x01b5, blocks: (B:62:0x0176, B:72:0x01b9, B:74:0x01bd, B:76:0x01cc, B:65:0x0187, B:67:0x018d, B:58:0x014e), top: B:102:0x014e }] */
    /* JADX WARN: Code duplicated, block: B:75:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    public final Object a(long j, long j2, long j3, f8b f8bVar, long j4, nq4 nq4Var) throws Throwable {
        x9d x9dVar;
        f8b f8bVar2;
        long j5;
        long j6;
        long j7;
        Object obj;
        long j8;
        y9d y9dVar;
        long j9;
        long j10;
        long j11;
        long j12;
        Object obj2;
        e70 e70Var;
        int i;
        int i2;
        w9d w9dVar;
        String str;
        a4c a4cVar;
        o5d o5dVar;
        o5d o5dVarA;
        je9 je9Var = je9.f;
        je9 je9Var2 = je9.d;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof x9d) {
            x9dVar = (x9d) nq4Var;
            int i3 = x9dVar.n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                x9dVar.n = i3 - Integer.MIN_VALUE;
            } else {
                x9dVar = new x9d(this, nq4Var);
            }
        } else {
            x9dVar = new x9d(this, nq4Var);
        }
        Object obj3 = x9dVar.l;
        hu4 hu4Var = hu4.a;
        int i4 = x9dVar.n;
        String str2 = ") pollId(";
        if (i4 == 0) {
            ch3.d0(obj3);
            String str3 = this.a;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var2)) {
                StringBuilder sbS = qt4.s(j, "Sending vote for chatId(", ") messageId(");
                sbS.append(j3);
                a4cVar2.c(je9Var2, str3, zo5.k(j2, ") pollId(", ")", sbS), null);
            }
            sua suaVar = (sua) this.c.getValue();
            f8bVar2 = f8bVar;
            x9dVar.h = f8bVar2;
            x9dVar.d = j;
            x9dVar.e = j2;
            x9dVar.f = j3;
            j5 = j4;
            x9dVar.g = j5;
            x9dVar.n = 1;
            Object objF = suaVar.f(j3, x9dVar);
            if (objF != hu4Var) {
                j6 = j2;
                j7 = j3;
                obj = objF;
                j8 = j;
            }
            return hu4Var;
        }
        if (i4 != 1) {
            try {
                if (i4 != 2) {
                    if (i4 == 3) {
                        ch3.d0(obj3);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i5 = x9dVar.k;
                int i6 = x9dVar.j;
                j12 = x9dVar.g;
                long j13 = x9dVar.f;
                i2 = i6;
                long j14 = x9dVar.e;
                j9 = x9dVar.d;
                e70 e70Var2 = x9dVar.i;
                ch3.d0(obj3);
                y9dVar = this;
                i = i5;
                str2 = ") pollId(";
                obj2 = obj3;
                e70Var = e70Var2;
                j11 = j13;
                j10 = j14;
                w9dVar = (w9d) obj2;
                int i7 = i;
                str = y9dVar.a;
                int i8 = i2;
                a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var2)) {
                    a4cVar.c(je9Var2, str, "receive updated state for chatId(" + j9 + ") messageId(" + j11 + str2 + j10 + ")", null);
                }
                o5dVar = e70Var.o;
                if (o5dVar != null) {
                    o5dVarA = o5d.a(o5dVar, 0, yab.p0(w9dVar.c), 47);
                } else {
                    o5dVarA = null;
                }
                sua suaVar2 = (sua) y9dVar.c.getValue();
                String str4 = e70Var.t;
                ol0 ol0Var = new ol0(23, o5dVarA);
                x9dVar.h = null;
                x9dVar.i = null;
                x9dVar.d = j9;
                x9dVar.e = j10;
                x9dVar.f = j11;
                x9dVar.g = j12;
                x9dVar.j = i8;
                x9dVar.k = i7;
                x9dVar.n = 3;
                suaVar2.s(j11, str4, ol0Var);
                if (sbiVar == hu4Var) {
                    return hu4Var;
                }
                return sbiVar;
            } catch (CancellationException e) {
                e = e;
                y9dVar = this;
                gm0.Y(y9dVar.a, "cant send vote due to cancellation");
                throw e;
            } catch (Throwable th) {
                th = th;
                y9dVar = this;
                gm0.V(y9dVar.a, "cant send vote due to error", th);
                throw th;
            }
        }
        long j15 = x9dVar.g;
        j7 = x9dVar.f;
        j6 = x9dVar.e;
        j8 = x9dVar.d;
        f8bVar2 = x9dVar.h;
        ch3.d0(obj3);
        je9Var = je9Var;
        obj = obj3;
        str2 = ") pollId(";
        j5 = j15;
        sfa sfaVar = (sfa) obj;
        long j16 = j6;
        if (sfaVar == null) {
            String str5 = this.a;
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null) {
                je9 je9Var3 = je9Var;
                if (a4cVar3.b(je9Var3)) {
                    a4cVar3.c(je9Var3, str5, c0a.m(j7, ")", qt4.s(j8, "cant send vote: chatId(", ") cant find message messageId(")), null);
                    return sbiVar;
                }
            }
            return sbiVar;
        }
        je9 je9Var4 = je9Var;
        c46 c46Var = sfaVar.n;
        if (c46Var != null) {
            long j17 = j8;
            e70 e70VarL = c46Var.l(y60.o);
            if (e70VarL == null) {
                j8 = j17;
            } else {
                try {
                    try {
                        i80 i80Var = new i80(this, j17, j16, sfaVar, f8bVar2, (lq4) null);
                        y9dVar = this;
                        j9 = j17;
                        j10 = j16;
                        try {
                            x9dVar.h = null;
                            x9dVar.i = e70VarL;
                            x9dVar.d = j9;
                            x9dVar.e = j10;
                            x9dVar.f = j7;
                            x9dVar.g = j5;
                            x9dVar.j = 0;
                            x9dVar.k = 0;
                            x9dVar.n = 2;
                            Object objK0 = lvb.K0(j5, i80Var, x9dVar);
                            if (objK0 == hu4Var) {
                                return hu4Var;
                            }
                            long j18 = j5;
                            j11 = j7;
                            j12 = j18;
                            obj2 = objK0;
                            e70Var = e70VarL;
                            i = 0;
                            i2 = 0;
                            w9dVar = (w9d) obj2;
                            int i9 = i;
                            str = y9dVar.a;
                            int i10 = i2;
                            a4cVar = gm0.f;
                            if (a4cVar != null) {
                                a4cVar.c(je9Var2, str, "receive updated state for chatId(" + j9 + ") messageId(" + j11 + str2 + j10 + ")", null);
                            }
                            o5dVar = e70Var.o;
                            if (o5dVar != null) {
                                o5dVarA = o5d.a(o5dVar, 0, yab.p0(w9dVar.c), 47);
                            } else {
                                o5dVarA = null;
                            }
                            sua suaVar3 = (sua) y9dVar.c.getValue();
                            String str6 = e70Var.t;
                            ol0 ol0Var2 = new ol0(23, o5dVarA);
                            x9dVar.h = null;
                            x9dVar.i = null;
                            x9dVar.d = j9;
                            x9dVar.e = j10;
                            x9dVar.f = j11;
                            x9dVar.g = j12;
                            x9dVar.j = i10;
                            x9dVar.k = i9;
                            x9dVar.n = 3;
                            suaVar3.s(j11, str6, ol0Var2);
                            if (sbiVar == hu4Var) {
                                return hu4Var;
                            }
                            return sbiVar;
                        } catch (CancellationException e2) {
                            e = e2;
                            gm0.Y(y9dVar.a, "cant send vote due to cancellation");
                            throw e;
                        } catch (Throwable th2) {
                            th = th2;
                            gm0.V(y9dVar.a, "cant send vote due to error", th);
                            throw th;
                        }
                    } catch (CancellationException e3) {
                        e = e3;
                        y9dVar = this;
                        gm0.Y(y9dVar.a, "cant send vote due to cancellation");
                        throw e;
                    } catch (Throwable th3) {
                        th = th3;
                        y9dVar = this;
                        gm0.V(y9dVar.a, "cant send vote due to error", th);
                        throw th;
                    }
                } catch (CancellationException e4) {
                    e = e4;
                    y9dVar = this;
                } catch (Throwable th4) {
                    th = th4;
                    y9dVar = this;
                }
            }
        }
        String str7 = this.a;
        a4c a4cVar4 = gm0.f;
        if (a4cVar4 == null || !a4cVar4.b(je9Var4)) {
            return sbiVar;
        }
        a4cVar4.c(je9Var4, str7, c0a.m(j7, ") with no POLL attach", qt4.s(j8, "cant send vote: chatId(", ") messageId(")), null);
        return sbiVar;
    }
}
