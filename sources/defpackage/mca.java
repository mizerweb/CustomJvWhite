package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* JADX INFO: loaded from: classes2.dex */
public final class mca extends kv5 {
    public final int m;
    public final int n;
    public bca o;
    public cca p;

    public mca(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.m = 21;
            this.n = 22;
        } else {
            this.m = 22;
            this.n = 21;
        }
    }

    @Override // defpackage.kv5, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        vba vbaVar;
        int headersCount;
        int iPointToPosition;
        int i;
        if (this.o != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                vbaVar = (vba) headerViewListAdapter.getWrappedAdapter();
            } else {
                vbaVar = (vba) adapter;
                headersCount = 0;
            }
            cca item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= vbaVar.getCount()) ? null : vbaVar.getItem(i);
            cca ccaVar = this.p;
            if (ccaVar != item) {
                yba ybaVar = vbaVar.a;
                if (ccaVar != null) {
                    this.o.l(ybaVar, ccaVar);
                }
                this.p = item;
                if (item != null) {
                    this.o.r(ybaVar, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.m) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.n) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (vba) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (vba) adapter).a.d(false);
        return true;
    }

    public void setHoverListener(bca bcaVar) {
        this.o = bcaVar;
    }

    @Override // defpackage.kv5, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
