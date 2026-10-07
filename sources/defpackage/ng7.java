package defpackage;

import android.app.Application;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import androidx.biometric.BiometricFragment;
import androidx.biometric.BiometricViewModel;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import one.me.chatscreen.mediabar.mediatypepicker.MediaTypePickerWidget;
import one.me.folders.edit.FolderEditScreen;
import one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget;
import one.me.sdk.uikit.common.span.FitFontImageSpan;
import one.me.settings.privacy.ui.onboarding.SafeModeOnboardingScreen;
import one.me.stickerspreview.set.StickerSetBottomSheet;
import one.me.stickerssettings.stickersscreen.StickersScreen;
import one.me.stickersshowcase.StickersShowcaseScreen;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes2.dex */
public final class ng7 implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ ng7(View view, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [ng7] */
    /* JADX WARN: Type inference failed for: r13v1, types: [ng7] */
    /* JADX WARN: Type inference failed for: r13v5, types: [bp2] */
    /* JADX WARN: Type inference failed for: r5v0, types: [e89] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.view.ViewGroup$MarginLayoutParams] */
    /* JADX WARN: Type inference failed for: r5v32 */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable thP;
        wba wbaVar;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Drawable downloadDrawable;
        int iNextIndex;
        String str;
        mzj mzjVar;
        int i = 0;
        ?? r5 = 0;
        try {
            switch (this.a) {
                case 0:
                    jg7 jg7Var = (jg7) this.c;
                    Future future = (Future) this.b;
                    if ((future instanceof o1) && (thP = ((o1) future).p()) != null) {
                        jg7Var.onFailure(thP);
                        return;
                    }
                    try {
                        jg7Var.a(rx8.F(future));
                        return;
                    } catch (ExecutionException e) {
                        jg7Var.onFailure(e.getCause());
                        return;
                    } catch (Throwable th) {
                        jg7Var.onFailure(th);
                        return;
                    }
                case 1:
                    j8 j8Var = (j8) this.b;
                    m8 m8Var = (m8) this.c;
                    yba ybaVar = m8Var.c;
                    if (ybaVar != null && (wbaVar = ybaVar.e) != null) {
                        wbaVar.w(ybaVar);
                    }
                    View view = (View) m8Var.h;
                    if (view != null && view.getWindowToken() != null) {
                        if (j8Var.b()) {
                            m8Var.s = j8Var;
                        } else if (j8Var.e != null) {
                            j8Var.d(0, 0, false, false);
                            m8Var.s = j8Var;
                        }
                    }
                    m8Var.u = null;
                    return;
                case 2:
                    ((Application) this.b).unregisterActivityLifecycleCallbacks((q9) this.c);
                    return;
                case 3:
                    BiometricViewModel biometricViewModel = ((BiometricFragment) this.c).v1;
                    if (biometricViewModel.b == null) {
                        biometricViewModel.b = new ex0();
                    }
                    biometricViewModel.b.c((bx0) this.b);
                    return;
                case 4:
                    try {
                        bp2 bp2Var = (bp2) this.c;
                        Object objE = o9b.e((e89) this.b);
                        r72 r72Var = bp2Var.b;
                        if (r72Var != null) {
                            r72Var.b(objE);
                        }
                        break;
                    } catch (CancellationException unused) {
                        ((bp2) this.c).cancel(false);
                    } catch (ExecutionException e2) {
                        bp2 bp2Var2 = (bp2) this.c;
                        Throwable cause = e2.getCause();
                        r72 r72Var2 = bp2Var2.b;
                        if (r72Var2 != null) {
                            r72Var2.d(cause);
                        }
                    }
                    return;
                case 5:
                    rb5 rb5Var = (rb5) this.c;
                    ArrayList<pb5> arrayList = (ArrayList) this.b;
                    for (pb5 pb5Var : arrayList) {
                        ArrayList arrayList2 = rb5Var.r;
                        lfe lfeVar = pb5Var.a;
                        View view2 = lfeVar == null ? null : lfeVar.a;
                        lfe lfeVar2 = pb5Var.b;
                        View view3 = lfeVar2 != null ? lfeVar2.a : null;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(rb5Var.f);
                            arrayList2.add(pb5Var.a);
                            duration.translationX(pb5Var.e - pb5Var.c);
                            duration.translationY(pb5Var.f - pb5Var.d);
                            duration.alpha(0.0f).setListener(new ob5(rb5Var, pb5Var, duration, view2, 0)).start();
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator viewPropertyAnimatorAnimate = view3.animate();
                            arrayList2.add(pb5Var.b);
                            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(rb5Var.f).alpha(1.0f).setListener(new ob5(rb5Var, pb5Var, viewPropertyAnimatorAnimate, view3, 1)).start();
                        }
                    }
                    arrayList.clear();
                    rb5Var.n.remove(arrayList);
                    return;
                case 6:
                    FitFontImageSpan fitFontImageSpan = (FitFontImageSpan) this.c;
                    View view4 = (View) this.b;
                    if (view4 instanceof TextView) {
                        soh.b((TextView) view4, fitFontImageSpan);
                        return;
                    } else {
                        if (view4 instanceof trb) {
                            l8j.b((trb) view4, fitFontImageSpan);
                            return;
                        }
                        return;
                    }
                case 7:
                    View view5 = (View) this.b;
                    FolderEditScreen folderEditScreen = (FolderEditScreen) this.c;
                    RecyclerView recyclerView = (RecyclerView) folderEditScreen.h.m(folderEditScreen, FolderEditScreen.i[4]);
                    int measuredHeight = view5.getMeasuredHeight();
                    ViewGroup.LayoutParams layoutParams = view5.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    }
                    if (r5 != 0) {
                        r5 = marginLayoutParams;
                        i = ((ViewGroup.MarginLayoutParams) r5).bottomMargin;
                    }
                    r5 = marginLayoutParams;
                    recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), zo5.b(12.0f, yl5.d().getDisplayMetrics().density, measuredHeight + i));
                    return;
                case 8:
                    int[] iArr = new int[2];
                    View view6 = (View) this.b;
                    view6.getLocationInWindow(iArr);
                    int[] iArr2 = new int[2];
                    xy7 xy7Var = (xy7) this.c;
                    xy7Var.a.getLocationInWindow(iArr2);
                    int i2 = iArr[1] - iArr2[1];
                    int height = view6.getHeight();
                    lgb lgbVar = xy7Var.e;
                    ViewGroup.LayoutParams layoutParams2 = lgbVar.getLayoutParams();
                    if (layoutParams2 == null) {
                        p51.d();
                        return;
                    }
                    layoutParams2.height = height;
                    layoutParams2.width = gm0.K(80.0f * yl5.d().getDisplayMetrics().density);
                    lgbVar.setLayoutParams(layoutParams2);
                    xd1 xd1Var = xy7Var.c;
                    float f = i2;
                    xd1Var.setTranslationY(((height / 2.0f) + f) - ((int) (xd1Var.getPullViewMovementParams$calls_ui().a & 4294967295L)));
                    lgbVar.invalidate();
                    lgbVar.requestLayout();
                    lgbVar.setY(f);
                    xy7Var.x = true;
                    return;
                case 9:
                    t58 t58Var = (t58) this.b;
                    ny8 ny8Var = t58Var.z;
                    if (t58Var.u) {
                        downloadDrawable = (Drawable) ny8Var.getValue();
                    } else {
                        l58 l58Var = (l58) this.c;
                        if (l58Var instanceof j58) {
                            downloadDrawable = (Drawable) ny8Var.getValue();
                        } else if (l58Var instanceof i58) {
                            downloadDrawable = t58Var.getOverlayDrawable();
                        } else {
                            if (!(l58Var instanceof k58)) {
                                ore.o();
                                return;
                            }
                            downloadDrawable = t58Var.getDownloadDrawable();
                        }
                    }
                    ((wj7) t58Var.getHierarchy()).k(downloadDrawable);
                    return;
                case 10:
                    synchronized (((e99) this.c).c) {
                        try {
                            Object objMo41apply = ((e99) this.c).d.mo41apply(this.b);
                            e99 e99Var = (e99) this.c;
                            Object obj = e99Var.a;
                            if (obj == null && objMo41apply != null) {
                                e99Var.a = objMo41apply;
                                e99Var.e.i(objMo41apply);
                            } else if (obj != null && !obj.equals(objMo41apply)) {
                                e99 e99Var2 = (e99) this.c;
                                e99Var2.a = objMo41apply;
                                e99Var2.e.i(objMo41apply);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                    return;
                case 11:
                    g85 g85Var = (g85) this.c;
                    u2a u2aVar = (u2a) this.b;
                    ArrayList arrayList3 = (ArrayList) g85Var.a;
                    if (!arrayList3.isEmpty()) {
                        d38 d38VarA = u2aVar.a();
                        if (d38VarA != null) {
                            Iterator it = arrayList3.iterator();
                            while (it.hasNext()) {
                                ((Bundle) it.next()).putBinder("extra_session_binder", d38VarA.asBinder());
                            }
                        }
                        arrayList3.clear();
                    }
                    ns9 ns9Var = (ns9) g85Var.b;
                    ns9Var.getClass();
                    ns9Var.setSessionToken(u2aVar.b);
                    return;
                case 12:
                    MediaTypePickerWidget mediaTypePickerWidget = (MediaTypePickerWidget) this.b;
                    List list = (List) this.c;
                    if (mediaTypePickerWidget.getView() != null) {
                        ListIterator listIterator = list.listIterator(list.size());
                        while (true) {
                            if (!listIterator.hasPrevious()) {
                                iNextIndex = -1;
                            } else if (((n7a) listIterator.previous()).d) {
                                iNextIndex = listIterator.nextIndex();
                            }
                        }
                        if (iNextIndex != -1) {
                            ((RecyclerView) mediaTypePickerWidget.h.m(mediaTypePickerWidget, MediaTypePickerWidget.i[2])).w0(iNextIndex);
                            return;
                        }
                        return;
                    }
                    return;
                case 13:
                    ((dka) this.b).setLayout((aka) this.c);
                    return;
                case 14:
                    ote oteVarD = ((kwb) this.b).b.d();
                    if (oteVarD != null) {
                        oteVarD.draw((Canvas) this.c);
                        return;
                    }
                    return;
                case 15:
                    super/*android.view.View*/.draw((Canvas) this.c);
                    return;
                case 16:
                    super/*android.view.View*/.invalidateDrawable((Drawable) this.c);
                    return;
                case 17:
                    p1c p1cVar = (p1c) this.b;
                    t7c t7cVar = (t7c) this.c;
                    ViewGroup.LayoutParams layoutParams3 = p1cVar.getLayoutParams();
                    if (layoutParams3 == null) {
                        ore.n("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        return;
                    }
                    int measuredWidth = t7cVar.getMeasuredWidth();
                    ViewGroup.LayoutParams layoutParams4 = ((View) t7cVar.q.getValue()).getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                    layoutParams3.width = measuredWidth - (marginLayoutParams2 != null ? marginLayoutParams2.leftMargin : 0);
                    p1cVar.setLayoutParams(layoutParams3);
                    return;
                case 18:
                    ((q9c) this.b).removeCallbacks((Runnable) this.c);
                    return;
                case 19:
                    View view7 = (View) this.b;
                    xbd callback = ((ecd) this.c).getCallback();
                    if (callback != null) {
                        callback.m(view7.getTop());
                        return;
                    }
                    return;
                case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                    ProfileEditAdminPermissionsWidget profileEditAdminPermissionsWidget = (ProfileEditAdminPermissionsWidget) this.b;
                    RecyclerView recyclerView2 = (RecyclerView) profileEditAdminPermissionsWidget.i.m(profileEditAdminPermissionsWidget, ProfileEditAdminPermissionsWidget.n[4]);
                    cyb cybVar = (cyb) this.c;
                    int measuredHeight2 = cybVar.getMeasuredHeight();
                    ViewGroup.LayoutParams layoutParams5 = cybVar.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams5 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams5 : null;
                    int i3 = measuredHeight2 + (marginLayoutParams3 != null ? marginLayoutParams3.bottomMargin : 0);
                    ViewGroup.LayoutParams layoutParams6 = cybVar.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams6 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams6 : null;
                    recyclerView2.setPadding(recyclerView2.getPaddingLeft(), recyclerView2.getPaddingTop(), recyclerView2.getPaddingRight(), i3 + (marginLayoutParams4 != null ? marginLayoutParams4.topMargin : 0));
                    return;
                case 21:
                    t6e t6eVar = (t6e) this.b;
                    r6e r6eVar = (r6e) this.c;
                    if (t6eVar.k == r6eVar) {
                        r6eVar.b(t6eVar.j);
                        return;
                    }
                    return;
                case 22:
                    View view8 = (View) this.b;
                    SafeModeOnboardingScreen safeModeOnboardingScreen = (SafeModeOnboardingScreen) this.c;
                    wf4 wf4Var = (wf4) safeModeOnboardingScreen.e.m(safeModeOnboardingScreen, SafeModeOnboardingScreen.f[1]);
                    int measuredHeight3 = view8.getMeasuredHeight();
                    ViewGroup.LayoutParams layoutParams7 = view8.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams5 = layoutParams7 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams7 : null;
                    int i4 = measuredHeight3 + (marginLayoutParams5 != null ? marginLayoutParams5.bottomMargin : 0);
                    ViewGroup.LayoutParams layoutParams8 = view8.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams6 = layoutParams8 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams8 : null;
                    wf4Var.setPaddingRelative(wf4Var.getPaddingStart(), wf4Var.getPaddingTop(), wf4Var.getPaddingEnd(), i4 + (marginLayoutParams6 != null ? marginLayoutParams6.topMargin : 0));
                    return;
                case 23:
                    ArrayList arrayList4 = (ArrayList) this.b;
                    int size = arrayList4.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        View view9 = (View) arrayList4.get(i5);
                        WeakHashMap weakHashMap = i7j.a;
                        String strF = y6j.f(view9);
                        if (strF != null) {
                            mw mwVar = ((kzf) this.c).g;
                            int i6 = mwVar.c;
                            int i7 = 0;
                            while (true) {
                                if (i7 >= i6) {
                                    str = null;
                                } else if (strF.equals(mwVar.i(i7))) {
                                    str = (String) mwVar.f(i7);
                                } else {
                                    i7++;
                                }
                            }
                            y6j.m(view9, str);
                        }
                    }
                    return;
                case 24:
                    RecyclerView recyclerView3 = (RecyclerView) this.b;
                    recyclerView3.setPadding(recyclerView3.getPaddingLeft(), recyclerView3.getPaddingTop(), recyclerView3.getPaddingRight(), StickerSetBottomSheet.D1((StickerSetBottomSheet) this.c));
                    return;
                case 25:
                    View view10 = (View) this.b;
                    StickersScreen stickersScreen = (StickersScreen) this.c;
                    zv8[] zv8VarArr = StickersScreen.m;
                    RecyclerView recyclerViewP1 = stickersScreen.p1();
                    ViewGroup.LayoutParams layoutParams9 = recyclerViewP1.getLayoutParams();
                    if (layoutParams9 == null) {
                        ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        return;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) layoutParams9;
                    int measuredHeight4 = view10.getMeasuredHeight();
                    ViewGroup.LayoutParams layoutParams10 = view10.getLayoutParams();
                    if (!(layoutParams10 instanceof ViewGroup.MarginLayoutParams)) {
                        layoutParams10 = null;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams8 = (ViewGroup.MarginLayoutParams) layoutParams10;
                    int i8 = measuredHeight4 + (marginLayoutParams8 != null ? marginLayoutParams8.bottomMargin : 0);
                    ViewGroup.LayoutParams layoutParams11 = view10.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams9 = (ViewGroup.MarginLayoutParams) (layoutParams11 instanceof ViewGroup.MarginLayoutParams ? layoutParams11 : null);
                    marginLayoutParams7.bottomMargin = i8 + (marginLayoutParams9 != null ? marginLayoutParams9.topMargin : 0);
                    recyclerViewP1.setLayoutParams(marginLayoutParams7);
                    return;
                case 26:
                    k96 k96Var = (k96) this.b;
                    ViewGroup.LayoutParams layoutParams12 = k96Var.getLayoutParams();
                    if (layoutParams12 == null) {
                        ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        return;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams10 = (ViewGroup.MarginLayoutParams) layoutParams12;
                    StickersShowcaseScreen stickersShowcaseScreen = (StickersShowcaseScreen) this.c;
                    zv8[] zv8VarArr2 = StickersShowcaseScreen.m;
                    marginLayoutParams10.topMargin = ((rcc) stickersShowcaseScreen.g.m(stickersShowcaseScreen, StickersShowcaseScreen.m[1])).getMeasuredHeight();
                    k96Var.setLayoutParams(marginLayoutParams10);
                    return;
                case 27:
                    ijd ijdVar = ((qfh) this.c).a.f;
                    String str2 = (String) this.b;
                    synchronized (ijdVar.k) {
                        try {
                            h0k h0kVarC = ijdVar.c(str2);
                            mzjVar = h0kVarC != null ? h0kVarC.a : null;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    if (mzjVar == null || cqk.d(kg4.j, mzjVar.j)) {
                        return;
                    }
                    synchronized (((qfh) this.c).c) {
                        ((qfh) this.c).f.put(wk8.n(mzjVar), mzjVar);
                        qfh qfhVar = (qfh) this.c;
                        jw8 jw8Var = qfhVar.h;
                        xt4 xt4Var = qfhVar.b.b;
                        String str3 = byj.a;
                        ((qfh) this.c).g.put(wk8.n(mzjVar), yab.i0(cqk.a(xt4Var), null, 0, new rjj(jw8Var, mzjVar, qfhVar, null, 11), 3));
                        break;
                    }
                    return;
                case 28:
                    hrh hrhVar = ((grh) this.c).c;
                    Pair pair = (Pair) this.b;
                    lq0 lq0Var = (lq0) pair.first;
                    es0 es0Var = (es0) pair.second;
                    es0Var.c.d(es0Var, "ThrottlingProducer", null);
                    hrhVar.a.b(new grh(hrhVar, lq0Var), es0Var);
                    return;
                default:
                    ((jzh) this.b).d = true;
                    ((kzh) this.c).a.remove((jzh) this.b);
                    return;
            }
        } finally {
            ((bp2) this.c).g = null;
        }
        ((bp2) this.c).g = null;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                euc eucVar = new euc(ng7.class.getSimpleName());
                jg7 jg7Var = (jg7) this.c;
                fik fikVar = new fik(22, false);
                ((fik) eucVar.d).c = fikVar;
                eucVar.d = fikVar;
                fikVar.b = jg7Var;
                return eucVar.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ ng7(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ ng7(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }
}
