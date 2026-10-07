package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vvg extends a8j {
    public static final /* synthetic */ zv8[] q = {new z8b(vvg.class, "sendStoryReplyJob", "getSendStoryReplyJob()Lkotlinx/coroutines/Job;"), zo5.e(zfe.a, vvg.class, "sendStoryReactJob", "getSendStoryReactJob()Lkotlinx/coroutines/Job;")};
    public final gjg c;
    public final azg d;
    public final q7g e;
    public final ahf f;
    public final ny8 h;
    public final ny8 i;
    public final mjg m;
    public final ic6 n;
    public final ic6 o;
    public final r8e p;
    public final String g = vvg.class.getName();
    public final p3c j = qyj.S();
    public final p3c k = qyj.S();
    public int l = -1;

    public vvg(gjg gjgVar, azg azgVar, ny8 ny8Var, ny8 ny8Var2, q7g q7gVar, ahf ahfVar) {
        this.c = gjgVar;
        this.d = azgVar;
        this.e = q7gVar;
        this.f = ahfVar;
        this.h = ny8Var;
        this.i = ny8Var2;
        Boolean bool = Boolean.FALSE;
        this.m = p90.a(bool);
        this.n = new ic6(null);
        this.o = new ic6(null);
        this.p = e9i.G0(e9i.M0(new jz(gjgVar, 13), new rgi((lq4) null, this, 13)), this.b, j0g.a, bool);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object B(vvg vvgVar, nq4 nq4Var) {
        uvg uvgVar;
        if (nq4Var instanceof uvg) {
            uvgVar = (uvg) nq4Var;
            int i = uvgVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                uvgVar.f = i - Integer.MIN_VALUE;
            } else {
                uvgVar = new uvg(vvgVar, nq4Var);
            }
        } else {
            uvgVar = new uvg(vvgVar, nq4Var);
        }
        Object objM0 = uvgVar.d;
        hu4 hu4Var = hu4.a;
        int i2 = uvgVar.f;
        lq4 lq4Var = null;
        if (i2 == 0) {
            ch3.d0(objM0);
            ghb ghbVar = ew5.b;
            long jO = qe7.O(1, lw5.SECONDS);
            fpf fpfVar = new fpf(vvgVar, lq4Var, 5);
            uvgVar.f = 1;
            objM0 = lvb.M0(jO, fpfVar, uvgVar);
            if (objM0 == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objM0);
        }
        if (((Boolean) objM0) == null) {
            String str = vvgVar.g;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "timeout waiting for keyboards to close, showing reply snackbar anyway", null);
                }
            }
        }
        return sbi.a;
    }

    public final xhh C() {
        return (xhh) this.h.getValue();
    }

    public final void D() {
        a8j.x(this.o, mvg.a);
    }

    public final void E(cf7 cf7Var, boolean z) {
        Long l = (Long) this.c.getValue();
        if (l != null) {
            long jLongValue = l.longValue();
            this.k.B(this, q[1], yab.h0(this.b, ((n0c) C()).a(), 2, new tvg(z, this, jLongValue, cf7Var, null)));
            return;
        }
        String str = this.g;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "can't reactToStory cuz storyId is null", null);
            }
        }
        cf7Var.invoke(Boolean.FALSE);
    }
}
