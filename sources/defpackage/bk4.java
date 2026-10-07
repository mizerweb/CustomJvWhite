package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class bk4 extends zq0 {
    public final int b;
    public final int c;
    public final int d;
    public final List e;

    public bk4(long j, int i, int i2, int i3, List list) {
        super(j);
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = list;
    }

    @Override // defpackage.zq0
    public final String toString() {
        return "ContactListEvent{status=" + qv1.z(this.b) + ", from=" + this.c + ", count=" + this.d + ", contactIds=" + this.e + '}';
    }
}
