package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class z19 extends js0 {
    public int h;
    public int i;
    public boolean j;
    public int k;

    @Override // defpackage.js0
    public final void a() {
        super.a();
        if (this.k < 0) {
            ore.p("Stop indicator size must be >= 0.");
            return;
        }
        if (this.h == 0) {
            if (this.b > 0 && this.g == 0) {
                ore.p("Rounded corners without gap are not supported in contiguous indeterminate animation.");
            } else {
                if (this.c.length >= 3) {
                    return;
                }
                ore.p("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }
}
