package defpackage;

import android.media.MediaFormat;
import android.util.Size;
import org.apache.commons.logging.LogFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class kj0 implements y76 {
    public final String a;
    public final int b;
    public final msh c;
    public final Size d;
    public final int e;
    public final lj0 f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;

    public kj0(String str, int i, msh mshVar, Size size, int i2, lj0 lj0Var, int i3, int i4, int i5, int i6) {
        this.a = str;
        this.b = i;
        this.c = mshVar;
        this.d = size;
        this.e = i2;
        this.f = lj0Var;
        this.g = i3;
        this.h = i4;
        this.i = i5;
        this.j = i6;
    }

    public static jj0 d() {
        jj0 jj0Var = new jj0();
        jj0Var.b = -1;
        jj0Var.f = 1;
        jj0Var.c = 2130708361;
        jj0Var.j = lj0.d;
        return jj0Var;
    }

    @Override // defpackage.y76
    public final String a() {
        return this.a;
    }

    @Override // defpackage.y76
    public final MediaFormat b() {
        Size size = this.d;
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(this.a, size.getWidth(), size.getHeight());
        mediaFormatCreateVideoFormat.setInteger("color-format", this.e);
        mediaFormatCreateVideoFormat.setInteger("bitrate", this.j);
        int i = this.h;
        mediaFormatCreateVideoFormat.setInteger("frame-rate", i);
        int i2 = this.g;
        if (i2 > i) {
            mediaFormatCreateVideoFormat.setInteger("capture-rate", i2);
            mediaFormatCreateVideoFormat.setInteger("operating-rate", i2);
            mediaFormatCreateVideoFormat.setInteger(LogFactory.PRIORITY_KEY, 0);
        }
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", this.i);
        int i3 = this.b;
        if (i3 != -1) {
            mediaFormatCreateVideoFormat.setInteger("profile", i3);
        }
        lj0 lj0Var = this.f;
        int i4 = lj0Var.a;
        if (i4 != 0) {
            mediaFormatCreateVideoFormat.setInteger("color-standard", i4);
        }
        int i5 = lj0Var.b;
        if (i5 != 0) {
            mediaFormatCreateVideoFormat.setInteger("color-transfer", i5);
        }
        int i6 = lj0Var.c;
        if (i6 != 0) {
            mediaFormatCreateVideoFormat.setInteger("color-range", i6);
        }
        return mediaFormatCreateVideoFormat;
    }

    @Override // defpackage.y76
    public final msh c() {
        return this.c;
    }

    public final jj0 e() {
        jj0 jj0Var = new jj0();
        jj0Var.a = this.a;
        jj0Var.b = Integer.valueOf(this.b);
        jj0Var.h = this.c;
        jj0Var.i = this.d;
        jj0Var.c = Integer.valueOf(this.e);
        jj0Var.j = this.f;
        jj0Var.d = Integer.valueOf(this.g);
        jj0Var.e = Integer.valueOf(this.h);
        jj0Var.f = Integer.valueOf(this.i);
        jj0Var.g = Integer.valueOf(this.j);
        return jj0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kj0) {
            kj0 kj0Var = (kj0) obj;
            if (this.a.equals(kj0Var.a) && this.b == kj0Var.b && this.c.equals(kj0Var.c) && this.d.equals(kj0Var.d) && this.e == kj0Var.e && this.f.equals(kj0Var.f) && this.g == kj0Var.g && this.h == kj0Var.h && this.i == kj0Var.i && this.j == kj0Var.j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.j ^ ((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003) ^ this.i) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoEncoderConfig{mimeType=");
        sb.append(this.a);
        sb.append(", profile=");
        sb.append(this.b);
        sb.append(", inputTimebase=");
        sb.append(this.c);
        sb.append(", resolution=");
        sb.append(this.d);
        sb.append(", colorFormat=");
        sb.append(this.e);
        sb.append(", dataSpace=");
        sb.append(this.f);
        sb.append(", captureFrameRate=");
        sb.append(this.g);
        sb.append(", encodeFrameRate=");
        sb.append(this.h);
        sb.append(", IFrameInterval=");
        sb.append(this.i);
        sb.append(", bitrate=");
        return zo5.t(sb, this.j, "}");
    }
}
