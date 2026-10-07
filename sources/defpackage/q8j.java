package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class q8j extends t8j {
    public final /* synthetic */ int a;
    public final /* synthetic */ y8j b;

    public /* synthetic */ q8j(y8j y8jVar, int i) {
        this.a = i;
        this.b = y8jVar;
    }

    @Override // defpackage.t8j
    public void h(int i) {
        switch (this.a) {
            case 0:
                if (i == 0) {
                    this.b.k();
                }
                break;
        }
    }

    @Override // defpackage.t8j
    public final void j(int i) {
        int i2 = this.a;
        y8j y8jVar = this.b;
        switch (i2) {
            case 0:
                if (y8jVar.d != i) {
                    y8jVar.d = i;
                    y8jVar.t.U();
                }
                break;
            default:
                y8jVar.clearFocus();
                if (y8jVar.hasFocus()) {
                    y8jVar.j.requestFocus(2);
                }
                break;
        }
    }
}
