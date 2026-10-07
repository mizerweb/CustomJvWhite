package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes2.dex */
public final class mef extends lfe {
    public static final /* synthetic */ int A = 0;
    public final sy9 u;
    public final l1c v;
    public final ImageView w;
    public jef x;
    public Uri y;
    public Uri z;

    public mef(sy9 sy9Var, l1c l1cVar, ImageView imageView, ImageView imageView2, FrameLayout frameLayout) {
        super(frameLayout);
        this.u = sy9Var;
        this.v = l1cVar;
        this.w = imageView2;
        final int i = 0;
        qe7.H(l1cVar, 300L, new View.OnClickListener(this) { // from class: lef
            public final /* synthetic */ mef b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                mef mefVar = this.b;
                switch (i2) {
                    case 0:
                        jef jefVar = mefVar.x;
                        if (jefVar != null) {
                            mefVar.u.p(jefVar);
                        }
                        break;
                    default:
                        jef jefVar2 = mefVar.x;
                        if (jefVar2 != null) {
                            mefVar.u.k(jefVar2);
                        }
                        break;
                }
            }
        });
        final int i2 = 1;
        qe7.H(imageView, 300L, new View.OnClickListener(this) { // from class: lef
            public final /* synthetic */ mef b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                mef mefVar = this.b;
                switch (i3) {
                    case 0:
                        jef jefVar = mefVar.x;
                        if (jefVar != null) {
                            mefVar.u.p(jefVar);
                        }
                        break;
                    default:
                        jef jefVar2 = mefVar.x;
                        if (jefVar2 != null) {
                            mefVar.u.k(jefVar2);
                        }
                        break;
                }
            }
        });
    }

    public final void B(jef jefVar, boolean z) {
        Uri uri = jefVar.h;
        this.x = jefVar;
        Uri uri2 = this.y;
        Uri uri3 = jefVar.d;
        if (!cqk.d(uri2, uri3) || !cqk.d(this.z, uri)) {
            this.y = uri3;
            this.z = uri;
            w78 w78VarD = w78.d(sb8.K(uri3.toString()));
            w78VarD.h = true;
            l1c l1cVar = this.v;
            if (uri != null) {
                w78VarD.k = new hkc(l1cVar.getContext(), uri);
            }
            l1c.j(l1cVar, w78VarD.a(), null, 6);
        }
        this.w.setVisibility(jefVar.a.l == jb9.d ? 0 : 8);
        C(z);
    }

    public final void C(boolean z) {
        Drawable foreground = this.a.getForeground();
        GradientDrawable gradientDrawable = foreground instanceof GradientDrawable ? (GradientDrawable) foreground : null;
        if (gradientDrawable == null) {
            return;
        }
        if (z) {
            gradientDrawable.setStroke(gm0.K(2.0f * yl5.d().getDisplayMetrics().density), -1);
        } else {
            gradientDrawable.setStroke(0, 0);
        }
    }
}
