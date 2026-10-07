package defpackage;

import android.graphics.PointF;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class fp2 {
    public int a;
    public int b;
    public int c;
    public int d;
    public final View e;
    public int f;
    public int g;

    public fp2(View view) {
        this.e = view;
    }

    public final void a(PointF pointF) {
        this.c = Math.round(pointF.x);
        int iRound = Math.round(pointF.y);
        this.d = iRound;
        int i = this.g + 1;
        this.g = i;
        if (this.f == i) {
            q9j.c(this.e, this.a, this.b, this.c, iRound);
            this.f = 0;
            this.g = 0;
        }
    }

    public final void b(PointF pointF) {
        this.a = Math.round(pointF.x);
        int iRound = Math.round(pointF.y);
        this.b = iRound;
        int i = this.f + 1;
        this.f = i;
        if (i == this.g) {
            q9j.c(this.e, this.a, iRound, this.c, this.d);
            this.f = 0;
            this.g = 0;
        }
    }
}
