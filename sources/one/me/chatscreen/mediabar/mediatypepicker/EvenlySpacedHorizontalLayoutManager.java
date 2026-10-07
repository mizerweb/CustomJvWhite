package one.me.chatscreen.mediabar.mediatypepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.cfe;
import defpackage.hfe;
import defpackage.vee;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lone/me/chatscreen/mediabar/mediatypepicker/EvenlySpacedHorizontalLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "chat-screen"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EvenlySpacedHorizontalLayoutManager extends LinearLayoutManager {
    public boolean E;

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.vee
    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getE() {
        return this.E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.vee
    public final void k0(cfe cfeVar, hfe hfeVar) {
        if ((hfeVar != null && hfeVar.h) || G() == 0) {
            this.E = false;
            super.k0(cfeVar, hfeVar);
            return;
        }
        q(cfeVar);
        int i = this.n;
        ArrayList<View> arrayList = new ArrayList(G());
        int iG = G();
        int iD = 0;
        for (int i2 = 0; i2 < iG; i2++) {
            View viewD = cfeVar.d(i2);
            T(viewD, View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            iD += vee.D(viewD);
            arrayList.add(viewD);
            b(viewD);
        }
        if (iD > i || i <= 0) {
            this.E = true;
            super.k0(cfeVar, hfeVar);
            return;
        }
        this.E = false;
        int iG2 = (i - iD) / (G() + 1);
        int i3 = iG2;
        for (View view : arrayList) {
            int iD2 = vee.D(view);
            int iC = vee.C(view);
            int i4 = this.o;
            S(view, i3, i4 - iC, i3 + iD2, i4);
            i3 += iD2 + iG2;
        }
    }
}
