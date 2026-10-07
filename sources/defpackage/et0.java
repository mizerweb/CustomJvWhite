package defpackage;

import android.os.SystemClock;
import one.video.player.BaseVideoPlayer;

/* JADX INFO: loaded from: classes.dex */
public final class et0 implements u66 {
    public final /* synthetic */ ldc a;

    public et0(ldc ldcVar) {
        this.a = ldcVar;
    }

    @Override // defpackage.u66, defpackage.xdc
    public final void f(ldc ldcVar, t4j t4jVar) {
        kwi kwiVarB;
        ldc ldcVar2 = this.a;
        wje wjeVar = ldcVar2.d;
        if (wjeVar != null) {
            wjeVar.h(ldcVar2, (t4jVar == null || (kwiVarB = t4jVar.b()) == null) ? null : kwiVarB.d());
        }
    }

    @Override // defpackage.u66, defpackage.xdc
    public final void s(BaseVideoPlayer baseVideoPlayer, int i, int i2) {
        ldc ldcVar = this.a;
        fbc fbcVar = ldcVar.e;
        if (i2 != 3) {
            if (fbcVar != null) {
                ((hsh) fbcVar.c).b();
                ldcVar.o(((hsh) fbcVar.c).a());
                return;
            }
            return;
        }
        if (fbcVar != null) {
            hsh hshVar = (hsh) fbcVar.c;
            synchronized (hshVar) {
                if (hshVar.d != -1) {
                    return;
                }
                hshVar.d = SystemClock.elapsedRealtime();
                hshVar.sendMessage(hshVar.obtainMessage(1, hshVar));
            }
        }
    }
}
