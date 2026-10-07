package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qq7 {
    public final String a = qq7.class.getName();
    public final ny8 b;
    public boolean c;
    public y8j d;
    public nee e;
    public pq7 f;
    public y8j g;
    public nee h;
    public pq7 i;
    public vq7 j;

    public qq7(ny8 ny8Var) {
        this.b = ny8Var;
    }

    public final void a() {
        y8j y8jVar;
        y8j y8jVar2;
        if (this.c) {
            this.c = false;
            this.e = null;
            this.h = null;
            pq7 pq7Var = this.i;
            if (pq7Var != null && (y8jVar2 = this.g) != null) {
                y8jVar2.j(pq7Var);
            }
            this.i = null;
            pq7 pq7Var2 = this.f;
            if (pq7Var2 != null && (y8jVar = this.d) != null) {
                y8jVar.j(pq7Var2);
            }
            this.i = null;
        }
    }

    public final int b() {
        nee neeVar = this.e;
        int iIntValue = 0;
        int iL = neeVar != null ? neeVar.l() : 0;
        nee neeVar2 = this.h;
        int iL2 = ((neeVar2 != null ? neeVar2.l() : 0) + iL) - 1;
        if (iL2 >= iL) {
            iL = iL2;
        }
        if (iL <= 0) {
            return 0;
        }
        y8j y8jVar = this.d;
        Integer numValueOf = y8jVar != null ? Integer.valueOf(y8jVar.getCurrentItem()) : null;
        y8j y8jVar2 = this.g;
        int currentItem = y8jVar2 != null ? y8jVar2.getCurrentItem() : 0;
        if (numValueOf == null) {
            iIntValue = currentItem;
        } else if (numValueOf.intValue() != 0) {
            iIntValue = numValueOf.intValue() + currentItem;
        }
        return Math.min(iIntValue, iL);
    }

    public final wo6 c() {
        return (wo6) this.b.getValue();
    }

    public final void d(y8j y8jVar) {
        nee adapter = y8jVar != null ? y8jVar.getAdapter() : null;
        if (adapter != null) {
            adapter.C(new aj3(1, this));
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("Attached before view pager has an adapter");
            gm0.r(this.a, "Attached before view pager has an adapter", illegalStateException);
            throw illegalStateException;
        }
    }

    public final void e() {
        je9 je9Var = je9.f;
        boolean zA = ((f5d) c()).a();
        nee neeVar = this.h;
        int iMin = 0;
        if (!zA) {
            if (neeVar == null) {
                gm0.Y(this.a, "Early return in updatePagesNumber cuz of opponentsAdapter is null");
                return;
            }
            try {
                int iL = neeVar.l();
                if (iL != 0) {
                    y8j y8jVar = this.g;
                    iMin = Math.min(y8jVar != null ? y8jVar.getCurrentItem() : 0, iL - 1);
                }
                vq7 vq7Var = this.j;
                if (vq7Var != null) {
                    vq7Var.d(iL, iMin);
                    return;
                }
                return;
            } catch (IllegalArgumentException e) {
                String str = this.a;
                a4c a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, qv1.k("updatePagesNumber error: ", e.getMessage()), e);
                    return;
                }
                return;
            }
        }
        if (neeVar == null) {
            gm0.Y(this.a, "Early return in updatePagesNumber cuz of opponentsAdapter is null");
            return;
        }
        nee neeVar2 = this.e;
        if (neeVar2 == null) {
            gm0.Y(this.a, "Early return in updatePagesNumber cuz of rootAdapter is null");
            return;
        }
        try {
            int iL2 = (neeVar.l() + neeVar2.l()) - 1;
            int iL3 = neeVar2.l();
            if (iL2 < iL3) {
                iL2 = iL3;
            }
            int iB = b();
            vq7 vq7Var2 = this.j;
            if (vq7Var2 != null) {
                if (iL2 <= 0) {
                    iMin = 8;
                }
                vq7Var2.setVisibility(iMin);
                vq7Var2.d(iL2, iB);
            }
        } catch (IllegalArgumentException e2) {
            String str2 = this.a;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str2, qv1.k("updatePagesNumber error: ", e2.getMessage()), e2);
            }
        }
    }
}
