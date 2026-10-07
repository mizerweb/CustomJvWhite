package defpackage;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.util.LruCache;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ru3 {
    public static final LruCache a = new LruCache(10);

    public static final MediaCodecInfo a(String str) throws Throwable {
        Object obj;
        MediaCodec mediaCodecCreateEncoderByType;
        LruCache lruCache = a;
        synchronized (lruCache) {
            obj = lruCache.get(str);
        }
        try {
            if (obj != null) {
                return (MediaCodecInfo) obj;
            }
            try {
                try {
                    mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(str);
                    try {
                        MediaCodecInfo codecInfo = mediaCodecCreateEncoderByType.getCodecInfo();
                        synchronized (lruCache) {
                        }
                        mediaCodecCreateEncoderByType.release();
                        return codecInfo;
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (IllegalArgumentException e) {
                    throw new InvalidConfigException(e);
                }
            } catch (IOException e2) {
                throw new InvalidConfigException(e2);
            }
        } catch (Throwable th2) {
            th = th2;
            mediaCodecCreateEncoderByType = null;
        }
        if (mediaCodecCreateEncoderByType != null) {
            mediaCodecCreateEncoderByType.release();
        }
        throw th;
    }
}
