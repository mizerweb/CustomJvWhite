package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cj5 extends lvb {
    @Override // defpackage.lvb
    public final void C0(Object obj, float f) {
        dj5 dj5Var = (dj5) obj;
        dj5Var.o.b = f / 10000.0f;
        dj5Var.invalidateSelf();
    }

    @Override // defpackage.lvb
    public final float q0(Object obj) {
        return ((dj5) obj).o.b * 10000.0f;
    }
}
