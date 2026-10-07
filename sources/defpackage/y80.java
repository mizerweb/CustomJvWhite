package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class y80 implements ux9 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final String g;
    public final String h;

    public y80(String str, String str2, String str3, int i, int i2, int i3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = str4;
        this.h = str5;
    }

    @Override // defpackage.ux9
    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sbQ = qv1.q("AudioFormat(id: ", this.a, ", sampleMimeType: ", this.b, ", codecs: ");
        sbQ.append(this.c);
        sbQ.append(", bitrate: ");
        sbQ.append(this.d);
        sbQ.append(", sampleRate: ");
        qt4.x(this.e, this.f, ", channelCount: ", ", label: ", sbQ);
        return nbh.y(sbQ, this.g, ", language: ", this.h, ")");
    }
}
