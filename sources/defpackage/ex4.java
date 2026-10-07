package defpackage;

import android.graphics.drawable.Animatable;
import android.os.Handler;
import android.os.Looper;
import one.me.mediapicker.crop.CropPhotoScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class ex4 extends oq0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ex4(int i, Object obj) {
        this.b = i;
        this.c = obj;
    }

    @Override // defpackage.oq0, defpackage.mr4
    public void b(String str, Throwable th) {
        switch (this.b) {
            case 1:
                gm0.Y(((tvb) this.c).c, "Failed to load image. ID: " + str + ". Exception: " + th);
                break;
            case 2:
                l1c l1cVar = (l1c) this.c;
                gm0.Y(l1cVar.j, "Failed to load image. ID: " + str + ". Exception: " + th);
                if (!Looper.getMainLooper().isCurrentThread()) {
                    Handler handler = l1cVar.getHandler();
                    if (handler == null) {
                        l1cVar.post(new j1c(l1cVar, 1));
                    } else {
                        handler.postAtFrontOfQueue(new j1c(l1cVar, 0));
                    }
                } else {
                    l1cVar.requestLayout();
                    l1cVar.invalidate();
                }
                break;
            case 3:
                kzi kziVar = ((vki) this.c).g;
                if (kziVar != null) {
                    qn qnVar = (qn) kziVar.a;
                    String str2 = qnVar.f;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.f;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str2, nbh.s(qnVar.a, "#", " fail to load static image"), th);
                        }
                    }
                    ((qn) kziVar.a).o(mn.a);
                    ((vki) kziVar.b).g = null;
                }
                break;
            case 4:
                n7j.p((z1k) this.c, new v1k(this, 2, th));
                break;
        }
    }

    @Override // defpackage.oq0, defpackage.mr4
    public void c(String str) {
        switch (this.b) {
            case 4:
                z1k z1kVar = (z1k) this.c;
                n7j.p(z1kVar, new w1k(z1kVar, 1));
                break;
        }
    }

    @Override // defpackage.oq0, defpackage.mr4
    public final void e(String str, Object obj, Animatable animatable) {
        switch (this.b) {
            case 0:
                l68 l68Var = (l68) obj;
                if (l68Var != null) {
                    CropPhotoScreen cropPhotoScreen = (CropPhotoScreen) this.c;
                    zv8[] zv8VarArr = CropPhotoScreen.p;
                    rx4 rx4VarV1 = cropPhotoScreen.v1();
                    int width = l68Var.getWidth();
                    int height = l68Var.getHeight();
                    rx4VarV1.getClass();
                    rx4VarV1.k = qx6.a(width, height);
                }
                break;
            case 1:
                ((tvb) this.c).invalidateSelf();
                break;
            case 2:
                l68 l68Var2 = (l68) obj;
                l1c l1cVar = (l1c) this.c;
                if (!Looper.getMainLooper().isCurrentThread()) {
                    Handler handler = l1cVar.getHandler();
                    if (handler == null) {
                        l1cVar.post(new k1c(l1cVar, str, l68Var2, animatable, 1));
                    } else {
                        handler.postAtFrontOfQueue(new k1c(l1cVar, str, l68Var2, animatable, 0));
                    }
                } else {
                    l1cVar.k(l68Var2, animatable);
                    l1cVar.requestLayout();
                    l1cVar.invalidate();
                }
                break;
            case 3:
                vki vkiVar = (vki) this.c;
                ski skiVar = vkiVar.r;
                Handler handler2 = vkiVar.f;
                kzi kziVar = vkiVar.g;
                if (kziVar != null) {
                    ((qn) kziVar.a).o(mn.c);
                    ((vki) kziVar.b).g = null;
                }
                handler2.removeCallbacks(skiVar);
                if (!cqk.d(Looper.myLooper(), Looper.getMainLooper())) {
                    handler2.postAtFrontOfQueue(skiVar);
                } else {
                    skiVar.run();
                }
                break;
            default:
                n7j.p((z1k) this.c, new v1k(this, 1, obj));
                break;
        }
    }

    @Override // defpackage.oq0, defpackage.mr4
    public void onIntermediateImageSet(String str, Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 1:
                ((tvb) obj2).invalidateSelf();
                break;
            case 2:
                l1c l1cVar = (l1c) obj2;
                if (!Looper.getMainLooper().isCurrentThread()) {
                    Handler handler = l1cVar.getHandler();
                    if (handler == null) {
                        l1cVar.post(new j1c(l1cVar, 3));
                    } else {
                        handler.postAtFrontOfQueue(new j1c(l1cVar, 2));
                    }
                } else {
                    l1cVar.requestLayout();
                    l1cVar.invalidate();
                }
                break;
            case 4:
                z1k z1kVar = (z1k) obj2;
                Runnable runnable = z1kVar.o;
                z1kVar.removeCallbacks(runnable);
                n7j.p(z1kVar, runnable);
                break;
        }
    }
}
