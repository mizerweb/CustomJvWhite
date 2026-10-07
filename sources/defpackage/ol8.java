package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class ol8 extends s7g {
    @Override // defpackage.s7g
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final void B(or0 or0Var) {
        Drawable drawableMutate;
        nl8 nl8Var = (nl8) this.a;
        CharSequence charSequenceB = or0Var.getText().b(nl8Var.getContext());
        if (charSequenceB == null) {
            charSequenceB = "";
        }
        nl8Var.setText(charSequenceB);
        Integer icon = or0Var.getIcon();
        if (icon != null) {
            drawableMutate = nl8Var.getContext().getDrawable(icon.intValue()).mutate();
        } else {
            drawableMutate = null;
        }
        nl8Var.setIcon(drawableMutate);
    }
}
