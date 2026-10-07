package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Process;

/* JADX INFO: loaded from: classes2.dex */
public final class is9 {
    public final Context a;
    public final MediaBrowser b;
    public final Bundle c;
    public final gs9 d = new gs9(this);
    public final mw e = new mw(0);
    public ih f;
    public Messenger g;
    public u2a h;

    public is9(Context context, ComponentName componentName, kr6 kr6Var, Bundle bundle) {
        this.a = context;
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        this.c = bundle2;
        bundle2.putInt("extra_client_version", 1);
        bundle2.putInt("extra_calling_pid", Process.myPid());
        kr6Var.b = this;
        hs9 hs9Var = (hs9) kr6Var.a;
        hs9Var.getClass();
        this.b = new MediaBrowser(context, componentName, hs9Var, bundle2);
    }
}
