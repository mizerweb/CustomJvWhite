package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mc3 implements pc3 {
    public final int a;
    public final Integer b;
    public final Integer c;

    public /* synthetic */ mc3(int i, Integer num, Integer num2, int i2) {
        this(i, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : num2);
    }

    public mc3(int i, Integer num, Integer num2) {
        this.a = i;
        this.b = num;
        this.c = num2;
    }
}
