package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;
import androidx.camera.video.internal.compat.quirk.CodecStuckOnFlushQuirk;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes2.dex */
public final class k86 extends MediaCodec.Callback {
    public final uj6 a;
    public final boolean b;
    public boolean c = false;
    public boolean d = false;
    public boolean e = false;
    public long f = 0;
    public long g = 0;
    public boolean h = false;
    public boolean i = false;
    public boolean j = false;
    public boolean k;
    public final /* synthetic */ m86 l;

    public k86(m86 m86Var) {
        this.l = m86Var;
        this.b = true;
        boolean z = m86Var.c;
        this.k = z;
        if (z) {
            xp9 xp9Var = m86Var.q;
            msh mshVar = m86Var.p;
            CameraUseInconsistentTimebaseQuirk cameraUseInconsistentTimebaseQuirk = (CameraUseInconsistentTimebaseQuirk) sk5.a.b(CameraUseInconsistentTimebaseQuirk.class);
            uj6 uj6Var = new uj6();
            uj6Var.b = -1L;
            uj6Var.c = xp9Var;
            uj6Var.a = mshVar;
            uj6Var.d = cameraUseInconsistentTimebaseQuirk;
            this.a = uj6Var;
        } else {
            this.a = null;
        }
        if (((CodecStuckOnFlushQuirk) sk5.a.b(CodecStuckOnFlushQuirk.class)) == null || !"video/mp4v-es".equals(m86Var.d.getString("mime"))) {
            return;
        }
        this.b = false;
    }

    public final void a() {
        m86 m86Var;
        w76 w76Var;
        Executor executor;
        tvj.a(this.l.a, "reachEndData");
        if (this.e) {
            return;
        }
        this.e = true;
        ScheduledFuture scheduledFuture = this.l.E;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.l.E = null;
        }
        synchronized (this.l.b) {
            m86Var = this.l;
            w76Var = m86Var.t;
            executor = m86Var.u;
        }
        m86Var.m(new d86(this, executor, w76Var, 2));
    }

    public final void b(o76 o76Var, w76 w76Var, Executor executor) {
        m86 m86Var = this.l;
        m86Var.n.add(o76Var);
        o9b.a(o9b.g(o76Var.e), new uvc(this, o76Var, false, 16), m86Var.h);
        try {
            executor.execute(new gf5(w76Var, 23, o76Var));
        } catch (RejectedExecutionException e) {
            tvj.d(m86Var.a, "Unable to post to the supplied executor.", e);
            o76Var.close();
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        this.l.h.execute(new gf5(this, 20, codecException));
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        this.l.h.execute(new ai(this, i, 10));
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        this.l.h.execute(new c86(this, bufferInfo, mediaCodec, i, 1));
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        m86 m86Var = this.l;
        String str = m86Var.a;
        StringBuilder sb = new StringBuilder("onOutputFormatChanged: mediaFormat = ");
        sb.append(mediaFormat);
        sb.append(", CSD data = ");
        StringBuilder sb2 = new StringBuilder("{csd-0 = ");
        sb2.append(vql.a(mediaFormat.getByteBuffer("csd-0")));
        if (mediaFormat.containsKey("csd-1")) {
            sb2.append(", csd-1 = ");
            sb2.append(vql.a(mediaFormat.getByteBuffer("csd-1")));
        }
        if (mediaFormat.containsKey("csd-2")) {
            sb2.append(", csd-2 = ");
            sb2.append(vql.a(mediaFormat.getByteBuffer("csd-2")));
        }
        sb2.append("}");
        sb.append(sb2.toString());
        tvj.a(str, sb.toString());
        m86Var.h.execute(new gf5(this, 21, mediaFormat));
    }
}
