package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class i6j extends a8j {
    public static final /* synthetic */ zv8[] u;
    public final long c;
    public final long d;
    public final String e;
    public final sua f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final mjg k;
    public final r8e l;
    public final mjg m;
    public final r8e n;
    public final ic6 o;
    public final p3c p;
    public final mjg q;
    public final r8e r;
    public final mjg s;
    public final r8e t;

    static {
        z8b z8bVar = new z8b(i6j.class, "reloadWebAppJob", "getReloadWebAppJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        u = new zv8[]{z8bVar};
    }

    public i6j(long j, long j2, String str, sua suaVar, xhh xhhVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4) {
        this.c = j;
        this.d = j2;
        this.e = str;
        this.f = suaVar;
        this.g = ny8Var;
        this.h = ny8Var2;
        this.i = ny8Var3;
        this.j = ny8Var4;
        mjg mjgVarA = p90.a(str);
        this.k = mjgVarA;
        this.l = e9i.G0(new zhi(mjgVarA, 4, this), this.b, j0g.a, null);
        mjg mjgVarA2 = p90.a(null);
        this.m = mjgVarA2;
        this.n = new r8e(mjgVarA2);
        this.o = new ic6(null);
        this.p = qyj.S();
        mjg mjgVarA3 = p90.a(new k53((CharSequence) null, (String) null, (CharSequence) null, false, false, 63));
        this.q = mjgVarA3;
        this.r = new r8e(mjgVarA3);
        mjg mjgVarA4 = p90.a(null);
        this.s = mjgVarA4;
        this.t = new r8e(mjgVarA4);
        a8j.t(this, ((n0c) xhhVar).a(), new fpf(this, null, 18), 2);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public static final Object B(i6j i6jVar, nq4 nq4Var) {
        g6j g6jVar;
        sfa sfaVar;
        CharSequence charSequenceK;
        vg4 vg4Var;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof g6j) {
            g6jVar = (g6j) nq4Var;
            int i = g6jVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                g6jVar.g = i - Integer.MIN_VALUE;
            } else {
                g6jVar = new g6j(i6jVar, nq4Var);
            }
        } else {
            g6jVar = new g6j(i6jVar, nq4Var);
        }
        Object objF = g6jVar.e;
        hu4 hu4Var = hu4.a;
        int i2 = g6jVar.g;
        if (i2 == 0) {
            ch3.d0(objF);
            sua suaVar = i6jVar.f;
            long j = i6jVar.d;
            g6jVar.g = 1;
            objF = suaVar.f(j, g6jVar);
            if (objF != hu4Var) {
            }
            return hu4Var;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                sfaVar = g6jVar.d;
                ch3.d0(objF);
                rt2 rt2Var = (rt2) objF;
                rt2Var.K0();
                charSequenceK = rt2Var.j;
                CharSequence charSequence = charSequenceK;
                mjg mjgVar = i6jVar.q;
                k53 k53Var = new k53(charSequence, ((p4c) i6jVar.i.getValue()).e(sfaVar.c), (CharSequence) null, false, true, 28);
                mjgVar.getClass();
                mjgVar.j(null, k53Var);
                return sbiVar;
            }
            if (i2 != 3) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sfaVar = g6jVar.d;
            ch3.d0(objF);
            vg4Var = (vg4) objF;
            if (vg4Var != null) {
                charSequenceK = vg4Var.k();
            } else {
                charSequenceK = null;
            }
            if (charSequenceK == null) {
                charSequenceK = "";
            }
            CharSequence charSequence2 = charSequenceK;
            mjg mjgVar2 = i6jVar.q;
            k53 k53Var2 = new k53(charSequence2, ((p4c) i6jVar.i.getValue()).e(sfaVar.c), (CharSequence) null, false, true, 28);
            mjgVar2.getClass();
            mjgVar2.j(null, k53Var2);
            return sbiVar;
        }
        ch3.d0(objF);
        sfa sfaVar2 = (sfa) objF;
        if (sfaVar2 == null) {
            gm0.Y(i6j.class.getName(), "Early return in prepareInfoPanelState cuz of messagesRepository.selectMessage(msgId) is null");
            return sbiVar;
        }
        if (sfaVar2.J == 4) {
            xn3 xn3Var = (xn3) i6jVar.h.getValue();
            long j2 = sfaVar2.h;
            g6jVar.d = sfaVar2;
            g6jVar.g = 2;
            Object objV = xn3Var.v(j2, g6jVar);
            if (objV != hu4Var) {
                sfaVar = sfaVar2;
                objF = objV;
                rt2 rt2Var2 = (rt2) objF;
                rt2Var2.K0();
                charSequenceK = rt2Var2.j;
                CharSequence charSequence3 = charSequenceK;
                mjg mjgVar3 = i6jVar.q;
                k53 k53Var3 = new k53(charSequence3, ((p4c) i6jVar.i.getValue()).e(sfaVar.c), (CharSequence) null, false, true, 28);
                mjgVar3.getClass();
                mjgVar3.j(null, k53Var3);
                return sbiVar;
            }
        } else {
            no4 no4Var = (no4) i6jVar.g.getValue();
            long j3 = sfaVar2.e;
            g6jVar.d = sfaVar2;
            g6jVar.g = 3;
            Object objI = no4Var.i(j3);
            if (objI != hu4Var) {
                sfaVar = sfaVar2;
                objF = objI;
                vg4Var = (vg4) objF;
                if (vg4Var != null) {
                    charSequenceK = vg4Var.k();
                } else {
                    charSequenceK = null;
                }
                if (charSequenceK == null) {
                    charSequenceK = "";
                }
                CharSequence charSequence4 = charSequenceK;
                mjg mjgVar4 = i6jVar.q;
                k53 k53Var4 = new k53(charSequence4, ((p4c) i6jVar.i.getValue()).e(sfaVar.c), (CharSequence) null, false, true, 28);
                mjgVar4.getClass();
                mjgVar4.j(null, k53Var4);
                return sbiVar;
            }
        }
        return hu4Var;
    }

    public final void C(int i) {
        long j = this.d;
        ic6 ic6Var = this.o;
        if (i == R.id.video_go_to_message) {
            a8j.x(ic6Var, z43.b.k(this.c, j));
            return;
        }
        if (i == R.id.video_share) {
            if (j == 0) {
                a8j.x(ic6Var, new f6j(this.e));
            } else {
                z43.b.getClass();
                a8j.x(ic6Var, z43.j(j, null));
            }
        }
    }

    public final void D(String str, boolean z) {
        String name = i6j.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, qt4.n("videoWebView: onPageStartLoading: ", str, " ", z), null);
            }
        }
        if (!cqk.d((String) this.k.getValue(), str) || z) {
            mjg mjgVar = this.m;
            mlc mlcVar = mlc.a;
            mjgVar.getClass();
            mjgVar.j(null, mlcVar);
        }
    }
}
