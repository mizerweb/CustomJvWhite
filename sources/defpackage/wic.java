package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class wic extends a8j {
    public static final /* synthetic */ zv8[] i;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final mjg f;
    public final r8e g;
    public final p3c h;

    static {
        z8b z8bVar = new z8b(wic.class, "changePushNewUserJob", "getChangePushNewUserJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        i = new zv8[]{z8bVar};
    }

    public wic(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.c = ny8Var2;
        this.d = ny8Var;
        this.e = ny8Var3;
        mjg mjgVarA = p90.a(r66.a);
        this.f = mjgVarA;
        this.g = new r8e(mjgVarA);
        this.h = qyj.S();
        mjgVarA.setValue(B());
    }

    public final c79 B() {
        c79 c79VarW = yab.w();
        c79VarW.add(new ctf(R.id.oneme_notifications_settings_other_new_user_button, 0, new tnh(R.string.oneme_notifications_settings_other_new_user_button), null, null, null, null, new ksf(((nni) this.d.getValue()).d.getBoolean("app.notification.show.new.users", true), true), null, false, null, 1912));
        return yab.j(c79VarW);
    }

    public final void C(long j) {
        if (j == R.id.oneme_notifications_settings_other_new_user_button) {
            this.h.B(this, i[0], yab.h0(this.b, ((n0c) ((xhh) this.e.getValue())).b(), 2, new c37(this, null, 14)));
        }
    }
}
