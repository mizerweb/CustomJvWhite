package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import one.me.notifications.settings.screens.dialog.DialogNotificationsSettingsScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class el5 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ DialogNotificationsSettingsScreen b;

    public /* synthetic */ el5(DialogNotificationsSettingsScreen dialogNotificationsSettingsScreen, int i) {
        this.a = i;
        this.b = dialogNotificationsSettingsScreen;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        DialogNotificationsSettingsScreen dialogNotificationsSettingsScreen = this.b;
        switch (i) {
            case 0:
                gl5 gl5Var = (gl5) dialogNotificationsSettingsScreen.b.getAccessor().c(940);
                gl5Var.getClass();
                return new fl5(gl5Var.a, gl5Var.b, gl5Var.c);
            case 1:
                zv8[] zv8VarArr = DialogNotificationsSettingsScreen.g;
                rcc rccVar = new rcc(dialogNotificationsSettingsScreen.getContext());
                rccVar.setId(R.id.oneme_notifications_settings_dialog_toolbar);
                rccVar.setForm(gcc.Compact);
                rccVar.setTitle(R.string.oneme_notifications_settings_dialog_toolbar_title);
                rccVar.setLeftActions(new wbc(new w83(26)));
                return rccVar;
            default:
                zv8[] zv8VarArr2 = DialogNotificationsSettingsScreen.g;
                k96 k96Var = new k96(dialogNotificationsSettingsScreen.getContext());
                k96Var.setId(R.id.oneme_notifications_settings_dialog_recycler_view);
                k96Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                k96Var.getContext();
                k96Var.setLayoutManager(new LinearLayoutManager());
                k96Var.setOverScrollMode(2);
                k96Var.setAdapter(dialogNotificationsSettingsScreen.d);
                k96Var.h(new sbf(pq3.j.h(k96Var), new o75(11), null, null, null, 60), -1);
                k96Var.h(new q91(3), -1);
                return k96Var;
        }
    }
}
