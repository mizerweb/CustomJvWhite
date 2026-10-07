package defpackage;

import android.net.Uri;
import android.os.Bundle;
import one.me.android.deeplink.LinkInterceptorWidget;
import one.me.android.externalcallback.ExternalCallbackWidget;
import one.me.folders.edit.FolderEditScreen;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vi6 implements t65 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Bundle b;
    public final /* synthetic */ ha9 c;

    public /* synthetic */ vi6(Bundle bundle, ha9 ha9Var, int i) {
        this.a = i;
        this.b = bundle;
        this.c = ha9Var;
    }

    @Override // defpackage.t65
    public final Object t() {
        int i = this.a;
        ha9 ha9Var = this.c;
        Bundle bundle = this.b;
        switch (i) {
            case 0:
                return new ExternalCallbackWidget(sb8.j0(bundle, "params"), ha9Var);
            case 1:
                return new FolderEditScreen(sb8.j0(bundle, "id"), ha9Var);
            default:
                return new LinkInterceptorWidget((Uri) bundle.getParcelable("link"), ha9Var, (l49) bundle.getParcelable("link:result"));
        }
    }
}
