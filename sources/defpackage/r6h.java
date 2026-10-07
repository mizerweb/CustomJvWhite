package defpackage;

import android.os.SystemClock;
import androidx.media3.common.util.StuckPlayerException;
import androidx.media3.exoplayer.ExoPlaybackException;

/* JADX INFO: loaded from: classes.dex */
public final class r6h {
    public final int a;
    public int b;
    public boolean c;
    public long d;
    public final /* synthetic */ gbc e;

    public r6h(gbc gbcVar, int i) {
        this.e = gbcVar;
        this.a = i;
    }

    public final void a() {
        gbc gbcVar = this.e;
        sfh sfhVar = (sfh) gbcVar.f;
        bg6 bg6Var = (bg6) gbcVar.a;
        int iU = bg6Var.u();
        if (!bg6Var.z() || bg6Var.getPlaybackState() == 1 || bg6Var.getPlaybackState() == 4 || iU == 0 || iU == 1) {
            if (this.c) {
                sfhVar.h(4);
            }
            this.c = false;
            return;
        }
        ((nfh) ((qt3) gbcVar.d)).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.c;
        int i = this.a;
        if (z && this.b == iU) {
            if (jElapsedRealtime - this.d >= i) {
                ((xf6) gbcVar.c).a.D0(new ExoPlaybackException(2, new StuckPlayerException(4, i), 1003));
                return;
            }
            return;
        }
        this.c = true;
        this.d = jElapsedRealtime;
        this.b = iU;
        sfhVar.h(4);
        sfhVar.j(4, i);
    }
}
