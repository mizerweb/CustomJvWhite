package one.me.devmenu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.cx3;
import defpackage.dk5;
import defpackage.e55;
import defpackage.e9i;
import defpackage.fz6;
import defpackage.gm0;
import defpackage.h;
import defpackage.ha9;
import defpackage.hri;
import defpackage.j9;
import defpackage.ke3;
import defpackage.l8b;
import defpackage.lq4;
import defpackage.lu7;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.oj5;
import defpackage.qh1;
import defpackage.qj5;
import defpackage.qsf;
import defpackage.rsf;
import defpackage.syf;
import defpackage.va9;
import defpackage.vrc;
import defpackage.wa9;
import defpackage.ww3;
import defpackage.xr1;
import defpackage.xw3;
import defpackage.xx6;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.yw3;
import defpackage.zpe;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.sections.SectionRecyclerWidget;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/devmenu/DevMenuGeneralPageScreen;", "Lone/me/sdk/sections/SectionRecyclerWidget;", "Lqsf;", "Lhri;", "Landroid/os/Bundle;", "bundle", "<init>", "(Landroid/os/Bundle;)V", "Lha9;", "localAccountId", "(Lha9;)V", "dev-menu"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DevMenuGeneralPageScreen extends SectionRecyclerWidget implements qsf, hri {
    public final rsf d;
    public final qh1 e;
    public final ny8 f;
    public final l8b g;

    public DevMenuGeneralPageScreen(Bundle bundle) {
        super(bundle);
        h hVar = new h(m35getAccountScopeuqN4xOY());
        ForkJoinPool forkJoinPoolCommonPool = ForkJoinPool.commonPool();
        this.d = new rsf(this, forkJoinPoolCommonPool);
        this.e = new qh1(forkJoinPoolCommonPool, 4);
        this.f = hVar.getAccessor().b(4);
        this.g = new l8b();
    }

    @Override // defpackage.hri
    public final void I(long j, String str) {
        Object next;
        List<dk5> list = (List) this.f.getValue();
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        for (dk5 dk5Var : list) {
            Iterator it = ((Iterable) dk5Var.a().getValue()).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((e55) next).a != j);
            e55 e55Var = (e55) next;
            if (e55Var != null) {
                dk5Var.c(e55Var, str);
                return;
            }
        }
    }

    @Override // defpackage.qsf
    public final void c(long j) {
        Object next;
        List<dk5> list = (List) this.f.getValue();
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        for (dk5 dk5Var : list) {
            Iterator it = ((Iterable) dk5Var.a().getValue()).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((e55) next).a != j);
            e55 e55Var = (e55) next;
            if (e55Var != null) {
                dk5Var.b(e55Var);
                return;
            }
        }
    }

    @Override // defpackage.qsf
    public final void l(long j, boolean z) {
        Object next;
        List<dk5> list = (List) this.f.getValue();
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        for (dk5 dk5Var : list) {
            Iterator it = ((Iterable) dk5Var.a().getValue()).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((e55) next).a != j);
            e55 e55Var = (e55) next;
            if (e55Var != null) {
                dk5Var.b(e55Var);
                return;
            }
        }
    }

    @Override // one.me.sdk.sections.SectionRecyclerWidget
    /* JADX INFO: renamed from: o1, reason: from getter */
    public final qh1 getE() {
        return this.e;
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        RecyclerView recyclerViewR1 = r1(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
        linearLayout.addView(recyclerViewR1, layoutParams);
        n1g.N(new xr1(3, null, 2), linearLayout);
        return linearLayout;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        this.g.a();
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        List list = (List) this.f.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            dk5 dk5Var = (dk5) obj;
            if ((dk5Var instanceof va9) || (dk5Var instanceof wa9)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            dk5 dk5Var2 = (dk5) obj2;
            if (!(dk5Var2 instanceof va9) && !(dk5Var2 instanceof wa9)) {
                arrayList2.add(obj2);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj3 : arrayList2) {
            Object obj4 = (dk5) obj3;
            if ((obj4 instanceof syf) || (obj4 instanceof lu7) || (obj4 instanceof vrc) || (obj4 instanceof j9)) {
                obj4 = zpe.g;
            }
            Object arrayList3 = linkedHashMap.get(obj4);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap.put(obj4, arrayList3);
            }
            ((List) arrayList3).add(obj3);
        }
        Collection collectionValues = linkedHashMap.values();
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        ArrayList arrayListG1 = ww3.G1(xw3.Q0(arrayList), collectionValues);
        ArrayList arrayList4 = new ArrayList();
        int i = 0;
        for (Object obj5 : arrayListG1) {
            int i2 = i + 1;
            if (i < 0) {
                xw3.V0();
                throw null;
            }
            List list2 = (List) obj5;
            ArrayList arrayList5 = new ArrayList(yw3.W0(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList5.add(new qj5(((dk5) it.next()).a(), this, i));
            }
            cx3.Z0(arrayList5, arrayList4);
            i = i2;
        }
        e9i.j0(new fz6(new oj5((xx6[]) ww3.T1(arrayList4).toArray(new xx6[0]), 0), new ke3(this, (lq4) null, 22), 3), getLifecycleScope());
    }

    @Override // one.me.sdk.sections.SectionRecyclerWidget
    /* JADX INFO: renamed from: q1, reason: from getter */
    public final rsf getD() {
        return this.d;
    }

    public DevMenuGeneralPageScreen(ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
