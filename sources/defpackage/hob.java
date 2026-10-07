package defpackage;

import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import one.me.notifications.settings.NotificationsSettingsScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hob implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationsSettingsScreen b;

    public /* synthetic */ hob(NotificationsSettingsScreen notificationsSettingsScreen, int i) {
        this.a = i;
        this.b = notificationsSettingsScreen;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        NotificationsSettingsScreen notificationsSettingsScreen = this.b;
        switch (i) {
            case 0:
                lob lobVar = (lob) notificationsSettingsScreen.c.getAccessor().c(938);
                lobVar.getClass();
                return new kob(lobVar.a, lobVar.b, lobVar.c, lobVar.d, lobVar.e, lobVar.f, lobVar.g, lobVar.h, lobVar.i, lobVar.j);
            case 1:
                v0k v0kVar = notificationsSettingsScreen.c;
                return ((ap0) v0kVar.getAccessor().c(936)).a(v0kVar.getAccessor().d(934), true, new cka(10));
            case 2:
                zv8[] zv8VarArr = NotificationsSettingsScreen.m;
                rcc rccVar = new rcc(notificationsSettingsScreen.getContext());
                rccVar.setId(R.id.oneme_notifications_settings_toolbar);
                rccVar.setForm(gcc.Compact);
                rccVar.setTitle(R.string.oneme_notifications_and_sounds_settings_toolbar_title);
                rccVar.setLeftActions(new wbc(new s9a(23)));
                return rccVar;
            case 3:
                zv8[] zv8VarArr2 = NotificationsSettingsScreen.m;
                k96 k96Var = new k96(notificationsSettingsScreen.getContext());
                k96Var.setId(R.id.oneme_notifications_settings_recycler_view);
                k96Var.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                k96Var.getContext();
                k96Var.setLayoutManager(new LinearLayoutManager());
                k96Var.setAdapter(new r84(notificationsSettingsScreen.i, notificationsSettingsScreen.g));
                k96Var.setOverScrollMode(2);
                k96Var.h(new sbf(pq3.j.h(k96Var), new fv9(k96Var, 19, notificationsSettingsScreen), null, null, null, 60), -1);
                k96Var.h(new anb(), -1);
                return k96Var;
            default:
                zv8[] zv8VarArr3 = NotificationsSettingsScreen.m;
                cyb cybVar = new cyb(notificationsSettingsScreen.getContext());
                cybVar.setId(R.id.oneme_notifications_settings_reset_default_button);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.setMarginStart(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
                layoutParams.setMarginEnd(gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
                cybVar.setLayoutParams(layoutParams);
                cybVar.setSize(ayb.h);
                cybVar.setAppearance(zxb.GHOST);
                cybVar.setTextColor(Integer.valueOf(R.attr.text_negative));
                cybVar.setText(np4.q(cybVar.getContext(), R.string.oneme_notifications_settings_reset_settings_button));
                qe7.H(cybVar, 300L, new o37(24, notificationsSettingsScreen));
                return cybVar;
        }
    }
}
