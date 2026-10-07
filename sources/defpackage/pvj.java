package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes.dex */
public final class pvj extends wq4 {
    public boolean a;
    public final /* synthetic */ Widget b;

    public pvj(Widget widget) {
        this.b = widget;
    }

    @Override // defpackage.wq4
    public final void d(br4 br4Var) {
        Widget widget = this.b;
        View viewRequireView = widget.requireView();
        widget.onViewCreated(viewRequireView);
        lvb.H(viewRequireView, widget.getA(), new hvj(widget, 1));
    }

    @Override // defpackage.wq4
    public final void j(br4 br4Var, View view) {
        boolean zA = kr4.a(br4Var);
        Widget widget = this.b;
        if (!zA) {
            widget.onViewCreated(view);
            lvb.H(view, widget.getA(), new hvj(widget, 1));
        }
        view.addOnAttachStateChangeListener(new zk9(widget, this, 2));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x005b A[LOOP:0: B:12:0x001d->B:22:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x005e A[EDGE_INSN: B:26:0x005e->B:23:0x005e BREAK  A[LOOP:0: B:12:0x001d->B:22:0x005b], SYNTHETIC] */
    @Override // defpackage.wq4
    public final void k(br4 br4Var) {
        fwj fwjVar;
        Widget widget = br4Var instanceof Widget ? (Widget) br4Var : null;
        if (widget == null || (fwjVar = widget.viewModelStore) == null) {
            return;
        }
        b9b b9bVar = fwjVar.a;
        Object[] objArr = b9bVar.c;
        long[] jArr = b9bVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            a8j a8jVar = (a8j) objArr[(i << 3) + i3];
                            vd7.d(a8jVar.b.a);
                            a8jVar.y();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        b9bVar.g();
        fwjVar.b.g();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x005a A[LOOP:0: B:5:0x0013->B:15:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x005d A[EDGE_INSN: B:21:0x005d->B:16:0x005d BREAK  A[LOOP:0: B:5:0x0013->B:15:0x005a], SYNTHETIC] */
    @Override // defpackage.wq4
    public final void l(br4 br4Var) {
        Widget widget = this.b;
        b9b b9bVar = widget.cleanActions;
        Object[] objArr = b9bVar.c;
        long[] jArr = b9bVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            nw0 nw0Var = (nw0) ((yr3) objArr[(i << 3) + i3]);
                            ow0 ow0Var = nw0Var.b;
                            ow0Var.e = new WeakReference(ow0Var.d);
                            ow0Var.d = null;
                            nw0Var.a = true;
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        if (this.a) {
            widget.finalizeCleanActions(br4Var);
        }
    }

    @Override // defpackage.wq4
    public final void n(br4 br4Var, View view) {
        view.addOnAttachStateChangeListener(new po3(2, this.b));
    }
}
