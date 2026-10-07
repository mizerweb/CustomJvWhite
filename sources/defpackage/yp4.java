package defpackage;

import android.view.View;
import one.me.profileedit.screens.reactions.ProfileReactionsSettingsScreen;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yp4 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ yp4(View view, int i) {
        this.a = i;
        this.b = view;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        sbi sbiVar = sbi.a;
        View view = this.b;
        switch (i) {
            case 0:
                view.setVisibility(0);
                break;
            case 1:
                view.setVisibility(0);
                break;
            case 2:
                int i2 = ogd.q;
                okl.a(view);
                break;
            case 3:
                int i3 = ogd.q;
                okl.a(view);
                break;
            case 4:
                int i4 = ogd.q;
                okl.a(view);
                break;
            case 5:
                view.setVisibility(4);
                break;
            case 6:
                view.setVisibility(0);
                break;
            default:
                lvb.H(view, ProfileReactionsSettingsScreen.q, null);
                break;
        }
        return sbiVar;
    }
}
