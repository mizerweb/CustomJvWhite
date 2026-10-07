package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class xm4 extends lfe {
    public final um4 u;
    public final kp0 v;

    public xm4(Context context, um4 um4Var, kp0 kp0Var) {
        r1c r1cVar = new r1c(context);
        super(r1cVar);
        this.u = um4Var;
        this.v = kp0Var;
        r1cVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        r1cVar.setIcon(R.drawable.icon_user_add_fill);
        r1cVar.setTitle(new tnh(R.string.banner_big_permit_phone_book_contacts_title));
        r1cVar.setSubtitle(new tnh(R.string.banner_big_permit_phone_book_contacts_subtitle));
        r1cVar.f(context.getString(R.string.banner_big_permit_phone_book_contacts_action_button_text), new t8(21, this));
    }
}
