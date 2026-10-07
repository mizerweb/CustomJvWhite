package defpackage;

import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes4.dex */
public final class v0i extends sr implements q1i {
    public final String c;
    public boolean d;

    public v0i() {
        super(new u8h(14));
        this.c = v0i.class.getName();
    }

    @Override // defpackage.q1i
    public final void f(int i) {
        int i2;
        if (i == 0) {
            return;
        }
        u0i u0iVar = (u0i) Q();
        int i3 = q0i.$EnumSwitchMapping$0[qt4.D(i)];
        if (i3 == 1) {
            i2 = 1;
        } else if (i3 != 2) {
            i2 = 3;
            if (i3 != 3) {
                i2 = 0;
            }
        } else {
            i2 = 2;
        }
        u0iVar.b(i2, true);
        boolean z = i == 2;
        if (this.d == z) {
            gm0.n(this.c, "applyTranscriptionState: isExpanded == expanded");
            return;
        }
        this.d = z;
        ViewParent viewParent = (ViewGroup) this.a;
        if (viewParent == null) {
            viewParent = null;
        }
        ((p1i) viewParent).a();
    }

    @Override // defpackage.q1i
    public final Point getPosition() {
        int[] iArr = new int[2];
        View viewR = R();
        if (viewR == null || this.d) {
            return null;
        }
        viewR.getLocationOnScreen(iArr);
        return new Point((viewR.getMeasuredWidth() / 2) + iArr[0], iArr[1]);
    }

    @Override // defpackage.q1i
    public final boolean q() {
        return this.d;
    }
}
