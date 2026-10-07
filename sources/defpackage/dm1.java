package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public enum dm1 {
    VIDEO_ACCEPT(R.string.call_incoming_accept_with_video_accessibility, R.drawable.icon_video_call_fill, null),
    AUDIO_ACCEPT(R.string.call_incoming_accept_with_audio_accessibility, R.drawable.icon_call_fill, null),
    VIDEO_ACCEPT_WITH_TITLE(R.string.call_incoming_accept_with_video_accessibility, R.drawable.icon_video_call_fill, new tnh(R.string.call_incoming_apply_video_call_description)),
    AUDIO_ACCEPT_WITH_TITLE(R.string.call_incoming_accept_with_audio_accessibility, R.drawable.icon_call_fill, new tnh(R.string.call_incoming_apply_audio_call_description)),
    DECLINE(R.string.call_incoming_decline_accessibility, R.drawable.icon_phone_off_fill, null),
    DECLINE_WITH_TITLE(R.string.call_incoming_decline_accessibility, R.drawable.icon_phone_off_fill, new tnh(R.string.call_incoming_cancel_call_description));

    public final int a;
    public final int b;
    public final ynh c;

    dm1(int i, int i2, tnh tnhVar) {
        this.a = i;
        this.b = i2;
        this.c = tnhVar;
    }
}
