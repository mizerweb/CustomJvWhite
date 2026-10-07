package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ol9 implements vga {
    public vga[] a;

    @Override // defpackage.vga
    public final i5e a(Class cls) {
        for (vga vgaVar : this.a) {
            if (vgaVar.b(cls)) {
                return vgaVar.a(cls);
            }
        }
        c.i("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // defpackage.vga
    public final boolean b(Class cls) {
        for (vga vgaVar : this.a) {
            if (vgaVar.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
