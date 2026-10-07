package defpackage;

import android.R;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.sdk.fresco.FrescoHttpDownloadException;

/* JADX INFO: loaded from: classes2.dex */
public final class mkc implements xcb, fr0 {
    public boolean a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public mkc(jo7 jo7Var, fo foVar, jp jpVar) {
        this.f = jo7Var;
        this.d = null;
        this.e = null;
        this.a = false;
        this.b = foVar;
        this.c = jpVar;
    }

    @Override // defpackage.xcb
    public void a() {
        ((qg7) this.c).a();
    }

    @Override // defpackage.fr0
    public void b(le4 le4Var) {
        ((jo7) this.f).m.post(new ruh(this, le4Var, false, 4));
    }

    @Override // defpackage.xcb
    public void c(InputStream inputStream, int i) {
        boolean z = ((AtomicBoolean) this.b).get();
        qg7 qg7Var = (qg7) this.c;
        if (z) {
            qg7Var.a();
        } else {
            qg7Var.c(inputStream, i);
        }
    }

    public boolean d(MotionEvent motionEvent) {
        hq9 hq9Var = (hq9) this.b;
        if (this.a) {
            d0d d0dVar = (d0d) this.e;
            if (d0dVar != null) {
                ViewParent parent = hq9Var.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                d0dVar.a(motionEvent);
                if (motionEvent.getActionMasked() == 3) {
                    e(true);
                }
                return true;
            }
            if (motionEvent.getActionMasked() == 5 && motionEvent.getPointerCount() >= 2) {
                View viewFindViewById = hq9Var.getRootView().findViewById(R.id.content);
                bne bneVar = null;
                ViewGroup viewGroup = viewFindViewById instanceof ViewGroup ? (ViewGroup) viewFindViewById : null;
                if (viewGroup != null) {
                    d0d d0dVar2 = new d0d(viewGroup.getContext(), hq9Var.getImageAttach(), (float[]) ((af7) this.d).invoke());
                    d0dVar2.p = new iua(25, this);
                    this.e = d0dVar2;
                    this.f = viewGroup;
                    ViewParent parent2 = hq9Var.getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    hq9Var.setVisibility(8);
                    viewGroup.addView(d0dVar2, -1, -1);
                    ViewGroup viewGroup2 = (ViewGroup) this.c;
                    int width = viewGroup.getWidth();
                    int height = viewGroup.getHeight();
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    int[] iArr3 = new int[2];
                    hq9Var.getLocationOnScreen(iArr);
                    viewGroup2.getLocationOnScreen(iArr2);
                    d0dVar2.getLocationOnScreen(iArr3);
                    int i = iArr[0];
                    int i2 = iArr3[0];
                    d0dVar2.l = i - i2;
                    int i3 = iArr[1];
                    int i4 = iArr3[1];
                    d0dVar2.m = i3 - i4;
                    d0dVar2.n = iArr2[0] - i2;
                    d0dVar2.o = iArr2[1] - i4;
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(hq9Var.getWidth(), hq9Var.getHeight());
                    t58 t58Var = d0dVar2.b;
                    d0dVar2.addView(t58Var, layoutParams);
                    t58Var.setTranslationX(d0dVar2.l);
                    t58Var.setTranslationY(d0dVar2.m);
                    t58Var.setVisibility(0);
                    int width2 = hq9Var.getWidth();
                    int height2 = hq9Var.getHeight();
                    g58 g58Var = d0dVar2.a;
                    t58Var.setImageAttach(g58Var);
                    if (!t58Var.isLaidOut() || t58Var.isLayoutRequested()) {
                        t58Var.addOnLayoutChangeListener(new r58(t58Var, g58Var, width, height, width2, height2));
                    } else {
                        bne bneVar2 = (height <= 0 || width <= 0) ? null : new bne(width, height, Math.max(Math.max(width, height), 2048.0f), 8);
                        if (height2 > 0 && width2 > 0) {
                            bneVar = new bne(width2, height2, Math.max(Math.max(width2, height2), 2048.0f), 8);
                        }
                        t58Var.p(g58Var, true, bneVar2, bneVar, false);
                    }
                    d0dVar2.a(motionEvent);
                    return true;
                }
            }
        }
        return false;
    }

    public void e(boolean z) {
        d0d d0dVar = (d0d) this.e;
        if (d0dVar == null) {
            return;
        }
        this.e = null;
        ViewGroup viewGroup = (ViewGroup) this.f;
        this.f = null;
        if (z) {
            d0dVar.b.animate().cancel();
        }
        if (viewGroup != null) {
            viewGroup.post(new d86(d0dVar, viewGroup, this, 21));
        }
    }

    public void f(le4 le4Var) {
        skk skkVar = (skk) ((jo7) this.f).j.get((jp) this.c);
        if (skkVar != null) {
            skkVar.m(le4Var);
        }
    }

    @Override // defpackage.xcb
    public void onFailure(Throwable th) {
        je9 je9Var = je9.d;
        if (((AtomicBoolean) this.b).get()) {
            ((qg7) this.c).a();
            return;
        }
        if (!this.a || !(th instanceof FrescoHttpDownloadException) || ((FrescoHttpDownloadException) th).a != 410) {
            String str = ((gge) this.d).p;
            q78 q78Var = (q78) this.f;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var2 = je9.f;
                if (a4cVar.b(je9Var2)) {
                    a4cVar.c(je9Var2, str, "Fetch refreshed url failed photoId=" + q78Var.c + ": " + th, null);
                }
            }
            ((qg7) this.c).onFailure(th);
            return;
        }
        String str2 = ((gge) this.d).p;
        q78 q78Var2 = (q78) this.f;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, str2, nbh.s(q78Var2.c, "Refresh after expire (photoId=", ")."), null);
        }
        boolean z = ((AtomicBoolean) this.b).get();
        gge ggeVar = (gge) this.d;
        if (!z) {
            ggeVar.y0((usb) this.e, (qg7) this.c, false);
            return;
        }
        String str3 = ggeVar.p;
        q78 q78Var3 = (q78) this.f;
        a4c a4cVar3 = gm0.f;
        if (a4cVar3 != null && a4cVar3.b(je9Var)) {
            a4cVar3.c(je9Var, str3, nbh.s(q78Var3.c, "Refresh onCancellation for (photoId=", ")."), null);
        }
        ((qg7) this.c).a();
    }

    public mkc(hq9 hq9Var, ViewGroup viewGroup, boolean z, af7 af7Var) {
        this.b = hq9Var;
        this.c = viewGroup;
        this.a = z;
        this.d = af7Var;
    }

    public mkc(AtomicBoolean atomicBoolean, qg7 qg7Var, boolean z, gge ggeVar, usb usbVar, q78 q78Var) {
        this.b = atomicBoolean;
        this.c = qg7Var;
        this.a = z;
        this.d = ggeVar;
        this.e = usbVar;
        this.f = q78Var;
    }
}
