package defpackage;

import android.view.View;
import java.util.WeakHashMap;
import one.me.keyboardmedia.MediaKeyboardWidget;
import one.me.profileedit.screens.reactions.ProfileReactionsSettingsScreen;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ci5 implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ci5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ol0) obj).invoke(Boolean.valueOf(z));
                break;
            default:
                ProfileReactionsSettingsScreen profileReactionsSettingsScreen = (ProfileReactionsSettingsScreen) obj;
                j8e j8eVar = profileReactionsSettingsScreen.i;
                zv8[] zv8VarArr = ProfileReactionsSettingsScreen.p;
                View view2 = profileReactionsSettingsScreen.getView();
                if (view2 != null && z && !profileReactionsSettingsScreen.isBeingDestroyed()) {
                    zv8[] zv8VarArr2 = ProfileReactionsSettingsScreen.p;
                    if (!((hve) j8eVar.m(profileReactionsSettingsScreen, zv8VarArr2[1])).o()) {
                        hve hveVar = (hve) j8eVar.m(profileReactionsSettingsScreen, zv8VarArr2[1]);
                        t3f t3fVar = profileReactionsSettingsScreen.b;
                        long j = profileReactionsSettingsScreen.getArgs().getLong("id");
                        Object value = profileReactionsSettingsScreen.p1().o.a.getValue();
                        la3 la3Var = value instanceof la3 ? (la3) value : null;
                        hveVar.T(oc9.e(new MediaKeyboardWidget(t3fVar, j, true, true, la3Var != null ? la3Var.c : null, true), null, null));
                    }
                    WeakHashMap weakHashMap = i7j.a;
                    y6j.l(view2, null);
                    ((tp2) profileReactionsSettingsScreen.h.m(profileReactionsSettingsScreen, zv8VarArr2[0])).setElevation(16.0f);
                    kz9 kz9Var = profileReactionsSettingsScreen.j;
                    if (kz9Var != null) {
                        kz9Var.l();
                    }
                    profileReactionsSettingsScreen.r1(true);
                    ((cyb) profileReactionsSettingsScreen.n.m(profileReactionsSettingsScreen, zv8VarArr2[5])).setVisibility(8);
                }
                break;
        }
    }
}
