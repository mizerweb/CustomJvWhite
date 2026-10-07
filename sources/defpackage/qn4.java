package defpackage;

import android.view.View;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class qn4 extends s7g {
    @Override // defpackage.s7g
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final void B(pn4 pn4Var) {
        r1c r1cVar = (r1c) this.a;
        r1cVar.setIcon(R.drawable.icon_phone_book_fill);
        r1cVar.setTitle(new tnh(R.string.empty_search_contact_title));
        r1cVar.setSubtitle(new tnh(pn4Var.a));
    }

    public final void I(Integer num, af7 af7Var) {
        View view = this.a;
        if (num != null) {
            r1c r1cVar = (r1c) view;
            r1cVar.f(r1cVar.getContext().getString(num.intValue()), new d8(3, af7Var));
        } else {
            cyb cybVar = ((r1c) view).h;
            cybVar.setText("");
            cybVar.setOnClickListener(null);
            cybVar.setVisibility(8);
        }
    }
}
