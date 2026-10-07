package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class w33 extends sb3 implements eph {
    public final ColorDrawable b;
    public final ny8 c;
    public final ny8 d;
    public final l1c e;
    public final ny8 f;

    public w33(Context context) {
        super(context, (AttributeSet) null);
        ColorDrawable colorDrawable = new ColorDrawable(pq3.j.h(this).b().b);
        this.b = colorDrawable;
        final int i = 0;
        this.c = rx8.P(3, new af7(this) { // from class: v33
            public final /* synthetic */ w33 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                a8g a8gVar = pq3.j;
                w33 w33Var = this.b;
                switch (i2) {
                    case 0:
                        int i3 = a8gVar.h(w33Var).getIcon().e;
                        Drawable drawableMutate = w33Var.getContext().getDrawable(R.drawable.icon_eye_crossed_fill).mutate();
                        sb8.m0(i3, drawableMutate);
                        return drawableMutate;
                    default:
                        return new ColorDrawable(a8gVar.h(w33Var).h().b);
                }
            }
        });
        final int i2 = 1;
        this.d = rx8.P(3, new af7(this) { // from class: v33
            public final /* synthetic */ w33 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                a8g a8gVar = pq3.j;
                w33 w33Var = this.b;
                switch (i3) {
                    case 0:
                        int i4 = a8gVar.h(w33Var).getIcon().e;
                        Drawable drawableMutate = w33Var.getContext().getDrawable(R.drawable.icon_eye_crossed_fill).mutate();
                        sb8.m0(i4, drawableMutate);
                        return drawableMutate;
                    default:
                        return new ColorDrawable(a8gVar.h(w33Var).h().b);
                }
            }
        });
        l1c l1cVar = new l1c(context);
        l1cVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        l1cVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
        xj7 xj7Var = new xj7(l1cVar.getResources());
        xj7Var.d = colorDrawable;
        l1cVar.setHierarchy(xj7Var.a());
        this.e = l1cVar;
        this.f = rx8.P(3, new za2(context, 9, this));
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        addView(l1cVar);
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.b.setColor(kbcVar.b().b);
        ny8 ny8Var = this.c;
        if (ny8Var.d()) {
            sb8.m0(kbcVar.getIcon().e, (Drawable) ny8Var.getValue());
        }
        ny8 ny8Var2 = this.d;
        if (ny8Var2.d()) {
            ((ColorDrawable) ny8Var2.getValue()).setColor(pq3.j.h(this).h().b);
        }
    }

    public final void setItem(v7a v7aVar) {
        Uri uri;
        v78 v78VarA;
        Long l = v7aVar.l;
        boolean z = v7aVar.m;
        ny8 ny8Var = this.f;
        l1c l1cVar = this.e;
        if (z) {
            l1cVar.setController(null);
            ((wj7) l1cVar.getHierarchy()).i(1, (Drawable) this.c.getValue());
            l1cVar.setBackground((Drawable) this.d.getValue());
            if (ny8Var.d()) {
                ((ixi) ny8Var.getValue()).setVisibility(8);
                return;
            }
            return;
        }
        if (v7aVar.j || (uri = v7aVar.d) == null) {
            v78VarA = null;
        } else {
            w78 w78VarD = w78.d(uri);
            w78VarD.h = true;
            v78VarA = w78VarD.a();
        }
        Uri uri2 = v7aVar.i;
        v78 v78VarA2 = uri2 != null ? w78.d(uri2).a() : null;
        l1cVar.setBackground(null);
        Long l2 = v7aVar.k;
        l1cVar.i(v78VarA, v78VarA2, (l2 == null || l == null) ? null : new q78(l2.longValue(), l.longValue(), v7aVar.c));
        int iD = qt4.D(v7aVar.e);
        if (iD == 0) {
            if (ny8Var.d()) {
                ((ixi) ny8Var.getValue()).setVisibility(8);
            }
        } else {
            if (iD == 1) {
                ixi ixiVar = (ixi) ny8Var.getValue();
                Long l3 = v7aVar.f;
                ixiVar.a(l3 != null ? l3.longValue() : 0L);
                ixiVar.setVisibility(0);
                return;
            }
            if (iD != 2) {
                ore.o();
                return;
            }
            ixi ixiVar2 = (ixi) ny8Var.getValue();
            ixiVar2.setText(ixiVar2.getContext().getString(R.string.media_settings_gif));
            ixiVar2.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            ixiVar2.setVisibility(0);
            ixiVar2.setVisibility(0);
        }
    }
}
