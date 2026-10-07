package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tif {
    public final int a;
    public final Integer b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;

    public tif(int i, Integer num, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i3, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        this.a = i;
        this.b = num;
        this.c = i2;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = z6;
        this.j = i3;
        this.k = z7;
        this.l = z8;
        this.m = z9;
        this.n = z10;
        this.o = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tif)) {
            return false;
        }
        tif tifVar = (tif) obj;
        return this.a == tifVar.a && cqk.d(this.b, tifVar.b) && this.c == tifVar.c && this.d == tifVar.d && this.e == tifVar.e && this.f == tifVar.f && this.g == tifVar.g && this.h == tifVar.h && this.i == tifVar.i && this.j == tifVar.j && this.k == tifVar.k && this.l == tifVar.l && this.m == tifVar.m && this.n == tifVar.n && this.o == tifVar.o;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        return Boolean.hashCode(this.o) + pwe.b(pwe.b(pwe.b(pwe.b(spc.a(this.j, pwe.b(spc.a(2, pwe.b(pwe.b(pwe.b(pwe.b(pwe.b(spc.a(this.c, (iHashCode + (num == null ? 0 : num.hashCode())) * 31), this.d), this.e), this.f), this.g), this.h)), this.i)), this.k), this.l), this.m), this.n);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServerCallCapabilities(maxH264Decoders=");
        sb.append(this.a);
        sb.append(", estimatedPerfIndex=");
        sb.append(this.b);
        sb.append(", producerCommandDataChannelVersion=");
        sb.append(this.c);
        sb.append(", isConsumerUpdateEnabled=");
        sb.append(this.d);
        sb.append(", isOnDemandTracksEnabled=");
        qt4.B(", isDataChannelScreenShareRecvEnabled=", ", isDataChannelScreenShareSendEnabled=", sb, this.e, this.f);
        qt4.B(", isAnimojiDataChannelEnabled=", ", animojiDataChannelVersion=2, isAnimojiBackendRenderEnabled=", sb, this.g, this.h);
        sb.append(this.i);
        sb.append(", videoTracksCount=");
        sb.append(this.j);
        sb.append(", isAsrOnlineEnabled=");
        qt4.B(", isFastScreenCaptureEnabled=", ", isDeviceAudioShareEnabled=", sb, this.k, this.l);
        qt4.B(", isSimulcastEnabled=", ", isTransparentAudioEnabled=", sb, this.m, this.n);
        return qt4.r(sb, this.o, ")");
    }
}
