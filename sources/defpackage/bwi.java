package defpackage;

import androidx.camera.video.internal.encoder.InvalidConfigException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bwi {
    public static awi a(String str) {
        try {
            return o3m.b(new cwi(ru3.a(str), str), null);
        } catch (InvalidConfigException e) {
            tvj.i("VideoEncoderInfoImpl", "Unable to find a VideoEncoderInfoImpl", e);
            return null;
        }
    }
}
