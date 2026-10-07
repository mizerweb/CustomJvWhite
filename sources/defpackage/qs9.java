package defpackage;

import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.os.ResultReceiver;

/* JADX INFO: loaded from: classes2.dex */
public final class qs9 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ss9 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ResultReceiver d;
    public final /* synthetic */ i1m e;

    public qs9(i1m i1mVar, ss9 ss9Var, String str, ResultReceiver resultReceiver) {
        this.e = i1mVar;
        this.b = ss9Var;
        this.c = str;
        this.d = resultReceiver;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ResultReceiver resultReceiver = this.d;
        i1m i1mVar = this.e;
        ss9 ss9Var = this.b;
        String str = this.c;
        switch (i) {
            case 0:
                ms9 ms9Var = (ms9) ((y3a) i1mVar.a).e.get(ss9Var.a.getBinder());
                if (ms9Var != null) {
                    y3a y3aVar = (y3a) i1mVar.a;
                    y3aVar.f = ms9Var;
                    if ((2 & 2) != 0) {
                        resultReceiver.send(-1, null);
                    } else {
                        Bundle bundle = new Bundle();
                        int i2 = MediaBrowserCompat.MediaItem.FLAG_BROWSABLE;
                        bundle.putParcelable("media_item", null);
                        resultReceiver.send(0, bundle);
                    }
                    y3aVar.f = null;
                } else {
                    tt2.f("getMediaItem for callback that isn't registered id=", str, "MBServiceCompat");
                }
                break;
            default:
                ms9 ms9Var2 = (ms9) ((y3a) i1mVar.a).e.get(ss9Var.a.getBinder());
                if (ms9Var2 != null) {
                    y3a y3aVar2 = (y3a) i1mVar.a;
                    y3aVar2.f = ms9Var2;
                    resultReceiver.send(-1, null);
                    y3aVar2.f = null;
                } else {
                    tt2.f("search for callback that isn't registered query=", str, "MBServiceCompat");
                }
                break;
        }
    }

    public qs9(i1m i1mVar, ss9 ss9Var, String str, Bundle bundle, ResultReceiver resultReceiver) {
        this.e = i1mVar;
        this.b = ss9Var;
        this.c = str;
        this.d = resultReceiver;
    }
}
