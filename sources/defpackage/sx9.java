package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class sx9 extends tx9 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;

    public /* synthetic */ sx9(int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i5) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? -1 : i3, (i5 & 8) != 0 ? -1 : i4, (i5 & 64) != 0 ? false : z, false, false, z2, (i5 & 1024) != 0 ? false : z3, (i5 & np0.q) != 0 ? false : z4, (i5 & np0.r) != 0 ? false : z5);
    }

    public static sx9 q(sx9 sx9Var, int i) {
        return new sx9(sx9Var.a, sx9Var.b, sx9Var.c, sx9Var.d, sx9Var.e, (i & np0.m) != 0 ? sx9Var.f : false, (i & np0.n) != 0 ? sx9Var.g : false, sx9Var.h, (i & 1024) != 0 ? sx9Var.i : false, sx9Var.j, sx9Var.k);
    }

    @Override // defpackage.prk
    public final void c(nv4 nv4Var) {
        String str;
        nv4Var.invoke("type=Transcode.KeepCodec");
        nv4Var.invoke(nbh.u("video_size=", this.a, "x", this.b, ","));
        int i = this.c;
        if (i > 0) {
            str = (i / 1000000.0f) + " Mbps";
        } else {
            str = "UNSET";
        }
        nv4Var.invoke("video_bitrate=" + str + ",");
        int i2 = this.d;
        nv4Var.invoke("video_max_encoder_frames_per_s=" + (i2 > 0 ? Integer.valueOf(i2) : "UNSET"));
        nv4Var.invoke("video_frame_rate=" + ((Object) "UNSET"));
        nv4Var.invoke("video_portrait_encoding=" + this.e);
        nv4Var.invoke("audio_mime_type=".concat("UNSET"));
        nv4Var.invoke("constant_bitrate=" + this.f);
        nv4Var.invoke("constant_bitrate_forced=" + this.g);
        nv4Var.invoke("hdr_allowed=" + this.h);
        nv4Var.invoke("hdr_tone_mapping_via_codec_enabled=" + this.i);
        nv4Var.invoke("b_frames_disabled=" + this.j);
        nv4Var.invoke("performance_parameters_disabled=" + this.k);
    }

    @Override // defpackage.tx9
    public final String d() {
        return null;
    }

    @Override // defpackage.tx9
    public final int e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sx9)) {
            return false;
        }
        sx9 sx9Var = (sx9) obj;
        return this.a == sx9Var.a && this.b == sx9Var.b && this.c == sx9Var.c && this.d == sx9Var.d && this.e == sx9Var.e && this.f == sx9Var.f && this.g == sx9Var.g && this.h == sx9Var.h && this.i == sx9Var.i && this.j == sx9Var.j && this.k == sx9Var.k;
    }

    @Override // defpackage.tx9
    public final int f() {
        return 0;
    }

    @Override // defpackage.tx9
    public final int g() {
        return this.b;
    }

    @Override // defpackage.tx9
    public final int h() {
        return this.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + nbh.n(nbh.n(nbh.n(nbh.n(nbh.n(nbh.n(zo5.c(0, zo5.c(this.d, zo5.c(this.c, zo5.c(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 961), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
    }

    @Override // defpackage.tx9
    public final boolean i() {
        return this.e;
    }

    @Override // defpackage.tx9
    public final int j() {
        return this.a;
    }

    @Override // defpackage.tx9
    public final boolean k() {
        return this.f;
    }

    @Override // defpackage.tx9
    public final boolean l() {
        return this.g;
    }

    @Override // defpackage.tx9
    public final boolean m() {
        return this.j;
    }

    @Override // defpackage.tx9
    public final boolean n() {
        return this.h;
    }

    @Override // defpackage.tx9
    public final boolean o() {
        return this.i;
    }

    @Override // defpackage.tx9
    public final boolean p() {
        return this.k;
    }

    public final String toString() {
        StringBuilder sbP = qv1.p("KeepCodec(requestedWidth=", this.a, ", requestedHeight=", this.b, ", requestedBitrate=");
        qt4.x(this.c, this.d, ", requestedMaxEncoderFrames=", ", requestedFrameRate=0, requestedAudioMimeType=null, requestedPortraitEncoding=", sbP);
        qt4.B(", useConstantBitrate=", ", useConstantBitrateForced=", sbP, this.e, this.f);
        qt4.B(", isHdrAllowed=", ", isHdrToneMappingViaCodecEnabled=", sbP, this.g, this.h);
        qt4.B(", isBFramesDisabled=", ", isPerformanceParametersDisabled=", sbP, this.i, this.j);
        return qt4.r(sbP, this.k, ")");
    }

    public sx9(int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        this.j = z6;
        this.k = z7;
    }
}
