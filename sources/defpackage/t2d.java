package defpackage;

import android.widget.CompoundButton;
import one.me.chatmedia.viewer.video.playbackSpeed.PlaybackSettingsBottomSheet;

/* JADX INFO: loaded from: classes2.dex */
public final class t2d implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ PlaybackSettingsBottomSheet a;

    public t2d(PlaybackSettingsBottomSheet playbackSettingsBottomSheet) {
        this.a = playbackSettingsBottomSheet;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        lu8 lu8Var = PlaybackSettingsBottomSheet.t;
        this.a.D1().a0(z);
    }
}
