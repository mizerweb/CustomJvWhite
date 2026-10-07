package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class iqc extends z4e {
    public static final String c;
    public final float b;

    static {
        String str = vqi.a;
        c = Integer.toString(1, 36);
    }

    public iqc(float f) {
        lvb.O("percent must be in the range of [0, 100]", f >= 0.0f && f <= 100.0f);
        this.b = f;
    }

    @Override // defpackage.z4e
    public final boolean b() {
        return this.b != -1.0f;
    }

    @Override // defpackage.z4e
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(z4e.a, 1);
        bundle.putFloat(c, this.b);
        return bundle;
    }

    public final float d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof iqc) {
            return this.b == ((iqc) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(this.b));
    }

    public iqc() {
        this.b = -1.0f;
    }
}
