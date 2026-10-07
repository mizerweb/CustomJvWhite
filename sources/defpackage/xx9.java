package defpackage;

import android.net.Uri;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes3.dex */
public final class xx9 {
    public final Uri a;
    public final long b;
    public final long c;
    public final boolean d;
    public final b87[] e;
    public final b87[] f;
    public final b87[] g;
    public final long h;
    public final int i;
    public final Float j;
    public final Integer k;

    public xx9(Uri uri, long j, long j2, boolean z, b87[] b87VarArr, b87[] b87VarArr2, b87[] b87VarArr3, long j3, int i, Float f, Integer num) {
        this.a = uri;
        this.b = j;
        this.c = j2;
        this.d = z;
        this.e = b87VarArr;
        this.f = b87VarArr2;
        this.g = b87VarArr3;
        this.h = j3;
        this.i = i;
        this.j = f;
        this.k = num;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        b87[] b87VarArr = this.e;
        if (b87VarArr.length != 0) {
            sb.append(a.h1(b87VarArr, "\n    ", null, null, new x27(24), 30));
        }
        if (this.f.length != 0) {
            sb.append("\n    ");
            sb.append(a.h1(this.f, "\n    ", null, null, new x27(25), 30));
        }
        if (this.g.length != 0) {
            sb.append("\n    ");
            sb.append(a.h1(this.g, "\n    ", null, null, new x27(26), 30));
        }
        String string = sb.toString();
        int i = this.i;
        if (i == 1) {
            str = "NONE";
        } else if (i == 2) {
            str = "MEDIA_3";
        } else {
            if (i != 3) {
                throw null;
            }
            str = "ANDROID_MEDIA";
        }
        long j = this.b;
        String str2 = "?";
        Object objValueOf = j != -9223372036854775807L ? Float.valueOf(j / 1000000.0f) : "?";
        long j2 = this.c;
        if (j2 > 0) {
            str2 = j2 + " bytes";
        }
        return s5h.y0("\n            |MediaInfo(\n            |    source=" + str + "\n            |    uri=" + this.a + "\n            |    took=" + this.h + " ms\n            |    duration=" + objValueOf + "\n            |    file_size=" + str2 + "\n            |    hdr=" + this.d + "\n            |    i_frame_interval_sec=" + this.j + "\n            |    max_num_reorder_samples=" + this.k + "\n            |    " + string + "\n            |)\n        ");
    }
}
