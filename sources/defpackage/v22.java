package defpackage;

import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.devmenu.logsviewer.IntegrityLogsViewerScreen;
import one.me.keyboardmedia.stickers.KeyboardStickersWidget;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.sdk.gallery.MediaGalleryWidget;

/* JADX INFO: loaded from: classes4.dex */
public final class v22 extends afe {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v22(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.afe
    public void a(RecyclerView recyclerView, int i) {
        s22 s22Var;
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                if (i == 1 && (s22Var = ((w22) obj).t1) != null) {
                    CallScreen callScreen = ((px1) s22Var).a;
                    l6m l6mVar = CallScreen.D1;
                    callScreen.R1().G().b(5000L);
                    break;
                }
                break;
            case 1:
                Iterator it = ((l96) obj).n2.iterator();
                while (it.hasNext()) {
                    ((afe) it.next()).a(recyclerView, i);
                }
                break;
        }
    }

    @Override // defpackage.afe
    public void b(RecyclerView recyclerView, int i, int i2) {
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 1:
                Iterator it = ((l96) obj).n2.iterator();
                while (it.hasNext()) {
                    ((afe) it.next()).b(recyclerView, i, i2);
                }
                break;
            case 2:
                nl6 nl6Var = (nl6) obj;
                int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
                int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                int i4 = nl6Var.a;
                int iComputeVerticalScrollRange = nl6Var.s.computeVerticalScrollRange();
                int i5 = nl6Var.r;
                nl6Var.t = iComputeVerticalScrollRange - i5 > 0 && i5 >= i4;
                int iComputeHorizontalScrollRange = nl6Var.s.computeHorizontalScrollRange();
                int i6 = nl6Var.q;
                boolean z = iComputeHorizontalScrollRange - i6 > 0 && i6 >= i4;
                nl6Var.u = z;
                boolean z2 = nl6Var.t;
                if (z2 || z) {
                    if (z2) {
                        float f = i5;
                        nl6Var.l = (int) ((((f / 2.0f) + iComputeVerticalScrollOffset) * f) / iComputeVerticalScrollRange);
                        nl6Var.k = Math.min(i5, (i5 * i5) / iComputeVerticalScrollRange);
                    }
                    if (nl6Var.u) {
                        float f2 = iComputeHorizontalScrollOffset;
                        float f3 = i6;
                        nl6Var.o = (int) ((((f3 / 2.0f) + f2) * f3) / iComputeHorizontalScrollRange);
                        nl6Var.n = Math.min(i6, (i6 * i6) / iComputeHorizontalScrollRange);
                    }
                    int i7 = nl6Var.v;
                    if (i7 == 0 || i7 == 1) {
                        nl6Var.l(1);
                    }
                } else if (nl6Var.v != 0) {
                    nl6Var.l(0);
                }
                break;
            case 3:
                vee layoutManager = recyclerView.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager != null) {
                    int iZ0 = linearLayoutManager.Z0();
                    nee adapter = recyclerView.getAdapter();
                    int iL = adapter != null ? adapter.l() : 0;
                    int i8 = IntegrityLogsViewerScreen.f;
                    ((ImageView) ((IntegrityLogsViewerScreen) obj).e.getValue()).setVisibility(iZ0 >= iL - 1 ? 8 : 0);
                    break;
                }
                break;
            case 4:
                if (i != 0 || i2 != 0) {
                    a8j.x(((ez9) ((KeyboardStickersWidget) obj).d.getValue()).f, az9.a);
                }
                break;
            case 5:
                MediaGalleryWidget mediaGalleryWidget = (MediaGalleryWidget) obj;
                if (i != 0 || i2 != 0) {
                    zv8[] zv8VarArr = MediaGalleryWidget.i;
                    a8j.x(mediaGalleryWidget.q1().d, new di7(MediaGalleryWidget.o1(mediaGalleryWidget)));
                }
                break;
            case 6:
                if (i != 0 || i2 != 0) {
                    zv8[] zv8VarArr2 = MessagesListWidget.T1;
                    ((MessagesListWidget) obj).I1();
                }
                break;
            case 7:
                if (i != 0 || i2 != 0) {
                    ((x6e) obj).b();
                }
                break;
        }
    }
}
