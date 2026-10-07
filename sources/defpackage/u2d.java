package defpackage;

import one.me.chatmedia.viewer.video.playbackSpeed.PlaybackSettingsBottomSheet;

/* JADX INFO: loaded from: classes4.dex */
public final class u2d implements c8c {
    public final /* synthetic */ v0c a;
    public final /* synthetic */ PlaybackSettingsBottomSheet b;

    public u2d(v0c v0cVar, PlaybackSettingsBottomSheet playbackSettingsBottomSheet) {
        this.a = v0cVar;
        this.b = playbackSettingsBottomSheet;
    }

    @Override // defpackage.c8c
    public final void a(e8c e8cVar, float f, boolean z) {
        pu4.c(this.a, Float.valueOf(f), false, 6);
        if (!z || e8cVar.getThumbIsPressed()) {
            return;
        }
        PlaybackSettingsBottomSheet playbackSettingsBottomSheet = this.b;
        ((qeg) playbackSettingsBottomSheet.p.getValue()).a(1, f);
        l63 l63VarD1 = playbackSettingsBottomSheet.D1();
        mjg mjgVar = l63VarD1.E1;
        Float fValueOf = Float.valueOf(f);
        mjgVar.getClass();
        mjgVar.j(null, fValueOf);
        a8j.x(l63VarD1.Y, new ub6(f));
        playbackSettingsBottomSheet.D1().a0(((v9c) playbackSettingsBottomSheet.r.m(playbackSettingsBottomSheet, PlaybackSettingsBottomSheet.u[2])).isChecked());
    }
}
