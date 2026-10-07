package defpackage;

import android.os.SystemClock;
import androidx.media3.common.util.StuckPlayerException;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class o6h {
    public final int a;
    public Object b;
    public int c;
    public int d;
    public long e;
    public long f;
    public boolean g;
    public long h;
    public final /* synthetic */ gbc i;

    public o6h(gbc gbcVar, int i) {
        this.i = gbcVar;
        this.a = i;
    }

    public final void a() {
        Object obj;
        gbc gbcVar = this.i;
        sfh sfhVar = (sfh) gbcVar.f;
        bg6 bg6Var = (bg6) gbcVar.a;
        if (bg6Var.getPlaybackState() != 2 || !bg6Var.z() || bg6Var.u() != 0) {
            if (this.g) {
                sfhVar.h(1);
            }
            this.g = false;
            return;
        }
        ush ushVarV = bg6Var.v();
        Object objL = ushVarV.p() ? null : ushVarV.l(bg6Var.B());
        int iS = bg6Var.s();
        int iC = bg6Var.C();
        long jR = bg6Var.R();
        long jMax = Math.max(0L, bg6Var.g() - Math.max(0L, jR - bg6Var.e()));
        if (objL != null && iS == -1) {
            jR -= vqi.p0(ushVarV.g(objL, (rsh) gbcVar.e).e);
        }
        ((nfh) ((qt3) gbcVar.d)).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.g;
        int i = this.a;
        if (z && Objects.equals(objL, this.b) && iS == this.c && iC == this.d) {
            obj = objL;
            if (jR == this.e && jMax == this.f) {
                if (jElapsedRealtime - this.h >= i) {
                    ((xf6) gbcVar.c).a.D0(new ExoPlaybackException(2, new StuckPlayerException(1, i), 1003));
                    return;
                }
                return;
            }
        } else {
            obj = objL;
        }
        this.g = true;
        this.h = jElapsedRealtime;
        this.b = obj;
        this.c = iS;
        this.d = iC;
        this.e = jR;
        this.f = jMax;
        sfhVar.h(1);
        sfhVar.j(1, i);
    }
}
