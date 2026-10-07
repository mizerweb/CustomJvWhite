package defpackage;

import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ku9 extends MediaController.Callback {
    public final WeakReference a;

    public ku9(nv9 nv9Var) {
        this.a = new WeakReference(nv9Var);
    }

    @Override // android.media.session.MediaController.Callback
    public final void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
        nv9 nv9Var = (nv9) this.a.get();
        if (nv9Var == null || playbackInfo == null) {
            return;
        }
        int playbackType = playbackInfo.getPlaybackType();
        String volumeControlId = Build.VERSION.SDK_INT >= 30 ? playbackInfo.getVolumeControlId() : null;
        boolean z = true;
        if (playbackType == 1 && volumeControlId != null) {
            z = false;
        }
        lvb.R(z);
        ou9 ou9Var = new ou9(playbackType, p70.b(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume(), volumeControlId);
        pv9 pv9Var = nv9Var.e;
        ov9 ov9Var = pv9Var.n;
        pv9Var.n = new ov9(ou9Var, ov9Var.b, ov9Var.c, ov9Var.d, ov9Var.e, ov9Var.f, ov9Var.g, ov9Var.h);
        nv9Var.e();
    }

    @Override // android.media.session.MediaController.Callback
    public final void onExtrasChanged(Bundle bundle) {
        Bundle bundleN = vqi.n(bundle);
        nv9 nv9Var = (nv9) this.a.get();
        if (nv9Var != null) {
            pv9 pv9Var = nv9Var.e;
            if (bundleN == null) {
                bundleN = new Bundle();
            }
            Bundle bundle2 = bundleN;
            ov9 ov9Var = pv9Var.n;
            pv9Var.n = new ov9(ov9Var.a, ov9Var.b, ov9Var.c, ov9Var.d, ov9Var.e, ov9Var.f, ov9Var.g, bundle2);
            pv9Var.o = true;
            nv9Var.e();
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onMetadataChanged(MediaMetadata mediaMetadata) {
        nv9 nv9Var = (nv9) this.a.get();
        if (nv9Var != null) {
            d0a d0aVarB = d0a.b(mediaMetadata);
            pv9 pv9Var = nv9Var.e;
            ov9 ov9Var = pv9Var.n;
            pv9Var.n = new ov9(ov9Var.a, ov9Var.b, d0aVarB, ov9Var.d, ov9Var.e, ov9Var.f, ov9Var.g, ov9Var.h);
            nv9Var.e();
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onPlaybackStateChanged(PlaybackState playbackState) {
        nv9 nv9Var = (nv9) this.a.get();
        if (nv9Var == null || nv9Var.c != null) {
            return;
        }
        nv9Var.b(x2d.a(playbackState));
    }

    @Override // android.media.session.MediaController.Callback
    public final void onQueueChanged(List list) {
        nv9 nv9Var = (nv9) this.a.get();
        if (nv9Var != null) {
            ArrayList arrayListA = t2a.a(list);
            pv9 pv9Var = nv9Var.e;
            ov9 ov9Var = pv9Var.n;
            pv9Var.n = new ov9(ov9Var.a, ov9Var.b, ov9Var.c, pv9.Y(arrayListA), ov9Var.e, ov9Var.f, ov9Var.g, ov9Var.h);
            nv9Var.e();
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onQueueTitleChanged(CharSequence charSequence) {
        nv9 nv9Var = (nv9) this.a.get();
        if (nv9Var != null) {
            pv9 pv9Var = nv9Var.e;
            ov9 ov9Var = pv9Var.n;
            pv9Var.n = new ov9(ov9Var.a, ov9Var.b, ov9Var.c, ov9Var.d, charSequence, ov9Var.f, ov9Var.g, ov9Var.h);
            nv9Var.e();
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onSessionDestroyed() {
        nv9 nv9Var = (nv9) this.a.get();
        if (nv9Var != null) {
            nv9Var.e.b.Q();
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onSessionEvent(String str, Bundle bundle) {
        Bundle bundleN = vqi.n(bundle);
        nv9 nv9Var = (nv9) this.a.get();
        if (nv9Var != null) {
            pv9 pv9Var = nv9Var.e;
            if (str == null) {
                return;
            }
            if (bundleN == null) {
                bundleN = Bundle.EMPTY;
            }
            iu9 iu9Var = pv9Var.b;
            iu9Var.getClass();
            lvb.b0(Looper.myLooper() == iu9Var.f.getLooper());
            iu9Var.e.u(new emf(str, bundleN));
        }
    }
}
