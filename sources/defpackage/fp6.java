package defpackage;

import one.me.sdk.media.ffmpeg.FfmpegLibraryLoader;
import one.me.sdk.media.ffmpeg.WebmConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fp6 implements FfmpegLibraryLoader {
    @Override // one.me.sdk.media.ffmpeg.FfmpegLibraryLoader
    public final void load(String str) {
        try {
            System.loadLibrary("ffmpg");
        } catch (Throwable th) {
            WebmConfig.getLogger().h(th);
        }
    }
}
