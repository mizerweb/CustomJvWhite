package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class cyi extends FrameLayout {
    public final ny8 a;
    public final ny8 b;
    public ViewPropertyAnimator c;
    public final l1c d;
    public final ghd e;
    public final pyi f;

    public cyi(Context context) {
        super(context);
        this.a = rx8.P(3, new twf(context, 17));
        this.b = rx8.P(3, new vbi(8, this));
        l1c l1cVar = new l1c(context);
        l1cVar.setId(R.id.chat_screen__video_msg_placeholder);
        l1cVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        l1cVar.setVisibility(0);
        ((wj7) l1cVar.getHierarchy()).k(getShimmerDrawable());
        this.d = l1cVar;
        ghd ghdVar = new ghd(context);
        ghdVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        ghdVar.setVisibility(4);
        this.e = ghdVar;
        pyi pyiVar = new pyi(context);
        pyiVar.setId(R.id.chat_screen__video_msg_progress);
        pyiVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        pyiVar.setPausingEnabled(false);
        this.f = pyiVar;
        addView(ghdVar);
        addView(pyiVar);
        addView(l1cVar);
        setKeepScreenOn(true);
        setClipToOutline(true);
        setOutlineProvider(new b7(5, this));
    }

    public static void a(cyi cyiVar) {
        cyiVar.d.setVisibility(8);
        cyiVar.getShimmerDrawable().d();
        cyiVar.c = null;
    }

    private final xo2 getAllPostProcessor() {
        return (xo2) this.a.getValue();
    }

    private final p0g getShimmerDrawable() {
        return (p0g) this.b.getValue();
    }

    private static /* synthetic */ void getShimmerDrawable$annotations() {
    }

    public final Bitmap getFrameAsBitmap() {
        ghd ghdVar = this.e;
        if (ghdVar.getPreviewStreamState().d() == fhd.b) {
            return ghdVar.getBitmap();
        }
        return null;
    }

    public final xx6 getPreviewStreamState() {
        return iyl.a(this.e.getPreviewStreamState());
    }

    public final hgd getSurfaceProvider() {
        return this.e.getSurfaceProvider();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getShimmerDrawable().d();
    }

    public final void setPlaceholder(String str) {
        ViewPropertyAnimator viewPropertyAnimator = this.c;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.e.setVisibility(4);
        l1c l1cVar = this.d;
        l1cVar.setVisibility(0);
        l1cVar.setAlpha(1.0f);
        if (str != null) {
            w78 w78VarD = w78.d(Uri.parse(str));
            w78VarD.k = getAllPostProcessor();
            l1c.j(l1cVar, w78VarD.a(), null, 6);
        } else {
            ((wj7) l1cVar.getHierarchy()).i(1, new sz0(getContext(), pq3.j.h(this).b().e, 44.0f, false));
        }
        getShimmerDrawable().c();
    }

    public final void setZoomListener(cf7 cf7Var) {
        this.e.setOnTouchListener(new zw1(5, cf7Var));
    }
}
