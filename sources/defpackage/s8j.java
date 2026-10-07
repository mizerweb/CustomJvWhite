package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class s8j extends LinearLayoutManager {
    public final /* synthetic */ y8j E;

    public s8j(y8j y8jVar) {
        this.E = y8jVar;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void M0(hfe hfeVar, int[] iArr) {
        y8j y8jVar = this.E;
        int offscreenPageLimit = y8jVar.getOffscreenPageLimit();
        if (offscreenPageLimit == -1) {
            super.M0(hfeVar, iArr);
            return;
        }
        int pageSize = y8jVar.getPageSize() * offscreenPageLimit;
        iArr[0] = pageSize;
        iArr[1] = pageSize;
    }

    @Override // defpackage.vee
    public final void b0(cfe cfeVar, hfe hfeVar, x4 x4Var) {
        super.b0(cfeVar, hfeVar, x4Var);
        this.E.t.getClass();
    }

    @Override // defpackage.vee
    public final void c0(cfe cfeVar, hfe hfeVar, View view, x4 x4Var) {
        int iM;
        int iM2;
        y8j y8jVar = (y8j) this.E.t.a;
        if (y8jVar.getOrientation() == 1) {
            y8jVar.g.getClass();
            iM = vee.M(view);
        } else {
            iM = 0;
        }
        if (y8jVar.getOrientation() == 0) {
            y8jVar.g.getClass();
            iM2 = vee.M(view);
        } else {
            iM2 = 0;
        }
        x4Var.i(pgg.u(false, iM, 1, iM2, 1));
    }

    @Override // defpackage.vee
    public final boolean q0(cfe cfeVar, hfe hfeVar, int i, Bundle bundle) {
        this.E.t.getClass();
        return super.q0(cfeVar, hfeVar, i, bundle);
    }

    @Override // defpackage.vee
    public final boolean w0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }
}
