package defpackage;

import android.graphics.Rect;
import android.util.Size;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class ei0 {
    public final UUID a;
    public final int b;
    public final int c;
    public final Rect d;
    public final Size e;
    public final int f;
    public final boolean g;
    public final boolean h;

    public ei0(UUID uuid, int i, int i2, Rect rect, Size size, int i3, boolean z, boolean z2) {
        if (uuid == null) {
            ore.n("Null getUuid");
            throw null;
        }
        this.a = uuid;
        this.b = i;
        this.c = i2;
        if (rect == null) {
            ore.n("Null getCropRect");
            throw null;
        }
        this.d = rect;
        if (size == null) {
            ore.n("Null getSize");
            throw null;
        }
        this.e = size;
        this.f = i3;
        this.g = z;
        this.h = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ei0)) {
            return false;
        }
        ei0 ei0Var = (ei0) obj;
        return this.a.equals(ei0Var.a) && this.b == ei0Var.b && this.c == ei0Var.c && this.d.equals(ei0Var.d) && this.e.equals(ei0Var.e) && this.f == ei0Var.f && this.g == ei0Var.g && this.h == ei0Var.h;
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f) * 1000003) ^ (this.g ? 1231 : 1237)) * 1000003) ^ (this.h ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutConfig{getUuid=");
        sb.append(this.a);
        sb.append(", getTargets=");
        sb.append(this.b);
        sb.append(", getFormat=");
        sb.append(this.c);
        sb.append(", getCropRect=");
        sb.append(this.d);
        sb.append(", getSize=");
        sb.append(this.e);
        sb.append(", getRotationDegrees=");
        sb.append(this.f);
        sb.append(", isMirroring=");
        sb.append(this.g);
        sb.append(", shouldRespectInputCropRect=");
        return qt4.r(sb, this.h, "}");
    }
}
