package defpackage;

import android.content.Context;
import android.net.Uri;
import android.widget.TextView;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class rn7 extends s7g {
    public final j7c u;

    public rn7(j7c j7cVar, Context context) {
        super(new izb(context, false));
        this.u = j7cVar;
    }

    @Override // defpackage.s7g
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final void B(qn7 qn7Var) {
        String string;
        List list = qn7Var.h;
        xcd xcdVar = qn7Var.d;
        izb izbVar = (izb) this.a;
        izbVar.setId(Long.hashCode(qn7Var.i));
        xcd xcdVar2 = qn7Var.c;
        CharSequence charSequence = xcdVar2.a;
        CharSequence charSequenceG = xcdVar2.a;
        String string2 = charSequence.toString();
        TextView textView = izbVar.e;
        j7c j7cVar = this.u;
        if (string2 != null && string2.length() != 0 && textView.getPaint().measureText(string2) > textView.getMeasuredWidth()) {
            String[] strArr = xcdVar2.b;
            j7cVar.getClass();
            charSequenceG = j7c.g(charSequenceG, list, strArr);
        }
        izbVar.setTitle(charSequenceG);
        boolean zH = izbVar.h(xcdVar.a.toString());
        CharSequence charSequenceG2 = xcdVar.a;
        if (zH) {
            String[] strArr2 = xcdVar.b;
            j7cVar.getClass();
            charSequenceG2 = j7c.g(charSequenceG2, list, strArr2);
        }
        izbVar.setSubtitle(charSequenceG2);
        long j = qn7Var.a;
        String str = qn7Var.b;
        Uri uri = qn7Var.f;
        if (uri == null || (string = uri.toString()) == null) {
            string = Uri.EMPTY.toString();
        }
        izbVar.j(j, str, string);
        izbVar.setVerified(qn7Var.e);
    }
}
