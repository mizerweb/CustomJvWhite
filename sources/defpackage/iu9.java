package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.PlaybackException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class iu9 implements l3d {
    public final tsh b;
    public boolean c;
    public final hu9 d;
    public final gu9 e;
    public final Handler f;
    public final long g;
    public boolean h;
    public final qu9 i;

    public iu9(Context context, xnf xnfVar, Bundle bundle, gu9 gu9Var, Looper looper, qu9 qu9Var, v2a v2aVar) {
        iu9 iu9Var;
        hu9 jv9Var;
        lvb.W(context, "context must not be null");
        lvb.W(xnfVar, "token must not be null");
        lvb.r0("MediaController", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.9.3] [" + vqi.a + "]");
        this.b = new tsh();
        this.g = -9223372036854775807L;
        this.e = gu9Var;
        this.f = new Handler(looper);
        this.i = qu9Var;
        if (xnfVar.a.g()) {
            v2aVar.getClass();
            jv9Var = new pv9(context, this, xnfVar, bundle, looper, v2aVar);
            iu9Var = this;
        } else {
            iu9Var = this;
            jv9Var = new jv9(context, iu9Var, xnfVar, bundle, looper);
        }
        iu9Var.d = jv9Var;
        jv9Var.connect();
    }

    @Override // defpackage.l3d
    public final void A(boolean z) {
        U();
        hu9 hu9Var = this.d;
        if (hu9Var.isConnected()) {
            hu9Var.A(z);
        } else {
            lvb.G0("MediaController", "The controller is not connected. Ignoring setShuffleMode().");
        }
    }

    @Override // defpackage.l3d
    public final int B() {
        U();
        hu9 hu9Var = this.d;
        if (hu9Var.isConnected()) {
            return hu9Var.B();
        }
        return -1;
    }

    @Override // defpackage.l3d
    public final int C() {
        U();
        hu9 hu9Var = this.d;
        if (hu9Var.isConnected()) {
            return hu9Var.C();
        }
        return -1;
    }

    @Override // defpackage.l3d
    public final void D(int i) {
        U();
        hu9 hu9Var = this.d;
        if (hu9Var.isConnected()) {
            hu9Var.D(i);
        } else {
            lvb.G0("MediaController", "The controller is not connected. Ignoring seekTo().");
        }
    }

    @Override // defpackage.l3d
    public final long E() {
        U();
        hu9 hu9Var = this.d;
        if (hu9Var.isConnected()) {
            return hu9Var.E();
        }
        return 0L;
    }

    @Override // defpackage.l3d
    public final int F() {
        U();
        hu9 hu9Var = this.d;
        if (hu9Var.isConnected()) {
            return hu9Var.F();
        }
        return -1;
    }

    @Override // defpackage.l3d
    public final void G(ry9 ry9Var) {
        U();
        lvb.W(ry9Var, "mediaItems must not be null");
        hu9 hu9Var = this.d;
        if (hu9Var.isConnected()) {
            hu9Var.G(ry9Var);
        } else {
            lvb.G0("MediaController", "The controller is not connected. Ignoring setMediaItems().");
        }
    }

    @Override // defpackage.l3d
    public final boolean H() {
        U();
        hu9 hu9Var = this.d;
        return hu9Var.isConnected() && hu9Var.H();
    }

    @Override // defpackage.l3d
    public final void I() {
        U();
        hu9 hu9Var = this.d;
        if (hu9Var.isConnected()) {
            hu9Var.I();
        } else {
            lvb.G0("MediaController", "The controller is not connected. Ignoring seekForward().");
        }
    }

    @Override // defpackage.l3d
    public final void J() {
        U();
        hu9 hu9Var = this.d;
        if (hu9Var.isConnected()) {
            hu9Var.J();
        } else {
            lvb.G0("MediaController", "The controller is not connected. Ignoring seekBack().");
        }
    }

    @Override // defpackage.l3d
    public final void K(List list) {
        U();
        lvb.W(list, "mediaItems must not be null");
        for (int i = 0; i < list.size(); i++) {
            lvb.Q("items must not contain null, index=%s", i, list.get(i) != null);
        }
        hu9 hu9Var = this.d;
        if (hu9Var.isConnected()) {
            hu9Var.K(list);
        } else {
            lvb.G0("MediaController", "The controller is not connected. Ignoring setMediaItems().");
        }
    }

    public final long L() {
        U();
        hu9 hu9Var = this.d;
        if (hu9Var.isConnected()) {
            return hu9Var.U();
        }
        return 0L;
    }

    public final ry9 M() {
        ush ushVarV = v();
        if (ushVarV.p()) {
            return null;
        }
        return ushVarV.m(F(), this.b, 0L).b;
    }

    public final boolean N() {
        U();
        ush ushVarV = v();
        return !ushVarV.p() && ushVarV.m(F(), this.b, 0L).g;
    }

    public final boolean O() {
        U();
        hu9 hu9Var = this.d;
        return hu9Var.isConnected() && hu9Var.d();
    }

    public final void P() {
        lvb.b0(Looper.myLooper() == this.f.getLooper());
        lvb.b0(!this.h);
        this.h = true;
        qu9 qu9Var = this.i;
        qu9Var.j = true;
        iu9 iu9Var = qu9Var.i;
        if (iu9Var != null) {
            qu9Var.m(iu9Var);
        }
    }

    public final void Q() {
        U();
        if (this.c) {
            return;
        }
        lvb.r0("MediaController", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.9.3] [" + vqi.a + "] [" + sz9.b() + "]");
        this.c = true;
        Handler handler = this.f;
        handler.removeCallbacksAndMessages(null);
        try {
            this.d.release();
        } catch (Exception e) {
            lvb.h0("MediaController", "Exception while releasing impl", e);
        }
        if (this.h) {
            lvb.b0(Looper.myLooper() == handler.getLooper());
            this.e.t(this);
        } else {
            this.h = true;
            qu9 qu9Var = this.i;
            qu9Var.getClass();
            qu9Var.n(new SecurityException("Session rejected the connection request."));
        }
    }

    public final void R(int i) {
        U();
        hu9 hu9Var = this.d;
        if (hu9Var.isConnected()) {
            hu9Var.N(i);
        } else {
            lvb.G0("MediaController", "The controller is not connected. Ignoring removeMediaItem().");
        }
    }

    public final void S(Runnable runnable) {
        vqi.d0(this.f, runnable);
    }

    public final void T(p70 p70Var, boolean z) {
        U();
        hu9 hu9Var = this.d;
        if (hu9Var.isConnected()) {
            hu9Var.P(p70Var, z);
        } else {
            lvb.G0("MediaController", "The controller is not connected. Ignoring setAudioAttributes().");
        }
    }

    public final void U() {
        lvb.Z("MediaController method is called from a wrong thread. See javadoc of MediaController for details.", Looper.myLooper() == this.f.getLooper());
    }

    @Override // defpackage.l3d
    public final float a() {
        U();
        hu9 hu9Var = this.d;
        if (hu9Var.isConnected()) {
            return hu9Var.a();
        }
        return 1.0f;
    }

    @Override // defpackage.l3d
    public final void b(float f) {
        U();
        lvb.O("volume must be between 0 and 1", f >= 0.0f && f <= 1.0f);
        hu9 hu9Var = this.d;
        if (hu9Var.isConnected()) {
            hu9Var.b(f);
        } else {
            lvb.G0("MediaController", "The controller is not connected. Ignoring setVolume().");
        }
    }

    @Override // defpackage.l3d
    public final boolean c(int i) {
        U();
        hu9 hu9Var = this.d;
        return (!hu9Var.isConnected() ? h3d.b : hu9Var.Q()).a(i);
    }

    public final void d(j3d j3dVar) {
        this.d.S(j3dVar);
    }

    @Override // defpackage.l3d
    public final long e() {
        U();
        hu9 hu9Var = this.d;
        if (hu9Var.isConnected()) {
            return hu9Var.e();
        }
        return 0L;
    }

    @Override // defpackage.l3d
    public final boolean f() {
        U();
        hu9 hu9Var = this.d;
        return hu9Var.isConnected() && hu9Var.f();
    }

    @Override // defpackage.l3d
    public final long g() {
        U();
        hu9 hu9Var = this.d;
        if (hu9Var.isConnected()) {
            return hu9Var.g();
        }
        return 0L;
    }

    @Override // defpackage.l3d
    public final long getDuration() {
        U();
        hu9 hu9Var = this.d;
        if (hu9Var.isConnected()) {
            return hu9Var.getDuration();
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.l3d
    public final int getPlaybackState() {
        U();
        hu9 hu9Var = this.d;
        if (hu9Var.isConnected()) {
            return hu9Var.getPlaybackState();
        }
        return 1;
    }

    @Override // defpackage.l3d
    public final int getRepeatMode() {
        U();
        hu9 hu9Var = this.d;
        if (hu9Var.isConnected()) {
            return hu9Var.getRepeatMode();
        }
        return 0;
    }

    @Override // defpackage.l3d
    public final void h(ry9 ry9Var, long j) {
        U();
        lvb.W(ry9Var, "mediaItems must not be null");
        hu9 hu9Var = this.d;
        if (hu9Var.isConnected()) {
            hu9Var.h(ry9Var, j);
        } else {
            lvb.G0("MediaController", "The controller is not connected. Ignoring setMediaItem().");
        }
    }

    @Override // defpackage.l3d
    public final void i() {
        U();
        hu9 hu9Var = this.d;
        if (hu9Var.isConnected()) {
            hu9Var.i();
        } else {
            lvb.G0("MediaController", "The controller is not connected. Ignoring seekToPreviousMediaItem().");
        }
    }

    @Override // defpackage.l3d
    public final void j() {
        U();
        hu9 hu9Var = this.d;
        if (hu9Var.isConnected()) {
            hu9Var.j();
        } else {
            lvb.G0("MediaController", "The controller is not connected. Ignoring seekTo().");
        }
    }

    @Override // defpackage.l3d
    public final void k(ryh ryhVar) {
        U();
        hu9 hu9Var = this.d;
        if (!hu9Var.isConnected()) {
            lvb.G0("MediaController", "The controller is not connected. Ignoring setTrackSelectionParameters().");
        }
        hu9Var.k(ryhVar);
    }

    @Override // defpackage.l3d
    public final void l() {
        U();
        hu9 hu9Var = this.d;
        if (hu9Var.isConnected()) {
            hu9Var.l();
        } else {
            lvb.G0("MediaController", "The controller is not connected. Ignoring seekToPrevious().");
        }
    }

    @Override // defpackage.l3d
    public final PlaybackException m() {
        U();
        hu9 hu9Var = this.d;
        if (hu9Var.isConnected()) {
            return hu9Var.m();
        }
        return null;
    }

    @Override // defpackage.l3d
    public final void n(boolean z) {
        U();
        hu9 hu9Var = this.d;
        if (hu9Var.isConnected()) {
            hu9Var.n(z);
        }
    }

    @Override // defpackage.l3d
    public final void o() {
        U();
        hu9 hu9Var = this.d;
        if (hu9Var.isConnected()) {
            hu9Var.o();
        } else {
            lvb.G0("MediaController", "The controller is not connected. Ignoring unmute().");
        }
    }

    @Override // defpackage.l3d
    public final void p() {
        U();
        hu9 hu9Var = this.d;
        if (hu9Var.isConnected()) {
            hu9Var.p();
        } else {
            lvb.G0("MediaController", "The controller is not connected. Ignoring seekToNextMediaItem().");
        }
    }

    @Override // defpackage.l3d
    public final void play() {
        U();
        hu9 hu9Var = this.d;
        if (hu9Var.isConnected()) {
            hu9Var.play();
        } else {
            lvb.G0("MediaController", "The controller is not connected. Ignoring play().");
        }
    }

    @Override // defpackage.l3d
    public final void prepare() {
        U();
        hu9 hu9Var = this.d;
        if (hu9Var.isConnected()) {
            hu9Var.prepare();
        } else {
            lvb.G0("MediaController", "The controller is not connected. Ignoring prepare().");
        }
    }

    @Override // defpackage.l3d
    public final fzh q() {
        U();
        hu9 hu9Var = this.d;
        return hu9Var.isConnected() ? hu9Var.q() : fzh.b;
    }

    @Override // defpackage.l3d
    public final void r(b0a b0aVar) {
        U();
        lvb.W(b0aVar, "playlistMetadata must not be null");
        hu9 hu9Var = this.d;
        if (hu9Var.isConnected()) {
            hu9Var.r(b0aVar);
        } else {
            lvb.G0("MediaController", "The controller is not connected. Ignoring setPlaylistMetadata().");
        }
    }

    @Override // defpackage.l3d
    public final int s() {
        U();
        hu9 hu9Var = this.d;
        if (hu9Var.isConnected()) {
            return hu9Var.s();
        }
        return -1;
    }

    @Override // defpackage.l3d
    public final void seekTo(long j) {
        U();
        hu9 hu9Var = this.d;
        if (hu9Var.isConnected()) {
            hu9Var.seekTo(j);
        } else {
            lvb.G0("MediaController", "The controller is not connected. Ignoring seekTo().");
        }
    }

    @Override // defpackage.l3d
    public final void setPlaybackSpeed(float f) {
        U();
        hu9 hu9Var = this.d;
        if (hu9Var.isConnected()) {
            hu9Var.setPlaybackSpeed(f);
        } else {
            lvb.G0("MediaController", "The controller is not connected. Ignoring setPlaybackSpeed().");
        }
    }

    @Override // defpackage.l3d
    public final void setRepeatMode(int i) {
        U();
        hu9 hu9Var = this.d;
        if (hu9Var.isConnected()) {
            hu9Var.setRepeatMode(i);
        } else {
            lvb.G0("MediaController", "The controller is not connected. Ignoring setRepeatMode().");
        }
    }

    @Override // defpackage.l3d
    public final void stop() {
        U();
        hu9 hu9Var = this.d;
        if (hu9Var.isConnected()) {
            hu9Var.stop();
        } else {
            lvb.G0("MediaController", "The controller is not connected. Ignoring stop().");
        }
    }

    @Override // defpackage.l3d
    public final void t(ry9 ry9Var) {
        U();
        lvb.W(ry9Var, "mediaItems must not be null");
        hu9 hu9Var = this.d;
        if (hu9Var.isConnected()) {
            hu9Var.t(ry9Var);
        } else {
            lvb.G0("MediaController", "The controller is not connected. Ignoring setMediaItem().");
        }
    }

    @Override // defpackage.l3d
    public final int u() {
        U();
        hu9 hu9Var = this.d;
        if (hu9Var.isConnected()) {
            return hu9Var.u();
        }
        return 0;
    }

    @Override // defpackage.l3d
    public final ush v() {
        U();
        hu9 hu9Var = this.d;
        return hu9Var.isConnected() ? hu9Var.v() : ush.a;
    }

    @Override // defpackage.l3d
    public final void w() {
        U();
        hu9 hu9Var = this.d;
        if (hu9Var.isConnected()) {
            hu9Var.w();
        } else {
            lvb.G0("MediaController", "The controller is not connected. Ignoring mute().");
        }
    }

    @Override // defpackage.l3d
    public final void x(int i, long j, List list) {
        U();
        lvb.W(list, "mediaItems must not be null");
        for (int i2 = 0; i2 < list.size(); i2++) {
            lvb.Q("items must not contain null, index=%s", i2, list.get(i2) != null);
        }
        hu9 hu9Var = this.d;
        if (hu9Var.isConnected()) {
            hu9Var.x(i, j, list);
        } else {
            lvb.G0("MediaController", "The controller is not connected. Ignoring setMediaItems().");
        }
    }

    @Override // defpackage.l3d
    public final void y() {
        U();
        hu9 hu9Var = this.d;
        if (hu9Var.isConnected()) {
            hu9Var.y();
        } else {
            lvb.G0("MediaController", "The controller is not connected. Ignoring seekToNext().");
        }
    }

    @Override // defpackage.l3d
    public final boolean z() {
        U();
        hu9 hu9Var = this.d;
        return hu9Var.isConnected() && hu9Var.z();
    }
}
