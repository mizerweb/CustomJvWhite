package defpackage;

import android.graphics.Point;
import android.view.View;
import android.widget.TextView;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;
import one.me.mediaeditor.PhotoEditScreen;
import one.me.pinbars.PinBarsWidget;
import one.me.sdk.gallery.MediaGalleryWidget;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* JADX INFO: loaded from: classes2.dex */
public final class rq1 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rq1(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        mvh mvhVar;
        int i9 = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i9) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                TextView textView = (TextView) obj3;
                textView.setText(CallLinkInfoScreen.o1((CallLinkInfoScreen) obj2, ((lq1) obj).d.getText().b(textView.getContext()), textView, textView.getRootView().getWidth()));
                break;
            case 1:
                view.removeOnLayoutChangeListener(this);
                oi7 oi7Var = (oi7) obj3;
                int i10 = oi7Var.c;
                int i11 = oi7Var.d;
                float f = i11;
                View view2 = (View) obj2;
                int iK = gm0.K((view2.getWidth() / i10) - (f - (f / i10)));
                MediaGalleryWidget mediaGalleryWidget = (MediaGalleryWidget) obj;
                zv8[] zv8VarArr = MediaGalleryWidget.i;
                ph7 ph7Var = mediaGalleryWidget.r1().c;
                int width = (view2.getWidth() / i10) - (i11 - (i11 / i10));
                boolean z = ph7Var.i;
                boolean z2 = ph7Var.j;
                if (z && z2) {
                    iK = (iK * 2) + i11;
                }
                a8j.x(mediaGalleryWidget.q1().d, new ci7(width, iK));
                if (z2) {
                    a8j.x(mediaGalleryWidget.q1().d, new ei7(width + i11));
                }
                a8j.x(mediaGalleryWidget.q1().d, new di7(MediaGalleryWidget.o1(mediaGalleryWidget)));
                break;
            case 2:
                view.removeOnLayoutChangeListener(this);
                PhotoEditScreen photoEditScreen = (PhotoEditScreen) obj3;
                zv8[] zv8VarArr2 = PhotoEditScreen.s1;
                int[] iArr = (int[]) obj2;
                photoEditScreen.u1().getLocationOnScreen(iArr);
                int[] iArr2 = (int[]) obj;
                photoEditScreen.t1().getLocationOnScreen(iArr2);
                photoEditScreen.Z = iArr[0] - iArr2[0];
                photoEditScreen.n1 = iArr[1] - iArr2[1];
                break;
            default:
                view.removeOnLayoutChangeListener(this);
                int[] iArr3 = new int[2];
                View tooltipAnchor = ((nza) obj3).getTooltipAnchor();
                tooltipAnchor.getLocationOnScreen(iArr3);
                PinBarsWidget pinBarsWidget = (PinBarsWidget) obj2;
                Point point = new Point(zo5.D(18.0f, yl5.d().getDisplayMetrics().density, (wk8.D(pinBarsWidget.getContext()) - iArr3[0]) - (tooltipAnchor.getWidth() / 2)), tooltipAnchor.getHeight() + iArr3[1]);
                mvh mvhVar2 = pinBarsWidget.e;
                if (mvhVar2 != null && mvhVar2.isShowing() && (mvhVar = pinBarsWidget.e) != null) {
                    mvhVar.dismiss();
                }
                mvh mvhVar3 = new mvh(pinBarsWidget.getContext(), tooltipAnchor, new hta(14, pinBarsWidget), null, 1, 3, false, 136);
                mvhVar3.c((ynh) obj);
                mvhVar3.e(point, 8388661, CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS);
                mvhVar3.setOnDismissListener(new ica(1, pinBarsWidget));
                pinBarsWidget.e = mvhVar3;
                break;
        }
    }
}
