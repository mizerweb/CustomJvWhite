package defpackage;

import android.app.Notification;
import android.content.Intent;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.session.MediaSessionService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class m0a implements Handler.Callback {
    public final MediaSessionService a;
    public final qf4 b;
    public final umb c;
    public final Handler d;
    public final cc5 e;
    public final Intent f;
    public final HashMap g;
    public final ec5 h;
    public int i;
    public ex8 j;
    public boolean k;
    public boolean l;
    public boolean m;
    public final long n;
    public final int o;

    public m0a(MediaSessionService mediaSessionService, ec5 ec5Var, qf4 qf4Var) {
        this.a = mediaSessionService;
        this.h = ec5Var;
        this.b = qf4Var;
        this.c = new umb(mediaSessionService);
        Looper mainLooper = Looper.getMainLooper();
        String str = vqi.a;
        this.d = new Handler(mainLooper, this);
        this.e = new cc5(2, this);
        this.f = new Intent(mediaSessionService, mediaSessionService.getClass());
        this.g = new HashMap();
        this.k = false;
        this.m = true;
        this.n = 600000L;
        this.o = 3;
    }

    public final void a() {
        this.m = false;
        Handler handler = this.d;
        if (handler.hasMessages(1)) {
            handler.removeMessages(1);
            MediaSessionService mediaSessionService = this.a;
            ArrayList arrayListC = mediaSessionService.c();
            for (int i = 0; i < arrayListC.size(); i++) {
                mediaSessionService.g((k2a) arrayListC.get(i), false);
            }
        }
    }

    public final iu9 b(k2a k2aVar) {
        k0a k0aVar = (k0a) this.g.get(k2aVar);
        if (k0aVar != null) {
            qu9 qu9Var = k0aVar.a;
            if (qu9Var.isDone()) {
                try {
                    return (iu9) rx8.F(qu9Var);
                } catch (ExecutionException e) {
                    qr7.w(e);
                }
            }
        }
        return null;
    }

    public final boolean c(boolean z) {
        boolean z2;
        ArrayList arrayListC = this.a.c();
        int i = 0;
        while (true) {
            if (i >= arrayListC.size()) {
                z2 = false;
                break;
            }
            iu9 iu9VarB = b((k2a) arrayListC.get(i));
            if (iu9VarB != null && ((iu9VarB.z() || z) && (iu9VarB.getPlaybackState() == 3 || iu9VarB.getPlaybackState() == 2))) {
                z2 = true;
                break;
            }
            i++;
        }
        boolean z3 = this.m;
        long j = this.n;
        boolean z4 = z3 && j > 0;
        boolean z5 = this.l;
        Handler handler = this.d;
        if (z5 && !z2 && z4) {
            handler.sendEmptyMessageDelayed(1, j);
        } else if (z2) {
            handler.removeMessages(1);
        }
        this.l = z2;
        return z2 || handler.hasMessages(1);
    }

    public final boolean d(k2a k2aVar) {
        iu9 iu9VarB = b(k2aVar);
        if (iu9VarB != null && !iu9VarB.v().p()) {
            k0a k0aVar = (k0a) this.g.get(k2aVar);
            k0aVar.getClass();
            if (iu9VarB.getPlaybackState() != 1) {
                k0aVar.b = false;
                k0aVar.c = true;
                return true;
            }
            int i = this.o;
            if (i == 1) {
                return !k0aVar.b;
            }
            if (i != 2) {
                if (i != 3) {
                    c.t();
                    return false;
                }
                if (!k0aVar.b && k0aVar.c) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void e(k2a k2aVar, ex8 ex8Var, boolean z) {
        MediaSession.Token token = ((q2a) k2aVar.a.h.m.b).c.b;
        Notification notification = (Notification) ex8Var.b;
        notification.extras.putParcelable("android.mediaSession", token);
        this.j = ex8Var;
        MediaSessionService mediaSessionService = this.a;
        if (!z) {
            this.c.a(null, 1001, notification);
            wrk.c(mediaSessionService, false);
            this.k = false;
        } else {
            mediaSessionService.startForegroundService(this.f);
            String str = vqi.a;
            if (Build.VERSION.SDK_INT >= 29) {
                j2m.c(mediaSessionService, notification);
            } else {
                mediaSessionService.startForeground(1001, notification);
            }
            this.k = true;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        MediaSessionService mediaSessionService = this.a;
        ArrayList arrayListC = mediaSessionService.c();
        for (int i = 0; i < arrayListC.size(); i++) {
            mediaSessionService.g((k2a) arrayListC.get(i), false);
        }
        return true;
    }
}
