package defpackage;

import android.view.View;
import one.me.chatmedia.viewer.BaseMediaViewerScreen;
import one.me.sdk.arch.Widget;
import one.me.stories.edit.EditStoryScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class wr0 implements c3j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Widget b;

    public /* synthetic */ wr0(Widget widget, int i) {
        this.a = i;
        this.b = widget;
    }

    @Override // defpackage.c3j
    public final void e() {
        int i = this.a;
        Widget widget = this.b;
        switch (i) {
            case 0:
                BaseMediaViewerScreen baseMediaViewerScreen = (BaseMediaViewerScreen) widget;
                View view = baseMediaViewerScreen.getView();
                if (view != null) {
                    view.setKeepScreenOn(true);
                }
                if (baseMediaViewerScreen.w0().d() && baseMediaViewerScreen.J1()) {
                    t5a t5aVar = baseMediaViewerScreen.m;
                    if (t5aVar != null) {
                        t5aVar.d(3);
                    }
                    baseMediaViewerScreen.H1();
                    break;
                }
                break;
            default:
                EditStoryScreen editStoryScreen = (EditStoryScreen) widget;
                View view2 = editStoryScreen.getView();
                if (view2 != null) {
                    view2.setKeepScreenOn(true);
                }
                e3j e3jVarW1 = editStoryScreen.w1();
                if (e3jVarW1 != null && e3jVarW1.d() && editStoryScreen.E1()) {
                    editStoryScreen.H1(3);
                    EditStoryScreen.o1(editStoryScreen);
                    editStoryScreen.C1().T(3);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.c3j
    public final void f() {
        t5a t5aVar;
        int i = this.a;
        Widget widget = this.b;
        switch (i) {
            case 0:
                BaseMediaViewerScreen baseMediaViewerScreen = (BaseMediaViewerScreen) widget;
                if (baseMediaViewerScreen.J1() && (t5aVar = baseMediaViewerScreen.m) != null) {
                    t5aVar.d(4);
                    break;
                }
                break;
            default:
                EditStoryScreen editStoryScreen = (EditStoryScreen) widget;
                zv8[] zv8VarArr = EditStoryScreen.A1;
                if (editStoryScreen.E1()) {
                    editStoryScreen.H1(4);
                    editStoryScreen.C1().T(4);
                }
                break;
        }
    }

    @Override // defpackage.c3j
    public final void i() {
        t5a t5aVar;
        int i = this.a;
        Widget widget = this.b;
        switch (i) {
            case 0:
                BaseMediaViewerScreen baseMediaViewerScreen = (BaseMediaViewerScreen) widget;
                View view = baseMediaViewerScreen.getView();
                if (view != null) {
                    view.setKeepScreenOn(false);
                }
                if (baseMediaViewerScreen.J1() && (t5aVar = baseMediaViewerScreen.m) != null) {
                    t5aVar.d(2);
                    break;
                }
                break;
            default:
                EditStoryScreen editStoryScreen = (EditStoryScreen) widget;
                View view2 = editStoryScreen.getView();
                if (view2 != null) {
                    view2.setKeepScreenOn(false);
                }
                if (editStoryScreen.E1()) {
                    editStoryScreen.H1(2);
                    editStoryScreen.C1().T(2);
                }
                break;
        }
    }

    @Override // defpackage.c3j
    public final void j(rui ruiVar) {
        t5a t5aVar;
        int i = this.a;
        Widget widget = this.b;
        switch (i) {
            case 0:
                BaseMediaViewerScreen baseMediaViewerScreen = (BaseMediaViewerScreen) widget;
                if (baseMediaViewerScreen.J1() && (t5aVar = baseMediaViewerScreen.m) != null) {
                    t5aVar.d(4);
                    break;
                }
                break;
            default:
                EditStoryScreen editStoryScreen = (EditStoryScreen) widget;
                zv8[] zv8VarArr = EditStoryScreen.A1;
                if (editStoryScreen.E1()) {
                    editStoryScreen.H1(4);
                    editStoryScreen.C1().T(4);
                }
                break;
        }
    }

    @Override // defpackage.c3j
    public final void m() {
        t5a t5aVar;
        int i = this.a;
        Widget widget = this.b;
        switch (i) {
            case 0:
                BaseMediaViewerScreen baseMediaViewerScreen = (BaseMediaViewerScreen) widget;
                View view = baseMediaViewerScreen.getView();
                if (view != null) {
                    view.setKeepScreenOn(false);
                }
                if (baseMediaViewerScreen.J1() && (t5aVar = baseMediaViewerScreen.m) != null) {
                    t5aVar.d(2);
                    break;
                }
                break;
            default:
                EditStoryScreen editStoryScreen = (EditStoryScreen) widget;
                View view2 = editStoryScreen.getView();
                if (view2 != null) {
                    view2.setKeepScreenOn(false);
                }
                if (editStoryScreen.E1()) {
                    editStoryScreen.H1(2);
                    editStoryScreen.C1().T(2);
                }
                break;
        }
    }

    @Override // defpackage.c3j
    public final void o(Throwable th) {
        int i = this.a;
        Widget widget = this.b;
        switch (i) {
            case 0:
                BaseMediaViewerScreen baseMediaViewerScreen = (BaseMediaViewerScreen) widget;
                if (baseMediaViewerScreen.J1()) {
                    baseMediaViewerScreen.M1(true);
                    t5a t5aVar = baseMediaViewerScreen.m;
                    if (t5aVar != null) {
                        t5aVar.d(5);
                    }
                }
                break;
            default:
                EditStoryScreen editStoryScreen = (EditStoryScreen) widget;
                zv8[] zv8VarArr = EditStoryScreen.A1;
                if (editStoryScreen.E1()) {
                    editStoryScreen.G1(true);
                    editStoryScreen.H1(5);
                    editStoryScreen.C1().T(5);
                }
                break;
        }
    }

    @Override // defpackage.c3j
    public final void p() {
        t5a t5aVar;
        int i = this.a;
        Widget widget = this.b;
        switch (i) {
            case 0:
                BaseMediaViewerScreen baseMediaViewerScreen = (BaseMediaViewerScreen) widget;
                View view = baseMediaViewerScreen.getView();
                if (view != null) {
                    view.setKeepScreenOn(false);
                }
                if (baseMediaViewerScreen.J1() && (t5aVar = baseMediaViewerScreen.m) != null) {
                    t5aVar.d(2);
                    break;
                }
                break;
            default:
                EditStoryScreen editStoryScreen = (EditStoryScreen) widget;
                View view2 = editStoryScreen.getView();
                if (view2 != null) {
                    view2.setKeepScreenOn(false);
                }
                if (editStoryScreen.E1()) {
                    editStoryScreen.H1(2);
                    editStoryScreen.C1().T(2);
                }
                break;
        }
    }

    @Override // defpackage.c3j
    public final void q(boolean z) {
        int i = this.a;
        Widget widget = this.b;
        switch (i) {
            case 0:
                BaseMediaViewerScreen baseMediaViewerScreen = (BaseMediaViewerScreen) widget;
                if (baseMediaViewerScreen.J1()) {
                    t5a t5aVar = baseMediaViewerScreen.m;
                    if (t5aVar != null) {
                        t5aVar.d(z ? 3 : 2);
                    }
                    baseMediaViewerScreen.H1();
                }
                break;
            default:
                EditStoryScreen editStoryScreen = (EditStoryScreen) widget;
                zv8[] zv8VarArr = EditStoryScreen.A1;
                if (editStoryScreen.E1()) {
                    int i2 = z ? 3 : 2;
                    editStoryScreen.H1(i2);
                    EditStoryScreen.o1(editStoryScreen);
                    editStoryScreen.C1().T(i2);
                }
                break;
        }
    }
}
