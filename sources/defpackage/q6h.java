package defpackage;

import android.os.SystemClock;
import androidx.media3.common.util.StuckPlayerException;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class q6h {
    public final int a;
    public Object b;
    public int c;
    public int d;
    public boolean e;
    public long f;
    public final /* synthetic */ gbc g;

    public q6h(gbc gbcVar, int i) {
        this.g = gbcVar;
        this.a = i;
    }

    public final void a() {
        long duration;
        gbc gbcVar = this.g;
        rsh rshVar = (rsh) gbcVar.e;
        sfh sfhVar = (sfh) gbcVar.f;
        bg6 bg6Var = (bg6) gbcVar.a;
        ush ushVarV = bg6Var.v();
        Object objL = ushVarV.p() ? null : ushVarV.l(bg6Var.B());
        int iS = bg6Var.s();
        int iC = bg6Var.C();
        long jE = bg6Var.e();
        if (objL == null || iS != -1) {
            duration = iS != -1 ? bg6Var.getDuration() : -9223372036854775807L;
        } else {
            ushVarV.g(objL, rshVar);
            jE -= vqi.p0(rshVar.e);
            duration = vqi.p0(rshVar.d);
        }
        boolean zI0 = bg6Var.i0();
        if (!zI0 || duration == -9223372036854775807L || jE < duration) {
            sfhVar.h(3);
            if (zI0 && duration != -9223372036854775807L) {
                sfhVar.j(3, (int) Math.ceil((duration - jE) / bg6Var.Z().a));
            }
            this.e = false;
            return;
        }
        ((nfh) ((qt3) gbcVar.d)).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.e;
        int i = this.a;
        if (z && Objects.equals(objL, this.b) && iS == this.c && iC == this.d) {
            if (jElapsedRealtime - this.f >= i) {
                ((xf6) gbcVar.c).a.D0(new ExoPlaybackException(2, new StuckPlayerException(3, i), 1003));
                return;
            }
            return;
        }
        this.e = true;
        this.f = jElapsedRealtime;
        this.b = objL;
        this.c = iS;
        this.d = iC;
        sfhVar.h(3);
        sfhVar.j(3, i);
    }
}
