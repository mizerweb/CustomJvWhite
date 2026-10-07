package defpackage;

import ru.ok.android.externcalls.sdk.audio.internal.AudioFocusRequestHelper;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AudioFocusRequestHelper b;

    public /* synthetic */ v80(AudioFocusRequestHelper audioFocusRequestHelper, int i) {
        this.a = i;
        this.b = audioFocusRequestHelper;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        AudioFocusRequestHelper audioFocusRequestHelper = this.b;
        switch (i) {
            case 0:
                AudioFocusRequestHelper.muteForever$lambda$6(audioFocusRequestHelper);
                break;
            case 1:
                AudioFocusRequestHelper.mute$lambda$4(audioFocusRequestHelper);
                break;
            case 2:
                AudioFocusRequestHelper.unmute$lambda$8(audioFocusRequestHelper);
                break;
            default:
                audioFocusRequestHelper.requestFocus();
                break;
        }
    }
}
