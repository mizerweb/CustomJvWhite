package defpackage;

import android.content.Context;
import java.util.List;
import one.me.notifications.settings.NotificationsSettingsScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class iob extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ NotificationsSettingsScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iob(lq4 lq4Var, NotificationsSettingsScreen notificationsSettingsScreen, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = notificationsSettingsScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        NotificationsSettingsScreen notificationsSettingsScreen = this.g;
        switch (i) {
            case 0:
                iob iobVar = new iob(lq4Var, notificationsSettingsScreen, 0);
                iobVar.f = obj;
                return iobVar;
            case 1:
                iob iobVar2 = new iob(lq4Var, notificationsSettingsScreen, 1);
                iobVar2.f = obj;
                return iobVar2;
            case 2:
                iob iobVar3 = new iob(lq4Var, notificationsSettingsScreen, 2);
                iobVar3.f = obj;
                return iobVar3;
            case 3:
                iob iobVar4 = new iob(lq4Var, notificationsSettingsScreen, 3);
                iobVar4.f = obj;
                return iobVar4;
            default:
                iob iobVar5 = new iob(lq4Var, notificationsSettingsScreen, 4);
                iobVar5.f = obj;
                return iobVar5;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((iob) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((iob) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((iob) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 3:
                ((iob) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((iob) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object poeVar;
        int i = this.e;
        sbi sbiVar = sbi.a;
        NotificationsSettingsScreen notificationsSettingsScreen = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                if (((Boolean) obj2).booleanValue()) {
                    zv8[] zv8VarArr = NotificationsSettingsScreen.m;
                    wsc wscVarO1 = notificationsSettingsScreen.o1();
                    svj svjVar = new svj(notificationsSettingsScreen, 1);
                    String[] strArr = wsc.e;
                    wscVarO1.j(svjVar, false);
                }
                break;
            case 1:
                ch3.d0(obj);
                notificationsSettingsScreen.i.H((List) obj2);
                break;
            case 2:
                ch3.d0(obj);
                notificationsSettingsScreen.g.H((List) obj2);
                break;
            case 3:
                ch3.d0(obj);
                zv8[] zv8VarArr2 = NotificationsSettingsScreen.m;
                h8c h8cVar = new h8c(notificationsSettingsScreen);
                h8cVar.h(new w8c(R.drawable.icon_check_round_fill));
                h8cVar.m(new tnh(R.string.oneme_notifications_settings_energy_saving_disabled_snackbar));
                h8cVar.p();
                break;
            default:
                ch3.d0(obj);
                rbb rbbVar = (rbb) obj2;
                if (rbbVar instanceof i65) {
                    bnb.b.e((i65) rbbVar);
                } else if (rbbVar instanceof fob) {
                    String str = sj8.a;
                    Context context = notificationsSettingsScreen.getContext();
                    try {
                        context.startActivity(sj8.e(context));
                        poeVar = sbiVar;
                    } catch (Throwable th) {
                        poeVar = new poe(th);
                    }
                    Throwable thA = roe.a(poeVar);
                    if (thA != null) {
                        gm0.V(sj8.a, "openNotificationsSettings: failed", thA);
                    }
                } else if (rbbVar instanceof gob) {
                    zv8[] zv8VarArr3 = NotificationsSettingsScreen.m;
                    ae9 ae9Var = (ae9) ((p96) notificationsSettingsScreen.f.getValue()).a.getValue();
                    ul9 ul9Var = new ul9();
                    ul9Var.put("reason", "settings");
                    ae9.k(ae9Var, "POWER_SAVING", "show_shade", ul9Var.b(), 8);
                    notificationsSettingsScreen.o1().l(new svj(notificationsSettingsScreen, 1));
                } else if (rbbVar instanceof eob) {
                    String str2 = sj8.a;
                    sj8.g(notificationsSettingsScreen.getContext());
                }
                break;
        }
        return sbiVar;
    }
}
