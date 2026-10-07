package defpackage;

/* JADX INFO: loaded from: classes.dex */
@mif
public final class cfc {
    public static final bfc Companion = new bfc();
    public final int a;
    public final int b;
    public final int c;

    public /* synthetic */ cfc(int i, int i2, int i3, int i4) {
        if ((i & 1) == 0) {
            this.a = 0;
        } else {
            this.a = i2;
        }
        if ((i & 2) == 0) {
            this.b = 4;
        } else {
            this.b = i3;
        }
        if ((i & 4) == 0) {
            this.c = 0;
        } else {
            this.c = i4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfc)) {
            return false;
        }
        cfc cfcVar = (cfc) obj;
        return this.a == cfcVar.a && this.b == cfcVar.b && this.c == cfcVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + zo5.c(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return zo5.t(qv1.p("OneVideoUploaderConfig(videoUploaderVersion=", this.a, ", videoUploaderConnectionsCount=", this.b, ", audioUploaderVersion="), this.c, ")");
    }

    public cfc() {
        this.a = 0;
        this.b = 4;
        this.c = 0;
    }
}
