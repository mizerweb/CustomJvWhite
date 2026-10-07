package defpackage;

import android.view.WindowInsetsAnimation;

/* JADX INFO: loaded from: classes2.dex */
public final class qwj extends rwj {
    public final WindowInsetsAnimation e;

    public qwj(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.e = windowInsetsAnimation;
    }

    @Override // defpackage.rwj
    public final long a() {
        return this.e.getDurationMillis();
    }

    @Override // defpackage.rwj
    public final float b() {
        return this.e.getInterpolatedFraction();
    }

    @Override // defpackage.rwj
    public final int c() {
        return this.e.getTypeMask();
    }

    @Override // defpackage.rwj
    public final void d(float f) {
        this.e.setFraction(f);
    }
}
