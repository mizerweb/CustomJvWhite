package defpackage;

import android.text.InputFilter;
import android.text.Spanned;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import one.me.folders.edit.FolderEditScreen;
import one.me.sdk.uikit.common.span.FitFontImageSpan;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class s27 extends s7g {
    public final jac u;
    public FolderEditScreen v;

    public s27(ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        super(frameLayout);
        jac jacVar = new jac(frameLayout.getContext());
        this.u = jacVar;
        frameLayout.setId(R.id.oneme_folders_edit_folder_name_field);
        frameLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        jacVar.setHint(np4.q(jacVar.getContext(), R.string.oneme_folders_edit_name_hint));
        jacVar.k(new nv4(9, this));
        jacVar.setFilters(new InputFilter[]{new InputFilter.LengthFilter(20)});
        jacVar.setImeOptions(6);
        frameLayout.addView(jacVar, new FrameLayout.LayoutParams(-1, -2, 17));
        n1g.N(new ud9(this, (lq4) null, 21), frameLayout);
    }

    @Override // defpackage.s7g
    public final void E() {
        CharSequence text = this.u.getText();
        int length = text.length();
        Object[] spans = null;
        try {
            Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
            if (spanned != null) {
                spans = spanned.getSpans(0, length, FitFontImageSpan.class);
            }
        } catch (Throwable unused) {
        }
        if (spans == null) {
            spans = new FitFontImageSpan[0];
        }
        for (Object obj : spans) {
            FitFontImageSpan fitFontImageSpan = (FitFontImageSpan) obj;
            fitFontImageSpan.updateDrawableSize(gm0.K(15.0f * yl5.d().getDisplayMetrics().density), kw6.c, false);
            fitFontImageSpan.setOverrideAlpha(false);
        }
    }

    @Override // defpackage.s7g
    public final void G() {
        this.v = null;
    }

    @Override // defpackage.s7g
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final void B(r27 r27Var) {
        boolean z = r27Var.b;
        jac jacVar = this.u;
        jacVar.setEnabled(z);
        jacVar.setTextColorAttr(z ? R.attr.text_primary : R.attr.states_text_primary_disabled);
        if (jacVar.getText().length() == 0) {
            ynh ynhVar = r27Var.a;
            CharSequence charSequenceA = ynhVar != null ? ynhVar.a(this) : null;
            if (charSequenceA == null) {
                charSequenceA = "";
            }
            jacVar.setText(charSequenceA);
        }
        jacVar.setFilters(new InputFilter[]{new InputFilter.LengthFilter(r27Var.c)});
        this.v = null;
    }
}
