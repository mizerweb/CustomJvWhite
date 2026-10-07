package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class thi extends mdh implements qf7 {
    public int e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ uhi h;
    public final /* synthetic */ long i;
    public final /* synthetic */ float j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ Thread l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public thi(uhi uhiVar, long j, float f, boolean z, Thread thread, lq4 lq4Var) {
        super(2, lq4Var);
        this.h = uhiVar;
        this.i = j;
        this.j = f;
        this.k = z;
        this.l = thread;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        thi thiVar = new thi(this.h, this.i, this.j, this.k, this.l, lq4Var);
        thiVar.g = obj;
        return thiVar;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((thi) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i;
        sbi sbiVar = sbi.a;
        gu4 gu4Var = (gu4) this.g;
        hu4 hu4Var = hu4.a;
        int i2 = this.f;
        if (i2 == 0) {
            ch3.d0(obj);
            int iA = this.h.a.a();
            ghb ghbVar = ew5.b;
            long jP = qe7.P(((Number) ((zed) this.h.g.getValue()).b.b().a.j3.a(e5d.S6[219]).i()).longValue(), lw5.MILLISECONDS);
            this.g = gu4Var;
            this.e = iA;
            this.f = 1;
            if (rx8.u(jP, this) == hu4Var) {
                return hu4Var;
            }
            i = iA;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.e;
            ch3.d0(obj);
        }
        if (!cqk.x(gu4Var)) {
            return sbiVar;
        }
        int iA2 = this.h.a.a();
        String str = this.h.h;
        boolean z = this.k;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.s("Hang of upload detected isOnStart=", z), null);
            }
        }
        yj5 yj5Var = (yj5) this.h.e.getValue();
        xj5 xj5Var = xj5.UPLOAD_HANG;
        float fA = this.h.b.a();
        float f = this.i;
        float f2 = this.j;
        float f3 = 1.0f;
        if (!this.k) {
            f3 = Float.NaN;
        }
        Thread thread = this.l;
        yj5.a(yj5Var, xj5Var, fA, f, f2, f3, (thread == null || !thread.isInterrupted()) ? Float.NaN : 1.0f, iA2, i != iA2 ? f3 : Float.NaN, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, this.h.c, null, null, null, null, null, null, -131328);
        return sbiVar;
    }
}
