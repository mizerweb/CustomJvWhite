package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import one.me.notifications.settings.screens.other.OtherNotificationsSettingsScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vic implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ OtherNotificationsSettingsScreen b;

    public /* synthetic */ vic(OtherNotificationsSettingsScreen otherNotificationsSettingsScreen, int i) {
        this.a = i;
        this.b = otherNotificationsSettingsScreen;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        OtherNotificationsSettingsScreen otherNotificationsSettingsScreen = this.b;
        switch (i) {
            case 0:
                xic xicVar = (xic) otherNotificationsSettingsScreen.b.getAccessor().c(941);
                xicVar.getClass();
                return new wic(xicVar.a, xicVar.b, xicVar.c);
            case 1:
                zv8[] zv8VarArr = OtherNotificationsSettingsScreen.g;
                rcc rccVar = new rcc(otherNotificationsSettingsScreen.getContext());
                rccVar.setId(R.id.oneme_notifications_settings_other_toolbar);
                rccVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                rccVar.setForm(gcc.Compact);
                rccVar.setTitle(R.string.oneme_notifications_settings_other_toolbar_title);
                rccVar.setLeftActions(new wbc(new pyb(10)));
                return rccVar;
            default:
                zv8[] zv8VarArr2 = OtherNotificationsSettingsScreen.g;
                k96 k96Var = new k96(otherNotificationsSettingsScreen.getContext());
                k96Var.setId(R.id.oneme_notifications_settings_other_recycler_view);
                k96Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                k96Var.getContext();
                k96Var.setLayoutManager(new LinearLayoutManager());
                k96Var.setOverScrollMode(2);
                k96Var.setAdapter(otherNotificationsSettingsScreen.d);
                k96Var.h(new sbf(pq3.j.h(k96Var), new ahc(1), null, null, null, 60), -1);
                k96Var.h(new q91(3), -1);
                return k96Var;
        }
    }
}
