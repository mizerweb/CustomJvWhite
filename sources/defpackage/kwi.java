package defpackage;

import android.util.Size;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class kwi implements ux9 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final float g;
    public final xc7 h;
    public final ifh i;
    public final ifh j;

    public kwi(String str, String str2, String str3, int i, int i2, int i3, float f, xc7 xc7Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = f;
        this.h = xc7Var;
        final int i4 = 0;
        this.i = new ifh(new af7(this) { // from class: jwi
            public final /* synthetic */ kwi b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i5 = i4;
                kwi kwiVar = this.b;
                switch (i5) {
                    case 0:
                        xc7 xc7Var2 = kwiVar.h;
                        if (xc7Var2 != null) {
                            return xc7Var2;
                        }
                        AtomicInteger atomicInteger = xqi.a;
                        int iMin = Math.min(kwiVar.e, kwiVar.f);
                        y1 y1Var = new y1(0, xc7.m);
                        int i6 = Integer.MAX_VALUE;
                        xc7 xc7Var3 = xc7.c;
                        while (y1Var.hasNext()) {
                            xc7 xc7Var4 = (xc7) y1Var.next();
                            int iAbs = Math.abs(xc7Var4.b - iMin);
                            if (iAbs >= i6) {
                                return xc7Var3;
                            }
                            xc7Var3 = xc7Var4;
                            i6 = iAbs;
                        }
                        return xc7Var3;
                    default:
                        return new Size(kwiVar.e, kwiVar.f);
                }
            }
        });
        final int i5 = 1;
        this.j = new ifh(new af7(this) { // from class: jwi
            public final /* synthetic */ kwi b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i6 = i5;
                kwi kwiVar = this.b;
                switch (i6) {
                    case 0:
                        xc7 xc7Var2 = kwiVar.h;
                        if (xc7Var2 != null) {
                            return xc7Var2;
                        }
                        AtomicInteger atomicInteger = xqi.a;
                        int iMin = Math.min(kwiVar.e, kwiVar.f);
                        y1 y1Var = new y1(0, xc7.m);
                        int i7 = Integer.MAX_VALUE;
                        xc7 xc7Var3 = xc7.c;
                        while (y1Var.hasNext()) {
                            xc7 xc7Var4 = (xc7) y1Var.next();
                            int iAbs = Math.abs(xc7Var4.b - iMin);
                            if (iAbs >= i7) {
                                return xc7Var3;
                            }
                            xc7Var3 = xc7Var4;
                            i7 = iAbs;
                        }
                        return xc7Var3;
                    default:
                        return new Size(kwiVar.e, kwiVar.f);
                }
            }
        });
    }

    @Override // defpackage.ux9
    public final String a() {
        return this.b;
    }

    public final float b() {
        return this.g;
    }

    public final xc7 c() {
        return (xc7) this.i.getValue();
    }

    public final Size d() {
        return (Size) this.j.getValue();
    }

    public final String toString() {
        StringBuilder sbQ = qv1.q("VideoFormat(id: ", this.a, ", sampleMimeType: ", this.b, ", codecs: ");
        sbQ.append(this.c);
        sbQ.append(", bitrate: ");
        sbQ.append(this.d);
        sbQ.append(", width: ");
        qt4.x(this.e, this.f, ", height: ", ", frameRate: ", sbQ);
        sbQ.append(this.g);
        sbQ.append(", serverChooseFrameSize: ");
        sbQ.append(this.h);
        sbQ.append(")");
        return sbQ.toString();
    }
}
