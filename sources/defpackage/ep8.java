package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ep8 {
    public boolean a;
    public int b;

    public final void a(int i) {
        if (!this.a) {
            this.a = true;
            this.b = i;
        } else {
            if (this.b == i) {
                return;
            }
            StringBuilder sbY = zo5.y(i, "Given job ID ", " is different than previous ");
            sbY.append(this.b);
            throw new IllegalArgumentException(sbY.toString());
        }
    }
}
