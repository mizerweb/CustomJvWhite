package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zkf extends mjf {
    public final q24 b;
    public final Long c;
    public final long d;
    public final g4b f;
    public final String e = getClass().getName();
    public String g = "";

    public zkf(ykf ykfVar) {
        this.b = ykfVar.a;
        this.c = ykfVar.b;
        this.d = ykfVar.c;
        this.f = ykfVar.d;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0218  */
    @Override // defpackage.mjf
    public void B() {
        long jLongValue;
        int iIntValue;
        je9 je9Var = je9.f;
        njf njfVar = this.a;
        if (njfVar == null) {
            njfVar = null;
        }
        byte b = 0;
        this.g = njfVar.g().E(this.f, D(), false, "comment_round_trip");
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jNanoTime = System.nanoTime() ^ ((long) UUID.randomUUID().hashCode());
        njf njfVar2 = this.a;
        if (njfVar2 == null) {
            njfVar2 = null;
        }
        rt2 rt2Var = (rt2) ((xn3) njfVar2.N.getValue()).l(this.b.a).a.getValue();
        if (rt2Var == null) {
            String str = this.e;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "ParentChat is null, skipping task", null);
            }
            njf njfVar3 = this.a;
            h4b h4bVarG = (njfVar3 != null ? njfVar3 : null).g();
            String str2 = this.g;
            b9b b9bVar = q1f.b;
            h4bVarG.getClass();
            f4b f4bVar = f4b.NON_EXISTED_CHAT_IN_SERVICE_TASK;
            b9b b9bVar2 = new b9b();
            if (b9bVar.f()) {
                b9bVar2.k("attaches", b9bVar);
            }
            qrc.o(h4bVarG, f4bVar, str2, b9bVar2, null, 24);
            return;
        }
        njf njfVar4 = this.a;
        if (njfVar4 == null) {
            njfVar4 = null;
        }
        s04 s04Var = (s04) ((r8e) ((xn3) njfVar4.N.getValue()).c.i(this.b)).a.getValue();
        if (s04Var == null) {
            String str3 = this.e;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str3, "CommentsChat is null, skipping task", null);
            }
            njf njfVar5 = this.a;
            if (njfVar5 == null) {
                njfVar5 = null;
            }
            qrc.m(njfVar5.g(), f4b.NON_EXISTED_COMMENTS_CHAT_IN_SERVICE_TASK, this.g, null, 28);
            return;
        }
        jy3 jy3VarC = C();
        if (jy3VarC == null) {
            gm0.Y(this.e, "message is null. skipping task");
            njf njfVar6 = this.a;
            h4b h4bVarG2 = (njfVar6 != null ? njfVar6 : null).g();
            String str4 = this.g;
            int iD = qt4.D(s04Var.p());
            q24 q24Var = this.b;
            h4b.D(h4bVarG2, str4, jNanoTime, iD, q24Var.a, null, Long.valueOf(q24Var.b), 16);
            return;
        }
        jy3VarC.f = jNanoTime;
        String str5 = jy3VarC.g;
        rfa rfaVarI = (str5 == null || str5.length() == 0 || jy3VarC.g.length() <= (iIntValue = ((Number) t().b.r.a(e5d.S6[9]).i()).intValue())) ? null : new ww6(iIntValue, 11, b).i(jy3VarC);
        njf njfVar7 = this.a;
        if (njfVar7 == null) {
            njfVar7 = null;
        }
        h4b h4bVarG3 = njfVar7.g();
        String str6 = this.g;
        b9b b9bVarB = ppl.b(jy3VarC);
        int iD2 = qt4.D(s04Var.p());
        q24 q24Var2 = this.b;
        h4bVarG3.z(str6, b9bVarB, jNanoTime, iD2, q24Var2.a, Long.valueOf(q24Var2.b));
        if (this.c != null) {
            njf njfVar8 = this.a;
            if (njfVar8 == null) {
                njfVar8 = null;
            }
            ky3 ky3VarS = njfVar8.d().s(this.c.longValue());
            if (ky3VarS != null) {
                jy3VarC.q = ky3VarS;
                jy3VarC.o = 1;
                long j = ky3VarS.b;
                q24 q24Var3 = this.b;
                jy3VarC.x = q24Var3.a;
                jy3VarC.K = q24Var3.b;
                jy3VarC.y = j;
            } else {
                String str7 = this.e;
                a4c a4cVar3 = gm0.f;
                if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                    a4cVar3.c(je9Var, str7, "replied comment not found " + this.b + " " + this.c, null);
                }
            }
        }
        long jR = t().a.r() + jCurrentTimeMillis;
        nx2 nx2Var = s04Var.b;
        Long lValueOf = nx2Var != null ? Long.valueOf(nx2Var.j) : null;
        if (lValueOf == null) {
            jLongValue = jR;
        } else {
            if (lValueOf.longValue() == 0) {
                lValueOf = null;
            }
            if (lValueOf != null) {
                long jLongValue2 = lValueOf.longValue();
                njf njfVar9 = this.a;
                if (njfVar9 == null) {
                    njfVar9 = null;
                }
                ky3 ky3VarS2 = njfVar9.d().s(jLongValue2);
                Long lValueOf2 = ky3VarS2 != null ? Long.valueOf(ky3VarS2.c) : null;
                if (lValueOf2 != null) {
                    jLongValue = lValueOf2.longValue();
                } else {
                    jLongValue = jR;
                }
            } else {
                jLongValue = jR;
            }
        }
        jy3VarC.k = jR;
        jy3VarC.c = jLongValue;
        jy3VarC.I = rt2Var.R() ? 4 : 2;
        jy3VarC.h = 0L;
        jy3VarC.e = t().a.t();
        if (jy3VarC.n == null) {
            jy3VarC.n = new f70().c();
        }
        ky3 ky3VarA = jy3VarC.a();
        njf njfVar10 = this.a;
        if (njfVar10 == null) {
            njfVar10 = null;
        }
        ((wae) njfVar10.b.getValue()).d(ky3VarA);
        njf njfVar11 = this.a;
        if (njfVar11 == null) {
            njfVar11 = null;
        }
        ki8 ki8Var = (ki8) njfVar11.t.getValue();
        ki8Var.getClass();
        String str8 = ky3VarA.g;
        c46 c46Var = ky3VarA.n;
        List list = ky3VarA.D;
        if (list == null) {
            list = r66.a;
        }
        List list2 = list;
        long j2 = ky3VarA.f;
        int iA = pm9.a(c46Var);
        int i = ky3VarA.J;
        boolean z = ky3VarA.u;
        int i2 = ky3VarA.B;
        sfa sfaVar = ky3VarA.q;
        uy3 uy3Var = new uy3(0L, ky3VarA.K, 0L, ky3VarA.c, 0L, ky3VarA.e, j2, str8, xfa.SENDING, wja.ACTIVE, ky3VarA.k, c46Var, iA, i, z, ky3VarA.o, sfaVar != null ? sfaVar.a : 0L, false, ky3VarA.x, ky3VarA.X, ky3VarA.y, i2, list2, ky3VarA.E, ky3VarA.F);
        g24 g24VarC = ki8Var.c();
        long jLongValue3 = ((Number) ch3.G(g24VarC.a, false, true, new i14(g24VarC, uy3Var, 1))).longValue();
        njf njfVar12 = this.a;
        if (njfVar12 == null) {
            njfVar12 = null;
        }
        ky3 ky3VarS3 = njfVar12.d().s(jLongValue3);
        njf njfVar13 = this.a;
        if (ky3VarS3 == null) {
            if (njfVar13 == null) {
                njfVar13 = null;
            }
            qrc.m(njfVar13.g(), f4b.INSERTED_MSG_NULL, this.g, null, 28);
            return;
        }
        if (njfVar13 == null) {
            njfVar13 = null;
        }
        xn3 xn3Var = (xn3) njfVar13.N.getValue();
        q24 q24Var4 = this.b;
        pq3 pq3Var = xn3Var.c;
        s04 s04Var2 = (s04) ((r8e) pq3Var.i(q24Var4)).a.getValue();
        if (s04Var2 != null) {
            tw2 tw2VarH = s04Var2.b.h();
            tw2VarH.j = ky3VarS3.a;
            pq3Var.q(xn3Var.j().D(q24Var4, new nx2(tw2VarH)));
        }
        njf njfVar14 = this.a;
        if (njfVar14 == null) {
            njfVar14 = null;
        }
        ((p24) njfVar14.v.getValue()).a(new vy3(this.b, Collections.singletonList(Long.valueOf(ky3VarS3.a)), true, false));
        njf njfVar15 = this.a;
        if (njfVar15 == null) {
            njfVar15 = null;
        }
        ((p24) njfVar15.v.getValue()).a(new wy3(this.b));
        long jE = E(this.b, ky3VarS3.a, this.g);
        if (rfaVarI != null) {
            q24 q24Var5 = this.b;
            String str9 = rfaVarI.g;
            List list3 = rfaVarI.D;
            if (list3 == null) {
                list3 = r66.a;
            }
            qlf qlfVar = new qlf(q24Var5, str9, list3);
            qlfVar.b = this.c;
            qlfVar.c = jE;
            x().c(new rlf(qlfVar));
        }
        njf njfVar16 = this.a;
        (njfVar16 != null ? njfVar16 : null).g().G(this.g);
    }

    public abstract jy3 C();

    public abstract String D();

    public final long E(q24 q24Var, long j, String str) {
        String str2 = this.e;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str2, zo5.j(j, "Service task finish process and call msgSend, msgId = "), null);
            }
        }
        pvb pvbVarB = b();
        long j2 = q24Var.a;
        long j3 = q24Var.b;
        long j4 = this.d;
        if (!pvbVarB.k(j)) {
            return 0L;
        }
        return ((sih) pvbVarB.b.getValue()).c(new mz3(pvbVarB.u().a.g(), new q24(j2, j3), j, str), false, j4, 1);
    }
}
