package defpackage;

import android.window.BackEvent;

/* JADX INFO: loaded from: classes2.dex */
public final class sl0 {
    public final float a;
    public final float b;
    public final float c;
    public final int d;

    public sl0(BackEvent backEvent) {
        ko koVar = ko.a;
        float fD = koVar.d(backEvent);
        float fE = koVar.e(backEvent);
        float fB = koVar.b(backEvent);
        int iC = koVar.c(backEvent);
        this.a = fD;
        this.b = fE;
        this.c = fB;
        this.d = iC;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackEventCompat{touchX=");
        sb.append(this.a);
        sb.append(", touchY=");
        sb.append(this.b);
        sb.append(", progress=");
        sb.append(this.c);
        sb.append(", swipeEdge=");
        return qt4.p(sb, this.d, '}');
    }
}
