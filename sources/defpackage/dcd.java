package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class dcd extends c4m {
    public int a;
    public final /* synthetic */ ecd b;

    public dcd(ecd ecdVar) {
        this.b = ecdVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    @Override // defpackage.c4m
    public final int b(View view, int i) {
        int iD;
        Integer numValueOf;
        int iA;
        ecd ecdVar = this.b;
        Integer numValueOf2 = null;
        if (ecdVar.getStackFromBottom()) {
            xbd callback = ecdVar.getCallback();
            if (callback != null) {
                iD = callback.a();
                numValueOf = Integer.valueOf(iD);
            } else {
                numValueOf = null;
            }
        } else {
            xbd callback2 = ecdVar.getCallback();
            if (callback2 != null) {
                iD = callback2.d();
                numValueOf = Integer.valueOf(iD);
            } else {
                numValueOf = null;
            }
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        boolean stackFromBottom = ecdVar.getStackFromBottom();
        xbd callback3 = ecdVar.getCallback();
        if (stackFromBottom) {
            if (callback3 != null) {
                iA = callback3.d();
                numValueOf2 = Integer.valueOf(iA);
            }
        } else if (callback3 != null) {
            iA = callback3.a();
            numValueOf2 = Integer.valueOf(iA);
        }
        return oc9.v(i, iIntValue, numValueOf2 != null ? numValueOf2.intValue() : 0);
    }

    @Override // defpackage.c4m
    public final int d(int i) {
        Object poeVar;
        View viewE;
        ecd ecdVar = this.b;
        try {
            xbd callback = ecdVar.getCallback();
            poeVar = (callback == null || (viewE = callback.e()) == null) ? null : Integer.valueOf(ecdVar.indexOfChild(viewE));
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            gm0.V("PopupLayout", "getOrderedChildIndex fail, issue ONEME-9645", new zbd(thA));
        }
        Integer num = (Integer) (poeVar instanceof poe ? null : poeVar);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // defpackage.c4m
    public final int f(View view) {
        return view.getHeight();
    }

    @Override // defpackage.c4m
    public final void i(View view, int i, int i2) {
        ecd ecdVar = this.b;
        ecdVar.getHalfExpandedViewHelper().a(i2);
        xbd callback = ecdVar.getCallback();
        if (callback == null) {
            return;
        }
        if (ecdVar.f.a == 2 && ecdVar.getScrollState() == ccd.a) {
            int iD = callback.d();
            ecdVar.setBackgroundAlpha(1.0f - Math.abs(tqk.b(this.a, iD, i2)));
            if (ecdVar.getStackFromBottom() && i2 >= iD) {
                callback.h();
            }
            if (!ecdVar.getStackFromBottom() && i2 <= iD) {
                callback.h();
            }
        }
        callback.m(i2);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    /* JADX WARN: Code duplicated, block: B:24:0x005c  */
    @Override // defpackage.c4m
    public final void j(View view, float f, float f2) {
        this.a = view.getTop();
        ecd ecdVar = this.b;
        xbd callback = ecdVar.getCallback();
        if (callback == null) {
            return;
        }
        double d = f2;
        double dAbs = Math.abs(d);
        ccd scrollState = ccd.c;
        ccd ccdVar = ccd.b;
        ccd ccdVar2 = ccd.a;
        if (dAbs <= 200.0d) {
            boolean stackFromBottom = ecdVar.getStackFromBottom();
            int i = this.a;
            if (stackFromBottom) {
                if (i >= callback.b() / 2) {
                    if (this.a > ((callback.d() - callback.b()) / 2) + callback.b()) {
                        scrollState = ccdVar2;
                    } else {
                        scrollState = ccdVar;
                    }
                }
            } else if (i <= callback.b() / 2) {
                if (this.a < ((callback.d() - callback.b()) / 2) + callback.b()) {
                    scrollState = ccdVar2;
                } else {
                    scrollState = ccdVar;
                }
            }
        } else if (Math.abs(d) < 8000.0d) {
            int i2 = ybd.$EnumSwitchMapping$0[0];
            if (i2 == 1) {
                boolean stackFromBottom2 = ecdVar.getStackFromBottom();
                int i3 = this.a;
                if (stackFromBottom2) {
                    if (i3 < callback.b()) {
                        if (f2 > 0.0f) {
                        }
                    } else if (f2 > 0.0f) {
                        scrollState = ccdVar2;
                    }
                    scrollState = ccdVar;
                } else {
                    if (i3 > callback.b()) {
                        if (f2 < 0.0f) {
                        }
                    } else if (f2 < 0.0f) {
                        scrollState = ccdVar2;
                    }
                    scrollState = ccdVar;
                }
            } else {
                if (i2 != 2) {
                    ore.o();
                    return;
                }
                scrollState = ecdVar.getScrollState();
            }
        } else if (!ecdVar.getStackFromBottom() ? f2 < 0.0f : f2 > 0.0f) {
            scrollState = ccdVar2;
        }
        ecdVar.setScrollState(callback.f(ecdVar.getScrollState(), scrollState));
        if (this.a == ecdVar.getScrollStateOffset() && ecdVar.getScrollState() == ccdVar2) {
            callback.h();
            ecdVar.setBackgroundAlpha(0.0f);
        } else {
            ecdVar.f.o(view.getLeft(), ecdVar.getScrollStateOffset());
            callback.l(ecdVar.getScrollState());
            ecdVar.invalidate();
        }
    }

    @Override // defpackage.c4m
    public final boolean k(View view, int i) {
        ecd ecdVar = this.b;
        xbd callback = ecdVar.getCallback();
        return view == (callback != null ? callback.e() : null) && ecdVar.d;
    }
}
