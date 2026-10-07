package defpackage;

import android.graphics.drawable.Drawable;
import one.me.rlottie.RLottieDrawable;
import one.me.rlottie.RLottieFactory;

/* JADX INFO: loaded from: classes.dex */
public abstract class ye8 {
    public static final /* synthetic */ zv8[] m;
    public final gu4 a;
    public final wd8 b;
    public final xm c;
    public final String d = getClass().getName();
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final mjg h;
    public final r8e i;
    public final pzf j;
    public final q8e k;
    public final p3c l;

    static {
        z8b z8bVar = new z8b(ye8.class, "animojiFetchJob", "getAnimojiFetchJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        m = new zv8[]{z8bVar};
    }

    public ye8(gu4 gu4Var, wd8 wd8Var, xm xmVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = gu4Var;
        this.b = wd8Var;
        this.c = xmVar;
        this.e = ny8Var;
        this.f = ny8Var2;
        this.g = ny8Var3;
        mjg mjgVarA = p90.a(hf8.a);
        this.h = mjgVarA;
        this.i = new r8e(mjgVarA);
        pzf pzfVarB = e9i.b(0, 1, 5);
        this.j = pzfVarB;
        this.k = new q8e(pzfVarB);
        this.l = qyj.S();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static Object h(ye8 ye8Var, nq4 nq4Var) {
        we8 we8Var;
        ye8 ye8Var2 = ye8Var;
        if (nq4Var instanceof we8) {
            we8Var = (we8) nq4Var;
            int i = we8Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                we8Var.g = i - Integer.MIN_VALUE;
            } else {
                we8Var = new we8(ye8Var2, nq4Var);
            }
        } else {
            we8Var = new we8(ye8Var2, nq4Var);
        }
        Object objD = we8Var.e;
        int i2 = we8Var.g;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(objD);
            Object value = ye8Var2.i.a.getValue();
            gf8 gf8Var = value instanceof gf8 ? (gf8) value : null;
            String str = gf8Var != null ? gf8Var.a : null;
            if (str == null) {
                gm0.Y(ye8Var2.d, "Can't process close request because informer id is null");
                return sbiVar;
            }
            mjg mjgVar = ye8Var2.h;
            mjgVar.getClass();
            mjgVar.j(null, hf8.a);
            wd8 wd8Var = ye8Var2.b;
            we8Var.d = ye8Var2;
            we8Var.g = 1;
            objD = wd8Var.d(str, we8Var);
            if (objD != hu4Var) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(objD);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ye8Var2 = we8Var.d;
        ch3.d0(objD);
        ge8 ge8Var = (ge8) objD;
        if (ge8Var == null) {
            gm0.Y(ye8Var2.d, "Can't process close request because informer is null");
            return sbiVar;
        }
        ye8Var2.e().b(ge8Var.q().a(), ge8Var.i());
        wd8 wd8Var2 = ye8Var2.b;
        ge8 ge8VarA = ge8.a(ge8Var, 0L, 0L, System.currentTimeMillis(), 0, 28671);
        we8Var.d = null;
        we8Var.g = 2;
        return wd8Var2.c(ge8VarA, we8Var) == hu4Var ? hu4Var : sbiVar;
    }

    public abstract Object a(ge8 ge8Var, lq4 lq4Var);

    public abstract Drawable b(RLottieDrawable rLottieDrawable, boolean z, boolean z2);

    public final Drawable c(jl jlVar, boolean z, boolean z2, int i) {
        int iK = gm0.K(i * yl5.d().getDisplayMetrics().density);
        String str = jlVar.c;
        if (str == null) {
            str = "";
        }
        return b(RLottieFactory.create(new RLottieFactory.Config(new RLottieFactory.Way.Url(str, true, iK, iK, true), false, z2, true, false, 18, null)), z, z2);
    }

    public abstract int d();

    public final jf8 e() {
        return (jf8) this.g.getValue();
    }

    public final boolean f(ge8 ge8Var) {
        je9 je9Var = je9.d;
        if (ge8Var.o() == 0) {
            return true;
        }
        if (ge8Var.n() <= ge8Var.k()) {
            long jO = ge8Var.o();
            xb9 xb9Var = (xb9) ((et3) this.e.getValue());
            if (ew5.g(((ew5) xb9Var.K0.m(xb9Var, xb9.g1[28])).a) + jO > System.currentTimeMillis() && ge8Var.e() < ge8Var.o()) {
                return true;
            }
            if (ge8Var.l() + ge8Var.o() < System.currentTimeMillis() && ge8Var.n() < ge8Var.k()) {
                return true;
            }
            String str = this.d;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, qt4.n("Skip informer ", ge8Var.i(), " due to cooldown, splash:", ge8Var.u()), null);
                return false;
            }
        } else {
            String str2 = this.d;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str2, qt4.n("Skip informer ", ge8Var.i(), " due to show count limit reached, splash:", ge8Var.u()), null);
            }
        }
        return false;
    }

    public Object g(qy3 qy3Var) {
        return h(this, qy3Var);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:43:0x0109  */
    /* JADX WARN: Code duplicated, block: B:46:0x0113  */
    /* JADX WARN: Code duplicated, block: B:50:0x0135  */
    /* JADX WARN: Code duplicated, block: B:52:0x013d  */
    /* JADX WARN: Code duplicated, block: B:57:0x0165  */
    /* JADX WARN: Code duplicated, block: B:60:0x0180  */
    /* JADX WARN: Code duplicated, block: B:61:0x0190  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:70:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:73:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:74:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:77:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:85:0x0229  */
    /* JADX WARN: Code duplicated, block: B:86:0x022b  */
    /* JADX WARN: Code duplicated, block: B:89:0x0243 A[LOOP:1: B:89:0x0243->B:95:?, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:96:0x012a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:? A[LOOP:2: B:44:0x010d->B:98:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0085, code lost:
    
        if (r0 == r7) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e0, code lost:
    
        if (r0 == r7) goto L69;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r27v0, types: [java.lang.Object, ye8] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [boolean, int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00e0 -> B:33:0x00e4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(defpackage.nq4 r28) {
        /*
            Method dump skipped, instruction units count: 593
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ye8.i(nq4):java.lang.Object");
    }
}
