package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class wo1 implements to1 {
    public static final /* synthetic */ zv8[] j;
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ifh e;
    public final ifh g;
    public final mjg h;
    public final r8e i;
    public final p3c d = qyj.S();
    public final AtomicBoolean f = new AtomicBoolean(false);

    static {
        z8b z8bVar = new z8b(wo1.class, "checkInviteJob", "getCheckInviteJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        j = new zv8[]{z8bVar};
    }

    public wo1(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4) {
        this.a = ny8Var2;
        this.b = ny8Var;
        this.c = ny8Var3;
        this.e = new ifh(new w40(ny8Var4, 4));
        this.g = new ifh(new z2(this, 14, ny8Var));
        mjg mjgVarA = p90.a(Boolean.FALSE);
        this.h = mjgVarA;
        this.i = new r8e(mjgVarA);
    }

    public final void a() {
        sgg sggVarI0 = yab.i0((y82) this.c.getValue(), (xt4) this.e.getValue(), 0, new vo1(this, null), 2);
        this.d.B(this, j[0], sggVarI0);
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onCallAccepted() {
        super.onCallAccepted();
        a();
    }
}
