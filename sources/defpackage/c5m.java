package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class c5m {
    public final ytl a;
    public final boolean b;
    public final boolean c;
    public final u0b d;
    public final tul e;
    public final int f;

    public c5m(ytl ytlVar, boolean z, boolean z2, u0b u0bVar, tul tulVar, int i) {
        this.a = ytlVar;
        this.b = z;
        this.c = z2;
        this.d = u0bVar;
        this.e = tulVar;
        this.f = i;
    }

    public static z4m a() {
        z4m z4mVar = new z4m();
        z4mVar.b = false;
        byte b = (byte) (z4mVar.g | 1);
        z4mVar.c = false;
        byte b2 = (byte) (b | 2);
        z4mVar.g = b2;
        u0b u0bVar = u0b.UNKNOWN;
        if (u0bVar == null) {
            ore.n("Null modelType");
            return null;
        }
        z4mVar.d = u0bVar;
        z4mVar.a = ytl.NO_ERROR;
        z4mVar.e = tul.UNKNOWN_STATUS;
        z4mVar.f = 0;
        z4mVar.g = (byte) (b2 | 4);
        return z4mVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c5m)) {
            return false;
        }
        c5m c5mVar = (c5m) obj;
        return this.a.equals(c5mVar.a) && this.b == c5mVar.b && this.c == c5mVar.c && this.d.equals(c5mVar.d) && this.e.equals(c5mVar.e) && this.f == c5mVar.f;
    }

    public final int hashCode() {
        return this.f ^ ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ 2483) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003);
    }

    public final String toString() {
        String string = this.a.toString();
        String string2 = this.d.toString();
        String string3 = this.e.toString();
        StringBuilder sbV = qt4.v("RemoteModelLoggingOptions{errorCode=", string, ", tfliteSchemaVersion=NA, shouldLogRoughDownloadTime=");
        sbV.append(this.b);
        sbV.append(", shouldLogExactDownloadTime=");
        sbV.append(this.c);
        sbV.append(", modelType=");
        sbV.append(string2);
        sbV.append(", downloadStatus=");
        sbV.append(string3);
        sbV.append(", failureStatusCode=");
        return zo5.t(sbV, this.f, "}");
    }
}
