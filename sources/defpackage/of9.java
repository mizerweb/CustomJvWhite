package defpackage;

import android.os.Bundle;
import one.me.contactlist.ContactListWidget;
import one.me.login.LoginScreen;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class of9 implements t65 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Bundle b;

    public /* synthetic */ of9(int i, Bundle bundle) {
        this.a = i;
        this.b = bundle;
    }

    @Override // defpackage.t65
    public final Object t() {
        int i = this.a;
        Bundle bundle = this.b;
        switch (i) {
            case 0:
                return new LoginScreen(bundle);
            default:
                return new ContactListWidget(cl4.b, new ha9(bundle.getInt(Widget.ARG_ACCOUNT_ID_OVERRIDE)));
        }
    }
}
