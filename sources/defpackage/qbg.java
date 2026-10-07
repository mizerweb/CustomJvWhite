package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.text.InputFilter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class qbg extends nee {
    public static final /* synthetic */ zv8[] h;
    public final int d;
    public final gc4 e;
    public final fj3 f;
    public final t5d g = new t5d(this);

    static {
        z8b z8bVar = new z8b(qbg.class, "isSecure", "isSecure()Z");
        zfe.a.getClass();
        h = new zv8[]{z8bVar};
    }

    public qbg(int i, gc4 gc4Var, fj3 fj3Var) {
        this.d = i;
        this.e = gc4Var;
        this.f = fj3Var;
    }

    @Override // defpackage.nee
    public final int l() {
        return this.d;
    }

    @Override // defpackage.nee
    public final void u(lfe lfeVar, final int i) {
        final pbg pbgVar = (pbg) lfeVar;
        zv8 zv8Var = h[0];
        boolean zBooleanValue = ((Boolean) this.g.b).booleanValue();
        bc4 bc4Var = pbgVar.w;
        bc4Var.setSecure(zBooleanValue);
        bc4Var.addTextChangedListener(new obg(pbgVar, i));
        bc4Var.setOnKeyListener(new View.OnKeyListener() { // from class: nbg
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
                if (i2 != 67 || keyEvent.getAction() != 0) {
                    return false;
                }
                gc4 gc4Var = pbgVar.v;
                int i3 = i;
                int i4 = i3 - 1;
                tg8 tg8VarH0 = gc4Var.H0(i3);
                String strB = tg8VarH0 != null ? ((pbg) tg8VarH0).B() : null;
                if (strB == null || strB.length() == 0) {
                    tg8 tg8VarH1 = gc4Var.H0(i4);
                    if (tg8VarH1 != null) {
                        pbg pbgVar2 = (pbg) tg8VarH1;
                        pbgVar2.C("");
                        pbgVar2.w.requestFocus();
                    }
                } else if (tg8VarH0 != null) {
                    ((pbg) tg8VarH0).C("");
                    return true;
                }
                return true;
            }
        });
        doc docVar = new doc(bc4Var.getContext(), pbgVar.v, i, pbgVar.u);
        bc4Var.setCustomSelectionActionModeCallback(docVar);
        bc4Var.setCustomInsertionActionModeCallback(docVar);
    }

    @Override // defpackage.nee
    public final lfe w(ViewGroup viewGroup, int i) {
        bc4 bc4Var = new bc4(viewGroup.getContext(), null);
        bc4Var.setId(R.id.one_me_codeinput_edit_text_view);
        bc4Var.setMinimumWidth(gm0.K(40.0f * yl5.d().getDisplayMetrics().density));
        bc4Var.setMinimumHeight(gm0.K(52.0f * yl5.d().getDisplayMetrics().density));
        bc4Var.setInputType(2);
        bc4Var.setGravity(17);
        bc4Var.setFilters(new InputFilter[]{bc4.c});
        q9i.a(q9i.b, bc4Var);
        bc4Var.setClipToOutline(true);
        bc4Var.setOutlineProvider(new nt4(gm0.K(12.0f * yl5.d().getDisplayMetrics().density)));
        bc4Var.setSingleLine(true);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setSize(gm0.K(2.0f * yl5.d().getDisplayMetrics().density), bc4Var.getLineHeight());
        np4.D(bc4Var, gradientDrawable);
        bc4Var.onThemeChanged(pq3.j.h(bc4Var));
        bc4Var.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        return new pbg(this, this.d, this.e, bc4Var);
    }
}
