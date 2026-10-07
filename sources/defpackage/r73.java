package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class r73 extends zq0 {
    public final String b;
    public final List c;
    public final long d;
    public final int e;
    public final String f;

    public r73(long j, String str, List list, long j2, int i, String str2) {
        super(j);
        this.b = str;
        this.c = list;
        this.d = j2;
        this.e = i;
        this.f = str2;
    }

    @Override // defpackage.zq0
    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatMessageSearchResultEvent{query='");
        sb.append(this.b);
        sb.append("', results=");
        sb.append(this.c);
        sb.append(", marker=");
        sb.append(this.d);
        sb.append(", total=");
        return qt4.p(sb, this.e, '}');
    }
}
