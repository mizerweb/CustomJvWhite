package defpackage;

import android.content.Context;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class u8 extends s7g {
    public final Context u;

    public u8(Context context) {
        super(new yyb(context));
        this.u = context;
    }

    @Override // defpackage.s7g
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final void B(r8 r8Var) {
        yyb yybVar = (yyb) this.a;
        CharSequence charSequenceA = r8Var.a.a(this);
        if (charSequenceA == null) {
            charSequenceA = "";
        }
        yybVar.setText(charSequenceA);
        yybVar.setIcon(this.u.getDrawable(R.drawable.icon_call_by_number));
    }
}
