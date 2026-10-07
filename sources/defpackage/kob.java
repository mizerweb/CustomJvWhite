package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class kob extends a8j {
    public static final /* synthetic */ zv8[] E = {new z8b(kob.class, "resetDefaultsJob", "getResetDefaultsJob()Lkotlinx/coroutines/Job;"), zo5.e(zfe.a, kob.class, "changeAllNotificationsEnabledJob", "getChangeAllNotificationsEnabledJob()Lkotlinx/coroutines/Job;"), new z8b(kob.class, "changeShowContentJob", "getChangeShowContentJob()Lkotlinx/coroutines/Job;"), new z8b(kob.class, "changeCommentsPushJob", "getChangeCommentsPushJob()Lkotlinx/coroutines/Job;"), new z8b(kob.class, "changeCallVibrationStateJob", "getChangeCallVibrationStateJob()Lkotlinx/coroutines/Job;"), new z8b(kob.class, "checkBatteryOptimizationNotificationStateJob", "getCheckBatteryOptimizationNotificationStateJob()Lkotlinx/coroutines/Job;")};
    public final p3c A;
    public final p3c B;
    public final p3c C;
    public boolean D;
    public final u7f c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final mjg m;
    public final r8e n;
    public final mjg o;
    public final r8e p;
    public final r8e q;
    public final mjg r;
    public final mjg s;
    public final mjg t;
    public final ic6 u;
    public final ic6 v;
    public boolean w;
    public final p3c x;
    public final p3c y;
    public final p3c z;

    public kob(u7f u7fVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9) {
        this.c = u7fVar;
        this.d = ny8Var;
        this.e = ny8Var3;
        this.f = ny8Var4;
        this.g = ny8Var5;
        this.h = ny8Var2;
        this.i = ny8Var6;
        this.j = ny8Var9;
        this.k = ny8Var7;
        this.l = ny8Var8;
        mjg mjgVarA = p90.a(r66.a);
        this.m = mjgVarA;
        this.n = new r8e(mjgVarA);
        mjg mjgVarA2 = p90.a(Boolean.valueOf(!u7fVar.b()));
        this.o = mjgVarA2;
        this.p = new r8e(mjgVarA2);
        this.q = new r8e(p90.a(Boolean.valueOf(u7fVar.b())));
        mjg mjgVarA3 = p90.a(Boolean.valueOf(u7fVar.b()));
        this.r = mjgVarA3;
        mjg mjgVarA4 = p90.a(C());
        this.s = mjgVarA4;
        mjg mjgVarA5 = p90.a(0);
        this.t = mjgVarA5;
        this.u = new ic6(null);
        this.v = new ic6(null);
        this.w = !F().b();
        this.x = qyj.S();
        this.y = qyj.S();
        this.z = qyj.S();
        this.A = qyj.S();
        this.B = qyj.S();
        this.C = qyj.S();
        e9i.j0(e9i.T(new fz6(new o24(new xx6[]{(xx6) B().e.getValue(), (xx6) B().f.getValue(), new r8e(mjgVarA3), new r8e(mjgVarA5), new r8e(mjgVarA4), ((cv0) ny8Var7.getValue()).f, F().g("ignore_battery_optimizations", new cka(19))}, 23, this), new qz9(this, (lq4) null, 13), 3), ((n0c) D()).b()), this.b);
    }

    public static tnh E(int i) {
        if (i == 0) {
            return new tnh(R.string.oneme_notifications_settings_type_on);
        }
        if (i != 1) {
            return i != 2 ? new tnh(R.string.oneme_notifications_settings_type_on) : new tnh(R.string.oneme_notifications_settings_type_reply);
        }
        return new tnh(R.string.oneme_notifications_settings_type_off);
    }

    public final nni B() {
        return (nni) this.d.getValue();
    }

    public final dqe C() {
        ny8 ny8Var = this.i;
        String str = (String) ((xb9) ny8Var.getValue()).T().get(String.valueOf(((xb9) ny8Var.getValue()).t()));
        dqe dqeVarT = str != null ? zpe.t(str) : null;
        return dqeVarT == null ? B().g() : dqeVarT;
    }

    public final xhh D() {
        return (xhh) this.f.getValue();
    }

    public final wsc F() {
        return (wsc) this.j.getValue();
    }

    public final boolean G() {
        String string = B().d.getString("app.comments.push.notification.status", null);
        return (ch3.r(string) ? 1 : nbh.a(string)) == 1;
    }

    public final void H(long j) {
        long j2 = R.id.oneme_notifications_settings_open_settings_calls_ringtone;
        ic6 ic6Var = this.u;
        if (j == j2) {
            bnb.b.getClass();
            a8j.x(ic6Var, new i65(":settings/ringtone"));
            return;
        }
        long j3 = R.id.oneme_notifications_settings_open_settings_calls_vibration;
        dq4 dq4Var = this.b;
        zv8[] zv8VarArr = E;
        if (j == j3) {
            this.B.B(this, zv8VarArr[4], yab.h0(dq4Var, ((n0c) D()).b(), 2, new job(this, null, 4)));
            return;
        }
        if (j == R.id.oneme_notifications_settings_enable_all_notifications_button) {
            this.y.B(this, zv8VarArr[1], yab.h0(dq4Var, ((n0c) D()).b(), 2, new job(this, null, 2)));
            return;
        }
        if (j == R.id.oneme_notifications_settings_dialog_settings_button) {
            bnb.b.getClass();
            a8j.x(ic6Var, new i65(":settings/notifications/dialog"));
            return;
        }
        if (j == R.id.oneme_notifications_settings_chat_settings_button) {
            bnb.b.getClass();
            a8j.x(ic6Var, new i65(":settings/notifications/chat"));
            return;
        }
        if (j == R.id.oneme_notifications_settings_other_settings_button) {
            bnb.b.getClass();
            a8j.x(ic6Var, new i65(":settings/notifications/other"));
            return;
        }
        if (j == R.id.oneme_notifications_settings_show_content_button) {
            this.z.B(this, zv8VarArr[2], a8j.t(this, ((n0c) D()).b(), new job(this, null, 1), 2));
            return;
        }
        if (j == R.id.oneme_notifications_settings_comments_button) {
            this.A.B(this, zv8VarArr[3], yab.h0(dq4Var, ((n0c) D()).b(), 2, new job(this, null, 0)));
            return;
        }
        if (j == R.id.oneme_notifications_settings_open_settings_button) {
            a8j.x(ic6Var, fob.b);
            return;
        }
        if (j == R.id.oneme_notifications_settings_how_not_to_miss_calls_button) {
            a8j.x(ic6Var, gob.b);
            return;
        }
        if (j != R.id.oneme_notifications_settings_background_wake_toggle) {
            if (j == R.id.oneme_notifications_settings_energy_saving_button) {
                if (F().b()) {
                    a8j.x(ic6Var, eob.b);
                    return;
                } else {
                    a8j.x(ic6Var, gob.b);
                    return;
                }
            }
            return;
        }
        ny8 ny8Var = this.l;
        boolean zE = ((in0) ny8Var.getValue()).e();
        ((in0) ny8Var.getValue()).j(!zE);
        mjg mjgVar = this.t;
        mjgVar.j(null, Integer.valueOf(((Number) mjgVar.getValue()).intValue() + 1));
        if (zE || F().b()) {
            I();
        } else {
            a8j.x(ic6Var, gob.b);
        }
    }

    public final void I() {
        if (((Boolean) ((e5d) this.h.getValue()).f().i()).booleanValue()) {
            sgg sggVarI0 = yab.i0(this.b, null, 0, new ur8(this, null, 14), 3);
            this.C.B(this, E[5], sggVarI0);
        }
    }
}
