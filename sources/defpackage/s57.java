package defpackage;

import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import one.me.chats.picker.contacts.PickerContactsListWidget;
import one.me.folders.pickerfolders.FoldersPickerScreen;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class s57 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecyclerView b;

    public /* synthetic */ s57(RecyclerView recyclerView, int i) {
        this.a = i;
        this.b = recyclerView;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        View viewV;
        View viewV2;
        int iM;
        int iM2;
        int i = this.a;
        RecyclerView recyclerView = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = FoldersPickerScreen.l;
                return so2.F(recyclerView.getContext(), 6);
            case 1:
                zv8[] zv8VarArr2 = PickerContactsListWidget.q;
                return so2.F(recyclerView.getContext(), 6);
            case 2:
                return Integer.valueOf(((GridLayoutManager) recyclerView.getLayoutManager()).F);
            default:
                vee layoutManager = recyclerView.getLayoutManager();
                if (layoutManager != null) {
                    if (layoutManager instanceof LinearLayoutManager) {
                        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                        iM = linearLayoutManager.X0();
                        iM2 = linearLayoutManager.Z0();
                    } else if (layoutManager.w() != 0 && (viewV = layoutManager.v(0)) != null && (viewV2 = layoutManager.v(layoutManager.w() - 1)) != null) {
                        iM = vee.M(viewV);
                        iM2 = vee.M(viewV2);
                    }
                    if (iM != -1 && iM2 != -1) {
                        int iAbs = Math.abs(iM2 - iM) + 1;
                        nee adapter = recyclerView.getAdapter();
                        if (adapter != null) {
                            adapter.q(iM, iAbs, new Object());
                        }
                    }
                }
                return sbi.a;
        }
    }
}
