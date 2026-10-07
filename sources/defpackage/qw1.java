package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qw1 {
    public final float a;
    public final float b;
    public final boolean c;

    public qw1(i72 i72Var, float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f3;
        this.c = Math.abs(f - f2) > 0.01f || Math.abs(f3 - f4) > 0.01f;
    }

    public qw1(float f, float f2, boolean z) {
        this.a = f;
        this.b = f2;
        this.c = z;
    }
}
