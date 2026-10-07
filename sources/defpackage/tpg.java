package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class tpg extends a8j {
    public static final /* synthetic */ zv8[] u = {new z8b(tpg.class, "selectedFindJob", "getSelectedFindJob()Lkotlinx/coroutines/Job;"), zo5.e(zfe.a, tpg.class, "addSetInFavoriteJob", "getAddSetInFavoriteJob()Lkotlinx/coroutines/Job;"), new z8b(tpg.class, "clearRecentJob", "getClearRecentJob()Lkotlinx/coroutines/Job;"), new z8b(tpg.class, "openStickerBotJob", "getOpenStickerBotJob()Lkotlinx/coroutines/Job;")};
    public final xhh c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ifh h;
    public final ny8 i;
    public final ny8 j;
    public final mjg k;
    public final r8e l;
    public final AtomicLong m;
    public final mjg n;
    public final r8e o;
    public final p3c p;
    public final p3c q;
    public final p3c r;
    public final p3c s;
    public final ic6 t;

    public tpg(xhh xhhVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ifh ifhVar, ny8 ny8Var5, ny8 ny8Var6) {
        this.c = xhhVar;
        this.d = ny8Var;
        this.e = ny8Var2;
        this.f = ny8Var3;
        this.g = ny8Var4;
        this.h = ifhVar;
        this.i = ny8Var5;
        this.j = ny8Var6;
        r66 r66Var = r66.a;
        mjg mjgVarA = p90.a(new jpg(r66Var, r66Var));
        this.k = mjgVarA;
        this.l = new r8e(mjgVarA);
        this.m = new AtomicLong();
        mjg mjgVarA2 = p90.a(new ipg(0L, 0, 0, 7));
        this.n = mjgVarA2;
        this.o = new r8e(mjgVarA2);
        this.p = qyj.S();
        this.q = qyj.S();
        this.r = qyj.S();
        this.s = qyj.S();
        this.t = new ic6(null);
    }

    public static void B(c79 c79Var, omg omgVar, ArrayList arrayList) {
        co2 co2Var = new co2(omgVar.a, omgVar);
        arrayList.add(co2Var);
        c79Var.add(co2Var);
        c79Var.addAll(omgVar.e);
    }

    public static omg C(emg emgVar, int i, boolean z) {
        int iD = qt4.D(i);
        int i2 = 4;
        if (iD != 0) {
            if (iD == 1) {
                i2 = 6;
            } else if (iD == 2) {
                i2 = 5;
            } else if (iD == 3) {
                i2 = 7;
            } else {
                if (iD != 4) {
                    ore.o();
                    return null;
                }
                i2 = 3;
            }
        }
        long j = emgVar.a;
        String str = emgVar.b;
        if (str == null) {
            str = "";
        }
        return new omg(j, new xnh(str), emgVar.c, null, E(D(i2, j, emgVar.h), z), i, false, false, z, emgVar.g, false, 1224);
    }

    public static List D(final int i, final long j, List list) {
        final boolean z = j == -9223372036854775807L || j == -9223372036854775806L || j == -9223372036854775805L;
        return yhf.w0(new m2i(yhf.m0(new sw(1, list), new chf(21)), new cf7() { // from class: cpg
            @Override // defpackage.cf7
            public final Object invoke(Object obj) {
                clg clgVar = (clg) obj;
                String str = clgVar.h;
                if (str == null) {
                    str = "";
                }
                if (str.length() == 0) {
                    str = clgVar.d;
                }
                String str2 = str;
                long j2 = clgVar.a;
                long j3 = clgVar.k;
                String str3 = clgVar.l;
                String str4 = clgVar.o;
                long j4 = j;
                return new tlg(j2, j4, j3, str2, str3, str4, 0, 0, false, false, z ? Math.abs(j4) - clgVar.a : j2, i, 4032);
            }
        }));
    }

    public static List E(List list, boolean z) {
        if (!z) {
            return list;
        }
        c79 c79VarW = yab.w();
        c79VarW.add(new ua());
        c79VarW.addAll(list);
        return yab.j(c79VarW);
    }

    public final void F(long j, en3 en3Var) {
        sgg sggVarH0 = yab.h0(this.b, ((n0c) this.c).b(), 2, new zw9(en3Var, j, this, (lq4) null, 12));
        this.p.B(this, u[0], sggVarH0);
    }
}
