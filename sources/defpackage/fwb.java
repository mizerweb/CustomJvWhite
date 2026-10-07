package defpackage;

import android.graphics.drawable.Animatable;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class fwb extends oq0 {
    public final /* synthetic */ kwb b;

    public fwb(kwb kwbVar) {
        this.b = kwbVar;
    }

    @Override // defpackage.oq0, defpackage.mr4
    public final void b(String str, Throwable th) {
        kwb kwbVar = this.b;
        gm0.V(kwbVar.a, "Failed to load image. ID: " + str, th);
        kwbVar.postInvalidate();
    }

    @Override // defpackage.oq0, defpackage.mr4
    public final void e(String str, Object obj, Animatable animatable) {
        boolean zIsCurrentThread = Looper.getMainLooper().isCurrentThread();
        kwb kwbVar = this.b;
        if (zIsCurrentThread) {
            af7 af7Var = kwbVar.B;
            if (af7Var != null) {
                af7Var.invoke();
            }
            kwbVar.invalidate();
            return;
        }
        Handler handler = kwbVar.getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new ewb(kwbVar, 0));
        } else {
            kwbVar.post(new ewb(kwbVar, 1));
        }
    }

    @Override // defpackage.oq0, defpackage.mr4
    public final void onIntermediateImageSet(String str, Object obj) {
        this.b.postInvalidate();
    }
}
