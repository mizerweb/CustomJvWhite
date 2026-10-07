package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Spannable;
import android.view.View;
import android.widget.TextView;
import java.util.List;
import one.me.messages.list.loader.MessageModel;

/* JADX INFO: loaded from: classes2.dex */
public final class pq4 extends uka {
    public due y;

    @Override // defpackage.uka
    public final void H(MessageModel messageModel, List list) {
        CharSequence charSequence = messageModel.d;
        this.x = new vka(messageModel.F);
        ria riaVar = messageModel.o;
        View view = this.a;
        if (riaVar == null || riaVar.a <= 0) {
            ((TextView) view).setOnClickListener(null);
        } else {
            qe7.H(view, 300L, new ee(this, 26, riaVar));
        }
        Spannable spannable = charSequence instanceof Spannable ? (Spannable) charSequence : null;
        if (spannable != null) {
            zh4[] zh4VarArr = (zh4[]) spannable.getSpans(0, spannable.length(), zh4.class);
            if (zh4VarArr != null) {
                for (zh4 zh4Var : zh4VarArr) {
                    zh4Var.b = new s63(10, this);
                }
            }
        }
        ((TextView) view).setText(charSequence);
        I(messageModel, view);
    }

    @Override // defpackage.ff3
    public final void h(kbc kbcVar) {
        TextView textView = (TextView) this.a;
        textView.setTextColor(-1);
        Drawable background = textView.getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(kbcVar.t().b);
        }
    }
}
