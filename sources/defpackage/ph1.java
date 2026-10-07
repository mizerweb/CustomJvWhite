package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import one.me.messages.list.loader.MessageModel;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ph1 extends tee {
    public final /* synthetic */ int a;

    public /* synthetic */ ph1(int i) {
        this.a = i;
    }

    @Override // defpackage.tee
    public final void f(Rect rect, View view, RecyclerView recyclerView, hfe hfeVar) {
        int iP;
        int iK = 0;
        switch (this.a) {
            case 0:
                int iR = RecyclerView.R(view);
                int iK2 = (iR == -1 || iR != hfeVar.b() - 1) ? gm0.K(yl5.d().getDisplayMetrics().density * 4.0f) : gm0.K(20.0f * yl5.d().getDisplayMetrics().density);
                rect.top = gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
                rect.bottom = iK2;
                break;
            case 1:
                int iP2 = RecyclerView.P(view);
                rect.set((iP2 == -1 || iP2 == 0) ? 0 : gm0.K(8.0f * yl5.d().getDisplayMetrics().density), gm0.K(24.0f * yl5.d().getDisplayMetrics().density), rect.right, 0);
                break;
            case 2:
                super.f(rect, view, recyclerView, hfeVar);
                nee adapter = recyclerView.getAdapter();
                if (adapter != null && (iP = RecyclerView.P(view)) > 0) {
                    int iN = adapter.n(iP);
                    if ((iN == R.id.oneme_contactlist_contact_view_type || iN == R.id.oneme_contactlist_phonebook_contact_view_type) && adapter.n(iP - 1) == R.id.oneme_invite_action_view_type) {
                        rect.top = gm0.K(10.0f * yl5.d().getDisplayMetrics().density);
                    }
                }
                break;
            case 3:
                int iP3 = RecyclerView.P(view);
                if (iP3 == hfeVar.b() - 1) {
                    nee adapter2 = recyclerView.getAdapter();
                    qpa qpaVar = adapter2 instanceof qpa ? (qpa) adapter2 : null;
                    if (qpaVar != null && iP3 != -1 && iP3 <= qpaVar.l() - 1) {
                        k79 k79Var = (k79) qpaVar.F(iP3);
                        MessageModel messageModel = k79Var instanceof MessageModel ? (MessageModel) k79Var : null;
                        if (messageModel != null && messageModel.w()) {
                            iK = gm0.K(2.0f * yl5.d().getDisplayMetrics().density);
                        }
                    }
                    rect.bottom = iK;
                }
                break;
            case 4:
                int iP4 = RecyclerView.P(view);
                nee adapter3 = recyclerView.getAdapter();
                Integer numValueOf = adapter3 != null ? Integer.valueOf(adapter3.l()) : null;
                if (iP4 != -1 && numValueOf != null) {
                    rect.top = iP4 == 0 ? gm0.K(yl5.d().getDisplayMetrics().density * 16.0f) : 0;
                    rect.left = gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
                    rect.right = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
                    rect.bottom = iP4 == numValueOf.intValue() - 1 ? gm0.K(16.0f * yl5.d().getDisplayMetrics().density) : 0;
                    break;
                }
                break;
            case 5:
                int iP5 = RecyclerView.P(view);
                nee adapter4 = recyclerView.getAdapter();
                Integer numValueOf2 = adapter4 != null ? Integer.valueOf(adapter4.l()) : null;
                if (iP5 != -1 && numValueOf2 != null) {
                    rect.top = iP5 == 0 ? gm0.K(16.0f * yl5.d().getDisplayMetrics().density) : 0;
                    break;
                }
                break;
            case 6:
                int iR2 = RecyclerView.R(view);
                nee adapter5 = recyclerView.getAdapter();
                if (adapter5 != null && iR2 >= 0) {
                    if (iR2 == 0) {
                        rect.left = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
                    } else if (iR2 == adapter5.l() - 1) {
                        rect.right = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
                    }
                }
                break;
            case 7:
                int iP6 = RecyclerView.P(view);
                nee adapter6 = recyclerView.getAdapter();
                if (adapter6 != null && iP6 >= 0 && iP6 < adapter6.l()) {
                    int iK3 = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
                    rect.left = iK3;
                    rect.right = iK3;
                    int iN2 = adapter6.n(iP6) & 536870911;
                    if ((iN2 == 1 && iP6 != 0) || iN2 == 8) {
                        rect.top = gm0.K(28.0f * yl5.d().getDisplayMetrics().density);
                        break;
                    }
                }
                break;
            case 8:
                nee adapter7 = recyclerView.getAdapter();
                if (adapter7 != null) {
                    if (RecyclerView.P(view) == adapter7.l() - 1) {
                    }
                    rect.left = gm0.K(yl5.d().getDisplayMetrics().density * 4.0f);
                    rect.top = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
                    rect.right = gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
                    rect.bottom = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
                    break;
                }
                break;
            case 9:
                if (RecyclerView.P(view) != 0) {
                    rect.top = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
                }
                break;
            case 10:
                RecyclerView.P(view);
                break;
            case 11:
                int iP7 = RecyclerView.P(view);
                if (iP7 != -1 && iP7 != 0 && (view instanceof AppCompatTextView)) {
                    rect.set(rect.left, gm0.K(12.0f * yl5.d().getDisplayMetrics().density), rect.right, rect.bottom);
                    break;
                }
                break;
            default:
                int iP8 = RecyclerView.P(view);
                if (yab.g0(view)) {
                    rect.right = iP8 == 0 ? gm0.K(yl5.d().getDisplayMetrics().density * 4.0f) : gm0.K(6.0f * yl5.d().getDisplayMetrics().density);
                    if (tre.j0(recyclerView, iP8)) {
                        rect.left = gm0.K(yl5.d().getDisplayMetrics().density * 4.0f);
                    }
                } else {
                    rect.left = iP8 == 0 ? gm0.K(yl5.d().getDisplayMetrics().density * 4.0f) : gm0.K(6.0f * yl5.d().getDisplayMetrics().density);
                    if (tre.j0(recyclerView, iP8)) {
                        rect.right = gm0.K(yl5.d().getDisplayMetrics().density * 4.0f);
                    }
                }
                rect.top = gm0.K(yl5.d().getDisplayMetrics().density * 4.0f);
                rect.bottom = gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
                break;
        }
    }
}
