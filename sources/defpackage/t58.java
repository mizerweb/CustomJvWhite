package defpackage;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public class t58 extends l1c {
    public static final /* synthetic */ zv8[] A = {new z8b(t58.class, "overlayDrawable", "getOverlayDrawable()Landroid/graphics/drawable/Drawable;"), zo5.e(zfe.a, t58.class, "imageAttach", "getImageAttach()Lone/me/messages/list/loader/model/ImageAttachConfig;"), new z8b(t58.class, "imageInfo", "getImageInfo()Lcom/facebook/imagepipeline/image/ImageInfo;"), new z8b(t58.class, "remoteImageState", "getRemoteImageState()Lone/me/messages/list/ui/view/attach/ImageAttachDraweeView$RemoteImageState;")};
    public static final dea B = new dea();
    public final s58 o;
    public final s58 p;
    public af7 q;
    public final s58 r;
    public boolean s;
    public final s58 t;
    public boolean u;
    public t25 v;
    public int w;
    public int x;
    public final ny8 y;
    public final ny8 z;

    public t58(Context context) {
        super(context);
        this.o = new s58(this, 1);
        this.p = new s58(g58.p, this);
        this.q = new q38(2);
        this.r = new s58(this, 0);
        this.t = new s58(this, 3);
        this.y = rx8.P(3, new n52(context, 11));
        this.z = rx8.P(3, new mp5(23, this));
        setId(R.id.messages_list_item_single_image);
        wj6 wj6Var = ((wj7) getHierarchy()).e;
        wj6Var.l = 0;
        if (wj6Var.k == 1) {
            wj6Var.k = 0;
        }
    }

    public final o2d getDownloadDrawable() {
        return (o2d) this.y.getValue();
    }

    private final l58 getRemoteImageState() {
        zv8 zv8Var = A[3];
        return (l58) this.t.b;
    }

    public static /* synthetic */ void q(t58 t58Var, g58 g58Var, int i) {
        t58Var.p(g58Var, (i & 2) == 0, null, null, true);
    }

    public final void setRemoteImageState(l58 l58Var) {
        this.t.B(this, A[3], l58Var);
    }

    @Override // defpackage.fu5
    public final void c() {
        super.c();
        t25 t25Var = this.v;
        if (t25Var != null) {
            t25Var.close();
        }
        this.v = null;
    }

    public final g58 getImageAttach() {
        zv8 zv8Var = A[1];
        return (g58) this.p.b;
    }

    public final l68 getImageInfo() {
        zv8 zv8Var = A[2];
        return (l68) this.r.b;
    }

    public final int getMeasuredLayoutHeight() {
        return this.w;
    }

    public final int getMeasuredLayoutWidth() {
        return this.x;
    }

    public final af7 getOnFinalImageSetCallback() {
        return this.q;
    }

    public final Drawable getOverlayDrawable() {
        zv8 zv8Var = A[0];
        return (Drawable) this.o.b;
    }

    public final boolean getShowProgress() {
        return this.s;
    }

    @Override // defpackage.l1c
    public final void k(l68 l68Var, Animatable animatable) {
        if (Looper.getMainLooper().isCurrentThread()) {
            if (getImageAttach().e && animatable != null) {
                animatable.start();
            }
            setImageInfo(l68Var);
            getOnFinalImageSetCallback().invoke();
            return;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.postAtFrontOfQueue(new n58(this, animatable, l68Var, 0));
        } else {
            post(new n58(this, animatable, l68Var, 1));
        }
    }

    public final boolean n(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (this.u) {
            return false;
        }
        if (!(getRemoteImageState() instanceof j58) || !((v50) this.z.getValue()).getBounds().contains(x, y)) {
            if (!(getRemoteImageState() instanceof k58) || !getDownloadDrawable().getBounds().contains(x, y)) {
                return false;
            }
            q(this, getImageAttach(), 28);
            return true;
        }
        t25 t25Var = this.v;
        if (t25Var != null) {
            t25Var.close();
        }
        this.v = null;
        setRemoteImageState(k58.a);
        return true;
    }

    public final void o(boolean z, Float f, boolean z2) {
        this.u = z;
        if (z) {
            wj7 wj7Var = (wj7) getHierarchy();
            ny8 ny8Var = this.z;
            wj7Var.k((Drawable) ny8Var.getValue());
            if (ny8Var.d()) {
                ((v50) ny8Var.getValue()).setLevel(gm0.K(f.floatValue() * 10000.0f));
                return;
            }
            return;
        }
        if (!z2) {
            ((wj7) getHierarchy()).k(null);
            return;
        }
        l58 remoteImageState = getRemoteImageState();
        if (remoteImageState == null) {
            return;
        }
        r(remoteImageState);
    }

    @Override // defpackage.fu5, android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode == 1073741824 && mode2 == 1073741824) {
            setMeasuredDimension(size, size2);
            return;
        }
        int i4 = getImageAttach().c;
        int i5 = getImageAttach().d;
        if (i4 <= 0 || i5 <= 0) {
            i5 = size / 2;
            i3 = size;
        } else {
            i3 = i4;
        }
        int i6 = i5;
        int i7 = getImageAttach().f;
        int iK = gm0.K(120.0f * yl5.d().getDisplayMetrics().density);
        dea deaVar = B;
        lsk.b(size, size, i3, i6, iK, i7, deaVar);
        this.w = deaVar.b;
        this.x = deaVar.a;
        setMeasuredDimension(deaVar.c, deaVar.d);
    }

    public final void p(g58 g58Var, boolean z, bne bneVar, bne bneVar2, boolean z2) {
        l58 l58Var;
        w78 w78VarD;
        t25 t25Var = this.v;
        if (t25Var != null) {
            t25Var.close();
            this.v = null;
        }
        wj7 wj7Var = (wj7) getHierarchy();
        cqk cqkVar = g58Var.j;
        bne bneVar3 = g58Var.i;
        boolean z3 = g58Var.g;
        Uri uri = g58Var.b;
        wj7Var.h(cqkVar);
        if (z3) {
            l58Var = k58.a;
        } else {
            l58Var = this.s ? j58.a : null;
        }
        setRemoteImageState(l58Var);
        w78 w78VarD2 = w78.d(uri);
        if (bneVar == null) {
            if (bneVar3 == null) {
                int width = getWidth();
                int height = getHeight();
                bneVar = (height <= 0 || width <= 0) ? null : new bne(width, height, Math.max(Math.max(width, height), 2048.0f), 8);
            } else {
                bneVar = bneVar3;
            }
        }
        w78VarD2.d = bneVar;
        if (z3 && !z) {
            w78VarD2.b = u78.DISK_CACHE;
        }
        Uri uri2 = z2 ? g58Var.h : uri;
        if (uri2 != null) {
            w78VarD = w78.d(uri2);
            if (bneVar2 == null) {
                bneVar2 = bneVar3;
            }
            w78VarD.d = bneVar2;
        } else if (bneVar2 != null) {
            w78VarD = w78.d(uri);
            w78VarD.d = bneVar2;
        } else {
            w78VarD = null;
        }
        w78VarD2.l = new p58(this);
        i(w78VarD2.a(), w78VarD != null ? w78VarD.a() : null, new q78(g58Var.n, g58Var.o, g58Var.a));
        t25 currentDataSource = getCurrentDataSource();
        this.v = currentDataSource;
        if (!this.s || currentDataSource == null) {
            return;
        }
        ((q0) currentDataSource).l(new o58(this), x72.a);
    }

    public final void r(l58 l58Var) {
        Drawable downloadDrawable;
        if (!Looper.getMainLooper().isCurrentThread()) {
            Handler handler = getHandler();
            if (handler != null) {
                handler.postAtFrontOfQueue(new og7(this, 8, l58Var));
                return;
            } else {
                post(new ng7(this, 9, l58Var));
                return;
            }
        }
        boolean z = this.u;
        ny8 ny8Var = this.z;
        if (z || (l58Var instanceof j58)) {
            downloadDrawable = (Drawable) ny8Var.getValue();
        } else if (l58Var instanceof i58) {
            downloadDrawable = getOverlayDrawable();
        } else {
            if (!(l58Var instanceof k58)) {
                ore.o();
                return;
            }
            downloadDrawable = getDownloadDrawable();
        }
        ((wj7) getHierarchy()).k(downloadDrawable);
    }

    public final void setImageAttach(g58 g58Var) {
        this.p.B(this, A[1], g58Var);
    }

    public final void setImageInfo(l68 l68Var) {
        this.r.B(this, A[2], l68Var);
    }

    public final void setMeasuredLayoutHeight(int i) {
        this.w = i;
    }

    public final void setMeasuredLayoutWidth(int i) {
        this.x = i;
    }

    public final void setOnFinalImageSetCallback(af7 af7Var) {
        this.q = af7Var;
    }

    public final void setOverlayDrawable(Drawable drawable) {
        this.o.B(this, A[0], drawable);
    }

    public final void setRoundedCorners(float[] fArr) {
        wj7 wj7Var = (wj7) getHierarchy();
        eve eveVar = new eve();
        oc9.j("radii should have exactly 8 values", fArr.length == 8);
        if (eveVar.c == null) {
            eveVar.c = new float[8];
        }
        System.arraycopy(fArr, 0, eveVar.c, 0, 8);
        wj7Var.m(eveVar);
    }

    public final void setShowProgress(boolean z) {
        this.s = z;
    }
}
