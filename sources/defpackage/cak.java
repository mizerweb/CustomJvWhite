package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cak {
    public final String a;
    public final long b;
    public long c = 200;
    public long d;

    public cak(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Command{seq:");
        sb.append(this.b);
        sb.append("|retry count:");
        sb.append(this.d);
        sb.append("|retry timeout:");
        sb.append(this.c);
        sb.append('|');
        return x05.i(sb, this.a, '}');
    }
}
