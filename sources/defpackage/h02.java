package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.text.SpannableStringBuilder;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.a;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class h02 extends a8j {
    public final r8e A;
    public final mjg B;
    public final mjg C;
    public final mjg D;
    public final ifh E;
    public String F;
    public final ic6 G;
    public final r8e H;
    public final r8e I;
    public final r8e J;
    public final ny8 K;
    public final ny8 X;
    public final ie Y;
    public final nz1 Z;
    public final k4f c;
    public final msc d;
    public final w82 e;
    public final p32 f;
    public final u42 g;
    public final ce1 h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final ny8 m;
    public final ny8 n;
    public final ny8 o;
    public final ec1 p;
    public final jj0 q;
    public final ny8 r;
    public final mjg s;
    public final mjg t;
    public final r8e u;
    public final mjg v;
    public final mjg w;
    public final mjg x;
    public final q8e y;
    public final r8e z;

    public h02(k4f k4fVar, msc mscVar, w82 w82Var, p32 p32Var, u42 u42Var, ce1 ce1Var, ny8 ny8Var, e62 e62Var, bo1 bo1Var, io5 io5Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9, ny8 ny8Var10) {
        this.c = k4fVar;
        this.d = mscVar;
        this.e = w82Var;
        this.f = p32Var;
        this.g = u42Var;
        this.h = ce1Var;
        this.i = ny8Var6;
        this.j = ny8Var2;
        this.k = ny8Var7;
        this.l = ny8Var;
        this.m = ny8Var4;
        this.n = ny8Var5;
        this.o = ny8Var9;
        this.p = new ec1(k4fVar, e62Var.a);
        msc mscVar2 = bo1Var.a;
        ce1 ce1Var2 = bo1Var.b;
        ny8 ny8Var11 = bo1Var.c;
        ny8 ny8Var12 = bo1Var.d;
        jj0 jj0Var = new jj0();
        jj0Var.b = mscVar2;
        jj0Var.c = ce1Var2;
        jj0Var.d = ny8Var11;
        jj0Var.e = ny8Var12;
        jj0Var.a = "";
        jj0Var.f = dz4.r;
        jj0Var.g = new enc(tmc.e);
        jj0Var.h = be1.n;
        jj0Var.j = gc.h;
        this.q = jj0Var;
        this.r = rx8.P(3, new wre(ny8Var10, this, ny8Var9, 4));
        r8e r8eVar = w82Var.r;
        xx6 xx6VarI = e9i.I(new p5(r8eVar, 19));
        xx6 xx6VarI2 = e9i.I(new p5(r8eVar, 20));
        f62 f62Var = (f62) ((n42) H()).f.a.getValue();
        boolean z = f62Var.m;
        boolean z2 = f62Var.n;
        mjg mjgVarA = p90.a(new ao1(f62Var.l, f62Var.k, z, z2, 16752591));
        this.s = mjgVarA;
        Boolean bool = Boolean.FALSE;
        mjg mjgVarA2 = p90.a(bool);
        this.t = mjgVarA2;
        r8e r8eVar2 = new r8e(mjgVarA);
        this.u = r8eVar2;
        this.v = p90.a(s66.a);
        mjg mjgVarA3 = p90.a(new of1(new d62()));
        this.w = mjgVarA3;
        this.x = mjgVarA3;
        q8e q8eVar = w82Var.o;
        this.y = q8eVar;
        xx6 xx6VarT = e9i.T(e9i.I(new ra1(3, new yo0(mjgVarA3, 2))), ((n0c) L()).a());
        Boolean bool2 = Boolean.TRUE;
        dq4 dq4Var = this.b;
        a8g a8gVar = j0g.a;
        this.z = e9i.G0(xx6VarT, dq4Var, a8gVar, bool2);
        this.A = e9i.G0(e9i.T(new r07(xx6VarI, mjgVarA, new d3(ny8Var8, null, 7), 0), ((n0c) L()).a()), this.b, a8gVar, vmi.d);
        this.B = p90.a(bool);
        this.C = p90.a(bool);
        this.D = p90.a(q32.e);
        ifh ifhVar = new ifh(new w40(ny8Var5, 6));
        this.E = ifhVar;
        this.G = new ic6(null);
        this.H = e9i.G0(new p5(xx6VarI, 21), this.b, a8gVar, x7j.a);
        xx6 xx6VarI3 = e9i.I(new p5(r8eVar, 22));
        ghb ghbVar = ew5.b;
        this.I = e9i.G0(e9i.T(e9i.I(new yh1(e9i.M0(e9i.I(new qz1(tre.G0(xx6VarI3, qe7.O(1, lw5.SECONDS)), 0)), new rz1(0, null, ny8Var3)), 1)), ((n0c) L()).a()), this.b, a8gVar, 0);
        p5 p5Var = new p5(xx6VarI, 23);
        da1 da1Var = w82Var.h;
        this.J = e9i.G0(e9i.T(e9i.A(p5Var, new p5(((ya1) da1Var).v, 24), new p5(((n42) H()).f, 25), ((ya1) da1Var).j, e9i.I(new p5(r8eVar, 17)), new oz1(null)), ((n0c) L()).a()), this.b, a8gVar, bool);
        this.K = rx8.P(3, new yk1(9, this));
        this.X = rx8.P(3, new br1(21));
        this.Y = new ie(new r07(xx6VarI, xx6VarI2, new d3(ny8Var, null, 6), 0), this, 10);
        nz1 nz1Var = new nz1(this);
        this.Z = nz1Var;
        I().c(nz1Var);
        e9i.j0(new fz6(((lxi) ifhVar.getValue()).e, new dz1(io5Var, null, 0), 3), this.b);
        e9i.j0(new fz6(u42Var.g, new ez1(this, (lq4) null, 0), 3), this.b);
        r8e r8eVar3 = w82Var.t;
        e9i.j0(new fz6(new p5(r8eVar3, 18), new ez1(this, (lq4) null, 1), 3), this.b);
        e9i.j0(e9i.T(e9i.A(w82Var.s, r8eVar2, new p5(xx6VarI2, 16), new ie(xx6VarI2, this, 9), new hz1(r8eVar2, 1), new mz1(this, null)), ((n0c) L()).a()), this.b);
        fz6 fz6Var = new fz6(q8eVar, new ez1((lq4) null, this, 3), 3);
        dq4 dq4Var2 = this.b;
        e9i.j0(fz6Var, dq4Var2);
        e9i.j0(e9i.T(e9i.B(r8eVar, r8eVar3, ((ya1) da1Var).v, G().d, new fz1(this, (lq4) null, 0)), ((n0c) L()).a()), dq4Var2);
        e9i.j0(new fz6(((ac1) w82Var.b).j.d, new ez1((lq4) null, this, 4), 3), dq4Var2);
        e9i.j0(new fz6(w82Var.c.b.d, new ez1((lq4) null, this, 5), 3), dq4Var2);
        e9i.j0(new fz6(e9i.I(new r07(new hz1(r8eVar2, 0), mjgVarA2, new ad1(3, null, 2), 0)), new in(this, (lq4) null, 3), 3), this.b);
        e9i.j0(new fz6(((ya1) da1Var).t, new ez1(this, (lq4) null, 2), 3), this.b);
        e9i.j0(new fz6(new r07(I().i, I().j, new ud9(3, (lq4) null, 4), 0), new ez1(this, (lq4) null, 6), 3), this.b);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x025c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:101:0x025e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:105:0x026c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0277  */
    /* JADX WARN: Code duplicated, block: B:110:0x027c  */
    /* JADX WARN: Code duplicated, block: B:113:0x028c  */
    /* JADX WARN: Code duplicated, block: B:117:0x0299  */
    /* JADX WARN: Code duplicated, block: B:118:0x029d  */
    /* JADX WARN: Code duplicated, block: B:130:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:133:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:134:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:140:0x0305  */
    /* JADX WARN: Code duplicated, block: B:147:0x0323  */
    /* JADX WARN: Code duplicated, block: B:150:0x0330  */
    /* JADX WARN: Code duplicated, block: B:151:0x0332  */
    /* JADX WARN: Code duplicated, block: B:154:0x0340  */
    /* JADX WARN: Code duplicated, block: B:155:0x0342  */
    /* JADX WARN: Code duplicated, block: B:158:0x0356  */
    /* JADX WARN: Code duplicated, block: B:163:0x0367  */
    /* JADX WARN: Code duplicated, block: B:166:0x036d  */
    /* JADX WARN: Code duplicated, block: B:167:0x036f  */
    /* JADX WARN: Code duplicated, block: B:170:0x0381  */
    /* JADX WARN: Code duplicated, block: B:175:0x0392  */
    /* JADX WARN: Code duplicated, block: B:178:0x0398  */
    /* JADX WARN: Code duplicated, block: B:179:0x039b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0060  */
    /* JADX WARN: Code duplicated, block: B:195:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:198:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:200:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:201:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:204:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:205:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:207:0x03f5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:208:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:210:0x0403  */
    /* JADX WARN: Code duplicated, block: B:211:0x0406  */
    /* JADX WARN: Code duplicated, block: B:217:0x041b  */
    /* JADX WARN: Code duplicated, block: B:218:0x0420 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:219:0x0422  */
    /* JADX WARN: Code duplicated, block: B:221:0x042e  */
    /* JADX WARN: Code duplicated, block: B:222:0x0431  */
    /* JADX WARN: Code duplicated, block: B:225:0x0438  */
    /* JADX WARN: Code duplicated, block: B:227:0x043d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:228:0x043f  */
    /* JADX WARN: Code duplicated, block: B:229:0x0442  */
    /* JADX WARN: Code duplicated, block: B:232:0x0470  */
    /* JADX WARN: Code duplicated, block: B:233:0x0473  */
    /* JADX WARN: Code duplicated, block: B:236:0x047d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:239:0x0483  */
    /* JADX WARN: Code duplicated, block: B:241:0x0487 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:244:0x048d  */
    /* JADX WARN: Code duplicated, block: B:247:0x0497  */
    /* JADX WARN: Code duplicated, block: B:249:0x049e  */
    /* JADX WARN: Code duplicated, block: B:253:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:254:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:70:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:74:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:75:0x01db  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:83:0x020d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0212  */
    /* JADX WARN: Code duplicated, block: B:91:0x023d  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void B(h02 h02Var, l9 l9Var, ao1 ao1Var, LinkedHashMap linkedHashMap) {
        fu1 fu1Var;
        String str;
        int i;
        SpannableStringBuilder spannableStringBuilder;
        int i2;
        ll9 ll9Var;
        List listSingletonList;
        kr1 kr1Var;
        CharSequence charSequence;
        int i3;
        Object obj;
        ao1 ao1Var2;
        gi6 gi6VarQ;
        gi6 gi6Var;
        gi6 gi6Var2;
        gi6 gi6Var3;
        int i4;
        int i5;
        ao1 ao1Var3;
        boolean z;
        gi6 gi6VarQ2;
        gi6 gi6Var4;
        gi6 gi6Var5;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        qe1 qe1Var;
        boolean z9;
        CharSequence charSequence2;
        CharSequence string;
        qe1 qe1Var2;
        CharSequence charSequence3;
        qe1 qe1Var3;
        CharSequence charSequence4;
        Context context;
        String string2;
        ao1 ao1Var4;
        boolean z10;
        boolean z11;
        boolean z12;
        qe1 qe1Var4;
        CharSequence charSequence5;
        vai vaiVar;
        qe1 qe1Var5;
        CharSequence charSequence6;
        Context context2;
        qe1 qe1Var6;
        long jLongValue;
        Long l;
        qe1 qe1Var7;
        long jLongValue2;
        Long l2;
        ok0 ok0Var;
        npi npiVar;
        ao1 ao1Var5;
        tx8 tx8Var;
        boolean z13;
        SpannableStringBuilder spannableStringBuilderG;
        boolean z14;
        boolean z15;
        int i6;
        fu1 id;
        h02 h02Var2 = h02Var;
        mjg mjgVar = h02Var2.w;
        while (true) {
            Object value = mjgVar.getValue();
            Object of1Var = (qf1) value;
            if ((of1Var instanceof pf1) && !r5h.X0(l9Var.a)) {
                of1Var = new of1(new d62());
            }
            ec1 ec1Var = h02Var2.p;
            ec1Var.f = ao1Var;
            k52 k52Var = l9Var.e;
            ec1Var.g = k52Var.f;
            fu1 fu1Var2 = k52Var.c;
            ec1Var.h = fu1Var2;
            ec1Var.i = k52Var.a;
            ec1Var.j = linkedHashMap;
            ec1Var.b = k52Var.e;
            if (ao1Var.f instanceof ii6) {
                of1Var = new pf1(ao1Var.b);
            } else if (of1Var instanceof of1) {
                d62 d62Var = ((of1) of1Var).a;
                yp9 yp9Var = ao1Var.s;
                yp9 yp9Var2 = yp9.b;
                if (yp9Var != yp9Var2 || ao1Var.h) {
                    fu1Var = null;
                } else {
                    if (fu1Var2 == null || fu1Var2.equals(fu1.c)) {
                        tmc tmcVar = ((ao1) ec1Var.f).i;
                        if (tmcVar != null) {
                            id = tmcVar.a.getId();
                        } else {
                            fu1Var = null;
                        }
                    } else {
                        id = (fu1) ec1Var.h;
                    }
                    fu1Var = id;
                }
                ll9 ll9VarE = ec1Var.e((x7j) ec1Var.g, (Map) ec1Var.j, fu1Var);
                ao1 ao1Var6 = (ao1) ec1Var.f;
                boolean z16 = ao1Var6.h || ao1Var6.u || ao1Var6.j.a();
                boolean z17 = d62Var.i || (!d62Var.f && ((ao1) ec1Var.f).h);
                x7j x7jVar = (x7j) ec1Var.g;
                ao1 ao1Var7 = (ao1) ec1Var.f;
                String str2 = ao1Var7.b;
                boolean z18 = ao1Var7.u;
                x7j x7jVar2 = x7j.a;
                if (z18) {
                    listSingletonList = r66.a;
                } else {
                    if (ao1Var7.j.a()) {
                        gp1 gp1Var = (gp1) ((Map) ec1Var.j).get(((ao1) ec1Var.f).j.c);
                        if (gp1Var == null || (charSequence = gp1Var.b) == null) {
                            charSequence = "";
                        }
                        listSingletonList = Collections.singletonList(new ir1(new vnh(R.string.call_item_share_screen_mode_title, a.n1(new Object[]{charSequence})), ((ao1) ec1Var.f).j));
                    } else {
                        ao1 ao1Var8 = (ao1) ec1Var.f;
                        boolean z19 = ao1Var8.h;
                        Map map = (Map) ec1Var.j;
                        if (z19) {
                            List listA = ec1Var.a(map.values(), x7j.c, ao1Var8);
                            ao1 ao1Var9 = (ao1) ec1Var.f;
                            gr1 gr1Var = new gr1(ao1Var9.u ? null : new oq7(listA));
                            if (ao1Var9.m) {
                                Map map2 = (Map) ec1Var.j;
                                str = str2;
                                spannableStringBuilder = null;
                                i = 1;
                                kr1Var = new kr1(ec1Var.b(map2, ec1Var.e(x7jVar2, map2, fu1Var), ec1Var.a(((Map) ec1Var.j).values(), x7jVar2, (ao1) ec1Var.f), fu1Var, z17));
                            } else {
                                str = str2;
                                i = 1;
                                spannableStringBuilder = null;
                                kr1Var = null;
                            }
                            lr1[] lr1VarArr = new lr1[2];
                            lr1VarArr[0] = kr1Var;
                            lr1VarArr[i] = gr1Var;
                            List listY0 = a.Y0(lr1VarArr);
                            i2 = 2;
                            ll9Var = ll9VarE;
                            listSingletonList = listY0;
                        } else {
                            str = str2;
                            x7jVar = x7jVar;
                            i = 1;
                            spannableStringBuilder = null;
                            i2 = 2;
                            ll9Var = ll9VarE;
                            listSingletonList = Collections.singletonList(new kr1(ec1Var.b((Map) ec1Var.j, ll9Var, ec1Var.a(map.values(), x7jVar, ao1Var8), fu1Var, z17)));
                        }
                    }
                    if (ll9Var != null) {
                        npiVar = ll9Var.i;
                        if (((x7j) ec1Var.g) == x7jVar2) {
                            ao1Var5 = (ao1) ec1Var.f;
                            if (ao1Var5.u) {
                                x7jVar = x7jVar;
                                i3 = i;
                            } else {
                                fu1 fu1Var3 = ll9Var.c;
                                if (!ao1Var5.h || ao1Var5.v) {
                                    p32 p32VarD = ec1Var.d();
                                    boolean z20 = ll9Var.j;
                                    int i7 = ll9Var.l;
                                    CharSequence charSequence7 = ll9Var.b;
                                    ao1 ao1Var10 = (ao1) ec1Var.f;
                                    boolean z21 = ao1Var10.h;
                                    pi6 pi6Var = ao1Var10.f;
                                    boolean z22 = ao1Var10.n;
                                    boolean z23 = ll9Var.h;
                                    if (npiVar != null) {
                                        z13 = npiVar.g;
                                    } else {
                                        z13 = false;
                                    }
                                    spannableStringBuilderG = p32VarD.g(z20, i7, charSequence7, z21, z23, z22, z13, pi6Var, ll9Var.p);
                                } else {
                                    spannableStringBuilderG = spannableStringBuilder;
                                }
                                if (cqk.d(ll9Var.c, (fu1) ec1Var.i) || !((ao1) ec1Var.f).h) {
                                    z14 = false;
                                } else {
                                    z14 = true;
                                }
                                boolean z24 = ll9Var.e;
                                z15 = ll9Var.j;
                                if (z15 || !((ao1) ec1Var.f).h || npiVar == null || npiVar.c) {
                                    if (z15 || npiVar == null) {
                                        i3 = 1;
                                    } else {
                                        i3 = 1;
                                        if (npiVar.c) {
                                            i6 = i2;
                                        }
                                    }
                                    if (((ao1) ec1Var.f).h) {
                                        i6 = i3;
                                    } else {
                                        i6 = 4;
                                    }
                                } else {
                                    i6 = 4;
                                    i3 = 1;
                                }
                                tx8Var = new tx8(fu1Var3, spannableStringBuilderG, z14, z24, i6);
                                if (!tx8Var.equals(tx8.f)) {
                                    obj = tx8Var;
                                }
                            }
                            obj = spannableStringBuilder;
                        } else {
                            x7jVar = x7jVar;
                            i3 = i;
                            obj = spannableStringBuilder;
                        }
                    } else {
                        x7jVar = x7jVar;
                        i3 = i;
                        obj = spannableStringBuilder;
                    }
                    ao1Var2 = (ao1) ec1Var.f;
                    if (ao1Var2.u) {
                        gi6VarQ = khb.q(ao1Var2.f);
                        gi6Var = gi6.b;
                        gi6Var2 = gi6.e;
                        gi6Var3 = gi6.f;
                        if (gi6VarQ != gi6Var || khb.q(((ao1) ec1Var.f).f) == gi6.a || khb.q(((ao1) ec1Var.f).f) == gi6.m || khb.q(((ao1) ec1Var.f).f) == gi6Var3 || khb.q(((ao1) ec1Var.f).f) == gi6Var2) {
                            i4 = i3;
                        } else {
                            i4 = 0;
                        }
                        if (khb.q(((ao1) ec1Var.f).f) == gi6.o) {
                            i5 = i3;
                        } else {
                            i5 = 0;
                        }
                        ao1Var3 = (ao1) ec1Var.f;
                        if (ao1Var3.d == null && i4 != 0 && i5 == 0) {
                            z = i3;
                        } else {
                            z = 0;
                        }
                        gi6VarQ2 = khb.q(ao1Var3.f);
                        gi6Var4 = gi6.k;
                        gi6Var5 = gi6.c;
                        if (gi6VarQ2 != gi6Var4 || khb.q(((ao1) ec1Var.f).f) == gi6Var5) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (khb.q(((ao1) ec1Var.f).f) == gi6Var2) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (khb.q(((ao1) ec1Var.f).f) == gi6Var3) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        int i8 = i4;
                        if (khb.q(((ao1) ec1Var.f).f) != gi6.p) {
                            z5 = false;
                        } else {
                            qe1Var7 = ((ao1) ec1Var.f).g;
                            if (qe1Var7 != null || (l2 = qe1Var7.i) == null) {
                                jLongValue2 = 0;
                            } else {
                                jLongValue2 = l2.longValue();
                            }
                            if (jLongValue2 > 0) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                        }
                        z6 = z5;
                        if (khb.q(((ao1) ec1Var.f).f) != gi6.q) {
                            z7 = false;
                        } else {
                            qe1Var6 = ((ao1) ec1Var.f).g;
                            if (qe1Var6 != null || (l = qe1Var6.i) == null) {
                                jLongValue = 0;
                            } else {
                                jLongValue = l.longValue();
                            }
                            if (jLongValue > 0) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                        }
                        ao1 ao1Var11 = (ao1) ec1Var.f;
                        z8 = ao1Var11.h;
                        qe1Var = ao1Var11.g;
                        if (!z8 || z6 || z7 || !(i8 != 0 || z2 || i5 != 0 || z3 || z4)) {
                            z9 = false;
                        } else {
                            if ((qe1Var != null ? qe1Var.a : spannableStringBuilder) != null) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                        }
                        if (z7) {
                            p32 p32VarD2 = ec1Var.d();
                            qe1Var5 = ((ao1) ec1Var.f).g;
                            if (qe1Var5 != null) {
                                charSequence6 = qe1Var5.b;
                            } else {
                                charSequence6 = spannableStringBuilder;
                            }
                            context2 = p32VarD2.a;
                            if (charSequence6 == null) {
                                string = context2.getString(R.string.call_max_connect_failed_title);
                            } else {
                                string = context2.getString(R.string.call_ios_restriction_title, charSequence6);
                            }
                        } else if (z6) {
                            p32 p32VarD3 = ec1Var.d();
                            qe1Var3 = ((ao1) ec1Var.f).g;
                            if (qe1Var3 != null) {
                                charSequence4 = qe1Var3.b;
                            } else {
                                charSequence4 = spannableStringBuilder;
                            }
                            context = p32VarD3.a;
                            if (charSequence4 != null || (string2 = context.getString(R.string.call_phone_recall_no_internet_title, charSequence4)) == null) {
                                string = context.getString(R.string.call_max_connect_failed_title);
                            } else {
                                string = string2;
                            }
                        } else {
                            if (z4) {
                                p32 p32VarD4 = ec1Var.d();
                                qe1Var2 = ((ao1) ec1Var.f).g;
                                if (qe1Var2 != null) {
                                    charSequence3 = qe1Var2.b;
                                } else {
                                    charSequence3 = spannableStringBuilder;
                                }
                                p32VarD4.getClass();
                                charSequence2 = charSequence3 != null ? charSequence3 : "";
                            } else if (qe1Var != null) {
                                string = qe1Var.b;
                            } else {
                                charSequence2 = spannableStringBuilder;
                            }
                            p32 p32VarD5 = ec1Var.d();
                            ao1 ao1Var12 = (ao1) ec1Var.f;
                            String strF = p32VarD5.f(ao1Var12.h, ao1Var12.e, ao1Var12.n, ao1Var12.o, ao1Var12.f);
                            ao1Var4 = (ao1) ec1Var.f;
                            qe1 qe1Var8 = ao1Var4.g;
                            if (ao1Var4.s == yp9Var2) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (khb.q(ao1Var4.f) != gi6Var5 || z2) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (!z6 || z7) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            qe1Var4 = ((ao1) ec1Var.f).g;
                            if (qe1Var4 != null) {
                                charSequence5 = qe1Var4.c;
                            } else {
                                charSequence5 = spannableStringBuilder;
                            }
                            vaiVar = new vai(charSequence2, strF, qe1Var8, z, z10, z11, z9, z12, z7, charSequence5);
                        }
                        charSequence2 = string;
                        p32 p32VarD6 = ec1Var.d();
                        ao1 ao1Var13 = (ao1) ec1Var.f;
                        String strF2 = p32VarD6.f(ao1Var13.h, ao1Var13.e, ao1Var13.n, ao1Var13.o, ao1Var13.f);
                        ao1Var4 = (ao1) ec1Var.f;
                        qe1 qe1Var9 = ao1Var4.g;
                        if (ao1Var4.s == yp9Var2) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (khb.q(ao1Var4.f) != gi6Var5) {
                            z11 = true;
                        } else {
                            z11 = true;
                        }
                        if (z6) {
                            z12 = true;
                        } else {
                            z12 = true;
                        }
                        qe1Var4 = ((ao1) ec1Var.f).g;
                        if (qe1Var4 != null) {
                            charSequence5 = qe1Var4.c;
                        } else {
                            charSequence5 = spannableStringBuilder;
                        }
                        vaiVar = new vai(charSequence2, strF2, qe1Var9, z, z10, z11, z9, z12, z7, charSequence5);
                    } else {
                        vaiVar = spannableStringBuilder;
                    }
                    boolean z25 = ((ao1) ec1Var.f).h;
                    if (ll9Var != null) {
                        ok0Var = ll9Var.a;
                    } else {
                        ok0Var = spannableStringBuilder;
                    }
                    of1Var = new of1(new d62(x7jVar, str, listSingletonList, vaiVar, obj, z25, ok0Var, z16, z17));
                }
                str = str2;
                ll9Var = ll9VarE;
                x7jVar = x7jVar;
                i = 1;
                spannableStringBuilder = null;
                i2 = 2;
                if (ll9Var != null) {
                    npiVar = ll9Var.i;
                    if (((x7j) ec1Var.g) == x7jVar2) {
                        ao1Var5 = (ao1) ec1Var.f;
                        if (ao1Var5.u) {
                            x7jVar = x7jVar;
                            i3 = i;
                        } else {
                            fu1 fu1Var4 = ll9Var.c;
                            if (ao1Var5.h) {
                                p32 p32VarD7 = ec1Var.d();
                                boolean z26 = ll9Var.j;
                                int i9 = ll9Var.l;
                                CharSequence charSequence8 = ll9Var.b;
                                ao1 ao1Var14 = (ao1) ec1Var.f;
                                boolean z27 = ao1Var14.h;
                                pi6 pi6Var2 = ao1Var14.f;
                                boolean z28 = ao1Var14.n;
                                boolean z29 = ll9Var.h;
                                if (npiVar != null) {
                                    z13 = npiVar.g;
                                } else {
                                    z13 = false;
                                }
                                spannableStringBuilderG = p32VarD7.g(z26, i9, charSequence8, z27, z29, z28, z13, pi6Var2, ll9Var.p);
                            } else {
                                p32 p32VarD8 = ec1Var.d();
                                boolean z210 = ll9Var.j;
                                int i10 = ll9Var.l;
                                CharSequence charSequence9 = ll9Var.b;
                                ao1 ao1Var15 = (ao1) ec1Var.f;
                                boolean z211 = ao1Var15.h;
                                pi6 pi6Var3 = ao1Var15.f;
                                boolean z212 = ao1Var15.n;
                                boolean z213 = ll9Var.h;
                                if (npiVar != null) {
                                    z13 = npiVar.g;
                                } else {
                                    z13 = false;
                                }
                                spannableStringBuilderG = p32VarD8.g(z210, i10, charSequence9, z211, z213, z212, z13, pi6Var3, ll9Var.p);
                            }
                            if (cqk.d(ll9Var.c, (fu1) ec1Var.i)) {
                                z14 = false;
                            } else {
                                z14 = false;
                            }
                            boolean z214 = ll9Var.e;
                            z15 = ll9Var.j;
                            if (z15) {
                                if (z15) {
                                    i3 = 1;
                                    if (((ao1) ec1Var.f).h) {
                                        i6 = i3;
                                    } else {
                                        i6 = 4;
                                    }
                                } else {
                                    i3 = 1;
                                    if (((ao1) ec1Var.f).h) {
                                        i6 = i3;
                                    } else {
                                        i6 = 4;
                                    }
                                }
                            } else if (z15) {
                                i3 = 1;
                                if (((ao1) ec1Var.f).h) {
                                    i6 = i3;
                                } else {
                                    i6 = 4;
                                }
                            } else {
                                i3 = 1;
                                if (((ao1) ec1Var.f).h) {
                                    i6 = i3;
                                } else {
                                    i6 = 4;
                                }
                            }
                            tx8Var = new tx8(fu1Var4, spannableStringBuilderG, z14, z214, i6);
                            if (!tx8Var.equals(tx8.f)) {
                                obj = tx8Var;
                            }
                        }
                        obj = spannableStringBuilder;
                    } else {
                        x7jVar = x7jVar;
                        i3 = i;
                        obj = spannableStringBuilder;
                    }
                } else {
                    x7jVar = x7jVar;
                    i3 = i;
                    obj = spannableStringBuilder;
                }
                ao1Var2 = (ao1) ec1Var.f;
                if (ao1Var2.u) {
                    vaiVar = spannableStringBuilder;
                } else {
                    gi6VarQ = khb.q(ao1Var2.f);
                    gi6Var = gi6.b;
                    gi6Var2 = gi6.e;
                    gi6Var3 = gi6.f;
                    if (gi6VarQ != gi6Var) {
                        i4 = i3;
                    } else {
                        i4 = i3;
                    }
                    if (khb.q(((ao1) ec1Var.f).f) == gi6.o) {
                        i5 = i3;
                    } else {
                        i5 = 0;
                    }
                    ao1Var3 = (ao1) ec1Var.f;
                    if (ao1Var3.d == null) {
                        z = 0;
                    } else {
                        z = 0;
                    }
                    gi6VarQ2 = khb.q(ao1Var3.f);
                    gi6Var4 = gi6.k;
                    gi6Var5 = gi6.c;
                    if (gi6VarQ2 != gi6Var4) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    if (khb.q(((ao1) ec1Var.f).f) == gi6Var2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (khb.q(((ao1) ec1Var.f).f) == gi6Var3) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    int i11 = i4;
                    if (khb.q(((ao1) ec1Var.f).f) != gi6.p) {
                        z5 = false;
                    } else {
                        qe1Var7 = ((ao1) ec1Var.f).g;
                        if (qe1Var7 != null) {
                            jLongValue2 = 0;
                        } else {
                            jLongValue2 = 0;
                        }
                        if (jLongValue2 > 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                    }
                    z6 = z5;
                    if (khb.q(((ao1) ec1Var.f).f) != gi6.q) {
                        z7 = false;
                    } else {
                        qe1Var6 = ((ao1) ec1Var.f).g;
                        if (qe1Var6 != null) {
                            jLongValue = 0;
                        } else {
                            jLongValue = 0;
                        }
                        if (jLongValue > 0) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                    }
                    ao1 ao1Var16 = (ao1) ec1Var.f;
                    z8 = ao1Var16.h;
                    qe1Var = ao1Var16.g;
                    if (z8) {
                        z9 = false;
                    } else {
                        z9 = false;
                    }
                    if (z7) {
                        p32 p32VarD9 = ec1Var.d();
                        qe1Var5 = ((ao1) ec1Var.f).g;
                        if (qe1Var5 != null) {
                            charSequence6 = qe1Var5.b;
                        } else {
                            charSequence6 = spannableStringBuilder;
                        }
                        context2 = p32VarD9.a;
                        if (charSequence6 == null) {
                            string = context2.getString(R.string.call_max_connect_failed_title);
                        } else {
                            string = context2.getString(R.string.call_ios_restriction_title, charSequence6);
                        }
                    } else if (z6) {
                        p32 p32VarD10 = ec1Var.d();
                        qe1Var3 = ((ao1) ec1Var.f).g;
                        if (qe1Var3 != null) {
                            charSequence4 = qe1Var3.b;
                        } else {
                            charSequence4 = spannableStringBuilder;
                        }
                        context = p32VarD10.a;
                        if (charSequence4 != null) {
                            string = context.getString(R.string.call_max_connect_failed_title);
                        } else {
                            string = context.getString(R.string.call_max_connect_failed_title);
                        }
                    } else {
                        if (z4) {
                            p32 p32VarD11 = ec1Var.d();
                            qe1Var2 = ((ao1) ec1Var.f).g;
                            if (qe1Var2 != null) {
                                charSequence3 = qe1Var2.b;
                            } else {
                                charSequence3 = spannableStringBuilder;
                            }
                            p32VarD11.getClass();
                            charSequence2 = charSequence3 != null ? charSequence3 : "";
                        } else if (qe1Var != null) {
                            string = qe1Var.b;
                        } else {
                            charSequence2 = spannableStringBuilder;
                        }
                        p32 p32VarD12 = ec1Var.d();
                        ao1 ao1Var17 = (ao1) ec1Var.f;
                        String strF3 = p32VarD12.f(ao1Var17.h, ao1Var17.e, ao1Var17.n, ao1Var17.o, ao1Var17.f);
                        ao1Var4 = (ao1) ec1Var.f;
                        qe1 qe1Var10 = ao1Var4.g;
                        if (ao1Var4.s == yp9Var2) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (khb.q(ao1Var4.f) != gi6Var5) {
                            z11 = true;
                        } else {
                            z11 = true;
                        }
                        if (z6) {
                            z12 = true;
                        } else {
                            z12 = true;
                        }
                        qe1Var4 = ((ao1) ec1Var.f).g;
                        if (qe1Var4 != null) {
                            charSequence5 = qe1Var4.c;
                        } else {
                            charSequence5 = spannableStringBuilder;
                        }
                        vaiVar = new vai(charSequence2, strF3, qe1Var10, z, z10, z11, z9, z12, z7, charSequence5);
                    }
                    charSequence2 = string;
                    p32 p32VarD13 = ec1Var.d();
                    ao1 ao1Var18 = (ao1) ec1Var.f;
                    String strF4 = p32VarD13.f(ao1Var18.h, ao1Var18.e, ao1Var18.n, ao1Var18.o, ao1Var18.f);
                    ao1Var4 = (ao1) ec1Var.f;
                    qe1 qe1Var11 = ao1Var4.g;
                    if (ao1Var4.s == yp9Var2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (khb.q(ao1Var4.f) != gi6Var5) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (z6) {
                        z12 = true;
                    } else {
                        z12 = true;
                    }
                    qe1Var4 = ((ao1) ec1Var.f).g;
                    if (qe1Var4 != null) {
                        charSequence5 = qe1Var4.c;
                    } else {
                        charSequence5 = spannableStringBuilder;
                    }
                    vaiVar = new vai(charSequence2, strF4, qe1Var11, z, z10, z11, z9, z12, z7, charSequence5);
                }
                boolean z215 = ((ao1) ec1Var.f).h;
                if (ll9Var != null) {
                    ok0Var = ll9Var.a;
                } else {
                    ok0Var = spannableStringBuilder;
                }
                of1Var = new of1(new d62(x7jVar, str, listSingletonList, vaiVar, obj, z215, ok0Var, z16, z17));
            }
            if (mjgVar.h(value, of1Var)) {
                return;
            } else {
                h02Var2 = h02Var;
            }
        }
    }

    public static final void C(h02 h02Var, String str) {
        Object value;
        String str2 = ((f62) ((n42) h02Var.H()).f.a.getValue()).h;
        if ((cqk.d(str, str2) || r5h.X0(str2)) && h02Var.I().j.a.getValue() != null) {
            String name = h02.class.getName();
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, c0a.o("displayed session ", str, " ended, held remains — close screen"), null);
                }
            }
            mjg mjgVar = h02Var.w;
            do {
                value = mjgVar.getValue();
            } while (!mjgVar.h(value, new pf1(str)));
        }
    }

    public final boolean D(boolean z) {
        if (!K().h && !z) {
            return true;
        }
        if (K().u) {
            return false;
        }
        return K().h || K().v;
    }

    public final void E(x7j x7jVar, boolean z) {
        x7j x7jVar2 = ((l9) this.e.r.a.getValue()).e.f;
        this.e.a(x7jVar);
        if (z) {
            G().b(2000L);
            String name = h02.class.getName();
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, "onUserChangeMode, current:" + x7jVar2 + ", new: " + x7jVar, null);
                }
            }
            boolean z2 = x7jVar2 == x7j.c && x7jVar == x7j.a;
            xb9 xb9Var = (xb9) ((et3) this.l.getValue());
            gvb gvbVar = xb9Var.M0;
            zv8[] zv8VarArr = xb9.g1;
            if (((Boolean) gvbVar.m(xb9Var, zv8VarArr[30])).booleanValue() || !z2) {
                return;
            }
            xb9 xb9Var2 = (xb9) ((et3) this.l.getValue());
            xb9Var2.M0.B(xb9Var2, zv8VarArr[30], Boolean.TRUE);
        }
    }

    public final void F() {
        Object value;
        f9b f9bVarI = this.e.i();
        do {
            value = f9bVarI.getValue();
        } while (!f9bVarI.h(value, k52.a((k52) value, null, 0, null, null, null, null, 0L, 1007)));
    }

    public final h22 G() {
        return (h22) this.o.getValue();
    }

    public final k42 H() {
        return (k42) this.m.getValue();
    }

    public final b95 I() {
        return (b95) this.n.getValue();
    }

    public final String J() {
        return ((ao1) this.u.a.getValue()).a;
    }

    public final ao1 K() {
        return (ao1) this.u.a.getValue();
    }

    public final xhh L() {
        return (xhh) this.i.getValue();
    }

    public final void M(boolean z) {
        mjg mjgVar;
        Object value;
        do {
            mjgVar = this.B;
            value = mjgVar.getValue();
            ((Boolean) value).getClass();
        } while (!mjgVar.h(value, Boolean.valueOf(z)));
    }

    public final void N(int i) throws IllegalAccessException, InvocationTargetException {
        boolean z;
        h22 h22VarG = G();
        boolean z2 = h22VarG.g;
        boolean z3 = i > 0;
        h22VarG.g = z3;
        if (z3) {
            sgg sggVar = h22VarG.e;
            if (sggVar != null) {
                sggVar.b(null);
            }
            h22VarG.e = null;
            return;
        }
        if (!z2 || (z = h22VarG.f) || z || z3) {
            return;
        }
        h22VarG.b(2000L);
    }

    public final void O() {
        Long l;
        qe1 qe1Var = K().g;
        if (qe1Var == null || (l = qe1Var.a) == null) {
            gm0.Y(h02.class.getName(), "Early return in openCallChat cuz of currentCallState.chatInfo?.chatId is null");
            return;
        }
        sa2 sa2Var = (sa2) this.j.getValue();
        String strA = ns4.a(K().a);
        boolean z = K().h;
        sa2Var.getClass();
        sa2.c(sa2Var, "CHAT_OPENED", strA, null, null, null, null, z, null, 380);
        cs1.b.getClass();
        n65 n65Var = new n65();
        n65Var.a = ":chats";
        n65Var.d(l, "id");
        n65Var.d("local", "type");
        n65Var.d(Boolean.TRUE, "pop_controllers");
        bc1.q(n65Var.b(), this.G);
    }

    public final void P(fu1 fu1Var) {
        tmc tmcVarB = this.e.b();
        if (fu1Var.equals(tmcVarB.a.getId()) || tmcVarB.a.j()) {
            a8j.x(this.G, new gy1(fu1Var));
        }
    }

    public final void Q(boolean z, Intent intent) {
        Conversation conversationA;
        w82 w82Var = this.e;
        z3f z3fVar = w82Var.e;
        if (!z || !z3fVar.c()) {
            if (z && (conversationA = ((f9) z3fVar.a.getValue()).a()) != null && !conversationA.isDestroyed() && intent != null) {
                w82Var.c.d(false);
                w82Var.d.a = intent;
                z3fVar.b(true);
                rb0 rb0Var = (rb0) ((ac1) w82Var.b).h.get();
                if (rb0Var != null) {
                    rb0Var.d(true);
                }
            } else if (!z && z3fVar.c()) {
                z3fVar.b(false);
            }
        }
        sa2 sa2Var = (sa2) this.j.getValue();
        String strA = ns4.a(J());
        boolean z2 = ((ao1) this.u.a.getValue()).h;
        sa2Var.getClass();
        sa2.c(sa2Var, "SCREEN_SHARE", strA, null, Long.valueOf(z ? 1L : 0L), null, null, z2, null, 372);
    }

    public final void R(fu1 fu1Var, Point point) {
        h22 h22VarG = G();
        h22VarG.f = true;
        sgg sggVar = h22VarG.e;
        if (sggVar != null) {
            sggVar.b(null);
        }
        h22VarG.e = null;
        ze1 ze1VarC = this.g.c(fu1Var, point);
        if (ze1VarC != null) {
            ((sa2) this.j.getValue()).a(fu1Var.a, ns4.a(J()), ze1VarC.c);
            a8j.x(this.G, new oy1(ze1VarC));
        } else {
            gm0.Y(h02.class.getName(), "Early return in showOpponentDetailInfo cuz of opponentActions is null");
            h22 h22VarG2 = G();
            h22VarG2.f = false;
            if (h22VarG2.g) {
                return;
            }
            h22VarG2.b(2000L);
        }
    }

    @Override // defpackage.a8j
    public final void y() {
        b95 b95VarI = I();
        b95VarI.l.remove(this.Z);
        String str = this.F;
        if (str != null) {
            I().j(str);
        }
    }
}
