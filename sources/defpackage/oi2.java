package defpackage;

import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class oi2 {
    public static /* bridge */ /* synthetic */ MediaMetricsManager d(Object obj) {
        return (MediaMetricsManager) obj;
    }

    public static /* synthetic */ NetworkEvent.Builder e() {
        return new NetworkEvent.Builder();
    }

    public static /* synthetic */ PlaybackErrorEvent.Builder i() {
        return new PlaybackErrorEvent.Builder();
    }

    public static /* bridge */ /* synthetic */ PlaybackMetrics.Builder n(Object obj) {
        return (PlaybackMetrics.Builder) obj;
    }

    public static /* synthetic */ PlaybackStateEvent.Builder p() {
        return new PlaybackStateEvent.Builder();
    }
}
