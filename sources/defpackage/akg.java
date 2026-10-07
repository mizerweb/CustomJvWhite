package defpackage;

import android.os.SystemClock;
import one.video.player.BaseVideoPlayer;

/* JADX INFO: loaded from: classes.dex */
public final class akg implements zdc {
    public final /* synthetic */ ivb a;

    public akg(ivb ivbVar) {
        this.a = ivbVar;
    }

    @Override // defpackage.zdc
    public final void a(BaseVideoPlayer baseVideoPlayer, long j) {
        ivb ivbVar = this.a;
        if (ivbVar.c != null) {
            p35 p35Var = ivbVar.h;
            h4d h4dVar = ((ivb) p35Var.c).c;
            if (h4dVar != null ? h4dVar.c() : false) {
                j = SystemClock.elapsedRealtime();
            }
            ivb ivbVar2 = (ivb) p35Var.c;
            if (ivbVar2.b != null) {
                boolean z = nec.a;
            }
            qvi qviVar = (qvi) p35Var.b;
            long j2 = qviVar.a;
            if (j2 >= 0 && j > qviVar.b) {
                qviVar.b = j;
            }
            if (!ivbVar2.j || j - j2 <= p35Var.a) {
                return;
            }
            p35Var.b();
            p35Var.a(j);
        }
    }
}
