package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ea9 {
    public long a = -9223372036854775807L;
    public float b = -3.4028235E38f;
    public long c = -9223372036854775807L;

    public final fa9 a() {
        return new fa9(this);
    }

    public final void b(long j) {
        lvb.R(j >= 0 || j == -9223372036854775807L);
        this.c = j;
    }

    public final void c(long j) {
        this.a = j;
    }

    public final void d(float f) {
        lvb.R(f > 0.0f || f == -3.4028235E38f);
        this.b = f;
    }
}
