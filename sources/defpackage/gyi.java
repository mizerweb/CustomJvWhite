package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gyi extends mdh implements qf7 {
    public final /* synthetic */ hyi e;
    public final /* synthetic */ long f;
    public final /* synthetic */ long g;
    public final /* synthetic */ mg5 h;
    public final /* synthetic */ String i;
    public final /* synthetic */ rui j;
    public final /* synthetic */ d3j k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gyi(hyi hyiVar, long j, long j2, mg5 mg5Var, String str, rui ruiVar, d3j d3jVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = hyiVar;
        this.f = j;
        this.g = j2;
        this.h = mg5Var;
        this.i = str;
        this.j = ruiVar;
        this.k = d3jVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new gyi(this.e, this.f, this.g, this.h, this.i, this.j, this.k, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        gyi gyiVar = (gyi) create((gu4) obj, (lq4) obj2);
        sbi sbiVar = sbi.a;
        gyiVar.invokeSuspend(sbiVar);
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        ch3.d0(obj);
        d0j d0jVar = (d0j) this.e.b.getValue();
        e3j e3jVar = ((w8g) d0jVar.d.getValue()).get();
        d0jVar.h = e3jVar;
        pzf pzfVar = d0jVar.i;
        w8g w8gVar = (w8g) d0jVar.d.getValue();
        rui ruiVar = this.j;
        long duration = ruiVar.getDuration();
        ny8 ny8Var = d0jVar.f;
        pzfVar.a(new l1j(this.f, this.g, this.h, this.i, ruiVar, duration, e3jVar, w8gVar, (et3) ny8Var.getValue(), (e5d) d0jVar.g.getValue()));
        e3j e3jVar2 = d0jVar.h;
        if (e3jVar2 == null) {
            ore.p("Required value was null.");
            return null;
        }
        e3jVar2.b(1.0f);
        e3jVar2.o0(false);
        e3jVar2.q0(d0jVar);
        e3j.w(e3jVar2, ruiVar, ((gue) d0jVar.e.getValue()).e(), this.k, ((Number) ((xb9) ((et3) ny8Var.getValue())).Q().f()).floatValue(), 80);
        return sbi.a;
    }
}
