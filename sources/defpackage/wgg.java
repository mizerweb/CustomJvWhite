package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class wgg extends z4e {
    public static final String d;
    public static final String e;
    public final int b;
    public final float c;

    static {
        String str = vqi.a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public wgg(int i, float f) {
        boolean z = false;
        lvb.O("maxStars must be a positive integer", i > 0);
        if (f >= 0.0f && f <= i) {
            z = true;
        }
        lvb.O("starRating is out of range [0, maxStars]", z);
        this.b = i;
        this.c = f;
    }

    @Override // defpackage.z4e
    public final boolean b() {
        return this.c != -1.0f;
    }

    @Override // defpackage.z4e
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(z4e.a, 2);
        bundle.putInt(d, this.b);
        bundle.putFloat(e, this.c);
        return bundle;
    }

    public final int d() {
        return this.b;
    }

    public final float e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wgg)) {
            return false;
        }
        wgg wggVar = (wgg) obj;
        return this.b == wggVar.b && this.c == wggVar.c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.b), Float.valueOf(this.c));
    }

    public wgg(int i) {
        lvb.O("maxStars must be a positive integer", i > 0);
        this.b = i;
        this.c = -1.0f;
    }
}
