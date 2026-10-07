package defpackage;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CancellationException;
import ru.ok.tamtam.errors.TamErrorException;

/* JADX INFO: loaded from: classes.dex */
public final class if9 {
    public final i5d a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final String j = if9.class.getName();

    public if9(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, i5d i5dVar) {
        this.a = i5dVar;
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
        this.e = ny8Var4;
        this.f = ny8Var5;
        this.g = ny8Var6;
        this.h = ny8Var7;
        this.i = ny8Var8;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:66:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:68:0x01de  */
    /* JADX WARN: Code duplicated, block: B:71:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:72:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:75:0x0207  */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX WARN: Code duplicated, block: B:82:0x022b  */
    /* JADX WARN: Code duplicated, block: B:84:0x0233  */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    public static final Object a(if9 if9Var, long j, ff9 ff9Var, int i, String str, boolean z, boolean z2, nq4 nq4Var) {
        gf9 gf9Var;
        long jP;
        boolean z3;
        int i2;
        boolean z4;
        long j2;
        String str2;
        int i3;
        boolean z5;
        lw5 lw5Var;
        sbi sbiVar;
        hu4 hu4Var;
        int i4;
        long j3;
        df9 df9Var;
        String str3;
        long j4;
        boolean z6;
        long j5;
        ia4 ia4Var;
        sbi sbiVar2;
        boolean z7;
        long j6;
        no4 no4Var;
        ujd ujdVar;
        long j7;
        List list;
        String str4;
        a4c a4cVar;
        je9 je9Var;
        je9 je9Var2 = je9.e;
        lw5 lw5Var2 = lw5.NANOSECONDS;
        sbi sbiVar3 = sbi.a;
        if (nq4Var instanceof gf9) {
            gf9Var = (gf9) nq4Var;
            int i5 = gf9Var.n;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                gf9Var.n = i5 - Integer.MIN_VALUE;
            } else {
                gf9Var = new gf9(if9Var, nq4Var);
            }
        } else {
            gf9Var = new gf9(if9Var, nq4Var);
        }
        Object obj = gf9Var.l;
        hu4 hu4Var2 = hu4.a;
        int i6 = gf9Var.n;
        if (i6 != 0) {
            if (i6 == 1) {
                i2 = gf9Var.i;
                jP = gf9Var.e;
                z5 = gf9Var.k;
                z4 = gf9Var.j;
                i3 = gf9Var.h;
                j2 = gf9Var.d;
                str2 = gf9Var.f;
                ch3.d0(obj);
            } else if (i6 == 2) {
                i2 = gf9Var.i;
                j4 = gf9Var.e;
                z5 = gf9Var.k;
                z6 = gf9Var.j;
                i4 = gf9Var.h;
                j5 = gf9Var.d;
                df9Var = gf9Var.g;
                ch3.d0(obj);
                lw5Var = lw5Var2;
                sbiVar = sbiVar3;
                hu4Var = hu4Var2;
                z4 = z6;
                jP = j4;
                j3 = j5;
                ia4Var = df9Var.e;
                if (ia4Var != null) {
                    pjb pjbVar = (pjb) if9Var.c.getValue();
                    gf9Var.f = null;
                    gf9Var.g = df9Var;
                    gf9Var.d = j3;
                    gf9Var.h = i4;
                    gf9Var.j = z4;
                    gf9Var.k = z5;
                    gf9Var.e = jP;
                    gf9Var.i = i2;
                    gf9Var.n = 3;
                    pjb.b(pjbVar, ia4Var, z4, 2);
                    sbiVar2 = sbiVar;
                    if (sbiVar2 == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    sbiVar2 = sbiVar;
                }
                int i7 = i2;
                z7 = z5;
                j6 = jP;
                if (z7) {
                    ((pvb) if9Var.i.getValue()).p();
                }
                no4Var = (no4) if9Var.d.getValue();
                ujdVar = df9Var.c;
                if (ujdVar != null) {
                    j7 = ujdVar.a.a;
                } else {
                    j7 = j3;
                }
                list = df9Var.d;
                if (list == null) {
                    list = r66.a;
                }
                gf9Var.f = null;
                gf9Var.g = null;
                gf9Var.d = j3;
                gf9Var.h = i4;
                gf9Var.j = z4;
                gf9Var.k = z7;
                gf9Var.e = j6;
                gf9Var.i = i7;
                gf9Var.n = 4;
                if (no4Var.l(j7, gf9Var, list) == hu4Var) {
                    return hu4Var;
                }
            } else if (i6 == 3) {
                i2 = gf9Var.i;
                jP = gf9Var.e;
                z5 = gf9Var.k;
                z4 = gf9Var.j;
                int i8 = gf9Var.h;
                j3 = gf9Var.d;
                df9 df9Var2 = gf9Var.g;
                ch3.d0(obj);
                lw5Var = lw5Var2;
                sbiVar2 = sbiVar3;
                hu4Var = hu4Var2;
                df9Var = df9Var2;
                i4 = i8;
                int i9 = i2;
                z7 = z5;
                j6 = jP;
                if (z7) {
                    ((pvb) if9Var.i.getValue()).p();
                }
                no4Var = (no4) if9Var.d.getValue();
                ujdVar = df9Var.c;
                if (ujdVar != null) {
                    j7 = ujdVar.a.a;
                } else {
                    j7 = j3;
                }
                list = df9Var.d;
                if (list == null) {
                    list = r66.a;
                }
                gf9Var.f = null;
                gf9Var.g = null;
                gf9Var.d = j3;
                gf9Var.h = i4;
                gf9Var.j = z4;
                gf9Var.k = z7;
                gf9Var.e = j6;
                gf9Var.i = i9;
                gf9Var.n = 4;
                if (no4Var.l(j7, gf9Var, list) == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i6 != 4) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j6 = gf9Var.e;
                ch3.d0(obj);
                je9Var2 = je9Var2;
                lw5Var = lw5Var2;
                sbiVar2 = sbiVar3;
            }
            str4 = if9Var.j;
            a4cVar = gm0.f;
            if (a4cVar != null) {
                je9Var = je9Var2;
                if (a4cVar.b(je9Var)) {
                    ghb ghbVar = ew5.b;
                    a4cVar.c(je9Var, str4, "login2 finished by ".concat(ew5.t(ew5.o(qe7.P(System.nanoTime(), lw5Var), j6))), null);
                }
            }
            return sbiVar2;
        }
        ch3.d0(obj);
        ghb ghbVar2 = ew5.b;
        jP = qe7.P(System.nanoTime(), lw5Var2);
        String str5 = ff9Var.a ? (String) if9Var.a.i() : null;
        int i10 = ((g5d) ((gjf) if9Var.e.getValue())).a.q().getInt("version", 1);
        if (i10 < 7) {
            str5 = null;
        }
        cf9 cf9Var = new cf9(i);
        if (ff9Var.a) {
            if (str5 == null) {
                str5 = "";
            }
            cf9Var.h("configHash", str5);
            z3 = true;
        } else {
            z3 = false;
        }
        if (ff9Var.b) {
            cf9Var.f(((s7f) ((et3) if9Var.f.getValue())).j(), "contactsSync");
            z3 = true;
        }
        if (ff9Var.c) {
            cf9Var.a("needProfile", true);
            z3 = true;
        }
        if (!z3) {
            gm0.Y(if9Var.j, "skip login2, invalid request");
            return sbiVar3;
        }
        sih sihVar = (sih) if9Var.b.getValue();
        gf9Var.f = str;
        gf9Var.d = j;
        gf9Var.h = i;
        gf9Var.j = z;
        gf9Var.k = z2;
        gf9Var.e = jP;
        gf9Var.i = i10;
        gf9Var.n = 1;
        Object objG = sihVar.a.g(cf9Var, gf9Var);
        if (objG == hu4Var2) {
            return hu4Var2;
        }
        obj = objG;
        i2 = i10;
        z4 = z;
        j2 = j;
        str2 = str;
        i3 = i;
        z5 = z2;
        df9 df9Var3 = (df9) obj;
        vd7.q(gf9Var.getContext());
        lw5Var = lw5Var2;
        ujd ujdVar2 = df9Var3.c;
        sbiVar = sbiVar3;
        if (ujdVar2 != null) {
            String str6 = if9Var.j;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var2)) {
                str3 = null;
                a4cVar2.c(je9Var2, str6, "login2: put profile", null);
            } else {
                str3 = null;
            }
            utd utdVar = (utd) if9Var.h.getValue();
            gf9Var.f = str3;
            gf9Var.g = df9Var3;
            gf9Var.d = j2;
            gf9Var.h = i3;
            gf9Var.j = z4;
            gf9Var.k = z5;
            gf9Var.e = jP;
            gf9Var.i = i2;
            gf9Var.n = 2;
            hu4Var = hu4Var2;
            if (utdVar.d(ujdVar2, str2, gf9Var) == hu4Var) {
                return hu4Var;
            }
            i4 = i3;
            df9Var = df9Var3;
            j4 = jP;
            z6 = z4;
            j5 = j2;
            z4 = z6;
            jP = j4;
            j3 = j5;
        } else {
            hu4Var = hu4Var2;
            i4 = i3;
            j3 = j2;
            df9Var = df9Var3;
        }
        ia4Var = df9Var.e;
        if (ia4Var != null) {
            pjb pjbVar2 = (pjb) if9Var.c.getValue();
            gf9Var.f = null;
            gf9Var.g = df9Var;
            gf9Var.d = j3;
            gf9Var.h = i4;
            gf9Var.j = z4;
            gf9Var.k = z5;
            gf9Var.e = jP;
            gf9Var.i = i2;
            gf9Var.n = 3;
            pjb.b(pjbVar2, ia4Var, z4, 2);
            sbiVar2 = sbiVar;
            if (sbiVar2 == hu4Var) {
                return hu4Var;
            }
        } else {
            sbiVar2 = sbiVar;
        }
        int i11 = i2;
        z7 = z5;
        j6 = jP;
        if (z7) {
            ((pvb) if9Var.i.getValue()).p();
        }
        no4Var = (no4) if9Var.d.getValue();
        ujdVar = df9Var.c;
        if (ujdVar != null) {
            j7 = ujdVar.a.a;
        } else {
            j7 = j3;
        }
        list = df9Var.d;
        if (list == null) {
            list = r66.a;
        }
        gf9Var.f = null;
        gf9Var.g = null;
        gf9Var.d = j3;
        gf9Var.h = i4;
        gf9Var.j = z4;
        gf9Var.k = z7;
        gf9Var.e = j6;
        gf9Var.i = i11;
        gf9Var.n = 4;
        if (no4Var.l(j7, gf9Var, list) == hu4Var) {
            return hu4Var;
        }
        str4 = if9Var.j;
        a4cVar = gm0.f;
        if (a4cVar != null) {
            je9Var = je9Var2;
            if (a4cVar.b(je9Var)) {
                ghb ghbVar3 = ew5.b;
                a4cVar.c(je9Var, str4, "login2 finished by ".concat(ew5.t(ew5.o(qe7.P(System.nanoTime(), lw5Var), j6))), null);
            }
        }
        return sbiVar2;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v13 */
    public final Object b(long j, ff9 ff9Var, int i, String str, boolean z, boolean z2, nq4 nq4Var) {
        hf9 hf9Var;
        if (nq4Var instanceof hf9) {
            hf9Var = (hf9) nq4Var;
            int i2 = hf9Var.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hf9Var.f = i2 - Integer.MIN_VALUE;
            } else {
                hf9Var = new hf9(this, nq4Var);
            }
        } else {
            hf9Var = new hf9(this, nq4Var);
        }
        hf9 hf9Var2 = hf9Var;
        Object obj = hf9Var2.d;
        hu4 hu4Var = hu4.a;
        int i3 = hf9Var2.f;
        try {
            if (i3 == 0) {
                ch3.d0(obj);
                String str2 = this.j;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.e;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str2, "execute with " + ff9Var, null);
                    }
                }
                hf9Var2.f = 1;
                Object objA = a(this, j, ff9Var, i, str, z, z2, hf9Var2);
                this = objA;
                if (objA == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i3 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                this = this;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            if (th instanceof TamErrorException) {
                TamErrorException tamErrorException = th;
                String str3 = tamErrorException.a.b;
                if (cqk.d(str3, "session.sequence")) {
                    gm0.Y(this.j, "login2_error: SESSION_SEQUENCE");
                } else if (cqk.d(str3, "client.task.ignored")) {
                    gm0.Y(this.j, "login2_error: TASK_IGNORED");
                } else {
                    ((eg9) this.g.getValue()).a(tamErrorException.a, 2);
                }
            } else {
                boolean z3 = th instanceof IOException;
                String str4 = this.j;
                if (z3) {
                    gm0.Y(str4, "fail, io exception");
                } else {
                    gm0.V(str4, "fail", new ef9(th));
                }
            }
        }
        return sbi.a;
    }
}
