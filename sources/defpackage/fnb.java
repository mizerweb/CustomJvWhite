package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fnb extends mdh implements qf7 {
    public final /* synthetic */ gnb e;
    public final /* synthetic */ long f;
    public final /* synthetic */ long g;
    public final /* synthetic */ long h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ long j;
    public final /* synthetic */ String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fnb(gnb gnbVar, long j, long j2, long j3, boolean z, long j4, String str, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = gnbVar;
        this.f = j;
        this.g = j2;
        this.h = j3;
        this.i = z;
        this.j = j4;
        this.k = str;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new fnb(this.e, this.f, this.g, this.h, this.i, this.j, this.k, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        fnb fnbVar = (fnb) create((gu4) obj, (lq4) obj2);
        sbi sbiVar = sbi.a;
        fnbVar.invokeSuspend(sbiVar);
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        ch3.d0(obj);
        gnb gnbVar = this.e;
        i8e i8eVar = (i8e) gnbVar.f.getValue();
        long j = this.f;
        long j2 = this.g;
        long j3 = this.h;
        boolean z = this.i;
        i8eVar.getClass();
        i8e.d(i8eVar, j, j2, j3, false, false, z, 88);
        ((h5c) i8eVar.b.getValue()).b(j);
        yob yobVar = (yob) gnbVar.g.getValue();
        long j4 = this.j;
        String str = this.k;
        zob zobVarF = yobVar.f();
        String str2 = zobVarF.a;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str2, ewi.d(j4, "onNotificationMarkAsRead: pushId=", ", eventKey=", str), null);
            }
        }
        if (str != null) {
            ae9.k(zobVarF.b(), "PUSH", "Action", ouk.a(new ylc("trid", Long.valueOf(j4)), new ylc("eKey", str), new ylc("p_op", "m_as_read")), 8);
        }
        return sbi.a;
    }
}
