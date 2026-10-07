package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rx9 extends tx9 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;

    public /* synthetic */ rx9(int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i6) {
        this(i, i2, i3, (i6 & 8) != 0 ? -1 : i4, (i6 & 16) != 0 ? 0 : i5, z, (i6 & 64) != 0 ? null : "audio/mp4a-latm", (i6 & np0.m) != 0 ? false : z2, (i6 & np0.n) != 0 ? false : z3, z4, z5, z6, z7);
    }

    public static rx9 q(rx9 rx9Var, int i) {
        return new rx9(rx9Var.a, rx9Var.b, rx9Var.c, rx9Var.d, rx9Var.e, rx9Var.f, rx9Var.g, (i & np0.m) != 0 ? rx9Var.h : false, (i & np0.n) != 0 ? rx9Var.i : false, rx9Var.j, (i & 1024) != 0 ? rx9Var.k : false, rx9Var.l, rx9Var.m);
    }

    @Override // defpackage.prk
    public final void c(nv4 nv4Var) {
        String str;
        nv4Var.invoke("type=Transcode.ForceH264");
        nv4Var.invoke(nbh.u("video_size=", this.a, "x", this.b, ","));
        int i = this.c;
        if (i > 0) {
            str = (i / 1000000.0f) + " Mbps";
        } else {
            str = "UNSET";
        }
        nv4Var.invoke("video_bitrate=" + str + ",");
        int i2 = this.d;
        nv4Var.invoke("video_max_encoder_frames=" + (i2 > 0 ? Integer.valueOf(i2) : "UNSET"));
        int i3 = this.e;
        nv4Var.invoke("video_frame_rate=" + (i3 > 0 ? Integer.valueOf(i3) : "UNSET"));
        nv4Var.invoke("video_portrait_encoding=" + this.f);
        String str2 = this.g;
        nv4Var.invoke("audio_mime_type=".concat(str2 != null ? str2 : "UNSET"));
        nv4Var.invoke("constant_bitrate=" + this.h);
        nv4Var.invoke("constant_bitrate_forced=" + this.i);
        nv4Var.invoke("hdr_allowed=" + this.j);
        nv4Var.invoke("hdr_tone_mapping_via_codec_enabled=" + this.k);
        nv4Var.invoke("b_frames_disabled=" + this.l);
        nv4Var.invoke("performance_parameters_disabled=" + this.m);
    }

    @Override // defpackage.tx9
    public final String d() {
        return this.g;
    }

    @Override // defpackage.tx9
    public final int e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx9)) {
            return false;
        }
        rx9 rx9Var = (rx9) obj;
        return this.a == rx9Var.a && this.b == rx9Var.b && this.c == rx9Var.c && this.d == rx9Var.d && this.e == rx9Var.e && this.f == rx9Var.f && cqk.d(this.g, rx9Var.g) && this.h == rx9Var.h && this.i == rx9Var.i && this.j == rx9Var.j && this.k == rx9Var.k && this.l == rx9Var.l && this.m == rx9Var.m;
    }

    @Override // defpackage.tx9
    public final int f() {
        return this.e;
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
        int iN = nbh.n(zo5.c(this.e, zo5.c(this.d, zo5.c(this.c, zo5.c(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31, this.f);
        String str = this.g;
        return Boolean.hashCode(this.m) + nbh.n(nbh.n(nbh.n(nbh.n(nbh.n((iN + (str == null ? 0 : str.hashCode())) * 31, 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
    }

    @Override // defpackage.tx9
    public final boolean i() {
        return this.f;
    }

    @Override // defpackage.tx9
    public final int j() {
        return this.a;
    }

    @Override // defpackage.tx9
    public final boolean k() {
        return this.h;
    }

    @Override // defpackage.tx9
    public final boolean l() {
        return this.i;
    }

    @Override // defpackage.tx9
    public final boolean m() {
        return this.l;
    }

    @Override // defpackage.tx9
    public final boolean n() {
        return this.j;
    }

    @Override // defpackage.tx9
    public final boolean o() {
        return this.k;
    }

    @Override // defpackage.tx9
    public final boolean p() {
        return this.m;
    }

    public final String toString() {
        StringBuilder sbP = qv1.p("ForceH264(requestedWidth=", this.a, ", requestedHeight=", this.b, ", requestedBitrate=");
        qt4.x(this.c, this.d, ", requestedMaxEncoderFrames=", ", requestedFrameRate=", sbP);
        sbP.append(this.e);
        sbP.append(", requestedPortraitEncoding=");
        sbP.append(this.f);
        sbP.append(", requestedAudioMimeType=");
        sbP.append(this.g);
        sbP.append(", useConstantBitrate=");
        sbP.append(this.h);
        sbP.append(", useConstantBitrateForced=");
        qt4.B(", isHdrAllowed=", ", isHdrToneMappingViaCodecEnabled=", sbP, this.i, this.j);
        qt4.B(", isBFramesDisabled=", ", isPerformanceParametersDisabled=", sbP, this.k, this.l);
        return qt4.r(sbP, this.m, ")");
    }

    public rx9(int i, int i2, int i3, int i4, int i5, boolean z, String str, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = z;
        this.g = str;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = z5;
        this.l = z6;
        this.m = z7;
    }
}
