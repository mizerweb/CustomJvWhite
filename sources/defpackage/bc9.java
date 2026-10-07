package defpackage;

import android.content.ContentResolver;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: loaded from: classes2.dex */
public final class bc9 implements mjd {
    public final /* synthetic */ int a;
    public final Executor b;
    public final ContentResolver c;

    public /* synthetic */ bc9(Executor executor, ContentResolver contentResolver, int i) {
        this.a = i;
        this.b = executor;
        this.c = contentResolver;
    }

    @Override // defpackage.mjd
    public final void b(lq0 lq0Var, es0 es0Var) {
        int i = this.a;
        Executor executor = this.b;
        switch (i) {
            case 0:
                pjd pjdVar = es0Var.c;
                v78 v78Var = es0Var.a;
                es0Var.h("local", "thumbnail_bitmap");
                zb9 zb9Var = new zb9(this, lq0Var, pjdVar, es0Var, pjdVar, es0Var, v78Var, new CancellationSignal());
                es0Var.a(new ac9(zb9Var, 0));
                executor.execute(zb9Var);
                break;
            default:
                pjd pjdVar2 = es0Var.c;
                v78 v78Var2 = es0Var.a;
                es0Var.h("local", MediaStreamTrack.VIDEO_TRACK_KIND);
                cc9 cc9Var = new cc9(this, lq0Var, pjdVar2, es0Var, pjdVar2, es0Var, v78Var2);
                es0Var.a(new ac9(cc9Var, 1));
                executor.execute(cc9Var);
                break;
        }
    }
}
