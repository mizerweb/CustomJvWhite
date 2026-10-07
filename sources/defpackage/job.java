package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class job extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public final /* synthetic */ kob f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ job(kob kobVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.f = kobVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        kob kobVar = this.f;
        switch (i) {
            case 0:
                return new job(kobVar, lq4Var, 0);
            case 1:
                return new job(kobVar, lq4Var, 1);
            case 2:
                return new job(kobVar, lq4Var, 2);
            case 3:
                return new job(kobVar, lq4Var, 3);
            default:
                return new job(kobVar, lq4Var, 4);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        gu4 gu4Var = (gu4) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((job) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((job) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((job) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 3:
                ((job) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((job) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        kob kobVar = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                zv8[] zv8VarArr = kob.E;
                int i2 = kobVar.G() ? 2 : 1;
                nni nniVarB = kobVar.B();
                nniVarB.getClass();
                nniVarB.e("app.comments.push.notification.status", nbh.i(i2));
                pvb pvbVar = (pvb) kobVar.e.getValue();
                ini iniVar = new ini();
                iniVar.t = i2;
                pvbVar.q(new lni(iniVar));
                mjg mjgVar = kobVar.t;
                mjgVar.j(null, new Integer(((Number) mjgVar.getValue()).intValue() + 1));
                break;
            case 1:
                ch3.d0(obj);
                zv8[] zv8VarArr2 = kob.E;
                kobVar.B().c("app.notification.show.text", !kobVar.B().d.getBoolean("app.notification.show.text", true));
                ((h5c) kobVar.g.getValue()).e();
                mjg mjgVar2 = kobVar.t;
                mjgVar2.j(null, new Integer(((Number) mjgVar2.getValue()).intValue() + 1));
                break;
            case 2:
                ch3.d0(obj);
                zv8[] zv8VarArr3 = kob.E;
                long j = kobVar.B().d.getLong("app.notification.dontDisturbUntil", 0L) == 0 ? -1L : 0L;
                zr6 zr6Var = (zr6) kobVar.B().d.edit();
                zr6Var.putLong("app.notification.dontDisturbUntil", j);
                zr6Var.apply();
                pvb pvbVar2 = (pvb) kobVar.e.getValue();
                ini iniVar2 = new ini();
                iniVar2.b = new Long(j);
                pvbVar2.q(new lni(iniVar2));
                mjg mjgVar3 = kobVar.t;
                mjgVar3.j(null, new Integer(((Number) mjgVar3.getValue()).intValue() + 1));
                break;
            case 3:
                ch3.d0(obj);
                zv8[] zv8VarArr4 = kob.E;
                nni nniVarB2 = kobVar.B();
                zr6 zr6Var2 = (zr6) nniVarB2.d.edit();
                zr6Var2.putLong("app.notification.dontDisturbUntil", 0L);
                zr6Var2.apply();
                nniVarB2.c("app.notification.show.text", true);
                nniVarB2.e("app.notification.ringtone", null);
                nniVarB2.c("app.notification.vibrate", true);
                nniVarB2.d(nniVarB2.f(), "app.notification.led.color");
                nniVarB2.p(0);
                nniVarB2.e("app.notification.dialogs.ringtone", null);
                nniVarB2.c("app.notification.dialogs.vibrate", true);
                nniVarB2.d(nniVarB2.f(), "app.notification.dialogs.led.color");
                nniVarB2.o(0);
                nniVarB2.e("app.notification.chats.ringtone", null);
                nniVarB2.c("app.notification.chats.vibrate", true);
                nniVarB2.d(nniVarB2.f(), "app.notification.chats.led.color");
                nniVarB2.e("app.group.chat.call.notification.status", "ON");
                nniVarB2.e("app.comments.push.notification.status", "ON");
                nniVarB2.c("app.notification.in.app.sound", true);
                nniVarB2.c("app.notification.in.app.vibrate", true);
                nniVarB2.c("app.notification.show.new.users", true);
                nniVarB2.c("app.calls.incoming.vibration", true);
                nniVarB2.e("app.calls.incoming.ringtone", "default_");
                pvb pvbVar3 = (pvb) kobVar.e.getValue();
                pvbVar3.getClass();
                pvb.t(pvbVar3, new v94(pvbVar3.u().a.g(), 0L, false, null, true, pvb.f));
                mjg mjgVar4 = kobVar.s;
                dqe dqeVarC = kobVar.C();
                mjgVar4.getClass();
                mjgVar4.j(null, dqeVarC);
                mjg mjgVar5 = kobVar.t;
                mjgVar5.j(null, new Integer(((Number) mjgVar5.getValue()).intValue() + 1));
                break;
            default:
                ch3.d0(obj);
                zv8[] zv8VarArr5 = kob.E;
                kobVar.B().c("app.calls.incoming.vibration", !kobVar.B().d.getBoolean("app.calls.incoming.vibration", true));
                mjg mjgVar6 = kobVar.t;
                mjgVar6.j(null, new Integer(((Number) mjgVar6.getValue()).intValue() + 1));
                break;
        }
        return sbiVar;
    }
}
