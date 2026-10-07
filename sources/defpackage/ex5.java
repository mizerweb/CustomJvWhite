package defpackage;

import one.me.android.OneMeApplication;

/* JADX INFO: loaded from: classes.dex */
public final class ex5 implements af7 {
    public static final dx5 c = new dx5();
    public final /* synthetic */ int a;
    public final OneMeApplication b;

    public /* synthetic */ ex5(OneMeApplication oneMeApplication, int i) {
        this.a = i;
        this.b = oneMeApplication;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        OneMeApplication oneMeApplication = this.b;
        switch (i) {
            case 0:
                d7c d7cVar = d7c.a;
                o1c o1cVar = (o1c) d7cVar.getAccessor().c(806);
                dq4 dq4VarA = cqk.a(lvb.x0(vd7.a(), (yt4) d7cVar.getAccessor().c(48)).u0(((n0c) ((xhh) d7cVar.getAccessor().c(23))).c().S0()));
                yab.i0(dq4VarA, ao5.c, 0, new qob(o1cVar, this, null, 21), 2);
                e9i.j0(new fz6(o1cVar.a, new y73(this, (lq4) null, 8), 3), dq4VarA);
                return sbi.a;
            case 1:
                int i2 = OneMeApplication.g;
                return (Boolean) oneMeApplication.b().f().I5.a(e5d.S6[348]).i();
            default:
                int i3 = OneMeApplication.g;
                return (Boolean) oneMeApplication.b().f().J5.a(e5d.S6[349]).i();
        }
    }
}
