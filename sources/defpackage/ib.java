package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import one.me.chatscreen.ChatScreen;
import one.me.chatscreen.mediabar.MediaBarWidget;
import one.me.login.neuroavatars.NeuroAvatarPickerBottomSheet;
import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.sdk.gallery.MediaGalleryWidget;
import one.me.sdk.gallery.selectalbum.SelectAlbumWidget;
import one.me.sdk.messagewrite.markdown.AddLinkBottomSheet;
import one.me.sdk.messagewrite.mention.SuggestionsWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public class ib extends xbd {
    public final /* synthetic */ int a;
    public final /* synthetic */ Widget b;

    public /* synthetic */ ib(Widget widget, int i) {
        this.a = i;
        this.b = widget;
    }

    private final void q(int i) {
    }

    @Override // defpackage.xbd
    public int a() {
        WindowInsets rootWindowInsets;
        int i = this.a;
        Widget widget = this.b;
        switch (i) {
            case 0:
                return b();
            case 1:
                return b();
            case 2:
                return 0;
            case 3:
                MessageContextMenuBottomSheet messageContextMenuBottomSheet = (MessageContextMenuBottomSheet) widget;
                v6e v6eVar = messageContextMenuBottomSheet.Y;
                if ((v6eVar == null || v6eVar.d.l() <= v6eVar.b()) && messageContextMenuBottomSheet.I1()) {
                    return 0;
                }
                return b();
            case 4:
                View view = ((NeuroAvatarPickerBottomSheet) widget).getView();
                if (view == null || (rootWindowInsets = view.getRootWindowInsets()) == null) {
                    return 0;
                }
                return ixj.g(rootWindowInsets, null).a.f(1).b;
            case 5:
            default:
                return 0;
        }
    }

    @Override // defpackage.xbd
    public int b() {
        int measuredHeight;
        int measuredHeight2;
        int paddingBottom;
        View view;
        int i = this.a;
        int measuredHeight3 = 0;
        Widget widget = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = AddLinkBottomSheet.s;
                return ((AddLinkBottomSheet) widget).requireView().getMeasuredHeight() - e().getMeasuredHeight();
            case 1:
                BaseBottomSheetWidget baseBottomSheetWidget = (BaseBottomSheetWidget) widget;
                zpe zpeVar = BaseBottomSheetWidget.i;
                measuredHeight = baseBottomSheetWidget.requireView().getMeasuredHeight();
                measuredHeight2 = baseBottomSheetWidget.s1().getMeasuredHeight();
                break;
            case 2:
                LinearLayout linearLayout = ((MediaBarWidget) widget).E;
                if (linearLayout == null) {
                    return 0;
                }
                return zo5.D(405.0f, yl5.d().getDisplayMetrics().density, linearLayout.getMeasuredHeight());
            case 3:
                MessageContextMenuBottomSheet messageContextMenuBottomSheet = (MessageContextMenuBottomSheet) widget;
                zv8[] zv8VarArr2 = MessageContextMenuBottomSheet.w1;
                if (messageContextMenuBottomSheet.I1()) {
                    paddingBottom = gm0.K(350.0f * yl5.d().getDisplayMetrics().density);
                    RecyclerView recyclerView = messageContextMenuBottomSheet.X;
                    lfe lfeVarL = recyclerView != null ? recyclerView.L(Long.MIN_VALUE) : null;
                    int iB = zo5.b(120.0f, yl5.d().getDisplayMetrics().density, (lfeVarL == null || (view = lfeVarL.a) == null) ? 0 : view.getMeasuredHeight());
                    RecyclerView recyclerView2 = messageContextMenuBottomSheet.X;
                    int paddingBottom2 = iB + (recyclerView2 != null ? recyclerView2.getPaddingBottom() : 0);
                    if (paddingBottom2 >= paddingBottom) {
                        paddingBottom = paddingBottom2;
                    }
                } else {
                    ViewGroup viewGroup = messageContextMenuBottomSheet.K;
                    if (viewGroup != null) {
                        measuredHeight3 = viewGroup.getMeasuredHeight();
                    } else {
                        View viewE = e();
                        if (viewE != null) {
                            measuredHeight3 = viewE.getMeasuredHeight();
                        }
                    }
                    paddingBottom = measuredHeight3 > 0 ? messageContextMenuBottomSheet.G1().getPaddingBottom() + messageContextMenuBottomSheet.v1 + measuredHeight3 : measuredHeight3;
                }
                int i2 = uw8.a;
                return uw8.b(uw8.c) ? uw8.a(messageContextMenuBottomSheet.getContext()) + (messageContextMenuBottomSheet.requireView().getMeasuredHeight() - paddingBottom) : messageContextMenuBottomSheet.requireView().getMeasuredHeight() - paddingBottom;
            case 4:
                NeuroAvatarPickerBottomSheet neuroAvatarPickerBottomSheet = (NeuroAvatarPickerBottomSheet) widget;
                View view2 = neuroAvatarPickerBottomSheet.getView();
                measuredHeight = view2 != null ? view2.getHeight() : Resources.getSystem().getDisplayMetrics().heightPixels;
                vv vvVar = neuroAvatarPickerBottomSheet.u;
                zv8 zv8Var = NeuroAvatarPickerBottomSheet.E[1];
                measuredHeight2 = ((Number) vvVar.a(neuroAvatarPickerBottomSheet)).intValue();
                break;
            case 5:
                return 0;
            default:
                int iD = d();
                SuggestionsWidget suggestionsWidget = (SuggestionsWidget) widget;
                zv8[] zv8VarArr3 = SuggestionsWidget.F;
                q9h q9hVar = (q9h) suggestionsWidget.J1().t.a.getValue();
                CharSequence charSequence = suggestionsWidget.J1().C().a;
                if (charSequence == null || r5h.X0(charSequence)) {
                    return iD;
                }
                ArrayList arrayList = q9hVar != null ? q9hVar.b : null;
                if (arrayList == null || arrayList.isEmpty()) {
                    return zo5.D(48.0f, yl5.d().getDisplayMetrics().density, iD - suggestionsWidget.G1().getMeasuredHeight());
                }
                View childAt = suggestionsWidget.I1().getChildAt(0);
                measuredHeight3 = childAt != null ? childAt.getHeight() : 0;
                return Math.max(zo5.D(20.0f, yl5.d().getDisplayMetrics().density, iD) - suggestionsWidget.I1().getMeasuredHeight(), iD - (measuredHeight3 > 0 ? (measuredHeight3 * 4) + gm0.K(yl5.d().getDisplayMetrics().density * 20.0f) : iD / 2));
        }
        return measuredHeight - measuredHeight2;
    }

    @Override // defpackage.xbd
    public View c() {
        int i = this.a;
        Widget widget = this.b;
        switch (i) {
            case 2:
                zv8[] zv8VarArr = MediaBarWidget.u1;
                return ((MediaBarWidget) widget).u1();
            case 6:
                SuggestionsWidget suggestionsWidget = (SuggestionsWidget) widget;
                return (View) suggestionsWidget.s.m(suggestionsWidget, SuggestionsWidget.F[4]);
            default:
                return super.c();
        }
    }

    @Override // defpackage.xbd
    public final int d() {
        int i = this.a;
        Widget widget = this.b;
        switch (i) {
            case 0:
                View view = ((AddLinkBottomSheet) widget).getView();
                if (view != null) {
                    return view.getMeasuredHeight();
                }
                return 0;
            case 1:
                View view2 = ((BaseBottomSheetWidget) widget).getView();
                if (view2 != null) {
                    return view2.getMeasuredHeight();
                }
                return 0;
            case 2:
                LinearLayout linearLayout = ((MediaBarWidget) widget).E;
                if (linearLayout != null) {
                    return linearLayout.getMeasuredHeight();
                }
                return 0;
            case 3:
                View view3 = ((MessageContextMenuBottomSheet) widget).getView();
                if (view3 != null) {
                    return view3.getMeasuredHeight();
                }
                return 0;
            case 4:
                View view4 = ((NeuroAvatarPickerBottomSheet) widget).getView();
                if (view4 != null) {
                    return view4.getMeasuredHeight();
                }
                return 0;
            case 5:
                zv8[] zv8VarArr = SelectAlbumWidget.f;
                return -((SelectAlbumWidget) widget).o1().getMeasuredHeight();
            default:
                zv8[] zv8VarArr2 = SuggestionsWidget.F;
                return ((SuggestionsWidget) widget).s1().getMeasuredHeight();
        }
    }

    @Override // defpackage.xbd
    public final View e() {
        int i = this.a;
        Widget widget = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = AddLinkBottomSheet.s;
                return ((AddLinkBottomSheet) widget).s1();
            case 1:
                return ((BaseBottomSheetWidget) widget).s1();
            case 2:
                return ((MediaBarWidget) widget).E;
            case 3:
                zv8[] zv8VarArr2 = MessageContextMenuBottomSheet.w1;
                return ((MessageContextMenuBottomSheet) widget).s1();
            case 4:
                zv8[] zv8VarArr3 = NeuroAvatarPickerBottomSheet.E;
                return ((NeuroAvatarPickerBottomSheet) widget).s1();
            case 5:
                zv8[] zv8VarArr4 = SelectAlbumWidget.f;
                return ((SelectAlbumWidget) widget).o1();
            default:
                zv8[] zv8VarArr5 = SuggestionsWidget.F;
                return ((SuggestionsWidget) widget).s1();
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    /* JADX WARN: Code duplicated, block: B:28:0x0063  */
    @Override // defpackage.xbd
    public ccd f(ccd ccdVar, ccd ccdVar2) {
        int i = this.a;
        Widget widget = this.b;
        ccd ccdVar3 = ccd.a;
        switch (i) {
            case 1:
                if (ccdVar2 == ccdVar3) {
                    ((BaseBottomSheetWidget) widget).u1();
                }
                return ccdVar2;
            case 2:
                MediaBarWidget mediaBarWidget = (MediaBarWidget) widget;
                ccd ccdVar4 = ccd.c;
                if (ccdVar2 == ccdVar4) {
                    zv8[] zv8VarArr = MediaBarWidget.u1;
                    if (mediaBarWidget.C1().z.a.getValue() != lhd.b) {
                        if (ccdVar != ccdVar4 && ccdVar2 == ccd.b) {
                            int i2 = uw8.a;
                            if (!uw8.b(uw8.c)) {
                                zv8[] zv8VarArr2 = MediaBarWidget.u1;
                                if (!((hve) mediaBarWidget.p1.m(mediaBarWidget, MediaBarWidget.u1[21])).o()) {
                                    if (ccdVar2 != ccdVar3) {
                                        ccdVar = ccdVar2;
                                    } else {
                                        zv8[] zv8VarArr3 = MediaBarWidget.u1;
                                        if (mediaBarWidget.C1().F()) {
                                            ccdVar = ccdVar2;
                                        }
                                    }
                                }
                            }
                        } else if (ccdVar2 != ccdVar3) {
                            ccdVar = ccdVar2;
                        } else {
                            zv8[] zv8VarArr4 = MediaBarWidget.u1;
                            if (mediaBarWidget.C1().F()) {
                                ccdVar = ccdVar2;
                            }
                        }
                    }
                } else if (ccdVar != ccdVar4) {
                    if (ccdVar2 != ccdVar3) {
                        ccdVar = ccdVar2;
                    } else {
                        zv8[] zv8VarArr5 = MediaBarWidget.u1;
                        if (mediaBarWidget.C1().F()) {
                            ccdVar = ccdVar2;
                        }
                    }
                } else if (ccdVar2 != ccdVar3) {
                    ccdVar = ccdVar2;
                } else {
                    zv8[] zv8VarArr6 = MediaBarWidget.u1;
                    if (mediaBarWidget.C1().F()) {
                        ccdVar = ccdVar2;
                    }
                }
                if (ccdVar == ccdVar3) {
                    zv8[] zv8VarArr7 = MediaBarWidget.u1;
                    a8j.x(mediaBarWidget.C1().v, kr9.a);
                }
                return ccdVar;
            case 3:
                if (ccdVar2 == ccdVar3) {
                    zv8[] zv8VarArr8 = MessageContextMenuBottomSheet.w1;
                }
                return ccdVar2;
            case 4:
                if (ccdVar2 == ccdVar3) {
                    zv8[] zv8VarArr9 = NeuroAvatarPickerBottomSheet.E;
                }
                return ccdVar2;
            default:
                return ccdVar2;
        }
    }

    @Override // defpackage.xbd
    public void g(float f) {
        switch (this.a) {
            case 6:
                SuggestionsWidget suggestionsWidget = (SuggestionsWidget) this.b;
                suggestionsWidget.E = true;
                suggestionsWidget.z = 0.0f;
                suggestionsWidget.A = 0.0f;
                suggestionsWidget.B = suggestionsWidget.C;
                break;
        }
    }

    @Override // defpackage.xbd
    public void h() {
        int i = this.a;
        Widget widget = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = AddLinkBottomSheet.s;
                ((AddLinkBottomSheet) widget).A1();
                break;
            case 1:
                BaseBottomSheetWidget baseBottomSheetWidget = (BaseBottomSheetWidget) widget;
                gm0.U(baseBottomSheetWidget.a, "onHidden()");
                baseBottomSheetWidget.w1();
                break;
            case 2:
                MediaBarWidget mediaBarWidget = (MediaBarWidget) widget;
                zv8[] zv8VarArr2 = MediaBarWidget.u1;
                mediaBarWidget.s1();
                as9 as9VarC1 = mediaBarWidget.C1();
                as9VarC1.s.c(pff.a);
                as9VarC1.r.c(sq9.a);
                a8j.x(as9VarC1.v, jr9.a);
                ChatScreen chatScreen = mediaBarWidget.t1;
                if (chatScreen != null) {
                    chatScreen.h.b();
                    chatScreen.k2().N(qc3.a);
                }
                mediaBarWidget.y = 0.0f;
                mediaBarWidget.z = 0.0f;
                mediaBarWidget.A = 0;
                break;
            case 3:
                zv8[] zv8VarArr3 = MessageContextMenuBottomSheet.w1;
                ((MessageContextMenuBottomSheet) widget).A1();
                break;
            case 4:
                zv8[] zv8VarArr4 = NeuroAvatarPickerBottomSheet.E;
                ((NeuroAvatarPickerBottomSheet) widget).A1();
                break;
            case 5:
                zv8[] zv8VarArr5 = SelectAlbumWidget.f;
                a8j.x(((SelectAlbumWidget) widget).q1().e, ddf.a);
                break;
            default:
                br4 br4Var = (SuggestionsWidget) widget;
                br4Var.getRouter().C(br4Var);
                break;
        }
    }

    @Override // defpackage.xbd
    public void i() {
        switch (this.a) {
            case 2:
                MediaBarWidget mediaBarWidget = (MediaBarWidget) this.b;
                zv8[] zv8VarArr = MediaBarWidget.u1;
                a8j.x(mediaBarWidget.C1().v, kr9.a);
                break;
        }
    }

    @Override // defpackage.xbd
    public boolean j() {
        switch (this.a) {
            case 2:
                MediaBarWidget mediaBarWidget = (MediaBarWidget) this.b;
                zv8[] zv8VarArr = MediaBarWidget.u1;
                return mediaBarWidget.C1().F();
            default:
                return super.j();
        }
    }

    @Override // defpackage.xbd
    public void k(ccd ccdVar) {
        int i = this.a;
        Widget widget = this.b;
        switch (i) {
            case 2:
                zv8[] zv8VarArr = MediaBarWidget.u1;
                ((MediaBarWidget) widget).t1();
                break;
            case 6:
                ((SuggestionsWidget) widget).E = false;
                p(ccdVar == ccd.c);
                break;
        }
    }

    @Override // defpackage.xbd
    public void l(ccd ccdVar) {
        switch (this.a) {
            case 6:
                ((SuggestionsWidget) this.b).E = false;
                p(ccdVar == ccd.c);
                break;
        }
    }

    @Override // defpackage.xbd
    public void m(int i) {
        int i2 = this.a;
        Widget widget = this.b;
        switch (i2) {
            case 2:
                MediaBarWidget mediaBarWidget = (MediaBarWidget) widget;
                float f = i;
                mediaBarWidget.z = f;
                if (mediaBarWidget.isAttached()) {
                    float fU = oc9.u(f / gm0.K(48.0f * yl5.d().getDisplayMetrics().density), 0.0f, 1.0f);
                    View view = mediaBarWidget.getView();
                    WindowInsets rootWindowInsets = view != null ? view.getRootWindowInsets() : null;
                    int i3 = rootWindowInsets != null ? ixj.g(rootWindowInsets, null).a.f(519).b : 0;
                    j8e j8eVar = mediaBarWidget.o;
                    zv8[] zv8VarArr = MediaBarWidget.u1;
                    int measuredHeight = (i3 - ((FrameLayout) j8eVar.m(mediaBarWidget, zv8VarArr[7])).getMeasuredHeight()) - i;
                    if (measuredHeight < 0) {
                        measuredHeight = 0;
                    }
                    LinearLayout linearLayout = mediaBarWidget.E;
                    if (linearLayout != null) {
                        linearLayout.setPadding(linearLayout.getPaddingLeft(), measuredHeight, linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
                    }
                    mediaBarWidget.B.a = 12.0f * fU * yl5.d().getDisplayMetrics().density;
                    LinearLayout linearLayout2 = mediaBarWidget.E;
                    if (linearLayout2 != null) {
                        linearLayout2.invalidateOutline();
                    }
                    ((FrameLayout) mediaBarWidget.n.m(mediaBarWidget, zv8VarArr[6])).setAlpha(fU);
                    mediaBarWidget.B1().setShowDropdown(i <= 0);
                    MediaBarWidget.r1(mediaBarWidget);
                }
                break;
            case 3:
                MessageContextMenuBottomSheet messageContextMenuBottomSheet = (MessageContextMenuBottomSheet) widget;
                zv8[] zv8VarArr2 = MessageContextMenuBottomSheet.w1;
                if (messageContextMenuBottomSheet.isAttached() && messageContextMenuBottomSheet.I1()) {
                    float fU2 = oc9.u(i / gm0.K(76.0f * yl5.d().getDisplayMetrics().density), 0.0f, 1.0f);
                    if (fU2 == 1.0f) {
                        messageContextMenuBottomSheet.G1().getMeasuredHeight();
                    }
                    rcc rccVar = (rcc) messageContextMenuBottomSheet.findViewById(R.id.oneme_bottom_sheet_toolbar);
                    if (rccVar != null) {
                        float f2 = 1.0f - fU2;
                        rccVar.setAlpha(f2);
                        int measuredHeight2 = (int) (f2 * rccVar.getMeasuredHeight());
                        RecyclerView recyclerView = messageContextMenuBottomSheet.X;
                        if (recyclerView != null) {
                            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
                            if (layoutParams == null) {
                                ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            } else {
                                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                                marginLayoutParams.topMargin = measuredHeight2;
                                recyclerView.setLayoutParams(marginLayoutParams);
                            }
                        }
                        ViewGroup viewGroupG1 = messageContextMenuBottomSheet.G1();
                        ViewGroup.LayoutParams layoutParams2 = viewGroupG1.getLayoutParams();
                        if (layoutParams2 == null) {
                            ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        } else {
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                            marginLayoutParams2.topMargin = (int) (messageContextMenuBottomSheet.v1 * fU2);
                            viewGroupG1.setLayoutParams(marginLayoutParams2);
                        }
                    }
                    messageContextMenuBottomSheet.u1.a = 20.0f * fU2 * yl5.d().getDisplayMetrics().density;
                    messageContextMenuBottomSheet.G1().invalidateOutline();
                    mt5 mt5Var = messageContextMenuBottomSheet.o;
                    if (mt5Var != null) {
                        mt5Var.setAlpha(fU2);
                    }
                    break;
                }
                break;
            case 5:
                zv8[] zv8VarArr3 = SelectAlbumWidget.f;
                a8j.x(((SelectAlbumWidget) widget).q1().e, new bdf(e().getMeasuredHeight() + i));
                break;
            case 6:
                if (((SuggestionsWidget) widget).getView() != null) {
                    o(i);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.xbd
    public boolean n(ccd ccdVar, float f, float f2) {
        boolean zContains;
        reh rehVar;
        RecyclerView recyclerView;
        boolean zCanScrollVertically;
        int i = this.a;
        Widget widget = this.b;
        switch (i) {
            case 2:
                MediaBarWidget mediaBarWidget = (MediaBarWidget) widget;
                zv8[] zv8VarArr = MediaBarWidget.u1;
                if (mediaBarWidget.v1().n || rx8.C(mediaBarWidget.A1().a) != null) {
                    return false;
                }
                LinearLayout linearLayoutU1 = mediaBarWidget.u1();
                Rect rect = n9j.a;
                n9j.e(rect, linearLayoutU1);
                int i2 = (int) f;
                int i3 = (int) f2;
                if (rect.contains(i2, i3)) {
                    return false;
                }
                g8c g8cVar = mediaBarWidget.m;
                if (g8cVar == null || (rehVar = (reh) g8cVar.a.e) == null) {
                    zContains = false;
                } else {
                    n9j.e(rect, rehVar);
                    zContains = rect.contains(i2, i3);
                }
                if (zContains || mediaBarWidget.y1().getVisibility() == 0) {
                    return false;
                }
                br4 br4VarC = rx8.C(MediaBarWidget.o1(mediaBarWidget).a);
                MediaGalleryWidget mediaGalleryWidget = br4VarC instanceof MediaGalleryWidget ? (MediaGalleryWidget) br4VarC : null;
                return !((mediaGalleryWidget == null || !mediaGalleryWidget.isAttached()) ? false : mediaGalleryWidget.p1().canScrollVertically(-1));
            case 3:
                MessageContextMenuBottomSheet messageContextMenuBottomSheet = (MessageContextMenuBottomSheet) widget;
                v6e v6eVar = messageContextMenuBottomSheet.Y;
                boolean zCanScrollVertically2 = (v6eVar == null || (recyclerView = v6eVar.e) == null) ? false : recyclerView.canScrollVertically(-1);
                RecyclerView recyclerView2 = messageContextMenuBottomSheet.X;
                return ((recyclerView2 != null ? recyclerView2.canScrollVertically(-1) : false) || zCanScrollVertically2) ? false : true;
            case 4:
                NeuroAvatarPickerBottomSheet neuroAvatarPickerBottomSheet = (NeuroAvatarPickerBottomSheet) widget;
                zCanScrollVertically = ((RecyclerView) neuroAvatarPickerBottomSheet.C.m(neuroAvatarPickerBottomSheet, NeuroAvatarPickerBottomSheet.E[3])).canScrollVertically(-1);
                break;
            case 5:
                zv8[] zv8VarArr2 = SelectAlbumWidget.f;
                zCanScrollVertically = ((SelectAlbumWidget) widget).o1().canScrollVertically(1);
                break;
            case 6:
                zv8[] zv8VarArr3 = SuggestionsWidget.F;
                return ((LinearLayoutManager) ((SuggestionsWidget) widget).I1().getLayoutManager()).U0() == 0;
            default:
                return super.n(ccdVar, f, f2);
        }
        return !zCanScrollVertically;
    }

    public void o(int i) {
        float fU = oc9.u(tqk.b(b(), 0.0f, i), 0.0f, 1.0f);
        SuggestionsWidget suggestionsWidget = (SuggestionsWidget) this.b;
        suggestionsWidget.D1().setAlpha(fU);
        suggestionsWidget.E1().setEnabled(fU > 0.5f);
        suggestionsWidget.F1().setAlpha(1.0f - fU);
        suggestionsWidget.F1().setVisibility(fU < 1.0f ? 0 : 8);
        suggestionsWidget.y.a = tqk.c(yl5.d().getDisplayMetrics().density * 20.0f, yl5.d().getDisplayMetrics().density * 0.0f, fU);
        suggestionsWidget.H1().invalidateOutline();
        if (!suggestionsWidget.E && suggestionsWidget.B == suggestionsWidget.C) {
            p(fU >= 0.5f);
        }
        float f = suggestionsWidget.B;
        float f2 = suggestionsWidget.C;
        if (f != f2 && fU == f2) {
            suggestionsWidget.z = 0.0f;
            suggestionsWidget.A = 0.0f;
            suggestionsWidget.B = f2;
        }
        float f3 = suggestionsWidget.B;
        float fU2 = f3 != f2 ? oc9.u(tqk.b(f3, f2, fU), 0.0f, 1.0f) : 1.0f;
        suggestionsWidget.I1().setTranslationY(tqk.c(suggestionsWidget.z, 0.0f, fU2));
        suggestionsWidget.G1().setTranslationY(tqk.c(suggestionsWidget.A, 0.0f, fU2));
    }

    public void p(boolean z) {
        SuggestionsWidget suggestionsWidget = (SuggestionsWidget) this.b;
        if (z == suggestionsWidget.D) {
            return;
        }
        int height = suggestionsWidget.D1().getHeight();
        if (z && height == 0) {
            return;
        }
        int iK = suggestionsWidget.D ? height : gm0.K(yl5.d().getDisplayMetrics().density * 20.0f);
        int iK2 = z ? height : gm0.K(20.0f * yl5.d().getDisplayMetrics().density);
        int iK3 = suggestionsWidget.D ? height : gm0.K(yl5.d().getDisplayMetrics().density * 8.0f);
        if (!z) {
            height = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
        }
        int i = height;
        float fU = oc9.u(tqk.b(b(), 0.0f, suggestionsWidget.s1().getTop()), 0.0f, 1.0f);
        l96 l96VarI1 = suggestionsWidget.I1();
        ViewGroup.LayoutParams layoutParams = l96VarI1.getLayoutParams();
        if (layoutParams == null) {
            ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = iK2;
        l96VarI1.setLayoutParams(marginLayoutParams);
        AppCompatTextView appCompatTextViewG1 = suggestionsWidget.G1();
        ViewGroup.LayoutParams layoutParams2 = appCompatTextViewG1.getLayoutParams();
        if (layoutParams2 == null) {
            ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.topMargin = i;
        appCompatTextViewG1.setLayoutParams(marginLayoutParams2);
        suggestionsWidget.D = z;
        wf4 wf4VarH1 = suggestionsWidget.H1();
        bdc.a(wf4VarH1, new bah(wf4VarH1, suggestionsWidget, iK, iK2, iK3, i, fU, z, this));
    }
}
