package defpackage;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wf6 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ wf6(as6 as6Var, Set set, boolean z, u8b u8bVar) {
        this.c = as6Var;
        this.d = set;
        this.b = z;
        this.e = u8bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Context context = (Context) this.c;
                boolean z = this.b;
                bg6 bg6Var = (bg6) this.d;
                z3d z3dVar = (z3d) this.e;
                MediaMetricsManager mediaMetricsManagerD = oi2.d(context.getSystemService("media_metrics"));
                g0a g0aVar = mediaMetricsManagerD == null ? null : new g0a(context, mediaMetricsManagerD.createPlaybackSession());
                if (g0aVar == null) {
                    lvb.G0("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (z) {
                    bg6Var.d(g0aVar);
                }
                LogSessionId sessionId = g0aVar.d.getSessionId();
                synchronized (z3dVar) {
                    pgg pggVar = z3dVar.b;
                    pggVar.getClass();
                    LogSessionId logSessionId = (LogSessionId) pggVar.a;
                    LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
                    lvb.b0(logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE));
                    pggVar.a = sessionId;
                }
                return;
            default:
                ((as6) this.c).b((Set) this.d, this.b, (u8b) this.e);
                return;
        }
    }

    public /* synthetic */ wf6(Context context, boolean z, bg6 bg6Var, z3d z3dVar) {
        this.c = context;
        this.b = z;
        this.d = bg6Var;
        this.e = z3dVar;
    }
}
