package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class r03 extends tee {
    @Override // defpackage.tee
    public final void f(Rect rect, View view, RecyclerView recyclerView, hfe hfeVar) {
        lfe lfeVarS = recyclerView.S(view);
        if (lfeVarS == null) {
            return;
        }
        int i = lfeVarS.f;
        if (i == R.id.chat_item_view_type || i == R.id.chat_item_view_type_pinned || i == R.id.fake_chat_contact_item_view_type || i == R.id.fake_chat_phone_item_view_type) {
            rect.set(gm0.K(yl5.d().getDisplayMetrics().density * 6.0f), 0, gm0.K(6.0f * yl5.d().getDisplayMetrics().density), 0);
        }
    }
}
