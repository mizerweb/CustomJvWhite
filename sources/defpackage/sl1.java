package defpackage;

import android.app.Activity;
import android.view.View;
import one.me.android.root.RootController;
import one.me.calllist.ui.CallHistoryScreen;
import one.me.keyboardmedia.MediaKeyboardWidget;
import one.me.profile.screens.avatars.ProfileAvatarsScreen;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class sl1 implements View.OnClickListener {
    public final /* synthetic */ int a;

    public /* synthetic */ sl1(va3 va3Var) {
        this.a = 3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                zv8[] zv8VarArr = CallHistoryScreen.D;
                o65.c(pk1.b.b(), ":call-contact", null, null, 6);
                break;
            case 1:
                zv8[] zv8VarArr2 = CallHistoryScreen.D;
                o65.c(pk1.b.b(), ":call-contact", null, null, 6);
                break;
            case 2:
                zv8[] zv8VarArr3 = MediaKeyboardWidget.u;
                o65.c(rw8.b.b(), ":stickers/settings", null, null, 6);
                break;
            case 3:
                int i = ogd.q;
                tb3 tb3Var = tb3.b;
                if (!tb3Var.b().f()) {
                    RootController rootController = tb3Var.b().a().e;
                    Activity activityD = rootController != null ? rootController.w1().d() : null;
                    if (activityD != null) {
                        activityD.finish();
                    }
                }
                break;
            default:
                zv8[] zv8VarArr4 = ProfileAvatarsScreen.r;
                break;
        }
    }

    public /* synthetic */ sl1(int i) {
        this.a = i;
    }
}
