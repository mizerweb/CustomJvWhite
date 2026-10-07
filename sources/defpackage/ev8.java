package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ev8 extends v1 {
    public final ss8 f;
    public final int g;
    public int h;

    public ev8(qs8 qs8Var, ss8 ss8Var) {
        super(qs8Var, null);
        this.f = ss8Var;
        this.g = ss8Var.a.size();
        this.h = -1;
    }

    @Override // defpackage.v1
    public final jt8 F(String str) {
        return (jt8) this.f.a.get(Integer.parseInt(str));
    }

    @Override // defpackage.v1
    public final String R(fif fifVar, int i) {
        return String.valueOf(i);
    }

    @Override // defpackage.v1
    public final jt8 T() {
        return this.f;
    }

    @Override // defpackage.v74
    public final int v(fif fifVar) {
        int i = this.h;
        if (i >= this.g - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.h = i2;
        return i2;
    }
}
