package defpackage;

import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.a;
import one.video.player.error.OneVideoPlaybackException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class cec {
    public static final Set a = a.p1(new qdc[]{qdc.u, qdc.v});

    public static final long a(ldc ldcVar, rui ruiVar) {
        ldcVar.verifyThread("one.video.exo.OneVideoExoPlayer.getBufferedPosition");
        return c(ldcVar, ruiVar) + ldcVar.V.R();
    }

    public static final long b(ldc ldcVar, rui ruiVar) {
        return c(ldcVar, ruiVar) + ldcVar.y();
    }

    public static final long c(aec aecVar, rui ruiVar) {
        long j = 0;
        if (ruiVar instanceof v84) {
            Integer numValueOf = Integer.valueOf(((ldc) aecVar).x());
            if (numValueOf.intValue() <= 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                List list = ((v84) ruiVar).a;
                int iMin = Math.min(iIntValue, list.size());
                for (int i = 0; i < iMin; i++) {
                    j += ((u84) list.get(i)).d;
                }
            }
        }
        return j;
    }

    public static final boolean d(OneVideoPlaybackException oneVideoPlaybackException) {
        Throwable cause = oneVideoPlaybackException.getCause();
        while (cause != null) {
            if (cause instanceof UnknownHostException) {
                return true;
            }
            Throwable cause2 = cause.getCause();
            cause = (cause2 == null || cause2 == cause) ? null : cause2;
        }
        return false;
    }

    public static final boolean e(OneVideoPlaybackException oneVideoPlaybackException) {
        if (oneVideoPlaybackException == null) {
            return false;
        }
        return a.contains(oneVideoPlaybackException.a);
    }

    public static final void f(ldc ldcVar, rui ruiVar, long j) {
        p4d p4dVar;
        m4j m4jVarB;
        if (ruiVar instanceof v84) {
            Iterator it = ((v84) ruiVar).a.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    p4dVar = new p4d(0, 0L, null);
                    break;
                }
                Object next = it.next();
                int i2 = i + 1;
                if (i < 0) {
                    xw3.V0();
                    throw null;
                }
                long j2 = ((u84) next).d;
                j -= j2;
                if (j <= 0) {
                    p4dVar = new p4d(i, j + j2, null);
                    break;
                }
                i = i2;
            }
        } else {
            p4dVar = new p4d(0, j, null);
        }
        bg6 bg6Var = ldcVar.V;
        ldcVar.verifyThread("one.video.exo.OneVideoExoPlayer.seekTo");
        yxb yxbVar = ldcVar.G;
        boolean z = nec.a;
        p4dVar.toString();
        if (yxbVar != null) {
            yxbVar.invoke();
        }
        ldcVar.verifyThread("one.video.exo.OneVideoExoPlayer.editPlaylist");
        ldc.w(yxbVar);
        ldcVar.verifyThread("one.video.player.BaseVideoPlayer.getCurrentPlaylist");
        mg6 mg6Var = (mg6) ldcVar.u;
        if (mg6Var == null || (m4jVarB = mg6Var.b(p4dVar.a())) == null) {
            return;
        }
        mg6Var.b(bg6Var.F());
        ldcVar.B();
        if (!(m4jVarB instanceof q99)) {
            bg6Var.u0(p4dVar.a(), p4dVar.b(), false);
            return;
        }
        p4d p4dVar2 = new p4d(ldcVar.x(), ldcVar.y());
        if (p4dVar != p4dVar2) {
            ldcVar.D(p4dVar, true);
            ldcVar.k.i(wdc.b, ldcVar, p4dVar2, p4dVar);
        }
    }
}
