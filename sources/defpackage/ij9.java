package defpackage;

import android.media.LoudnessCodecController$OnLoudnessCodecUpdateListener;
import android.media.MediaCodec;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class ij9 implements LoudnessCodecController$OnLoudnessCodecUpdateListener {
    public final /* synthetic */ euc a;

    public ij9(euc eucVar) {
        this.a = eucVar;
    }

    public final Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
        ((p51) this.a.c).getClass();
        return bundle;
    }
}
