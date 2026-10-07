package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class vvf extends FrameLayout {
    public final ny8 a;
    public final ny8 b;

    public vvf(final Context context) {
        super(context, null);
        final int i = 0;
        this.a = rx8.P(3, new af7() { // from class: uvf
            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                vvf vvfVar = this;
                Context context2 = context;
                switch (i2) {
                    case 0:
                        TextView textViewE = qv1.e(context2, R.id.oneme_settings_sectionname_textview);
                        textViewE.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                        q9i.a(q9i.f, textViewE);
                        n1g.N(new xc9(3, null, 29), textViewE);
                        yab.e(vvfVar, textViewE, -1);
                        return textViewE;
                    default:
                        t6g t6gVar = new t6g(context2);
                        t6gVar.setId(R.id.oneme_settings_sectionname_iconview);
                        yab.e(vvfVar, t6gVar, -1);
                        return t6gVar;
                }
            }
        });
        final int i2 = 1;
        this.b = rx8.P(3, new af7() { // from class: uvf
            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                vvf vvfVar = this;
                Context context2 = context;
                switch (i3) {
                    case 0:
                        TextView textViewE = qv1.e(context2, R.id.oneme_settings_sectionname_textview);
                        textViewE.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                        q9i.a(q9i.f, textViewE);
                        n1g.N(new xc9(3, null, 29), textViewE);
                        yab.e(vvfVar, textViewE, -1);
                        return textViewE;
                    default:
                        t6g t6gVar = new t6g(context2);
                        t6gVar.setId(R.id.oneme_settings_sectionname_iconview);
                        yab.e(vvfVar, t6gVar, -1);
                        return t6gVar;
                }
            }
        });
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setMinimumHeight(gm0.K(48.0f * yl5.d().getDisplayMetrics().density));
    }

    public final void setTitle(aqf aqfVar) {
        FrameLayout.LayoutParams layoutParams;
        boolean z = aqfVar instanceof ypf;
        int i = 8388611;
        ny8 ny8Var = this.b;
        ny8 ny8Var2 = this.a;
        if (z) {
            if (ny8Var2.d()) {
                ((TextView) ny8Var2.getValue()).setVisibility(8);
            }
            t6g t6gVar = (t6g) ny8Var.getValue();
            t6gVar.setVisibility(0);
            ((wj7) t6gVar.getHierarchy()).i(5, null);
            ((wj7) t6gVar.getHierarchy()).k(null);
            t1d t1dVar = vd7.a.get();
            t1dVar.j = t6gVar.getController();
            ypf ypfVar = (ypf) aqfVar;
            t1dVar.c = (v78) ypfVar.e.getValue();
            t6gVar.setController(t1dVar.a());
            setPaddingRelative(gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), gm0.K(20.0f * yl5.d().getDisplayMetrics().density), gm0.K(16.0f * yl5.d().getDisplayMetrics().density), gm0.K(10.0f * yl5.d().getDisplayMetrics().density));
            ViewGroup.LayoutParams layoutParams2 = t6gVar.getLayoutParams();
            layoutParams = layoutParams2 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams2 : null;
            if (layoutParams != null) {
                layoutParams.width = ypfVar.c;
                layoutParams.height = ypfVar.d;
                int iD = qt4.D(ypfVar.b);
                if (iD != 0) {
                    if (iD != 1) {
                        ore.o();
                        return;
                    }
                    i = 17;
                }
                layoutParams.gravity = i;
            }
        } else {
            if (!(aqfVar instanceof zpf)) {
                ore.o();
                return;
            }
            if (ny8Var.d()) {
                t6g t6gVar2 = (t6g) ny8Var.getValue();
                t6gVar2.setVisibility(8);
                t6gVar2.setController(null);
                ((wj7) t6gVar2.getHierarchy()).i(5, null);
                ((wj7) t6gVar2.getHierarchy()).k(null);
            }
            TextView textView = (TextView) ny8Var2.getValue();
            textView.setVisibility(0);
            setPaddingRelative(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 14.0f), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), gm0.K(14.0f * yl5.d().getDisplayMetrics().density));
            zpf zpfVar = (zpf) aqfVar;
            textView.setText(zpfVar.a.d(this));
            ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
            layoutParams = layoutParams3 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams3 : null;
            if (layoutParams != null) {
                int iD2 = qt4.D(zpfVar.b);
                if (iD2 != 0) {
                    if (iD2 != 1) {
                        ore.o();
                        return;
                    }
                    i = 17;
                }
                layoutParams.gravity = i;
            }
        }
        requestLayout();
        invalidate();
    }
}
