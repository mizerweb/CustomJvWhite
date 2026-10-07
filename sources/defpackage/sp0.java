package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sp0 extends sf4 {
    public int h;
    public int i;
    public tp0 j;

    public boolean getAllowsGoneWidget() {
        return this.j.s0;
    }

    public int getMargin() {
        return this.j.t0;
    }

    public int getType() {
        return this.h;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.j.s0 = z;
    }

    public void setDpMargin(int i) {
        this.j.t0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.j.t0 = i;
    }

    public void setType(int i) {
        this.h = i;
    }
}
