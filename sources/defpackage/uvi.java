package defpackage;

import android.widget.FrameLayout;
import one.video.player.BaseVideoPlayer;

/* JADX INFO: loaded from: classes3.dex */
public final class uvi extends FrameLayout {
    public tvi a;

    public static /* synthetic */ void getCurrentSpeed$annotations() {
    }

    public static /* synthetic */ void getState$annotations() {
    }

    public final String getCurrentSpeed() {
        aec player = this.a.getPlayer();
        return String.valueOf(player != null ? Float.valueOf(((BaseVideoPlayer) player).w) : null);
    }

    public final String getState() {
        aec player = this.a.getPlayer();
        switch (player != null ? ((BaseVideoPlayer) player).j() : 0) {
            case 1:
                return "IDLE";
            case 2:
                return "BUFFERING";
            case 3:
                return "PLAYING";
            case 4:
                return "PAUSED";
            case 5:
                return "ENDED";
            case 6:
                return "ERROR";
            case 7:
                return "RELEASED";
            default:
                return "null";
        }
    }

    public final void setPlayer(aec aecVar) {
        this.a.setPlayer(aecVar);
    }
}
