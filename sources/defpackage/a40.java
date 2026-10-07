package defpackage;

import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes2.dex */
public final class a40 implements mcg {
    public final /* synthetic */ int a = 1;
    public int b;
    public long c;
    public int d;

    public a40(int i, int i2, long j) {
        this.b = i;
        this.c = j;
        this.d = i2;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("AtomSizeTooSmall{type=");
                int i = this.b;
                String str = vqi.a;
                sb.append(new String(k4m.i(i), StandardCharsets.US_ASCII));
                sb.append(", size=");
                sb.append(this.c);
                sb.append(", minHeaderSize=");
                return zo5.t(sb, this.d, "}");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ a40() {
    }
}
