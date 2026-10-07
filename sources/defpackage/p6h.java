package defpackage;

import android.os.SystemClock;
import androidx.media3.common.util.StuckPlayerException;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class p6h {
    public final int a;
    public Object b;
    public int c;
    public int d;
    public long e;
    public boolean f;
    public long g;
    public final /* synthetic */ gbc h;

    public p6h(gbc gbcVar, int i) {
        this.h = gbcVar;
        this.a = i;
    }

    public final void a() {
        gbc gbcVar = this.h;
        sfh sfhVar = (sfh) gbcVar.f;
        bg6 bg6Var = (bg6) gbcVar.a;
        if (!bg6Var.i0()) {
            if (this.f) {
                sfhVar.h(2);
            }
            this.f = false;
            return;
        }
        ush ushVarV = bg6Var.v();
        Object objL = ushVarV.p() ? null : ushVarV.l(bg6Var.B());
        int iS = bg6Var.s();
        int iC = bg6Var.C();
        long jE = bg6Var.e();
        if (objL != null && iS == -1) {
            jE -= vqi.p0(ushVarV.g(objL, (rsh) gbcVar.e).e);
        }
        ((nfh) ((qt3) gbcVar.d)).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.f;
        int i = this.a;
        if (z && Objects.equals(objL, this.b) && iS == this.c && iC == this.d && jE == this.e) {
            if (jElapsedRealtime - this.g >= i) {
                ((xf6) gbcVar.c).a.D0(new ExoPlaybackException(2, new StuckPlayerException(2, i), 1003));
                return;
            }
            return;
        }
        this.f = true;
        this.g = jElapsedRealtime;
        this.b = objL;
        this.c = iS;
        this.d = iC;
        this.e = jE;
        sfhVar.h(2);
        sfhVar.j(2, i);
    }
}
