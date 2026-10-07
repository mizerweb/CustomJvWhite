package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public abstract class erl {
    public static long a(l6m l6mVar, long j) {
        long j2 = 0;
        double dMin = 0.0d;
        while (j2 < j) {
            long jP = l6mVar.p(j2);
            if (jP == -9223372036854775807L) {
                jP = BuildConfig.MAX_TIME_TO_UPLOAD;
            }
            lvb.b0(jP > j2);
            dMin += (Math.min(jP, j) - j2) / ((double) l6mVar.r(j2));
            j2 = jP;
        }
        return (long) Math.floor(dMin);
    }

    public static long b(int i, long j, l6m l6mVar) {
        lvb.R(j >= 0);
        lvb.R(i > 0);
        long jP = l6mVar.p(vqi.g0(i, j));
        if (jP == -9223372036854775807L) {
            return -1L;
        }
        return vqi.r(i, jP);
    }

    public static oa0 c(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
        int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        if (playbackOffloadSupport == 0) {
            return oa0.d;
        }
        na0 na0Var = new na0();
        boolean z2 = Build.VERSION.SDK_INT > 32 && playbackOffloadSupport == 2;
        na0Var.a = true;
        na0Var.b = z2;
        na0Var.c = z;
        return na0Var.a();
    }
}
