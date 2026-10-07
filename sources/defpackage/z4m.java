package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class z4m {
    public ytl a;
    public boolean b;
    public boolean c;
    public u0b d;
    public tul e;
    public int f;
    public byte g;

    public final c5m a() {
        ytl ytlVar;
        u0b u0bVar;
        tul tulVar;
        if (this.g == 7 && (ytlVar = this.a) != null && (u0bVar = this.d) != null && (tulVar = this.e) != null) {
            return new c5m(ytlVar, this.b, this.c, u0bVar, tulVar, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" errorCode");
        }
        if ((this.g & 1) == 0) {
            sb.append(" shouldLogRoughDownloadTime");
        }
        if ((this.g & 2) == 0) {
            sb.append(" shouldLogExactDownloadTime");
        }
        if (this.d == null) {
            sb.append(" modelType");
        }
        if (this.e == null) {
            sb.append(" downloadStatus");
        }
        if ((this.g & 4) == 0) {
            sb.append(" failureStatusCode");
        }
        ore.k("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
