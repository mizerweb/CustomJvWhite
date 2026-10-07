package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.Iterator;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.calls.ui.ui.call.panels.CallEventsWidget;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.chatscreen.ChatScreen;
import one.me.chatscreen.mediabar.MediaBarWidget;
import one.me.stories.edit.EditStoryScreen;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ci1 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ci1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.a;
        Object obj = this.b;
        switch (i9) {
            case 0:
                Iterator it = ((CallEventsWidget) obj).f.iterator();
                while (it.hasNext()) {
                    CallScreen callScreen = ((bx1) it.next()).a;
                    l6m l6mVar = CallScreen.D1;
                    callScreen.P1().c();
                }
                break;
            case 1:
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) obj;
                if (i != i5 || i2 != i6 || i3 != i7 || i4 != i8) {
                    view.post(new jj2(2, carouselLayoutManager));
                }
                break;
            case 2:
                ChatMediaViewerScreen chatMediaViewerScreen = (ChatMediaViewerScreen) obj;
                zv8[] zv8VarArr = ChatMediaViewerScreen.Z;
                if (chatMediaViewerScreen.getView() != null && i4 != i8) {
                    TextView textViewT1 = chatMediaViewerScreen.T1();
                    ViewGroup.LayoutParams layoutParams = textViewT1.getLayoutParams();
                    if (layoutParams == null) {
                        ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    } else {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.topMargin = zo5.b(8.0f, yl5.d().getDisplayMetrics().density, i4);
                        textViewT1.setLayoutParams(marginLayoutParams);
                    }
                    break;
                }
                break;
            case 3:
                ChatScreen chatScreen = (ChatScreen) obj;
                j8e j8eVar = chatScreen.u1;
                ou7 ou7Var = ChatScreen.L1;
                if (chatScreen.getView() != null) {
                    int measuredHeight = view.getMeasuredHeight() - view.getPaddingBottom();
                    ViewGroup.LayoutParams layoutParams2 = chatScreen.d2().getLayoutParams();
                    if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams)) {
                        layoutParams2 = null;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    if (measuredHeight != (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0)) {
                        ((ViewGroup.MarginLayoutParams) chatScreen.d2().getLayoutParams()).bottomMargin = Math.max(measuredHeight, gm0.K(48.0f * yl5.d().getDisplayMetrics().density));
                    }
                    int measuredHeight2 = view.getMeasuredHeight();
                    ViewGroup.LayoutParams layoutParams3 = chatScreen.j2().getLayoutParams();
                    if (!(layoutParams3 instanceof ViewGroup.MarginLayoutParams)) {
                        layoutParams3 = null;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                    if (measuredHeight2 != (marginLayoutParams3 != null ? marginLayoutParams3.bottomMargin : 0)) {
                        ViewGroup.LayoutParams layoutParams4 = chatScreen.j2().getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                        if (marginLayoutParams4 != null) {
                            marginLayoutParams4.bottomMargin = view.getMeasuredHeight();
                        }
                    }
                    int measuredHeight3 = view.getMeasuredHeight();
                    zv8[] zv8VarArr2 = ChatScreen.M1;
                    if (measuredHeight3 != ((LinearLayout) j8eVar.m(chatScreen, zv8VarArr2[15])).getPaddingBottom()) {
                        LinearLayout linearLayout = (LinearLayout) j8eVar.m(chatScreen, zv8VarArr2[15]);
                        linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), view.getMeasuredHeight());
                    }
                    break;
                }
                break;
            case 4:
                zv8[] zv8VarArr3 = EditStoryScreen.A1;
                oyg oygVar = ((EditStoryScreen) obj).C1().s;
                oygVar.c = i3 - i;
                oygVar.d = i4 - i2;
                break;
            case 5:
                MediaBarWidget mediaBarWidget = (MediaBarWidget) obj;
                zv8[] zv8VarArr4 = MediaBarWidget.u1;
                if (mediaBarWidget.getView() != null) {
                    int i10 = i4 - i2;
                    tp2 tp2Var = (tp2) mediaBarWidget.q.m(mediaBarWidget, MediaBarWidget.u1[9]);
                    tp2Var.setPadding(tp2Var.getPaddingLeft(), tp2Var.getPaddingTop(), tp2Var.getPaddingRight(), i10);
                    int iMax = Math.max(i10, gm0.K(48.0f * yl5.d().getDisplayMetrics().density));
                    ViewGroup.LayoutParams layoutParams5 = mediaBarWidget.z1().getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) (layoutParams5 instanceof ViewGroup.MarginLayoutParams ? layoutParams5 : null);
                    if ((marginLayoutParams5 != null ? marginLayoutParams5.bottomMargin : 0) != iMax) {
                        tp2 tp2VarZ1 = mediaBarWidget.z1();
                        ViewGroup.LayoutParams layoutParams6 = tp2VarZ1.getLayoutParams();
                        if (layoutParams6 == null) {
                            ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        } else {
                            ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) layoutParams6;
                            marginLayoutParams6.bottomMargin = iMax;
                            tp2VarZ1.setLayoutParams(marginLayoutParams6);
                        }
                    }
                    break;
                } else {
                    String str = mediaBarWidget.a;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.f;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str, "View is null into lcl", null);
                        }
                        break;
                    }
                }
                break;
            default:
                ghd ghdVar = (ghd) obj;
                if (i3 - i != i7 - i5 || i4 - i2 != i8 - i6) {
                    ghdVar.b();
                    ghdVar.a(true);
                }
                break;
        }
    }
}
