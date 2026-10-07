package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pb5 {
    public lfe a;
    public lfe b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public pb5(lfe lfeVar, lfe lfeVar2, int i, int i2, int i3, int i4) {
        this.a = lfeVar;
        this.b = lfeVar2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChangeInfo{oldHolder=");
        sb.append(this.a);
        sb.append(", newHolder=");
        sb.append(this.b);
        sb.append(", fromX=");
        sb.append(this.c);
        sb.append(", fromY=");
        sb.append(this.d);
        sb.append(", toX=");
        sb.append(this.e);
        sb.append(", toY=");
        return qt4.p(sb, this.f, '}');
    }
}
