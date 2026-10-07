package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class xyc {
    public final long a;
    public final int b;
    public final int c;
    public final boolean d;

    public xyc(int i, int i2, long j) {
        this.a = j;
        this.b = i;
        this.c = i2;
        int[] iArr = wyc.$EnumSwitchMapping$0;
        int i3 = iArr[qt4.D(i2)];
        boolean z = true;
        if (i3 != 1 && i3 != 2) {
            z = false;
        }
        this.d = z;
        int i4 = iArr[qt4.D(i2)];
    }
}
