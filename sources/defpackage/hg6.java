package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class hg6 {
    public final /* synthetic */ int a = 1;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public Object f;

    public hg6() {
        d();
    }

    public void a() {
        boolean z = this.d;
        pic picVar = (pic) this.f;
        this.c = z ? picVar.i() : picVar.m();
    }

    public void b(View view, int i) {
        pic picVar = (pic) this.f;
        int iN = Integer.MIN_VALUE == picVar.a ? 0 : picVar.n() - picVar.a;
        if (iN >= 0) {
            boolean z = this.d;
            pic picVar2 = (pic) this.f;
            if (z) {
                int iD = picVar2.d(view);
                pic picVar3 = (pic) this.f;
                this.c = (Integer.MIN_VALUE != picVar3.a ? picVar3.n() - picVar3.a : 0) + iD;
            } else {
                this.c = picVar2.g(view);
            }
            this.b = i;
            return;
        }
        this.b = i;
        boolean z2 = this.d;
        pic picVar4 = (pic) this.f;
        if (!z2) {
            int iG = picVar4.g(view);
            int iM = iG - ((pic) this.f).m();
            this.c = iG;
            if (iM > 0) {
                int i2 = (((pic) this.f).i() - Math.min(0, (((pic) this.f).i() - iN) - ((pic) this.f).d(view))) - (((pic) this.f).e(view) + iG);
                if (i2 < 0) {
                    this.c -= Math.min(iM, -i2);
                    return;
                }
                return;
            }
            return;
        }
        int i3 = (picVar4.i() - iN) - ((pic) this.f).d(view);
        this.c = ((pic) this.f).i() - i3;
        if (i3 > 0) {
            int iE = this.c - ((pic) this.f).e(view);
            int iM2 = ((pic) this.f).m();
            int iMin = iE - (Math.min(((pic) this.f).g(view) - iM2, 0) + iM2);
            if (iMin < 0) {
                this.c = Math.min(i3, -iMin) + this.c;
            }
        }
    }

    public void c(int i) {
        this.d |= i > 0;
        this.b += i;
    }

    public void d() {
        this.b = -1;
        this.c = Integer.MIN_VALUE;
        this.d = false;
        this.e = false;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
                sb.append(this.b);
                sb.append(", mCoordinate=");
                sb.append(this.c);
                sb.append(", mLayoutFromEnd=");
                sb.append(this.d);
                sb.append(", mValid=");
                return c0a.p(sb, this.e, '}');
            default:
                return super.toString();
        }
    }

    public hg6(r2d r2dVar) {
        this.f = r2dVar;
    }
}
