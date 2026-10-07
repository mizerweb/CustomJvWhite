package defpackage;

import android.media.MediaFormat;

/* JADX INFO: loaded from: classes2.dex */
public final class qg0 implements y76 {
    public final String a;
    public final int b;
    public final msh c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    public qg0(String str, int i, msh mshVar, int i2, int i3, int i4, int i5) {
        this.a = str;
        this.b = i;
        this.c = mshVar;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
    }

    @Override // defpackage.y76
    public final String a() {
        return this.a;
    }

    @Override // defpackage.y76
    public final MediaFormat b() {
        int i = this.f;
        int i2 = this.g;
        String str = this.a;
        MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat(str, i, i2);
        mediaFormatCreateAudioFormat.setInteger("bitrate", this.d);
        int i3 = this.b;
        if (i3 != -1) {
            if (str.equals("audio/mp4a-latm")) {
                mediaFormatCreateAudioFormat.setInteger("aac-profile", i3);
                return mediaFormatCreateAudioFormat;
            }
            mediaFormatCreateAudioFormat.setInteger("profile", i3);
        }
        return mediaFormatCreateAudioFormat;
    }

    @Override // defpackage.y76
    public final msh c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qg0) {
            qg0 qg0Var = (qg0) obj;
            if (this.a.equals(qg0Var.a) && this.b == qg0Var.b && this.c.equals(qg0Var.c) && this.d == qg0Var.d && this.e == qg0Var.e && this.f == qg0Var.f && this.g == qg0Var.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.g ^ ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioEncoderConfig{mimeType=");
        sb.append(this.a);
        sb.append(", profile=");
        sb.append(this.b);
        sb.append(", inputTimebase=");
        sb.append(this.c);
        sb.append(", bitrate=");
        sb.append(this.d);
        sb.append(", captureSampleRate=");
        sb.append(this.e);
        sb.append(", encodeSampleRate=");
        sb.append(this.f);
        sb.append(", channelCount=");
        return zo5.t(sb, this.g, "}");
    }
}
