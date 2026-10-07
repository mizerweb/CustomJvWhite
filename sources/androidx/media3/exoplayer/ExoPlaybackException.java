package androidx.media3.exoplayer;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import defpackage.b87;
import defpackage.lvb;
import defpackage.vqi;
import defpackage.x4a;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ExoPlaybackException extends PlaybackException {
    public final int j;
    public final String k;
    public final int l;
    public final b87 m;
    public final int n;
    public final x4a o;
    public final boolean p;

    /* JADX WARN: Illegal instructions before constructor call */
    public ExoPlaybackException(int i, Exception exc, int i2, String str, int i3, b87 b87Var, int i4, x4a x4aVar, boolean z) {
        String str2;
        int i5;
        b87 b87Var2;
        String string;
        if (i == 0) {
            str2 = str;
            i5 = i3;
            b87Var2 = b87Var;
            string = "Source error";
        } else if (i != 1) {
            string = i != 3 ? "Unexpected runtime error" : "Remote error";
            str2 = str;
            i5 = i3;
            b87Var2 = b87Var;
        } else {
            StringBuilder sb = new StringBuilder();
            str2 = str;
            sb.append(str2);
            sb.append(" error, index=");
            i5 = i3;
            sb.append(i5);
            sb.append(", format=");
            b87Var2 = b87Var;
            sb.append(b87Var2);
            sb.append(", format_supported=");
            sb.append(vqi.E(i4));
            string = sb.toString();
        }
        this(TextUtils.isEmpty(null) ? string : string.concat(": null"), exc, i2, i, str2, i5, b87Var2, i4, x4aVar, SystemClock.elapsedRealtime(), z);
    }

    @Override // androidx.media3.common.PlaybackException
    public final boolean a(PlaybackException playbackException) {
        if (!super.a(playbackException)) {
            return false;
        }
        String str = vqi.a;
        ExoPlaybackException exoPlaybackException = (ExoPlaybackException) playbackException;
        return this.j == exoPlaybackException.j && Objects.equals(this.k, exoPlaybackException.k) && this.l == exoPlaybackException.l && Objects.equals(this.m, exoPlaybackException.m) && this.n == exoPlaybackException.n && Objects.equals(this.o, exoPlaybackException.o) && this.p == exoPlaybackException.p;
    }

    public final ExoPlaybackException c(x4a x4aVar) {
        String message = getMessage();
        String str = vqi.a;
        return new ExoPlaybackException(message, getCause(), this.a, this.j, this.k, this.l, this.m, this.n, x4aVar, this.b, this.p);
    }

    public ExoPlaybackException(String str, Throwable th, int i, int i2, String str2, int i3, b87 b87Var, int i4, x4a x4aVar, long j, boolean z) {
        super(str, th, i, Bundle.EMPTY, j);
        lvb.R(!z || i2 == 1);
        lvb.R(th != null || i2 == 3);
        this.j = i2;
        this.k = str2;
        this.l = i3;
        this.m = b87Var;
        this.n = i4;
        this.o = x4aVar;
        this.p = z;
    }

    public ExoPlaybackException(int i, Exception exc, int i2) {
        this(i, exc, i2, null, -1, null, 4, null, false);
    }
}
