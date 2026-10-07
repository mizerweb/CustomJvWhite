package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class cq7 extends hq7 {
    public final int b;
    public final boolean c;

    public cq7(int i, boolean z) {
        super("GRAPH_ERROR");
        this.b = i;
        this.c = z;
    }

    @Override // defpackage.hq7
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("(cameraError=");
        sb.append((Object) ne2.a(this.b));
        sb.append(", willAttemptRetry=");
        return c0a.p(sb, this.c, ')');
    }
}
